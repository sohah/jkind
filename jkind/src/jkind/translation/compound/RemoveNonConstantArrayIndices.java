package jkind.translation.compound;

import java.util.ArrayList;
import java.util.List;

import jkind.analysis.ConstantAnalyzer;
import jkind.analysis.TypeChecker;
import jkind.analysis.evaluation.ConstantEvaluator;
import jkind.lustre.ArrayAccessExpr;
import jkind.lustre.ArrayExpr;
import jkind.lustre.ArrayType;
import jkind.lustre.ArrayUpdateExpr;
import jkind.lustre.BinaryExpr;
import jkind.lustre.BinaryOp;
import jkind.lustre.Expr;
import jkind.lustre.IfThenElseExpr;
import jkind.lustre.IntExpr;
import jkind.lustre.Node;
import jkind.lustre.Type;
import jkind.lustre.values.IntegerValue;
import jkind.lustre.visitors.ExprMapVisitor;
import jkind.translation.DefaultValueVisitor;

/**
 * Replace all non-constant array indices using if-then-else expressions. Remove
 * all array updates entirely.
 * 
 * Assumption: All node calls have been inlined.
 * 
 * Assumption: All user types have been inlined.
 */
public class RemoveNonConstantArrayIndices extends ExprMapVisitor {
	public static Node node(Node node) {
		return new RemoveNonConstantArrayIndices().visitNode(node);
	}

	private final TypeChecker typeChecker = new TypeChecker();

	@Override
	public Node visitNode(Node node) {
		typeChecker.repopulateVariableTable(node);
		return super.visitNode(node);
	}

	private boolean isConstant(Expr e) {
		return e.accept(new ConstantAnalyzer());
	}

	private IntExpr evalIndex(Expr e) {
		IntegerValue value = (IntegerValue) e.accept(new ConstantEvaluator());
		return new IntExpr(value.value);
	}

	private ArrayType getArrayType(Expr e) {
		return (ArrayType) e.accept(typeChecker);
	}

	@Override
	public Expr visit(ArrayAccessExpr e) {
		Expr array = e.array.accept(this);
		Expr index = e.index.accept(this);
		if (isConstant(index)) {
			return new ArrayAccessExpr(array, evalIndex(index));
		} else {
			return expandArrayAccess(array, index);
		}
	}

	private Expr expandArrayAccess(Expr array, Expr index) {
		ArrayType arrayType = getArrayType(array);
		Expr result = getDefaultValue(arrayType.base);
		for (int i = arrayType.size - 1; i >= 0; i--) {
			Expr cond = new BinaryExpr(index, BinaryOp.EQUAL, new IntExpr(i));
			Expr thenExpr = new ArrayAccessExpr(array, i);
			result = new IfThenElseExpr(cond, thenExpr, result);
		}
		return result;
	}

	private Expr getDefaultValue(Type type) {
		return type.accept(new DefaultValueVisitor());
	}

	@Override
	public Expr visit(ArrayUpdateExpr e) {
		Expr array = e.array.accept(this);
		Expr index = e.index.accept(this);
		Expr value = e.value.accept(this);
		if (isConstant(index)) {
			return expandConstantArrayUpdate(array, evalIndex(index), value);
		} else {
			return expandNonConstantArrayUpdate(array, index, value);
		}
	}

	private Expr expandConstantArrayUpdate(Expr array, IntExpr indexExpr, Expr value) {
		ArrayType arrayType = getArrayType(array);
		int index = indexExpr.value.intValue();
		List<Expr> elements = new ArrayList<>();

		for (int i = 0; i < arrayType.size; i++) {
			if (i == index) {
				elements.add(value);
			} else {
				elements.add(new ArrayAccessExpr(array, i));
			}
		}

		return new ArrayExpr(elements);
	}
	
	private Expr expandNonConstantArrayUpdate(Expr array, Expr index, Expr value) {
		ArrayType arrayType = getArrayType(array);
		List<Expr> elements = new ArrayList<>();
		for (int i = 0; i < arrayType.size; i++) {
			Expr cond = new BinaryExpr(index, BinaryOp.EQUAL, new IntExpr(i));
			Expr elseExpr = new ArrayAccessExpr(array, i);
			elements.add(new IfThenElseExpr(cond, value, elseExpr));
		}
		return new ArrayExpr(elements);
	}
}
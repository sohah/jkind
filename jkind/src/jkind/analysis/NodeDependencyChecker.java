package jkind.analysis;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import jkind.Output;
import jkind.lustre.CallExpr;
import jkind.lustre.Equation;
import jkind.lustre.Expr;
import jkind.lustre.Node;
import jkind.lustre.Program;
import jkind.lustre.visitors.ExprIterVisitor;

public class NodeDependencyChecker {
	public static boolean check(Program program) {
		Map<String, Set<String>> dependencies = new HashMap<>();
		for (Node node : program.nodes) {
			dependencies.put(node.id, getNodeDependencies(node));
		}

		return new NodeDependencyChecker(dependencies).check();
	}

	private static Set<String> getNodeDependencies(Node node) {
		final Set<String> dependencies = new HashSet<>();
		ExprIterVisitor nodeCallCollector = new ExprIterVisitor() {
			@Override
			public Void visit(CallExpr e) {
				dependencies.add(e.name);
				super.visit(e);
				return null;
			}
		};

		for (Equation eq : node.equations) {
			eq.expr.accept(nodeCallCollector);
		}
		for (Expr e : node.assertions) {
			e.accept(nodeCallCollector);
		}
		return dependencies;
	}

	private Map<String, Set<String>> dependencies;
	private Deque<String> callStack;

	private NodeDependencyChecker(Map<String, Set<String>> dependencies) {
		this.dependencies = dependencies;
		this.callStack = new ArrayDeque<>();
	}

	private boolean check() {
		for (String root : dependencies.keySet()) {
			if (!check(root)) {
				return false;
			}
		}

		return true;
	}

	private boolean check(String curr) {
		if (callStack.contains(curr)) {
			callStack.addLast(curr);
			while (!curr.equals(callStack.peekFirst())) {
				callStack.removeFirst();
			}
			Output.error("recursive node calls: " + callStack);
			return false;
		}

		callStack.addLast(curr);
		if (dependencies.containsKey(curr)) {
			for (String next : dependencies.get(curr)) {
				if (!check(next)) {
					return false;
				}
			}
		}
		callStack.removeLast();

		return true;
	}
}

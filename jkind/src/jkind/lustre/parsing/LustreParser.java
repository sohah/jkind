// Generated from Lustre.g4 by ANTLR 4.0
package jkind.lustre.parsing;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LustreParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__44=1, T__43=2, T__42=3, T__41=4, T__40=5, T__39=6, T__38=7, T__37=8, 
		T__36=9, T__35=10, T__34=11, T__33=12, T__32=13, T__31=14, T__30=15, T__29=16, 
		T__28=17, T__27=18, T__26=19, T__25=20, T__24=21, T__23=22, T__22=23, 
		T__21=24, T__20=25, T__19=26, T__18=27, T__17=28, T__16=29, T__15=30, 
		T__14=31, T__13=32, T__12=33, T__11=34, T__10=35, T__9=36, T__8=37, T__7=38, 
		T__6=39, T__5=40, T__4=41, T__3=42, T__2=43, T__1=44, T__0=45, REAL=46, 
		BOOL=47, INT=48, ID=49, WS=50, SL_COMMENT=51, ML_COMMENT=52, MAIN=53, 
		ERROR=54;
	public static final String[] tokenNames = {
		"<INVALID>", "']'", "'subrange'", "'of'", "','", "'-'", "'['", "'node'", 
		"'*'", "'or'", "':'", "'('", "'not'", "'if'", "'int'", "'<'", "'var'", 
		"'<='", "'{'", "'and'", "'let'", "'tel'", "'else'", "'}'", "'->'", "'xor'", 
		"'bool'", "')'", "'.'", "'pre'", "'=>'", "'+'", "'<>'", "'--%PROPERTY'", 
		"'='", "';'", "'div'", "'const'", "'>'", "'type'", "'then'", "'returns'", 
		"'/'", "'>='", "'assert'", "'real'", "REAL", "BOOL", "INT", "ID", "WS", 
		"SL_COMMENT", "ML_COMMENT", "MAIN", "ERROR"
	};
	public static final int
		RULE_program = 0, RULE_typedef = 1, RULE_constant = 2, RULE_node = 3, 
		RULE_varDeclList = 4, RULE_varDeclGroup = 5, RULE_type = 6, RULE_bound = 7, 
		RULE_property = 8, RULE_assertion = 9, RULE_equation = 10, RULE_lhs = 11, 
		RULE_expr = 12;
	public static final String[] ruleNames = {
		"program", "typedef", "constant", "node", "varDeclList", "varDeclGroup", 
		"type", "bound", "property", "assertion", "equation", "lhs", "expr"
	};

	@Override
	public String getGrammarFileName() { return "Lustre.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public LustreParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public NodeContext node(int i) {
			return getRuleContext(NodeContext.class,i);
		}
		public ConstantContext constant(int i) {
			return getRuleContext(ConstantContext.class,i);
		}
		public List<NodeContext> node() {
			return getRuleContexts(NodeContext.class);
		}
		public List<ConstantContext> constant() {
			return getRuleContexts(ConstantContext.class);
		}
		public TerminalNode EOF() { return getToken(LustreParser.EOF, 0); }
		public TypedefContext typedef(int i) {
			return getRuleContext(TypedefContext.class,i);
		}
		public List<TypedefContext> typedef() {
			return getRuleContexts(TypedefContext.class);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LustreVisitor ) return ((LustreVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 7) | (1L << 37) | (1L << 39))) != 0)) {
				{
				setState(29);
				switch (_input.LA(1)) {
				case 39:
					{
					setState(26); typedef();
					}
					break;
				case 37:
					{
					setState(27); constant();
					}
					break;
				case 7:
					{
					setState(28); node();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(33);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(34); match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypedefContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(LustreParser.ID, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TypedefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typedef; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LustreVisitor ) return ((LustreVisitor<? extends T>)visitor).visitTypedef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypedefContext typedef() throws RecognitionException {
		TypedefContext _localctx = new TypedefContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_typedef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36); match(39);
			setState(37); match(ID);
			setState(38); match(34);
			setState(39); type();
			setState(40); match(35);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(LustreParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LustreVisitor ) return ((LustreVisitor<? extends T>)visitor).visitConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_constant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42); match(37);
			setState(43); match(ID);
			setState(46);
			_la = _input.LA(1);
			if (_la==10) {
				{
				setState(44); match(10);
				setState(45); type();
				}
			}

			setState(48); match(34);
			setState(49); expr(0);
			setState(50); match(35);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NodeContext extends ParserRuleContext {
		public VarDeclListContext input;
		public VarDeclListContext output;
		public VarDeclListContext local;
		public PropertyContext property(int i) {
			return getRuleContext(PropertyContext.class,i);
		}
		public List<EquationContext> equation() {
			return getRuleContexts(EquationContext.class);
		}
		public List<VarDeclListContext> varDeclList() {
			return getRuleContexts(VarDeclListContext.class);
		}
		public VarDeclListContext varDeclList(int i) {
			return getRuleContext(VarDeclListContext.class,i);
		}
		public TerminalNode ID() { return getToken(LustreParser.ID, 0); }
		public AssertionContext assertion(int i) {
			return getRuleContext(AssertionContext.class,i);
		}
		public EquationContext equation(int i) {
			return getRuleContext(EquationContext.class,i);
		}
		public List<PropertyContext> property() {
			return getRuleContexts(PropertyContext.class);
		}
		public List<AssertionContext> assertion() {
			return getRuleContexts(AssertionContext.class);
		}
		public NodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_node; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LustreVisitor ) return ((LustreVisitor<? extends T>)visitor).visitNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NodeContext node() throws RecognitionException {
		NodeContext _localctx = new NodeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_node);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52); match(7);
			setState(53); match(ID);
			setState(54); match(11);
			setState(56);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(55); ((NodeContext)_localctx).input = varDeclList();
				}
			}

			setState(58); match(27);
			setState(59); match(41);
			setState(60); match(11);
			setState(62);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(61); ((NodeContext)_localctx).output = varDeclList();
				}
			}

			setState(64); match(27);
			setState(65); match(35);
			setState(70);
			_la = _input.LA(1);
			if (_la==16) {
				{
				setState(66); match(16);
				setState(67); ((NodeContext)_localctx).local = varDeclList();
				setState(68); match(35);
				}
			}

			setState(72); match(20);
			setState(78);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 11) | (1L << 33) | (1L << 44) | (1L << ID))) != 0)) {
				{
				setState(76);
				switch (_input.LA(1)) {
				case 11:
				case ID:
					{
					setState(73); equation();
					}
					break;
				case 33:
					{
					setState(74); property();
					}
					break;
				case 44:
					{
					setState(75); assertion();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(80);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(81); match(21);
			setState(83);
			_la = _input.LA(1);
			if (_la==35) {
				{
				setState(82); match(35);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarDeclListContext extends ParserRuleContext {
		public VarDeclGroupContext varDeclGroup(int i) {
			return getRuleContext(VarDeclGroupContext.class,i);
		}
		public List<VarDeclGroupContext> varDeclGroup() {
			return getRuleContexts(VarDeclGroupContext.class);
		}
		public VarDeclListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDeclList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LustreVisitor ) return ((LustreVisitor<? extends T>)visitor).visitVarDeclList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDeclListContext varDeclList() throws RecognitionException {
		VarDeclListContext _localctx = new VarDeclListContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_varDeclList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(85); varDeclGroup();
			setState(90);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(86); match(35);
					setState(87); varDeclGroup();
					}
					} 
				}
				setState(92);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarDeclGroupContext extends ParserRuleContext {
		public TerminalNode ID(int i) {
			return getToken(LustreParser.ID, i);
		}
		public List<TerminalNode> ID() { return getTokens(LustreParser.ID); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public VarDeclGroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDeclGroup; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LustreVisitor ) return ((LustreVisitor<? extends T>)visitor).visitVarDeclGroup(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDeclGroupContext varDeclGroup() throws RecognitionException {
		VarDeclGroupContext _localctx = new VarDeclGroupContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_varDeclGroup);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93); match(ID);
			setState(98);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==4) {
				{
				{
				setState(94); match(4);
				setState(95); match(ID);
				}
				}
				setState(100);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(101); match(10);
			setState(102); type();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	 
		public TypeContext() { }
		public void copyFrom(TypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SubrangeTypeContext extends TypeContext {
		public BoundContext bound(int i) {
			return getRuleContext(BoundContext.class,i);
		}
		public List<BoundContext> bound() {
			return getRuleContexts(BoundContext.class);
		}
		public SubrangeTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LustreVisitor ) return ((LustreVisitor<? extends T>)visitor).visitSubrangeType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolTypeContext extends TypeContext {
		public BoolTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LustreVisitor ) return ((LustreVisitor<? extends T>)visitor).visitBoolType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntTypeContext extends TypeContext {
		public IntTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LustreVisitor ) return ((LustreVisitor<? extends T>)visitor).visitIntType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RealTypeContext extends TypeContext {
		public RealTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LustreVisitor ) return ((LustreVisitor<? extends T>)visitor).visitRealType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RecordTypeContext extends TypeContext {
		public TerminalNode ID(int i) {
			return getToken(LustreParser.ID, i);
		}
		public List<TerminalNode> ID() { return getTokens(LustreParser.ID); }
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public RecordTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LustreVisitor ) return ((LustreVisitor<? extends T>)visitor).visitRecordType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UserTypeContext extends TypeContext {
		public TerminalNode ID() { return getToken(LustreParser.ID, 0); }
		public UserTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LustreVisitor ) return ((LustreVisitor<? extends T>)visitor).visitUserType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_type);
		int _la;
		try {
			setState(133);
			switch (_input.LA(1)) {
			case 14:
				_localctx = new IntTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(104); match(14);
				}
				break;
			case 2:
				_localctx = new SubrangeTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(105); match(2);
				setState(106); match(6);
				setState(107); bound();
				setState(108); match(4);
				setState(109); bound();
				setState(110); match(1);
				setState(111); match(3);
				setState(112); match(14);
				}
				break;
			case 26:
				_localctx = new BoolTypeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(114); match(26);
				}
				break;
			case 45:
				_localctx = new RealTypeContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(115); match(45);
				}
				break;
			case ID:
				_localctx = new UserTypeContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(116); match(ID);
				}
				break;
			case 18:
				_localctx = new RecordTypeContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(117); match(18);
				{
				setState(118); match(ID);
				setState(119); match(10);
				setState(120); type();
				}
				setState(128);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==35) {
					{
					{
					setState(122); match(35);
					setState(123); match(ID);
					setState(124); match(10);
					setState(125); type();
					}
					}
					setState(130);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(131); match(23);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BoundContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(LustreParser.INT, 0); }
		public BoundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bound; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LustreVisitor ) return ((LustreVisitor<? extends T>)visitor).visitBound(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoundContext bound() throws RecognitionException {
		BoundContext _localctx = new BoundContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_bound);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			_la = _input.LA(1);
			if (_la==5) {
				{
				setState(135); match(5);
				}
			}

			setState(138); match(INT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PropertyContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(LustreParser.ID, 0); }
		public PropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_property; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LustreVisitor ) return ((LustreVisitor<? extends T>)visitor).visitProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyContext property() throws RecognitionException {
		PropertyContext _localctx = new PropertyContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_property);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140); match(33);
			setState(141); match(ID);
			setState(142); match(35);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssertionContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssertionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assertion; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LustreVisitor ) return ((LustreVisitor<? extends T>)visitor).visitAssertion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssertionContext assertion() throws RecognitionException {
		AssertionContext _localctx = new AssertionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_assertion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144); match(44);
			setState(145); expr(0);
			setState(146); match(35);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EquationContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public LhsContext lhs() {
			return getRuleContext(LhsContext.class,0);
		}
		public EquationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equation; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LustreVisitor ) return ((LustreVisitor<? extends T>)visitor).visitEquation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EquationContext equation() throws RecognitionException {
		EquationContext _localctx = new EquationContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_equation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(148); lhs();
				}
				break;
			case 11:
				{
				setState(149); match(11);
				setState(150); lhs();
				setState(151); match(27);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(155); match(34);
			setState(156); expr(0);
			setState(157); match(35);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LhsContext extends ParserRuleContext {
		public TerminalNode ID(int i) {
			return getToken(LustreParser.ID, i);
		}
		public List<TerminalNode> ID() { return getTokens(LustreParser.ID); }
		public LhsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lhs; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LustreVisitor ) return ((LustreVisitor<? extends T>)visitor).visitLhs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LhsContext lhs() throws RecognitionException {
		LhsContext _localctx = new LhsContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_lhs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159); match(ID);
			setState(164);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==4) {
				{
				{
				setState(160); match(4);
				setState(161); match(ID);
				}
				}
				setState(166);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public int _p;
		public ExprContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ExprContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
			this._p = ctx._p;
		}
	}
	public static class IntExprContext extends ExprContext {
		public TerminalNode INT() { return getToken(LustreParser.INT, 0); }
		public IntExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LustreVisitor ) return ((LustreVisitor<? extends T>)visitor).visitIntExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NodeCallExprContext extends ExprContext {
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode ID() { return getToken(LustreParser.ID, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public NodeCallExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LustreVisitor ) return ((LustreVisitor<? extends T>)visitor).visitNodeCallExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ProjectionExprContext extends ExprContext {
		public TerminalNode ID() { return getToken(LustreParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ProjectionExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LustreVisitor ) return ((LustreVisitor<? extends T>)visitor).visitProjectionExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdExprContext extends ExprContext {
		public TerminalNode ID() { return getToken(LustreParser.ID, 0); }
		public IdExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LustreVisitor ) return ((LustreVisitor<? extends T>)visitor).visitIdExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfThenElseExprContext extends ExprContext {
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public IfThenElseExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LustreVisitor ) return ((LustreVisitor<? extends T>)visitor).visitIfThenElseExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RecordExprContext extends ExprContext {
		public TerminalNode ID(int i) {
			return getToken(LustreParser.ID, i);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> ID() { return getTokens(LustreParser.ID); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public RecordExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LustreVisitor ) return ((LustreVisitor<? extends T>)visitor).visitRecordExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PreExprContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PreExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LustreVisitor ) return ((LustreVisitor<? extends T>)visitor).visitPreExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NegateExprContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public NegateExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LustreVisitor ) return ((LustreVisitor<? extends T>)visitor).visitNegateExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolExprContext extends ExprContext {
		public TerminalNode BOOL() { return getToken(LustreParser.BOOL, 0); }
		public BoolExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LustreVisitor ) return ((LustreVisitor<? extends T>)visitor).visitBoolExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenExprContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ParenExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LustreVisitor ) return ((LustreVisitor<? extends T>)visitor).visitParenExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BinaryExprContext extends ExprContext {
		public Token op;
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public BinaryExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LustreVisitor ) return ((LustreVisitor<? extends T>)visitor).visitBinaryExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RealExprContext extends ExprContext {
		public TerminalNode REAL() { return getToken(LustreParser.REAL, 0); }
		public RealExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LustreVisitor ) return ((LustreVisitor<? extends T>)visitor).visitRealExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NotExprContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public NotExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LustreVisitor ) return ((LustreVisitor<? extends T>)visitor).visitNotExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState, _p);
		ExprContext _prevctx = _localctx;
		int _startState = 24;
		enterRecursionRule(_localctx, RULE_expr);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				_localctx = new PreExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(168); match(29);
				setState(169); expr(13);
				}
				break;

			case 2:
				{
				_localctx = new NotExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(170); match(12);
				setState(171); expr(12);
				}
				break;

			case 3:
				{
				_localctx = new NegateExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(172); match(5);
				setState(173); expr(11);
				}
				break;

			case 4:
				{
				_localctx = new IdExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(174); match(ID);
				}
				break;

			case 5:
				{
				_localctx = new IntExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(175); match(INT);
				}
				break;

			case 6:
				{
				_localctx = new RealExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(176); match(REAL);
				}
				break;

			case 7:
				{
				_localctx = new BoolExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(177); match(BOOL);
				}
				break;

			case 8:
				{
				_localctx = new NodeCallExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(178); match(ID);
				setState(179); match(11);
				setState(188);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 5) | (1L << 11) | (1L << 12) | (1L << 13) | (1L << 18) | (1L << 29) | (1L << REAL) | (1L << BOOL) | (1L << INT) | (1L << ID))) != 0)) {
					{
					setState(180); expr(0);
					setState(185);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==4) {
						{
						{
						setState(181); match(4);
						setState(182); expr(0);
						}
						}
						setState(187);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(190); match(27);
				}
				break;

			case 9:
				{
				_localctx = new IfThenElseExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(191); match(13);
				setState(192); expr(0);
				setState(193); match(40);
				setState(194); expr(0);
				setState(195); match(22);
				setState(196); expr(0);
				}
				break;

			case 10:
				{
				_localctx = new RecordExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(198); match(18);
				setState(199); match(ID);
				setState(200); match(34);
				setState(201); expr(0);
				setState(208);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==35) {
					{
					{
					setState(202); match(35);
					setState(203); match(ID);
					setState(204); match(34);
					setState(205); expr(0);
					}
					}
					setState(210);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(211); match(23);
				}
				break;

			case 11:
				{
				_localctx = new ParenExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(213); match(11);
				setState(214); expr(0);
				setState(215); match(27);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(245);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(243);
					switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
					case 1:
						{
						_localctx = new BinaryExprContext(new ExprContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(219);
						if (!(10 >= _localctx._p)) throw new FailedPredicateException(this, "10 >= $_p");
						setState(220);
						((BinaryExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 8) | (1L << 36) | (1L << 42))) != 0)) ) {
							((BinaryExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(221); expr(11);
						}
						break;

					case 2:
						{
						_localctx = new BinaryExprContext(new ExprContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(222);
						if (!(9 >= _localctx._p)) throw new FailedPredicateException(this, "9 >= $_p");
						setState(223);
						((BinaryExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==5 || _la==31) ) {
							((BinaryExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(224); expr(10);
						}
						break;

					case 3:
						{
						_localctx = new BinaryExprContext(new ExprContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(225);
						if (!(8 >= _localctx._p)) throw new FailedPredicateException(this, "8 >= $_p");
						setState(226);
						((BinaryExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 15) | (1L << 17) | (1L << 32) | (1L << 34) | (1L << 38) | (1L << 43))) != 0)) ) {
							((BinaryExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(227); expr(9);
						}
						break;

					case 4:
						{
						_localctx = new BinaryExprContext(new ExprContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(228);
						if (!(7 >= _localctx._p)) throw new FailedPredicateException(this, "7 >= $_p");
						setState(229); ((BinaryExprContext)_localctx).op = match(19);
						setState(230); expr(8);
						}
						break;

					case 5:
						{
						_localctx = new BinaryExprContext(new ExprContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(231);
						if (!(6 >= _localctx._p)) throw new FailedPredicateException(this, "6 >= $_p");
						setState(232);
						((BinaryExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==9 || _la==25) ) {
							((BinaryExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(233); expr(7);
						}
						break;

					case 6:
						{
						_localctx = new BinaryExprContext(new ExprContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(234);
						if (!(5 >= _localctx._p)) throw new FailedPredicateException(this, "5 >= $_p");
						setState(235); ((BinaryExprContext)_localctx).op = match(30);
						setState(236); expr(5);
						}
						break;

					case 7:
						{
						_localctx = new BinaryExprContext(new ExprContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(237);
						if (!(4 >= _localctx._p)) throw new FailedPredicateException(this, "4 >= $_p");
						setState(238); ((BinaryExprContext)_localctx).op = match(24);
						setState(239); expr(4);
						}
						break;

					case 8:
						{
						_localctx = new ProjectionExprContext(new ExprContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(240);
						if (!(14 >= _localctx._p)) throw new FailedPredicateException(this, "14 >= $_p");
						setState(241); match(28);
						setState(242); match(ID);
						}
						break;
					}
					} 
				}
				setState(247);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 12: return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return 10 >= _localctx._p;

		case 1: return 9 >= _localctx._p;

		case 2: return 8 >= _localctx._p;

		case 3: return 7 >= _localctx._p;

		case 4: return 6 >= _localctx._p;

		case 5: return 5 >= _localctx._p;

		case 6: return 4 >= _localctx._p;

		case 7: return 14 >= _localctx._p;
		}
		return true;
	}

	public static final String _serializedATN =
		"\2\38\u00fb\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4"+
		"\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\2\7\2 \n"+
		"\2\f\2\16\2#\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\5\4"+
		"\61\n\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\5\5;\n\5\3\5\3\5\3\5\3\5\5\5A"+
		"\n\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5I\n\5\3\5\3\5\3\5\3\5\7\5O\n\5\f\5\16"+
		"\5R\13\5\3\5\3\5\5\5V\n\5\3\6\3\6\3\6\7\6[\n\6\f\6\16\6^\13\6\3\7\3\7"+
		"\3\7\7\7c\n\7\f\7\16\7f\13\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u0081\n"+
		"\b\f\b\16\b\u0084\13\b\3\b\3\b\5\b\u0088\n\b\3\t\5\t\u008b\n\t\3\t\3\t"+
		"\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\5\f\u009c\n\f"+
		"\3\f\3\f\3\f\3\f\3\r\3\r\3\r\7\r\u00a5\n\r\f\r\16\r\u00a8\13\r\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\7\16\u00ba\n\16\f\16\16\16\u00bd\13\16\5\16\u00bf\n\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\7"+
		"\16\u00d1\n\16\f\16\16\16\u00d4\13\16\3\16\3\16\3\16\3\16\3\16\3\16\5"+
		"\16\u00dc\n\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\7\16"+
		"\u00f6\n\16\f\16\16\16\u00f9\13\16\3\16\2\17\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\2\6\5\n\n&&,,\4\7\7!!\b\21\21\23\23\"\"$$((--\4\13\13\33\33\u0118"+
		"\2!\3\2\2\2\4&\3\2\2\2\6,\3\2\2\2\b\66\3\2\2\2\nW\3\2\2\2\f_\3\2\2\2\16"+
		"\u0087\3\2\2\2\20\u008a\3\2\2\2\22\u008e\3\2\2\2\24\u0092\3\2\2\2\26\u009b"+
		"\3\2\2\2\30\u00a1\3\2\2\2\32\u00db\3\2\2\2\34 \5\4\3\2\35 \5\6\4\2\36"+
		" \5\b\5\2\37\34\3\2\2\2\37\35\3\2\2\2\37\36\3\2\2\2 #\3\2\2\2!\37\3\2"+
		"\2\2!\"\3\2\2\2\"$\3\2\2\2#!\3\2\2\2$%\7\1\2\2%\3\3\2\2\2&\'\7)\2\2\'"+
		"(\7\63\2\2()\7$\2\2)*\5\16\b\2*+\7%\2\2+\5\3\2\2\2,-\7\'\2\2-\60\7\63"+
		"\2\2./\7\f\2\2/\61\5\16\b\2\60.\3\2\2\2\60\61\3\2\2\2\61\62\3\2\2\2\62"+
		"\63\7$\2\2\63\64\5\32\16\2\64\65\7%\2\2\65\7\3\2\2\2\66\67\7\t\2\2\67"+
		"8\7\63\2\28:\7\r\2\29;\5\n\6\2:9\3\2\2\2:;\3\2\2\2;<\3\2\2\2<=\7\35\2"+
		"\2=>\7+\2\2>@\7\r\2\2?A\5\n\6\2@?\3\2\2\2@A\3\2\2\2AB\3\2\2\2BC\7\35\2"+
		"\2CH\7%\2\2DE\7\22\2\2EF\5\n\6\2FG\7%\2\2GI\3\2\2\2HD\3\2\2\2HI\3\2\2"+
		"\2IJ\3\2\2\2JP\7\26\2\2KO\5\26\f\2LO\5\22\n\2MO\5\24\13\2NK\3\2\2\2NL"+
		"\3\2\2\2NM\3\2\2\2OR\3\2\2\2PN\3\2\2\2PQ\3\2\2\2QS\3\2\2\2RP\3\2\2\2S"+
		"U\7\27\2\2TV\7%\2\2UT\3\2\2\2UV\3\2\2\2V\t\3\2\2\2W\\\5\f\7\2XY\7%\2\2"+
		"Y[\5\f\7\2ZX\3\2\2\2[^\3\2\2\2\\Z\3\2\2\2\\]\3\2\2\2]\13\3\2\2\2^\\\3"+
		"\2\2\2_d\7\63\2\2`a\7\6\2\2ac\7\63\2\2b`\3\2\2\2cf\3\2\2\2db\3\2\2\2d"+
		"e\3\2\2\2eg\3\2\2\2fd\3\2\2\2gh\7\f\2\2hi\5\16\b\2i\r\3\2\2\2j\u0088\7"+
		"\20\2\2kl\7\4\2\2lm\7\b\2\2mn\5\20\t\2no\7\6\2\2op\5\20\t\2pq\7\3\2\2"+
		"qr\7\5\2\2rs\7\20\2\2s\u0088\3\2\2\2t\u0088\7\34\2\2u\u0088\7/\2\2v\u0088"+
		"\7\63\2\2wx\7\24\2\2xy\7\63\2\2yz\7\f\2\2z{\5\16\b\2{\u0082\3\2\2\2|}"+
		"\7%\2\2}~\7\63\2\2~\177\7\f\2\2\177\u0081\5\16\b\2\u0080|\3\2\2\2\u0081"+
		"\u0084\3\2\2\2\u0082\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0085\3\2"+
		"\2\2\u0084\u0082\3\2\2\2\u0085\u0086\7\31\2\2\u0086\u0088\3\2\2\2\u0087"+
		"j\3\2\2\2\u0087k\3\2\2\2\u0087t\3\2\2\2\u0087u\3\2\2\2\u0087v\3\2\2\2"+
		"\u0087w\3\2\2\2\u0088\17\3\2\2\2\u0089\u008b\7\7\2\2\u008a\u0089\3\2\2"+
		"\2\u008a\u008b\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008d\7\62\2\2\u008d"+
		"\21\3\2\2\2\u008e\u008f\7#\2\2\u008f\u0090\7\63\2\2\u0090\u0091\7%\2\2"+
		"\u0091\23\3\2\2\2\u0092\u0093\7.\2\2\u0093\u0094\5\32\16\2\u0094\u0095"+
		"\7%\2\2\u0095\25\3\2\2\2\u0096\u009c\5\30\r\2\u0097\u0098\7\r\2\2\u0098"+
		"\u0099\5\30\r\2\u0099\u009a\7\35\2\2\u009a\u009c\3\2\2\2\u009b\u0096\3"+
		"\2\2\2\u009b\u0097\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009e\7$\2\2\u009e"+
		"\u009f\5\32\16\2\u009f\u00a0\7%\2\2\u00a0\27\3\2\2\2\u00a1\u00a6\7\63"+
		"\2\2\u00a2\u00a3\7\6\2\2\u00a3\u00a5\7\63\2\2\u00a4\u00a2\3\2\2\2\u00a5"+
		"\u00a8\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\31\3\2\2"+
		"\2\u00a8\u00a6\3\2\2\2\u00a9\u00aa\b\16\1\2\u00aa\u00ab\7\37\2\2\u00ab"+
		"\u00dc\5\32\16\2\u00ac\u00ad\7\16\2\2\u00ad\u00dc\5\32\16\2\u00ae\u00af"+
		"\7\7\2\2\u00af\u00dc\5\32\16\2\u00b0\u00dc\7\63\2\2\u00b1\u00dc\7\62\2"+
		"\2\u00b2\u00dc\7\60\2\2\u00b3\u00dc\7\61\2\2\u00b4\u00b5\7\63\2\2\u00b5"+
		"\u00be\7\r\2\2\u00b6\u00bb\5\32\16\2\u00b7\u00b8\7\6\2\2\u00b8\u00ba\5"+
		"\32\16\2\u00b9\u00b7\3\2\2\2\u00ba\u00bd\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bb"+
		"\u00bc\3\2\2\2\u00bc\u00bf\3\2\2\2\u00bd\u00bb\3\2\2\2\u00be\u00b6\3\2"+
		"\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00dc\7\35\2\2\u00c1"+
		"\u00c2\7\17\2\2\u00c2\u00c3\5\32\16\2\u00c3\u00c4\7*\2\2\u00c4\u00c5\5"+
		"\32\16\2\u00c5\u00c6\7\30\2\2\u00c6\u00c7\5\32\16\2\u00c7\u00dc\3\2\2"+
		"\2\u00c8\u00c9\7\24\2\2\u00c9\u00ca\7\63\2\2\u00ca\u00cb\7$\2\2\u00cb"+
		"\u00d2\5\32\16\2\u00cc\u00cd\7%\2\2\u00cd\u00ce\7\63\2\2\u00ce\u00cf\7"+
		"$\2\2\u00cf\u00d1\5\32\16\2\u00d0\u00cc\3\2\2\2\u00d1\u00d4\3\2\2\2\u00d2"+
		"\u00d0\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d5\3\2\2\2\u00d4\u00d2\3\2"+
		"\2\2\u00d5\u00d6\7\31\2\2\u00d6\u00dc\3\2\2\2\u00d7\u00d8\7\r\2\2\u00d8"+
		"\u00d9\5\32\16\2\u00d9\u00da\7\35\2\2\u00da\u00dc\3\2\2\2\u00db\u00a9"+
		"\3\2\2\2\u00db\u00ac\3\2\2\2\u00db\u00ae\3\2\2\2\u00db\u00b0\3\2\2\2\u00db"+
		"\u00b1\3\2\2\2\u00db\u00b2\3\2\2\2\u00db\u00b3\3\2\2\2\u00db\u00b4\3\2"+
		"\2\2\u00db\u00c1\3\2\2\2\u00db\u00c8\3\2\2\2\u00db\u00d7\3\2\2\2\u00dc"+
		"\u00f7\3\2\2\2\u00dd\u00de\6\16\2\3\u00de\u00df\t\2\2\2\u00df\u00f6\5"+
		"\32\16\2\u00e0\u00e1\6\16\3\3\u00e1\u00e2\t\3\2\2\u00e2\u00f6\5\32\16"+
		"\2\u00e3\u00e4\6\16\4\3\u00e4\u00e5\t\4\2\2\u00e5\u00f6\5\32\16\2\u00e6"+
		"\u00e7\6\16\5\3\u00e7\u00e8\7\25\2\2\u00e8\u00f6\5\32\16\2\u00e9\u00ea"+
		"\6\16\6\3\u00ea\u00eb\t\5\2\2\u00eb\u00f6\5\32\16\2\u00ec\u00ed\6\16\7"+
		"\3\u00ed\u00ee\7 \2\2\u00ee\u00f6\5\32\16\2\u00ef\u00f0\6\16\b\3\u00f0"+
		"\u00f1\7\32\2\2\u00f1\u00f6\5\32\16\2\u00f2\u00f3\6\16\t\3\u00f3\u00f4"+
		"\7\36\2\2\u00f4\u00f6\7\63\2\2\u00f5\u00dd\3\2\2\2\u00f5\u00e0\3\2\2\2"+
		"\u00f5\u00e3\3\2\2\2\u00f5\u00e6\3\2\2\2\u00f5\u00e9\3\2\2\2\u00f5\u00ec"+
		"\3\2\2\2\u00f5\u00ef\3\2\2\2\u00f5\u00f2\3\2\2\2\u00f6\u00f9\3\2\2\2\u00f7"+
		"\u00f5\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\33\3\2\2\2\u00f9\u00f7\3\2\2"+
		"\2\30\37!\60:@HNPU\\d\u0082\u0087\u008a\u009b\u00a6\u00bb\u00be\u00d2"+
		"\u00db\u00f5\u00f7";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}
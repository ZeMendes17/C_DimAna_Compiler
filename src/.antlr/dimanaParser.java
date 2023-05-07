// Generated from /Users/andreoliveira/Documents/GitHub/comp-2023-dimana-01/src/dimana.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class dimanaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, ID=35, STRING=36, INTEGER=37, REAL=38, DIGIT=39, 
		TEXT=40, WS=41, COMMENT=42;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_dimensionDefinition = 2, RULE_dimensionExpression = 3, 
		RULE_dimensionTerm = 4, RULE_unitDefinition = 5, RULE_dataTypeDefinition = 6, 
		RULE_expr = 7, RULE_listCreation = 8, RULE_printStatement = 9, RULE_readStatement = 10, 
		RULE_conversion = 11, RULE_listAppend = 12, RULE_listAccess = 13, RULE_loop = 14, 
		RULE_include = 15, RULE_assignment = 16, RULE_comparison = 17;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "dimensionDefinition", "dimensionExpression", 
			"dimensionTerm", "unitDefinition", "dataTypeDefinition", "expr", "listCreation", 
			"printStatement", "readStatement", "conversion", "listAppend", "listAccess", 
			"loop", "include", "assignment", "comparison"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'dimension'", "'='", "';'", "'*'", "'/'", "'^'", "'unit'", "'for'", 
			"'integer'", "'real'", "'text'", "'list'", "'-'", "'+'", "'('", "')'", 
			"'['", "','", "']'", "'print'", "'read'", "'.'", "'append'", "'loop'", 
			"'from'", "'to'", "'endloop'", "'include'", "'=='", "'!='", "'>'", "'<'", 
			"'>='", "'<='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, "ID", 
			"STRING", "INTEGER", "REAL", "DIGIT", "TEXT", "WS", "COMMENT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "dimana.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public dimanaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(dimanaParser.EOF, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__6) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__16) | (1L << T__19) | (1L << T__20) | (1L << T__23) | (1L << T__27) | (1L << ID) | (1L << INTEGER) | (1L << REAL) | (1L << TEXT))) != 0)) {
				{
				{
				setState(36);
				statement();
				}
				}
				setState(41);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(42);
			match(EOF);
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

	public static class StatementContext extends ParserRuleContext {
		public DimensionDefinitionContext dimensionDefinition() {
			return getRuleContext(DimensionDefinitionContext.class,0);
		}
		public UnitDefinitionContext unitDefinition() {
			return getRuleContext(UnitDefinitionContext.class,0);
		}
		public DataTypeDefinitionContext dataTypeDefinition() {
			return getRuleContext(DataTypeDefinitionContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PrintStatementContext printStatement() {
			return getRuleContext(PrintStatementContext.class,0);
		}
		public ReadStatementContext readStatement() {
			return getRuleContext(ReadStatementContext.class,0);
		}
		public ConversionContext conversion() {
			return getRuleContext(ConversionContext.class,0);
		}
		public ListAppendContext listAppend() {
			return getRuleContext(ListAppendContext.class,0);
		}
		public ListAccessContext listAccess() {
			return getRuleContext(ListAccessContext.class,0);
		}
		public LoopContext loop() {
			return getRuleContext(LoopContext.class,0);
		}
		public IncludeContext include() {
			return getRuleContext(IncludeContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public ComparisonContext comparison() {
			return getRuleContext(ComparisonContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(57);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(44);
				dimensionDefinition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(45);
				unitDefinition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(46);
				dataTypeDefinition();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(47);
				expr(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(48);
				printStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(49);
				readStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(50);
				conversion();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(51);
				listAppend();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(52);
				listAccess();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(53);
				loop();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(54);
				include();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(55);
				assignment();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(56);
				comparison();
				}
				break;
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

	public static class DimensionDefinitionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(dimanaParser.ID, 0); }
		public DimensionExpressionContext dimensionExpression() {
			return getRuleContext(DimensionExpressionContext.class,0);
		}
		public DimensionDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dimensionDefinition; }
	}

	public final DimensionDefinitionContext dimensionDefinition() throws RecognitionException {
		DimensionDefinitionContext _localctx = new DimensionDefinitionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_dimensionDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			match(T__0);
			setState(60);
			match(ID);
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(61);
				match(T__1);
				setState(62);
				dimensionExpression();
				}
			}

			setState(65);
			match(T__2);
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

	public static class DimensionExpressionContext extends ParserRuleContext {
		public List<DimensionTermContext> dimensionTerm() {
			return getRuleContexts(DimensionTermContext.class);
		}
		public DimensionTermContext dimensionTerm(int i) {
			return getRuleContext(DimensionTermContext.class,i);
		}
		public DimensionExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dimensionExpression; }
	}

	public final DimensionExpressionContext dimensionExpression() throws RecognitionException {
		DimensionExpressionContext _localctx = new DimensionExpressionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_dimensionExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			dimensionTerm();
			setState(73);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3 || _la==T__4) {
				{
				setState(71);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__3:
					{
					setState(68);
					match(T__3);
					}
					break;
				case T__4:
					{
					setState(69);
					match(T__4);
					setState(70);
					dimensionTerm();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(75);
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

	public static class DimensionTermContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(dimanaParser.ID, 0); }
		public TerminalNode INTEGER() { return getToken(dimanaParser.INTEGER, 0); }
		public DimensionTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dimensionTerm; }
	}

	public final DimensionTermContext dimensionTerm() throws RecognitionException {
		DimensionTermContext _localctx = new DimensionTermContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_dimensionTerm);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			match(ID);
			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(77);
				match(T__5);
				setState(78);
				match(INTEGER);
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

	public static class UnitDefinitionContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(dimanaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(dimanaParser.ID, i);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public UnitDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unitDefinition; }
	}

	public final UnitDefinitionContext unitDefinition() throws RecognitionException {
		UnitDefinitionContext _localctx = new UnitDefinitionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_unitDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			match(T__6);
			setState(82);
			match(ID);
			setState(83);
			match(T__7);
			setState(84);
			match(ID);
			setState(87);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(85);
				match(T__1);
				setState(86);
				expr(0);
				}
			}

			setState(89);
			match(T__2);
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

	public static class DataTypeDefinitionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(dimanaParser.ID, 0); }
		public DataTypeDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataTypeDefinition; }
	}

	public final DataTypeDefinitionContext dataTypeDefinition() throws RecognitionException {
		DataTypeDefinitionContext _localctx = new DataTypeDefinitionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_dataTypeDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(92);
			match(ID);
			setState(93);
			match(T__2);
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
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode ID() { return getToken(dimanaParser.ID, 0); }
		public TerminalNode INTEGER() { return getToken(dimanaParser.INTEGER, 0); }
		public TerminalNode REAL() { return getToken(dimanaParser.REAL, 0); }
		public TerminalNode TEXT() { return getToken(dimanaParser.TEXT, 0); }
		public ListCreationContext listCreation() {
			return getRuleContext(ListCreationContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
				{
				setState(96);
				match(T__12);
				setState(97);
				expr(13);
				}
				break;
			case T__13:
				{
				setState(98);
				match(T__13);
				setState(99);
				expr(12);
				}
				break;
			case ID:
				{
				setState(100);
				match(ID);
				}
				break;
			case INTEGER:
				{
				setState(101);
				match(INTEGER);
				}
				break;
			case REAL:
				{
				setState(102);
				match(REAL);
				}
				break;
			case TEXT:
				{
				setState(103);
				match(TEXT);
				}
				break;
			case T__16:
				{
				setState(104);
				listCreation();
				}
				break;
			case T__14:
				{
				setState(105);
				match(T__14);
				setState(106);
				expr(0);
				setState(107);
				match(T__15);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(128);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(126);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(111);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(112);
						match(T__13);
						setState(113);
						expr(12);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(114);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(115);
						match(T__12);
						setState(116);
						expr(11);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(117);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(118);
						match(T__3);
						setState(119);
						expr(10);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(120);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(121);
						match(T__4);
						setState(122);
						expr(9);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(123);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(124);
						match(T__5);
						setState(125);
						expr(8);
						}
						break;
					}
					} 
				}
				setState(130);
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
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ListCreationContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ListCreationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listCreation; }
	}

	public final ListCreationContext listCreation() throws RecognitionException {
		ListCreationContext _localctx = new ListCreationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_listCreation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			match(T__16);
			setState(132);
			expr(0);
			setState(137);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__17) {
				{
				{
				setState(133);
				match(T__17);
				setState(134);
				expr(0);
				}
				}
				setState(139);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(140);
			match(T__18);
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

	public static class PrintStatementContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PrintStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printStatement; }
	}

	public final PrintStatementContext printStatement() throws RecognitionException {
		PrintStatementContext _localctx = new PrintStatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_printStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			match(T__19);
			setState(143);
			expr(0);
			setState(144);
			match(T__2);
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

	public static class ReadStatementContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(dimanaParser.ID, 0); }
		public ReadStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_readStatement; }
	}

	public final ReadStatementContext readStatement() throws RecognitionException {
		ReadStatementContext _localctx = new ReadStatementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_readStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			match(T__20);
			setState(147);
			match(ID);
			setState(148);
			match(T__2);
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

	public static class ConversionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(dimanaParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ConversionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conversion; }
	}

	public final ConversionContext conversion() throws RecognitionException {
		ConversionContext _localctx = new ConversionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_conversion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			match(ID);
			setState(151);
			match(T__14);
			setState(152);
			expr(0);
			setState(153);
			match(T__15);
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

	public static class ListAppendContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(dimanaParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ListAppendContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listAppend; }
	}

	public final ListAppendContext listAppend() throws RecognitionException {
		ListAppendContext _localctx = new ListAppendContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_listAppend);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			match(ID);
			setState(156);
			match(T__21);
			setState(157);
			match(T__22);
			setState(158);
			match(T__14);
			setState(159);
			expr(0);
			setState(160);
			match(T__15);
			setState(161);
			match(T__2);
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

	public static class ListAccessContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(dimanaParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ListAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listAccess; }
	}

	public final ListAccessContext listAccess() throws RecognitionException {
		ListAccessContext _localctx = new ListAccessContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_listAccess);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			match(ID);
			setState(164);
			match(T__16);
			setState(165);
			expr(0);
			setState(166);
			match(T__18);
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

	public static class LoopContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(dimanaParser.ID, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public LoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop; }
	}

	public final LoopContext loop() throws RecognitionException {
		LoopContext _localctx = new LoopContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_loop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			match(T__23);
			setState(169);
			match(ID);
			setState(170);
			match(T__24);
			setState(171);
			expr(0);
			setState(172);
			match(T__25);
			setState(173);
			expr(0);
			setState(177);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__6) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__16) | (1L << T__19) | (1L << T__20) | (1L << T__23) | (1L << T__27) | (1L << ID) | (1L << INTEGER) | (1L << REAL) | (1L << TEXT))) != 0)) {
				{
				{
				setState(174);
				statement();
				}
				}
				setState(179);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(180);
			match(T__26);
			setState(181);
			match(T__2);
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

	public static class IncludeContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(dimanaParser.STRING, 0); }
		public IncludeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_include; }
	}

	public final IncludeContext include() throws RecognitionException {
		IncludeContext _localctx = new IncludeContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_include);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			match(T__27);
			setState(184);
			match(STRING);
			setState(185);
			match(T__2);
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

	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(dimanaParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			match(ID);
			setState(188);
			match(T__1);
			setState(189);
			expr(0);
			setState(190);
			match(T__2);
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

	public static class ComparisonContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ComparisonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparison; }
	}

	public final ComparisonContext comparison() throws RecognitionException {
		ComparisonContext _localctx = new ComparisonContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_comparison);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			expr(0);
			setState(193);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(194);
			expr(0);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 7:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 11);
		case 1:
			return precpred(_ctx, 10);
		case 2:
			return precpred(_ctx, 9);
		case 3:
			return precpred(_ctx, 8);
		case 4:
			return precpred(_ctx, 7);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3,\u00c7\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\7\2(\n\2\f\2\16\2+\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3<\n\3\3\4\3\4\3\4\3\4\5\4B\n\4\3\4\3\4"+
		"\3\5\3\5\3\5\3\5\7\5J\n\5\f\5\16\5M\13\5\3\6\3\6\3\6\5\6R\n\6\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\5\7Z\n\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\tp\n\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u0081\n\t\f\t\16\t\u0084\13\t"+
		"\3\n\3\n\3\n\3\n\7\n\u008a\n\n\f\n\16\n\u008d\13\n\3\n\3\n\3\13\3\13\3"+
		"\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\7\20\u00b2\n\20\f\20\16\20\u00b5\13\20\3\20\3\20\3\20\3\21\3\21"+
		"\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\2\3\20\24"+
		"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$\2\4\3\2\13\16\3\2\37$\2\u00d4"+
		"\2)\3\2\2\2\4;\3\2\2\2\6=\3\2\2\2\bE\3\2\2\2\nN\3\2\2\2\fS\3\2\2\2\16"+
		"]\3\2\2\2\20o\3\2\2\2\22\u0085\3\2\2\2\24\u0090\3\2\2\2\26\u0094\3\2\2"+
		"\2\30\u0098\3\2\2\2\32\u009d\3\2\2\2\34\u00a5\3\2\2\2\36\u00aa\3\2\2\2"+
		" \u00b9\3\2\2\2\"\u00bd\3\2\2\2$\u00c2\3\2\2\2&(\5\4\3\2\'&\3\2\2\2(+"+
		"\3\2\2\2)\'\3\2\2\2)*\3\2\2\2*,\3\2\2\2+)\3\2\2\2,-\7\2\2\3-\3\3\2\2\2"+
		".<\5\6\4\2/<\5\f\7\2\60<\5\16\b\2\61<\5\20\t\2\62<\5\24\13\2\63<\5\26"+
		"\f\2\64<\5\30\r\2\65<\5\32\16\2\66<\5\34\17\2\67<\5\36\20\28<\5 \21\2"+
		"9<\5\"\22\2:<\5$\23\2;.\3\2\2\2;/\3\2\2\2;\60\3\2\2\2;\61\3\2\2\2;\62"+
		"\3\2\2\2;\63\3\2\2\2;\64\3\2\2\2;\65\3\2\2\2;\66\3\2\2\2;\67\3\2\2\2;"+
		"8\3\2\2\2;9\3\2\2\2;:\3\2\2\2<\5\3\2\2\2=>\7\3\2\2>A\7%\2\2?@\7\4\2\2"+
		"@B\5\b\5\2A?\3\2\2\2AB\3\2\2\2BC\3\2\2\2CD\7\5\2\2D\7\3\2\2\2EK\5\n\6"+
		"\2FJ\7\6\2\2GH\7\7\2\2HJ\5\n\6\2IF\3\2\2\2IG\3\2\2\2JM\3\2\2\2KI\3\2\2"+
		"\2KL\3\2\2\2L\t\3\2\2\2MK\3\2\2\2NQ\7%\2\2OP\7\b\2\2PR\7\'\2\2QO\3\2\2"+
		"\2QR\3\2\2\2R\13\3\2\2\2ST\7\t\2\2TU\7%\2\2UV\7\n\2\2VY\7%\2\2WX\7\4\2"+
		"\2XZ\5\20\t\2YW\3\2\2\2YZ\3\2\2\2Z[\3\2\2\2[\\\7\5\2\2\\\r\3\2\2\2]^\t"+
		"\2\2\2^_\7%\2\2_`\7\5\2\2`\17\3\2\2\2ab\b\t\1\2bc\7\17\2\2cp\5\20\t\17"+
		"de\7\20\2\2ep\5\20\t\16fp\7%\2\2gp\7\'\2\2hp\7(\2\2ip\7*\2\2jp\5\22\n"+
		"\2kl\7\21\2\2lm\5\20\t\2mn\7\22\2\2np\3\2\2\2oa\3\2\2\2od\3\2\2\2of\3"+
		"\2\2\2og\3\2\2\2oh\3\2\2\2oi\3\2\2\2oj\3\2\2\2ok\3\2\2\2p\u0082\3\2\2"+
		"\2qr\f\r\2\2rs\7\20\2\2s\u0081\5\20\t\16tu\f\f\2\2uv\7\17\2\2v\u0081\5"+
		"\20\t\rwx\f\13\2\2xy\7\6\2\2y\u0081\5\20\t\fz{\f\n\2\2{|\7\7\2\2|\u0081"+
		"\5\20\t\13}~\f\t\2\2~\177\7\b\2\2\177\u0081\5\20\t\n\u0080q\3\2\2\2\u0080"+
		"t\3\2\2\2\u0080w\3\2\2\2\u0080z\3\2\2\2\u0080}\3\2\2\2\u0081\u0084\3\2"+
		"\2\2\u0082\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083\21\3\2\2\2\u0084\u0082"+
		"\3\2\2\2\u0085\u0086\7\23\2\2\u0086\u008b\5\20\t\2\u0087\u0088\7\24\2"+
		"\2\u0088\u008a\5\20\t\2\u0089\u0087\3\2\2\2\u008a\u008d\3\2\2\2\u008b"+
		"\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008e\3\2\2\2\u008d\u008b\3\2"+
		"\2\2\u008e\u008f\7\25\2\2\u008f\23\3\2\2\2\u0090\u0091\7\26\2\2\u0091"+
		"\u0092\5\20\t\2\u0092\u0093\7\5\2\2\u0093\25\3\2\2\2\u0094\u0095\7\27"+
		"\2\2\u0095\u0096\7%\2\2\u0096\u0097\7\5\2\2\u0097\27\3\2\2\2\u0098\u0099"+
		"\7%\2\2\u0099\u009a\7\21\2\2\u009a\u009b\5\20\t\2\u009b\u009c\7\22\2\2"+
		"\u009c\31\3\2\2\2\u009d\u009e\7%\2\2\u009e\u009f\7\30\2\2\u009f\u00a0"+
		"\7\31\2\2\u00a0\u00a1\7\21\2\2\u00a1\u00a2\5\20\t\2\u00a2\u00a3\7\22\2"+
		"\2\u00a3\u00a4\7\5\2\2\u00a4\33\3\2\2\2\u00a5\u00a6\7%\2\2\u00a6\u00a7"+
		"\7\23\2\2\u00a7\u00a8\5\20\t\2\u00a8\u00a9\7\25\2\2\u00a9\35\3\2\2\2\u00aa"+
		"\u00ab\7\32\2\2\u00ab\u00ac\7%\2\2\u00ac\u00ad\7\33\2\2\u00ad\u00ae\5"+
		"\20\t\2\u00ae\u00af\7\34\2\2\u00af\u00b3\5\20\t\2\u00b0\u00b2\5\4\3\2"+
		"\u00b1\u00b0\3\2\2\2\u00b2\u00b5\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b3\u00b4"+
		"\3\2\2\2\u00b4\u00b6\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b6\u00b7\7\35\2\2"+
		"\u00b7\u00b8\7\5\2\2\u00b8\37\3\2\2\2\u00b9\u00ba\7\36\2\2\u00ba\u00bb"+
		"\7&\2\2\u00bb\u00bc\7\5\2\2\u00bc!\3\2\2\2\u00bd\u00be\7%\2\2\u00be\u00bf"+
		"\7\4\2\2\u00bf\u00c0\5\20\t\2\u00c0\u00c1\7\5\2\2\u00c1#\3\2\2\2\u00c2"+
		"\u00c3\5\20\t\2\u00c3\u00c4\t\3\2\2\u00c4\u00c5\5\20\t\2\u00c5%\3\2\2"+
		"\2\16);AIKQYo\u0080\u0082\u008b\u00b3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
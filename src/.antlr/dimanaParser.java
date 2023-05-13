// Generated from c:\Users\rodri\OneDrive\Ambiente de Trabalho\Uni\ano2-sem2\C\comp-2023-dimana-01\src\dimana.g4 by ANTLR 4.9.2
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
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, ID=31, INT=32, 
		REAL=33, STRING=34, WS=35, LINE_COMMENT=36, ERROR=37;
	public static final int
		RULE_program = 0, RULE_statList = 1, RULE_statement = 2, RULE_variableDeclaration = 3, 
		RULE_assignment = 4, RULE_inputStatement = 5, RULE_outputStatement = 6, 
		RULE_write_expr = 7, RULE_loopStatement = 8, RULE_headerFile = 9, RULE_prefixUnit = 10, 
		RULE_unit = 11, RULE_alternativeUnit = 12, RULE_listDeclaration = 13, 
		RULE_expression = 14, RULE_dataType = 15;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statList", "statement", "variableDeclaration", "assignment", 
			"inputStatement", "outputStatement", "write_expr", "loopStatement", "headerFile", 
			"prefixUnit", "unit", "alternativeUnit", "listDeclaration", "expression", 
			"dataType"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'='", "'('", "'read'", "')'", "'*'", "'write'", "'writeln'", 
			"'for'", "'to'", "'length'", "'do'", "'end'", "'use'", "'prefix'", "'1e'", 
			"'-'", "'dimension'", "'['", "','", "']'", "'unit'", "'list'", "'new'", 
			"'string'", "'/'", "'+'", "'>>'", "'integer'", "'real'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "ID", "INT", "REAL", "STRING", 
			"WS", "LINE_COMMENT", "ERROR"
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
		public StatListContext statList() {
			return getRuleContext(StatListContext.class,0);
		}
		public TerminalNode EOF() { return getToken(dimanaParser.EOF, 0); }
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			statList();
			setState(33);
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

	public static class StatListContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public StatListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statList; }
	}

	public final StatListContext statList() throws RecognitionException {
		StatListContext _localctx = new StatListContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__13) | (1L << T__14) | (1L << T__17) | (1L << T__21) | (1L << T__22) | (1L << T__24) | (1L << T__28) | (1L << T__29) | (1L << ID))) != 0)) {
				{
				{
				setState(36);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__13) | (1L << T__14) | (1L << T__17) | (1L << T__21) | (1L << T__22) | (1L << T__24) | (1L << T__28) | (1L << T__29) | (1L << ID))) != 0)) {
					{
					setState(35);
					statement();
					}
				}

				setState(38);
				match(T__0);
				}
				}
				setState(43);
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

	public static class StatementContext extends ParserRuleContext {
		public InputStatementContext inputStatement() {
			return getRuleContext(InputStatementContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public OutputStatementContext outputStatement() {
			return getRuleContext(OutputStatementContext.class,0);
		}
		public LoopStatementContext loopStatement() {
			return getRuleContext(LoopStatementContext.class,0);
		}
		public HeaderFileContext headerFile() {
			return getRuleContext(HeaderFileContext.class,0);
		}
		public PrefixUnitContext prefixUnit() {
			return getRuleContext(PrefixUnitContext.class,0);
		}
		public UnitContext unit() {
			return getRuleContext(UnitContext.class,0);
		}
		public AlternativeUnitContext alternativeUnit() {
			return getRuleContext(AlternativeUnitContext.class,0);
		}
		public ListDeclarationContext listDeclaration() {
			return getRuleContext(ListDeclarationContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		try {
			setState(54);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(44);
				inputStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(45);
				assignment();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(46);
				variableDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(47);
				outputStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(48);
				loopStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(49);
				headerFile();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(50);
				prefixUnit();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(51);
				unit();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(52);
				alternativeUnit();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(53);
				listDeclaration();
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

	public static class VariableDeclarationContext extends ParserRuleContext {
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(dimanaParser.ID, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_variableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			dataType();
			setState(57);
			match(ID);
			setState(60);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(58);
				match(T__1);
				setState(59);
				expression(0);
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

	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(dimanaParser.ID, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			match(ID);
			setState(63);
			match(T__1);
			setState(64);
			expression(0);
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

	public static class InputStatementContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(dimanaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(dimanaParser.ID, i);
		}
		public TerminalNode STRING() { return getToken(dimanaParser.STRING, 0); }
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public InputStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inputStatement; }
	}

	public final InputStatementContext inputStatement() throws RecognitionException {
		InputStatementContext _localctx = new InputStatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_inputStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			match(ID);
			setState(67);
			match(T__1);
			setState(69);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__22) | (1L << T__24) | (1L << T__28) | (1L << T__29) | (1L << ID))) != 0)) {
				{
				setState(68);
				dataType();
				}
			}

			setState(72);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(71);
				match(T__2);
				}
			}

			setState(74);
			match(T__3);
			setState(75);
			match(STRING);
			setState(77);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(76);
				match(T__4);
				}
			}

			setState(81);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(79);
				match(T__5);
				setState(80);
				match(ID);
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

	public static class OutputStatementContext extends ParserRuleContext {
		public Write_exprContext write_expr() {
			return getRuleContext(Write_exprContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public OutputStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outputStatement; }
	}

	public final OutputStatementContext outputStatement() throws RecognitionException {
		OutputStatementContext _localctx = new OutputStatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_outputStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			write_expr();
			setState(84);
			expression(0);
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

	public static class Write_exprContext extends ParserRuleContext {
		public Write_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_write_expr; }
	}

	public final Write_exprContext write_expr() throws RecognitionException {
		Write_exprContext _localctx = new Write_exprContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_write_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			_la = _input.LA(1);
			if ( !(_la==T__6 || _la==T__7) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class LoopStatementContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(dimanaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(dimanaParser.ID, i);
		}
		public List<TerminalNode> INT() { return getTokens(dimanaParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(dimanaParser.INT, i);
		}
		public StatListContext statList() {
			return getRuleContext(StatListContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public LoopStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopStatement; }
	}

	public final LoopStatementContext loopStatement() throws RecognitionException {
		LoopStatementContext _localctx = new LoopStatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_loopStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(T__8);
			setState(89);
			match(ID);
			setState(90);
			match(T__1);
			setState(91);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==INT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(92);
			match(T__9);
			setState(99);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				{
				setState(93);
				match(INT);
				}
				break;
			case ID:
				{
				setState(94);
				match(ID);
				}
				break;
			case T__10:
				{
				setState(95);
				match(T__10);
				setState(96);
				match(T__2);
				setState(97);
				match(ID);
				setState(98);
				match(T__4);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(101);
			match(T__11);
			setState(111);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(107);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__22) | (1L << T__24) | (1L << T__28) | (1L << T__29) | (1L << ID) | (1L << INT) | (1L << REAL) | (1L << STRING))) != 0)) {
					{
					{
					setState(102);
					expression(0);
					setState(103);
					match(T__0);
					}
					}
					setState(109);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				{
				setState(110);
				statList();
				}
				break;
			}
			setState(113);
			match(T__12);
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

	public static class HeaderFileContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(dimanaParser.STRING, 0); }
		public HeaderFileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_headerFile; }
	}

	public final HeaderFileContext headerFile() throws RecognitionException {
		HeaderFileContext _localctx = new HeaderFileContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_headerFile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			match(T__13);
			setState(116);
			match(STRING);
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

	public static class PrefixUnitContext extends ParserRuleContext {
		public Token minus;
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(dimanaParser.ID, 0); }
		public TerminalNode INT() { return getToken(dimanaParser.INT, 0); }
		public PrefixUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prefixUnit; }
	}

	public final PrefixUnitContext prefixUnit() throws RecognitionException {
		PrefixUnitContext _localctx = new PrefixUnitContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_prefixUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			match(T__14);
			setState(119);
			dataType();
			setState(120);
			match(ID);
			setState(121);
			match(T__1);
			setState(128);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				{
				setState(122);
				match(INT);
				}
				break;
			case T__15:
				{
				setState(123);
				match(T__15);
				setState(125);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__16) {
					{
					setState(124);
					((PrefixUnitContext)_localctx).minus = match(T__16);
					}
				}

				setState(127);
				match(INT);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class UnitContext extends ParserRuleContext {
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(dimanaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(dimanaParser.ID, i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public UnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unit; }
	}

	public final UnitContext unit() throws RecognitionException {
		UnitContext _localctx = new UnitContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_unit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			match(T__17);
			setState(131);
			dataType();
			setState(132);
			match(ID);
			setState(146);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__18:
				{
				setState(133);
				match(T__18);
				setState(134);
				match(ID);
				setState(137);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__19) {
					{
					setState(135);
					match(T__19);
					setState(136);
					match(ID);
					}
				}

				setState(139);
				match(T__20);
				setState(142);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(140);
					match(T__1);
					setState(141);
					expression(0);
					}
				}

				}
				break;
			case T__1:
				{
				setState(144);
				match(T__1);
				setState(145);
				expression(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class AlternativeUnitContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(dimanaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(dimanaParser.ID, i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AlternativeUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alternativeUnit; }
	}

	public final AlternativeUnitContext alternativeUnit() throws RecognitionException {
		AlternativeUnitContext _localctx = new AlternativeUnitContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_alternativeUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			match(T__21);
			setState(149);
			match(ID);
			setState(150);
			match(T__18);
			setState(151);
			match(ID);
			setState(154);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__19) {
				{
				setState(152);
				match(T__19);
				setState(153);
				match(ID);
				}
			}

			setState(156);
			match(T__20);
			setState(157);
			match(T__1);
			setState(158);
			expression(0);
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

	public static class ListDeclarationContext extends ParserRuleContext {
		public List<DataTypeContext> dataType() {
			return getRuleContexts(DataTypeContext.class);
		}
		public DataTypeContext dataType(int i) {
			return getRuleContext(DataTypeContext.class,i);
		}
		public TerminalNode ID() { return getToken(dimanaParser.ID, 0); }
		public ListDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listDeclaration; }
	}

	public final ListDeclarationContext listDeclaration() throws RecognitionException {
		ListDeclarationContext _localctx = new ListDeclarationContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_listDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			match(T__22);
			setState(161);
			match(T__18);
			setState(162);
			dataType();
			setState(163);
			match(T__20);
			setState(164);
			match(ID);
			setState(172);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(165);
				match(T__1);
				setState(166);
				match(T__23);
				setState(167);
				match(T__22);
				setState(168);
				match(T__18);
				setState(169);
				dataType();
				setState(170);
				match(T__20);
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

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExprListExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExprListExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class IndexExpressionContext extends ExpressionContext {
		public List<TerminalNode> ID() { return getTokens(dimanaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(dimanaParser.ID, i);
		}
		public IndexExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class InputExpressionContext extends ExpressionContext {
		public TerminalNode STRING() { return getToken(dimanaParser.STRING, 0); }
		public InputExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class AddSubExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public AddSubExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class RealLiteralContext extends ExpressionContext {
		public TerminalNode REAL() { return getToken(dimanaParser.REAL, 0); }
		public RealLiteralContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class StringAssignExpressionContext extends ExpressionContext {
		public TerminalNode INT() { return getToken(dimanaParser.INT, 0); }
		public TerminalNode STRING() { return getToken(dimanaParser.STRING, 0); }
		public TerminalNode ID() { return getToken(dimanaParser.ID, 0); }
		public StringAssignExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class TypeConversionContext extends ExpressionContext {
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TypeConversionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class StringLiteralContext extends ExpressionContext {
		public TerminalNode STRING() { return getToken(dimanaParser.STRING, 0); }
		public StringLiteralContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class AddListExpressionContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ID() { return getToken(dimanaParser.ID, 0); }
		public AddListExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class IdExpressionContext extends ExpressionContext {
		public TerminalNode ID() { return getToken(dimanaParser.ID, 0); }
		public IdExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ParenExpressionContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParenExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class IntLiteralContext extends ExpressionContext {
		public TerminalNode INT() { return getToken(dimanaParser.INT, 0); }
		public IntLiteralContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class MulDivExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public MulDivExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				_localctx = new InputExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(175);
				match(T__3);
				setState(176);
				match(STRING);
				}
				break;
			case 2:
				{
				_localctx = new StringAssignExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(177);
				match(T__24);
				setState(178);
				match(T__2);
				setState(179);
				_la = _input.LA(1);
				if ( !(_la==ID || _la==STRING) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(180);
				match(T__19);
				setState(181);
				match(INT);
				setState(182);
				match(T__4);
				}
				break;
			case 3:
				{
				_localctx = new ParenExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(183);
				match(T__2);
				setState(184);
				expression(0);
				setState(185);
				match(T__4);
				}
				break;
			case 4:
				{
				_localctx = new IndexExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(187);
				match(ID);
				setState(188);
				match(T__18);
				setState(189);
				match(ID);
				setState(190);
				match(T__20);
				}
				break;
			case 5:
				{
				_localctx = new IdExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(191);
				match(ID);
				}
				break;
			case 6:
				{
				_localctx = new TypeConversionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(192);
				dataType();
				setState(193);
				match(T__2);
				setState(194);
				expression(0);
				setState(195);
				match(T__4);
				}
				break;
			case 7:
				{
				_localctx = new RealLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(197);
				match(REAL);
				}
				break;
			case 8:
				{
				_localctx = new IntLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(198);
				match(INT);
				}
				break;
			case 9:
				{
				_localctx = new StringLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(199);
				match(STRING);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(216);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(214);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
					case 1:
						{
						_localctx = new MulDivExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(202);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(203);
						_la = _input.LA(1);
						if ( !(_la==T__5 || _la==T__25) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(204);
						expression(12);
						}
						break;
					case 2:
						{
						_localctx = new AddSubExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(205);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(206);
						_la = _input.LA(1);
						if ( !(_la==T__16 || _la==T__26) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(207);
						expression(11);
						}
						break;
					case 3:
						{
						_localctx = new ExprListExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(208);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(209);
						match(T__19);
						setState(210);
						expression(9);
						}
						break;
					case 4:
						{
						_localctx = new AddListExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(211);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(212);
						match(T__27);
						setState(213);
						match(ID);
						}
						break;
					}
					} 
				}
				setState(218);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
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

	public static class DataTypeContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(dimanaParser.ID, 0); }
		public DataTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataType; }
	}

	public final DataTypeContext dataType() throws RecognitionException {
		DataTypeContext _localctx = new DataTypeContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_dataType);
		try {
			setState(227);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__28:
				enterOuterAlt(_localctx, 1);
				{
				setState(219);
				match(T__28);
				}
				break;
			case T__29:
				enterOuterAlt(_localctx, 2);
				{
				setState(220);
				match(T__29);
				}
				break;
			case T__24:
				enterOuterAlt(_localctx, 3);
				{
				setState(221);
				match(T__24);
				}
				break;
			case T__22:
				enterOuterAlt(_localctx, 4);
				{
				setState(222);
				match(T__22);
				setState(223);
				match(T__18);
				setState(224);
				match(ID);
				setState(225);
				match(T__20);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 5);
				{
				setState(226);
				match(ID);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 14:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 11);
		case 1:
			return precpred(_ctx, 10);
		case 2:
			return precpred(_ctx, 8);
		case 3:
			return precpred(_ctx, 7);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\'\u00e8\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2\3"+
		"\2\3\3\5\3\'\n\3\3\3\7\3*\n\3\f\3\16\3-\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\5\49\n\4\3\5\3\5\3\5\3\5\5\5?\n\5\3\6\3\6\3\6\3\6\3\7\3"+
		"\7\3\7\5\7H\n\7\3\7\5\7K\n\7\3\7\3\7\3\7\5\7P\n\7\3\7\3\7\5\7T\n\7\3\b"+
		"\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\nf\n\n"+
		"\3\n\3\n\3\n\3\n\7\nl\n\n\f\n\16\no\13\n\3\n\5\nr\n\n\3\n\3\n\3\13\3\13"+
		"\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u0080\n\f\3\f\5\f\u0083\n\f\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u008c\n\r\3\r\3\r\3\r\5\r\u0091\n\r\3\r\3"+
		"\r\5\r\u0095\n\r\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u009d\n\16\3\16\3"+
		"\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\5\17\u00af\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\5\20\u00cb\n\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\7\20\u00d9\n\20\f\20\16\20\u00dc\13\20\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\5\21\u00e6\n\21\3\21\2\3\36\22\2\4\6\b\n\f\16"+
		"\20\22\24\26\30\32\34\36 \2\7\3\2\t\n\3\2!\"\4\2!!$$\4\2\b\b\34\34\4\2"+
		"\23\23\35\35\2\u0102\2\"\3\2\2\2\4+\3\2\2\2\68\3\2\2\2\b:\3\2\2\2\n@\3"+
		"\2\2\2\fD\3\2\2\2\16U\3\2\2\2\20X\3\2\2\2\22Z\3\2\2\2\24u\3\2\2\2\26x"+
		"\3\2\2\2\30\u0084\3\2\2\2\32\u0096\3\2\2\2\34\u00a2\3\2\2\2\36\u00ca\3"+
		"\2\2\2 \u00e5\3\2\2\2\"#\5\4\3\2#$\7\2\2\3$\3\3\2\2\2%\'\5\6\4\2&%\3\2"+
		"\2\2&\'\3\2\2\2\'(\3\2\2\2(*\7\3\2\2)&\3\2\2\2*-\3\2\2\2+)\3\2\2\2+,\3"+
		"\2\2\2,\5\3\2\2\2-+\3\2\2\2.9\5\f\7\2/9\5\n\6\2\609\5\b\5\2\619\5\16\b"+
		"\2\629\5\22\n\2\639\5\24\13\2\649\5\26\f\2\659\5\30\r\2\669\5\32\16\2"+
		"\679\5\34\17\28.\3\2\2\28/\3\2\2\28\60\3\2\2\28\61\3\2\2\28\62\3\2\2\2"+
		"8\63\3\2\2\28\64\3\2\2\28\65\3\2\2\28\66\3\2\2\28\67\3\2\2\29\7\3\2\2"+
		"\2:;\5 \21\2;>\7!\2\2<=\7\4\2\2=?\5\36\20\2><\3\2\2\2>?\3\2\2\2?\t\3\2"+
		"\2\2@A\7!\2\2AB\7\4\2\2BC\5\36\20\2C\13\3\2\2\2DE\7!\2\2EG\7\4\2\2FH\5"+
		" \21\2GF\3\2\2\2GH\3\2\2\2HJ\3\2\2\2IK\7\5\2\2JI\3\2\2\2JK\3\2\2\2KL\3"+
		"\2\2\2LM\7\6\2\2MO\7$\2\2NP\7\7\2\2ON\3\2\2\2OP\3\2\2\2PS\3\2\2\2QR\7"+
		"\b\2\2RT\7!\2\2SQ\3\2\2\2ST\3\2\2\2T\r\3\2\2\2UV\5\20\t\2VW\5\36\20\2"+
		"W\17\3\2\2\2XY\t\2\2\2Y\21\3\2\2\2Z[\7\13\2\2[\\\7!\2\2\\]\7\4\2\2]^\t"+
		"\3\2\2^e\7\f\2\2_f\7\"\2\2`f\7!\2\2ab\7\r\2\2bc\7\5\2\2cd\7!\2\2df\7\7"+
		"\2\2e_\3\2\2\2e`\3\2\2\2ea\3\2\2\2fg\3\2\2\2gq\7\16\2\2hi\5\36\20\2ij"+
		"\7\3\2\2jl\3\2\2\2kh\3\2\2\2lo\3\2\2\2mk\3\2\2\2mn\3\2\2\2nr\3\2\2\2o"+
		"m\3\2\2\2pr\5\4\3\2qm\3\2\2\2qp\3\2\2\2rs\3\2\2\2st\7\17\2\2t\23\3\2\2"+
		"\2uv\7\20\2\2vw\7$\2\2w\25\3\2\2\2xy\7\21\2\2yz\5 \21\2z{\7!\2\2{\u0082"+
		"\7\4\2\2|\u0083\7\"\2\2}\177\7\22\2\2~\u0080\7\23\2\2\177~\3\2\2\2\177"+
		"\u0080\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0083\7\"\2\2\u0082|\3\2\2\2"+
		"\u0082}\3\2\2\2\u0083\27\3\2\2\2\u0084\u0085\7\24\2\2\u0085\u0086\5 \21"+
		"\2\u0086\u0094\7!\2\2\u0087\u0088\7\25\2\2\u0088\u008b\7!\2\2\u0089\u008a"+
		"\7\26\2\2\u008a\u008c\7!\2\2\u008b\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c"+
		"\u008d\3\2\2\2\u008d\u0090\7\27\2\2\u008e\u008f\7\4\2\2\u008f\u0091\5"+
		"\36\20\2\u0090\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u0095\3\2\2\2\u0092"+
		"\u0093\7\4\2\2\u0093\u0095\5\36\20\2\u0094\u0087\3\2\2\2\u0094\u0092\3"+
		"\2\2\2\u0095\31\3\2\2\2\u0096\u0097\7\30\2\2\u0097\u0098\7!\2\2\u0098"+
		"\u0099\7\25\2\2\u0099\u009c\7!\2\2\u009a\u009b\7\26\2\2\u009b\u009d\7"+
		"!\2\2\u009c\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009e\3\2\2\2\u009e"+
		"\u009f\7\27\2\2\u009f\u00a0\7\4\2\2\u00a0\u00a1\5\36\20\2\u00a1\33\3\2"+
		"\2\2\u00a2\u00a3\7\31\2\2\u00a3\u00a4\7\25\2\2\u00a4\u00a5\5 \21\2\u00a5"+
		"\u00a6\7\27\2\2\u00a6\u00ae\7!\2\2\u00a7\u00a8\7\4\2\2\u00a8\u00a9\7\32"+
		"\2\2\u00a9\u00aa\7\31\2\2\u00aa\u00ab\7\25\2\2\u00ab\u00ac\5 \21\2\u00ac"+
		"\u00ad\7\27\2\2\u00ad\u00af\3\2\2\2\u00ae\u00a7\3\2\2\2\u00ae\u00af\3"+
		"\2\2\2\u00af\35\3\2\2\2\u00b0\u00b1\b\20\1\2\u00b1\u00b2\7\6\2\2\u00b2"+
		"\u00cb\7$\2\2\u00b3\u00b4\7\33\2\2\u00b4\u00b5\7\5\2\2\u00b5\u00b6\t\4"+
		"\2\2\u00b6\u00b7\7\26\2\2\u00b7\u00b8\7\"\2\2\u00b8\u00cb\7\7\2\2\u00b9"+
		"\u00ba\7\5\2\2\u00ba\u00bb\5\36\20\2\u00bb\u00bc\7\7\2\2\u00bc\u00cb\3"+
		"\2\2\2\u00bd\u00be\7!\2\2\u00be\u00bf\7\25\2\2\u00bf\u00c0\7!\2\2\u00c0"+
		"\u00cb\7\27\2\2\u00c1\u00cb\7!\2\2\u00c2\u00c3\5 \21\2\u00c3\u00c4\7\5"+
		"\2\2\u00c4\u00c5\5\36\20\2\u00c5\u00c6\7\7\2\2\u00c6\u00cb\3\2\2\2\u00c7"+
		"\u00cb\7#\2\2\u00c8\u00cb\7\"\2\2\u00c9\u00cb\7$\2\2\u00ca\u00b0\3\2\2"+
		"\2\u00ca\u00b3\3\2\2\2\u00ca\u00b9\3\2\2\2\u00ca\u00bd\3\2\2\2\u00ca\u00c1"+
		"\3\2\2\2\u00ca\u00c2\3\2\2\2\u00ca\u00c7\3\2\2\2\u00ca\u00c8\3\2\2\2\u00ca"+
		"\u00c9\3\2\2\2\u00cb\u00da\3\2\2\2\u00cc\u00cd\f\r\2\2\u00cd\u00ce\t\5"+
		"\2\2\u00ce\u00d9\5\36\20\16\u00cf\u00d0\f\f\2\2\u00d0\u00d1\t\6\2\2\u00d1"+
		"\u00d9\5\36\20\r\u00d2\u00d3\f\n\2\2\u00d3\u00d4\7\26\2\2\u00d4\u00d9"+
		"\5\36\20\13\u00d5\u00d6\f\t\2\2\u00d6\u00d7\7\36\2\2\u00d7\u00d9\7!\2"+
		"\2\u00d8\u00cc\3\2\2\2\u00d8\u00cf\3\2\2\2\u00d8\u00d2\3\2\2\2\u00d8\u00d5"+
		"\3\2\2\2\u00d9\u00dc\3\2\2\2\u00da\u00d8\3\2\2\2\u00da\u00db\3\2\2\2\u00db"+
		"\37\3\2\2\2\u00dc\u00da\3\2\2\2\u00dd\u00e6\7\37\2\2\u00de\u00e6\7 \2"+
		"\2\u00df\u00e6\7\33\2\2\u00e0\u00e1\7\31\2\2\u00e1\u00e2\7\25\2\2\u00e2"+
		"\u00e3\7!\2\2\u00e3\u00e6\7\27\2\2\u00e4\u00e6\7!\2\2\u00e5\u00dd\3\2"+
		"\2\2\u00e5\u00de\3\2\2\2\u00e5\u00df\3\2\2\2\u00e5\u00e0\3\2\2\2\u00e5"+
		"\u00e4\3\2\2\2\u00e6!\3\2\2\2\30&+8>GJOSemq\177\u0082\u008b\u0090\u0094"+
		"\u009c\u00ae\u00ca\u00d8\u00da\u00e5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
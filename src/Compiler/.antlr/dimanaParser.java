// Generated from c:\Users\rodri\OneDrive\Ambiente de Trabalho\Uni\ano2-sem2\C\comp-2023-dimana-01\src\Compiler\dimana.g4 by ANTLR 4.9.2
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
		RULE_outputFormat = 7, RULE_write_expr = 8, RULE_loopStatement = 9, RULE_length = 10, 
		RULE_headerFile = 11, RULE_prefixUnit = 12, RULE_unit = 13, RULE_alternativeUnit = 14, 
		RULE_listDeclaration = 15, RULE_expression = 16, RULE_dataType = 17;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statList", "statement", "variableDeclaration", "assignment", 
			"inputStatement", "outputStatement", "outputFormat", "write_expr", "loopStatement", 
			"length", "headerFile", "prefixUnit", "unit", "alternativeUnit", "listDeclaration", 
			"expression", "dataType"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'='", "'('", "'read'", "')'", "'*'", "','", "'string'", 
			"'write'", "'writeln'", "'for'", "'to'", "'do'", "'end'", "'length'", 
			"'use'", "'prefix'", "'1e'", "'-'", "'dimension'", "'['", "']'", "'unit'", 
			"'list'", "'new'", "'/'", "'+'", "'>>'", "'integer'", "'real'"
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
			setState(36);
			statList();
			setState(37);
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
			setState(45);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__15) | (1L << T__16) | (1L << T__19) | (1L << T__22) | (1L << T__23) | (1L << T__28) | (1L << T__29) | (1L << ID))) != 0)) {
				{
				{
				setState(40);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__15) | (1L << T__16) | (1L << T__19) | (1L << T__22) | (1L << T__23) | (1L << T__28) | (1L << T__29) | (1L << ID))) != 0)) {
					{
					setState(39);
					statement();
					}
				}

				setState(42);
				match(T__0);
				}
				}
				setState(47);
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
			setState(58);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(48);
				inputStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(49);
				assignment();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(50);
				variableDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(51);
				outputStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(52);
				loopStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(53);
				headerFile();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(54);
				prefixUnit();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(55);
				unit();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(56);
				alternativeUnit();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(57);
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
			setState(60);
			dataType();
			setState(61);
			match(ID);
			setState(64);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(62);
				match(T__1);
				setState(63);
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
			setState(66);
			match(ID);
			setState(67);
			match(T__1);
			setState(68);
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
			setState(70);
			match(ID);
			setState(71);
			match(T__1);
			setState(73);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__23) | (1L << T__28) | (1L << T__29) | (1L << ID))) != 0)) {
				{
				setState(72);
				dataType();
				}
			}

			setState(76);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(75);
				match(T__2);
				}
			}

			setState(78);
			match(T__3);
			setState(79);
			match(STRING);
			setState(81);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(80);
				match(T__4);
				}
			}

			setState(85);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(83);
				match(T__5);
				setState(84);
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
		public List<OutputFormatContext> outputFormat() {
			return getRuleContexts(OutputFormatContext.class);
		}
		public OutputFormatContext outputFormat(int i) {
			return getRuleContext(OutputFormatContext.class,i);
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
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			write_expr();
			setState(88);
			outputFormat();
			setState(93);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(89);
					match(T__6);
					setState(90);
					outputFormat();
					}
					} 
				}
				setState(95);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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

	public static class OutputFormatContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(dimanaParser.INT, 0); }
		public TerminalNode ID() { return getToken(dimanaParser.ID, 0); }
		public TerminalNode STRING() { return getToken(dimanaParser.STRING, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public OutputFormatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outputFormat; }
	}

	public final OutputFormatContext outputFormat() throws RecognitionException {
		OutputFormatContext _localctx = new OutputFormatContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_outputFormat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			match(T__7);
			setState(97);
			match(T__2);
			setState(101);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(98);
				match(ID);
				}
				break;
			case 2:
				{
				setState(99);
				match(STRING);
				}
				break;
			case 3:
				{
				setState(100);
				expression(0);
				}
				break;
			}
			setState(103);
			match(T__6);
			setState(104);
			match(INT);
			setState(105);
			match(T__4);
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
		enterRule(_localctx, 16, RULE_write_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			_la = _input.LA(1);
			if ( !(_la==T__8 || _la==T__9) ) {
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
		public LengthContext length() {
			return getRuleContext(LengthContext.class,0);
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
		enterRule(_localctx, 18, RULE_loopStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			match(T__10);
			setState(110);
			match(ID);
			setState(111);
			match(T__1);
			setState(112);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==INT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(113);
			match(T__11);
			setState(121);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				{
				setState(114);
				match(INT);
				}
				break;
			case ID:
				{
				setState(115);
				match(ID);
				}
				break;
			case T__14:
				{
				setState(116);
				length();
				setState(117);
				match(T__2);
				setState(118);
				match(ID);
				setState(119);
				match(T__4);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(123);
			match(T__12);
			{
			setState(129);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__23) | (1L << T__28) | (1L << T__29) | (1L << ID) | (1L << INT) | (1L << REAL) | (1L << STRING))) != 0)) {
				{
				{
				setState(124);
				expression(0);
				setState(125);
				match(T__0);
				}
				}
				setState(131);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			setState(132);
			match(T__13);
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

	public static class LengthContext extends ParserRuleContext {
		public LengthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_length; }
	}

	public final LengthContext length() throws RecognitionException {
		LengthContext _localctx = new LengthContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_length);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			match(T__14);
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
		enterRule(_localctx, 22, RULE_headerFile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			match(T__15);
			setState(137);
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
		enterRule(_localctx, 24, RULE_prefixUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			match(T__16);
			setState(140);
			dataType();
			setState(141);
			match(ID);
			setState(142);
			match(T__1);
			setState(149);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				{
				setState(143);
				match(INT);
				}
				break;
			case T__17:
				{
				setState(144);
				match(T__17);
				setState(146);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__18) {
					{
					setState(145);
					((PrefixUnitContext)_localctx).minus = match(T__18);
					}
				}

				setState(148);
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
		enterRule(_localctx, 26, RULE_unit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			match(T__19);
			setState(152);
			dataType();
			setState(153);
			match(ID);
			setState(167);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__20:
				{
				setState(154);
				match(T__20);
				setState(155);
				match(ID);
				setState(158);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__6) {
					{
					setState(156);
					match(T__6);
					setState(157);
					match(ID);
					}
				}

				setState(160);
				match(T__21);
				setState(163);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(161);
					match(T__1);
					setState(162);
					expression(0);
					}
				}

				}
				break;
			case T__1:
				{
				setState(165);
				match(T__1);
				setState(166);
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
		enterRule(_localctx, 28, RULE_alternativeUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			match(T__22);
			setState(170);
			match(ID);
			setState(171);
			match(T__20);
			setState(172);
			match(ID);
			setState(175);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(173);
				match(T__6);
				setState(174);
				match(ID);
				}
			}

			setState(177);
			match(T__21);
			setState(178);
			match(T__1);
			setState(179);
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
		enterRule(_localctx, 30, RULE_listDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			match(T__23);
			setState(182);
			match(T__20);
			setState(183);
			dataType();
			setState(184);
			match(T__21);
			setState(185);
			match(ID);
			setState(193);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(186);
				match(T__1);
				setState(187);
				match(T__24);
				setState(188);
				match(T__23);
				setState(189);
				match(T__20);
				setState(190);
				dataType();
				setState(191);
				match(T__21);
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
	public static class OutputExpressionContext extends ExpressionContext {
		public OutputStatementContext outputStatement() {
			return getRuleContext(OutputStatementContext.class,0);
		}
		public OutputExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
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
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				_localctx = new InputExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(196);
				match(T__3);
				setState(197);
				match(STRING);
				}
				break;
			case 2:
				{
				_localctx = new StringAssignExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(198);
				match(T__7);
				setState(199);
				match(T__2);
				setState(200);
				_la = _input.LA(1);
				if ( !(_la==ID || _la==STRING) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(201);
				match(T__6);
				setState(202);
				match(INT);
				setState(203);
				match(T__4);
				}
				break;
			case 3:
				{
				_localctx = new ParenExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(204);
				match(T__2);
				setState(205);
				expression(0);
				setState(206);
				match(T__4);
				}
				break;
			case 4:
				{
				_localctx = new OutputExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(208);
				outputStatement();
				}
				break;
			case 5:
				{
				_localctx = new IndexExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(209);
				match(ID);
				setState(210);
				match(T__20);
				setState(211);
				match(ID);
				setState(212);
				match(T__21);
				}
				break;
			case 6:
				{
				_localctx = new IdExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(213);
				match(ID);
				}
				break;
			case 7:
				{
				_localctx = new TypeConversionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(214);
				dataType();
				setState(215);
				match(T__2);
				setState(216);
				expression(0);
				setState(217);
				match(T__4);
				}
				break;
			case 8:
				{
				_localctx = new RealLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(219);
				match(REAL);
				}
				break;
			case 9:
				{
				_localctx = new IntLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(220);
				match(INT);
				}
				break;
			case 10:
				{
				_localctx = new StringLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(221);
				match(STRING);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(238);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(236);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
					case 1:
						{
						_localctx = new MulDivExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(224);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(225);
						_la = _input.LA(1);
						if ( !(_la==T__5 || _la==T__25) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(226);
						expression(13);
						}
						break;
					case 2:
						{
						_localctx = new AddSubExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(227);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(228);
						_la = _input.LA(1);
						if ( !(_la==T__18 || _la==T__26) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(229);
						expression(12);
						}
						break;
					case 3:
						{
						_localctx = new ExprListExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(230);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(231);
						match(T__6);
						setState(232);
						expression(9);
						}
						break;
					case 4:
						{
						_localctx = new AddListExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(233);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(234);
						match(T__27);
						setState(235);
						match(ID);
						}
						break;
					}
					} 
				}
				setState(240);
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

	public static class DataTypeContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(dimanaParser.ID, 0); }
		public DataTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataType; }
	}

	public final DataTypeContext dataType() throws RecognitionException {
		DataTypeContext _localctx = new DataTypeContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_dataType);
		try {
			setState(249);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__28:
				enterOuterAlt(_localctx, 1);
				{
				setState(241);
				match(T__28);
				}
				break;
			case T__29:
				enterOuterAlt(_localctx, 2);
				{
				setState(242);
				match(T__29);
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 3);
				{
				setState(243);
				match(T__7);
				}
				break;
			case T__23:
				enterOuterAlt(_localctx, 4);
				{
				setState(244);
				match(T__23);
				setState(245);
				match(T__20);
				setState(246);
				match(ID);
				setState(247);
				match(T__21);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 5);
				{
				setState(248);
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
		case 16:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 12);
		case 1:
			return precpred(_ctx, 11);
		case 2:
			return precpred(_ctx, 8);
		case 3:
			return precpred(_ctx, 7);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\'\u00fe\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\3\2\3\2\3\3\5\3+\n\3\3\3\7\3.\n\3\f\3\16\3\61\13\3\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4=\n\4\3\5\3\5\3\5\3\5\5\5C\n\5"+
		"\3\6\3\6\3\6\3\6\3\7\3\7\3\7\5\7L\n\7\3\7\5\7O\n\7\3\7\3\7\3\7\5\7T\n"+
		"\7\3\7\3\7\5\7X\n\7\3\b\3\b\3\b\3\b\7\b^\n\b\f\b\16\ba\13\b\3\t\3\t\3"+
		"\t\3\t\3\t\5\th\n\t\3\t\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13|\n\13\3\13\3\13\3\13\3\13\7\13"+
		"\u0082\n\13\f\13\16\13\u0085\13\13\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u0095\n\16\3\16\5\16\u0098\n\16\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00a1\n\17\3\17\3\17\3\17\5\17"+
		"\u00a6\n\17\3\17\3\17\5\17\u00aa\n\17\3\20\3\20\3\20\3\20\3\20\3\20\5"+
		"\20\u00b2\n\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\5\21\u00c4\n\21\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00e1\n\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u00ef\n\22\f\22\16\22\u00f2"+
		"\13\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u00fc\n\23\3\23\2"+
		"\3\"\24\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$\2\7\3\2\13\f\3\2!\""+
		"\4\2!!$$\4\2\b\b\34\34\4\2\25\25\35\35\2\u0119\2&\3\2\2\2\4/\3\2\2\2\6"+
		"<\3\2\2\2\b>\3\2\2\2\nD\3\2\2\2\fH\3\2\2\2\16Y\3\2\2\2\20b\3\2\2\2\22"+
		"m\3\2\2\2\24o\3\2\2\2\26\u0088\3\2\2\2\30\u008a\3\2\2\2\32\u008d\3\2\2"+
		"\2\34\u0099\3\2\2\2\36\u00ab\3\2\2\2 \u00b7\3\2\2\2\"\u00e0\3\2\2\2$\u00fb"+
		"\3\2\2\2&\'\5\4\3\2\'(\7\2\2\3(\3\3\2\2\2)+\5\6\4\2*)\3\2\2\2*+\3\2\2"+
		"\2+,\3\2\2\2,.\7\3\2\2-*\3\2\2\2.\61\3\2\2\2/-\3\2\2\2/\60\3\2\2\2\60"+
		"\5\3\2\2\2\61/\3\2\2\2\62=\5\f\7\2\63=\5\n\6\2\64=\5\b\5\2\65=\5\16\b"+
		"\2\66=\5\24\13\2\67=\5\30\r\28=\5\32\16\29=\5\34\17\2:=\5\36\20\2;=\5"+
		" \21\2<\62\3\2\2\2<\63\3\2\2\2<\64\3\2\2\2<\65\3\2\2\2<\66\3\2\2\2<\67"+
		"\3\2\2\2<8\3\2\2\2<9\3\2\2\2<:\3\2\2\2<;\3\2\2\2=\7\3\2\2\2>?\5$\23\2"+
		"?B\7!\2\2@A\7\4\2\2AC\5\"\22\2B@\3\2\2\2BC\3\2\2\2C\t\3\2\2\2DE\7!\2\2"+
		"EF\7\4\2\2FG\5\"\22\2G\13\3\2\2\2HI\7!\2\2IK\7\4\2\2JL\5$\23\2KJ\3\2\2"+
		"\2KL\3\2\2\2LN\3\2\2\2MO\7\5\2\2NM\3\2\2\2NO\3\2\2\2OP\3\2\2\2PQ\7\6\2"+
		"\2QS\7$\2\2RT\7\7\2\2SR\3\2\2\2ST\3\2\2\2TW\3\2\2\2UV\7\b\2\2VX\7!\2\2"+
		"WU\3\2\2\2WX\3\2\2\2X\r\3\2\2\2YZ\5\22\n\2Z_\5\20\t\2[\\\7\t\2\2\\^\5"+
		"\20\t\2][\3\2\2\2^a\3\2\2\2_]\3\2\2\2_`\3\2\2\2`\17\3\2\2\2a_\3\2\2\2"+
		"bc\7\n\2\2cg\7\5\2\2dh\7!\2\2eh\7$\2\2fh\5\"\22\2gd\3\2\2\2ge\3\2\2\2"+
		"gf\3\2\2\2hi\3\2\2\2ij\7\t\2\2jk\7\"\2\2kl\7\7\2\2l\21\3\2\2\2mn\t\2\2"+
		"\2n\23\3\2\2\2op\7\r\2\2pq\7!\2\2qr\7\4\2\2rs\t\3\2\2s{\7\16\2\2t|\7\""+
		"\2\2u|\7!\2\2vw\5\26\f\2wx\7\5\2\2xy\7!\2\2yz\7\7\2\2z|\3\2\2\2{t\3\2"+
		"\2\2{u\3\2\2\2{v\3\2\2\2|}\3\2\2\2}\u0083\7\17\2\2~\177\5\"\22\2\177\u0080"+
		"\7\3\2\2\u0080\u0082\3\2\2\2\u0081~\3\2\2\2\u0082\u0085\3\2\2\2\u0083"+
		"\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0086\3\2\2\2\u0085\u0083\3\2"+
		"\2\2\u0086\u0087\7\20\2\2\u0087\25\3\2\2\2\u0088\u0089\7\21\2\2\u0089"+
		"\27\3\2\2\2\u008a\u008b\7\22\2\2\u008b\u008c\7$\2\2\u008c\31\3\2\2\2\u008d"+
		"\u008e\7\23\2\2\u008e\u008f\5$\23\2\u008f\u0090\7!\2\2\u0090\u0097\7\4"+
		"\2\2\u0091\u0098\7\"\2\2\u0092\u0094\7\24\2\2\u0093\u0095\7\25\2\2\u0094"+
		"\u0093\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0098\7\""+
		"\2\2\u0097\u0091\3\2\2\2\u0097\u0092\3\2\2\2\u0098\33\3\2\2\2\u0099\u009a"+
		"\7\26\2\2\u009a\u009b\5$\23\2\u009b\u00a9\7!\2\2\u009c\u009d\7\27\2\2"+
		"\u009d\u00a0\7!\2\2\u009e\u009f\7\t\2\2\u009f\u00a1\7!\2\2\u00a0\u009e"+
		"\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a5\7\30\2\2"+
		"\u00a3\u00a4\7\4\2\2\u00a4\u00a6\5\"\22\2\u00a5\u00a3\3\2\2\2\u00a5\u00a6"+
		"\3\2\2\2\u00a6\u00aa\3\2\2\2\u00a7\u00a8\7\4\2\2\u00a8\u00aa\5\"\22\2"+
		"\u00a9\u009c\3\2\2\2\u00a9\u00a7\3\2\2\2\u00aa\35\3\2\2\2\u00ab\u00ac"+
		"\7\31\2\2\u00ac\u00ad\7!\2\2\u00ad\u00ae\7\27\2\2\u00ae\u00b1\7!\2\2\u00af"+
		"\u00b0\7\t\2\2\u00b0\u00b2\7!\2\2\u00b1\u00af\3\2\2\2\u00b1\u00b2\3\2"+
		"\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b4\7\30\2\2\u00b4\u00b5\7\4\2\2\u00b5"+
		"\u00b6\5\"\22\2\u00b6\37\3\2\2\2\u00b7\u00b8\7\32\2\2\u00b8\u00b9\7\27"+
		"\2\2\u00b9\u00ba\5$\23\2\u00ba\u00bb\7\30\2\2\u00bb\u00c3\7!\2\2\u00bc"+
		"\u00bd\7\4\2\2\u00bd\u00be\7\33\2\2\u00be\u00bf\7\32\2\2\u00bf\u00c0\7"+
		"\27\2\2\u00c0\u00c1\5$\23\2\u00c1\u00c2\7\30\2\2\u00c2\u00c4\3\2\2\2\u00c3"+
		"\u00bc\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4!\3\2\2\2\u00c5\u00c6\b\22\1\2"+
		"\u00c6\u00c7\7\6\2\2\u00c7\u00e1\7$\2\2\u00c8\u00c9\7\n\2\2\u00c9\u00ca"+
		"\7\5\2\2\u00ca\u00cb\t\4\2\2\u00cb\u00cc\7\t\2\2\u00cc\u00cd\7\"\2\2\u00cd"+
		"\u00e1\7\7\2\2\u00ce\u00cf\7\5\2\2\u00cf\u00d0\5\"\22\2\u00d0\u00d1\7"+
		"\7\2\2\u00d1\u00e1\3\2\2\2\u00d2\u00e1\5\16\b\2\u00d3\u00d4\7!\2\2\u00d4"+
		"\u00d5\7\27\2\2\u00d5\u00d6\7!\2\2\u00d6\u00e1\7\30\2\2\u00d7\u00e1\7"+
		"!\2\2\u00d8\u00d9\5$\23\2\u00d9\u00da\7\5\2\2\u00da\u00db\5\"\22\2\u00db"+
		"\u00dc\7\7\2\2\u00dc\u00e1\3\2\2\2\u00dd\u00e1\7#\2\2\u00de\u00e1\7\""+
		"\2\2\u00df\u00e1\7$\2\2\u00e0\u00c5\3\2\2\2\u00e0\u00c8\3\2\2\2\u00e0"+
		"\u00ce\3\2\2\2\u00e0\u00d2\3\2\2\2\u00e0\u00d3\3\2\2\2\u00e0\u00d7\3\2"+
		"\2\2\u00e0\u00d8\3\2\2\2\u00e0\u00dd\3\2\2\2\u00e0\u00de\3\2\2\2\u00e0"+
		"\u00df\3\2\2\2\u00e1\u00f0\3\2\2\2\u00e2\u00e3\f\16\2\2\u00e3\u00e4\t"+
		"\5\2\2\u00e4\u00ef\5\"\22\17\u00e5\u00e6\f\r\2\2\u00e6\u00e7\t\6\2\2\u00e7"+
		"\u00ef\5\"\22\16\u00e8\u00e9\f\n\2\2\u00e9\u00ea\7\t\2\2\u00ea\u00ef\5"+
		"\"\22\13\u00eb\u00ec\f\t\2\2\u00ec\u00ed\7\36\2\2\u00ed\u00ef\7!\2\2\u00ee"+
		"\u00e2\3\2\2\2\u00ee\u00e5\3\2\2\2\u00ee\u00e8\3\2\2\2\u00ee\u00eb\3\2"+
		"\2\2\u00ef\u00f2\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1"+
		"#\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f3\u00fc\7\37\2\2\u00f4\u00fc\7 \2\2"+
		"\u00f5\u00fc\7\n\2\2\u00f6\u00f7\7\32\2\2\u00f7\u00f8\7\27\2\2\u00f8\u00f9"+
		"\7!\2\2\u00f9\u00fc\7\30\2\2\u00fa\u00fc\7!\2\2\u00fb\u00f3\3\2\2\2\u00fb"+
		"\u00f4\3\2\2\2\u00fb\u00f5\3\2\2\2\u00fb\u00f6\3\2\2\2\u00fb\u00fa\3\2"+
		"\2\2\u00fc%\3\2\2\2\31*/<BKNSW_g{\u0083\u0094\u0097\u00a0\u00a5\u00a9"+
		"\u00b1\u00c3\u00e0\u00ee\u00f0\u00fb";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
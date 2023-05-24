// Generated from dimana.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class dimanaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

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
		RULE_listDeclaration = 15, RULE_expression = 16, RULE_dataType = 17, RULE_castTypes = 18;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statList", "statement", "variableDeclaration", "assignment", 
			"inputStatement", "outputStatement", "outputFormat", "write_expr", "loopStatement", 
			"length", "headerFile", "prefixUnit", "unit", "alternativeUnit", "listDeclaration", 
			"expression", "dataType", "castTypes"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'='", "'('", "'read'", "')'", "'*'", "','", "'string'", 
			"'write'", "'writeln'", "'for'", "'to'", "'do'", "'end'", "'length'", 
			"'use'", "'prefix'", "'1e'", "'-'", "'dimension'", "'['", "']'", "'unit'", 
			"'list'", "'new'", "'>>'", "'/'", "'+'", "'integer'", "'real'"
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

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public StatListContext statList() {
			return getRuleContext(StatListContext.class,0);
		}
		public TerminalNode EOF() { return getToken(dimanaParser.EOF, 0); }
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dimanaListener ) ((dimanaListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dimanaListener ) ((dimanaListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dimanaVisitor ) return ((dimanaVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			statList();
			setState(39);
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dimanaListener ) ((dimanaListener)listener).enterStatList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dimanaListener ) ((dimanaListener)listener).exitStatList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dimanaVisitor ) return ((dimanaVisitor<? extends T>)visitor).visitStatList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatListContext statList() throws RecognitionException {
		StatListContext _localctx = new StatListContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3784511234L) != 0)) {
				{
				{
				setState(42);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3784511232L) != 0)) {
					{
					setState(41);
					statement();
					}
				}

				setState(44);
				match(T__0);
				}
				}
				setState(49);
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dimanaListener ) ((dimanaListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dimanaListener ) ((dimanaListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dimanaVisitor ) return ((dimanaVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		try {
			setState(60);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(50);
				inputStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(51);
				assignment();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(52);
				variableDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(53);
				outputStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(54);
				loopStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(55);
				headerFile();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(56);
				prefixUnit();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(57);
				unit();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(58);
				alternativeUnit();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(59);
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dimanaListener ) ((dimanaListener)listener).enterVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dimanaListener ) ((dimanaListener)listener).exitVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dimanaVisitor ) return ((dimanaVisitor<? extends T>)visitor).visitVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_variableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			dataType();
			setState(63);
			match(ID);
			setState(66);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(64);
				match(T__1);
				setState(65);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(dimanaParser.ID, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dimanaListener ) ((dimanaListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dimanaListener ) ((dimanaListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dimanaVisitor ) return ((dimanaVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			match(ID);
			setState(69);
			match(T__1);
			setState(70);
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dimanaListener ) ((dimanaListener)listener).enterInputStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dimanaListener ) ((dimanaListener)listener).exitInputStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dimanaVisitor ) return ((dimanaVisitor<? extends T>)visitor).visitInputStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InputStatementContext inputStatement() throws RecognitionException {
		InputStatementContext _localctx = new InputStatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_inputStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			match(ID);
			setState(73);
			match(T__1);
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3774873856L) != 0)) {
				{
				setState(74);
				dataType();
				}
			}

			setState(78);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(77);
				match(T__2);
				}
			}

			setState(80);
			match(T__3);
			setState(81);
			match(STRING);
			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(82);
				match(T__4);
				}
			}

			setState(87);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(85);
				match(T__5);
				setState(86);
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dimanaListener ) ((dimanaListener)listener).enterOutputStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dimanaListener ) ((dimanaListener)listener).exitOutputStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dimanaVisitor ) return ((dimanaVisitor<? extends T>)visitor).visitOutputStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OutputStatementContext outputStatement() throws RecognitionException {
		OutputStatementContext _localctx = new OutputStatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_outputStatement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			write_expr();
			setState(90);
			outputFormat();
			setState(95);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(91);
					match(T__6);
					setState(92);
					outputFormat();
					}
					} 
				}
				setState(97);
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dimanaListener ) ((dimanaListener)listener).enterOutputFormat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dimanaListener ) ((dimanaListener)listener).exitOutputFormat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dimanaVisitor ) return ((dimanaVisitor<? extends T>)visitor).visitOutputFormat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OutputFormatContext outputFormat() throws RecognitionException {
		OutputFormatContext _localctx = new OutputFormatContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_outputFormat);
		try {
			setState(112);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(98);
				match(T__7);
				setState(99);
				match(T__2);
				setState(103);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(100);
					match(ID);
					}
					break;
				case 2:
					{
					setState(101);
					match(STRING);
					}
					break;
				case 3:
					{
					setState(102);
					expression(0);
					}
					break;
				}
				setState(105);
				match(T__6);
				setState(106);
				match(INT);
				setState(107);
				match(T__4);
				}
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(108);
				match(STRING);
				setState(109);
				match(T__6);
				setState(110);
				match(ID);
				}
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(111);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Write_exprContext extends ParserRuleContext {
		public Write_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_write_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dimanaListener ) ((dimanaListener)listener).enterWrite_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dimanaListener ) ((dimanaListener)listener).exitWrite_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dimanaVisitor ) return ((dimanaVisitor<? extends T>)visitor).visitWrite_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Write_exprContext write_expr() throws RecognitionException {
		Write_exprContext _localctx = new Write_exprContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_write_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dimanaListener ) ((dimanaListener)listener).enterLoopStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dimanaListener ) ((dimanaListener)listener).exitLoopStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dimanaVisitor ) return ((dimanaVisitor<? extends T>)visitor).visitLoopStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopStatementContext loopStatement() throws RecognitionException {
		LoopStatementContext _localctx = new LoopStatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_loopStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			match(T__10);
			setState(117);
			match(ID);
			setState(118);
			match(T__1);
			setState(119);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==INT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(120);
			match(T__11);
			setState(128);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				{
				setState(121);
				match(INT);
				}
				break;
			case ID:
				{
				setState(122);
				match(ID);
				}
				break;
			case T__14:
				{
				setState(123);
				length();
				setState(124);
				match(T__2);
				setState(125);
				match(ID);
				setState(126);
				match(T__4);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(130);
			match(T__12);
			{
			setState(136);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 33839646488L) != 0)) {
				{
				{
				setState(131);
				expression(0);
				setState(132);
				match(T__0);
				}
				}
				setState(138);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			setState(139);
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

	@SuppressWarnings("CheckReturnValue")
	public static class LengthContext extends ParserRuleContext {
		public LengthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_length; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dimanaListener ) ((dimanaListener)listener).enterLength(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dimanaListener ) ((dimanaListener)listener).exitLength(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dimanaVisitor ) return ((dimanaVisitor<? extends T>)visitor).visitLength(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LengthContext length() throws RecognitionException {
		LengthContext _localctx = new LengthContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_length);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
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

	@SuppressWarnings("CheckReturnValue")
	public static class HeaderFileContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(dimanaParser.STRING, 0); }
		public HeaderFileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_headerFile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dimanaListener ) ((dimanaListener)listener).enterHeaderFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dimanaListener ) ((dimanaListener)listener).exitHeaderFile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dimanaVisitor ) return ((dimanaVisitor<? extends T>)visitor).visitHeaderFile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HeaderFileContext headerFile() throws RecognitionException {
		HeaderFileContext _localctx = new HeaderFileContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_headerFile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			match(T__15);
			setState(144);
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dimanaListener ) ((dimanaListener)listener).enterPrefixUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dimanaListener ) ((dimanaListener)listener).exitPrefixUnit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dimanaVisitor ) return ((dimanaVisitor<? extends T>)visitor).visitPrefixUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrefixUnitContext prefixUnit() throws RecognitionException {
		PrefixUnitContext _localctx = new PrefixUnitContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_prefixUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			match(T__16);
			setState(147);
			dataType();
			setState(148);
			match(ID);
			setState(149);
			match(T__1);
			setState(156);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				{
				setState(150);
				match(INT);
				}
				break;
			case T__17:
				{
				setState(151);
				match(T__17);
				setState(153);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__18) {
					{
					setState(152);
					((PrefixUnitContext)_localctx).minus = match(T__18);
					}
				}

				setState(155);
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

	@SuppressWarnings("CheckReturnValue")
	public static class UnitContext extends ParserRuleContext {
		public UnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unit; }
	 
		public UnitContext() { }
		public void copyFrom(UnitContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IndependentUnitContext extends UnitContext {
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(dimanaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(dimanaParser.ID, i);
		}
		public IndependentUnitContext(UnitContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dimanaListener ) ((dimanaListener)listener).enterIndependentUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dimanaListener ) ((dimanaListener)listener).exitIndependentUnit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dimanaVisitor ) return ((dimanaVisitor<? extends T>)visitor).visitIndependentUnit(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DependantUnitContext extends UnitContext {
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
		public DependantUnitContext(UnitContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dimanaListener ) ((dimanaListener)listener).enterDependantUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dimanaListener ) ((dimanaListener)listener).exitDependantUnit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dimanaVisitor ) return ((dimanaVisitor<? extends T>)visitor).visitDependantUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnitContext unit() throws RecognitionException {
		UnitContext _localctx = new UnitContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_unit);
		int _la;
		try {
			setState(183);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				_localctx = new IndependentUnitContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(158);
				match(T__19);
				setState(159);
				dataType();
				setState(160);
				match(ID);
				{
				setState(161);
				match(T__20);
				setState(162);
				match(ID);
				setState(165);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__6) {
					{
					setState(163);
					match(T__6);
					setState(164);
					match(ID);
					}
				}

				setState(167);
				match(T__21);
				}
				}
				break;
			case 2:
				_localctx = new DependantUnitContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(169);
				match(T__19);
				setState(170);
				dataType();
				setState(171);
				match(ID);
				{
				setState(178);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__20) {
					{
					setState(172);
					match(T__20);
					setState(173);
					match(ID);
					{
					setState(174);
					match(T__6);
					setState(175);
					match(ID);
					}
					setState(177);
					match(T__21);
					}
				}

				setState(180);
				match(T__1);
				setState(181);
				expression(0);
				}
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dimanaListener ) ((dimanaListener)listener).enterAlternativeUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dimanaListener ) ((dimanaListener)listener).exitAlternativeUnit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dimanaVisitor ) return ((dimanaVisitor<? extends T>)visitor).visitAlternativeUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlternativeUnitContext alternativeUnit() throws RecognitionException {
		AlternativeUnitContext _localctx = new AlternativeUnitContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_alternativeUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			match(T__22);
			setState(186);
			match(ID);
			setState(187);
			match(T__20);
			setState(188);
			match(ID);
			setState(191);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(189);
				match(T__6);
				setState(190);
				match(ID);
				}
			}

			setState(193);
			match(T__21);
			setState(194);
			match(T__1);
			setState(195);
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dimanaListener ) ((dimanaListener)listener).enterListDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dimanaListener ) ((dimanaListener)listener).exitListDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dimanaVisitor ) return ((dimanaVisitor<? extends T>)visitor).visitListDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListDeclarationContext listDeclaration() throws RecognitionException {
		ListDeclarationContext _localctx = new ListDeclarationContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_listDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			match(T__23);
			setState(198);
			match(T__20);
			setState(199);
			dataType();
			setState(200);
			match(T__21);
			setState(201);
			match(ID);
			setState(209);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(202);
				match(T__1);
				setState(203);
				match(T__24);
				setState(204);
				match(T__23);
				setState(205);
				match(T__20);
				setState(206);
				dataType();
				setState(207);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public String varName;
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
			this.varName = ctx.varName;
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprListExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExprListExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dimanaListener ) ((dimanaListener)listener).enterExprListExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dimanaListener ) ((dimanaListener)listener).exitExprListExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dimanaVisitor ) return ((dimanaVisitor<? extends T>)visitor).visitExprListExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OutputExpressionContext extends ExpressionContext {
		public OutputStatementContext outputStatement() {
			return getRuleContext(OutputStatementContext.class,0);
		}
		public OutputExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dimanaListener ) ((dimanaListener)listener).enterOutputExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dimanaListener ) ((dimanaListener)listener).exitOutputExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dimanaVisitor ) return ((dimanaVisitor<? extends T>)visitor).visitOutputExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IndexExpressionContext extends ExpressionContext {
		public List<TerminalNode> ID() { return getTokens(dimanaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(dimanaParser.ID, i);
		}
		public IndexExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dimanaListener ) ((dimanaListener)listener).enterIndexExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dimanaListener ) ((dimanaListener)listener).exitIndexExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dimanaVisitor ) return ((dimanaVisitor<? extends T>)visitor).visitIndexExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InputExpressionContext extends ExpressionContext {
		public TerminalNode STRING() { return getToken(dimanaParser.STRING, 0); }
		public InputExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dimanaListener ) ((dimanaListener)listener).enterInputExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dimanaListener ) ((dimanaListener)listener).exitInputExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dimanaVisitor ) return ((dimanaVisitor<? extends T>)visitor).visitInputExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AddSubExpressionContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public AddSubExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dimanaListener ) ((dimanaListener)listener).enterAddSubExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dimanaListener ) ((dimanaListener)listener).exitAddSubExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dimanaVisitor ) return ((dimanaVisitor<? extends T>)visitor).visitAddSubExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RealLiteralContext extends ExpressionContext {
		public TerminalNode REAL() { return getToken(dimanaParser.REAL, 0); }
		public RealLiteralContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dimanaListener ) ((dimanaListener)listener).enterRealLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dimanaListener ) ((dimanaListener)listener).exitRealLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dimanaVisitor ) return ((dimanaVisitor<? extends T>)visitor).visitRealLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StringAssignExpressionContext extends ExpressionContext {
		public TerminalNode INT() { return getToken(dimanaParser.INT, 0); }
		public TerminalNode STRING() { return getToken(dimanaParser.STRING, 0); }
		public TerminalNode ID() { return getToken(dimanaParser.ID, 0); }
		public StringAssignExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dimanaListener ) ((dimanaListener)listener).enterStringAssignExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dimanaListener ) ((dimanaListener)listener).exitStringAssignExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dimanaVisitor ) return ((dimanaVisitor<? extends T>)visitor).visitStringAssignExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TypeConversionContext extends ExpressionContext {
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TypeConversionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dimanaListener ) ((dimanaListener)listener).enterTypeConversion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dimanaListener ) ((dimanaListener)listener).exitTypeConversion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dimanaVisitor ) return ((dimanaVisitor<? extends T>)visitor).visitTypeConversion(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StringLiteralContext extends ExpressionContext {
		public TerminalNode STRING() { return getToken(dimanaParser.STRING, 0); }
		public StringLiteralContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dimanaListener ) ((dimanaListener)listener).enterStringLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dimanaListener ) ((dimanaListener)listener).exitStringLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dimanaVisitor ) return ((dimanaVisitor<? extends T>)visitor).visitStringLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdExpressionContext extends ExpressionContext {
		public TerminalNode ID() { return getToken(dimanaParser.ID, 0); }
		public IdExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dimanaListener ) ((dimanaListener)listener).enterIdExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dimanaListener ) ((dimanaListener)listener).exitIdExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dimanaVisitor ) return ((dimanaVisitor<? extends T>)visitor).visitIdExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParenExpressionContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParenExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dimanaListener ) ((dimanaListener)listener).enterParenExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dimanaListener ) ((dimanaListener)listener).exitParenExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dimanaVisitor ) return ((dimanaVisitor<? extends T>)visitor).visitParenExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IntLiteralContext extends ExpressionContext {
		public TerminalNode INT() { return getToken(dimanaParser.INT, 0); }
		public IntLiteralContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dimanaListener ) ((dimanaListener)listener).enterIntLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dimanaListener ) ((dimanaListener)listener).exitIntLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dimanaVisitor ) return ((dimanaVisitor<? extends T>)visitor).visitIntLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InputTypeExpressionContext extends ExpressionContext {
		public TerminalNode STRING() { return getToken(dimanaParser.STRING, 0); }
		public List<TerminalNode> ID() { return getTokens(dimanaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(dimanaParser.ID, i);
		}
		public CastTypesContext castTypes() {
			return getRuleContext(CastTypesContext.class,0);
		}
		public InputTypeExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dimanaListener ) ((dimanaListener)listener).enterInputTypeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dimanaListener ) ((dimanaListener)listener).exitInputTypeExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dimanaVisitor ) return ((dimanaVisitor<? extends T>)visitor).visitInputTypeExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MulDivExpressionContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public MulDivExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dimanaListener ) ((dimanaListener)listener).enterMulDivExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dimanaListener ) ((dimanaListener)listener).exitMulDivExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dimanaVisitor ) return ((dimanaVisitor<? extends T>)visitor).visitMulDivExpression(this);
			else return visitor.visitChildren(this);
		}
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
			setState(255);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				_localctx = new InputExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(212);
				match(T__3);
				setState(213);
				match(STRING);
				}
				break;
			case 2:
				{
				_localctx = new InputTypeExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(215);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__28 || _la==T__29) {
					{
					setState(214);
					castTypes();
					}
				}

				setState(218);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__2) {
					{
					setState(217);
					match(T__2);
					}
				}

				setState(220);
				match(T__3);
				setState(221);
				match(STRING);
				setState(223);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__4) {
					{
					setState(222);
					match(T__4);
					}
				}

				setState(227);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__5) {
					{
					setState(225);
					match(T__5);
					setState(226);
					match(ID);
					}
				}

				setState(229);
				match(T__25);
				setState(230);
				match(ID);
				}
				break;
			case 3:
				{
				_localctx = new StringAssignExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(231);
				match(T__7);
				setState(232);
				match(T__2);
				setState(233);
				_la = _input.LA(1);
				if ( !(_la==ID || _la==STRING) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(234);
				match(T__6);
				setState(235);
				match(INT);
				setState(236);
				match(T__4);
				}
				break;
			case 4:
				{
				_localctx = new ParenExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(237);
				match(T__2);
				setState(238);
				expression(0);
				setState(239);
				match(T__4);
				}
				break;
			case 5:
				{
				_localctx = new OutputExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(241);
				outputStatement();
				}
				break;
			case 6:
				{
				_localctx = new IndexExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(242);
				match(ID);
				setState(243);
				match(T__20);
				setState(244);
				match(ID);
				setState(245);
				match(T__21);
				}
				break;
			case 7:
				{
				_localctx = new IdExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(246);
				match(ID);
				}
				break;
			case 8:
				{
				_localctx = new TypeConversionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(247);
				dataType();
				setState(248);
				match(T__2);
				setState(249);
				expression(0);
				setState(250);
				match(T__4);
				}
				break;
			case 9:
				{
				_localctx = new RealLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(252);
				match(REAL);
				}
				break;
			case 10:
				{
				_localctx = new IntLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(253);
				match(INT);
				}
				break;
			case 11:
				{
				_localctx = new StringLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(254);
				match(STRING);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(268);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(266);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
					case 1:
						{
						_localctx = new MulDivExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(257);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(258);
						((MulDivExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__5 || _la==T__26) ) {
							((MulDivExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(259);
						expression(12);
						}
						break;
					case 2:
						{
						_localctx = new AddSubExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(260);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(261);
						((AddSubExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__18 || _la==T__27) ) {
							((AddSubExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(262);
						expression(11);
						}
						break;
					case 3:
						{
						_localctx = new ExprListExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(263);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(264);
						match(T__6);
						setState(265);
						expression(8);
						}
						break;
					}
					} 
				}
				setState(270);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DataTypeContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(dimanaParser.ID, 0); }
		public DataTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dimanaListener ) ((dimanaListener)listener).enterDataType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dimanaListener ) ((dimanaListener)listener).exitDataType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dimanaVisitor ) return ((dimanaVisitor<? extends T>)visitor).visitDataType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataTypeContext dataType() throws RecognitionException {
		DataTypeContext _localctx = new DataTypeContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_dataType);
		try {
			setState(279);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__28:
				enterOuterAlt(_localctx, 1);
				{
				setState(271);
				match(T__28);
				}
				break;
			case T__29:
				enterOuterAlt(_localctx, 2);
				{
				setState(272);
				match(T__29);
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 3);
				{
				setState(273);
				match(T__7);
				}
				break;
			case T__23:
				enterOuterAlt(_localctx, 4);
				{
				setState(274);
				match(T__23);
				setState(275);
				match(T__20);
				setState(276);
				match(ID);
				setState(277);
				match(T__21);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 5);
				{
				setState(278);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CastTypesContext extends ParserRuleContext {
		public CastTypesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_castTypes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dimanaListener ) ((dimanaListener)listener).enterCastTypes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dimanaListener ) ((dimanaListener)listener).exitCastTypes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dimanaVisitor ) return ((dimanaVisitor<? extends T>)visitor).visitCastTypes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CastTypesContext castTypes() throws RecognitionException {
		CastTypesContext _localctx = new CastTypesContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_castTypes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			_la = _input.LA(1);
			if ( !(_la==T__28 || _la==T__29) ) {
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
			return precpred(_ctx, 11);
		case 1:
			return precpred(_ctx, 10);
		case 2:
			return precpred(_ctx, 7);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001%\u011c\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0003\u0001+\b\u0001"+
		"\u0001\u0001\u0005\u0001.\b\u0001\n\u0001\f\u00011\t\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002=\b\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003C\b\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0003\u0005L\b\u0005\u0001\u0005\u0003\u0005O\b\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0003\u0005T\b\u0005\u0001\u0005\u0001\u0005\u0003"+
		"\u0005X\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005"+
		"\u0006^\b\u0006\n\u0006\f\u0006a\t\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0003\u0007h\b\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003"+
		"\u0007q\b\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u0081"+
		"\b\t\u0001\t\u0001\t\u0001\t\u0001\t\u0005\t\u0087\b\t\n\t\f\t\u008a\t"+
		"\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u009a"+
		"\b\f\u0001\f\u0003\f\u009d\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r"+
		"\u0001\r\u0001\r\u0003\r\u00a6\b\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u00b3\b\r\u0001"+
		"\r\u0001\r\u0001\r\u0003\r\u00b8\b\r\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u00c0\b\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u00d2\b\u000f\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u00d8\b\u0010\u0001\u0010"+
		"\u0003\u0010\u00db\b\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010"+
		"\u00e0\b\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u00e4\b\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0003\u0010\u0100\b\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0005\u0010\u010b\b\u0010\n\u0010\f\u0010\u010e\t\u0010\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0003\u0011\u0118\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0000\u0001 \u0013\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014"+
		"\u0016\u0018\u001a\u001c\u001e \"$\u0000\u0006\u0001\u0000\t\n\u0001\u0000"+
		"\u001f \u0002\u0000\u001f\u001f\"\"\u0002\u0000\u0006\u0006\u001b\u001b"+
		"\u0002\u0000\u0013\u0013\u001c\u001c\u0001\u0000\u001d\u001e\u013c\u0000"+
		"&\u0001\u0000\u0000\u0000\u0002/\u0001\u0000\u0000\u0000\u0004<\u0001"+
		"\u0000\u0000\u0000\u0006>\u0001\u0000\u0000\u0000\bD\u0001\u0000\u0000"+
		"\u0000\nH\u0001\u0000\u0000\u0000\fY\u0001\u0000\u0000\u0000\u000ep\u0001"+
		"\u0000\u0000\u0000\u0010r\u0001\u0000\u0000\u0000\u0012t\u0001\u0000\u0000"+
		"\u0000\u0014\u008d\u0001\u0000\u0000\u0000\u0016\u008f\u0001\u0000\u0000"+
		"\u0000\u0018\u0092\u0001\u0000\u0000\u0000\u001a\u00b7\u0001\u0000\u0000"+
		"\u0000\u001c\u00b9\u0001\u0000\u0000\u0000\u001e\u00c5\u0001\u0000\u0000"+
		"\u0000 \u00ff\u0001\u0000\u0000\u0000\"\u0117\u0001\u0000\u0000\u0000"+
		"$\u0119\u0001\u0000\u0000\u0000&\'\u0003\u0002\u0001\u0000\'(\u0005\u0000"+
		"\u0000\u0001(\u0001\u0001\u0000\u0000\u0000)+\u0003\u0004\u0002\u0000"+
		"*)\u0001\u0000\u0000\u0000*+\u0001\u0000\u0000\u0000+,\u0001\u0000\u0000"+
		"\u0000,.\u0005\u0001\u0000\u0000-*\u0001\u0000\u0000\u0000.1\u0001\u0000"+
		"\u0000\u0000/-\u0001\u0000\u0000\u0000/0\u0001\u0000\u0000\u00000\u0003"+
		"\u0001\u0000\u0000\u00001/\u0001\u0000\u0000\u00002=\u0003\n\u0005\u0000"+
		"3=\u0003\b\u0004\u00004=\u0003\u0006\u0003\u00005=\u0003\f\u0006\u0000"+
		"6=\u0003\u0012\t\u00007=\u0003\u0016\u000b\u00008=\u0003\u0018\f\u0000"+
		"9=\u0003\u001a\r\u0000:=\u0003\u001c\u000e\u0000;=\u0003\u001e\u000f\u0000"+
		"<2\u0001\u0000\u0000\u0000<3\u0001\u0000\u0000\u0000<4\u0001\u0000\u0000"+
		"\u0000<5\u0001\u0000\u0000\u0000<6\u0001\u0000\u0000\u0000<7\u0001\u0000"+
		"\u0000\u0000<8\u0001\u0000\u0000\u0000<9\u0001\u0000\u0000\u0000<:\u0001"+
		"\u0000\u0000\u0000<;\u0001\u0000\u0000\u0000=\u0005\u0001\u0000\u0000"+
		"\u0000>?\u0003\"\u0011\u0000?B\u0005\u001f\u0000\u0000@A\u0005\u0002\u0000"+
		"\u0000AC\u0003 \u0010\u0000B@\u0001\u0000\u0000\u0000BC\u0001\u0000\u0000"+
		"\u0000C\u0007\u0001\u0000\u0000\u0000DE\u0005\u001f\u0000\u0000EF\u0005"+
		"\u0002\u0000\u0000FG\u0003 \u0010\u0000G\t\u0001\u0000\u0000\u0000HI\u0005"+
		"\u001f\u0000\u0000IK\u0005\u0002\u0000\u0000JL\u0003\"\u0011\u0000KJ\u0001"+
		"\u0000\u0000\u0000KL\u0001\u0000\u0000\u0000LN\u0001\u0000\u0000\u0000"+
		"MO\u0005\u0003\u0000\u0000NM\u0001\u0000\u0000\u0000NO\u0001\u0000\u0000"+
		"\u0000OP\u0001\u0000\u0000\u0000PQ\u0005\u0004\u0000\u0000QS\u0005\"\u0000"+
		"\u0000RT\u0005\u0005\u0000\u0000SR\u0001\u0000\u0000\u0000ST\u0001\u0000"+
		"\u0000\u0000TW\u0001\u0000\u0000\u0000UV\u0005\u0006\u0000\u0000VX\u0005"+
		"\u001f\u0000\u0000WU\u0001\u0000\u0000\u0000WX\u0001\u0000\u0000\u0000"+
		"X\u000b\u0001\u0000\u0000\u0000YZ\u0003\u0010\b\u0000Z_\u0003\u000e\u0007"+
		"\u0000[\\\u0005\u0007\u0000\u0000\\^\u0003\u000e\u0007\u0000][\u0001\u0000"+
		"\u0000\u0000^a\u0001\u0000\u0000\u0000_]\u0001\u0000\u0000\u0000_`\u0001"+
		"\u0000\u0000\u0000`\r\u0001\u0000\u0000\u0000a_\u0001\u0000\u0000\u0000"+
		"bc\u0005\b\u0000\u0000cg\u0005\u0003\u0000\u0000dh\u0005\u001f\u0000\u0000"+
		"eh\u0005\"\u0000\u0000fh\u0003 \u0010\u0000gd\u0001\u0000\u0000\u0000"+
		"ge\u0001\u0000\u0000\u0000gf\u0001\u0000\u0000\u0000hi\u0001\u0000\u0000"+
		"\u0000ij\u0005\u0007\u0000\u0000jk\u0005 \u0000\u0000kq\u0005\u0005\u0000"+
		"\u0000lm\u0005\"\u0000\u0000mn\u0005\u0007\u0000\u0000nq\u0005\u001f\u0000"+
		"\u0000oq\u0005\u001f\u0000\u0000pb\u0001\u0000\u0000\u0000pl\u0001\u0000"+
		"\u0000\u0000po\u0001\u0000\u0000\u0000q\u000f\u0001\u0000\u0000\u0000"+
		"rs\u0007\u0000\u0000\u0000s\u0011\u0001\u0000\u0000\u0000tu\u0005\u000b"+
		"\u0000\u0000uv\u0005\u001f\u0000\u0000vw\u0005\u0002\u0000\u0000wx\u0007"+
		"\u0001\u0000\u0000x\u0080\u0005\f\u0000\u0000y\u0081\u0005 \u0000\u0000"+
		"z\u0081\u0005\u001f\u0000\u0000{|\u0003\u0014\n\u0000|}\u0005\u0003\u0000"+
		"\u0000}~\u0005\u001f\u0000\u0000~\u007f\u0005\u0005\u0000\u0000\u007f"+
		"\u0081\u0001\u0000\u0000\u0000\u0080y\u0001\u0000\u0000\u0000\u0080z\u0001"+
		"\u0000\u0000\u0000\u0080{\u0001\u0000\u0000\u0000\u0081\u0082\u0001\u0000"+
		"\u0000\u0000\u0082\u0088\u0005\r\u0000\u0000\u0083\u0084\u0003 \u0010"+
		"\u0000\u0084\u0085\u0005\u0001\u0000\u0000\u0085\u0087\u0001\u0000\u0000"+
		"\u0000\u0086\u0083\u0001\u0000\u0000\u0000\u0087\u008a\u0001\u0000\u0000"+
		"\u0000\u0088\u0086\u0001\u0000\u0000\u0000\u0088\u0089\u0001\u0000\u0000"+
		"\u0000\u0089\u008b\u0001\u0000\u0000\u0000\u008a\u0088\u0001\u0000\u0000"+
		"\u0000\u008b\u008c\u0005\u000e\u0000\u0000\u008c\u0013\u0001\u0000\u0000"+
		"\u0000\u008d\u008e\u0005\u000f\u0000\u0000\u008e\u0015\u0001\u0000\u0000"+
		"\u0000\u008f\u0090\u0005\u0010\u0000\u0000\u0090\u0091\u0005\"\u0000\u0000"+
		"\u0091\u0017\u0001\u0000\u0000\u0000\u0092\u0093\u0005\u0011\u0000\u0000"+
		"\u0093\u0094\u0003\"\u0011\u0000\u0094\u0095\u0005\u001f\u0000\u0000\u0095"+
		"\u009c\u0005\u0002\u0000\u0000\u0096\u009d\u0005 \u0000\u0000\u0097\u0099"+
		"\u0005\u0012\u0000\u0000\u0098\u009a\u0005\u0013\u0000\u0000\u0099\u0098"+
		"\u0001\u0000\u0000\u0000\u0099\u009a\u0001\u0000\u0000\u0000\u009a\u009b"+
		"\u0001\u0000\u0000\u0000\u009b\u009d\u0005 \u0000\u0000\u009c\u0096\u0001"+
		"\u0000\u0000\u0000\u009c\u0097\u0001\u0000\u0000\u0000\u009d\u0019\u0001"+
		"\u0000\u0000\u0000\u009e\u009f\u0005\u0014\u0000\u0000\u009f\u00a0\u0003"+
		"\"\u0011\u0000\u00a0\u00a1\u0005\u001f\u0000\u0000\u00a1\u00a2\u0005\u0015"+
		"\u0000\u0000\u00a2\u00a5\u0005\u001f\u0000\u0000\u00a3\u00a4\u0005\u0007"+
		"\u0000\u0000\u00a4\u00a6\u0005\u001f\u0000\u0000\u00a5\u00a3\u0001\u0000"+
		"\u0000\u0000\u00a5\u00a6\u0001\u0000\u0000\u0000\u00a6\u00a7\u0001\u0000"+
		"\u0000\u0000\u00a7\u00a8\u0005\u0016\u0000\u0000\u00a8\u00b8\u0001\u0000"+
		"\u0000\u0000\u00a9\u00aa\u0005\u0014\u0000\u0000\u00aa\u00ab\u0003\"\u0011"+
		"\u0000\u00ab\u00b2\u0005\u001f\u0000\u0000\u00ac\u00ad\u0005\u0015\u0000"+
		"\u0000\u00ad\u00ae\u0005\u001f\u0000\u0000\u00ae\u00af\u0005\u0007\u0000"+
		"\u0000\u00af\u00b0\u0005\u001f\u0000\u0000\u00b0\u00b1\u0001\u0000\u0000"+
		"\u0000\u00b1\u00b3\u0005\u0016\u0000\u0000\u00b2\u00ac\u0001\u0000\u0000"+
		"\u0000\u00b2\u00b3\u0001\u0000\u0000\u0000\u00b3\u00b4\u0001\u0000\u0000"+
		"\u0000\u00b4\u00b5\u0005\u0002\u0000\u0000\u00b5\u00b6\u0003 \u0010\u0000"+
		"\u00b6\u00b8\u0001\u0000\u0000\u0000\u00b7\u009e\u0001\u0000\u0000\u0000"+
		"\u00b7\u00a9\u0001\u0000\u0000\u0000\u00b8\u001b\u0001\u0000\u0000\u0000"+
		"\u00b9\u00ba\u0005\u0017\u0000\u0000\u00ba\u00bb\u0005\u001f\u0000\u0000"+
		"\u00bb\u00bc\u0005\u0015\u0000\u0000\u00bc\u00bf\u0005\u001f\u0000\u0000"+
		"\u00bd\u00be\u0005\u0007\u0000\u0000\u00be\u00c0\u0005\u001f\u0000\u0000"+
		"\u00bf\u00bd\u0001\u0000\u0000\u0000\u00bf\u00c0\u0001\u0000\u0000\u0000"+
		"\u00c0\u00c1\u0001\u0000\u0000\u0000\u00c1\u00c2\u0005\u0016\u0000\u0000"+
		"\u00c2\u00c3\u0005\u0002\u0000\u0000\u00c3\u00c4\u0003 \u0010\u0000\u00c4"+
		"\u001d\u0001\u0000\u0000\u0000\u00c5\u00c6\u0005\u0018\u0000\u0000\u00c6"+
		"\u00c7\u0005\u0015\u0000\u0000\u00c7\u00c8\u0003\"\u0011\u0000\u00c8\u00c9"+
		"\u0005\u0016\u0000\u0000\u00c9\u00d1\u0005\u001f\u0000\u0000\u00ca\u00cb"+
		"\u0005\u0002\u0000\u0000\u00cb\u00cc\u0005\u0019\u0000\u0000\u00cc\u00cd"+
		"\u0005\u0018\u0000\u0000\u00cd\u00ce\u0005\u0015\u0000\u0000\u00ce\u00cf"+
		"\u0003\"\u0011\u0000\u00cf\u00d0\u0005\u0016\u0000\u0000\u00d0\u00d2\u0001"+
		"\u0000\u0000\u0000\u00d1\u00ca\u0001\u0000\u0000\u0000\u00d1\u00d2\u0001"+
		"\u0000\u0000\u0000\u00d2\u001f\u0001\u0000\u0000\u0000\u00d3\u00d4\u0006"+
		"\u0010\uffff\uffff\u0000\u00d4\u00d5\u0005\u0004\u0000\u0000\u00d5\u0100"+
		"\u0005\"\u0000\u0000\u00d6\u00d8\u0003$\u0012\u0000\u00d7\u00d6\u0001"+
		"\u0000\u0000\u0000\u00d7\u00d8\u0001\u0000\u0000\u0000\u00d8\u00da\u0001"+
		"\u0000\u0000\u0000\u00d9\u00db\u0005\u0003\u0000\u0000\u00da\u00d9\u0001"+
		"\u0000\u0000\u0000\u00da\u00db\u0001\u0000\u0000\u0000\u00db\u00dc\u0001"+
		"\u0000\u0000\u0000\u00dc\u00dd\u0005\u0004\u0000\u0000\u00dd\u00df\u0005"+
		"\"\u0000\u0000\u00de\u00e0\u0005\u0005\u0000\u0000\u00df\u00de\u0001\u0000"+
		"\u0000\u0000\u00df\u00e0\u0001\u0000\u0000\u0000\u00e0\u00e3\u0001\u0000"+
		"\u0000\u0000\u00e1\u00e2\u0005\u0006\u0000\u0000\u00e2\u00e4\u0005\u001f"+
		"\u0000\u0000\u00e3\u00e1\u0001\u0000\u0000\u0000\u00e3\u00e4\u0001\u0000"+
		"\u0000\u0000\u00e4\u00e5\u0001\u0000\u0000\u0000\u00e5\u00e6\u0005\u001a"+
		"\u0000\u0000\u00e6\u0100\u0005\u001f\u0000\u0000\u00e7\u00e8\u0005\b\u0000"+
		"\u0000\u00e8\u00e9\u0005\u0003\u0000\u0000\u00e9\u00ea\u0007\u0002\u0000"+
		"\u0000\u00ea\u00eb\u0005\u0007\u0000\u0000\u00eb\u00ec\u0005 \u0000\u0000"+
		"\u00ec\u0100\u0005\u0005\u0000\u0000\u00ed\u00ee\u0005\u0003\u0000\u0000"+
		"\u00ee\u00ef\u0003 \u0010\u0000\u00ef\u00f0\u0005\u0005\u0000\u0000\u00f0"+
		"\u0100\u0001\u0000\u0000\u0000\u00f1\u0100\u0003\f\u0006\u0000\u00f2\u00f3"+
		"\u0005\u001f\u0000\u0000\u00f3\u00f4\u0005\u0015\u0000\u0000\u00f4\u00f5"+
		"\u0005\u001f\u0000\u0000\u00f5\u0100\u0005\u0016\u0000\u0000\u00f6\u0100"+
		"\u0005\u001f\u0000\u0000\u00f7\u00f8\u0003\"\u0011\u0000\u00f8\u00f9\u0005"+
		"\u0003\u0000\u0000\u00f9\u00fa\u0003 \u0010\u0000\u00fa\u00fb\u0005\u0005"+
		"\u0000\u0000\u00fb\u0100\u0001\u0000\u0000\u0000\u00fc\u0100\u0005!\u0000"+
		"\u0000\u00fd\u0100\u0005 \u0000\u0000\u00fe\u0100\u0005\"\u0000\u0000"+
		"\u00ff\u00d3\u0001\u0000\u0000\u0000\u00ff\u00d7\u0001\u0000\u0000\u0000"+
		"\u00ff\u00e7\u0001\u0000\u0000\u0000\u00ff\u00ed\u0001\u0000\u0000\u0000"+
		"\u00ff\u00f1\u0001\u0000\u0000\u0000\u00ff\u00f2\u0001\u0000\u0000\u0000"+
		"\u00ff\u00f6\u0001\u0000\u0000\u0000\u00ff\u00f7\u0001\u0000\u0000\u0000"+
		"\u00ff\u00fc\u0001\u0000\u0000\u0000\u00ff\u00fd\u0001\u0000\u0000\u0000"+
		"\u00ff\u00fe\u0001\u0000\u0000\u0000\u0100\u010c\u0001\u0000\u0000\u0000"+
		"\u0101\u0102\n\u000b\u0000\u0000\u0102\u0103\u0007\u0003\u0000\u0000\u0103"+
		"\u010b\u0003 \u0010\f\u0104\u0105\n\n\u0000\u0000\u0105\u0106\u0007\u0004"+
		"\u0000\u0000\u0106\u010b\u0003 \u0010\u000b\u0107\u0108\n\u0007\u0000"+
		"\u0000\u0108\u0109\u0005\u0007\u0000\u0000\u0109\u010b\u0003 \u0010\b"+
		"\u010a\u0101\u0001\u0000\u0000\u0000\u010a\u0104\u0001\u0000\u0000\u0000"+
		"\u010a\u0107\u0001\u0000\u0000\u0000\u010b\u010e\u0001\u0000\u0000\u0000"+
		"\u010c\u010a\u0001\u0000\u0000\u0000\u010c\u010d\u0001\u0000\u0000\u0000"+
		"\u010d!\u0001\u0000\u0000\u0000\u010e\u010c\u0001\u0000\u0000\u0000\u010f"+
		"\u0118\u0005\u001d\u0000\u0000\u0110\u0118\u0005\u001e\u0000\u0000\u0111"+
		"\u0118\u0005\b\u0000\u0000\u0112\u0113\u0005\u0018\u0000\u0000\u0113\u0114"+
		"\u0005\u0015\u0000\u0000\u0114\u0115\u0005\u001f\u0000\u0000\u0115\u0118"+
		"\u0005\u0016\u0000\u0000\u0116\u0118\u0005\u001f\u0000\u0000\u0117\u010f"+
		"\u0001\u0000\u0000\u0000\u0117\u0110\u0001\u0000\u0000\u0000\u0117\u0111"+
		"\u0001\u0000\u0000\u0000\u0117\u0112\u0001\u0000\u0000\u0000\u0117\u0116"+
		"\u0001\u0000\u0000\u0000\u0118#\u0001\u0000\u0000\u0000\u0119\u011a\u0007"+
		"\u0005\u0000\u0000\u011a%\u0001\u0000\u0000\u0000\u001c*/<BKNSW_gp\u0080"+
		"\u0088\u0099\u009c\u00a5\u00b2\u00b7\u00bf\u00d1\u00d7\u00da\u00df\u00e3"+
		"\u00ff\u010a\u010c\u0117";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
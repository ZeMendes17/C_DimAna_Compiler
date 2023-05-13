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
			setState(41);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3804545922L) != 0)) {
				{
				{
				setState(36);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3804545920L) != 0)) {
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
			setState(66);
			match(ID);
			setState(67);
			match(T__1);
			setState(69);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3800039424L) != 0)) {
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

	@SuppressWarnings("CheckReturnValue")
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
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 33864810520L) != 0)) {
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dimanaListener ) ((dimanaListener)listener).enterUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dimanaListener ) ((dimanaListener)listener).exitUnit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dimanaVisitor ) return ((dimanaVisitor<? extends T>)visitor).visitUnit(this);
			else return visitor.visitChildren(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
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
	public static class AddListExpressionContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ID() { return getToken(dimanaParser.ID, 0); }
		public AddListExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dimanaListener ) ((dimanaListener)listener).enterAddListExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dimanaListener ) ((dimanaListener)listener).exitAddListExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dimanaVisitor ) return ((dimanaVisitor<? extends T>)visitor).visitAddListExpression(this);
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
	public static class MulDivExpressionContext extends ExpressionContext {
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
		"\u0004\u0001%\u00e6\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0003\u0001%\b\u0001"+
		"\u0001\u0001\u0005\u0001(\b\u0001\n\u0001\f\u0001+\t\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u00027\b\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003=\b\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0003\u0005F\b\u0005\u0001\u0005\u0003\u0005I\b\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0003\u0005N\b\u0005\u0001\u0005\u0001\u0005\u0003"+
		"\u0005R\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0003\bd\b\b\u0001\b\u0001\b\u0001\b\u0001\b"+
		"\u0005\bj\b\b\n\b\f\bm\t\b\u0001\b\u0003\bp\b\b\u0001\b\u0001\b\u0001"+
		"\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0003\n~\b\n\u0001\n\u0003\n\u0081\b\n\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u008a"+
		"\b\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u008f\b\u000b"+
		"\u0001\u000b\u0001\u000b\u0003\u000b\u0093\b\u000b\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0003\f\u009b\b\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0003\r\u00ad\b\r\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003"+
		"\u000e\u00c9\b\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0005\u000e\u00d7\b\u000e\n\u000e\f\u000e\u00da\t\u000e"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0003\u000f\u00e4\b\u000f\u0001\u000f\u0000\u0001"+
		"\u001c\u0010\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016"+
		"\u0018\u001a\u001c\u001e\u0000\u0005\u0001\u0000\u0007\b\u0001\u0000\u001f"+
		" \u0002\u0000\u001f\u001f\"\"\u0002\u0000\u0006\u0006\u001a\u001a\u0002"+
		"\u0000\u0011\u0011\u001b\u001b\u0100\u0000 \u0001\u0000\u0000\u0000\u0002"+
		")\u0001\u0000\u0000\u0000\u00046\u0001\u0000\u0000\u0000\u00068\u0001"+
		"\u0000\u0000\u0000\b>\u0001\u0000\u0000\u0000\nB\u0001\u0000\u0000\u0000"+
		"\fS\u0001\u0000\u0000\u0000\u000eV\u0001\u0000\u0000\u0000\u0010X\u0001"+
		"\u0000\u0000\u0000\u0012s\u0001\u0000\u0000\u0000\u0014v\u0001\u0000\u0000"+
		"\u0000\u0016\u0082\u0001\u0000\u0000\u0000\u0018\u0094\u0001\u0000\u0000"+
		"\u0000\u001a\u00a0\u0001\u0000\u0000\u0000\u001c\u00c8\u0001\u0000\u0000"+
		"\u0000\u001e\u00e3\u0001\u0000\u0000\u0000 !\u0003\u0002\u0001\u0000!"+
		"\"\u0005\u0000\u0000\u0001\"\u0001\u0001\u0000\u0000\u0000#%\u0003\u0004"+
		"\u0002\u0000$#\u0001\u0000\u0000\u0000$%\u0001\u0000\u0000\u0000%&\u0001"+
		"\u0000\u0000\u0000&(\u0005\u0001\u0000\u0000\'$\u0001\u0000\u0000\u0000"+
		"(+\u0001\u0000\u0000\u0000)\'\u0001\u0000\u0000\u0000)*\u0001\u0000\u0000"+
		"\u0000*\u0003\u0001\u0000\u0000\u0000+)\u0001\u0000\u0000\u0000,7\u0003"+
		"\n\u0005\u0000-7\u0003\b\u0004\u0000.7\u0003\u0006\u0003\u0000/7\u0003"+
		"\f\u0006\u000007\u0003\u0010\b\u000017\u0003\u0012\t\u000027\u0003\u0014"+
		"\n\u000037\u0003\u0016\u000b\u000047\u0003\u0018\f\u000057\u0003\u001a"+
		"\r\u00006,\u0001\u0000\u0000\u00006-\u0001\u0000\u0000\u00006.\u0001\u0000"+
		"\u0000\u00006/\u0001\u0000\u0000\u000060\u0001\u0000\u0000\u000061\u0001"+
		"\u0000\u0000\u000062\u0001\u0000\u0000\u000063\u0001\u0000\u0000\u0000"+
		"64\u0001\u0000\u0000\u000065\u0001\u0000\u0000\u00007\u0005\u0001\u0000"+
		"\u0000\u000089\u0003\u001e\u000f\u00009<\u0005\u001f\u0000\u0000:;\u0005"+
		"\u0002\u0000\u0000;=\u0003\u001c\u000e\u0000<:\u0001\u0000\u0000\u0000"+
		"<=\u0001\u0000\u0000\u0000=\u0007\u0001\u0000\u0000\u0000>?\u0005\u001f"+
		"\u0000\u0000?@\u0005\u0002\u0000\u0000@A\u0003\u001c\u000e\u0000A\t\u0001"+
		"\u0000\u0000\u0000BC\u0005\u001f\u0000\u0000CE\u0005\u0002\u0000\u0000"+
		"DF\u0003\u001e\u000f\u0000ED\u0001\u0000\u0000\u0000EF\u0001\u0000\u0000"+
		"\u0000FH\u0001\u0000\u0000\u0000GI\u0005\u0003\u0000\u0000HG\u0001\u0000"+
		"\u0000\u0000HI\u0001\u0000\u0000\u0000IJ\u0001\u0000\u0000\u0000JK\u0005"+
		"\u0004\u0000\u0000KM\u0005\"\u0000\u0000LN\u0005\u0005\u0000\u0000ML\u0001"+
		"\u0000\u0000\u0000MN\u0001\u0000\u0000\u0000NQ\u0001\u0000\u0000\u0000"+
		"OP\u0005\u0006\u0000\u0000PR\u0005\u001f\u0000\u0000QO\u0001\u0000\u0000"+
		"\u0000QR\u0001\u0000\u0000\u0000R\u000b\u0001\u0000\u0000\u0000ST\u0003"+
		"\u000e\u0007\u0000TU\u0003\u001c\u000e\u0000U\r\u0001\u0000\u0000\u0000"+
		"VW\u0007\u0000\u0000\u0000W\u000f\u0001\u0000\u0000\u0000XY\u0005\t\u0000"+
		"\u0000YZ\u0005\u001f\u0000\u0000Z[\u0005\u0002\u0000\u0000[\\\u0007\u0001"+
		"\u0000\u0000\\c\u0005\n\u0000\u0000]d\u0005 \u0000\u0000^d\u0005\u001f"+
		"\u0000\u0000_`\u0005\u000b\u0000\u0000`a\u0005\u0003\u0000\u0000ab\u0005"+
		"\u001f\u0000\u0000bd\u0005\u0005\u0000\u0000c]\u0001\u0000\u0000\u0000"+
		"c^\u0001\u0000\u0000\u0000c_\u0001\u0000\u0000\u0000de\u0001\u0000\u0000"+
		"\u0000eo\u0005\f\u0000\u0000fg\u0003\u001c\u000e\u0000gh\u0005\u0001\u0000"+
		"\u0000hj\u0001\u0000\u0000\u0000if\u0001\u0000\u0000\u0000jm\u0001\u0000"+
		"\u0000\u0000ki\u0001\u0000\u0000\u0000kl\u0001\u0000\u0000\u0000lp\u0001"+
		"\u0000\u0000\u0000mk\u0001\u0000\u0000\u0000np\u0003\u0002\u0001\u0000"+
		"ok\u0001\u0000\u0000\u0000on\u0001\u0000\u0000\u0000pq\u0001\u0000\u0000"+
		"\u0000qr\u0005\r\u0000\u0000r\u0011\u0001\u0000\u0000\u0000st\u0005\u000e"+
		"\u0000\u0000tu\u0005\"\u0000\u0000u\u0013\u0001\u0000\u0000\u0000vw\u0005"+
		"\u000f\u0000\u0000wx\u0003\u001e\u000f\u0000xy\u0005\u001f\u0000\u0000"+
		"y\u0080\u0005\u0002\u0000\u0000z\u0081\u0005 \u0000\u0000{}\u0005\u0010"+
		"\u0000\u0000|~\u0005\u0011\u0000\u0000}|\u0001\u0000\u0000\u0000}~\u0001"+
		"\u0000\u0000\u0000~\u007f\u0001\u0000\u0000\u0000\u007f\u0081\u0005 \u0000"+
		"\u0000\u0080z\u0001\u0000\u0000\u0000\u0080{\u0001\u0000\u0000\u0000\u0081"+
		"\u0015\u0001\u0000\u0000\u0000\u0082\u0083\u0005\u0012\u0000\u0000\u0083"+
		"\u0084\u0003\u001e\u000f\u0000\u0084\u0092\u0005\u001f\u0000\u0000\u0085"+
		"\u0086\u0005\u0013\u0000\u0000\u0086\u0089\u0005\u001f\u0000\u0000\u0087"+
		"\u0088\u0005\u0014\u0000\u0000\u0088\u008a\u0005\u001f\u0000\u0000\u0089"+
		"\u0087\u0001\u0000\u0000\u0000\u0089\u008a\u0001\u0000\u0000\u0000\u008a"+
		"\u008b\u0001\u0000\u0000\u0000\u008b\u008e\u0005\u0015\u0000\u0000\u008c"+
		"\u008d\u0005\u0002\u0000\u0000\u008d\u008f\u0003\u001c\u000e\u0000\u008e"+
		"\u008c\u0001\u0000\u0000\u0000\u008e\u008f\u0001\u0000\u0000\u0000\u008f"+
		"\u0093\u0001\u0000\u0000\u0000\u0090\u0091\u0005\u0002\u0000\u0000\u0091"+
		"\u0093\u0003\u001c\u000e\u0000\u0092\u0085\u0001\u0000\u0000\u0000\u0092"+
		"\u0090\u0001\u0000\u0000\u0000\u0093\u0017\u0001\u0000\u0000\u0000\u0094"+
		"\u0095\u0005\u0016\u0000\u0000\u0095\u0096\u0005\u001f\u0000\u0000\u0096"+
		"\u0097\u0005\u0013\u0000\u0000\u0097\u009a\u0005\u001f\u0000\u0000\u0098"+
		"\u0099\u0005\u0014\u0000\u0000\u0099\u009b\u0005\u001f\u0000\u0000\u009a"+
		"\u0098\u0001\u0000\u0000\u0000\u009a\u009b\u0001\u0000\u0000\u0000\u009b"+
		"\u009c\u0001\u0000\u0000\u0000\u009c\u009d\u0005\u0015\u0000\u0000\u009d"+
		"\u009e\u0005\u0002\u0000\u0000\u009e\u009f\u0003\u001c\u000e\u0000\u009f"+
		"\u0019\u0001\u0000\u0000\u0000\u00a0\u00a1\u0005\u0017\u0000\u0000\u00a1"+
		"\u00a2\u0005\u0013\u0000\u0000\u00a2\u00a3\u0003\u001e\u000f\u0000\u00a3"+
		"\u00a4\u0005\u0015\u0000\u0000\u00a4\u00ac\u0005\u001f\u0000\u0000\u00a5"+
		"\u00a6\u0005\u0002\u0000\u0000\u00a6\u00a7\u0005\u0018\u0000\u0000\u00a7"+
		"\u00a8\u0005\u0017\u0000\u0000\u00a8\u00a9\u0005\u0013\u0000\u0000\u00a9"+
		"\u00aa\u0003\u001e\u000f\u0000\u00aa\u00ab\u0005\u0015\u0000\u0000\u00ab"+
		"\u00ad\u0001\u0000\u0000\u0000\u00ac\u00a5\u0001\u0000\u0000\u0000\u00ac"+
		"\u00ad\u0001\u0000\u0000\u0000\u00ad\u001b\u0001\u0000\u0000\u0000\u00ae"+
		"\u00af\u0006\u000e\uffff\uffff\u0000\u00af\u00b0\u0005\u0004\u0000\u0000"+
		"\u00b0\u00c9\u0005\"\u0000\u0000\u00b1\u00b2\u0005\u0019\u0000\u0000\u00b2"+
		"\u00b3\u0005\u0003\u0000\u0000\u00b3\u00b4\u0007\u0002\u0000\u0000\u00b4"+
		"\u00b5\u0005\u0014\u0000\u0000\u00b5\u00b6\u0005 \u0000\u0000\u00b6\u00c9"+
		"\u0005\u0005\u0000\u0000\u00b7\u00b8\u0005\u0003\u0000\u0000\u00b8\u00b9"+
		"\u0003\u001c\u000e\u0000\u00b9\u00ba\u0005\u0005\u0000\u0000\u00ba\u00c9"+
		"\u0001\u0000\u0000\u0000\u00bb\u00bc\u0005\u001f\u0000\u0000\u00bc\u00bd"+
		"\u0005\u0013\u0000\u0000\u00bd\u00be\u0005\u001f\u0000\u0000\u00be\u00c9"+
		"\u0005\u0015\u0000\u0000\u00bf\u00c9\u0005\u001f\u0000\u0000\u00c0\u00c1"+
		"\u0003\u001e\u000f\u0000\u00c1\u00c2\u0005\u0003\u0000\u0000\u00c2\u00c3"+
		"\u0003\u001c\u000e\u0000\u00c3\u00c4\u0005\u0005\u0000\u0000\u00c4\u00c9"+
		"\u0001\u0000\u0000\u0000\u00c5\u00c9\u0005!\u0000\u0000\u00c6\u00c9\u0005"+
		" \u0000\u0000\u00c7\u00c9\u0005\"\u0000\u0000\u00c8\u00ae\u0001\u0000"+
		"\u0000\u0000\u00c8\u00b1\u0001\u0000\u0000\u0000\u00c8\u00b7\u0001\u0000"+
		"\u0000\u0000\u00c8\u00bb\u0001\u0000\u0000\u0000\u00c8\u00bf\u0001\u0000"+
		"\u0000\u0000\u00c8\u00c0\u0001\u0000\u0000\u0000\u00c8\u00c5\u0001\u0000"+
		"\u0000\u0000\u00c8\u00c6\u0001\u0000\u0000\u0000\u00c8\u00c7\u0001\u0000"+
		"\u0000\u0000\u00c9\u00d8\u0001\u0000\u0000\u0000\u00ca\u00cb\n\u000b\u0000"+
		"\u0000\u00cb\u00cc\u0007\u0003\u0000\u0000\u00cc\u00d7\u0003\u001c\u000e"+
		"\f\u00cd\u00ce\n\n\u0000\u0000\u00ce\u00cf\u0007\u0004\u0000\u0000\u00cf"+
		"\u00d7\u0003\u001c\u000e\u000b\u00d0\u00d1\n\b\u0000\u0000\u00d1\u00d2"+
		"\u0005\u0014\u0000\u0000\u00d2\u00d7\u0003\u001c\u000e\t\u00d3\u00d4\n"+
		"\u0007\u0000\u0000\u00d4\u00d5\u0005\u001c\u0000\u0000\u00d5\u00d7\u0005"+
		"\u001f\u0000\u0000\u00d6\u00ca\u0001\u0000\u0000\u0000\u00d6\u00cd\u0001"+
		"\u0000\u0000\u0000\u00d6\u00d0\u0001\u0000\u0000\u0000\u00d6\u00d3\u0001"+
		"\u0000\u0000\u0000\u00d7\u00da\u0001\u0000\u0000\u0000\u00d8\u00d6\u0001"+
		"\u0000\u0000\u0000\u00d8\u00d9\u0001\u0000\u0000\u0000\u00d9\u001d\u0001"+
		"\u0000\u0000\u0000\u00da\u00d8\u0001\u0000\u0000\u0000\u00db\u00e4\u0005"+
		"\u001d\u0000\u0000\u00dc\u00e4\u0005\u001e\u0000\u0000\u00dd\u00e4\u0005"+
		"\u0019\u0000\u0000\u00de\u00df\u0005\u0017\u0000\u0000\u00df\u00e0\u0005"+
		"\u0013\u0000\u0000\u00e0\u00e1\u0005\u001f\u0000\u0000\u00e1\u00e4\u0005"+
		"\u0015\u0000\u0000\u00e2\u00e4\u0005\u001f\u0000\u0000\u00e3\u00db\u0001"+
		"\u0000\u0000\u0000\u00e3\u00dc\u0001\u0000\u0000\u0000\u00e3\u00dd\u0001"+
		"\u0000\u0000\u0000\u00e3\u00de\u0001\u0000\u0000\u0000\u00e3\u00e2\u0001"+
		"\u0000\u0000\u0000\u00e4\u001f\u0001\u0000\u0000\u0000\u0016$)6<EHMQc"+
		"ko}\u0080\u0089\u008e\u0092\u009a\u00ac\u00c8\u00d6\u00d8\u00e3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
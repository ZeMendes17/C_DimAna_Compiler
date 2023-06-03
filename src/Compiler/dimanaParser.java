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
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, ID=48, INT=49, REAL=50, STRING=51, BOOL=52, WS=53, 
		LINE_COMMENT=54, ERROR=55;
	public static final int
		RULE_program = 0, RULE_statList = 1, RULE_statement = 2, RULE_variableDeclaration = 3, 
		RULE_readToArray = 4, RULE_assignment = 5, RULE_inputStatement = 6, RULE_outputStatement = 7, 
		RULE_outputFormat = 8, RULE_write_expr = 9, RULE_loopStatement = 10, RULE_whileStatement = 11, 
		RULE_doWhileStatement = 12, RULE_length = 13, RULE_breakStatement = 14, 
		RULE_continueStatement = 15, RULE_headerFile = 16, RULE_prefixUnit = 17, 
		RULE_unit = 18, RULE_alternativeUnit = 19, RULE_listDeclaration = 20, 
		RULE_conditional = 21, RULE_ifBlock = 22, RULE_elseIfBlock = 23, RULE_elseBlock = 24, 
		RULE_expression = 25, RULE_dataType = 26, RULE_castTypes = 27;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statList", "statement", "variableDeclaration", "readToArray", 
			"assignment", "inputStatement", "outputStatement", "outputFormat", "write_expr", 
			"loopStatement", "whileStatement", "doWhileStatement", "length", "breakStatement", 
			"continueStatement", "headerFile", "prefixUnit", "unit", "alternativeUnit", 
			"listDeclaration", "conditional", "ifBlock", "elseIfBlock", "elseBlock", 
			"expression", "dataType", "castTypes"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'='", "'('", "'read'", "')'", "'*'", "'>>'", "','", "'string'", 
			"'write'", "'writeln'", "'for'", "'to'", "'do'", "'end'", "'while'", 
			"'{'", "'}'", "'length'", "'stop'", "'procede'", "'use'", "'prefix'", 
			"'1e'", "'-'", "'dimension'", "'['", "']'", "'unit'", "'list'", "'new'", 
			"'if'", "'else if'", "'else'", "'/'", "'+'", "'=='", "'!='", "'<'", "'>'", 
			"'>='", "'<='", "'and'", "'or'", "'integer'", "'real'", "'bool'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"ID", "INT", "REAL", "STRING", "BOOL", "WS", "LINE_COMMENT", "ERROR"
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
			setState(56);
			statList();
			setState(57);
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
			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 527771569839642L) != 0)) {
				{
				{
				setState(60);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 527771569839640L) != 0)) {
					{
					setState(59);
					statement();
					}
				}

				setState(62);
				match(T__0);
				}
				}
				setState(67);
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
		public ReadToArrayContext readToArray() {
			return getRuleContext(ReadToArrayContext.class,0);
		}
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public ConditionalContext conditional() {
			return getRuleContext(ConditionalContext.class,0);
		}
		public OutputStatementContext outputStatement() {
			return getRuleContext(OutputStatementContext.class,0);
		}
		public LoopStatementContext loopStatement() {
			return getRuleContext(LoopStatementContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public DoWhileStatementContext doWhileStatement() {
			return getRuleContext(DoWhileStatementContext.class,0);
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
		public BreakStatementContext breakStatement() {
			return getRuleContext(BreakStatementContext.class,0);
		}
		public ContinueStatementContext continueStatement() {
			return getRuleContext(ContinueStatementContext.class,0);
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
			setState(85);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(68);
				inputStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(69);
				assignment();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(70);
				readToArray();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(71);
				variableDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(72);
				conditional();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(73);
				outputStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(74);
				loopStatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(75);
				whileStatement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(76);
				doWhileStatement();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(77);
				whileStatement();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(78);
				headerFile();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(79);
				prefixUnit();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(80);
				unit();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(81);
				alternativeUnit();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(82);
				listDeclaration();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(83);
				breakStatement();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(84);
				continueStatement();
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
			setState(87);
			dataType();
			setState(88);
			match(ID);
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(89);
				match(T__1);
				setState(90);
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
	public static class ReadToArrayContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(dimanaParser.STRING, 0); }
		public List<TerminalNode> ID() { return getTokens(dimanaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(dimanaParser.ID, i);
		}
		public CastTypesContext castTypes() {
			return getRuleContext(CastTypesContext.class,0);
		}
		public ReadToArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_readToArray; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dimanaListener ) ((dimanaListener)listener).enterReadToArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dimanaListener ) ((dimanaListener)listener).exitReadToArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dimanaVisitor ) return ((dimanaVisitor<? extends T>)visitor).visitReadToArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReadToArrayContext readToArray() throws RecognitionException {
		ReadToArrayContext _localctx = new ReadToArrayContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_readToArray);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__44 || _la==T__45) {
				{
				setState(93);
				castTypes();
				}
			}

			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(96);
				match(T__2);
				}
			}

			setState(99);
			match(T__3);
			setState(100);
			match(STRING);
			setState(102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(101);
				match(T__4);
				}
			}

			setState(106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(104);
				match(T__5);
				setState(105);
				match(ID);
				}
			}

			setState(108);
			match(T__6);
			setState(109);
			match(ID);
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
		enterRule(_localctx, 10, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			match(ID);
			setState(112);
			match(T__1);
			setState(113);
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
		enterRule(_localctx, 12, RULE_inputStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			match(ID);
			setState(116);
			match(T__1);
			setState(118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 527766655074816L) != 0)) {
				{
				setState(117);
				dataType();
				}
			}

			setState(121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(120);
				match(T__2);
				}
			}

			setState(123);
			match(T__3);
			setState(124);
			match(STRING);
			setState(126);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(125);
				match(T__4);
				}
			}

			setState(130);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(128);
				match(T__5);
				setState(129);
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
		enterRule(_localctx, 14, RULE_outputStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			write_expr();
			setState(133);
			outputFormat();
			setState(138);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(134);
				match(T__7);
				setState(135);
				outputFormat();
				}
				}
				setState(140);
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
		enterRule(_localctx, 16, RULE_outputFormat);
		try {
			setState(155);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(141);
				match(T__8);
				setState(142);
				match(T__2);
				setState(146);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(143);
					match(ID);
					}
					break;
				case 2:
					{
					setState(144);
					match(STRING);
					}
					break;
				case 3:
					{
					setState(145);
					expression(0);
					}
					break;
				}
				setState(148);
				match(T__7);
				setState(149);
				match(INT);
				setState(150);
				match(T__4);
				}
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(151);
				match(STRING);
				setState(152);
				match(T__7);
				setState(153);
				match(ID);
				}
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(154);
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
		enterRule(_localctx, 18, RULE_write_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			_la = _input.LA(1);
			if ( !(_la==T__9 || _la==T__10) ) {
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
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
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
		enterRule(_localctx, 20, RULE_loopStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			match(T__11);
			setState(160);
			match(ID);
			setState(161);
			match(T__1);
			setState(162);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==INT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(163);
			match(T__12);
			setState(171);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				{
				setState(164);
				match(INT);
				}
				break;
			case ID:
				{
				setState(165);
				match(ID);
				}
				break;
			case T__18:
				{
				setState(166);
				length();
				setState(167);
				match(T__2);
				setState(168);
				match(ID);
				setState(169);
				match(T__4);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(173);
			match(T__13);
			{
			setState(177); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(174);
				statement();
				setState(175);
				match(T__0);
				}
				}
				setState(179); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 527771569839640L) != 0) );
			}
			setState(181);
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
	public static class WhileStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dimanaListener ) ((dimanaListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dimanaListener ) ((dimanaListener)listener).exitWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dimanaVisitor ) return ((dimanaVisitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_whileStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			match(T__15);
			setState(184);
			match(T__2);
			setState(185);
			expression(0);
			setState(186);
			match(T__4);
			setState(187);
			match(T__16);
			setState(191); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(188);
				statement();
				setState(189);
				match(T__0);
				}
				}
				setState(193); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 527771569839640L) != 0) );
			setState(195);
			match(T__17);
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
	public static class DoWhileStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public DoWhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doWhileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dimanaListener ) ((dimanaListener)listener).enterDoWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dimanaListener ) ((dimanaListener)listener).exitDoWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dimanaVisitor ) return ((dimanaVisitor<? extends T>)visitor).visitDoWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DoWhileStatementContext doWhileStatement() throws RecognitionException {
		DoWhileStatementContext _localctx = new DoWhileStatementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_doWhileStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			match(T__13);
			setState(198);
			match(T__16);
			setState(202); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(199);
				statement();
				setState(200);
				match(T__0);
				}
				}
				setState(204); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 527771569839640L) != 0) );
			setState(206);
			match(T__17);
			setState(207);
			match(T__15);
			setState(208);
			match(T__2);
			setState(209);
			expression(0);
			setState(210);
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
		enterRule(_localctx, 26, RULE_length);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
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

	@SuppressWarnings("CheckReturnValue")
	public static class BreakStatementContext extends ParserRuleContext {
		public BreakStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_breakStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dimanaListener ) ((dimanaListener)listener).enterBreakStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dimanaListener ) ((dimanaListener)listener).exitBreakStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dimanaVisitor ) return ((dimanaVisitor<? extends T>)visitor).visitBreakStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BreakStatementContext breakStatement() throws RecognitionException {
		BreakStatementContext _localctx = new BreakStatementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_breakStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			match(T__19);
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
	public static class ContinueStatementContext extends ParserRuleContext {
		public ContinueStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continueStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dimanaListener ) ((dimanaListener)listener).enterContinueStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dimanaListener ) ((dimanaListener)listener).exitContinueStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dimanaVisitor ) return ((dimanaVisitor<? extends T>)visitor).visitContinueStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContinueStatementContext continueStatement() throws RecognitionException {
		ContinueStatementContext _localctx = new ContinueStatementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_continueStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			match(T__20);
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
		enterRule(_localctx, 32, RULE_headerFile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			match(T__21);
			setState(219);
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
		enterRule(_localctx, 34, RULE_prefixUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			match(T__22);
			setState(222);
			dataType();
			setState(223);
			match(ID);
			setState(224);
			match(T__1);
			setState(231);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				{
				setState(225);
				match(INT);
				}
				break;
			case T__23:
				{
				setState(226);
				match(T__23);
				setState(228);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__24) {
					{
					setState(227);
					((PrefixUnitContext)_localctx).minus = match(T__24);
					}
				}

				setState(230);
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
		enterRule(_localctx, 36, RULE_unit);
		int _la;
		try {
			setState(258);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				_localctx = new IndependentUnitContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(233);
				match(T__25);
				setState(234);
				dataType();
				setState(235);
				match(ID);
				{
				setState(236);
				match(T__26);
				setState(237);
				match(ID);
				setState(240);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__7) {
					{
					setState(238);
					match(T__7);
					setState(239);
					match(ID);
					}
				}

				setState(242);
				match(T__27);
				}
				}
				break;
			case 2:
				_localctx = new DependantUnitContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(244);
				match(T__25);
				setState(245);
				dataType();
				setState(246);
				match(ID);
				{
				setState(253);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__26) {
					{
					setState(247);
					match(T__26);
					setState(248);
					match(ID);
					{
					setState(249);
					match(T__7);
					setState(250);
					match(ID);
					}
					setState(252);
					match(T__27);
					}
				}

				setState(255);
				match(T__1);
				setState(256);
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
		enterRule(_localctx, 38, RULE_alternativeUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			match(T__28);
			setState(261);
			match(ID);
			setState(262);
			match(T__26);
			setState(263);
			match(ID);
			setState(266);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(264);
				match(T__7);
				setState(265);
				match(ID);
				}
			}

			setState(268);
			match(T__27);
			setState(269);
			match(T__1);
			setState(270);
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
		enterRule(_localctx, 40, RULE_listDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			match(T__29);
			setState(273);
			match(T__26);
			setState(274);
			dataType();
			setState(275);
			match(T__27);
			setState(276);
			match(ID);
			setState(284);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(277);
				match(T__1);
				setState(278);
				match(T__30);
				setState(279);
				match(T__29);
				setState(280);
				match(T__26);
				setState(281);
				dataType();
				setState(282);
				match(T__27);
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
	public static class ConditionalContext extends ParserRuleContext {
		public List<IfBlockContext> ifBlock() {
			return getRuleContexts(IfBlockContext.class);
		}
		public IfBlockContext ifBlock(int i) {
			return getRuleContext(IfBlockContext.class,i);
		}
		public ElseIfBlockContext elseIfBlock() {
			return getRuleContext(ElseIfBlockContext.class,0);
		}
		public ElseBlockContext elseBlock() {
			return getRuleContext(ElseBlockContext.class,0);
		}
		public ConditionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dimanaListener ) ((dimanaListener)listener).enterConditional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dimanaListener ) ((dimanaListener)listener).exitConditional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dimanaVisitor ) return ((dimanaVisitor<? extends T>)visitor).visitConditional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalContext conditional() throws RecognitionException {
		ConditionalContext _localctx = new ConditionalContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_conditional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(286);
				ifBlock();
				}
				}
				setState(289); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__31 );
			setState(292);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__32) {
				{
				setState(291);
				elseIfBlock();
				}
			}

			setState(295);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__33) {
				{
				setState(294);
				elseBlock();
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
	public static class IfBlockContext extends ParserRuleContext {
		public StatementContext statement;
		public List<StatementContext> statements = new ArrayList<StatementContext>();
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public IfBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dimanaListener ) ((dimanaListener)listener).enterIfBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dimanaListener ) ((dimanaListener)listener).exitIfBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dimanaVisitor ) return ((dimanaVisitor<? extends T>)visitor).visitIfBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfBlockContext ifBlock() throws RecognitionException {
		IfBlockContext _localctx = new IfBlockContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_ifBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
			match(T__31);
			setState(298);
			match(T__2);
			setState(299);
			expression(0);
			setState(300);
			match(T__4);
			setState(301);
			match(T__16);
			setState(302);
			((IfBlockContext)_localctx).statement = statement();
			((IfBlockContext)_localctx).statements.add(((IfBlockContext)_localctx).statement);
			setState(304); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(303);
				match(T__0);
				}
				}
				setState(306); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__0 );
			setState(308);
			match(T__17);
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
	public static class ElseIfBlockContext extends ParserRuleContext {
		public StatementContext statement;
		public List<StatementContext> statements = new ArrayList<StatementContext>();
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ElseIfBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseIfBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dimanaListener ) ((dimanaListener)listener).enterElseIfBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dimanaListener ) ((dimanaListener)listener).exitElseIfBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dimanaVisitor ) return ((dimanaVisitor<? extends T>)visitor).visitElseIfBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseIfBlockContext elseIfBlock() throws RecognitionException {
		ElseIfBlockContext _localctx = new ElseIfBlockContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_elseIfBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(323); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(310);
				match(T__32);
				setState(311);
				match(T__2);
				setState(312);
				expression(0);
				setState(313);
				match(T__4);
				setState(314);
				match(T__16);
				setState(315);
				((ElseIfBlockContext)_localctx).statement = statement();
				((ElseIfBlockContext)_localctx).statements.add(((ElseIfBlockContext)_localctx).statement);
				setState(317); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(316);
					match(T__0);
					}
					}
					setState(319); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__0 );
				setState(321);
				match(T__17);
				}
				}
				setState(325); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__32 );
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
	public static class ElseBlockContext extends ParserRuleContext {
		public StatementContext statement;
		public List<StatementContext> statements = new ArrayList<StatementContext>();
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ElseBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dimanaListener ) ((dimanaListener)listener).enterElseBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dimanaListener ) ((dimanaListener)listener).exitElseBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dimanaVisitor ) return ((dimanaVisitor<? extends T>)visitor).visitElseBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseBlockContext elseBlock() throws RecognitionException {
		ElseBlockContext _localctx = new ElseBlockContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_elseBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(327);
			match(T__33);
			setState(328);
			match(T__16);
			setState(329);
			((ElseBlockContext)_localctx).statement = statement();
			((ElseBlockContext)_localctx).statements.add(((ElseBlockContext)_localctx).statement);
			setState(331); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(330);
				match(T__0);
				}
				}
				setState(333); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__0 );
			setState(335);
			match(T__17);
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
		public String dimension;
		public String type;
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
			this.varName = ctx.varName;
			this.dimension = ctx.dimension;
			this.type = ctx.type;
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ConditionalExpressionContext extends ExpressionContext {
		public ExpressionContext e1;
		public Token op;
		public ExpressionContext e2;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ConditionalExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dimanaListener ) ((dimanaListener)listener).enterConditionalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dimanaListener ) ((dimanaListener)listener).exitConditionalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dimanaVisitor ) return ((dimanaVisitor<? extends T>)visitor).visitConditionalExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IndexExpressionContext extends ExpressionContext {
		public List<TerminalNode> ID() { return getTokens(dimanaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(dimanaParser.ID, i);
		}
		public TerminalNode INT() { return getToken(dimanaParser.INT, 0); }
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
	public static class BoolLiteralContext extends ExpressionContext {
		public TerminalNode BOOL() { return getToken(dimanaParser.BOOL, 0); }
		public BoolLiteralContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dimanaListener ) ((dimanaListener)listener).enterBoolLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dimanaListener ) ((dimanaListener)listener).exitBoolLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dimanaVisitor ) return ((dimanaVisitor<? extends T>)visitor).visitBoolLiteral(this);
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
	public static class AndOrExpressionContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public AndOrExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dimanaListener ) ((dimanaListener)listener).enterAndOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dimanaListener ) ((dimanaListener)listener).exitAndOrExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dimanaVisitor ) return ((dimanaVisitor<? extends T>)visitor).visitAndOrExpression(this);
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
		int _startState = 50;
		enterRecursionRule(_localctx, 50, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(358);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				{
				_localctx = new InputExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(338);
				match(T__3);
				setState(339);
				match(STRING);
				}
				break;
			case 2:
				{
				_localctx = new ParenExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(340);
				match(T__2);
				setState(341);
				expression(0);
				setState(342);
				match(T__4);
				}
				break;
			case 3:
				{
				_localctx = new IndexExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(344);
				match(ID);
				setState(345);
				match(T__26);
				setState(346);
				_la = _input.LA(1);
				if ( !(_la==ID || _la==INT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(347);
				match(T__27);
				}
				break;
			case 4:
				{
				_localctx = new IdExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(348);
				match(ID);
				}
				break;
			case 5:
				{
				_localctx = new TypeConversionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(349);
				dataType();
				setState(350);
				match(T__2);
				setState(351);
				expression(0);
				setState(352);
				match(T__4);
				}
				break;
			case 6:
				{
				_localctx = new RealLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(354);
				match(REAL);
				}
				break;
			case 7:
				{
				_localctx = new IntLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(355);
				match(INT);
				}
				break;
			case 8:
				{
				_localctx = new StringLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(356);
				match(STRING);
				}
				break;
			case 9:
				{
				_localctx = new BoolLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(357);
				match(BOOL);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(374);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(372);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
					case 1:
						{
						_localctx = new MulDivExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(360);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(361);
						((MulDivExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__5 || _la==T__34) ) {
							((MulDivExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(362);
						expression(13);
						}
						break;
					case 2:
						{
						_localctx = new AddSubExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(363);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(364);
						((AddSubExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__24 || _la==T__35) ) {
							((AddSubExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(365);
						expression(12);
						}
						break;
					case 3:
						{
						_localctx = new ConditionalExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((ConditionalExpressionContext)_localctx).e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(366);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(367);
						((ConditionalExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 8658654068736L) != 0)) ) {
							((ConditionalExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(368);
						((ConditionalExpressionContext)_localctx).e2 = expression(11);
						}
						break;
					case 4:
						{
						_localctx = new AndOrExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(369);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(370);
						((AndOrExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__42 || _la==T__43) ) {
							((AndOrExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(371);
						expression(10);
						}
						break;
					}
					} 
				}
				setState(376);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
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
		public String type;
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
		enterRule(_localctx, 52, RULE_dataType);
		try {
			setState(386);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__44:
				enterOuterAlt(_localctx, 1);
				{
				setState(377);
				match(T__44);
				}
				break;
			case T__45:
				enterOuterAlt(_localctx, 2);
				{
				setState(378);
				match(T__45);
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 3);
				{
				setState(379);
				match(T__8);
				}
				break;
			case T__29:
				enterOuterAlt(_localctx, 4);
				{
				setState(380);
				match(T__29);
				setState(381);
				match(T__26);
				setState(382);
				match(ID);
				setState(383);
				match(T__27);
				}
				break;
			case T__46:
				enterOuterAlt(_localctx, 5);
				{
				setState(384);
				match(T__46);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 6);
				{
				setState(385);
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
		enterRule(_localctx, 54, RULE_castTypes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(388);
			_la = _input.LA(1);
			if ( !(_la==T__44 || _la==T__45) ) {
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
		case 25:
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
			return precpred(_ctx, 10);
		case 3:
			return precpred(_ctx, 9);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u00017\u0187\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0003\u0001=\b\u0001"+
		"\u0001\u0001\u0005\u0001@\b\u0001\n\u0001\f\u0001C\t\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002V\b\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003\\\b\u0003"+
		"\u0001\u0004\u0003\u0004_\b\u0004\u0001\u0004\u0003\u0004b\b\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0003\u0004g\b\u0004\u0001\u0004\u0001"+
		"\u0004\u0003\u0004k\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0003\u0006w\b\u0006\u0001\u0006\u0003\u0006z\b\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0003\u0006\u007f\b\u0006\u0001\u0006\u0001\u0006"+
		"\u0003\u0006\u0083\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0005\u0007\u0089\b\u0007\n\u0007\f\u0007\u008c\t\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0003\b\u0093\b\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0003\b\u009c\b\b\u0001\t\u0001\t\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0003\n\u00ac\b\n\u0001\n\u0001\n\u0001\n\u0001\n\u0004\n\u00b2"+
		"\b\n\u000b\n\f\n\u00b3\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0004\u000b"+
		"\u00c0\b\u000b\u000b\u000b\f\u000b\u00c1\u0001\u000b\u0001\u000b\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0004\f\u00cb\b\f\u000b\f\f\f\u00cc"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001"+
		"\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0003\u0011\u00e5\b\u0011\u0001\u0011\u0003\u0011\u00e8"+
		"\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0003\u0012\u00f1\b\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u00fe\b\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0003\u0012\u0103\b\u0012\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u010b\b\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u011d\b\u0014\u0001"+
		"\u0015\u0004\u0015\u0120\b\u0015\u000b\u0015\f\u0015\u0121\u0001\u0015"+
		"\u0003\u0015\u0125\b\u0015\u0001\u0015\u0003\u0015\u0128\b\u0015\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0004\u0016\u0131\b\u0016\u000b\u0016\f\u0016\u0132\u0001\u0016"+
		"\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0004\u0017\u013e\b\u0017\u000b\u0017\f\u0017"+
		"\u013f\u0001\u0017\u0001\u0017\u0004\u0017\u0144\b\u0017\u000b\u0017\f"+
		"\u0017\u0145\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0004\u0018"+
		"\u014c\b\u0018\u000b\u0018\f\u0018\u014d\u0001\u0018\u0001\u0018\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0003\u0019\u0167\b\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0005\u0019\u0175"+
		"\b\u0019\n\u0019\f\u0019\u0178\t\u0019\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0003\u001a\u0183\b\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0000\u0001"+
		"2\u001c\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018"+
		"\u001a\u001c\u001e \"$&(*,.0246\u0000\u0007\u0001\u0000\n\u000b\u0001"+
		"\u000001\u0002\u0000\u0006\u0006##\u0002\u0000\u0019\u0019$$\u0001\u0000"+
		"%*\u0001\u0000+,\u0001\u0000-.\u01ae\u00008\u0001\u0000\u0000\u0000\u0002"+
		"A\u0001\u0000\u0000\u0000\u0004U\u0001\u0000\u0000\u0000\u0006W\u0001"+
		"\u0000\u0000\u0000\b^\u0001\u0000\u0000\u0000\no\u0001\u0000\u0000\u0000"+
		"\fs\u0001\u0000\u0000\u0000\u000e\u0084\u0001\u0000\u0000\u0000\u0010"+
		"\u009b\u0001\u0000\u0000\u0000\u0012\u009d\u0001\u0000\u0000\u0000\u0014"+
		"\u009f\u0001\u0000\u0000\u0000\u0016\u00b7\u0001\u0000\u0000\u0000\u0018"+
		"\u00c5\u0001\u0000\u0000\u0000\u001a\u00d4\u0001\u0000\u0000\u0000\u001c"+
		"\u00d6\u0001\u0000\u0000\u0000\u001e\u00d8\u0001\u0000\u0000\u0000 \u00da"+
		"\u0001\u0000\u0000\u0000\"\u00dd\u0001\u0000\u0000\u0000$\u0102\u0001"+
		"\u0000\u0000\u0000&\u0104\u0001\u0000\u0000\u0000(\u0110\u0001\u0000\u0000"+
		"\u0000*\u011f\u0001\u0000\u0000\u0000,\u0129\u0001\u0000\u0000\u0000."+
		"\u0143\u0001\u0000\u0000\u00000\u0147\u0001\u0000\u0000\u00002\u0166\u0001"+
		"\u0000\u0000\u00004\u0182\u0001\u0000\u0000\u00006\u0184\u0001\u0000\u0000"+
		"\u000089\u0003\u0002\u0001\u00009:\u0005\u0000\u0000\u0001:\u0001\u0001"+
		"\u0000\u0000\u0000;=\u0003\u0004\u0002\u0000<;\u0001\u0000\u0000\u0000"+
		"<=\u0001\u0000\u0000\u0000=>\u0001\u0000\u0000\u0000>@\u0005\u0001\u0000"+
		"\u0000?<\u0001\u0000\u0000\u0000@C\u0001\u0000\u0000\u0000A?\u0001\u0000"+
		"\u0000\u0000AB\u0001\u0000\u0000\u0000B\u0003\u0001\u0000\u0000\u0000"+
		"CA\u0001\u0000\u0000\u0000DV\u0003\f\u0006\u0000EV\u0003\n\u0005\u0000"+
		"FV\u0003\b\u0004\u0000GV\u0003\u0006\u0003\u0000HV\u0003*\u0015\u0000"+
		"IV\u0003\u000e\u0007\u0000JV\u0003\u0014\n\u0000KV\u0003\u0016\u000b\u0000"+
		"LV\u0003\u0018\f\u0000MV\u0003\u0016\u000b\u0000NV\u0003 \u0010\u0000"+
		"OV\u0003\"\u0011\u0000PV\u0003$\u0012\u0000QV\u0003&\u0013\u0000RV\u0003"+
		"(\u0014\u0000SV\u0003\u001c\u000e\u0000TV\u0003\u001e\u000f\u0000UD\u0001"+
		"\u0000\u0000\u0000UE\u0001\u0000\u0000\u0000UF\u0001\u0000\u0000\u0000"+
		"UG\u0001\u0000\u0000\u0000UH\u0001\u0000\u0000\u0000UI\u0001\u0000\u0000"+
		"\u0000UJ\u0001\u0000\u0000\u0000UK\u0001\u0000\u0000\u0000UL\u0001\u0000"+
		"\u0000\u0000UM\u0001\u0000\u0000\u0000UN\u0001\u0000\u0000\u0000UO\u0001"+
		"\u0000\u0000\u0000UP\u0001\u0000\u0000\u0000UQ\u0001\u0000\u0000\u0000"+
		"UR\u0001\u0000\u0000\u0000US\u0001\u0000\u0000\u0000UT\u0001\u0000\u0000"+
		"\u0000V\u0005\u0001\u0000\u0000\u0000WX\u00034\u001a\u0000X[\u00050\u0000"+
		"\u0000YZ\u0005\u0002\u0000\u0000Z\\\u00032\u0019\u0000[Y\u0001\u0000\u0000"+
		"\u0000[\\\u0001\u0000\u0000\u0000\\\u0007\u0001\u0000\u0000\u0000]_\u0003"+
		"6\u001b\u0000^]\u0001\u0000\u0000\u0000^_\u0001\u0000\u0000\u0000_a\u0001"+
		"\u0000\u0000\u0000`b\u0005\u0003\u0000\u0000a`\u0001\u0000\u0000\u0000"+
		"ab\u0001\u0000\u0000\u0000bc\u0001\u0000\u0000\u0000cd\u0005\u0004\u0000"+
		"\u0000df\u00053\u0000\u0000eg\u0005\u0005\u0000\u0000fe\u0001\u0000\u0000"+
		"\u0000fg\u0001\u0000\u0000\u0000gj\u0001\u0000\u0000\u0000hi\u0005\u0006"+
		"\u0000\u0000ik\u00050\u0000\u0000jh\u0001\u0000\u0000\u0000jk\u0001\u0000"+
		"\u0000\u0000kl\u0001\u0000\u0000\u0000lm\u0005\u0007\u0000\u0000mn\u0005"+
		"0\u0000\u0000n\t\u0001\u0000\u0000\u0000op\u00050\u0000\u0000pq\u0005"+
		"\u0002\u0000\u0000qr\u00032\u0019\u0000r\u000b\u0001\u0000\u0000\u0000"+
		"st\u00050\u0000\u0000tv\u0005\u0002\u0000\u0000uw\u00034\u001a\u0000v"+
		"u\u0001\u0000\u0000\u0000vw\u0001\u0000\u0000\u0000wy\u0001\u0000\u0000"+
		"\u0000xz\u0005\u0003\u0000\u0000yx\u0001\u0000\u0000\u0000yz\u0001\u0000"+
		"\u0000\u0000z{\u0001\u0000\u0000\u0000{|\u0005\u0004\u0000\u0000|~\u0005"+
		"3\u0000\u0000}\u007f\u0005\u0005\u0000\u0000~}\u0001\u0000\u0000\u0000"+
		"~\u007f\u0001\u0000\u0000\u0000\u007f\u0082\u0001\u0000\u0000\u0000\u0080"+
		"\u0081\u0005\u0006\u0000\u0000\u0081\u0083\u00050\u0000\u0000\u0082\u0080"+
		"\u0001\u0000\u0000\u0000\u0082\u0083\u0001\u0000\u0000\u0000\u0083\r\u0001"+
		"\u0000\u0000\u0000\u0084\u0085\u0003\u0012\t\u0000\u0085\u008a\u0003\u0010"+
		"\b\u0000\u0086\u0087\u0005\b\u0000\u0000\u0087\u0089\u0003\u0010\b\u0000"+
		"\u0088\u0086\u0001\u0000\u0000\u0000\u0089\u008c\u0001\u0000\u0000\u0000"+
		"\u008a\u0088\u0001\u0000\u0000\u0000\u008a\u008b\u0001\u0000\u0000\u0000"+
		"\u008b\u000f\u0001\u0000\u0000\u0000\u008c\u008a\u0001\u0000\u0000\u0000"+
		"\u008d\u008e\u0005\t\u0000\u0000\u008e\u0092\u0005\u0003\u0000\u0000\u008f"+
		"\u0093\u00050\u0000\u0000\u0090\u0093\u00053\u0000\u0000\u0091\u0093\u0003"+
		"2\u0019\u0000\u0092\u008f\u0001\u0000\u0000\u0000\u0092\u0090\u0001\u0000"+
		"\u0000\u0000\u0092\u0091\u0001\u0000\u0000\u0000\u0093\u0094\u0001\u0000"+
		"\u0000\u0000\u0094\u0095\u0005\b\u0000\u0000\u0095\u0096\u00051\u0000"+
		"\u0000\u0096\u009c\u0005\u0005\u0000\u0000\u0097\u0098\u00053\u0000\u0000"+
		"\u0098\u0099\u0005\b\u0000\u0000\u0099\u009c\u00050\u0000\u0000\u009a"+
		"\u009c\u00050\u0000\u0000\u009b\u008d\u0001\u0000\u0000\u0000\u009b\u0097"+
		"\u0001\u0000\u0000\u0000\u009b\u009a\u0001\u0000\u0000\u0000\u009c\u0011"+
		"\u0001\u0000\u0000\u0000\u009d\u009e\u0007\u0000\u0000\u0000\u009e\u0013"+
		"\u0001\u0000\u0000\u0000\u009f\u00a0\u0005\f\u0000\u0000\u00a0\u00a1\u0005"+
		"0\u0000\u0000\u00a1\u00a2\u0005\u0002\u0000\u0000\u00a2\u00a3\u0007\u0001"+
		"\u0000\u0000\u00a3\u00ab\u0005\r\u0000\u0000\u00a4\u00ac\u00051\u0000"+
		"\u0000\u00a5\u00ac\u00050\u0000\u0000\u00a6\u00a7\u0003\u001a\r\u0000"+
		"\u00a7\u00a8\u0005\u0003\u0000\u0000\u00a8\u00a9\u00050\u0000\u0000\u00a9"+
		"\u00aa\u0005\u0005\u0000\u0000\u00aa\u00ac\u0001\u0000\u0000\u0000\u00ab"+
		"\u00a4\u0001\u0000\u0000\u0000\u00ab\u00a5\u0001\u0000\u0000\u0000\u00ab"+
		"\u00a6\u0001\u0000\u0000\u0000\u00ac\u00ad\u0001\u0000\u0000\u0000\u00ad"+
		"\u00b1\u0005\u000e\u0000\u0000\u00ae\u00af\u0003\u0004\u0002\u0000\u00af"+
		"\u00b0\u0005\u0001\u0000\u0000\u00b0\u00b2\u0001\u0000\u0000\u0000\u00b1"+
		"\u00ae\u0001\u0000\u0000\u0000\u00b2\u00b3\u0001\u0000\u0000\u0000\u00b3"+
		"\u00b1\u0001\u0000\u0000\u0000\u00b3\u00b4\u0001\u0000\u0000\u0000\u00b4"+
		"\u00b5\u0001\u0000\u0000\u0000\u00b5\u00b6\u0005\u000f\u0000\u0000\u00b6"+
		"\u0015\u0001\u0000\u0000\u0000\u00b7\u00b8\u0005\u0010\u0000\u0000\u00b8"+
		"\u00b9\u0005\u0003\u0000\u0000\u00b9\u00ba\u00032\u0019\u0000\u00ba\u00bb"+
		"\u0005\u0005\u0000\u0000\u00bb\u00bf\u0005\u0011\u0000\u0000\u00bc\u00bd"+
		"\u0003\u0004\u0002\u0000\u00bd\u00be\u0005\u0001\u0000\u0000\u00be\u00c0"+
		"\u0001\u0000\u0000\u0000\u00bf\u00bc\u0001\u0000\u0000\u0000\u00c0\u00c1"+
		"\u0001\u0000\u0000\u0000\u00c1\u00bf\u0001\u0000\u0000\u0000\u00c1\u00c2"+
		"\u0001\u0000\u0000\u0000\u00c2\u00c3\u0001\u0000\u0000\u0000\u00c3\u00c4"+
		"\u0005\u0012\u0000\u0000\u00c4\u0017\u0001\u0000\u0000\u0000\u00c5\u00c6"+
		"\u0005\u000e\u0000\u0000\u00c6\u00ca\u0005\u0011\u0000\u0000\u00c7\u00c8"+
		"\u0003\u0004\u0002\u0000\u00c8\u00c9\u0005\u0001\u0000\u0000\u00c9\u00cb"+
		"\u0001\u0000\u0000\u0000\u00ca\u00c7\u0001\u0000\u0000\u0000\u00cb\u00cc"+
		"\u0001\u0000\u0000\u0000\u00cc\u00ca\u0001\u0000\u0000\u0000\u00cc\u00cd"+
		"\u0001\u0000\u0000\u0000\u00cd\u00ce\u0001\u0000\u0000\u0000\u00ce\u00cf"+
		"\u0005\u0012\u0000\u0000\u00cf\u00d0\u0005\u0010\u0000\u0000\u00d0\u00d1"+
		"\u0005\u0003\u0000\u0000\u00d1\u00d2\u00032\u0019\u0000\u00d2\u00d3\u0005"+
		"\u0005\u0000\u0000\u00d3\u0019\u0001\u0000\u0000\u0000\u00d4\u00d5\u0005"+
		"\u0013\u0000\u0000\u00d5\u001b\u0001\u0000\u0000\u0000\u00d6\u00d7\u0005"+
		"\u0014\u0000\u0000\u00d7\u001d\u0001\u0000\u0000\u0000\u00d8\u00d9\u0005"+
		"\u0015\u0000\u0000\u00d9\u001f\u0001\u0000\u0000\u0000\u00da\u00db\u0005"+
		"\u0016\u0000\u0000\u00db\u00dc\u00053\u0000\u0000\u00dc!\u0001\u0000\u0000"+
		"\u0000\u00dd\u00de\u0005\u0017\u0000\u0000\u00de\u00df\u00034\u001a\u0000"+
		"\u00df\u00e0\u00050\u0000\u0000\u00e0\u00e7\u0005\u0002\u0000\u0000\u00e1"+
		"\u00e8\u00051\u0000\u0000\u00e2\u00e4\u0005\u0018\u0000\u0000\u00e3\u00e5"+
		"\u0005\u0019\u0000\u0000\u00e4\u00e3\u0001\u0000\u0000\u0000\u00e4\u00e5"+
		"\u0001\u0000\u0000\u0000\u00e5\u00e6\u0001\u0000\u0000\u0000\u00e6\u00e8"+
		"\u00051\u0000\u0000\u00e7\u00e1\u0001\u0000\u0000\u0000\u00e7\u00e2\u0001"+
		"\u0000\u0000\u0000\u00e8#\u0001\u0000\u0000\u0000\u00e9\u00ea\u0005\u001a"+
		"\u0000\u0000\u00ea\u00eb\u00034\u001a\u0000\u00eb\u00ec\u00050\u0000\u0000"+
		"\u00ec\u00ed\u0005\u001b\u0000\u0000\u00ed\u00f0\u00050\u0000\u0000\u00ee"+
		"\u00ef\u0005\b\u0000\u0000\u00ef\u00f1\u00050\u0000\u0000\u00f0\u00ee"+
		"\u0001\u0000\u0000\u0000\u00f0\u00f1\u0001\u0000\u0000\u0000\u00f1\u00f2"+
		"\u0001\u0000\u0000\u0000\u00f2\u00f3\u0005\u001c\u0000\u0000\u00f3\u0103"+
		"\u0001\u0000\u0000\u0000\u00f4\u00f5\u0005\u001a\u0000\u0000\u00f5\u00f6"+
		"\u00034\u001a\u0000\u00f6\u00fd\u00050\u0000\u0000\u00f7\u00f8\u0005\u001b"+
		"\u0000\u0000\u00f8\u00f9\u00050\u0000\u0000\u00f9\u00fa\u0005\b\u0000"+
		"\u0000\u00fa\u00fb\u00050\u0000\u0000\u00fb\u00fc\u0001\u0000\u0000\u0000"+
		"\u00fc\u00fe\u0005\u001c\u0000\u0000\u00fd\u00f7\u0001\u0000\u0000\u0000"+
		"\u00fd\u00fe\u0001\u0000\u0000\u0000\u00fe\u00ff\u0001\u0000\u0000\u0000"+
		"\u00ff\u0100\u0005\u0002\u0000\u0000\u0100\u0101\u00032\u0019\u0000\u0101"+
		"\u0103\u0001\u0000\u0000\u0000\u0102\u00e9\u0001\u0000\u0000\u0000\u0102"+
		"\u00f4\u0001\u0000\u0000\u0000\u0103%\u0001\u0000\u0000\u0000\u0104\u0105"+
		"\u0005\u001d\u0000\u0000\u0105\u0106\u00050\u0000\u0000\u0106\u0107\u0005"+
		"\u001b\u0000\u0000\u0107\u010a\u00050\u0000\u0000\u0108\u0109\u0005\b"+
		"\u0000\u0000\u0109\u010b\u00050\u0000\u0000\u010a\u0108\u0001\u0000\u0000"+
		"\u0000\u010a\u010b\u0001\u0000\u0000\u0000\u010b\u010c\u0001\u0000\u0000"+
		"\u0000\u010c\u010d\u0005\u001c\u0000\u0000\u010d\u010e\u0005\u0002\u0000"+
		"\u0000\u010e\u010f\u00032\u0019\u0000\u010f\'\u0001\u0000\u0000\u0000"+
		"\u0110\u0111\u0005\u001e\u0000\u0000\u0111\u0112\u0005\u001b\u0000\u0000"+
		"\u0112\u0113\u00034\u001a\u0000\u0113\u0114\u0005\u001c\u0000\u0000\u0114"+
		"\u011c\u00050\u0000\u0000\u0115\u0116\u0005\u0002\u0000\u0000\u0116\u0117"+
		"\u0005\u001f\u0000\u0000\u0117\u0118\u0005\u001e\u0000\u0000\u0118\u0119"+
		"\u0005\u001b\u0000\u0000\u0119\u011a\u00034\u001a\u0000\u011a\u011b\u0005"+
		"\u001c\u0000\u0000\u011b\u011d\u0001\u0000\u0000\u0000\u011c\u0115\u0001"+
		"\u0000\u0000\u0000\u011c\u011d\u0001\u0000\u0000\u0000\u011d)\u0001\u0000"+
		"\u0000\u0000\u011e\u0120\u0003,\u0016\u0000\u011f\u011e\u0001\u0000\u0000"+
		"\u0000\u0120\u0121\u0001\u0000\u0000\u0000\u0121\u011f\u0001\u0000\u0000"+
		"\u0000\u0121\u0122\u0001\u0000\u0000\u0000\u0122\u0124\u0001\u0000\u0000"+
		"\u0000\u0123\u0125\u0003.\u0017\u0000\u0124\u0123\u0001\u0000\u0000\u0000"+
		"\u0124\u0125\u0001\u0000\u0000\u0000\u0125\u0127\u0001\u0000\u0000\u0000"+
		"\u0126\u0128\u00030\u0018\u0000\u0127\u0126\u0001\u0000\u0000\u0000\u0127"+
		"\u0128\u0001\u0000\u0000\u0000\u0128+\u0001\u0000\u0000\u0000\u0129\u012a"+
		"\u0005 \u0000\u0000\u012a\u012b\u0005\u0003\u0000\u0000\u012b\u012c\u0003"+
		"2\u0019\u0000\u012c\u012d\u0005\u0005\u0000\u0000\u012d\u012e\u0005\u0011"+
		"\u0000\u0000\u012e\u0130\u0003\u0004\u0002\u0000\u012f\u0131\u0005\u0001"+
		"\u0000\u0000\u0130\u012f\u0001\u0000\u0000\u0000\u0131\u0132\u0001\u0000"+
		"\u0000\u0000\u0132\u0130\u0001\u0000\u0000\u0000\u0132\u0133\u0001\u0000"+
		"\u0000\u0000\u0133\u0134\u0001\u0000\u0000\u0000\u0134\u0135\u0005\u0012"+
		"\u0000\u0000\u0135-\u0001\u0000\u0000\u0000\u0136\u0137\u0005!\u0000\u0000"+
		"\u0137\u0138\u0005\u0003\u0000\u0000\u0138\u0139\u00032\u0019\u0000\u0139"+
		"\u013a\u0005\u0005\u0000\u0000\u013a\u013b\u0005\u0011\u0000\u0000\u013b"+
		"\u013d\u0003\u0004\u0002\u0000\u013c\u013e\u0005\u0001\u0000\u0000\u013d"+
		"\u013c\u0001\u0000\u0000\u0000\u013e\u013f\u0001\u0000\u0000\u0000\u013f"+
		"\u013d\u0001\u0000\u0000\u0000\u013f\u0140\u0001\u0000\u0000\u0000\u0140"+
		"\u0141\u0001\u0000\u0000\u0000\u0141\u0142\u0005\u0012\u0000\u0000\u0142"+
		"\u0144\u0001\u0000\u0000\u0000\u0143\u0136\u0001\u0000\u0000\u0000\u0144"+
		"\u0145\u0001\u0000\u0000\u0000\u0145\u0143\u0001\u0000\u0000\u0000\u0145"+
		"\u0146\u0001\u0000\u0000\u0000\u0146/\u0001\u0000\u0000\u0000\u0147\u0148"+
		"\u0005\"\u0000\u0000\u0148\u0149\u0005\u0011\u0000\u0000\u0149\u014b\u0003"+
		"\u0004\u0002\u0000\u014a\u014c\u0005\u0001\u0000\u0000\u014b\u014a\u0001"+
		"\u0000\u0000\u0000\u014c\u014d\u0001\u0000\u0000\u0000\u014d\u014b\u0001"+
		"\u0000\u0000\u0000\u014d\u014e\u0001\u0000\u0000\u0000\u014e\u014f\u0001"+
		"\u0000\u0000\u0000\u014f\u0150\u0005\u0012\u0000\u0000\u01501\u0001\u0000"+
		"\u0000\u0000\u0151\u0152\u0006\u0019\uffff\uffff\u0000\u0152\u0153\u0005"+
		"\u0004\u0000\u0000\u0153\u0167\u00053\u0000\u0000\u0154\u0155\u0005\u0003"+
		"\u0000\u0000\u0155\u0156\u00032\u0019\u0000\u0156\u0157\u0005\u0005\u0000"+
		"\u0000\u0157\u0167\u0001\u0000\u0000\u0000\u0158\u0159\u00050\u0000\u0000"+
		"\u0159\u015a\u0005\u001b\u0000\u0000\u015a\u015b\u0007\u0001\u0000\u0000"+
		"\u015b\u0167\u0005\u001c\u0000\u0000\u015c\u0167\u00050\u0000\u0000\u015d"+
		"\u015e\u00034\u001a\u0000\u015e\u015f\u0005\u0003\u0000\u0000\u015f\u0160"+
		"\u00032\u0019\u0000\u0160\u0161\u0005\u0005\u0000\u0000\u0161\u0167\u0001"+
		"\u0000\u0000\u0000\u0162\u0167\u00052\u0000\u0000\u0163\u0167\u00051\u0000"+
		"\u0000\u0164\u0167\u00053\u0000\u0000\u0165\u0167\u00054\u0000\u0000\u0166"+
		"\u0151\u0001\u0000\u0000\u0000\u0166\u0154\u0001\u0000\u0000\u0000\u0166"+
		"\u0158\u0001\u0000\u0000\u0000\u0166\u015c\u0001\u0000\u0000\u0000\u0166"+
		"\u015d\u0001\u0000\u0000\u0000\u0166\u0162\u0001\u0000\u0000\u0000\u0166"+
		"\u0163\u0001\u0000\u0000\u0000\u0166\u0164\u0001\u0000\u0000\u0000\u0166"+
		"\u0165\u0001\u0000\u0000\u0000\u0167\u0176\u0001\u0000\u0000\u0000\u0168"+
		"\u0169\n\f\u0000\u0000\u0169\u016a\u0007\u0002\u0000\u0000\u016a\u0175"+
		"\u00032\u0019\r\u016b\u016c\n\u000b\u0000\u0000\u016c\u016d\u0007\u0003"+
		"\u0000\u0000\u016d\u0175\u00032\u0019\f\u016e\u016f\n\n\u0000\u0000\u016f"+
		"\u0170\u0007\u0004\u0000\u0000\u0170\u0175\u00032\u0019\u000b\u0171\u0172"+
		"\n\t\u0000\u0000\u0172\u0173\u0007\u0005\u0000\u0000\u0173\u0175\u0003"+
		"2\u0019\n\u0174\u0168\u0001\u0000\u0000\u0000\u0174\u016b\u0001\u0000"+
		"\u0000\u0000\u0174\u016e\u0001\u0000\u0000\u0000\u0174\u0171\u0001\u0000"+
		"\u0000\u0000\u0175\u0178\u0001\u0000\u0000\u0000\u0176\u0174\u0001\u0000"+
		"\u0000\u0000\u0176\u0177\u0001\u0000\u0000\u0000\u01773\u0001\u0000\u0000"+
		"\u0000\u0178\u0176\u0001\u0000\u0000\u0000\u0179\u0183\u0005-\u0000\u0000"+
		"\u017a\u0183\u0005.\u0000\u0000\u017b\u0183\u0005\t\u0000\u0000\u017c"+
		"\u017d\u0005\u001e\u0000\u0000\u017d\u017e\u0005\u001b\u0000\u0000\u017e"+
		"\u017f\u00050\u0000\u0000\u017f\u0183\u0005\u001c\u0000\u0000\u0180\u0183"+
		"\u0005/\u0000\u0000\u0181\u0183\u00050\u0000\u0000\u0182\u0179\u0001\u0000"+
		"\u0000\u0000\u0182\u017a\u0001\u0000\u0000\u0000\u0182\u017b\u0001\u0000"+
		"\u0000\u0000\u0182\u017c\u0001\u0000\u0000\u0000\u0182\u0180\u0001\u0000"+
		"\u0000\u0000\u0182\u0181\u0001\u0000\u0000\u0000\u01835\u0001\u0000\u0000"+
		"\u0000\u0184\u0185\u0007\u0006\u0000\u0000\u01857\u0001\u0000\u0000\u0000"+
		"%<AU[^afjvy~\u0082\u008a\u0092\u009b\u00ab\u00b3\u00c1\u00cc\u00e4\u00e7"+
		"\u00f0\u00fd\u0102\u010a\u011c\u0121\u0124\u0127\u0132\u013f\u0145\u014d"+
		"\u0166\u0174\u0176\u0182";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
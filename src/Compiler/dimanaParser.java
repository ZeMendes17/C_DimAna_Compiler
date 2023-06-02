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
		T__38=39, T__39=40, T__40=41, ID=42, INT=43, REAL=44, STRING=45, BOOL=46, 
		WS=47, LINE_COMMENT=48, ERROR=49;
	public static final int
		RULE_program = 0, RULE_statList = 1, RULE_statement = 2, RULE_variableDeclaration = 3, 
		RULE_readToArray = 4, RULE_assignment = 5, RULE_inputStatement = 6, RULE_outputStatement = 7, 
		RULE_outputFormat = 8, RULE_write_expr = 9, RULE_loopStatement = 10, RULE_length = 11, 
		RULE_headerFile = 12, RULE_prefixUnit = 13, RULE_unit = 14, RULE_alternativeUnit = 15, 
		RULE_listDeclaration = 16, RULE_condicional = 17, RULE_expression = 18, 
		RULE_dataType = 19, RULE_castTypes = 20;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statList", "statement", "variableDeclaration", "readToArray", 
			"assignment", "inputStatement", "outputStatement", "outputFormat", "write_expr", 
			"loopStatement", "length", "headerFile", "prefixUnit", "unit", "alternativeUnit", 
			"listDeclaration", "condicional", "expression", "dataType", "castTypes"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'='", "'('", "'read'", "')'", "'*'", "'>>'", "','", "'string'", 
			"'write'", "'writeln'", "'for'", "'to'", "'do'", "'end'", "'length'", 
			"'use'", "'prefix'", "'1e'", "'-'", "'dimension'", "'['", "']'", "'unit'", 
			"'list'", "'new'", "'if'", "'{'", "'}'", "'else'", "'/'", "'+'", "'=='", 
			"'!='", "'<'", "'>'", "'>='", "'<='", "'integer'", "'real'", "'bool'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "ID", "INT", "REAL", "STRING", "BOOL", 
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
			setState(42);
			statList();
			setState(43);
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
			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8246390038042L) != 0)) {
				{
				{
				setState(46);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8246390038040L) != 0)) {
					{
					setState(45);
					statement();
					}
				}

				setState(48);
				match(T__0);
				}
				}
				setState(53);
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
			setState(65);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(54);
				inputStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(55);
				assignment();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(56);
				readToArray();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(57);
				variableDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(58);
				outputStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(59);
				loopStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(60);
				headerFile();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(61);
				prefixUnit();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(62);
				unit();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(63);
				alternativeUnit();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(64);
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
			setState(67);
			dataType();
			setState(68);
			match(ID);
			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(69);
				match(T__1);
				setState(70);
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
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__38 || _la==T__39) {
				{
				setState(73);
				castTypes();
				}
			}

			setState(77);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(76);
				match(T__2);
				}
			}

			setState(79);
			match(T__3);
			setState(80);
			match(STRING);
			setState(82);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(81);
				match(T__4);
				}
			}

			setState(86);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(84);
				match(T__5);
				setState(85);
				match(ID);
				}
			}

			setState(88);
			match(T__6);
			setState(89);
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
			setState(91);
			match(ID);
			setState(92);
			match(T__1);
			setState(93);
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
			setState(95);
			match(ID);
			setState(96);
			match(T__1);
			setState(98);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8246370763264L) != 0)) {
				{
				setState(97);
				dataType();
				}
			}

			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(100);
				match(T__2);
				}
			}

			setState(103);
			match(T__3);
			setState(104);
			match(STRING);
			setState(106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(105);
				match(T__4);
				}
			}

			setState(110);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(108);
				match(T__5);
				setState(109);
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
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			write_expr();
			setState(113);
			outputFormat();
			setState(118);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(114);
					match(T__7);
					setState(115);
					outputFormat();
					}
					} 
				}
				setState(120);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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
			setState(135);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(121);
				match(T__8);
				setState(122);
				match(T__2);
				setState(126);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(123);
					match(ID);
					}
					break;
				case 2:
					{
					setState(124);
					match(STRING);
					}
					break;
				case 3:
					{
					setState(125);
					expression(0);
					}
					break;
				}
				setState(128);
				match(T__7);
				setState(129);
				match(INT);
				setState(130);
				match(T__4);
				}
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(131);
				match(STRING);
				setState(132);
				match(T__7);
				setState(133);
				match(ID);
				}
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(134);
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
			setState(137);
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
		enterRule(_localctx, 20, RULE_loopStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			match(T__11);
			setState(140);
			match(ID);
			setState(141);
			match(T__1);
			setState(142);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==INT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(143);
			match(T__12);
			setState(151);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				{
				setState(144);
				match(INT);
				}
				break;
			case ID:
				{
				setState(145);
				match(ID);
				}
				break;
			case T__15:
				{
				setState(146);
				length();
				setState(147);
				match(T__2);
				setState(148);
				match(ID);
				setState(149);
				match(T__4);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(153);
			match(T__13);
			{
			setState(159);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 140187766099480L) != 0)) {
				{
				{
				setState(154);
				expression(0);
				setState(155);
				match(T__0);
				}
				}
				setState(161);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			setState(162);
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
		enterRule(_localctx, 22, RULE_length);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
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
		enterRule(_localctx, 24, RULE_headerFile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			match(T__16);
			setState(167);
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
		enterRule(_localctx, 26, RULE_prefixUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			match(T__17);
			setState(170);
			dataType();
			setState(171);
			match(ID);
			setState(172);
			match(T__1);
			setState(179);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				{
				setState(173);
				match(INT);
				}
				break;
			case T__18:
				{
				setState(174);
				match(T__18);
				setState(176);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__19) {
					{
					setState(175);
					((PrefixUnitContext)_localctx).minus = match(T__19);
					}
				}

				setState(178);
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
		enterRule(_localctx, 28, RULE_unit);
		int _la;
		try {
			setState(206);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				_localctx = new IndependentUnitContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(181);
				match(T__20);
				setState(182);
				dataType();
				setState(183);
				match(ID);
				{
				setState(184);
				match(T__21);
				setState(185);
				match(ID);
				setState(188);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__7) {
					{
					setState(186);
					match(T__7);
					setState(187);
					match(ID);
					}
				}

				setState(190);
				match(T__22);
				}
				}
				break;
			case 2:
				_localctx = new DependantUnitContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(192);
				match(T__20);
				setState(193);
				dataType();
				setState(194);
				match(ID);
				{
				setState(201);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__21) {
					{
					setState(195);
					match(T__21);
					setState(196);
					match(ID);
					{
					setState(197);
					match(T__7);
					setState(198);
					match(ID);
					}
					setState(200);
					match(T__22);
					}
				}

				setState(203);
				match(T__1);
				setState(204);
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
		enterRule(_localctx, 30, RULE_alternativeUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			match(T__23);
			setState(209);
			match(ID);
			setState(210);
			match(T__21);
			setState(211);
			match(ID);
			setState(214);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(212);
				match(T__7);
				setState(213);
				match(ID);
				}
			}

			setState(216);
			match(T__22);
			setState(217);
			match(T__1);
			setState(218);
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
		enterRule(_localctx, 32, RULE_listDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			match(T__24);
			setState(221);
			match(T__21);
			setState(222);
			dataType();
			setState(223);
			match(T__22);
			setState(224);
			match(ID);
			setState(232);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(225);
				match(T__1);
				setState(226);
				match(T__25);
				setState(227);
				match(T__24);
				setState(228);
				match(T__21);
				setState(229);
				dataType();
				setState(230);
				match(T__22);
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
	public static class CondicionalContext extends ParserRuleContext {
		public StatListContext trueBlock;
		public StatListContext falseBlock;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<StatListContext> statList() {
			return getRuleContexts(StatListContext.class);
		}
		public StatListContext statList(int i) {
			return getRuleContext(StatListContext.class,i);
		}
		public CondicionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dimanaListener ) ((dimanaListener)listener).enterCondicional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dimanaListener ) ((dimanaListener)listener).exitCondicional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dimanaVisitor ) return ((dimanaVisitor<? extends T>)visitor).visitCondicional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondicionalContext condicional() throws RecognitionException {
		CondicionalContext _localctx = new CondicionalContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_condicional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			match(T__26);
			setState(235);
			match(T__2);
			setState(236);
			expression(0);
			setState(237);
			match(T__4);
			setState(238);
			match(T__27);
			setState(239);
			((CondicionalContext)_localctx).trueBlock = statList();
			setState(240);
			match(T__28);
			setState(246);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__29) {
				{
				setState(241);
				match(T__29);
				setState(242);
				match(T__27);
				setState(243);
				((CondicionalContext)_localctx).falseBlock = statList();
				setState(244);
				match(T__28);
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
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				_localctx = new InputExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(249);
				match(T__3);
				setState(250);
				match(STRING);
				}
				break;
			case 2:
				{
				_localctx = new InputTypeExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(252);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__38 || _la==T__39) {
					{
					setState(251);
					castTypes();
					}
				}

				setState(255);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__2) {
					{
					setState(254);
					match(T__2);
					}
				}

				setState(257);
				match(T__3);
				setState(258);
				match(STRING);
				setState(260);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__4) {
					{
					setState(259);
					match(T__4);
					}
				}

				setState(264);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__5) {
					{
					setState(262);
					match(T__5);
					setState(263);
					match(ID);
					}
				}

				setState(266);
				match(T__6);
				setState(267);
				match(ID);
				}
				break;
			case 3:
				{
				_localctx = new ParenExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(268);
				match(T__2);
				setState(269);
				expression(0);
				setState(270);
				match(T__4);
				}
				break;
			case 4:
				{
				_localctx = new OutputExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(272);
				outputStatement();
				}
				break;
			case 5:
				{
				_localctx = new IndexExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(273);
				match(ID);
				setState(274);
				match(T__21);
				setState(275);
				_la = _input.LA(1);
				if ( !(_la==ID || _la==INT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(276);
				match(T__22);
				}
				break;
			case 6:
				{
				_localctx = new IdExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(277);
				match(ID);
				}
				break;
			case 7:
				{
				_localctx = new TypeConversionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(278);
				dataType();
				setState(279);
				match(T__2);
				setState(280);
				expression(0);
				setState(281);
				match(T__4);
				}
				break;
			case 8:
				{
				_localctx = new RealLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(283);
				match(REAL);
				}
				break;
			case 9:
				{
				_localctx = new IntLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(284);
				match(INT);
				}
				break;
			case 10:
				{
				_localctx = new StringLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(285);
				match(STRING);
				}
				break;
			case 11:
				{
				_localctx = new BoolLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(286);
				match(BOOL);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(300);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(298);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
					case 1:
						{
						_localctx = new MulDivExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(289);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(290);
						((MulDivExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__5 || _la==T__30) ) {
							((MulDivExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(291);
						expression(13);
						}
						break;
					case 2:
						{
						_localctx = new AddSubExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(292);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(293);
						((AddSubExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__19 || _la==T__31) ) {
							((AddSubExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(294);
						expression(12);
						}
						break;
					case 3:
						{
						_localctx = new ConditionalExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((ConditionalExpressionContext)_localctx).e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(295);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(296);
						((ConditionalExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 541165879296L) != 0)) ) {
							((ConditionalExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(297);
						((ConditionalExpressionContext)_localctx).e2 = expression(11);
						}
						break;
					}
					} 
				}
				setState(302);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
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
		enterRule(_localctx, 38, RULE_dataType);
		try {
			setState(312);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__38:
				enterOuterAlt(_localctx, 1);
				{
				setState(303);
				match(T__38);
				}
				break;
			case T__39:
				enterOuterAlt(_localctx, 2);
				{
				setState(304);
				match(T__39);
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 3);
				{
				setState(305);
				match(T__8);
				}
				break;
			case T__24:
				enterOuterAlt(_localctx, 4);
				{
				setState(306);
				match(T__24);
				setState(307);
				match(T__21);
				setState(308);
				match(ID);
				setState(309);
				match(T__22);
				}
				break;
			case T__40:
				enterOuterAlt(_localctx, 5);
				{
				setState(310);
				match(T__40);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 6);
				{
				setState(311);
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
		enterRule(_localctx, 40, RULE_castTypes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(314);
			_la = _input.LA(1);
			if ( !(_la==T__38 || _la==T__39) ) {
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
		case 18:
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
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u00011\u013d\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0003\u0001/\b\u0001\u0001\u0001\u0005\u0001"+
		"2\b\u0001\n\u0001\f\u00015\t\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0003\u0002B\b\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0003\u0003H\b\u0003\u0001\u0004\u0003\u0004"+
		"K\b\u0004\u0001\u0004\u0003\u0004N\b\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0003\u0004S\b\u0004\u0001\u0004\u0001\u0004\u0003\u0004W\b\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006c\b\u0006"+
		"\u0001\u0006\u0003\u0006f\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0003\u0006k\b\u0006\u0001\u0006\u0001\u0006\u0003\u0006o\b\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007u\b\u0007\n\u0007"+
		"\f\u0007x\t\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u007f"+
		"\b\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u0088"+
		"\b\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u0098\b\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0005\n\u009e\b\n\n\n\f\n\u00a1\t\n\u0001\n\u0001\n"+
		"\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u00b1\b\r\u0001\r\u0003\r\u00b4"+
		"\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0003\u000e\u00bd\b\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u00ca\b\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0003\u000e\u00cf\b\u000e\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u00d7\b\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u00e9\b\u0010\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003"+
		"\u0011\u00f7\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003"+
		"\u0012\u00fd\b\u0012\u0001\u0012\u0003\u0012\u0100\b\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0003\u0012\u0105\b\u0012\u0001\u0012\u0001\u0012"+
		"\u0003\u0012\u0109\b\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012"+
		"\u0120\b\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0005\u0012\u012b\b\u0012"+
		"\n\u0012\f\u0012\u012e\t\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003"+
		"\u0013\u0139\b\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0000\u0001$"+
		"\u0015\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018"+
		"\u001a\u001c\u001e \"$&(\u0000\u0006\u0001\u0000\n\u000b\u0001\u0000*"+
		"+\u0002\u0000\u0006\u0006\u001f\u001f\u0002\u0000\u0014\u0014  \u0001"+
		"\u0000!&\u0001\u0000\'(\u0162\u0000*\u0001\u0000\u0000\u0000\u00023\u0001"+
		"\u0000\u0000\u0000\u0004A\u0001\u0000\u0000\u0000\u0006C\u0001\u0000\u0000"+
		"\u0000\bJ\u0001\u0000\u0000\u0000\n[\u0001\u0000\u0000\u0000\f_\u0001"+
		"\u0000\u0000\u0000\u000ep\u0001\u0000\u0000\u0000\u0010\u0087\u0001\u0000"+
		"\u0000\u0000\u0012\u0089\u0001\u0000\u0000\u0000\u0014\u008b\u0001\u0000"+
		"\u0000\u0000\u0016\u00a4\u0001\u0000\u0000\u0000\u0018\u00a6\u0001\u0000"+
		"\u0000\u0000\u001a\u00a9\u0001\u0000\u0000\u0000\u001c\u00ce\u0001\u0000"+
		"\u0000\u0000\u001e\u00d0\u0001\u0000\u0000\u0000 \u00dc\u0001\u0000\u0000"+
		"\u0000\"\u00ea\u0001\u0000\u0000\u0000$\u011f\u0001\u0000\u0000\u0000"+
		"&\u0138\u0001\u0000\u0000\u0000(\u013a\u0001\u0000\u0000\u0000*+\u0003"+
		"\u0002\u0001\u0000+,\u0005\u0000\u0000\u0001,\u0001\u0001\u0000\u0000"+
		"\u0000-/\u0003\u0004\u0002\u0000.-\u0001\u0000\u0000\u0000./\u0001\u0000"+
		"\u0000\u0000/0\u0001\u0000\u0000\u000002\u0005\u0001\u0000\u00001.\u0001"+
		"\u0000\u0000\u000025\u0001\u0000\u0000\u000031\u0001\u0000\u0000\u0000"+
		"34\u0001\u0000\u0000\u00004\u0003\u0001\u0000\u0000\u000053\u0001\u0000"+
		"\u0000\u00006B\u0003\f\u0006\u00007B\u0003\n\u0005\u00008B\u0003\b\u0004"+
		"\u00009B\u0003\u0006\u0003\u0000:B\u0003\u000e\u0007\u0000;B\u0003\u0014"+
		"\n\u0000<B\u0003\u0018\f\u0000=B\u0003\u001a\r\u0000>B\u0003\u001c\u000e"+
		"\u0000?B\u0003\u001e\u000f\u0000@B\u0003 \u0010\u0000A6\u0001\u0000\u0000"+
		"\u0000A7\u0001\u0000\u0000\u0000A8\u0001\u0000\u0000\u0000A9\u0001\u0000"+
		"\u0000\u0000A:\u0001\u0000\u0000\u0000A;\u0001\u0000\u0000\u0000A<\u0001"+
		"\u0000\u0000\u0000A=\u0001\u0000\u0000\u0000A>\u0001\u0000\u0000\u0000"+
		"A?\u0001\u0000\u0000\u0000A@\u0001\u0000\u0000\u0000B\u0005\u0001\u0000"+
		"\u0000\u0000CD\u0003&\u0013\u0000DG\u0005*\u0000\u0000EF\u0005\u0002\u0000"+
		"\u0000FH\u0003$\u0012\u0000GE\u0001\u0000\u0000\u0000GH\u0001\u0000\u0000"+
		"\u0000H\u0007\u0001\u0000\u0000\u0000IK\u0003(\u0014\u0000JI\u0001\u0000"+
		"\u0000\u0000JK\u0001\u0000\u0000\u0000KM\u0001\u0000\u0000\u0000LN\u0005"+
		"\u0003\u0000\u0000ML\u0001\u0000\u0000\u0000MN\u0001\u0000\u0000\u0000"+
		"NO\u0001\u0000\u0000\u0000OP\u0005\u0004\u0000\u0000PR\u0005-\u0000\u0000"+
		"QS\u0005\u0005\u0000\u0000RQ\u0001\u0000\u0000\u0000RS\u0001\u0000\u0000"+
		"\u0000SV\u0001\u0000\u0000\u0000TU\u0005\u0006\u0000\u0000UW\u0005*\u0000"+
		"\u0000VT\u0001\u0000\u0000\u0000VW\u0001\u0000\u0000\u0000WX\u0001\u0000"+
		"\u0000\u0000XY\u0005\u0007\u0000\u0000YZ\u0005*\u0000\u0000Z\t\u0001\u0000"+
		"\u0000\u0000[\\\u0005*\u0000\u0000\\]\u0005\u0002\u0000\u0000]^\u0003"+
		"$\u0012\u0000^\u000b\u0001\u0000\u0000\u0000_`\u0005*\u0000\u0000`b\u0005"+
		"\u0002\u0000\u0000ac\u0003&\u0013\u0000ba\u0001\u0000\u0000\u0000bc\u0001"+
		"\u0000\u0000\u0000ce\u0001\u0000\u0000\u0000df\u0005\u0003\u0000\u0000"+
		"ed\u0001\u0000\u0000\u0000ef\u0001\u0000\u0000\u0000fg\u0001\u0000\u0000"+
		"\u0000gh\u0005\u0004\u0000\u0000hj\u0005-\u0000\u0000ik\u0005\u0005\u0000"+
		"\u0000ji\u0001\u0000\u0000\u0000jk\u0001\u0000\u0000\u0000kn\u0001\u0000"+
		"\u0000\u0000lm\u0005\u0006\u0000\u0000mo\u0005*\u0000\u0000nl\u0001\u0000"+
		"\u0000\u0000no\u0001\u0000\u0000\u0000o\r\u0001\u0000\u0000\u0000pq\u0003"+
		"\u0012\t\u0000qv\u0003\u0010\b\u0000rs\u0005\b\u0000\u0000su\u0003\u0010"+
		"\b\u0000tr\u0001\u0000\u0000\u0000ux\u0001\u0000\u0000\u0000vt\u0001\u0000"+
		"\u0000\u0000vw\u0001\u0000\u0000\u0000w\u000f\u0001\u0000\u0000\u0000"+
		"xv\u0001\u0000\u0000\u0000yz\u0005\t\u0000\u0000z~\u0005\u0003\u0000\u0000"+
		"{\u007f\u0005*\u0000\u0000|\u007f\u0005-\u0000\u0000}\u007f\u0003$\u0012"+
		"\u0000~{\u0001\u0000\u0000\u0000~|\u0001\u0000\u0000\u0000~}\u0001\u0000"+
		"\u0000\u0000\u007f\u0080\u0001\u0000\u0000\u0000\u0080\u0081\u0005\b\u0000"+
		"\u0000\u0081\u0082\u0005+\u0000\u0000\u0082\u0088\u0005\u0005\u0000\u0000"+
		"\u0083\u0084\u0005-\u0000\u0000\u0084\u0085\u0005\b\u0000\u0000\u0085"+
		"\u0088\u0005*\u0000\u0000\u0086\u0088\u0005*\u0000\u0000\u0087y\u0001"+
		"\u0000\u0000\u0000\u0087\u0083\u0001\u0000\u0000\u0000\u0087\u0086\u0001"+
		"\u0000\u0000\u0000\u0088\u0011\u0001\u0000\u0000\u0000\u0089\u008a\u0007"+
		"\u0000\u0000\u0000\u008a\u0013\u0001\u0000\u0000\u0000\u008b\u008c\u0005"+
		"\f\u0000\u0000\u008c\u008d\u0005*\u0000\u0000\u008d\u008e\u0005\u0002"+
		"\u0000\u0000\u008e\u008f\u0007\u0001\u0000\u0000\u008f\u0097\u0005\r\u0000"+
		"\u0000\u0090\u0098\u0005+\u0000\u0000\u0091\u0098\u0005*\u0000\u0000\u0092"+
		"\u0093\u0003\u0016\u000b\u0000\u0093\u0094\u0005\u0003\u0000\u0000\u0094"+
		"\u0095\u0005*\u0000\u0000\u0095\u0096\u0005\u0005\u0000\u0000\u0096\u0098"+
		"\u0001\u0000\u0000\u0000\u0097\u0090\u0001\u0000\u0000\u0000\u0097\u0091"+
		"\u0001\u0000\u0000\u0000\u0097\u0092\u0001\u0000\u0000\u0000\u0098\u0099"+
		"\u0001\u0000\u0000\u0000\u0099\u009f\u0005\u000e\u0000\u0000\u009a\u009b"+
		"\u0003$\u0012\u0000\u009b\u009c\u0005\u0001\u0000\u0000\u009c\u009e\u0001"+
		"\u0000\u0000\u0000\u009d\u009a\u0001\u0000\u0000\u0000\u009e\u00a1\u0001"+
		"\u0000\u0000\u0000\u009f\u009d\u0001\u0000\u0000\u0000\u009f\u00a0\u0001"+
		"\u0000\u0000\u0000\u00a0\u00a2\u0001\u0000\u0000\u0000\u00a1\u009f\u0001"+
		"\u0000\u0000\u0000\u00a2\u00a3\u0005\u000f\u0000\u0000\u00a3\u0015\u0001"+
		"\u0000\u0000\u0000\u00a4\u00a5\u0005\u0010\u0000\u0000\u00a5\u0017\u0001"+
		"\u0000\u0000\u0000\u00a6\u00a7\u0005\u0011\u0000\u0000\u00a7\u00a8\u0005"+
		"-\u0000\u0000\u00a8\u0019\u0001\u0000\u0000\u0000\u00a9\u00aa\u0005\u0012"+
		"\u0000\u0000\u00aa\u00ab\u0003&\u0013\u0000\u00ab\u00ac\u0005*\u0000\u0000"+
		"\u00ac\u00b3\u0005\u0002\u0000\u0000\u00ad\u00b4\u0005+\u0000\u0000\u00ae"+
		"\u00b0\u0005\u0013\u0000\u0000\u00af\u00b1\u0005\u0014\u0000\u0000\u00b0"+
		"\u00af\u0001\u0000\u0000\u0000\u00b0\u00b1\u0001\u0000\u0000\u0000\u00b1"+
		"\u00b2\u0001\u0000\u0000\u0000\u00b2\u00b4\u0005+\u0000\u0000\u00b3\u00ad"+
		"\u0001\u0000\u0000\u0000\u00b3\u00ae\u0001\u0000\u0000\u0000\u00b4\u001b"+
		"\u0001\u0000\u0000\u0000\u00b5\u00b6\u0005\u0015\u0000\u0000\u00b6\u00b7"+
		"\u0003&\u0013\u0000\u00b7\u00b8\u0005*\u0000\u0000\u00b8\u00b9\u0005\u0016"+
		"\u0000\u0000\u00b9\u00bc\u0005*\u0000\u0000\u00ba\u00bb\u0005\b\u0000"+
		"\u0000\u00bb\u00bd\u0005*\u0000\u0000\u00bc\u00ba\u0001\u0000\u0000\u0000"+
		"\u00bc\u00bd\u0001\u0000\u0000\u0000\u00bd\u00be\u0001\u0000\u0000\u0000"+
		"\u00be\u00bf\u0005\u0017\u0000\u0000\u00bf\u00cf\u0001\u0000\u0000\u0000"+
		"\u00c0\u00c1\u0005\u0015\u0000\u0000\u00c1\u00c2\u0003&\u0013\u0000\u00c2"+
		"\u00c9\u0005*\u0000\u0000\u00c3\u00c4\u0005\u0016\u0000\u0000\u00c4\u00c5"+
		"\u0005*\u0000\u0000\u00c5\u00c6\u0005\b\u0000\u0000\u00c6\u00c7\u0005"+
		"*\u0000\u0000\u00c7\u00c8\u0001\u0000\u0000\u0000\u00c8\u00ca\u0005\u0017"+
		"\u0000\u0000\u00c9\u00c3\u0001\u0000\u0000\u0000\u00c9\u00ca\u0001\u0000"+
		"\u0000\u0000\u00ca\u00cb\u0001\u0000\u0000\u0000\u00cb\u00cc\u0005\u0002"+
		"\u0000\u0000\u00cc\u00cd\u0003$\u0012\u0000\u00cd\u00cf\u0001\u0000\u0000"+
		"\u0000\u00ce\u00b5\u0001\u0000\u0000\u0000\u00ce\u00c0\u0001\u0000\u0000"+
		"\u0000\u00cf\u001d\u0001\u0000\u0000\u0000\u00d0\u00d1\u0005\u0018\u0000"+
		"\u0000\u00d1\u00d2\u0005*\u0000\u0000\u00d2\u00d3\u0005\u0016\u0000\u0000"+
		"\u00d3\u00d6\u0005*\u0000\u0000\u00d4\u00d5\u0005\b\u0000\u0000\u00d5"+
		"\u00d7\u0005*\u0000\u0000\u00d6\u00d4\u0001\u0000\u0000\u0000\u00d6\u00d7"+
		"\u0001\u0000\u0000\u0000\u00d7\u00d8\u0001\u0000\u0000\u0000\u00d8\u00d9"+
		"\u0005\u0017\u0000\u0000\u00d9\u00da\u0005\u0002\u0000\u0000\u00da\u00db"+
		"\u0003$\u0012\u0000\u00db\u001f\u0001\u0000\u0000\u0000\u00dc\u00dd\u0005"+
		"\u0019\u0000\u0000\u00dd\u00de\u0005\u0016\u0000\u0000\u00de\u00df\u0003"+
		"&\u0013\u0000\u00df\u00e0\u0005\u0017\u0000\u0000\u00e0\u00e8\u0005*\u0000"+
		"\u0000\u00e1\u00e2\u0005\u0002\u0000\u0000\u00e2\u00e3\u0005\u001a\u0000"+
		"\u0000\u00e3\u00e4\u0005\u0019\u0000\u0000\u00e4\u00e5\u0005\u0016\u0000"+
		"\u0000\u00e5\u00e6\u0003&\u0013\u0000\u00e6\u00e7\u0005\u0017\u0000\u0000"+
		"\u00e7\u00e9\u0001\u0000\u0000\u0000\u00e8\u00e1\u0001\u0000\u0000\u0000"+
		"\u00e8\u00e9\u0001\u0000\u0000\u0000\u00e9!\u0001\u0000\u0000\u0000\u00ea"+
		"\u00eb\u0005\u001b\u0000\u0000\u00eb\u00ec\u0005\u0003\u0000\u0000\u00ec"+
		"\u00ed\u0003$\u0012\u0000\u00ed\u00ee\u0005\u0005\u0000\u0000\u00ee\u00ef"+
		"\u0005\u001c\u0000\u0000\u00ef\u00f0\u0003\u0002\u0001\u0000\u00f0\u00f6"+
		"\u0005\u001d\u0000\u0000\u00f1\u00f2\u0005\u001e\u0000\u0000\u00f2\u00f3"+
		"\u0005\u001c\u0000\u0000\u00f3\u00f4\u0003\u0002\u0001\u0000\u00f4\u00f5"+
		"\u0005\u001d\u0000\u0000\u00f5\u00f7\u0001\u0000\u0000\u0000\u00f6\u00f1"+
		"\u0001\u0000\u0000\u0000\u00f6\u00f7\u0001\u0000\u0000\u0000\u00f7#\u0001"+
		"\u0000\u0000\u0000\u00f8\u00f9\u0006\u0012\uffff\uffff\u0000\u00f9\u00fa"+
		"\u0005\u0004\u0000\u0000\u00fa\u0120\u0005-\u0000\u0000\u00fb\u00fd\u0003"+
		"(\u0014\u0000\u00fc\u00fb\u0001\u0000\u0000\u0000\u00fc\u00fd\u0001\u0000"+
		"\u0000\u0000\u00fd\u00ff\u0001\u0000\u0000\u0000\u00fe\u0100\u0005\u0003"+
		"\u0000\u0000\u00ff\u00fe\u0001\u0000\u0000\u0000\u00ff\u0100\u0001\u0000"+
		"\u0000\u0000\u0100\u0101\u0001\u0000\u0000\u0000\u0101\u0102\u0005\u0004"+
		"\u0000\u0000\u0102\u0104\u0005-\u0000\u0000\u0103\u0105\u0005\u0005\u0000"+
		"\u0000\u0104\u0103\u0001\u0000\u0000\u0000\u0104\u0105\u0001\u0000\u0000"+
		"\u0000\u0105\u0108\u0001\u0000\u0000\u0000\u0106\u0107\u0005\u0006\u0000"+
		"\u0000\u0107\u0109\u0005*\u0000\u0000\u0108\u0106\u0001\u0000\u0000\u0000"+
		"\u0108\u0109\u0001\u0000\u0000\u0000\u0109\u010a\u0001\u0000\u0000\u0000"+
		"\u010a\u010b\u0005\u0007\u0000\u0000\u010b\u0120\u0005*\u0000\u0000\u010c"+
		"\u010d\u0005\u0003\u0000\u0000\u010d\u010e\u0003$\u0012\u0000\u010e\u010f"+
		"\u0005\u0005\u0000\u0000\u010f\u0120\u0001\u0000\u0000\u0000\u0110\u0120"+
		"\u0003\u000e\u0007\u0000\u0111\u0112\u0005*\u0000\u0000\u0112\u0113\u0005"+
		"\u0016\u0000\u0000\u0113\u0114\u0007\u0001\u0000\u0000\u0114\u0120\u0005"+
		"\u0017\u0000\u0000\u0115\u0120\u0005*\u0000\u0000\u0116\u0117\u0003&\u0013"+
		"\u0000\u0117\u0118\u0005\u0003\u0000\u0000\u0118\u0119\u0003$\u0012\u0000"+
		"\u0119\u011a\u0005\u0005\u0000\u0000\u011a\u0120\u0001\u0000\u0000\u0000"+
		"\u011b\u0120\u0005,\u0000\u0000\u011c\u0120\u0005+\u0000\u0000\u011d\u0120"+
		"\u0005-\u0000\u0000\u011e\u0120\u0005.\u0000\u0000\u011f\u00f8\u0001\u0000"+
		"\u0000\u0000\u011f\u00fc\u0001\u0000\u0000\u0000\u011f\u010c\u0001\u0000"+
		"\u0000\u0000\u011f\u0110\u0001\u0000\u0000\u0000\u011f\u0111\u0001\u0000"+
		"\u0000\u0000\u011f\u0115\u0001\u0000\u0000\u0000\u011f\u0116\u0001\u0000"+
		"\u0000\u0000\u011f\u011b\u0001\u0000\u0000\u0000\u011f\u011c\u0001\u0000"+
		"\u0000\u0000\u011f\u011d\u0001\u0000\u0000\u0000\u011f\u011e\u0001\u0000"+
		"\u0000\u0000\u0120\u012c\u0001\u0000\u0000\u0000\u0121\u0122\n\f\u0000"+
		"\u0000\u0122\u0123\u0007\u0002\u0000\u0000\u0123\u012b\u0003$\u0012\r"+
		"\u0124\u0125\n\u000b\u0000\u0000\u0125\u0126\u0007\u0003\u0000\u0000\u0126"+
		"\u012b\u0003$\u0012\f\u0127\u0128\n\n\u0000\u0000\u0128\u0129\u0007\u0004"+
		"\u0000\u0000\u0129\u012b\u0003$\u0012\u000b\u012a\u0121\u0001\u0000\u0000"+
		"\u0000\u012a\u0124\u0001\u0000\u0000\u0000\u012a\u0127\u0001\u0000\u0000"+
		"\u0000\u012b\u012e\u0001\u0000\u0000\u0000\u012c\u012a\u0001\u0000\u0000"+
		"\u0000\u012c\u012d\u0001\u0000\u0000\u0000\u012d%\u0001\u0000\u0000\u0000"+
		"\u012e\u012c\u0001\u0000\u0000\u0000\u012f\u0139\u0005\'\u0000\u0000\u0130"+
		"\u0139\u0005(\u0000\u0000\u0131\u0139\u0005\t\u0000\u0000\u0132\u0133"+
		"\u0005\u0019\u0000\u0000\u0133\u0134\u0005\u0016\u0000\u0000\u0134\u0135"+
		"\u0005*\u0000\u0000\u0135\u0139\u0005\u0017\u0000\u0000\u0136\u0139\u0005"+
		")\u0000\u0000\u0137\u0139\u0005*\u0000\u0000\u0138\u012f\u0001\u0000\u0000"+
		"\u0000\u0138\u0130\u0001\u0000\u0000\u0000\u0138\u0131\u0001\u0000\u0000"+
		"\u0000\u0138\u0132\u0001\u0000\u0000\u0000\u0138\u0136\u0001\u0000\u0000"+
		"\u0000\u0138\u0137\u0001\u0000\u0000\u0000\u0139\'\u0001\u0000\u0000\u0000"+
		"\u013a\u013b\u0007\u0005\u0000\u0000\u013b)\u0001\u0000\u0000\u0000!."+
		"3AGJMRVbejnv~\u0087\u0097\u009f\u00b0\u00b3\u00bc\u00c9\u00ce\u00d6\u00e8"+
		"\u00f6\u00fc\u00ff\u0104\u0108\u011f\u012a\u012c\u0138";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
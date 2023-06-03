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
			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__3) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__13) | (1L << T__15) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__25) | (1L << T__28) | (1L << T__29) | (1L << T__31) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << ID))) != 0)) {
				{
				{
				setState(60);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__13) | (1L << T__15) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__25) | (1L << T__28) | (1L << T__29) | (1L << T__31) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << ID))) != 0)) {
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
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__29) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << ID))) != 0)) {
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

	public static class Write_exprContext extends ParserRuleContext {
		public Write_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_write_expr; }
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
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__13) | (1L << T__15) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__25) | (1L << T__28) | (1L << T__29) | (1L << T__31) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << ID))) != 0) );
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
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__13) | (1L << T__15) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__25) | (1L << T__28) | (1L << T__29) | (1L << T__31) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << ID))) != 0) );
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
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__13) | (1L << T__15) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__25) | (1L << T__28) | (1L << T__29) | (1L << T__31) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << ID))) != 0) );
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

	public static class LengthContext extends ParserRuleContext {
		public LengthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_length; }
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

	public static class BreakStatementContext extends ParserRuleContext {
		public BreakStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_breakStatement; }
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

	public static class ContinueStatementContext extends ParserRuleContext {
		public ContinueStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continueStatement; }
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

	public static class HeaderFileContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(dimanaParser.STRING, 0); }
		public HeaderFileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_headerFile; }
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
	public static class IndependentUnitContext extends UnitContext {
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(dimanaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(dimanaParser.ID, i);
		}
		public IndependentUnitContext(UnitContext ctx) { copyFrom(ctx); }
	}
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
	}
	public static class IndexExpressionContext extends ExpressionContext {
		public List<TerminalNode> ID() { return getTokens(dimanaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(dimanaParser.ID, i);
		}
		public TerminalNode INT() { return getToken(dimanaParser.INT, 0); }
		public IndexExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class InputExpressionContext extends ExpressionContext {
		public TerminalNode STRING() { return getToken(dimanaParser.STRING, 0); }
		public InputExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class AddSubExpressionContext extends ExpressionContext {
		public Token op;
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
	public static class BoolLiteralContext extends ExpressionContext {
		public TerminalNode BOOL() { return getToken(dimanaParser.BOOL, 0); }
		public BoolLiteralContext(ExpressionContext ctx) { copyFrom(ctx); }
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
	public static class AndOrExpressionContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public AndOrExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class MulDivExpressionContext extends ExpressionContext {
		public Token op;
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
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41))) != 0)) ) {
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

	public static class DataTypeContext extends ParserRuleContext {
		public String type;
		public TerminalNode ID() { return getToken(dimanaParser.ID, 0); }
		public DataTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataType; }
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

	public static class CastTypesContext extends ParserRuleContext {
		public CastTypesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_castTypes; }
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\39\u0189\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2\3\2\3\2\3\3\5\3?\n\3\3\3"+
		"\7\3B\n\3\f\3\16\3E\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\5\4X\n\4\3\5\3\5\3\5\3\5\5\5^\n\5\3\6\5\6a\n\6"+
		"\3\6\5\6d\n\6\3\6\3\6\3\6\5\6i\n\6\3\6\3\6\5\6m\n\6\3\6\3\6\3\6\3\7\3"+
		"\7\3\7\3\7\3\b\3\b\3\b\5\by\n\b\3\b\5\b|\n\b\3\b\3\b\3\b\5\b\u0081\n\b"+
		"\3\b\3\b\5\b\u0085\n\b\3\t\3\t\3\t\3\t\7\t\u008b\n\t\f\t\16\t\u008e\13"+
		"\t\3\n\3\n\3\n\3\n\3\n\5\n\u0095\n\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u009e"+
		"\n\n\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00ae"+
		"\n\f\3\f\3\f\3\f\3\f\6\f\u00b4\n\f\r\f\16\f\u00b5\3\f\3\f\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\6\r\u00c2\n\r\r\r\16\r\u00c3\3\r\3\r\3\16\3\16\3"+
		"\16\3\16\3\16\6\16\u00cd\n\16\r\16\16\16\u00ce\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\5\23\u00e7\n\23\3\23\5\23\u00ea\n\23\3\24\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\5\24\u00f3\n\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\5\24\u0100\n\24\3\24\3\24\3\24\5\24\u0105\n\24\3"+
		"\25\3\25\3\25\3\25\3\25\3\25\5\25\u010d\n\25\3\25\3\25\3\25\3\25\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u011f\n\26"+
		"\3\27\6\27\u0122\n\27\r\27\16\27\u0123\3\27\5\27\u0127\n\27\3\27\5\27"+
		"\u012a\n\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\6\30\u0133\n\30\r\30\16"+
		"\30\u0134\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\6\31\u0140\n\31"+
		"\r\31\16\31\u0141\3\31\3\31\6\31\u0146\n\31\r\31\16\31\u0147\3\32\3\32"+
		"\3\32\3\32\6\32\u014e\n\32\r\32\16\32\u014f\3\32\3\32\3\33\3\33\3\33\3"+
		"\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3"+
		"\33\3\33\3\33\3\33\5\33\u0169\n\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\7\33\u0177\n\33\f\33\16\33\u017a\13\33\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u0185\n\34\3\35\3\35\3\35"+
		"\2\3\64\36\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\66"+
		"8\2\t\3\2\f\r\3\2\62\63\4\2\b\b%%\4\2\33\33&&\3\2\',\3\2-.\3\2/\60\2\u01b0"+
		"\2:\3\2\2\2\4C\3\2\2\2\6W\3\2\2\2\bY\3\2\2\2\n`\3\2\2\2\fq\3\2\2\2\16"+
		"u\3\2\2\2\20\u0086\3\2\2\2\22\u009d\3\2\2\2\24\u009f\3\2\2\2\26\u00a1"+
		"\3\2\2\2\30\u00b9\3\2\2\2\32\u00c7\3\2\2\2\34\u00d6\3\2\2\2\36\u00d8\3"+
		"\2\2\2 \u00da\3\2\2\2\"\u00dc\3\2\2\2$\u00df\3\2\2\2&\u0104\3\2\2\2(\u0106"+
		"\3\2\2\2*\u0112\3\2\2\2,\u0121\3\2\2\2.\u012b\3\2\2\2\60\u0145\3\2\2\2"+
		"\62\u0149\3\2\2\2\64\u0168\3\2\2\2\66\u0184\3\2\2\28\u0186\3\2\2\2:;\5"+
		"\4\3\2;<\7\2\2\3<\3\3\2\2\2=?\5\6\4\2>=\3\2\2\2>?\3\2\2\2?@\3\2\2\2@B"+
		"\7\3\2\2A>\3\2\2\2BE\3\2\2\2CA\3\2\2\2CD\3\2\2\2D\5\3\2\2\2EC\3\2\2\2"+
		"FX\5\16\b\2GX\5\f\7\2HX\5\n\6\2IX\5\b\5\2JX\5,\27\2KX\5\20\t\2LX\5\26"+
		"\f\2MX\5\30\r\2NX\5\32\16\2OX\5\30\r\2PX\5\"\22\2QX\5$\23\2RX\5&\24\2"+
		"SX\5(\25\2TX\5*\26\2UX\5\36\20\2VX\5 \21\2WF\3\2\2\2WG\3\2\2\2WH\3\2\2"+
		"\2WI\3\2\2\2WJ\3\2\2\2WK\3\2\2\2WL\3\2\2\2WM\3\2\2\2WN\3\2\2\2WO\3\2\2"+
		"\2WP\3\2\2\2WQ\3\2\2\2WR\3\2\2\2WS\3\2\2\2WT\3\2\2\2WU\3\2\2\2WV\3\2\2"+
		"\2X\7\3\2\2\2YZ\5\66\34\2Z]\7\62\2\2[\\\7\4\2\2\\^\5\64\33\2][\3\2\2\2"+
		"]^\3\2\2\2^\t\3\2\2\2_a\58\35\2`_\3\2\2\2`a\3\2\2\2ac\3\2\2\2bd\7\5\2"+
		"\2cb\3\2\2\2cd\3\2\2\2de\3\2\2\2ef\7\6\2\2fh\7\65\2\2gi\7\7\2\2hg\3\2"+
		"\2\2hi\3\2\2\2il\3\2\2\2jk\7\b\2\2km\7\62\2\2lj\3\2\2\2lm\3\2\2\2mn\3"+
		"\2\2\2no\7\t\2\2op\7\62\2\2p\13\3\2\2\2qr\7\62\2\2rs\7\4\2\2st\5\64\33"+
		"\2t\r\3\2\2\2uv\7\62\2\2vx\7\4\2\2wy\5\66\34\2xw\3\2\2\2xy\3\2\2\2y{\3"+
		"\2\2\2z|\7\5\2\2{z\3\2\2\2{|\3\2\2\2|}\3\2\2\2}~\7\6\2\2~\u0080\7\65\2"+
		"\2\177\u0081\7\7\2\2\u0080\177\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0084"+
		"\3\2\2\2\u0082\u0083\7\b\2\2\u0083\u0085\7\62\2\2\u0084\u0082\3\2\2\2"+
		"\u0084\u0085\3\2\2\2\u0085\17\3\2\2\2\u0086\u0087\5\24\13\2\u0087\u008c"+
		"\5\22\n\2\u0088\u0089\7\n\2\2\u0089\u008b\5\22\n\2\u008a\u0088\3\2\2\2"+
		"\u008b\u008e\3\2\2\2\u008c\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d\21"+
		"\3\2\2\2\u008e\u008c\3\2\2\2\u008f\u0090\7\13\2\2\u0090\u0094\7\5\2\2"+
		"\u0091\u0095\7\62\2\2\u0092\u0095\7\65\2\2\u0093\u0095\5\64\33\2\u0094"+
		"\u0091\3\2\2\2\u0094\u0092\3\2\2\2\u0094\u0093\3\2\2\2\u0095\u0096\3\2"+
		"\2\2\u0096\u0097\7\n\2\2\u0097\u0098\7\63\2\2\u0098\u009e\7\7\2\2\u0099"+
		"\u009a\7\65\2\2\u009a\u009b\7\n\2\2\u009b\u009e\7\62\2\2\u009c\u009e\7"+
		"\62\2\2\u009d\u008f\3\2\2\2\u009d\u0099\3\2\2\2\u009d\u009c\3\2\2\2\u009e"+
		"\23\3\2\2\2\u009f\u00a0\t\2\2\2\u00a0\25\3\2\2\2\u00a1\u00a2\7\16\2\2"+
		"\u00a2\u00a3\7\62\2\2\u00a3\u00a4\7\4\2\2\u00a4\u00a5\t\3\2\2\u00a5\u00ad"+
		"\7\17\2\2\u00a6\u00ae\7\63\2\2\u00a7\u00ae\7\62\2\2\u00a8\u00a9\5\34\17"+
		"\2\u00a9\u00aa\7\5\2\2\u00aa\u00ab\7\62\2\2\u00ab\u00ac\7\7\2\2\u00ac"+
		"\u00ae\3\2\2\2\u00ad\u00a6\3\2\2\2\u00ad\u00a7\3\2\2\2\u00ad\u00a8\3\2"+
		"\2\2\u00ae\u00af\3\2\2\2\u00af\u00b3\7\20\2\2\u00b0\u00b1\5\6\4\2\u00b1"+
		"\u00b2\7\3\2\2\u00b2\u00b4\3\2\2\2\u00b3\u00b0\3\2\2\2\u00b4\u00b5\3\2"+
		"\2\2\u00b5\u00b3\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7"+
		"\u00b8\7\21\2\2\u00b8\27\3\2\2\2\u00b9\u00ba\7\22\2\2\u00ba\u00bb\7\5"+
		"\2\2\u00bb\u00bc\5\64\33\2\u00bc\u00bd\7\7\2\2\u00bd\u00c1\7\23\2\2\u00be"+
		"\u00bf\5\6\4\2\u00bf\u00c0\7\3\2\2\u00c0\u00c2\3\2\2\2\u00c1\u00be\3\2"+
		"\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4"+
		"\u00c5\3\2\2\2\u00c5\u00c6\7\24\2\2\u00c6\31\3\2\2\2\u00c7\u00c8\7\20"+
		"\2\2\u00c8\u00cc\7\23\2\2\u00c9\u00ca\5\6\4\2\u00ca\u00cb\7\3\2\2\u00cb"+
		"\u00cd\3\2\2\2\u00cc\u00c9\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00cc\3\2"+
		"\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d1\7\24\2\2\u00d1"+
		"\u00d2\7\22\2\2\u00d2\u00d3\7\5\2\2\u00d3\u00d4\5\64\33\2\u00d4\u00d5"+
		"\7\7\2\2\u00d5\33\3\2\2\2\u00d6\u00d7\7\25\2\2\u00d7\35\3\2\2\2\u00d8"+
		"\u00d9\7\26\2\2\u00d9\37\3\2\2\2\u00da\u00db\7\27\2\2\u00db!\3\2\2\2\u00dc"+
		"\u00dd\7\30\2\2\u00dd\u00de\7\65\2\2\u00de#\3\2\2\2\u00df\u00e0\7\31\2"+
		"\2\u00e0\u00e1\5\66\34\2\u00e1\u00e2\7\62\2\2\u00e2\u00e9\7\4\2\2\u00e3"+
		"\u00ea\7\63\2\2\u00e4\u00e6\7\32\2\2\u00e5\u00e7\7\33\2\2\u00e6\u00e5"+
		"\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00ea\7\63\2\2"+
		"\u00e9\u00e3\3\2\2\2\u00e9\u00e4\3\2\2\2\u00ea%\3\2\2\2\u00eb\u00ec\7"+
		"\34\2\2\u00ec\u00ed\5\66\34\2\u00ed\u00ee\7\62\2\2\u00ee\u00ef\7\35\2"+
		"\2\u00ef\u00f2\7\62\2\2\u00f0\u00f1\7\n\2\2\u00f1\u00f3\7\62\2\2\u00f2"+
		"\u00f0\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f5\7\36"+
		"\2\2\u00f5\u0105\3\2\2\2\u00f6\u00f7\7\34\2\2\u00f7\u00f8\5\66\34\2\u00f8"+
		"\u00ff\7\62\2\2\u00f9\u00fa\7\35\2\2\u00fa\u00fb\7\62\2\2\u00fb\u00fc"+
		"\7\n\2\2\u00fc\u00fd\7\62\2\2\u00fd\u00fe\3\2\2\2\u00fe\u0100\7\36\2\2"+
		"\u00ff\u00f9\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u0102"+
		"\7\4\2\2\u0102\u0103\5\64\33\2\u0103\u0105\3\2\2\2\u0104\u00eb\3\2\2\2"+
		"\u0104\u00f6\3\2\2\2\u0105\'\3\2\2\2\u0106\u0107\7\37\2\2\u0107\u0108"+
		"\7\62\2\2\u0108\u0109\7\35\2\2\u0109\u010c\7\62\2\2\u010a\u010b\7\n\2"+
		"\2\u010b\u010d\7\62\2\2\u010c\u010a\3\2\2\2\u010c\u010d\3\2\2\2\u010d"+
		"\u010e\3\2\2\2\u010e\u010f\7\36\2\2\u010f\u0110\7\4\2\2\u0110\u0111\5"+
		"\64\33\2\u0111)\3\2\2\2\u0112\u0113\7 \2\2\u0113\u0114\7\35\2\2\u0114"+
		"\u0115\5\66\34\2\u0115\u0116\7\36\2\2\u0116\u011e\7\62\2\2\u0117\u0118"+
		"\7\4\2\2\u0118\u0119\7!\2\2\u0119\u011a\7 \2\2\u011a\u011b\7\35\2\2\u011b"+
		"\u011c\5\66\34\2\u011c\u011d\7\36\2\2\u011d\u011f\3\2\2\2\u011e\u0117"+
		"\3\2\2\2\u011e\u011f\3\2\2\2\u011f+\3\2\2\2\u0120\u0122\5.\30\2\u0121"+
		"\u0120\3\2\2\2\u0122\u0123\3\2\2\2\u0123\u0121\3\2\2\2\u0123\u0124\3\2"+
		"\2\2\u0124\u0126\3\2\2\2\u0125\u0127\5\60\31\2\u0126\u0125\3\2\2\2\u0126"+
		"\u0127\3\2\2\2\u0127\u0129\3\2\2\2\u0128\u012a\5\62\32\2\u0129\u0128\3"+
		"\2\2\2\u0129\u012a\3\2\2\2\u012a-\3\2\2\2\u012b\u012c\7\"\2\2\u012c\u012d"+
		"\7\5\2\2\u012d\u012e\5\64\33\2\u012e\u012f\7\7\2\2\u012f\u0130\7\23\2"+
		"\2\u0130\u0132\5\6\4\2\u0131\u0133\7\3\2\2\u0132\u0131\3\2\2\2\u0133\u0134"+
		"\3\2\2\2\u0134\u0132\3\2\2\2\u0134\u0135\3\2\2\2\u0135\u0136\3\2\2\2\u0136"+
		"\u0137\7\24\2\2\u0137/\3\2\2\2\u0138\u0139\7#\2\2\u0139\u013a\7\5\2\2"+
		"\u013a\u013b\5\64\33\2\u013b\u013c\7\7\2\2\u013c\u013d\7\23\2\2\u013d"+
		"\u013f\5\6\4\2\u013e\u0140\7\3\2\2\u013f\u013e\3\2\2\2\u0140\u0141\3\2"+
		"\2\2\u0141\u013f\3\2\2\2\u0141\u0142\3\2\2\2\u0142\u0143\3\2\2\2\u0143"+
		"\u0144\7\24\2\2\u0144\u0146\3\2\2\2\u0145\u0138\3\2\2\2\u0146\u0147\3"+
		"\2\2\2\u0147\u0145\3\2\2\2\u0147\u0148\3\2\2\2\u0148\61\3\2\2\2\u0149"+
		"\u014a\7$\2\2\u014a\u014b\7\23\2\2\u014b\u014d\5\6\4\2\u014c\u014e\7\3"+
		"\2\2\u014d\u014c\3\2\2\2\u014e\u014f\3\2\2\2\u014f\u014d\3\2\2\2\u014f"+
		"\u0150\3\2\2\2\u0150\u0151\3\2\2\2\u0151\u0152\7\24\2\2\u0152\63\3\2\2"+
		"\2\u0153\u0154\b\33\1\2\u0154\u0155\7\6\2\2\u0155\u0169\7\65\2\2\u0156"+
		"\u0157\7\5\2\2\u0157\u0158\5\64\33\2\u0158\u0159\7\7\2\2\u0159\u0169\3"+
		"\2\2\2\u015a\u015b\7\62\2\2\u015b\u015c\7\35\2\2\u015c\u015d\t\3\2\2\u015d"+
		"\u0169\7\36\2\2\u015e\u0169\7\62\2\2\u015f\u0160\5\66\34\2\u0160\u0161"+
		"\7\5\2\2\u0161\u0162\5\64\33\2\u0162\u0163\7\7\2\2\u0163\u0169\3\2\2\2"+
		"\u0164\u0169\7\64\2\2\u0165\u0169\7\63\2\2\u0166\u0169\7\65\2\2\u0167"+
		"\u0169\7\66\2\2\u0168\u0153\3\2\2\2\u0168\u0156\3\2\2\2\u0168\u015a\3"+
		"\2\2\2\u0168\u015e\3\2\2\2\u0168\u015f\3\2\2\2\u0168\u0164\3\2\2\2\u0168"+
		"\u0165\3\2\2\2\u0168\u0166\3\2\2\2\u0168\u0167\3\2\2\2\u0169\u0178\3\2"+
		"\2\2\u016a\u016b\f\16\2\2\u016b\u016c\t\4\2\2\u016c\u0177\5\64\33\17\u016d"+
		"\u016e\f\r\2\2\u016e\u016f\t\5\2\2\u016f\u0177\5\64\33\16\u0170\u0171"+
		"\f\f\2\2\u0171\u0172\t\6\2\2\u0172\u0177\5\64\33\r\u0173\u0174\f\13\2"+
		"\2\u0174\u0175\t\7\2\2\u0175\u0177\5\64\33\f\u0176\u016a\3\2\2\2\u0176"+
		"\u016d\3\2\2\2\u0176\u0170\3\2\2\2\u0176\u0173\3\2\2\2\u0177\u017a\3\2"+
		"\2\2\u0178\u0176\3\2\2\2\u0178\u0179\3\2\2\2\u0179\65\3\2\2\2\u017a\u0178"+
		"\3\2\2\2\u017b\u0185\7/\2\2\u017c\u0185\7\60\2\2\u017d\u0185\7\13\2\2"+
		"\u017e\u017f\7 \2\2\u017f\u0180\7\35\2\2\u0180\u0181\7\62\2\2\u0181\u0185"+
		"\7\36\2\2\u0182\u0185\7\61\2\2\u0183\u0185\7\62\2\2\u0184\u017b\3\2\2"+
		"\2\u0184\u017c\3\2\2\2\u0184\u017d\3\2\2\2\u0184\u017e\3\2\2\2\u0184\u0182"+
		"\3\2\2\2\u0184\u0183\3\2\2\2\u0185\67\3\2\2\2\u0186\u0187\t\b\2\2\u0187"+
		"9\3\2\2\2\'>CW]`chlx{\u0080\u0084\u008c\u0094\u009d\u00ad\u00b5\u00c3"+
		"\u00ce\u00e6\u00e9\u00f2\u00ff\u0104\u010c\u011e\u0123\u0126\u0129\u0134"+
		"\u0141\u0147\u014f\u0168\u0176\u0178\u0184";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
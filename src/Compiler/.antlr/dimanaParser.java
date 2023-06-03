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
		T__45=46, ID=47, INT=48, REAL=49, STRING=50, BOOL=51, WS=52, LINE_COMMENT=53, 
		ERROR=54;
	public static final int
		RULE_program = 0, RULE_statList = 1, RULE_statement = 2, RULE_variableDeclaration = 3, 
		RULE_readToArray = 4, RULE_assignment = 5, RULE_inputStatement = 6, RULE_outputStatement = 7, 
		RULE_outputFormat = 8, RULE_write_expr = 9, RULE_loopStatement = 10, RULE_whileStatement = 11, 
		RULE_doWhileStatement = 12, RULE_length = 13, RULE_breakStatement = 14, 
		RULE_continueStatement = 15, RULE_headerFile = 16, RULE_prefixUnit = 17, 
		RULE_unit = 18, RULE_alternativeUnit = 19, RULE_listDeclaration = 20, 
		RULE_conditional = 21, RULE_ifBlock = 22, RULE_elseBlock = 23, RULE_expression = 24, 
		RULE_dataType = 25, RULE_castTypes = 26;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statList", "statement", "variableDeclaration", "readToArray", 
			"assignment", "inputStatement", "outputStatement", "outputFormat", "write_expr", 
			"loopStatement", "whileStatement", "doWhileStatement", "length", "breakStatement", 
			"continueStatement", "headerFile", "prefixUnit", "unit", "alternativeUnit", 
			"listDeclaration", "conditional", "ifBlock", "elseBlock", "expression", 
			"dataType", "castTypes"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'='", "'('", "'read'", "')'", "'*'", "'>>'", "','", "'string'", 
			"'write'", "'writeln'", "'for'", "'to'", "'do'", "'end'", "'while'", 
			"'{'", "'}'", "'length'", "'stop'", "'procede'", "'use'", "'prefix'", 
			"'1e'", "'-'", "'dimension'", "'['", "']'", "'unit'", "'list'", "'new'", 
			"'if'", "'else'", "'/'", "'+'", "'=='", "'!='", "'<'", "'>'", "'>='", 
			"'<='", "'and'", "'or'", "'integer'", "'real'", "'bool'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, "ID", 
			"INT", "REAL", "STRING", "BOOL", "WS", "LINE_COMMENT", "ERROR"
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
			setState(54);
			statList();
			setState(55);
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
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__3) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__13) | (1L << T__15) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__25) | (1L << T__28) | (1L << T__29) | (1L << T__31) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << ID))) != 0)) {
				{
				{
				setState(58);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__13) | (1L << T__15) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__25) | (1L << T__28) | (1L << T__29) | (1L << T__31) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << ID))) != 0)) {
					{
					setState(57);
					statement();
					}
				}

				setState(60);
				match(T__0);
				}
				}
				setState(65);
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
			setState(83);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(66);
				inputStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(67);
				assignment();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(68);
				readToArray();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(69);
				variableDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(70);
				conditional();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(71);
				outputStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(72);
				loopStatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(73);
				whileStatement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(74);
				doWhileStatement();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(75);
				whileStatement();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(76);
				headerFile();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(77);
				prefixUnit();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(78);
				unit();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(79);
				alternativeUnit();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(80);
				listDeclaration();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(81);
				breakStatement();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(82);
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
			setState(85);
			dataType();
			setState(86);
			match(ID);
			setState(89);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(87);
				match(T__1);
				setState(88);
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
			setState(92);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__43 || _la==T__44) {
				{
				setState(91);
				castTypes();
				}
			}

			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(94);
				match(T__2);
				}
			}

			setState(97);
			match(T__3);
			setState(98);
			match(STRING);
			setState(100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(99);
				match(T__4);
				}
			}

			setState(104);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(102);
				match(T__5);
				setState(103);
				match(ID);
				}
			}

			setState(106);
			match(T__6);
			setState(107);
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
			setState(109);
			match(ID);
			setState(110);
			match(T__1);
			setState(111);
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
			setState(113);
			match(ID);
			setState(114);
			match(T__1);
			setState(116);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__29) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << ID))) != 0)) {
				{
				setState(115);
				dataType();
				}
			}

			setState(119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(118);
				match(T__2);
				}
			}

			setState(121);
			match(T__3);
			setState(122);
			match(STRING);
			setState(124);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(123);
				match(T__4);
				}
			}

			setState(128);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(126);
				match(T__5);
				setState(127);
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
			setState(130);
			write_expr();
			setState(131);
			outputFormat();
			setState(136);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(132);
				match(T__7);
				setState(133);
				outputFormat();
				}
				}
				setState(138);
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
			setState(154);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(139);
				match(T__8);
				setState(140);
				match(T__2);
				setState(144);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(141);
					match(ID);
					}
					break;
				case 2:
					{
					setState(142);
					match(STRING);
					}
					break;
				case 3:
					{
					setState(143);
					expression(0);
					}
					break;
				}
				setState(146);
				match(T__7);
				setState(147);
				match(INT);
				setState(148);
				match(T__4);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(149);
				match(STRING);
				setState(150);
				match(T__7);
				setState(151);
				match(ID);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(152);
				match(ID);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(153);
				match(STRING);
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
			setState(156);
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
			setState(158);
			match(T__11);
			setState(159);
			match(ID);
			setState(160);
			match(T__1);
			setState(161);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==INT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(162);
			match(T__12);
			setState(170);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				{
				setState(163);
				match(INT);
				}
				break;
			case ID:
				{
				setState(164);
				match(ID);
				}
				break;
			case T__18:
				{
				setState(165);
				length();
				setState(166);
				match(T__2);
				setState(167);
				match(ID);
				setState(168);
				match(T__4);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(172);
			match(T__13);
			{
			setState(176); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(173);
				statement();
				setState(174);
				match(T__0);
				}
				}
				setState(178); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__13) | (1L << T__15) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__25) | (1L << T__28) | (1L << T__29) | (1L << T__31) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << ID))) != 0) );
			}
			setState(180);
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
			setState(182);
			match(T__15);
			setState(183);
			match(T__2);
			setState(184);
			expression(0);
			setState(185);
			match(T__4);
			setState(186);
			match(T__16);
			setState(190); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(187);
				statement();
				setState(188);
				match(T__0);
				}
				}
				setState(192); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__13) | (1L << T__15) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__25) | (1L << T__28) | (1L << T__29) | (1L << T__31) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << ID))) != 0) );
			setState(194);
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
			setState(196);
			match(T__13);
			setState(197);
			match(T__16);
			setState(201); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(198);
				statement();
				setState(199);
				match(T__0);
				}
				}
				setState(203); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__13) | (1L << T__15) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__25) | (1L << T__28) | (1L << T__29) | (1L << T__31) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << ID))) != 0) );
			setState(205);
			match(T__17);
			setState(206);
			match(T__15);
			setState(207);
			match(T__2);
			setState(208);
			expression(0);
			setState(209);
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
			setState(211);
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
			setState(213);
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
			setState(215);
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
			setState(217);
			match(T__21);
			setState(218);
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
			setState(220);
			match(T__22);
			setState(221);
			dataType();
			setState(222);
			match(ID);
			setState(223);
			match(T__1);
			setState(230);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				{
				setState(224);
				match(INT);
				}
				break;
			case T__23:
				{
				setState(225);
				match(T__23);
				setState(227);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__24) {
					{
					setState(226);
					((PrefixUnitContext)_localctx).minus = match(T__24);
					}
				}

				setState(229);
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
			setState(257);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				_localctx = new IndependentUnitContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(232);
				match(T__25);
				setState(233);
				dataType();
				setState(234);
				match(ID);
				{
				setState(235);
				match(T__26);
				setState(236);
				match(ID);
				setState(239);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__7) {
					{
					setState(237);
					match(T__7);
					setState(238);
					match(ID);
					}
				}

				setState(241);
				match(T__27);
				}
				}
				break;
			case 2:
				_localctx = new DependantUnitContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(243);
				match(T__25);
				setState(244);
				dataType();
				setState(245);
				match(ID);
				{
				setState(252);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__26) {
					{
					setState(246);
					match(T__26);
					setState(247);
					match(ID);
					{
					setState(248);
					match(T__7);
					setState(249);
					match(ID);
					}
					setState(251);
					match(T__27);
					}
				}

				setState(254);
				match(T__1);
				setState(255);
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
			setState(259);
			match(T__28);
			setState(260);
			match(ID);
			setState(261);
			match(T__26);
			setState(262);
			match(ID);
			setState(265);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(263);
				match(T__7);
				setState(264);
				match(ID);
				}
			}

			setState(267);
			match(T__27);
			setState(268);
			match(T__1);
			setState(269);
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
			setState(271);
			match(T__29);
			setState(272);
			match(T__26);
			setState(273);
			dataType();
			setState(274);
			match(T__27);
			setState(275);
			match(ID);
			setState(283);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(276);
				match(T__1);
				setState(277);
				match(T__30);
				setState(278);
				match(T__29);
				setState(279);
				match(T__26);
				setState(280);
				dataType();
				setState(281);
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
		public IfBlockContext ifBlock() {
			return getRuleContext(IfBlockContext.class,0);
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
			setState(285);
			ifBlock();
			setState(287);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__32) {
				{
				setState(286);
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
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
			setState(289);
			match(T__31);
			setState(290);
			match(T__2);
			setState(291);
			expression(0);
			setState(292);
			match(T__4);
			setState(293);
			match(T__16);
			setState(297); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(294);
				statement();
				setState(295);
				match(T__0);
				}
				}
				setState(299); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__13) | (1L << T__15) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__25) | (1L << T__28) | (1L << T__29) | (1L << T__31) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << ID))) != 0) );
			setState(301);
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

	public static class ElseBlockContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ElseBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseBlock; }
	}

	public final ElseBlockContext elseBlock() throws RecognitionException {
		ElseBlockContext _localctx = new ElseBlockContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_elseBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
			match(T__32);
			setState(304);
			match(T__16);
			setState(308); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(305);
				statement();
				setState(306);
				match(T__0);
				}
				}
				setState(310); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__13) | (1L << T__15) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__25) | (1L << T__28) | (1L << T__29) | (1L << T__31) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << ID))) != 0) );
			setState(312);
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
	public static class IndexExpressionContext extends ExpressionContext {
		public List<TerminalNode> ID() { return getTokens(dimanaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(dimanaParser.ID, i);
		}
		public TerminalNode INT() { return getToken(dimanaParser.INT, 0); }
		public IndexExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
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
		int _startState = 48;
		enterRecursionRule(_localctx, 48, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(333);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				_localctx = new TypeConversionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(315);
				dataType();
				setState(316);
				match(T__2);
				setState(317);
				expression(0);
				setState(318);
				match(T__4);
				}
				break;
			case 2:
				{
				_localctx = new ParenExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(320);
				match(T__2);
				setState(321);
				expression(0);
				setState(322);
				match(T__4);
				}
				break;
			case 3:
				{
				_localctx = new IndexExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(324);
				match(ID);
				setState(325);
				match(T__26);
				setState(326);
				_la = _input.LA(1);
				if ( !(_la==ID || _la==INT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(327);
				match(T__27);
				}
				break;
			case 4:
				{
				_localctx = new IdExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(328);
				match(ID);
				}
				break;
			case 5:
				{
				_localctx = new RealLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(329);
				match(REAL);
				}
				break;
			case 6:
				{
				_localctx = new IntLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(330);
				match(INT);
				}
				break;
			case 7:
				{
				_localctx = new StringLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(331);
				match(STRING);
				}
				break;
			case 8:
				{
				_localctx = new BoolLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(332);
				match(BOOL);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(349);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(347);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
					case 1:
						{
						_localctx = new MulDivExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(335);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(336);
						((MulDivExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__5 || _la==T__33) ) {
							((MulDivExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(337);
						expression(13);
						}
						break;
					case 2:
						{
						_localctx = new AddSubExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(338);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(339);
						((AddSubExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__24 || _la==T__34) ) {
							((AddSubExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(340);
						expression(12);
						}
						break;
					case 3:
						{
						_localctx = new ConditionalExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((ConditionalExpressionContext)_localctx).e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(341);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(342);
						((ConditionalExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40))) != 0)) ) {
							((ConditionalExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(343);
						((ConditionalExpressionContext)_localctx).e2 = expression(10);
						}
						break;
					case 4:
						{
						_localctx = new AndOrExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(344);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(345);
						((AndOrExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__41 || _la==T__42) ) {
							((AndOrExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(346);
						expression(9);
						}
						break;
					}
					} 
				}
				setState(351);
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
		enterRule(_localctx, 50, RULE_dataType);
		try {
			setState(361);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__43:
				enterOuterAlt(_localctx, 1);
				{
				setState(352);
				match(T__43);
				}
				break;
			case T__44:
				enterOuterAlt(_localctx, 2);
				{
				setState(353);
				match(T__44);
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 3);
				{
				setState(354);
				match(T__8);
				}
				break;
			case T__29:
				enterOuterAlt(_localctx, 4);
				{
				setState(355);
				match(T__29);
				setState(356);
				match(T__26);
				setState(357);
				match(ID);
				setState(358);
				match(T__27);
				}
				break;
			case T__45:
				enterOuterAlt(_localctx, 5);
				{
				setState(359);
				match(T__45);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 6);
				{
				setState(360);
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
		enterRule(_localctx, 52, RULE_castTypes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(363);
			_la = _input.LA(1);
			if ( !(_la==T__43 || _la==T__44) ) {
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
		case 24:
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
			return precpred(_ctx, 9);
		case 3:
			return precpred(_ctx, 8);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\38\u0170\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\3\2\3\2\3\2\3\3\5\3=\n\3\3\3\7\3@\n\3\f"+
		"\3\16\3C\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\5\4V\n\4\3\5\3\5\3\5\3\5\5\5\\\n\5\3\6\5\6_\n\6\3\6\5\6b"+
		"\n\6\3\6\3\6\3\6\5\6g\n\6\3\6\3\6\5\6k\n\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7"+
		"\3\b\3\b\3\b\5\bw\n\b\3\b\5\bz\n\b\3\b\3\b\3\b\5\b\177\n\b\3\b\3\b\5\b"+
		"\u0083\n\b\3\t\3\t\3\t\3\t\7\t\u0089\n\t\f\t\16\t\u008c\13\t\3\n\3\n\3"+
		"\n\3\n\3\n\5\n\u0093\n\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u009d\n\n"+
		"\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00ad\n"+
		"\f\3\f\3\f\3\f\3\f\6\f\u00b3\n\f\r\f\16\f\u00b4\3\f\3\f\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\6\r\u00c1\n\r\r\r\16\r\u00c2\3\r\3\r\3\16\3\16\3\16"+
		"\3\16\3\16\6\16\u00cc\n\16\r\16\16\16\u00cd\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\5\23\u00e6\n\23\3\23\5\23\u00e9\n\23\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\5\24\u00f2\n\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\5\24\u00ff\n\24\3\24\3\24\3\24\5\24\u0104\n\24\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\5\25\u010c\n\25\3\25\3\25\3\25\3\25\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u011e\n\26\3\27"+
		"\3\27\5\27\u0122\n\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\6\30\u012c"+
		"\n\30\r\30\16\30\u012d\3\30\3\30\3\31\3\31\3\31\3\31\3\31\6\31\u0137\n"+
		"\31\r\31\16\31\u0138\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u0150\n\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\7\32\u015e"+
		"\n\32\f\32\16\32\u0161\13\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3"+
		"\33\5\33\u016c\n\33\3\34\3\34\3\34\2\3\62\35\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"$&(*,.\60\62\64\66\2\t\3\2\f\r\3\2\61\62\4\2\b\b$$\4\2"+
		"\33\33%%\3\2&+\3\2,-\3\2./\2\u0194\28\3\2\2\2\4A\3\2\2\2\6U\3\2\2\2\b"+
		"W\3\2\2\2\n^\3\2\2\2\fo\3\2\2\2\16s\3\2\2\2\20\u0084\3\2\2\2\22\u009c"+
		"\3\2\2\2\24\u009e\3\2\2\2\26\u00a0\3\2\2\2\30\u00b8\3\2\2\2\32\u00c6\3"+
		"\2\2\2\34\u00d5\3\2\2\2\36\u00d7\3\2\2\2 \u00d9\3\2\2\2\"\u00db\3\2\2"+
		"\2$\u00de\3\2\2\2&\u0103\3\2\2\2(\u0105\3\2\2\2*\u0111\3\2\2\2,\u011f"+
		"\3\2\2\2.\u0123\3\2\2\2\60\u0131\3\2\2\2\62\u014f\3\2\2\2\64\u016b\3\2"+
		"\2\2\66\u016d\3\2\2\289\5\4\3\29:\7\2\2\3:\3\3\2\2\2;=\5\6\4\2<;\3\2\2"+
		"\2<=\3\2\2\2=>\3\2\2\2>@\7\3\2\2?<\3\2\2\2@C\3\2\2\2A?\3\2\2\2AB\3\2\2"+
		"\2B\5\3\2\2\2CA\3\2\2\2DV\5\16\b\2EV\5\f\7\2FV\5\n\6\2GV\5\b\5\2HV\5,"+
		"\27\2IV\5\20\t\2JV\5\26\f\2KV\5\30\r\2LV\5\32\16\2MV\5\30\r\2NV\5\"\22"+
		"\2OV\5$\23\2PV\5&\24\2QV\5(\25\2RV\5*\26\2SV\5\36\20\2TV\5 \21\2UD\3\2"+
		"\2\2UE\3\2\2\2UF\3\2\2\2UG\3\2\2\2UH\3\2\2\2UI\3\2\2\2UJ\3\2\2\2UK\3\2"+
		"\2\2UL\3\2\2\2UM\3\2\2\2UN\3\2\2\2UO\3\2\2\2UP\3\2\2\2UQ\3\2\2\2UR\3\2"+
		"\2\2US\3\2\2\2UT\3\2\2\2V\7\3\2\2\2WX\5\64\33\2X[\7\61\2\2YZ\7\4\2\2Z"+
		"\\\5\62\32\2[Y\3\2\2\2[\\\3\2\2\2\\\t\3\2\2\2]_\5\66\34\2^]\3\2\2\2^_"+
		"\3\2\2\2_a\3\2\2\2`b\7\5\2\2a`\3\2\2\2ab\3\2\2\2bc\3\2\2\2cd\7\6\2\2d"+
		"f\7\64\2\2eg\7\7\2\2fe\3\2\2\2fg\3\2\2\2gj\3\2\2\2hi\7\b\2\2ik\7\61\2"+
		"\2jh\3\2\2\2jk\3\2\2\2kl\3\2\2\2lm\7\t\2\2mn\7\61\2\2n\13\3\2\2\2op\7"+
		"\61\2\2pq\7\4\2\2qr\5\62\32\2r\r\3\2\2\2st\7\61\2\2tv\7\4\2\2uw\5\64\33"+
		"\2vu\3\2\2\2vw\3\2\2\2wy\3\2\2\2xz\7\5\2\2yx\3\2\2\2yz\3\2\2\2z{\3\2\2"+
		"\2{|\7\6\2\2|~\7\64\2\2}\177\7\7\2\2~}\3\2\2\2~\177\3\2\2\2\177\u0082"+
		"\3\2\2\2\u0080\u0081\7\b\2\2\u0081\u0083\7\61\2\2\u0082\u0080\3\2\2\2"+
		"\u0082\u0083\3\2\2\2\u0083\17\3\2\2\2\u0084\u0085\5\24\13\2\u0085\u008a"+
		"\5\22\n\2\u0086\u0087\7\n\2\2\u0087\u0089\5\22\n\2\u0088\u0086\3\2\2\2"+
		"\u0089\u008c\3\2\2\2\u008a\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b\21"+
		"\3\2\2\2\u008c\u008a\3\2\2\2\u008d\u008e\7\13\2\2\u008e\u0092\7\5\2\2"+
		"\u008f\u0093\7\61\2\2\u0090\u0093\7\64\2\2\u0091\u0093\5\62\32\2\u0092"+
		"\u008f\3\2\2\2\u0092\u0090\3\2\2\2\u0092\u0091\3\2\2\2\u0093\u0094\3\2"+
		"\2\2\u0094\u0095\7\n\2\2\u0095\u0096\7\62\2\2\u0096\u009d\7\7\2\2\u0097"+
		"\u0098\7\64\2\2\u0098\u0099\7\n\2\2\u0099\u009d\7\61\2\2\u009a\u009d\7"+
		"\61\2\2\u009b\u009d\7\64\2\2\u009c\u008d\3\2\2\2\u009c\u0097\3\2\2\2\u009c"+
		"\u009a\3\2\2\2\u009c\u009b\3\2\2\2\u009d\23\3\2\2\2\u009e\u009f\t\2\2"+
		"\2\u009f\25\3\2\2\2\u00a0\u00a1\7\16\2\2\u00a1\u00a2\7\61\2\2\u00a2\u00a3"+
		"\7\4\2\2\u00a3\u00a4\t\3\2\2\u00a4\u00ac\7\17\2\2\u00a5\u00ad\7\62\2\2"+
		"\u00a6\u00ad\7\61\2\2\u00a7\u00a8\5\34\17\2\u00a8\u00a9\7\5\2\2\u00a9"+
		"\u00aa\7\61\2\2\u00aa\u00ab\7\7\2\2\u00ab\u00ad\3\2\2\2\u00ac\u00a5\3"+
		"\2\2\2\u00ac\u00a6\3\2\2\2\u00ac\u00a7\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae"+
		"\u00b2\7\20\2\2\u00af\u00b0\5\6\4\2\u00b0\u00b1\7\3\2\2\u00b1\u00b3\3"+
		"\2\2\2\u00b2\u00af\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b4"+
		"\u00b5\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b7\7\21\2\2\u00b7\27\3\2\2"+
		"\2\u00b8\u00b9\7\22\2\2\u00b9\u00ba\7\5\2\2\u00ba\u00bb\5\62\32\2\u00bb"+
		"\u00bc\7\7\2\2\u00bc\u00c0\7\23\2\2\u00bd\u00be\5\6\4\2\u00be\u00bf\7"+
		"\3\2\2\u00bf\u00c1\3\2\2\2\u00c0\u00bd\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2"+
		"\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c5\7\24"+
		"\2\2\u00c5\31\3\2\2\2\u00c6\u00c7\7\20\2\2\u00c7\u00cb\7\23\2\2\u00c8"+
		"\u00c9\5\6\4\2\u00c9\u00ca\7\3\2\2\u00ca\u00cc\3\2\2\2\u00cb\u00c8\3\2"+
		"\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00cb\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce"+
		"\u00cf\3\2\2\2\u00cf\u00d0\7\24\2\2\u00d0\u00d1\7\22\2\2\u00d1\u00d2\7"+
		"\5\2\2\u00d2\u00d3\5\62\32\2\u00d3\u00d4\7\7\2\2\u00d4\33\3\2\2\2\u00d5"+
		"\u00d6\7\25\2\2\u00d6\35\3\2\2\2\u00d7\u00d8\7\26\2\2\u00d8\37\3\2\2\2"+
		"\u00d9\u00da\7\27\2\2\u00da!\3\2\2\2\u00db\u00dc\7\30\2\2\u00dc\u00dd"+
		"\7\64\2\2\u00dd#\3\2\2\2\u00de\u00df\7\31\2\2\u00df\u00e0\5\64\33\2\u00e0"+
		"\u00e1\7\61\2\2\u00e1\u00e8\7\4\2\2\u00e2\u00e9\7\62\2\2\u00e3\u00e5\7"+
		"\32\2\2\u00e4\u00e6\7\33\2\2\u00e5\u00e4\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6"+
		"\u00e7\3\2\2\2\u00e7\u00e9\7\62\2\2\u00e8\u00e2\3\2\2\2\u00e8\u00e3\3"+
		"\2\2\2\u00e9%\3\2\2\2\u00ea\u00eb\7\34\2\2\u00eb\u00ec\5\64\33\2\u00ec"+
		"\u00ed\7\61\2\2\u00ed\u00ee\7\35\2\2\u00ee\u00f1\7\61\2\2\u00ef\u00f0"+
		"\7\n\2\2\u00f0\u00f2\7\61\2\2\u00f1\u00ef\3\2\2\2\u00f1\u00f2\3\2\2\2"+
		"\u00f2\u00f3\3\2\2\2\u00f3\u00f4\7\36\2\2\u00f4\u0104\3\2\2\2\u00f5\u00f6"+
		"\7\34\2\2\u00f6\u00f7\5\64\33\2\u00f7\u00fe\7\61\2\2\u00f8\u00f9\7\35"+
		"\2\2\u00f9\u00fa\7\61\2\2\u00fa\u00fb\7\n\2\2\u00fb\u00fc\7\61\2\2\u00fc"+
		"\u00fd\3\2\2\2\u00fd\u00ff\7\36\2\2\u00fe\u00f8\3\2\2\2\u00fe\u00ff\3"+
		"\2\2\2\u00ff\u0100\3\2\2\2\u0100\u0101\7\4\2\2\u0101\u0102\5\62\32\2\u0102"+
		"\u0104\3\2\2\2\u0103\u00ea\3\2\2\2\u0103\u00f5\3\2\2\2\u0104\'\3\2\2\2"+
		"\u0105\u0106\7\37\2\2\u0106\u0107\7\61\2\2\u0107\u0108\7\35\2\2\u0108"+
		"\u010b\7\61\2\2\u0109\u010a\7\n\2\2\u010a\u010c\7\61\2\2\u010b\u0109\3"+
		"\2\2\2\u010b\u010c\3\2\2\2\u010c\u010d\3\2\2\2\u010d\u010e\7\36\2\2\u010e"+
		"\u010f\7\4\2\2\u010f\u0110\5\62\32\2\u0110)\3\2\2\2\u0111\u0112\7 \2\2"+
		"\u0112\u0113\7\35\2\2\u0113\u0114\5\64\33\2\u0114\u0115\7\36\2\2\u0115"+
		"\u011d\7\61\2\2\u0116\u0117\7\4\2\2\u0117\u0118\7!\2\2\u0118\u0119\7 "+
		"\2\2\u0119\u011a\7\35\2\2\u011a\u011b\5\64\33\2\u011b\u011c\7\36\2\2\u011c"+
		"\u011e\3\2\2\2\u011d\u0116\3\2\2\2\u011d\u011e\3\2\2\2\u011e+\3\2\2\2"+
		"\u011f\u0121\5.\30\2\u0120\u0122\5\60\31\2\u0121\u0120\3\2\2\2\u0121\u0122"+
		"\3\2\2\2\u0122-\3\2\2\2\u0123\u0124\7\"\2\2\u0124\u0125\7\5\2\2\u0125"+
		"\u0126\5\62\32\2\u0126\u0127\7\7\2\2\u0127\u012b\7\23\2\2\u0128\u0129"+
		"\5\6\4\2\u0129\u012a\7\3\2\2\u012a\u012c\3\2\2\2\u012b\u0128\3\2\2\2\u012c"+
		"\u012d\3\2\2\2\u012d\u012b\3\2\2\2\u012d\u012e\3\2\2\2\u012e\u012f\3\2"+
		"\2\2\u012f\u0130\7\24\2\2\u0130/\3\2\2\2\u0131\u0132\7#\2\2\u0132\u0136"+
		"\7\23\2\2\u0133\u0134\5\6\4\2\u0134\u0135\7\3\2\2\u0135\u0137\3\2\2\2"+
		"\u0136\u0133\3\2\2\2\u0137\u0138\3\2\2\2\u0138\u0136\3\2\2\2\u0138\u0139"+
		"\3\2\2\2\u0139\u013a\3\2\2\2\u013a\u013b\7\24\2\2\u013b\61\3\2\2\2\u013c"+
		"\u013d\b\32\1\2\u013d\u013e\5\64\33\2\u013e\u013f\7\5\2\2\u013f\u0140"+
		"\5\62\32\2\u0140\u0141\7\7\2\2\u0141\u0150\3\2\2\2\u0142\u0143\7\5\2\2"+
		"\u0143\u0144\5\62\32\2\u0144\u0145\7\7\2\2\u0145\u0150\3\2\2\2\u0146\u0147"+
		"\7\61\2\2\u0147\u0148\7\35\2\2\u0148\u0149\t\3\2\2\u0149\u0150\7\36\2"+
		"\2\u014a\u0150\7\61\2\2\u014b\u0150\7\63\2\2\u014c\u0150\7\62\2\2\u014d"+
		"\u0150\7\64\2\2\u014e\u0150\7\65\2\2\u014f\u013c\3\2\2\2\u014f\u0142\3"+
		"\2\2\2\u014f\u0146\3\2\2\2\u014f\u014a\3\2\2\2\u014f\u014b\3\2\2\2\u014f"+
		"\u014c\3\2\2\2\u014f\u014d\3\2\2\2\u014f\u014e\3\2\2\2\u0150\u015f\3\2"+
		"\2\2\u0151\u0152\f\16\2\2\u0152\u0153\t\4\2\2\u0153\u015e\5\62\32\17\u0154"+
		"\u0155\f\r\2\2\u0155\u0156\t\5\2\2\u0156\u015e\5\62\32\16\u0157\u0158"+
		"\f\13\2\2\u0158\u0159\t\6\2\2\u0159\u015e\5\62\32\f\u015a\u015b\f\n\2"+
		"\2\u015b\u015c\t\7\2\2\u015c\u015e\5\62\32\13\u015d\u0151\3\2\2\2\u015d"+
		"\u0154\3\2\2\2\u015d\u0157\3\2\2\2\u015d\u015a\3\2\2\2\u015e\u0161\3\2"+
		"\2\2\u015f\u015d\3\2\2\2\u015f\u0160\3\2\2\2\u0160\63\3\2\2\2\u0161\u015f"+
		"\3\2\2\2\u0162\u016c\7.\2\2\u0163\u016c\7/\2\2\u0164\u016c\7\13\2\2\u0165"+
		"\u0166\7 \2\2\u0166\u0167\7\35\2\2\u0167\u0168\7\61\2\2\u0168\u016c\7"+
		"\36\2\2\u0169\u016c\7\60\2\2\u016a\u016c\7\61\2\2\u016b\u0162\3\2\2\2"+
		"\u016b\u0163\3\2\2\2\u016b\u0164\3\2\2\2\u016b\u0165\3\2\2\2\u016b\u0169"+
		"\3\2\2\2\u016b\u016a\3\2\2\2\u016c\65\3\2\2\2\u016d\u016e\t\b\2\2\u016e"+
		"\67\3\2\2\2#<AU[^afjvy~\u0082\u008a\u0092\u009c\u00ac\u00b4\u00c2\u00cd"+
		"\u00e5\u00e8\u00f1\u00fe\u0103\u010b\u011d\u0121\u012d\u0138\u014f\u015d"+
		"\u015f\u016b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
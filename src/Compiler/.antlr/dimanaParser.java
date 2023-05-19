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
			setState(47);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__15) | (1L << T__16) | (1L << T__19) | (1L << T__22) | (1L << T__23) | (1L << T__28) | (1L << T__29) | (1L << ID))) != 0)) {
				{
				{
				setState(42);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__15) | (1L << T__16) | (1L << T__19) | (1L << T__22) | (1L << T__23) | (1L << T__28) | (1L << T__29) | (1L << ID))) != 0)) {
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
			setState(72);
			match(ID);
			setState(73);
			match(T__1);
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__23) | (1L << T__28) | (1L << T__29) | (1L << ID))) != 0)) {
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
<<<<<<< HEAD
			setState(108);
=======
			setState(110);
>>>>>>> 6d42cabf1e9901763456c5b41cf5c1493f5b8386
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
				enterOuterAlt(_localctx, 1);
				{
<<<<<<< HEAD
				setState(96);
				match(T__7);
				setState(97);
				match(T__2);
				setState(101);
=======
				setState(98);
				match(T__7);
				setState(99);
				match(T__2);
				setState(103);
>>>>>>> 6d42cabf1e9901763456c5b41cf5c1493f5b8386
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
<<<<<<< HEAD
					setState(98);
=======
					setState(100);
>>>>>>> 6d42cabf1e9901763456c5b41cf5c1493f5b8386
					match(ID);
					}
					break;
				case 2:
					{
<<<<<<< HEAD
					setState(99);
=======
					setState(101);
>>>>>>> 6d42cabf1e9901763456c5b41cf5c1493f5b8386
					match(STRING);
					}
					break;
				case 3:
					{
<<<<<<< HEAD
					setState(100);
=======
					setState(102);
>>>>>>> 6d42cabf1e9901763456c5b41cf5c1493f5b8386
					expression(0);
					}
					break;
				}
<<<<<<< HEAD
				setState(103);
				match(T__6);
				setState(104);
				match(INT);
				setState(105);
=======
				setState(105);
				match(T__6);
				setState(106);
				match(INT);
				setState(107);
>>>>>>> 6d42cabf1e9901763456c5b41cf5c1493f5b8386
				match(T__4);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
<<<<<<< HEAD
				setState(106);
=======
				setState(108);
>>>>>>> 6d42cabf1e9901763456c5b41cf5c1493f5b8386
				match(STRING);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
<<<<<<< HEAD
				setState(107);
=======
				setState(109);
>>>>>>> 6d42cabf1e9901763456c5b41cf5c1493f5b8386
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
		enterRule(_localctx, 16, RULE_write_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
<<<<<<< HEAD
			setState(110);
=======
			setState(112);
>>>>>>> 6d42cabf1e9901763456c5b41cf5c1493f5b8386
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
<<<<<<< HEAD
			setState(112);
			match(T__10);
			setState(113);
			match(ID);
			setState(114);
			match(T__1);
			setState(115);
=======
			setState(114);
			match(T__10);
			setState(115);
			match(ID);
			setState(116);
			match(T__1);
			setState(117);
>>>>>>> 6d42cabf1e9901763456c5b41cf5c1493f5b8386
			_la = _input.LA(1);
			if ( !(_la==ID || _la==INT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
<<<<<<< HEAD
			setState(116);
			match(T__11);
			setState(124);
=======
			setState(118);
			match(T__11);
			setState(126);
>>>>>>> 6d42cabf1e9901763456c5b41cf5c1493f5b8386
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				{
<<<<<<< HEAD
				setState(117);
=======
				setState(119);
>>>>>>> 6d42cabf1e9901763456c5b41cf5c1493f5b8386
				match(INT);
				}
				break;
			case ID:
				{
<<<<<<< HEAD
				setState(118);
=======
				setState(120);
>>>>>>> 6d42cabf1e9901763456c5b41cf5c1493f5b8386
				match(ID);
				}
				break;
			case T__14:
				{
<<<<<<< HEAD
				setState(119);
				length();
				setState(120);
				match(T__2);
				setState(121);
				match(ID);
				setState(122);
=======
				setState(121);
				length();
				setState(122);
				match(T__2);
				setState(123);
				match(ID);
				setState(124);
>>>>>>> 6d42cabf1e9901763456c5b41cf5c1493f5b8386
				match(T__4);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
<<<<<<< HEAD
			setState(126);
			match(T__12);
			{
			setState(132);
=======
			setState(128);
			match(T__12);
			{
			setState(134);
>>>>>>> 6d42cabf1e9901763456c5b41cf5c1493f5b8386
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__23) | (1L << T__28) | (1L << T__29) | (1L << ID) | (1L << INT) | (1L << REAL) | (1L << STRING))) != 0)) {
				{
				{
<<<<<<< HEAD
				setState(127);
				expression(0);
				setState(128);
				match(T__0);
				}
				}
				setState(134);
=======
				setState(129);
				expression(0);
				setState(130);
				match(T__0);
				}
				}
				setState(136);
>>>>>>> 6d42cabf1e9901763456c5b41cf5c1493f5b8386
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
<<<<<<< HEAD
			setState(135);
=======
			setState(137);
>>>>>>> 6d42cabf1e9901763456c5b41cf5c1493f5b8386
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
<<<<<<< HEAD
			setState(137);
=======
			setState(139);
>>>>>>> 6d42cabf1e9901763456c5b41cf5c1493f5b8386
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
<<<<<<< HEAD
			setState(139);
			match(T__15);
			setState(140);
=======
			setState(141);
			match(T__15);
			setState(142);
>>>>>>> 6d42cabf1e9901763456c5b41cf5c1493f5b8386
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
<<<<<<< HEAD
			setState(142);
			match(T__16);
			setState(143);
			dataType();
			setState(144);
			match(ID);
			setState(145);
			match(T__1);
			setState(152);
=======
			setState(144);
			match(T__16);
			setState(145);
			dataType();
			setState(146);
			match(ID);
			setState(147);
			match(T__1);
			setState(154);
>>>>>>> 6d42cabf1e9901763456c5b41cf5c1493f5b8386
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				{
<<<<<<< HEAD
				setState(146);
=======
				setState(148);
>>>>>>> 6d42cabf1e9901763456c5b41cf5c1493f5b8386
				match(INT);
				}
				break;
			case T__17:
				{
<<<<<<< HEAD
				setState(147);
				match(T__17);
				setState(149);
=======
				setState(149);
				match(T__17);
				setState(151);
>>>>>>> 6d42cabf1e9901763456c5b41cf5c1493f5b8386
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__18) {
					{
<<<<<<< HEAD
					setState(148);
=======
					setState(150);
>>>>>>> 6d42cabf1e9901763456c5b41cf5c1493f5b8386
					((PrefixUnitContext)_localctx).minus = match(T__18);
					}
				}

<<<<<<< HEAD
				setState(151);
=======
				setState(153);
>>>>>>> 6d42cabf1e9901763456c5b41cf5c1493f5b8386
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
<<<<<<< HEAD
			setState(154);
			match(T__19);
			setState(155);
			dataType();
			setState(156);
			match(ID);
			setState(170);
=======
			setState(156);
			match(T__19);
			setState(157);
			dataType();
			setState(158);
			match(ID);
			setState(172);
>>>>>>> 6d42cabf1e9901763456c5b41cf5c1493f5b8386
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__20:
				{
<<<<<<< HEAD
				setState(157);
				match(T__20);
				setState(158);
				match(ID);
				setState(161);
=======
				setState(159);
				match(T__20);
				setState(160);
				match(ID);
				setState(163);
>>>>>>> 6d42cabf1e9901763456c5b41cf5c1493f5b8386
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__6) {
					{
<<<<<<< HEAD
					setState(159);
					match(T__6);
					setState(160);
=======
					setState(161);
					match(T__6);
					setState(162);
>>>>>>> 6d42cabf1e9901763456c5b41cf5c1493f5b8386
					match(ID);
					}
				}

<<<<<<< HEAD
				setState(163);
				match(T__21);
				setState(166);
=======
				setState(165);
				match(T__21);
				setState(168);
>>>>>>> 6d42cabf1e9901763456c5b41cf5c1493f5b8386
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
<<<<<<< HEAD
					setState(164);
					match(T__1);
					setState(165);
=======
					setState(166);
					match(T__1);
					setState(167);
>>>>>>> 6d42cabf1e9901763456c5b41cf5c1493f5b8386
					expression(0);
					}
				}

				}
				break;
			case T__1:
				{
<<<<<<< HEAD
				setState(168);
				match(T__1);
				setState(169);
=======
				setState(170);
				match(T__1);
				setState(171);
>>>>>>> 6d42cabf1e9901763456c5b41cf5c1493f5b8386
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
<<<<<<< HEAD
			setState(172);
			match(T__22);
			setState(173);
			match(ID);
			setState(174);
			match(T__20);
			setState(175);
			match(ID);
			setState(178);
=======
			setState(174);
			match(T__22);
			setState(175);
			match(ID);
			setState(176);
			match(T__20);
			setState(177);
			match(ID);
			setState(180);
>>>>>>> 6d42cabf1e9901763456c5b41cf5c1493f5b8386
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
<<<<<<< HEAD
				setState(176);
				match(T__6);
				setState(177);
=======
				setState(178);
				match(T__6);
				setState(179);
>>>>>>> 6d42cabf1e9901763456c5b41cf5c1493f5b8386
				match(ID);
				}
			}

<<<<<<< HEAD
			setState(180);
			match(T__21);
			setState(181);
			match(T__1);
			setState(182);
=======
			setState(182);
			match(T__21);
			setState(183);
			match(T__1);
			setState(184);
>>>>>>> 6d42cabf1e9901763456c5b41cf5c1493f5b8386
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
<<<<<<< HEAD
			setState(184);
			match(T__23);
			setState(185);
			match(T__20);
			setState(186);
			dataType();
			setState(187);
			match(T__21);
			setState(188);
			match(ID);
			setState(196);
=======
			setState(186);
			match(T__23);
			setState(187);
			match(T__20);
			setState(188);
			dataType();
			setState(189);
			match(T__21);
			setState(190);
			match(ID);
			setState(198);
>>>>>>> 6d42cabf1e9901763456c5b41cf5c1493f5b8386
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
<<<<<<< HEAD
				setState(189);
				match(T__1);
				setState(190);
				match(T__24);
				setState(191);
				match(T__23);
				setState(192);
				match(T__20);
				setState(193);
				dataType();
				setState(194);
=======
				setState(191);
				match(T__1);
				setState(192);
				match(T__24);
				setState(193);
				match(T__23);
				setState(194);
				match(T__20);
				setState(195);
				dataType();
				setState(196);
>>>>>>> 6d42cabf1e9901763456c5b41cf5c1493f5b8386
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
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
<<<<<<< HEAD
			setState(225);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
=======
			setState(244);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
>>>>>>> 6d42cabf1e9901763456c5b41cf5c1493f5b8386
			case 1:
				{
				_localctx = new InputExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

<<<<<<< HEAD
				setState(199);
				match(T__3);
				setState(200);
=======
				setState(201);
				match(T__3);
				setState(202);
>>>>>>> 6d42cabf1e9901763456c5b41cf5c1493f5b8386
				match(STRING);
				}
				break;
			case 2:
				{
				_localctx = new InputTypeExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(204);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__28 || _la==T__29) {
					{
					setState(203);
					castTypes();
					}
				}

				setState(207);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__2) {
					{
					setState(206);
					match(T__2);
					}
				}

				setState(209);
				match(T__3);
				setState(210);
				match(STRING);
				setState(212);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__4) {
					{
					setState(211);
					match(T__4);
					}
				}

				setState(216);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__5) {
					{
					setState(214);
					match(T__5);
					setState(215);
					match(ID);
					}
				}

				setState(218);
				match(T__25);
				setState(219);
				match(ID);
				}
				break;
			case 3:
				{
				_localctx = new StringAssignExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
<<<<<<< HEAD
				setState(201);
				match(T__7);
				setState(202);
				match(T__2);
				setState(203);
=======
				setState(220);
				match(T__7);
				setState(221);
				match(T__2);
				setState(222);
>>>>>>> 6d42cabf1e9901763456c5b41cf5c1493f5b8386
				_la = _input.LA(1);
				if ( !(_la==ID || _la==STRING) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
<<<<<<< HEAD
				setState(204);
				match(T__6);
				setState(205);
				match(INT);
				setState(206);
				match(T__4);
				}
				break;
			case 3:
				{
				_localctx = new ParenExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(207);
				match(T__2);
				setState(208);
				expression(0);
				setState(209);
=======
				setState(223);
				match(T__6);
				setState(224);
				match(INT);
				setState(225);
>>>>>>> 6d42cabf1e9901763456c5b41cf5c1493f5b8386
				match(T__4);
				}
				break;
			case 4:
				{
				_localctx = new ParenExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
<<<<<<< HEAD
				setState(211);
				outputStatement();
=======
				setState(226);
				match(T__2);
				setState(227);
				expression(0);
				setState(228);
				match(T__4);
>>>>>>> 6d42cabf1e9901763456c5b41cf5c1493f5b8386
				}
				break;
			case 5:
				{
				_localctx = new OutputExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
<<<<<<< HEAD
				setState(212);
				match(ID);
				setState(213);
				match(T__20);
				setState(214);
				match(ID);
				setState(215);
				match(T__21);
=======
				setState(230);
				outputStatement();
>>>>>>> 6d42cabf1e9901763456c5b41cf5c1493f5b8386
				}
				break;
			case 6:
				{
				_localctx = new IndexExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
<<<<<<< HEAD
				setState(216);
=======
				setState(231);
>>>>>>> 6d42cabf1e9901763456c5b41cf5c1493f5b8386
				match(ID);
				setState(232);
				match(T__20);
				setState(233);
				match(ID);
				setState(234);
				match(T__21);
				}
				break;
			case 7:
				{
				_localctx = new IdExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
<<<<<<< HEAD
				setState(217);
				dataType();
				setState(218);
				match(T__2);
				setState(219);
				expression(0);
				setState(220);
				match(T__4);
=======
				setState(235);
				match(ID);
>>>>>>> 6d42cabf1e9901763456c5b41cf5c1493f5b8386
				}
				break;
			case 8:
				{
				_localctx = new TypeConversionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
<<<<<<< HEAD
				setState(222);
				match(REAL);
=======
				setState(236);
				dataType();
				setState(237);
				match(T__2);
				setState(238);
				expression(0);
				setState(239);
				match(T__4);
>>>>>>> 6d42cabf1e9901763456c5b41cf5c1493f5b8386
				}
				break;
			case 9:
				{
				_localctx = new RealLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
<<<<<<< HEAD
				setState(223);
				match(INT);
=======
				setState(241);
				match(REAL);
>>>>>>> 6d42cabf1e9901763456c5b41cf5c1493f5b8386
				}
				break;
			case 10:
				{
				_localctx = new IntLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(242);
				match(INT);
				}
				break;
			case 11:
				{
				_localctx = new StringLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
<<<<<<< HEAD
				setState(224);
=======
				setState(243);
>>>>>>> 6d42cabf1e9901763456c5b41cf5c1493f5b8386
				match(STRING);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
<<<<<<< HEAD
			setState(241);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
=======
			setState(257);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
>>>>>>> 6d42cabf1e9901763456c5b41cf5c1493f5b8386
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
<<<<<<< HEAD
					setState(239);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
=======
					setState(255);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
>>>>>>> 6d42cabf1e9901763456c5b41cf5c1493f5b8386
					case 1:
						{
						_localctx = new MulDivExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
<<<<<<< HEAD
						setState(227);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(228);
						((MulDivExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__5 || _la==T__25) ) {
							((MulDivExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
=======
						setState(246);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(247);
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
						setState(248);
						expression(12);
						}
						break;
					case 2:
						{
						_localctx = new AddSubExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(249);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(250);
						((AddSubExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__18 || _la==T__27) ) {
							((AddSubExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
>>>>>>> 6d42cabf1e9901763456c5b41cf5c1493f5b8386
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
<<<<<<< HEAD
						setState(229);
						expression(13);
						}
						break;
					case 2:
						{
						_localctx = new AddSubExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(230);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(231);
						((AddSubExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__18 || _la==T__26) ) {
							((AddSubExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(232);
						expression(12);
=======
						setState(251);
						expression(11);
>>>>>>> 6d42cabf1e9901763456c5b41cf5c1493f5b8386
						}
						break;
					case 3:
						{
						_localctx = new ExprListExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
<<<<<<< HEAD
						setState(233);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(234);
						match(T__6);
						setState(235);
						expression(9);
						}
						break;
					case 4:
						{
						_localctx = new AddListExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(236);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(237);
						match(T__27);
						setState(238);
						match(ID);
=======
						setState(252);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(253);
						match(T__6);
						setState(254);
						expression(8);
>>>>>>> 6d42cabf1e9901763456c5b41cf5c1493f5b8386
						}
						break;
					}
					} 
				}
<<<<<<< HEAD
				setState(243);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
=======
				setState(259);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
>>>>>>> 6d42cabf1e9901763456c5b41cf5c1493f5b8386
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
<<<<<<< HEAD
			setState(252);
=======
			setState(268);
>>>>>>> 6d42cabf1e9901763456c5b41cf5c1493f5b8386
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__28:
				enterOuterAlt(_localctx, 1);
				{
<<<<<<< HEAD
				setState(244);
=======
				setState(260);
>>>>>>> 6d42cabf1e9901763456c5b41cf5c1493f5b8386
				match(T__28);
				}
				break;
			case T__29:
				enterOuterAlt(_localctx, 2);
				{
<<<<<<< HEAD
				setState(245);
=======
				setState(261);
>>>>>>> 6d42cabf1e9901763456c5b41cf5c1493f5b8386
				match(T__29);
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 3);
				{
<<<<<<< HEAD
				setState(246);
=======
				setState(262);
>>>>>>> 6d42cabf1e9901763456c5b41cf5c1493f5b8386
				match(T__7);
				}
				break;
			case T__23:
				enterOuterAlt(_localctx, 4);
				{
<<<<<<< HEAD
				setState(247);
				match(T__23);
				setState(248);
				match(T__20);
				setState(249);
				match(ID);
				setState(250);
=======
				setState(263);
				match(T__23);
				setState(264);
				match(T__20);
				setState(265);
				match(ID);
				setState(266);
>>>>>>> 6d42cabf1e9901763456c5b41cf5c1493f5b8386
				match(T__21);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 5);
				{
<<<<<<< HEAD
				setState(251);
=======
				setState(267);
>>>>>>> 6d42cabf1e9901763456c5b41cf5c1493f5b8386
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
		enterRule(_localctx, 36, RULE_castTypes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
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
<<<<<<< HEAD
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\'\u0101\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\3\2\3\2\3\3\5\3+\n\3\3\3\7\3.\n\3\f\3\16\3\61\13\3\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4=\n\4\3\5\3\5\3\5\3\5\5\5C\n\5"+
		"\3\6\3\6\3\6\3\6\3\7\3\7\3\7\5\7L\n\7\3\7\5\7O\n\7\3\7\3\7\3\7\5\7T\n"+
		"\7\3\7\3\7\5\7X\n\7\3\b\3\b\3\b\3\b\7\b^\n\b\f\b\16\ba\13\b\3\t\3\t\3"+
		"\t\3\t\3\t\5\th\n\t\3\t\3\t\3\t\3\t\3\t\5\to\n\t\3\n\3\n\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\177\n\13\3\13\3\13"+
		"\3\13\3\13\7\13\u0085\n\13\f\13\16\13\u0088\13\13\3\13\3\13\3\f\3\f\3"+
		"\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u0098\n\16\3\16\5\16"+
		"\u009b\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00a4\n\17\3\17\3"+
		"\17\3\17\5\17\u00a9\n\17\3\17\3\17\5\17\u00ad\n\17\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\5\20\u00b5\n\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00c7\n\21\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00e4\n\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u00f2\n\22\f\22"+
		"\16\22\u00f5\13\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u00ff"+
		"\n\23\3\23\2\3\"\24\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$\2\7\3\2"+
		"\13\f\3\2!\"\4\2!!$$\4\2\b\b\34\34\4\2\25\25\35\35\2\u011e\2&\3\2\2\2"+
		"\4/\3\2\2\2\6<\3\2\2\2\b>\3\2\2\2\nD\3\2\2\2\fH\3\2\2\2\16Y\3\2\2\2\20"+
		"n\3\2\2\2\22p\3\2\2\2\24r\3\2\2\2\26\u008b\3\2\2\2\30\u008d\3\2\2\2\32"+
		"\u0090\3\2\2\2\34\u009c\3\2\2\2\36\u00ae\3\2\2\2 \u00ba\3\2\2\2\"\u00e3"+
		"\3\2\2\2$\u00fe\3\2\2\2&\'\5\4\3\2\'(\7\2\2\3(\3\3\2\2\2)+\5\6\4\2*)\3"+
		"\2\2\2*+\3\2\2\2+,\3\2\2\2,.\7\3\2\2-*\3\2\2\2.\61\3\2\2\2/-\3\2\2\2/"+
		"\60\3\2\2\2\60\5\3\2\2\2\61/\3\2\2\2\62=\5\f\7\2\63=\5\n\6\2\64=\5\b\5"+
		"\2\65=\5\16\b\2\66=\5\24\13\2\67=\5\30\r\28=\5\32\16\29=\5\34\17\2:=\5"+
		"\36\20\2;=\5 \21\2<\62\3\2\2\2<\63\3\2\2\2<\64\3\2\2\2<\65\3\2\2\2<\66"+
		"\3\2\2\2<\67\3\2\2\2<8\3\2\2\2<9\3\2\2\2<:\3\2\2\2<;\3\2\2\2=\7\3\2\2"+
		"\2>?\5$\23\2?B\7!\2\2@A\7\4\2\2AC\5\"\22\2B@\3\2\2\2BC\3\2\2\2C\t\3\2"+
		"\2\2DE\7!\2\2EF\7\4\2\2FG\5\"\22\2G\13\3\2\2\2HI\7!\2\2IK\7\4\2\2JL\5"+
		"$\23\2KJ\3\2\2\2KL\3\2\2\2LN\3\2\2\2MO\7\5\2\2NM\3\2\2\2NO\3\2\2\2OP\3"+
		"\2\2\2PQ\7\6\2\2QS\7$\2\2RT\7\7\2\2SR\3\2\2\2ST\3\2\2\2TW\3\2\2\2UV\7"+
		"\b\2\2VX\7!\2\2WU\3\2\2\2WX\3\2\2\2X\r\3\2\2\2YZ\5\22\n\2Z_\5\20\t\2["+
		"\\\7\t\2\2\\^\5\20\t\2][\3\2\2\2^a\3\2\2\2_]\3\2\2\2_`\3\2\2\2`\17\3\2"+
		"\2\2a_\3\2\2\2bc\7\n\2\2cg\7\5\2\2dh\7!\2\2eh\7$\2\2fh\5\"\22\2gd\3\2"+
		"\2\2ge\3\2\2\2gf\3\2\2\2hi\3\2\2\2ij\7\t\2\2jk\7\"\2\2ko\7\7\2\2lo\7$"+
		"\2\2mo\7!\2\2nb\3\2\2\2nl\3\2\2\2nm\3\2\2\2o\21\3\2\2\2pq\t\2\2\2q\23"+
		"\3\2\2\2rs\7\r\2\2st\7!\2\2tu\7\4\2\2uv\t\3\2\2v~\7\16\2\2w\177\7\"\2"+
		"\2x\177\7!\2\2yz\5\26\f\2z{\7\5\2\2{|\7!\2\2|}\7\7\2\2}\177\3\2\2\2~w"+
		"\3\2\2\2~x\3\2\2\2~y\3\2\2\2\177\u0080\3\2\2\2\u0080\u0086\7\17\2\2\u0081"+
		"\u0082\5\"\22\2\u0082\u0083\7\3\2\2\u0083\u0085\3\2\2\2\u0084\u0081\3"+
		"\2\2\2\u0085\u0088\3\2\2\2\u0086\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087"+
		"\u0089\3\2\2\2\u0088\u0086\3\2\2\2\u0089\u008a\7\20\2\2\u008a\25\3\2\2"+
		"\2\u008b\u008c\7\21\2\2\u008c\27\3\2\2\2\u008d\u008e\7\22\2\2\u008e\u008f"+
		"\7$\2\2\u008f\31\3\2\2\2\u0090\u0091\7\23\2\2\u0091\u0092\5$\23\2\u0092"+
		"\u0093\7!\2\2\u0093\u009a\7\4\2\2\u0094\u009b\7\"\2\2\u0095\u0097\7\24"+
		"\2\2\u0096\u0098\7\25\2\2\u0097\u0096\3\2\2\2\u0097\u0098\3\2\2\2\u0098"+
		"\u0099\3\2\2\2\u0099\u009b\7\"\2\2\u009a\u0094\3\2\2\2\u009a\u0095\3\2"+
		"\2\2\u009b\33\3\2\2\2\u009c\u009d\7\26\2\2\u009d\u009e\5$\23\2\u009e\u00ac"+
		"\7!\2\2\u009f\u00a0\7\27\2\2\u00a0\u00a3\7!\2\2\u00a1\u00a2\7\t\2\2\u00a2"+
		"\u00a4\7!\2\2\u00a3\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a5\3\2"+
		"\2\2\u00a5\u00a8\7\30\2\2\u00a6\u00a7\7\4\2\2\u00a7\u00a9\5\"\22\2\u00a8"+
		"\u00a6\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00ad\3\2\2\2\u00aa\u00ab\7\4"+
		"\2\2\u00ab\u00ad\5\"\22\2\u00ac\u009f\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ad"+
		"\35\3\2\2\2\u00ae\u00af\7\31\2\2\u00af\u00b0\7!\2\2\u00b0\u00b1\7\27\2"+
		"\2\u00b1\u00b4\7!\2\2\u00b2\u00b3\7\t\2\2\u00b3\u00b5\7!\2\2\u00b4\u00b2"+
		"\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b7\7\30\2\2"+
		"\u00b7\u00b8\7\4\2\2\u00b8\u00b9\5\"\22\2\u00b9\37\3\2\2\2\u00ba\u00bb"+
		"\7\32\2\2\u00bb\u00bc\7\27\2\2\u00bc\u00bd\5$\23\2\u00bd\u00be\7\30\2"+
		"\2\u00be\u00c6\7!\2\2\u00bf\u00c0\7\4\2\2\u00c0\u00c1\7\33\2\2\u00c1\u00c2"+
		"\7\32\2\2\u00c2\u00c3\7\27\2\2\u00c3\u00c4\5$\23\2\u00c4\u00c5\7\30\2"+
		"\2\u00c5\u00c7\3\2\2\2\u00c6\u00bf\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7!"+
		"\3\2\2\2\u00c8\u00c9\b\22\1\2\u00c9\u00ca\7\6\2\2\u00ca\u00e4\7$\2\2\u00cb"+
		"\u00cc\7\n\2\2\u00cc\u00cd\7\5\2\2\u00cd\u00ce\t\4\2\2\u00ce\u00cf\7\t"+
		"\2\2\u00cf\u00d0\7\"\2\2\u00d0\u00e4\7\7\2\2\u00d1\u00d2\7\5\2\2\u00d2"+
		"\u00d3\5\"\22\2\u00d3\u00d4\7\7\2\2\u00d4\u00e4\3\2\2\2\u00d5\u00e4\5"+
		"\16\b\2\u00d6\u00d7\7!\2\2\u00d7\u00d8\7\27\2\2\u00d8\u00d9\7!\2\2\u00d9"+
		"\u00e4\7\30\2\2\u00da\u00e4\7!\2\2\u00db\u00dc\5$\23\2\u00dc\u00dd\7\5"+
		"\2\2\u00dd\u00de\5\"\22\2\u00de\u00df\7\7\2\2\u00df\u00e4\3\2\2\2\u00e0"+
		"\u00e4\7#\2\2\u00e1\u00e4\7\"\2\2\u00e2\u00e4\7$\2\2\u00e3\u00c8\3\2\2"+
		"\2\u00e3\u00cb\3\2\2\2\u00e3\u00d1\3\2\2\2\u00e3\u00d5\3\2\2\2\u00e3\u00d6"+
		"\3\2\2\2\u00e3\u00da\3\2\2\2\u00e3\u00db\3\2\2\2\u00e3\u00e0\3\2\2\2\u00e3"+
		"\u00e1\3\2\2\2\u00e3\u00e2\3\2\2\2\u00e4\u00f3\3\2\2\2\u00e5\u00e6\f\16"+
		"\2\2\u00e6\u00e7\t\5\2\2\u00e7\u00f2\5\"\22\17\u00e8\u00e9\f\r\2\2\u00e9"+
		"\u00ea\t\6\2\2\u00ea\u00f2\5\"\22\16\u00eb\u00ec\f\n\2\2\u00ec\u00ed\7"+
		"\t\2\2\u00ed\u00f2\5\"\22\13\u00ee\u00ef\f\t\2\2\u00ef\u00f0\7\36\2\2"+
		"\u00f0\u00f2\7!\2\2\u00f1\u00e5\3\2\2\2\u00f1\u00e8\3\2\2\2\u00f1\u00eb"+
		"\3\2\2\2\u00f1\u00ee\3\2\2\2\u00f2\u00f5\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f3"+
		"\u00f4\3\2\2\2\u00f4#\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f6\u00ff\7\37\2\2"+
		"\u00f7\u00ff\7 \2\2\u00f8\u00ff\7\n\2\2\u00f9\u00fa\7\32\2\2\u00fa\u00fb"+
		"\7\27\2\2\u00fb\u00fc\7!\2\2\u00fc\u00ff\7\30\2\2\u00fd\u00ff\7!\2\2\u00fe"+
		"\u00f6\3\2\2\2\u00fe\u00f7\3\2\2\2\u00fe\u00f8\3\2\2\2\u00fe\u00f9\3\2"+
		"\2\2\u00fe\u00fd\3\2\2\2\u00ff%\3\2\2\2\32*/<BKNSW_gn~\u0086\u0097\u009a"+
		"\u00a3\u00a8\u00ac\u00b4\u00c6\u00e3\u00f1\u00f3\u00fe";
=======
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\'\u0113\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\3\2\3\2\3\3\5\3-\n\3\3\3\7\3\60\n\3\f\3\16\3"+
		"\63\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4?\n\4\3\5\3\5\3\5"+
		"\3\5\5\5E\n\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\5\7N\n\7\3\7\5\7Q\n\7\3\7\3"+
		"\7\3\7\5\7V\n\7\3\7\3\7\5\7Z\n\7\3\b\3\b\3\b\3\b\7\b`\n\b\f\b\16\bc\13"+
		"\b\3\t\3\t\3\t\3\t\3\t\5\tj\n\t\3\t\3\t\3\t\3\t\3\t\5\tq\n\t\3\n\3\n\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u0081"+
		"\n\13\3\13\3\13\3\13\3\13\7\13\u0087\n\13\f\13\16\13\u008a\13\13\3\13"+
		"\3\13\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u009a"+
		"\n\16\3\16\5\16\u009d\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00a6"+
		"\n\17\3\17\3\17\3\17\5\17\u00ab\n\17\3\17\3\17\5\17\u00af\n\17\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\5\20\u00b7\n\20\3\20\3\20\3\20\3\20\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00c9\n\21\3\22"+
		"\3\22\3\22\3\22\5\22\u00cf\n\22\3\22\5\22\u00d2\n\22\3\22\3\22\3\22\5"+
		"\22\u00d7\n\22\3\22\3\22\5\22\u00db\n\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00f7\n\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\7\22\u0102\n\22\f\22\16\22\u0105\13\22\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u010f\n\23\3\24\3\24\3\24\2\3\"\25"+
		"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&\2\b\3\2\13\f\3\2!\"\4\2!"+
		"!$$\4\2\b\b\35\35\4\2\25\25\36\36\3\2\37 \2\u0133\2(\3\2\2\2\4\61\3\2"+
		"\2\2\6>\3\2\2\2\b@\3\2\2\2\nF\3\2\2\2\fJ\3\2\2\2\16[\3\2\2\2\20p\3\2\2"+
		"\2\22r\3\2\2\2\24t\3\2\2\2\26\u008d\3\2\2\2\30\u008f\3\2\2\2\32\u0092"+
		"\3\2\2\2\34\u009e\3\2\2\2\36\u00b0\3\2\2\2 \u00bc\3\2\2\2\"\u00f6\3\2"+
		"\2\2$\u010e\3\2\2\2&\u0110\3\2\2\2()\5\4\3\2)*\7\2\2\3*\3\3\2\2\2+-\5"+
		"\6\4\2,+\3\2\2\2,-\3\2\2\2-.\3\2\2\2.\60\7\3\2\2/,\3\2\2\2\60\63\3\2\2"+
		"\2\61/\3\2\2\2\61\62\3\2\2\2\62\5\3\2\2\2\63\61\3\2\2\2\64?\5\f\7\2\65"+
		"?\5\n\6\2\66?\5\b\5\2\67?\5\16\b\28?\5\24\13\29?\5\30\r\2:?\5\32\16\2"+
		";?\5\34\17\2<?\5\36\20\2=?\5 \21\2>\64\3\2\2\2>\65\3\2\2\2>\66\3\2\2\2"+
		">\67\3\2\2\2>8\3\2\2\2>9\3\2\2\2>:\3\2\2\2>;\3\2\2\2><\3\2\2\2>=\3\2\2"+
		"\2?\7\3\2\2\2@A\5$\23\2AD\7!\2\2BC\7\4\2\2CE\5\"\22\2DB\3\2\2\2DE\3\2"+
		"\2\2E\t\3\2\2\2FG\7!\2\2GH\7\4\2\2HI\5\"\22\2I\13\3\2\2\2JK\7!\2\2KM\7"+
		"\4\2\2LN\5$\23\2ML\3\2\2\2MN\3\2\2\2NP\3\2\2\2OQ\7\5\2\2PO\3\2\2\2PQ\3"+
		"\2\2\2QR\3\2\2\2RS\7\6\2\2SU\7$\2\2TV\7\7\2\2UT\3\2\2\2UV\3\2\2\2VY\3"+
		"\2\2\2WX\7\b\2\2XZ\7!\2\2YW\3\2\2\2YZ\3\2\2\2Z\r\3\2\2\2[\\\5\22\n\2\\"+
		"a\5\20\t\2]^\7\t\2\2^`\5\20\t\2_]\3\2\2\2`c\3\2\2\2a_\3\2\2\2ab\3\2\2"+
		"\2b\17\3\2\2\2ca\3\2\2\2de\7\n\2\2ei\7\5\2\2fj\7!\2\2gj\7$\2\2hj\5\"\22"+
		"\2if\3\2\2\2ig\3\2\2\2ih\3\2\2\2jk\3\2\2\2kl\7\t\2\2lm\7\"\2\2mq\7\7\2"+
		"\2nq\7$\2\2oq\7!\2\2pd\3\2\2\2pn\3\2\2\2po\3\2\2\2q\21\3\2\2\2rs\t\2\2"+
		"\2s\23\3\2\2\2tu\7\r\2\2uv\7!\2\2vw\7\4\2\2wx\t\3\2\2x\u0080\7\16\2\2"+
		"y\u0081\7\"\2\2z\u0081\7!\2\2{|\5\26\f\2|}\7\5\2\2}~\7!\2\2~\177\7\7\2"+
		"\2\177\u0081\3\2\2\2\u0080y\3\2\2\2\u0080z\3\2\2\2\u0080{\3\2\2\2\u0081"+
		"\u0082\3\2\2\2\u0082\u0088\7\17\2\2\u0083\u0084\5\"\22\2\u0084\u0085\7"+
		"\3\2\2\u0085\u0087\3\2\2\2\u0086\u0083\3\2\2\2\u0087\u008a\3\2\2\2\u0088"+
		"\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008b\3\2\2\2\u008a\u0088\3\2"+
		"\2\2\u008b\u008c\7\20\2\2\u008c\25\3\2\2\2\u008d\u008e\7\21\2\2\u008e"+
		"\27\3\2\2\2\u008f\u0090\7\22\2\2\u0090\u0091\7$\2\2\u0091\31\3\2\2\2\u0092"+
		"\u0093\7\23\2\2\u0093\u0094\5$\23\2\u0094\u0095\7!\2\2\u0095\u009c\7\4"+
		"\2\2\u0096\u009d\7\"\2\2\u0097\u0099\7\24\2\2\u0098\u009a\7\25\2\2\u0099"+
		"\u0098\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u009d\7\""+
		"\2\2\u009c\u0096\3\2\2\2\u009c\u0097\3\2\2\2\u009d\33\3\2\2\2\u009e\u009f"+
		"\7\26\2\2\u009f\u00a0\5$\23\2\u00a0\u00ae\7!\2\2\u00a1\u00a2\7\27\2\2"+
		"\u00a2\u00a5\7!\2\2\u00a3\u00a4\7\t\2\2\u00a4\u00a6\7!\2\2\u00a5\u00a3"+
		"\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00aa\7\30\2\2"+
		"\u00a8\u00a9\7\4\2\2\u00a9\u00ab\5\"\22\2\u00aa\u00a8\3\2\2\2\u00aa\u00ab"+
		"\3\2\2\2\u00ab\u00af\3\2\2\2\u00ac\u00ad\7\4\2\2\u00ad\u00af\5\"\22\2"+
		"\u00ae\u00a1\3\2\2\2\u00ae\u00ac\3\2\2\2\u00af\35\3\2\2\2\u00b0\u00b1"+
		"\7\31\2\2\u00b1\u00b2\7!\2\2\u00b2\u00b3\7\27\2\2\u00b3\u00b6\7!\2\2\u00b4"+
		"\u00b5\7\t\2\2\u00b5\u00b7\7!\2\2\u00b6\u00b4\3\2\2\2\u00b6\u00b7\3\2"+
		"\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00b9\7\30\2\2\u00b9\u00ba\7\4\2\2\u00ba"+
		"\u00bb\5\"\22\2\u00bb\37\3\2\2\2\u00bc\u00bd\7\32\2\2\u00bd\u00be\7\27"+
		"\2\2\u00be\u00bf\5$\23\2\u00bf\u00c0\7\30\2\2\u00c0\u00c8\7!\2\2\u00c1"+
		"\u00c2\7\4\2\2\u00c2\u00c3\7\33\2\2\u00c3\u00c4\7\32\2\2\u00c4\u00c5\7"+
		"\27\2\2\u00c5\u00c6\5$\23\2\u00c6\u00c7\7\30\2\2\u00c7\u00c9\3\2\2\2\u00c8"+
		"\u00c1\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9!\3\2\2\2\u00ca\u00cb\b\22\1\2"+
		"\u00cb\u00cc\7\6\2\2\u00cc\u00f7\7$\2\2\u00cd\u00cf\5&\24\2\u00ce\u00cd"+
		"\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d1\3\2\2\2\u00d0\u00d2\7\5\2\2\u00d1"+
		"\u00d0\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d4\7\6"+
		"\2\2\u00d4\u00d6\7$\2\2\u00d5\u00d7\7\7\2\2\u00d6\u00d5\3\2\2\2\u00d6"+
		"\u00d7\3\2\2\2\u00d7\u00da\3\2\2\2\u00d8\u00d9\7\b\2\2\u00d9\u00db\7!"+
		"\2\2\u00da\u00d8\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc"+
		"\u00dd\7\34\2\2\u00dd\u00f7\7!\2\2\u00de\u00df\7\n\2\2\u00df\u00e0\7\5"+
		"\2\2\u00e0\u00e1\t\4\2\2\u00e1\u00e2\7\t\2\2\u00e2\u00e3\7\"\2\2\u00e3"+
		"\u00f7\7\7\2\2\u00e4\u00e5\7\5\2\2\u00e5\u00e6\5\"\22\2\u00e6\u00e7\7"+
		"\7\2\2\u00e7\u00f7\3\2\2\2\u00e8\u00f7\5\16\b\2\u00e9\u00ea\7!\2\2\u00ea"+
		"\u00eb\7\27\2\2\u00eb\u00ec\7!\2\2\u00ec\u00f7\7\30\2\2\u00ed\u00f7\7"+
		"!\2\2\u00ee\u00ef\5$\23\2\u00ef\u00f0\7\5\2\2\u00f0\u00f1\5\"\22\2\u00f1"+
		"\u00f2\7\7\2\2\u00f2\u00f7\3\2\2\2\u00f3\u00f7\7#\2\2\u00f4\u00f7\7\""+
		"\2\2\u00f5\u00f7\7$\2\2\u00f6\u00ca\3\2\2\2\u00f6\u00ce\3\2\2\2\u00f6"+
		"\u00de\3\2\2\2\u00f6\u00e4\3\2\2\2\u00f6\u00e8\3\2\2\2\u00f6\u00e9\3\2"+
		"\2\2\u00f6\u00ed\3\2\2\2\u00f6\u00ee\3\2\2\2\u00f6\u00f3\3\2\2\2\u00f6"+
		"\u00f4\3\2\2\2\u00f6\u00f5\3\2\2\2\u00f7\u0103\3\2\2\2\u00f8\u00f9\f\r"+
		"\2\2\u00f9\u00fa\t\5\2\2\u00fa\u0102\5\"\22\16\u00fb\u00fc\f\f\2\2\u00fc"+
		"\u00fd\t\6\2\2\u00fd\u0102\5\"\22\r\u00fe\u00ff\f\t\2\2\u00ff\u0100\7"+
		"\t\2\2\u0100\u0102\5\"\22\n\u0101\u00f8\3\2\2\2\u0101\u00fb\3\2\2\2\u0101"+
		"\u00fe\3\2\2\2\u0102\u0105\3\2\2\2\u0103\u0101\3\2\2\2\u0103\u0104\3\2"+
		"\2\2\u0104#\3\2\2\2\u0105\u0103\3\2\2\2\u0106\u010f\7\37\2\2\u0107\u010f"+
		"\7 \2\2\u0108\u010f\7\n\2\2\u0109\u010a\7\32\2\2\u010a\u010b\7\27\2\2"+
		"\u010b\u010c\7!\2\2\u010c\u010f\7\30\2\2\u010d\u010f\7!\2\2\u010e\u0106"+
		"\3\2\2\2\u010e\u0107\3\2\2\2\u010e\u0108\3\2\2\2\u010e\u0109\3\2\2\2\u010e"+
		"\u010d\3\2\2\2\u010f%\3\2\2\2\u0110\u0111\t\7\2\2\u0111\'\3\2\2\2\36,"+
		"\61>DMPUYaip\u0080\u0088\u0099\u009c\u00a5\u00aa\u00ae\u00b6\u00c8\u00ce"+
		"\u00d1\u00d6\u00da\u00f6\u0101\u0103\u010e";
>>>>>>> 6d42cabf1e9901763456c5b41cf5c1493f5b8386
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
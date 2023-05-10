// Generated from /home/mendes/Desktop/C/comp-2023-dimana-01/src/dimana.g4 by ANTLR 4.9.2
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
		RULE_assignment = 4, RULE_outputStatement = 5, RULE_loopStatement = 6, 
		RULE_headerFile = 7, RULE_prefixUnit = 8, RULE_unit = 9, RULE_alternativeUnit = 10, 
		RULE_listDeclaration = 11, RULE_expression = 12, RULE_dataType = 13;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statList", "statement", "variableDeclaration", "assignment", 
			"outputStatement", "loopStatement", "headerFile", "prefixUnit", "unit", 
			"alternativeUnit", "listDeclaration", "expression", "dataType"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'='", "'write'", "'writeln'", "'for'", "'to'", "'length'", 
			"'('", "')'", "'do'", "'end'", "'use'", "'prefix'", "'1e'", "'-'", "'dimension'", 
			"'['", "','", "']'", "'unit'", "'list'", "'new'", "'read'", "'string'", 
			"'*'", "'/'", "'+'", "'>>'", "'integer'", "'real'"
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
			setState(28);
			statList();
			setState(29);
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
			setState(37);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__11) | (1L << T__12) | (1L << T__15) | (1L << T__19) | (1L << T__20) | (1L << T__23) | (1L << T__28) | (1L << T__29) | (1L << ID))) != 0)) {
				{
				{
				setState(32);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__11) | (1L << T__12) | (1L << T__15) | (1L << T__19) | (1L << T__20) | (1L << T__23) | (1L << T__28) | (1L << T__29) | (1L << ID))) != 0)) {
					{
					setState(31);
					statement();
					}
				}

				setState(34);
				match(T__0);
				}
				}
				setState(39);
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
			setState(49);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(40);
				assignment();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(41);
				variableDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(42);
				outputStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(43);
				loopStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(44);
				headerFile();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(45);
				prefixUnit();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(46);
				unit();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(47);
				alternativeUnit();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(48);
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
			setState(51);
			dataType();
			setState(52);
			match(ID);
			setState(55);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(53);
				match(T__1);
				setState(54);
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
			setState(57);
			match(ID);
			setState(58);
			match(T__1);
			setState(59);
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

	public static class OutputStatementContext extends ParserRuleContext {
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
		enterRule(_localctx, 10, RULE_outputStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			_la = _input.LA(1);
			if ( !(_la==T__2 || _la==T__3) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(62);
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
		enterRule(_localctx, 12, RULE_loopStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			match(T__4);
			setState(65);
			match(ID);
			setState(66);
			match(T__1);
			setState(67);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==INT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(68);
			match(T__5);
			setState(75);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				{
				setState(69);
				match(INT);
				}
				break;
			case ID:
				{
				setState(70);
				match(ID);
				}
				break;
			case T__6:
				{
				setState(71);
				match(T__6);
				setState(72);
				match(T__7);
				setState(73);
				match(ID);
				setState(74);
				match(T__8);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(77);
			match(T__9);
			setState(87);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(83);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__20) | (1L << T__22) | (1L << T__23) | (1L << T__28) | (1L << T__29) | (1L << ID) | (1L << INT) | (1L << REAL) | (1L << STRING))) != 0)) {
					{
					{
					setState(78);
					expression(0);
					setState(79);
					match(T__0);
					}
					}
					setState(85);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				{
				setState(86);
				statList();
				}
				break;
			}
			setState(89);
			match(T__10);
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
		enterRule(_localctx, 14, RULE_headerFile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			match(T__11);
			setState(92);
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
		enterRule(_localctx, 16, RULE_prefixUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			match(T__12);
			setState(95);
			dataType();
			setState(96);
			match(ID);
			setState(97);
			match(T__1);
			setState(104);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				{
				setState(98);
				match(INT);
				}
				break;
			case T__13:
				{
				setState(99);
				match(T__13);
				setState(101);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__14) {
					{
					setState(100);
					((PrefixUnitContext)_localctx).minus = match(T__14);
					}
				}

				setState(103);
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
		enterRule(_localctx, 18, RULE_unit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			match(T__15);
			setState(107);
			dataType();
			setState(108);
			match(ID);
			setState(122);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__16:
				{
				setState(109);
				match(T__16);
				setState(110);
				match(ID);
				setState(113);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__17) {
					{
					setState(111);
					match(T__17);
					setState(112);
					match(ID);
					}
				}

				setState(115);
				match(T__18);
				setState(118);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(116);
					match(T__1);
					setState(117);
					expression(0);
					}
				}

				}
				break;
			case T__1:
				{
				setState(120);
				match(T__1);
				setState(121);
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
		enterRule(_localctx, 20, RULE_alternativeUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			match(T__19);
			setState(125);
			match(ID);
			setState(126);
			match(T__16);
			setState(127);
			match(ID);
			setState(130);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__17) {
				{
				setState(128);
				match(T__17);
				setState(129);
				match(ID);
				}
			}

			setState(132);
			match(T__18);
			setState(133);
			match(T__1);
			setState(134);
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
		enterRule(_localctx, 22, RULE_listDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			match(T__20);
			setState(137);
			match(T__16);
			setState(138);
			dataType();
			setState(139);
			match(T__18);
			setState(140);
			match(ID);
			setState(148);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(141);
				match(T__1);
				setState(142);
				match(T__21);
				setState(143);
				match(T__20);
				setState(144);
				match(T__16);
				setState(145);
				dataType();
				setState(146);
				match(T__18);
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
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				_localctx = new InputExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(151);
				match(T__22);
				setState(152);
				match(STRING);
				}
				break;
			case 2:
				{
				_localctx = new StringAssignExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(153);
				match(T__23);
				setState(154);
				match(T__7);
				setState(155);
				_la = _input.LA(1);
				if ( !(_la==ID || _la==STRING) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(156);
				match(T__17);
				setState(157);
				match(INT);
				setState(158);
				match(T__8);
				}
				break;
			case 3:
				{
				_localctx = new ParenExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(159);
				match(T__7);
				setState(160);
				expression(0);
				setState(161);
				match(T__8);
				}
				break;
			case 4:
				{
				_localctx = new IndexExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(163);
				match(ID);
				setState(164);
				match(T__16);
				setState(165);
				match(ID);
				setState(166);
				match(T__18);
				}
				break;
			case 5:
				{
				_localctx = new IdExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(167);
				match(ID);
				}
				break;
			case 6:
				{
				_localctx = new TypeConversionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(168);
				dataType();
				setState(169);
				match(T__7);
				setState(170);
				expression(0);
				setState(171);
				match(T__8);
				}
				break;
			case 7:
				{
				_localctx = new RealLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(173);
				match(REAL);
				}
				break;
			case 8:
				{
				_localctx = new IntLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(174);
				match(INT);
				}
				break;
			case 9:
				{
				_localctx = new StringLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(175);
				match(STRING);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(192);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(190);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
					case 1:
						{
						_localctx = new MulDivExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(178);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(179);
						_la = _input.LA(1);
						if ( !(_la==T__24 || _la==T__25) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(180);
						expression(12);
						}
						break;
					case 2:
						{
						_localctx = new AddSubExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(181);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(182);
						_la = _input.LA(1);
						if ( !(_la==T__14 || _la==T__26) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(183);
						expression(11);
						}
						break;
					case 3:
						{
						_localctx = new ExprListExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(184);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(185);
						match(T__17);
						setState(186);
						expression(9);
						}
						break;
					case 4:
						{
						_localctx = new AddListExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(187);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(188);
						match(T__27);
						setState(189);
						match(ID);
						}
						break;
					}
					} 
				}
				setState(194);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
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
		enterRule(_localctx, 26, RULE_dataType);
		try {
			setState(203);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__28:
				enterOuterAlt(_localctx, 1);
				{
				setState(195);
				match(T__28);
				}
				break;
			case T__29:
				enterOuterAlt(_localctx, 2);
				{
				setState(196);
				match(T__29);
				}
				break;
			case T__23:
				enterOuterAlt(_localctx, 3);
				{
				setState(197);
				match(T__23);
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 4);
				{
				setState(198);
				match(T__20);
				setState(199);
				match(T__16);
				setState(200);
				match(ID);
				setState(201);
				match(T__18);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 5);
				{
				setState(202);
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
		case 12:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\'\u00d0\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\2\3\3\5\3#\n\3\3\3\7"+
		"\3&\n\3\f\3\16\3)\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\64\n\4"+
		"\3\5\3\5\3\5\3\5\5\5:\n\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\bN\n\b\3\b\3\b\3\b\3\b\7\bT\n\b\f\b\16"+
		"\bW\13\b\3\b\5\bZ\n\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\5\nh\n\n\3\n\5\nk\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13t\n\13\3"+
		"\13\3\13\3\13\5\13y\n\13\3\13\3\13\5\13}\n\13\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\5\f\u0085\n\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\5\r\u0097\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\5\16\u00b3\n\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\7\16\u00c1\n\16\f\16\16\16\u00c4\13\16\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00ce\n\17\3\17\2\3\32\20\2\4\6\b"+
		"\n\f\16\20\22\24\26\30\32\34\2\7\3\2\5\6\3\2!\"\4\2!!$$\3\2\33\34\4\2"+
		"\21\21\35\35\2\u00e7\2\36\3\2\2\2\4\'\3\2\2\2\6\63\3\2\2\2\b\65\3\2\2"+
		"\2\n;\3\2\2\2\f?\3\2\2\2\16B\3\2\2\2\20]\3\2\2\2\22`\3\2\2\2\24l\3\2\2"+
		"\2\26~\3\2\2\2\30\u008a\3\2\2\2\32\u00b2\3\2\2\2\34\u00cd\3\2\2\2\36\37"+
		"\5\4\3\2\37 \7\2\2\3 \3\3\2\2\2!#\5\6\4\2\"!\3\2\2\2\"#\3\2\2\2#$\3\2"+
		"\2\2$&\7\3\2\2%\"\3\2\2\2&)\3\2\2\2\'%\3\2\2\2\'(\3\2\2\2(\5\3\2\2\2)"+
		"\'\3\2\2\2*\64\5\n\6\2+\64\5\b\5\2,\64\5\f\7\2-\64\5\16\b\2.\64\5\20\t"+
		"\2/\64\5\22\n\2\60\64\5\24\13\2\61\64\5\26\f\2\62\64\5\30\r\2\63*\3\2"+
		"\2\2\63+\3\2\2\2\63,\3\2\2\2\63-\3\2\2\2\63.\3\2\2\2\63/\3\2\2\2\63\60"+
		"\3\2\2\2\63\61\3\2\2\2\63\62\3\2\2\2\64\7\3\2\2\2\65\66\5\34\17\2\669"+
		"\7!\2\2\678\7\4\2\28:\5\32\16\29\67\3\2\2\29:\3\2\2\2:\t\3\2\2\2;<\7!"+
		"\2\2<=\7\4\2\2=>\5\32\16\2>\13\3\2\2\2?@\t\2\2\2@A\5\32\16\2A\r\3\2\2"+
		"\2BC\7\7\2\2CD\7!\2\2DE\7\4\2\2EF\t\3\2\2FM\7\b\2\2GN\7\"\2\2HN\7!\2\2"+
		"IJ\7\t\2\2JK\7\n\2\2KL\7!\2\2LN\7\13\2\2MG\3\2\2\2MH\3\2\2\2MI\3\2\2\2"+
		"NO\3\2\2\2OY\7\f\2\2PQ\5\32\16\2QR\7\3\2\2RT\3\2\2\2SP\3\2\2\2TW\3\2\2"+
		"\2US\3\2\2\2UV\3\2\2\2VZ\3\2\2\2WU\3\2\2\2XZ\5\4\3\2YU\3\2\2\2YX\3\2\2"+
		"\2Z[\3\2\2\2[\\\7\r\2\2\\\17\3\2\2\2]^\7\16\2\2^_\7$\2\2_\21\3\2\2\2`"+
		"a\7\17\2\2ab\5\34\17\2bc\7!\2\2cj\7\4\2\2dk\7\"\2\2eg\7\20\2\2fh\7\21"+
		"\2\2gf\3\2\2\2gh\3\2\2\2hi\3\2\2\2ik\7\"\2\2jd\3\2\2\2je\3\2\2\2k\23\3"+
		"\2\2\2lm\7\22\2\2mn\5\34\17\2n|\7!\2\2op\7\23\2\2ps\7!\2\2qr\7\24\2\2"+
		"rt\7!\2\2sq\3\2\2\2st\3\2\2\2tu\3\2\2\2ux\7\25\2\2vw\7\4\2\2wy\5\32\16"+
		"\2xv\3\2\2\2xy\3\2\2\2y}\3\2\2\2z{\7\4\2\2{}\5\32\16\2|o\3\2\2\2|z\3\2"+
		"\2\2}\25\3\2\2\2~\177\7\26\2\2\177\u0080\7!\2\2\u0080\u0081\7\23\2\2\u0081"+
		"\u0084\7!\2\2\u0082\u0083\7\24\2\2\u0083\u0085\7!\2\2\u0084\u0082\3\2"+
		"\2\2\u0084\u0085\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0087\7\25\2\2\u0087"+
		"\u0088\7\4\2\2\u0088\u0089\5\32\16\2\u0089\27\3\2\2\2\u008a\u008b\7\27"+
		"\2\2\u008b\u008c\7\23\2\2\u008c\u008d\5\34\17\2\u008d\u008e\7\25\2\2\u008e"+
		"\u0096\7!\2\2\u008f\u0090\7\4\2\2\u0090\u0091\7\30\2\2\u0091\u0092\7\27"+
		"\2\2\u0092\u0093\7\23\2\2\u0093\u0094\5\34\17\2\u0094\u0095\7\25\2\2\u0095"+
		"\u0097\3\2\2\2\u0096\u008f\3\2\2\2\u0096\u0097\3\2\2\2\u0097\31\3\2\2"+
		"\2\u0098\u0099\b\16\1\2\u0099\u009a\7\31\2\2\u009a\u00b3\7$\2\2\u009b"+
		"\u009c\7\32\2\2\u009c\u009d\7\n\2\2\u009d\u009e\t\4\2\2\u009e\u009f\7"+
		"\24\2\2\u009f\u00a0\7\"\2\2\u00a0\u00b3\7\13\2\2\u00a1\u00a2\7\n\2\2\u00a2"+
		"\u00a3\5\32\16\2\u00a3\u00a4\7\13\2\2\u00a4\u00b3\3\2\2\2\u00a5\u00a6"+
		"\7!\2\2\u00a6\u00a7\7\23\2\2\u00a7\u00a8\7!\2\2\u00a8\u00b3\7\25\2\2\u00a9"+
		"\u00b3\7!\2\2\u00aa\u00ab\5\34\17\2\u00ab\u00ac\7\n\2\2\u00ac\u00ad\5"+
		"\32\16\2\u00ad\u00ae\7\13\2\2\u00ae\u00b3\3\2\2\2\u00af\u00b3\7#\2\2\u00b0"+
		"\u00b3\7\"\2\2\u00b1\u00b3\7$\2\2\u00b2\u0098\3\2\2\2\u00b2\u009b\3\2"+
		"\2\2\u00b2\u00a1\3\2\2\2\u00b2\u00a5\3\2\2\2\u00b2\u00a9\3\2\2\2\u00b2"+
		"\u00aa\3\2\2\2\u00b2\u00af\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b2\u00b1\3\2"+
		"\2\2\u00b3\u00c2\3\2\2\2\u00b4\u00b5\f\r\2\2\u00b5\u00b6\t\5\2\2\u00b6"+
		"\u00c1\5\32\16\16\u00b7\u00b8\f\f\2\2\u00b8\u00b9\t\6\2\2\u00b9\u00c1"+
		"\5\32\16\r\u00ba\u00bb\f\n\2\2\u00bb\u00bc\7\24\2\2\u00bc\u00c1\5\32\16"+
		"\13\u00bd\u00be\f\t\2\2\u00be\u00bf\7\36\2\2\u00bf\u00c1\7!\2\2\u00c0"+
		"\u00b4\3\2\2\2\u00c0\u00b7\3\2\2\2\u00c0\u00ba\3\2\2\2\u00c0\u00bd\3\2"+
		"\2\2\u00c1\u00c4\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3"+
		"\33\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c5\u00ce\7\37\2\2\u00c6\u00ce\7 \2"+
		"\2\u00c7\u00ce\7\32\2\2\u00c8\u00c9\7\27\2\2\u00c9\u00ca\7\23\2\2\u00ca"+
		"\u00cb\7!\2\2\u00cb\u00ce\7\25\2\2\u00cc\u00ce\7!\2\2\u00cd\u00c5\3\2"+
		"\2\2\u00cd\u00c6\3\2\2\2\u00cd\u00c7\3\2\2\2\u00cd\u00c8\3\2\2\2\u00cd"+
		"\u00cc\3\2\2\2\u00ce\35\3\2\2\2\24\"\'\639MUYgjsx|\u0084\u0096\u00b2\u00c0"+
		"\u00c2\u00cd";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
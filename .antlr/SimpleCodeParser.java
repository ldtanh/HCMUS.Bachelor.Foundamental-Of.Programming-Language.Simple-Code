// Generated from d:\NLNNLT_1819_2\nlnnlt-1819\SimpleCode.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SimpleCodeParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, DATA_TYPE=14, BINARY_OP=15, ARITH_OP=16, 
		REL_OP=17, EQ_OP=18, COND_OP=19, SPACE=20, TAB=21, CLASS=22, PROGRAM=23, 
		VOID=24, TRUE=25, FALSE=26, IF=27, ELSE=28, FOR=29, BREAK=30, CONTINUE=31, 
		RETURN=32, CALLOUT=33, INT=34, BOOLEAN=35, BOOLEANLITERAL=36, IDENTIFIER=37, 
		INTLITERAL=38, DECIMALLITERAL=39, HEXLITERAL=40, CHAR=41, CHARLITERAL=42, 
		STRINGLITERAL=43, DIGIT=44, ALPHA=45, HEX_DIGIT=46, White=47, Newline=48, 
		LineComment=49, BlockComment=50;
	public static final int
		RULE_program = 0, RULE_field_decl = 1, RULE_method_decl = 2, RULE_method_decl_type = 3, 
		RULE_variable = 4, RULE_array_decl = 5, RULE_method_params = 6, RULE_block = 7, 
		RULE_var_decl = 8, RULE_statement = 9, RULE_assign_op = 10, RULE_method_call = 11, 
		RULE_method_call_params = 12, RULE_method_name = 13, RULE_location = 14, 
		RULE_expr = 15, RULE_callout_arg = 16, RULE_literal = 17;
	public static final String[] ruleNames = {
		"program", "field_decl", "method_decl", "method_decl_type", "variable", 
		"array_decl", "method_params", "block", "var_decl", "statement", "assign_op", 
		"method_call", "method_call_params", "method_name", "location", "expr", 
		"callout_arg", "literal"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'{'", "'}'", "','", "';'", "'('", "')'", "'['", "']'", "'='", "'+='", 
		"'-='", "'-'", "'!'", null, null, null, null, null, null, "' '", "'\t'", 
		"'class'", "'Program'", "'void'", "'true'", "'false'", "'if'", "'else'", 
		"'for'", "'break'", "'continue'", "'return'", "'callout'", "'int'", "'boolean'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, "DATA_TYPE", "BINARY_OP", "ARITH_OP", "REL_OP", "EQ_OP", "COND_OP", 
		"SPACE", "TAB", "CLASS", "PROGRAM", "VOID", "TRUE", "FALSE", "IF", "ELSE", 
		"FOR", "BREAK", "CONTINUE", "RETURN", "CALLOUT", "INT", "BOOLEAN", "BOOLEANLITERAL", 
		"IDENTIFIER", "INTLITERAL", "DECIMALLITERAL", "HEXLITERAL", "CHAR", "CHARLITERAL", 
		"STRINGLITERAL", "DIGIT", "ALPHA", "HEX_DIGIT", "White", "Newline", "LineComment", 
		"BlockComment"
	};
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
	public String getGrammarFileName() { return "SimpleCode.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SimpleCodeParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(SimpleCodeParser.CLASS, 0); }
		public TerminalNode PROGRAM() { return getToken(SimpleCodeParser.PROGRAM, 0); }
		public List<TerminalNode> SPACE() { return getTokens(SimpleCodeParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(SimpleCodeParser.SPACE, i);
		}
		public List<Field_declContext> field_decl() {
			return getRuleContexts(Field_declContext.class);
		}
		public Field_declContext field_decl(int i) {
			return getRuleContext(Field_declContext.class,i);
		}
		public List<Method_declContext> method_decl() {
			return getRuleContexts(Method_declContext.class);
		}
		public Method_declContext method_decl(int i) {
			return getRuleContext(Method_declContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			match(CLASS);
			setState(38); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(37);
				match(SPACE);
				}
				}
				setState(40); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SPACE );
			setState(42);
			match(PROGRAM);
			setState(44); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(43);
				match(SPACE);
				}
				}
				setState(46); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SPACE );
			setState(48);
			match(T__0);
			setState(52);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(49);
					match(SPACE);
					}
					} 
				}
				setState(54);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(58);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(55);
					field_decl();
					}
					} 
				}
				setState(60);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			setState(64);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DATA_TYPE || _la==VOID) {
				{
				{
				setState(61);
				method_decl();
				}
				}
				setState(66);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(70);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE) {
				{
				{
				setState(67);
				match(SPACE);
				}
				}
				setState(72);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(73);
			match(T__1);
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

	public static class Field_declContext extends ParserRuleContext {
		public TerminalNode DATA_TYPE() { return getToken(SimpleCodeParser.DATA_TYPE, 0); }
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public List<TerminalNode> SPACE() { return getTokens(SimpleCodeParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(SimpleCodeParser.SPACE, i);
		}
		public Field_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_decl; }
	}

	public final Field_declContext field_decl() throws RecognitionException {
		Field_declContext _localctx = new Field_declContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_field_decl);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			match(DATA_TYPE);
			setState(77); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(76);
				match(SPACE);
				}
				}
				setState(79); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SPACE );
			setState(81);
			variable();
			setState(86);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(82);
					match(T__2);
					setState(83);
					variable();
					}
					} 
				}
				setState(88);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			setState(89);
			match(T__3);
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

	public static class Method_declContext extends ParserRuleContext {
		public Method_decl_typeContext method_decl_type() {
			return getRuleContext(Method_decl_typeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(SimpleCodeParser.IDENTIFIER, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<TerminalNode> SPACE() { return getTokens(SimpleCodeParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(SimpleCodeParser.SPACE, i);
		}
		public Method_paramsContext method_params() {
			return getRuleContext(Method_paramsContext.class,0);
		}
		public Method_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_decl; }
	}

	public final Method_declContext method_decl() throws RecognitionException {
		Method_declContext _localctx = new Method_declContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_method_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			method_decl_type();
			setState(93); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(92);
				match(SPACE);
				}
				}
				setState(95); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SPACE );
			setState(97);
			match(IDENTIFIER);
			setState(98);
			match(T__4);
			setState(100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DATA_TYPE) {
				{
				setState(99);
				method_params();
				}
			}

			setState(102);
			match(T__5);
			setState(106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE) {
				{
				{
				setState(103);
				match(SPACE);
				}
				}
				setState(108);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(109);
			block();
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

	public static class Method_decl_typeContext extends ParserRuleContext {
		public TerminalNode VOID() { return getToken(SimpleCodeParser.VOID, 0); }
		public TerminalNode DATA_TYPE() { return getToken(SimpleCodeParser.DATA_TYPE, 0); }
		public Method_decl_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_decl_type; }
	}

	public final Method_decl_typeContext method_decl_type() throws RecognitionException {
		Method_decl_typeContext _localctx = new Method_decl_typeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_method_decl_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			_la = _input.LA(1);
			if ( !(_la==DATA_TYPE || _la==VOID) ) {
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

	public static class VariableContext extends ParserRuleContext {
		public Array_declContext array_decl() {
			return getRuleContext(Array_declContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(SimpleCodeParser.IDENTIFIER, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_variable);
		try {
			setState(115);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(113);
				array_decl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(114);
				match(IDENTIFIER);
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

	public static class Array_declContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SimpleCodeParser.IDENTIFIER, 0); }
		public TerminalNode INTLITERAL() { return getToken(SimpleCodeParser.INTLITERAL, 0); }
		public Array_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_decl; }
	}

	public final Array_declContext array_decl() throws RecognitionException {
		Array_declContext _localctx = new Array_declContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_array_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			match(IDENTIFIER);
			setState(118);
			match(T__6);
			setState(119);
			match(INTLITERAL);
			setState(120);
			match(T__7);
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

	public static class Method_paramsContext extends ParserRuleContext {
		public List<TerminalNode> DATA_TYPE() { return getTokens(SimpleCodeParser.DATA_TYPE); }
		public TerminalNode DATA_TYPE(int i) {
			return getToken(SimpleCodeParser.DATA_TYPE, i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(SimpleCodeParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(SimpleCodeParser.IDENTIFIER, i);
		}
		public List<TerminalNode> SPACE() { return getTokens(SimpleCodeParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(SimpleCodeParser.SPACE, i);
		}
		public Method_paramsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_params; }
	}

	public final Method_paramsContext method_params() throws RecognitionException {
		Method_paramsContext _localctx = new Method_paramsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_method_params);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			match(DATA_TYPE);
			setState(124); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(123);
				match(SPACE);
				}
				}
				setState(126); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SPACE );
			setState(128);
			match(IDENTIFIER);
			setState(135);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(129);
				match(T__2);
				setState(130);
				match(DATA_TYPE);
				setState(131);
				match(SPACE);
				setState(132);
				match(IDENTIFIER);
				}
				}
				setState(137);
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

	public static class BlockContext extends ParserRuleContext {
		public List<Var_declContext> var_decl() {
			return getRuleContexts(Var_declContext.class);
		}
		public Var_declContext var_decl(int i) {
			return getRuleContext(Var_declContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			match(T__0);
			setState(143);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << DATA_TYPE) | (1L << IF) | (1L << FOR) | (1L << BREAK) | (1L << CONTINUE) | (1L << RETURN) | (1L << CALLOUT) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(141);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case DATA_TYPE:
					{
					setState(139);
					var_decl();
					}
					break;
				case T__0:
				case IF:
				case FOR:
				case BREAK:
				case CONTINUE:
				case RETURN:
				case CALLOUT:
				case IDENTIFIER:
					{
					setState(140);
					statement();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(145);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(146);
			match(T__1);
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

	public static class Var_declContext extends ParserRuleContext {
		public TerminalNode DATA_TYPE() { return getToken(SimpleCodeParser.DATA_TYPE, 0); }
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public List<TerminalNode> SPACE() { return getTokens(SimpleCodeParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(SimpleCodeParser.SPACE, i);
		}
		public Var_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_decl; }
	}

	public final Var_declContext var_decl() throws RecognitionException {
		Var_declContext _localctx = new Var_declContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_var_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			match(DATA_TYPE);
			setState(150); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(149);
				match(SPACE);
				}
				}
				setState(152); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SPACE );
			setState(154);
			variable();
			setState(159);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(155);
				match(T__2);
				setState(156);
				variable();
				}
				}
				setState(161);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(162);
			match(T__3);
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
		public LocationContext location() {
			return getRuleContext(LocationContext.class,0);
		}
		public Assign_opContext assign_op() {
			return getRuleContext(Assign_opContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> SPACE() { return getTokens(SimpleCodeParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(SimpleCodeParser.SPACE, i);
		}
		public Method_callContext method_call() {
			return getRuleContext(Method_callContext.class,0);
		}
		public TerminalNode IF() { return getToken(SimpleCodeParser.IF, 0); }
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(SimpleCodeParser.ELSE, 0); }
		public TerminalNode FOR() { return getToken(SimpleCodeParser.FOR, 0); }
		public TerminalNode IDENTIFIER() { return getToken(SimpleCodeParser.IDENTIFIER, 0); }
		public TerminalNode RETURN() { return getToken(SimpleCodeParser.RETURN, 0); }
		public TerminalNode BREAK() { return getToken(SimpleCodeParser.BREAK, 0); }
		public TerminalNode CONTINUE() { return getToken(SimpleCodeParser.CONTINUE, 0); }
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_statement);
		int _la;
		try {
			setState(286);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(164);
				location();
				setState(168);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(165);
					match(SPACE);
					}
					}
					setState(170);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(171);
				assign_op();
				setState(175);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(172);
					match(SPACE);
					}
					}
					setState(177);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(178);
				expr(0);
				setState(179);
				match(T__3);
				setState(183);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(180);
					match(SPACE);
					}
					}
					setState(185);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(186);
				method_call();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(187);
				match(IF);
				setState(191);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(188);
					match(SPACE);
					}
					}
					setState(193);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(194);
				match(T__4);
				setState(195);
				expr(0);
				setState(196);
				match(T__5);
				setState(200);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(197);
					match(SPACE);
					}
					}
					setState(202);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(203);
				block();
				setState(212);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(204);
					match(ELSE);
					setState(208);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==SPACE) {
						{
						{
						setState(205);
						match(SPACE);
						}
						}
						setState(210);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(211);
					block();
					}
				}

				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(214);
				match(FOR);
				setState(218);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(215);
					match(SPACE);
					}
					}
					setState(220);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(221);
				match(IDENTIFIER);
				setState(225);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(222);
					match(SPACE);
					}
					}
					setState(227);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(228);
				match(T__8);
				setState(232);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(229);
					match(SPACE);
					}
					}
					setState(234);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(235);
				expr(0);
				setState(239);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(236);
					match(SPACE);
					}
					}
					setState(241);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(242);
				match(T__2);
				setState(246);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(243);
					match(SPACE);
					}
					}
					setState(248);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(249);
				expr(0);
				setState(253);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(250);
					match(SPACE);
					}
					}
					setState(255);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(256);
				block();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(258);
				match(RETURN);
				setState(262);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(259);
					match(SPACE);
					}
					}
					setState(264);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(266);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__11) | (1L << T__12) | (1L << CALLOUT) | (1L << BOOLEANLITERAL) | (1L << IDENTIFIER) | (1L << INTLITERAL) | (1L << CHARLITERAL))) != 0)) {
					{
					setState(265);
					expr(0);
					}
				}

				setState(268);
				match(T__3);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(269);
				match(BREAK);
				setState(273);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(270);
					match(SPACE);
					}
					}
					setState(275);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(276);
				match(T__3);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(277);
				match(CONTINUE);
				setState(281);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(278);
					match(SPACE);
					}
					}
					setState(283);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(284);
				match(T__3);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(285);
				block();
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

	public static class Assign_opContext extends ParserRuleContext {
		public Assign_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_op; }
	}

	public final Assign_opContext assign_op() throws RecognitionException {
		Assign_opContext _localctx = new Assign_opContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_assign_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__9) | (1L << T__10))) != 0)) ) {
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

	public static class Method_callContext extends ParserRuleContext {
		public Method_nameContext method_name() {
			return getRuleContext(Method_nameContext.class,0);
		}
		public Method_call_paramsContext method_call_params() {
			return getRuleContext(Method_call_paramsContext.class,0);
		}
		public TerminalNode CALLOUT() { return getToken(SimpleCodeParser.CALLOUT, 0); }
		public TerminalNode STRINGLITERAL() { return getToken(SimpleCodeParser.STRINGLITERAL, 0); }
		public List<TerminalNode> SPACE() { return getTokens(SimpleCodeParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(SimpleCodeParser.SPACE, i);
		}
		public List<Callout_argContext> callout_arg() {
			return getRuleContexts(Callout_argContext.class);
		}
		public Callout_argContext callout_arg(int i) {
			return getRuleContext(Callout_argContext.class,i);
		}
		public Method_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_call; }
	}

	public final Method_callContext method_call() throws RecognitionException {
		Method_callContext _localctx = new Method_callContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_method_call);
		int _la;
		try {
			int _alt;
			setState(322);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(290);
				method_name();
				setState(291);
				match(T__4);
				setState(293);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(292);
					method_call_params();
					}
				}

				setState(295);
				match(T__5);
				setState(296);
				match(T__3);
				}
				break;
			case CALLOUT:
				enterOuterAlt(_localctx, 2);
				{
				setState(298);
				match(CALLOUT);
				setState(300); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(299);
					match(SPACE);
					}
					}
					setState(302); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==SPACE );
				{
				setState(304);
				match(STRINGLITERAL);
				setState(320);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
				case 1:
					{
					setState(308);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==SPACE) {
						{
						{
						setState(305);
						match(SPACE);
						}
						}
						setState(310);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(311);
					match(T__2);
					setState(312);
					callout_arg();
					setState(317);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(313);
							match(T__2);
							setState(314);
							callout_arg();
							}
							} 
						}
						setState(319);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
					}
					}
					break;
				}
				}
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

	public static class Method_call_paramsContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(SimpleCodeParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(SimpleCodeParser.IDENTIFIER, i);
		}
		public List<TerminalNode> SPACE() { return getTokens(SimpleCodeParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(SimpleCodeParser.SPACE, i);
		}
		public Method_call_paramsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_call_params; }
	}

	public final Method_call_paramsContext method_call_params() throws RecognitionException {
		Method_call_paramsContext _localctx = new Method_call_paramsContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_method_call_params);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324);
			match(IDENTIFIER);
			setState(335);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(325);
				match(T__2);
				setState(329);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(326);
					match(SPACE);
					}
					}
					setState(331);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(332);
				match(IDENTIFIER);
				}
				}
				setState(337);
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

	public static class Method_nameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SimpleCodeParser.IDENTIFIER, 0); }
		public Method_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_name; }
	}

	public final Method_nameContext method_name() throws RecognitionException {
		Method_nameContext _localctx = new Method_nameContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_method_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(338);
			match(IDENTIFIER);
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

	public static class LocationContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SimpleCodeParser.IDENTIFIER, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public LocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_location; }
	}

	public final LocationContext location() throws RecognitionException {
		LocationContext _localctx = new LocationContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_location);
		try {
			setState(346);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(340);
				match(IDENTIFIER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(341);
				match(IDENTIFIER);
				setState(342);
				match(T__6);
				setState(343);
				expr(0);
				setState(344);
				match(T__7);
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

	public static class ExprContext extends ParserRuleContext {
		public LocationContext location() {
			return getRuleContext(LocationContext.class,0);
		}
		public Method_callContext method_call() {
			return getRuleContext(Method_callContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode BINARY_OP() { return getToken(SimpleCodeParser.BINARY_OP, 0); }
		public List<TerminalNode> SPACE() { return getTokens(SimpleCodeParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(SimpleCodeParser.SPACE, i);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(360);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				{
				setState(349);
				location();
				}
				break;
			case 2:
				{
				setState(350);
				method_call();
				}
				break;
			case 3:
				{
				setState(351);
				literal();
				}
				break;
			case 4:
				{
				setState(352);
				match(T__11);
				setState(353);
				expr(3);
				}
				break;
			case 5:
				{
				setState(354);
				match(T__12);
				setState(355);
				expr(2);
				}
				break;
			case 6:
				{
				setState(356);
				match(T__4);
				setState(357);
				expr(0);
				setState(358);
				match(T__5);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(379);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expr);
					setState(362);
					if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
					setState(366);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==SPACE) {
						{
						{
						setState(363);
						match(SPACE);
						}
						}
						setState(368);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(369);
					match(BINARY_OP);
					setState(373);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==SPACE) {
						{
						{
						setState(370);
						match(SPACE);
						}
						}
						setState(375);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(376);
					expr(5);
					}
					} 
				}
				setState(381);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
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

	public static class Callout_argContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode STRINGLITERAL() { return getToken(SimpleCodeParser.STRINGLITERAL, 0); }
		public Callout_argContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callout_arg; }
	}

	public final Callout_argContext callout_arg() throws RecognitionException {
		Callout_argContext _localctx = new Callout_argContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_callout_arg);
		try {
			setState(384);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
			case T__11:
			case T__12:
			case CALLOUT:
			case BOOLEANLITERAL:
			case IDENTIFIER:
			case INTLITERAL:
			case CHARLITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(382);
				expr(0);
				}
				break;
			case STRINGLITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(383);
				match(STRINGLITERAL);
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

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode INTLITERAL() { return getToken(SimpleCodeParser.INTLITERAL, 0); }
		public TerminalNode CHARLITERAL() { return getToken(SimpleCodeParser.CHARLITERAL, 0); }
		public TerminalNode BOOLEANLITERAL() { return getToken(SimpleCodeParser.BOOLEANLITERAL, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(386);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEANLITERAL) | (1L << INTLITERAL) | (1L << CHARLITERAL))) != 0)) ) {
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
		case 15:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\64\u0187\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\3\2\6\2)\n\2\r\2\16\2*\3\2\3\2\6\2/\n\2\r\2\16\2\60\3\2"+
		"\3\2\7\2\65\n\2\f\2\16\28\13\2\3\2\7\2;\n\2\f\2\16\2>\13\2\3\2\7\2A\n"+
		"\2\f\2\16\2D\13\2\3\2\7\2G\n\2\f\2\16\2J\13\2\3\2\3\2\3\3\3\3\6\3P\n\3"+
		"\r\3\16\3Q\3\3\3\3\3\3\7\3W\n\3\f\3\16\3Z\13\3\3\3\3\3\3\4\3\4\6\4`\n"+
		"\4\r\4\16\4a\3\4\3\4\3\4\5\4g\n\4\3\4\3\4\7\4k\n\4\f\4\16\4n\13\4\3\4"+
		"\3\4\3\5\3\5\3\6\3\6\5\6v\n\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\6\b\177\n\b"+
		"\r\b\16\b\u0080\3\b\3\b\3\b\3\b\3\b\7\b\u0088\n\b\f\b\16\b\u008b\13\b"+
		"\3\t\3\t\3\t\7\t\u0090\n\t\f\t\16\t\u0093\13\t\3\t\3\t\3\n\3\n\6\n\u0099"+
		"\n\n\r\n\16\n\u009a\3\n\3\n\3\n\7\n\u00a0\n\n\f\n\16\n\u00a3\13\n\3\n"+
		"\3\n\3\13\3\13\7\13\u00a9\n\13\f\13\16\13\u00ac\13\13\3\13\3\13\7\13\u00b0"+
		"\n\13\f\13\16\13\u00b3\13\13\3\13\3\13\3\13\7\13\u00b8\n\13\f\13\16\13"+
		"\u00bb\13\13\3\13\3\13\3\13\7\13\u00c0\n\13\f\13\16\13\u00c3\13\13\3\13"+
		"\3\13\3\13\3\13\7\13\u00c9\n\13\f\13\16\13\u00cc\13\13\3\13\3\13\3\13"+
		"\7\13\u00d1\n\13\f\13\16\13\u00d4\13\13\3\13\5\13\u00d7\n\13\3\13\3\13"+
		"\7\13\u00db\n\13\f\13\16\13\u00de\13\13\3\13\3\13\7\13\u00e2\n\13\f\13"+
		"\16\13\u00e5\13\13\3\13\3\13\7\13\u00e9\n\13\f\13\16\13\u00ec\13\13\3"+
		"\13\3\13\7\13\u00f0\n\13\f\13\16\13\u00f3\13\13\3\13\3\13\7\13\u00f7\n"+
		"\13\f\13\16\13\u00fa\13\13\3\13\3\13\7\13\u00fe\n\13\f\13\16\13\u0101"+
		"\13\13\3\13\3\13\3\13\3\13\7\13\u0107\n\13\f\13\16\13\u010a\13\13\3\13"+
		"\5\13\u010d\n\13\3\13\3\13\3\13\7\13\u0112\n\13\f\13\16\13\u0115\13\13"+
		"\3\13\3\13\3\13\7\13\u011a\n\13\f\13\16\13\u011d\13\13\3\13\3\13\5\13"+
		"\u0121\n\13\3\f\3\f\3\r\3\r\3\r\5\r\u0128\n\r\3\r\3\r\3\r\3\r\3\r\6\r"+
		"\u012f\n\r\r\r\16\r\u0130\3\r\3\r\7\r\u0135\n\r\f\r\16\r\u0138\13\r\3"+
		"\r\3\r\3\r\3\r\7\r\u013e\n\r\f\r\16\r\u0141\13\r\5\r\u0143\n\r\5\r\u0145"+
		"\n\r\3\16\3\16\3\16\7\16\u014a\n\16\f\16\16\16\u014d\13\16\3\16\7\16\u0150"+
		"\n\16\f\16\16\16\u0153\13\16\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\5"+
		"\20\u015d\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\5\21\u016b\n\21\3\21\3\21\7\21\u016f\n\21\f\21\16\21\u0172\13\21"+
		"\3\21\3\21\7\21\u0176\n\21\f\21\16\21\u0179\13\21\3\21\7\21\u017c\n\21"+
		"\f\21\16\21\u017f\13\21\3\22\3\22\5\22\u0183\n\22\3\23\3\23\3\23\3X\3"+
		" \24\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$\2\5\4\2\20\20\32\32\3"+
		"\2\13\r\5\2&&((,,\2\u01b0\2&\3\2\2\2\4M\3\2\2\2\6]\3\2\2\2\bq\3\2\2\2"+
		"\nu\3\2\2\2\fw\3\2\2\2\16|\3\2\2\2\20\u008c\3\2\2\2\22\u0096\3\2\2\2\24"+
		"\u0120\3\2\2\2\26\u0122\3\2\2\2\30\u0144\3\2\2\2\32\u0146\3\2\2\2\34\u0154"+
		"\3\2\2\2\36\u015c\3\2\2\2 \u016a\3\2\2\2\"\u0182\3\2\2\2$\u0184\3\2\2"+
		"\2&(\7\30\2\2\')\7\26\2\2(\'\3\2\2\2)*\3\2\2\2*(\3\2\2\2*+\3\2\2\2+,\3"+
		"\2\2\2,.\7\31\2\2-/\7\26\2\2.-\3\2\2\2/\60\3\2\2\2\60.\3\2\2\2\60\61\3"+
		"\2\2\2\61\62\3\2\2\2\62\66\7\3\2\2\63\65\7\26\2\2\64\63\3\2\2\2\658\3"+
		"\2\2\2\66\64\3\2\2\2\66\67\3\2\2\2\67<\3\2\2\28\66\3\2\2\29;\5\4\3\2:"+
		"9\3\2\2\2;>\3\2\2\2<:\3\2\2\2<=\3\2\2\2=B\3\2\2\2><\3\2\2\2?A\5\6\4\2"+
		"@?\3\2\2\2AD\3\2\2\2B@\3\2\2\2BC\3\2\2\2CH\3\2\2\2DB\3\2\2\2EG\7\26\2"+
		"\2FE\3\2\2\2GJ\3\2\2\2HF\3\2\2\2HI\3\2\2\2IK\3\2\2\2JH\3\2\2\2KL\7\4\2"+
		"\2L\3\3\2\2\2MO\7\20\2\2NP\7\26\2\2ON\3\2\2\2PQ\3\2\2\2QO\3\2\2\2QR\3"+
		"\2\2\2RS\3\2\2\2SX\5\n\6\2TU\7\5\2\2UW\5\n\6\2VT\3\2\2\2WZ\3\2\2\2XY\3"+
		"\2\2\2XV\3\2\2\2Y[\3\2\2\2ZX\3\2\2\2[\\\7\6\2\2\\\5\3\2\2\2]_\5\b\5\2"+
		"^`\7\26\2\2_^\3\2\2\2`a\3\2\2\2a_\3\2\2\2ab\3\2\2\2bc\3\2\2\2cd\7\'\2"+
		"\2df\7\7\2\2eg\5\16\b\2fe\3\2\2\2fg\3\2\2\2gh\3\2\2\2hl\7\b\2\2ik\7\26"+
		"\2\2ji\3\2\2\2kn\3\2\2\2lj\3\2\2\2lm\3\2\2\2mo\3\2\2\2nl\3\2\2\2op\5\20"+
		"\t\2p\7\3\2\2\2qr\t\2\2\2r\t\3\2\2\2sv\5\f\7\2tv\7\'\2\2us\3\2\2\2ut\3"+
		"\2\2\2v\13\3\2\2\2wx\7\'\2\2xy\7\t\2\2yz\7(\2\2z{\7\n\2\2{\r\3\2\2\2|"+
		"~\7\20\2\2}\177\7\26\2\2~}\3\2\2\2\177\u0080\3\2\2\2\u0080~\3\2\2\2\u0080"+
		"\u0081\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0089\7\'\2\2\u0083\u0084\7\5"+
		"\2\2\u0084\u0085\7\20\2\2\u0085\u0086\7\26\2\2\u0086\u0088\7\'\2\2\u0087"+
		"\u0083\3\2\2\2\u0088\u008b\3\2\2\2\u0089\u0087\3\2\2\2\u0089\u008a\3\2"+
		"\2\2\u008a\17\3\2\2\2\u008b\u0089\3\2\2\2\u008c\u0091\7\3\2\2\u008d\u0090"+
		"\5\22\n\2\u008e\u0090\5\24\13\2\u008f\u008d\3\2\2\2\u008f\u008e\3\2\2"+
		"\2\u0090\u0093\3\2\2\2\u0091\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0094"+
		"\3\2\2\2\u0093\u0091\3\2\2\2\u0094\u0095\7\4\2\2\u0095\21\3\2\2\2\u0096"+
		"\u0098\7\20\2\2\u0097\u0099\7\26\2\2\u0098\u0097\3\2\2\2\u0099\u009a\3"+
		"\2\2\2\u009a\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u009c\3\2\2\2\u009c"+
		"\u00a1\5\n\6\2\u009d\u009e\7\5\2\2\u009e\u00a0\5\n\6\2\u009f\u009d\3\2"+
		"\2\2\u00a0\u00a3\3\2\2\2\u00a1\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2"+
		"\u00a4\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a4\u00a5\7\6\2\2\u00a5\23\3\2\2"+
		"\2\u00a6\u00aa\5\36\20\2\u00a7\u00a9\7\26\2\2\u00a8\u00a7\3\2\2\2\u00a9"+
		"\u00ac\3\2\2\2\u00aa\u00a8\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ad\3\2"+
		"\2\2\u00ac\u00aa\3\2\2\2\u00ad\u00b1\5\26\f\2\u00ae\u00b0\7\26\2\2\u00af"+
		"\u00ae\3\2\2\2\u00b0\u00b3\3\2\2\2\u00b1\u00af\3\2\2\2\u00b1\u00b2\3\2"+
		"\2\2\u00b2\u00b4\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b4\u00b5\5 \21\2\u00b5"+
		"\u00b9\7\6\2\2\u00b6\u00b8\7\26\2\2\u00b7\u00b6\3\2\2\2\u00b8\u00bb\3"+
		"\2\2\2\u00b9\u00b7\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u0121\3\2\2\2\u00bb"+
		"\u00b9\3\2\2\2\u00bc\u0121\5\30\r\2\u00bd\u00c1\7\35\2\2\u00be\u00c0\7"+
		"\26\2\2\u00bf\u00be\3\2\2\2\u00c0\u00c3\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c1"+
		"\u00c2\3\2\2\2\u00c2\u00c4\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c4\u00c5\7\7"+
		"\2\2\u00c5\u00c6\5 \21\2\u00c6\u00ca\7\b\2\2\u00c7\u00c9\7\26\2\2\u00c8"+
		"\u00c7\3\2\2\2\u00c9\u00cc\3\2\2\2\u00ca\u00c8\3\2\2\2\u00ca\u00cb\3\2"+
		"\2\2\u00cb\u00cd\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cd\u00d6\5\20\t\2\u00ce"+
		"\u00d2\7\36\2\2\u00cf\u00d1\7\26\2\2\u00d0\u00cf\3\2\2\2\u00d1\u00d4\3"+
		"\2\2\2\u00d2\u00d0\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d5\3\2\2\2\u00d4"+
		"\u00d2\3\2\2\2\u00d5\u00d7\5\20\t\2\u00d6\u00ce\3\2\2\2\u00d6\u00d7\3"+
		"\2\2\2\u00d7\u0121\3\2\2\2\u00d8\u00dc\7\37\2\2\u00d9\u00db\7\26\2\2\u00da"+
		"\u00d9\3\2\2\2\u00db\u00de\3\2\2\2\u00dc\u00da\3\2\2\2\u00dc\u00dd\3\2"+
		"\2\2\u00dd\u00df\3\2\2\2\u00de\u00dc\3\2\2\2\u00df\u00e3\7\'\2\2\u00e0"+
		"\u00e2\7\26\2\2\u00e1\u00e0\3\2\2\2\u00e2\u00e5\3\2\2\2\u00e3\u00e1\3"+
		"\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e6\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e6"+
		"\u00ea\7\13\2\2\u00e7\u00e9\7\26\2\2\u00e8\u00e7\3\2\2\2\u00e9\u00ec\3"+
		"\2\2\2\u00ea\u00e8\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00ed\3\2\2\2\u00ec"+
		"\u00ea\3\2\2\2\u00ed\u00f1\5 \21\2\u00ee\u00f0\7\26\2\2\u00ef\u00ee\3"+
		"\2\2\2\u00f0\u00f3\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2"+
		"\u00f4\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f4\u00f8\7\5\2\2\u00f5\u00f7\7\26"+
		"\2\2\u00f6\u00f5\3\2\2\2\u00f7\u00fa\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f8"+
		"\u00f9\3\2\2\2\u00f9\u00fb\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fb\u00ff\5 "+
		"\21\2\u00fc\u00fe\7\26\2\2\u00fd\u00fc\3\2\2\2\u00fe\u0101\3\2\2\2\u00ff"+
		"\u00fd\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u0102\3\2\2\2\u0101\u00ff\3\2"+
		"\2\2\u0102\u0103\5\20\t\2\u0103\u0121\3\2\2\2\u0104\u0108\7\"\2\2\u0105"+
		"\u0107\7\26\2\2\u0106\u0105\3\2\2\2\u0107\u010a\3\2\2\2\u0108\u0106\3"+
		"\2\2\2\u0108\u0109\3\2\2\2\u0109\u010c\3\2\2\2\u010a\u0108\3\2\2\2\u010b"+
		"\u010d\5 \21\2\u010c\u010b\3\2\2\2\u010c\u010d\3\2\2\2\u010d\u010e\3\2"+
		"\2\2\u010e\u0121\7\6\2\2\u010f\u0113\7 \2\2\u0110\u0112\7\26\2\2\u0111"+
		"\u0110\3\2\2\2\u0112\u0115\3\2\2\2\u0113\u0111\3\2\2\2\u0113\u0114\3\2"+
		"\2\2\u0114\u0116\3\2\2\2\u0115\u0113\3\2\2\2\u0116\u0121\7\6\2\2\u0117"+
		"\u011b\7!\2\2\u0118\u011a\7\26\2\2\u0119\u0118\3\2\2\2\u011a\u011d\3\2"+
		"\2\2\u011b\u0119\3\2\2\2\u011b\u011c\3\2\2\2\u011c\u011e\3\2\2\2\u011d"+
		"\u011b\3\2\2\2\u011e\u0121\7\6\2\2\u011f\u0121\5\20\t\2\u0120\u00a6\3"+
		"\2\2\2\u0120\u00bc\3\2\2\2\u0120\u00bd\3\2\2\2\u0120\u00d8\3\2\2\2\u0120"+
		"\u0104\3\2\2\2\u0120\u010f\3\2\2\2\u0120\u0117\3\2\2\2\u0120\u011f\3\2"+
		"\2\2\u0121\25\3\2\2\2\u0122\u0123\t\3\2\2\u0123\27\3\2\2\2\u0124\u0125"+
		"\5\34\17\2\u0125\u0127\7\7\2\2\u0126\u0128\5\32\16\2\u0127\u0126\3\2\2"+
		"\2\u0127\u0128\3\2\2\2\u0128\u0129\3\2\2\2\u0129\u012a\7\b\2\2\u012a\u012b"+
		"\7\6\2\2\u012b\u0145\3\2\2\2\u012c\u012e\7#\2\2\u012d\u012f\7\26\2\2\u012e"+
		"\u012d\3\2\2\2\u012f\u0130\3\2\2\2\u0130\u012e\3\2\2\2\u0130\u0131\3\2"+
		"\2\2\u0131\u0132\3\2\2\2\u0132\u0142\7-\2\2\u0133\u0135\7\26\2\2\u0134"+
		"\u0133\3\2\2\2\u0135\u0138\3\2\2\2\u0136\u0134\3\2\2\2\u0136\u0137\3\2"+
		"\2\2\u0137\u0139\3\2\2\2\u0138\u0136\3\2\2\2\u0139\u013a\7\5\2\2\u013a"+
		"\u013f\5\"\22\2\u013b\u013c\7\5\2\2\u013c\u013e\5\"\22\2\u013d\u013b\3"+
		"\2\2\2\u013e\u0141\3\2\2\2\u013f\u013d\3\2\2\2\u013f\u0140\3\2\2\2\u0140"+
		"\u0143\3\2\2\2\u0141\u013f\3\2\2\2\u0142\u0136\3\2\2\2\u0142\u0143\3\2"+
		"\2\2\u0143\u0145\3\2\2\2\u0144\u0124\3\2\2\2\u0144\u012c\3\2\2\2\u0145"+
		"\31\3\2\2\2\u0146\u0151\7\'\2\2\u0147\u014b\7\5\2\2\u0148\u014a\7\26\2"+
		"\2\u0149\u0148\3\2\2\2\u014a\u014d\3\2\2\2\u014b\u0149\3\2\2\2\u014b\u014c"+
		"\3\2\2\2\u014c\u014e\3\2\2\2\u014d\u014b\3\2\2\2\u014e\u0150\7\'\2\2\u014f"+
		"\u0147\3\2\2\2\u0150\u0153\3\2\2\2\u0151\u014f\3\2\2\2\u0151\u0152\3\2"+
		"\2\2\u0152\33\3\2\2\2\u0153\u0151\3\2\2\2\u0154\u0155\7\'\2\2\u0155\35"+
		"\3\2\2\2\u0156\u015d\7\'\2\2\u0157\u0158\7\'\2\2\u0158\u0159\7\t\2\2\u0159"+
		"\u015a\5 \21\2\u015a\u015b\7\n\2\2\u015b\u015d\3\2\2\2\u015c\u0156\3\2"+
		"\2\2\u015c\u0157\3\2\2\2\u015d\37\3\2\2\2\u015e\u015f\b\21\1\2\u015f\u016b"+
		"\5\36\20\2\u0160\u016b\5\30\r\2\u0161\u016b\5$\23\2\u0162\u0163\7\16\2"+
		"\2\u0163\u016b\5 \21\5\u0164\u0165\7\17\2\2\u0165\u016b\5 \21\4\u0166"+
		"\u0167\7\7\2\2\u0167\u0168\5 \21\2\u0168\u0169\7\b\2\2\u0169\u016b\3\2"+
		"\2\2\u016a\u015e\3\2\2\2\u016a\u0160\3\2\2\2\u016a\u0161\3\2\2\2\u016a"+
		"\u0162\3\2\2\2\u016a\u0164\3\2\2\2\u016a\u0166\3\2\2\2\u016b\u017d\3\2"+
		"\2\2\u016c\u0170\f\6\2\2\u016d\u016f\7\26\2\2\u016e\u016d\3\2\2\2\u016f"+
		"\u0172\3\2\2\2\u0170\u016e\3\2\2\2\u0170\u0171\3\2\2\2\u0171\u0173\3\2"+
		"\2\2\u0172\u0170\3\2\2\2\u0173\u0177\7\21\2\2\u0174\u0176\7\26\2\2\u0175"+
		"\u0174\3\2\2\2\u0176\u0179\3\2\2\2\u0177\u0175\3\2\2\2\u0177\u0178\3\2"+
		"\2\2\u0178\u017a\3\2\2\2\u0179\u0177\3\2\2\2\u017a\u017c\5 \21\7\u017b"+
		"\u016c\3\2\2\2\u017c\u017f\3\2\2\2\u017d\u017b\3\2\2\2\u017d\u017e\3\2"+
		"\2\2\u017e!\3\2\2\2\u017f\u017d\3\2\2\2\u0180\u0183\5 \21\2\u0181\u0183"+
		"\7-\2\2\u0182\u0180\3\2\2\2\u0182\u0181\3\2\2\2\u0183#\3\2\2\2\u0184\u0185"+
		"\t\4\2\2\u0185%\3\2\2\2\64*\60\66<BHQXaflu\u0080\u0089\u008f\u0091\u009a"+
		"\u00a1\u00aa\u00b1\u00b9\u00c1\u00ca\u00d2\u00d6\u00dc\u00e3\u00ea\u00f1"+
		"\u00f8\u00ff\u0108\u010c\u0113\u011b\u0120\u0127\u0130\u0136\u013f\u0142"+
		"\u0144\u014b\u0151\u015c\u016a\u0170\u0177\u017d\u0182";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
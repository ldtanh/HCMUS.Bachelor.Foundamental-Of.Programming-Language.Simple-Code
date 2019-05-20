// Generated from d:\Personal\NLNNLT_1819_2\nlnnlt-1819\SimpleCode.g4 by ANTLR 4.7.1
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
		VOID=24, IF=25, ELSE=26, FOR=27, BREAK=28, CONTINUE=29, RETURN=30, CALLOUT=31, 
		INT=32, BOOLEAN=33, BOOLEANLITERAL=34, IDENTIFIER=35, INTLITERAL=36, DECIMALLITERAL=37, 
		HEXLITERAL=38, CHAR=39, CHARLITERAL=40, STRINGLITERAL=41, DIGIT=42, ALPHA=43, 
		HEX_DIGIT=44, White=45, Newline=46, LineComment=47, BlockComment=48, ERROR=49;
	public static final int
		RULE_program = 0, RULE_field_decl = 1, RULE_variable = 2, RULE_array_decl = 3, 
		RULE_method_decl = 4, RULE_method_decl_type = 5, RULE_method_params = 6, 
		RULE_block = 7, RULE_statement = 8, RULE_assign_statement = 9, RULE_assign_op = 10, 
		RULE_method_call = 11, RULE_method_call_params = 12, RULE_method_name = 13, 
		RULE_location = 14, RULE_expr = 15, RULE_callout_arg = 16, RULE_literal = 17;
	public static final String[] ruleNames = {
		"program", "field_decl", "variable", "array_decl", "method_decl", "method_decl_type", 
		"method_params", "block", "statement", "assign_statement", "assign_op", 
		"method_call", "method_call_params", "method_name", "location", "expr", 
		"callout_arg", "literal"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'{'", "'}'", "','", "';'", "'['", "']'", "'('", "')'", "'='", "'+='", 
		"'-='", "'-'", "'!'", null, null, null, null, null, null, "' '", "'\t'", 
		"'class'", "'Program'", "'void'", "'if'", "'else'", "'for'", "'break'", 
		"'continue'", "'return'", "'callout'", "'int'", "'boolean'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, "DATA_TYPE", "BINARY_OP", "ARITH_OP", "REL_OP", "EQ_OP", "COND_OP", 
		"SPACE", "TAB", "CLASS", "PROGRAM", "VOID", "IF", "ELSE", "FOR", "BREAK", 
		"CONTINUE", "RETURN", "CALLOUT", "INT", "BOOLEAN", "BOOLEANLITERAL", "IDENTIFIER", 
		"INTLITERAL", "DECIMALLITERAL", "HEXLITERAL", "CHAR", "CHARLITERAL", "STRINGLITERAL", 
		"DIGIT", "ALPHA", "HEX_DIGIT", "White", "Newline", "LineComment", "BlockComment", 
		"ERROR"
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
			setState(93);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(90);
					match(SPACE);
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
		enterRule(_localctx, 4, RULE_variable);
		try {
			setState(98);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(96);
				array_decl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(97);
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
		enterRule(_localctx, 6, RULE_array_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			match(IDENTIFIER);
			setState(101);
			match(T__4);
			setState(102);
			match(INTLITERAL);
			setState(103);
			match(T__5);
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
		enterRule(_localctx, 8, RULE_method_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			method_decl_type();
			setState(107); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(106);
				match(SPACE);
				}
				}
				setState(109); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SPACE );
			setState(111);
			match(IDENTIFIER);
			setState(112);
			match(T__6);
			setState(114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DATA_TYPE) {
				{
				setState(113);
				method_params();
				}
			}

			setState(116);
			match(T__7);
			setState(120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE) {
				{
				{
				setState(117);
				match(SPACE);
				}
				}
				setState(122);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(123);
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
		enterRule(_localctx, 10, RULE_method_decl_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
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
			setState(127);
			match(DATA_TYPE);
			setState(129); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(128);
				match(SPACE);
				}
				}
				setState(131); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SPACE );
			setState(133);
			match(IDENTIFIER);
			setState(140);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(134);
				match(T__2);
				setState(135);
				match(DATA_TYPE);
				setState(136);
				match(SPACE);
				setState(137);
				match(IDENTIFIER);
				}
				}
				setState(142);
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
		public List<Field_declContext> field_decl() {
			return getRuleContexts(Field_declContext.class);
		}
		public Field_declContext field_decl(int i) {
			return getRuleContext(Field_declContext.class,i);
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
			setState(143);
			match(T__0);
			setState(148);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << DATA_TYPE) | (1L << IF) | (1L << FOR) | (1L << BREAK) | (1L << CONTINUE) | (1L << RETURN) | (1L << CALLOUT) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(146);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case DATA_TYPE:
					{
					setState(144);
					field_decl();
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
					setState(145);
					statement();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(150);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(151);
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

	public static class StatementContext extends ParserRuleContext {
		public Assign_statementContext assign_statement() {
			return getRuleContext(Assign_statementContext.class,0);
		}
		public Method_callContext method_call() {
			return getRuleContext(Method_callContext.class,0);
		}
		public TerminalNode IF() { return getToken(SimpleCodeParser.IF, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public List<TerminalNode> SPACE() { return getTokens(SimpleCodeParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(SimpleCodeParser.SPACE, i);
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
		enterRule(_localctx, 16, RULE_statement);
		int _la;
		try {
			setState(254);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(153);
				assign_statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(154);
				method_call();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(155);
				match(IF);
				setState(159);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(156);
					match(SPACE);
					}
					}
					setState(161);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(162);
				match(T__6);
				setState(163);
				expr(0);
				setState(164);
				match(T__7);
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
				block();
				setState(180);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(172);
					match(ELSE);
					setState(176);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==SPACE) {
						{
						{
						setState(173);
						match(SPACE);
						}
						}
						setState(178);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(179);
					block();
					}
				}

				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(182);
				match(FOR);
				setState(186);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(183);
					match(SPACE);
					}
					}
					setState(188);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(189);
				match(IDENTIFIER);
				setState(193);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(190);
					match(SPACE);
					}
					}
					setState(195);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(196);
				match(T__8);
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
				expr(0);
				setState(207);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(204);
					match(SPACE);
					}
					}
					setState(209);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(210);
				match(T__2);
				setState(214);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(211);
					match(SPACE);
					}
					}
					setState(216);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(217);
				expr(0);
				setState(221);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(218);
					match(SPACE);
					}
					}
					setState(223);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(224);
				block();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(226);
				match(RETURN);
				setState(230);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(227);
					match(SPACE);
					}
					}
					setState(232);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(234);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__11) | (1L << T__12) | (1L << CALLOUT) | (1L << BOOLEANLITERAL) | (1L << IDENTIFIER) | (1L << INTLITERAL) | (1L << CHARLITERAL) | (1L << STRINGLITERAL))) != 0)) {
					{
					setState(233);
					expr(0);
					}
				}

				setState(236);
				match(T__3);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(237);
				match(BREAK);
				setState(241);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(238);
					match(SPACE);
					}
					}
					setState(243);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(244);
				match(T__3);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(245);
				match(CONTINUE);
				setState(249);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(246);
					match(SPACE);
					}
					}
					setState(251);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(252);
				match(T__3);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(253);
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

	public static class Assign_statementContext extends ParserRuleContext {
		public LocationContext location() {
			return getRuleContext(LocationContext.class,0);
		}
		public Assign_opContext assign_op() {
			return getRuleContext(Assign_opContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<TerminalNode> SPACE() { return getTokens(SimpleCodeParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(SimpleCodeParser.SPACE, i);
		}
		public Assign_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_statement; }
	}

	public final Assign_statementContext assign_statement() throws RecognitionException {
		Assign_statementContext _localctx = new Assign_statementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_assign_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			location();
			setState(260);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE) {
				{
				{
				setState(257);
				match(SPACE);
				}
				}
				setState(262);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(263);
			assign_op();
			setState(267);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE) {
				{
				{
				setState(264);
				match(SPACE);
				}
				}
				setState(269);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(270);
			expr(0);
			setState(271);
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
			setState(273);
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
			setState(334);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(275);
				method_name();
				setState(276);
				match(T__6);
				setState(278);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__11) | (1L << T__12) | (1L << CALLOUT) | (1L << BOOLEANLITERAL) | (1L << IDENTIFIER) | (1L << INTLITERAL) | (1L << CHARLITERAL) | (1L << STRINGLITERAL))) != 0)) {
					{
					setState(277);
					method_call_params();
					}
				}

				setState(280);
				match(T__7);
				}
				break;
			case CALLOUT:
				enterOuterAlt(_localctx, 2);
				{
				setState(282);
				match(CALLOUT);
				setState(286);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(283);
					match(SPACE);
					}
					}
					setState(288);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(289);
				match(T__6);
				setState(293);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(290);
					match(SPACE);
					}
					}
					setState(295);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				{
				setState(296);
				match(STRINGLITERAL);
				setState(300);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(297);
					match(SPACE);
					}
					}
					setState(302);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(318);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__2) {
					{
					setState(303);
					match(T__2);
					setState(307);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==SPACE) {
						{
						{
						setState(304);
						match(SPACE);
						}
						}
						setState(309);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(310);
					callout_arg();
					setState(315);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__2) {
						{
						{
						setState(311);
						match(T__2);
						setState(312);
						callout_arg();
						}
						}
						setState(317);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(320);
				match(T__7);
				setState(324);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(321);
					match(SPACE);
					}
					}
					setState(326);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(327);
				match(T__3);
				setState(331);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(328);
						match(SPACE);
						}
						} 
					}
					setState(333);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
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
			setState(336);
			expr(0);
			setState(347);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(337);
				match(T__2);
				setState(341);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(338);
					match(SPACE);
					}
					}
					setState(343);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(344);
				expr(0);
				}
				}
				setState(349);
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
			setState(350);
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
			setState(358);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(352);
				match(IDENTIFIER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(353);
				match(IDENTIFIER);
				setState(354);
				match(T__4);
				setState(355);
				expr(0);
				setState(356);
				match(T__5);
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
			setState(372);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				{
				setState(361);
				location();
				}
				break;
			case 2:
				{
				setState(362);
				method_call();
				}
				break;
			case 3:
				{
				setState(363);
				literal();
				}
				break;
			case 4:
				{
				setState(364);
				match(T__11);
				setState(365);
				expr(3);
				}
				break;
			case 5:
				{
				setState(366);
				match(T__12);
				setState(367);
				expr(2);
				}
				break;
			case 6:
				{
				setState(368);
				match(T__6);
				setState(369);
				expr(0);
				setState(370);
				match(T__7);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(391);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expr);
					setState(374);
					if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
					setState(378);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==SPACE) {
						{
						{
						setState(375);
						match(SPACE);
						}
						}
						setState(380);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(381);
					match(BINARY_OP);
					setState(385);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==SPACE) {
						{
						{
						setState(382);
						match(SPACE);
						}
						}
						setState(387);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(388);
					expr(5);
					}
					} 
				}
				setState(393);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
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
			setState(396);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(394);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(395);
				match(STRINGLITERAL);
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

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode INTLITERAL() { return getToken(SimpleCodeParser.INTLITERAL, 0); }
		public TerminalNode CHARLITERAL() { return getToken(SimpleCodeParser.CHARLITERAL, 0); }
		public TerminalNode BOOLEANLITERAL() { return getToken(SimpleCodeParser.BOOLEANLITERAL, 0); }
		public TerminalNode STRINGLITERAL() { return getToken(SimpleCodeParser.STRINGLITERAL, 0); }
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
			setState(398);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEANLITERAL) | (1L << INTLITERAL) | (1L << CHARLITERAL) | (1L << STRINGLITERAL))) != 0)) ) {
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\63\u0193\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\3\2\6\2)\n\2\r\2\16\2*\3\2\3\2\6\2/\n\2\r\2\16\2\60\3\2"+
		"\3\2\7\2\65\n\2\f\2\16\28\13\2\3\2\7\2;\n\2\f\2\16\2>\13\2\3\2\7\2A\n"+
		"\2\f\2\16\2D\13\2\3\2\7\2G\n\2\f\2\16\2J\13\2\3\2\3\2\3\3\3\3\6\3P\n\3"+
		"\r\3\16\3Q\3\3\3\3\3\3\7\3W\n\3\f\3\16\3Z\13\3\3\3\3\3\7\3^\n\3\f\3\16"+
		"\3a\13\3\3\4\3\4\5\4e\n\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\6\6n\n\6\r\6\16"+
		"\6o\3\6\3\6\3\6\5\6u\n\6\3\6\3\6\7\6y\n\6\f\6\16\6|\13\6\3\6\3\6\3\7\3"+
		"\7\3\b\3\b\6\b\u0084\n\b\r\b\16\b\u0085\3\b\3\b\3\b\3\b\3\b\7\b\u008d"+
		"\n\b\f\b\16\b\u0090\13\b\3\t\3\t\3\t\7\t\u0095\n\t\f\t\16\t\u0098\13\t"+
		"\3\t\3\t\3\n\3\n\3\n\3\n\7\n\u00a0\n\n\f\n\16\n\u00a3\13\n\3\n\3\n\3\n"+
		"\3\n\7\n\u00a9\n\n\f\n\16\n\u00ac\13\n\3\n\3\n\3\n\7\n\u00b1\n\n\f\n\16"+
		"\n\u00b4\13\n\3\n\5\n\u00b7\n\n\3\n\3\n\7\n\u00bb\n\n\f\n\16\n\u00be\13"+
		"\n\3\n\3\n\7\n\u00c2\n\n\f\n\16\n\u00c5\13\n\3\n\3\n\7\n\u00c9\n\n\f\n"+
		"\16\n\u00cc\13\n\3\n\3\n\7\n\u00d0\n\n\f\n\16\n\u00d3\13\n\3\n\3\n\7\n"+
		"\u00d7\n\n\f\n\16\n\u00da\13\n\3\n\3\n\7\n\u00de\n\n\f\n\16\n\u00e1\13"+
		"\n\3\n\3\n\3\n\3\n\7\n\u00e7\n\n\f\n\16\n\u00ea\13\n\3\n\5\n\u00ed\n\n"+
		"\3\n\3\n\3\n\7\n\u00f2\n\n\f\n\16\n\u00f5\13\n\3\n\3\n\3\n\7\n\u00fa\n"+
		"\n\f\n\16\n\u00fd\13\n\3\n\3\n\5\n\u0101\n\n\3\13\3\13\7\13\u0105\n\13"+
		"\f\13\16\13\u0108\13\13\3\13\3\13\7\13\u010c\n\13\f\13\16\13\u010f\13"+
		"\13\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\r\5\r\u0119\n\r\3\r\3\r\3\r\3\r\7"+
		"\r\u011f\n\r\f\r\16\r\u0122\13\r\3\r\3\r\7\r\u0126\n\r\f\r\16\r\u0129"+
		"\13\r\3\r\3\r\7\r\u012d\n\r\f\r\16\r\u0130\13\r\3\r\3\r\7\r\u0134\n\r"+
		"\f\r\16\r\u0137\13\r\3\r\3\r\3\r\7\r\u013c\n\r\f\r\16\r\u013f\13\r\5\r"+
		"\u0141\n\r\3\r\3\r\7\r\u0145\n\r\f\r\16\r\u0148\13\r\3\r\3\r\7\r\u014c"+
		"\n\r\f\r\16\r\u014f\13\r\5\r\u0151\n\r\3\16\3\16\3\16\7\16\u0156\n\16"+
		"\f\16\16\16\u0159\13\16\3\16\7\16\u015c\n\16\f\16\16\16\u015f\13\16\3"+
		"\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u0169\n\20\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u0177\n\21\3\21\3\21"+
		"\7\21\u017b\n\21\f\21\16\21\u017e\13\21\3\21\3\21\7\21\u0182\n\21\f\21"+
		"\16\21\u0185\13\21\3\21\7\21\u0188\n\21\f\21\16\21\u018b\13\21\3\22\3"+
		"\22\5\22\u018f\n\22\3\23\3\23\3\23\3X\3 \24\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"$\2\5\4\2\20\20\32\32\3\2\13\r\5\2$$&&*+\2\u01be\2&\3\2"+
		"\2\2\4M\3\2\2\2\6d\3\2\2\2\bf\3\2\2\2\nk\3\2\2\2\f\177\3\2\2\2\16\u0081"+
		"\3\2\2\2\20\u0091\3\2\2\2\22\u0100\3\2\2\2\24\u0102\3\2\2\2\26\u0113\3"+
		"\2\2\2\30\u0150\3\2\2\2\32\u0152\3\2\2\2\34\u0160\3\2\2\2\36\u0168\3\2"+
		"\2\2 \u0176\3\2\2\2\"\u018e\3\2\2\2$\u0190\3\2\2\2&(\7\30\2\2\')\7\26"+
		"\2\2(\'\3\2\2\2)*\3\2\2\2*(\3\2\2\2*+\3\2\2\2+,\3\2\2\2,.\7\31\2\2-/\7"+
		"\26\2\2.-\3\2\2\2/\60\3\2\2\2\60.\3\2\2\2\60\61\3\2\2\2\61\62\3\2\2\2"+
		"\62\66\7\3\2\2\63\65\7\26\2\2\64\63\3\2\2\2\658\3\2\2\2\66\64\3\2\2\2"+
		"\66\67\3\2\2\2\67<\3\2\2\28\66\3\2\2\29;\5\4\3\2:9\3\2\2\2;>\3\2\2\2<"+
		":\3\2\2\2<=\3\2\2\2=B\3\2\2\2><\3\2\2\2?A\5\n\6\2@?\3\2\2\2AD\3\2\2\2"+
		"B@\3\2\2\2BC\3\2\2\2CH\3\2\2\2DB\3\2\2\2EG\7\26\2\2FE\3\2\2\2GJ\3\2\2"+
		"\2HF\3\2\2\2HI\3\2\2\2IK\3\2\2\2JH\3\2\2\2KL\7\4\2\2L\3\3\2\2\2MO\7\20"+
		"\2\2NP\7\26\2\2ON\3\2\2\2PQ\3\2\2\2QO\3\2\2\2QR\3\2\2\2RS\3\2\2\2SX\5"+
		"\6\4\2TU\7\5\2\2UW\5\6\4\2VT\3\2\2\2WZ\3\2\2\2XY\3\2\2\2XV\3\2\2\2Y[\3"+
		"\2\2\2ZX\3\2\2\2[_\7\6\2\2\\^\7\26\2\2]\\\3\2\2\2^a\3\2\2\2_]\3\2\2\2"+
		"_`\3\2\2\2`\5\3\2\2\2a_\3\2\2\2be\5\b\5\2ce\7%\2\2db\3\2\2\2dc\3\2\2\2"+
		"e\7\3\2\2\2fg\7%\2\2gh\7\7\2\2hi\7&\2\2ij\7\b\2\2j\t\3\2\2\2km\5\f\7\2"+
		"ln\7\26\2\2ml\3\2\2\2no\3\2\2\2om\3\2\2\2op\3\2\2\2pq\3\2\2\2qr\7%\2\2"+
		"rt\7\t\2\2su\5\16\b\2ts\3\2\2\2tu\3\2\2\2uv\3\2\2\2vz\7\n\2\2wy\7\26\2"+
		"\2xw\3\2\2\2y|\3\2\2\2zx\3\2\2\2z{\3\2\2\2{}\3\2\2\2|z\3\2\2\2}~\5\20"+
		"\t\2~\13\3\2\2\2\177\u0080\t\2\2\2\u0080\r\3\2\2\2\u0081\u0083\7\20\2"+
		"\2\u0082\u0084\7\26\2\2\u0083\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085"+
		"\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u008e\7%"+
		"\2\2\u0088\u0089\7\5\2\2\u0089\u008a\7\20\2\2\u008a\u008b\7\26\2\2\u008b"+
		"\u008d\7%\2\2\u008c\u0088\3\2\2\2\u008d\u0090\3\2\2\2\u008e\u008c\3\2"+
		"\2\2\u008e\u008f\3\2\2\2\u008f\17\3\2\2\2\u0090\u008e\3\2\2\2\u0091\u0096"+
		"\7\3\2\2\u0092\u0095\5\4\3\2\u0093\u0095\5\22\n\2\u0094\u0092\3\2\2\2"+
		"\u0094\u0093\3\2\2\2\u0095\u0098\3\2\2\2\u0096\u0094\3\2\2\2\u0096\u0097"+
		"\3\2\2\2\u0097\u0099\3\2\2\2\u0098\u0096\3\2\2\2\u0099\u009a\7\4\2\2\u009a"+
		"\21\3\2\2\2\u009b\u0101\5\24\13\2\u009c\u0101\5\30\r\2\u009d\u00a1\7\33"+
		"\2\2\u009e\u00a0\7\26\2\2\u009f\u009e\3\2\2\2\u00a0\u00a3\3\2\2\2\u00a1"+
		"\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a4\3\2\2\2\u00a3\u00a1\3\2"+
		"\2\2\u00a4\u00a5\7\t\2\2\u00a5\u00a6\5 \21\2\u00a6\u00aa\7\n\2\2\u00a7"+
		"\u00a9\7\26\2\2\u00a8\u00a7\3\2\2\2\u00a9\u00ac\3\2\2\2\u00aa\u00a8\3"+
		"\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ad\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ad"+
		"\u00b6\5\20\t\2\u00ae\u00b2\7\34\2\2\u00af\u00b1\7\26\2\2\u00b0\u00af"+
		"\3\2\2\2\u00b1\u00b4\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3"+
		"\u00b5\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b5\u00b7\5\20\t\2\u00b6\u00ae\3"+
		"\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u0101\3\2\2\2\u00b8\u00bc\7\35\2\2\u00b9"+
		"\u00bb\7\26\2\2\u00ba\u00b9\3\2\2\2\u00bb\u00be\3\2\2\2\u00bc\u00ba\3"+
		"\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00bf\3\2\2\2\u00be\u00bc\3\2\2\2\u00bf"+
		"\u00c3\7%\2\2\u00c0\u00c2\7\26\2\2\u00c1\u00c0\3\2\2\2\u00c2\u00c5\3\2"+
		"\2\2\u00c3\u00c1\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c6\3\2\2\2\u00c5"+
		"\u00c3\3\2\2\2\u00c6\u00ca\7\13\2\2\u00c7\u00c9\7\26\2\2\u00c8\u00c7\3"+
		"\2\2\2\u00c9\u00cc\3\2\2\2\u00ca\u00c8\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb"+
		"\u00cd\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cd\u00d1\5 \21\2\u00ce\u00d0\7\26"+
		"\2\2\u00cf\u00ce\3\2\2\2\u00d0\u00d3\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d1"+
		"\u00d2\3\2\2\2\u00d2\u00d4\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d4\u00d8\7\5"+
		"\2\2\u00d5\u00d7\7\26\2\2\u00d6\u00d5\3\2\2\2\u00d7\u00da\3\2\2\2\u00d8"+
		"\u00d6\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00db\3\2\2\2\u00da\u00d8\3\2"+
		"\2\2\u00db\u00df\5 \21\2\u00dc\u00de\7\26\2\2\u00dd\u00dc\3\2\2\2\u00de"+
		"\u00e1\3\2\2\2\u00df\u00dd\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00e2\3\2"+
		"\2\2\u00e1\u00df\3\2\2\2\u00e2\u00e3\5\20\t\2\u00e3\u0101\3\2\2\2\u00e4"+
		"\u00e8\7 \2\2\u00e5\u00e7\7\26\2\2\u00e6\u00e5\3\2\2\2\u00e7\u00ea\3\2"+
		"\2\2\u00e8\u00e6\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00ec\3\2\2\2\u00ea"+
		"\u00e8\3\2\2\2\u00eb\u00ed\5 \21\2\u00ec\u00eb\3\2\2\2\u00ec\u00ed\3\2"+
		"\2\2\u00ed\u00ee\3\2\2\2\u00ee\u0101\7\6\2\2\u00ef\u00f3\7\36\2\2\u00f0"+
		"\u00f2\7\26\2\2\u00f1\u00f0\3\2\2\2\u00f2\u00f5\3\2\2\2\u00f3\u00f1\3"+
		"\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f6\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f6"+
		"\u0101\7\6\2\2\u00f7\u00fb\7\37\2\2\u00f8\u00fa\7\26\2\2\u00f9\u00f8\3"+
		"\2\2\2\u00fa\u00fd\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc"+
		"\u00fe\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fe\u0101\7\6\2\2\u00ff\u0101\5\20"+
		"\t\2\u0100\u009b\3\2\2\2\u0100\u009c\3\2\2\2\u0100\u009d\3\2\2\2\u0100"+
		"\u00b8\3\2\2\2\u0100\u00e4\3\2\2\2\u0100\u00ef\3\2\2\2\u0100\u00f7\3\2"+
		"\2\2\u0100\u00ff\3\2\2\2\u0101\23\3\2\2\2\u0102\u0106\5\36\20\2\u0103"+
		"\u0105\7\26\2\2\u0104\u0103\3\2\2\2\u0105\u0108\3\2\2\2\u0106\u0104\3"+
		"\2\2\2\u0106\u0107\3\2\2\2\u0107\u0109\3\2\2\2\u0108\u0106\3\2\2\2\u0109"+
		"\u010d\5\26\f\2\u010a\u010c\7\26\2\2\u010b\u010a\3\2\2\2\u010c\u010f\3"+
		"\2\2\2\u010d\u010b\3\2\2\2\u010d\u010e\3\2\2\2\u010e\u0110\3\2\2\2\u010f"+
		"\u010d\3\2\2\2\u0110\u0111\5 \21\2\u0111\u0112\7\6\2\2\u0112\25\3\2\2"+
		"\2\u0113\u0114\t\3\2\2\u0114\27\3\2\2\2\u0115\u0116\5\34\17\2\u0116\u0118"+
		"\7\t\2\2\u0117\u0119\5\32\16\2\u0118\u0117\3\2\2\2\u0118\u0119\3\2\2\2"+
		"\u0119\u011a\3\2\2\2\u011a\u011b\7\n\2\2\u011b\u0151\3\2\2\2\u011c\u0120"+
		"\7!\2\2\u011d\u011f\7\26\2\2\u011e\u011d\3\2\2\2\u011f\u0122\3\2\2\2\u0120"+
		"\u011e\3\2\2\2\u0120\u0121\3\2\2\2\u0121\u0123\3\2\2\2\u0122\u0120\3\2"+
		"\2\2\u0123\u0127\7\t\2\2\u0124\u0126\7\26\2\2\u0125\u0124\3\2\2\2\u0126"+
		"\u0129\3\2\2\2\u0127\u0125\3\2\2\2\u0127\u0128\3\2\2\2\u0128\u012a\3\2"+
		"\2\2\u0129\u0127\3\2\2\2\u012a\u012e\7+\2\2\u012b\u012d\7\26\2\2\u012c"+
		"\u012b\3\2\2\2\u012d\u0130\3\2\2\2\u012e\u012c\3\2\2\2\u012e\u012f\3\2"+
		"\2\2\u012f\u0140\3\2\2\2\u0130\u012e\3\2\2\2\u0131\u0135\7\5\2\2\u0132"+
		"\u0134\7\26\2\2\u0133\u0132\3\2\2\2\u0134\u0137\3\2\2\2\u0135\u0133\3"+
		"\2\2\2\u0135\u0136\3\2\2\2\u0136\u0138\3\2\2\2\u0137\u0135\3\2\2\2\u0138"+
		"\u013d\5\"\22\2\u0139\u013a\7\5\2\2\u013a\u013c\5\"\22\2\u013b\u0139\3"+
		"\2\2\2\u013c\u013f\3\2\2\2\u013d\u013b\3\2\2\2\u013d\u013e\3\2\2\2\u013e"+
		"\u0141\3\2\2\2\u013f\u013d\3\2\2\2\u0140\u0131\3\2\2\2\u0140\u0141\3\2"+
		"\2\2\u0141\u0142\3\2\2\2\u0142\u0146\7\n\2\2\u0143\u0145\7\26\2\2\u0144"+
		"\u0143\3\2\2\2\u0145\u0148\3\2\2\2\u0146\u0144\3\2\2\2\u0146\u0147\3\2"+
		"\2\2\u0147\u0149\3\2\2\2\u0148\u0146\3\2\2\2\u0149\u014d\7\6\2\2\u014a"+
		"\u014c\7\26\2\2\u014b\u014a\3\2\2\2\u014c\u014f\3\2\2\2\u014d\u014b\3"+
		"\2\2\2\u014d\u014e\3\2\2\2\u014e\u0151\3\2\2\2\u014f\u014d\3\2\2\2\u0150"+
		"\u0115\3\2\2\2\u0150\u011c\3\2\2\2\u0151\31\3\2\2\2\u0152\u015d\5 \21"+
		"\2\u0153\u0157\7\5\2\2\u0154\u0156\7\26\2\2\u0155\u0154\3\2\2\2\u0156"+
		"\u0159\3\2\2\2\u0157\u0155\3\2\2\2\u0157\u0158\3\2\2\2\u0158\u015a\3\2"+
		"\2\2\u0159\u0157\3\2\2\2\u015a\u015c\5 \21\2\u015b\u0153\3\2\2\2\u015c"+
		"\u015f\3\2\2\2\u015d\u015b\3\2\2\2\u015d\u015e\3\2\2\2\u015e\33\3\2\2"+
		"\2\u015f\u015d\3\2\2\2\u0160\u0161\7%\2\2\u0161\35\3\2\2\2\u0162\u0169"+
		"\7%\2\2\u0163\u0164\7%\2\2\u0164\u0165\7\7\2\2\u0165\u0166\5 \21\2\u0166"+
		"\u0167\7\b\2\2\u0167\u0169\3\2\2\2\u0168\u0162\3\2\2\2\u0168\u0163\3\2"+
		"\2\2\u0169\37\3\2\2\2\u016a\u016b\b\21\1\2\u016b\u0177\5\36\20\2\u016c"+
		"\u0177\5\30\r\2\u016d\u0177\5$\23\2\u016e\u016f\7\16\2\2\u016f\u0177\5"+
		" \21\5\u0170\u0171\7\17\2\2\u0171\u0177\5 \21\4\u0172\u0173\7\t\2\2\u0173"+
		"\u0174\5 \21\2\u0174\u0175\7\n\2\2\u0175\u0177\3\2\2\2\u0176\u016a\3\2"+
		"\2\2\u0176\u016c\3\2\2\2\u0176\u016d\3\2\2\2\u0176\u016e\3\2\2\2\u0176"+
		"\u0170\3\2\2\2\u0176\u0172\3\2\2\2\u0177\u0189\3\2\2\2\u0178\u017c\f\6"+
		"\2\2\u0179\u017b\7\26\2\2\u017a\u0179\3\2\2\2\u017b\u017e\3\2\2\2\u017c"+
		"\u017a\3\2\2\2\u017c\u017d\3\2\2\2\u017d\u017f\3\2\2\2\u017e\u017c\3\2"+
		"\2\2\u017f\u0183\7\21\2\2\u0180\u0182\7\26\2\2\u0181\u0180\3\2\2\2\u0182"+
		"\u0185\3\2\2\2\u0183\u0181\3\2\2\2\u0183\u0184\3\2\2\2\u0184\u0186\3\2"+
		"\2\2\u0185\u0183\3\2\2\2\u0186\u0188\5 \21\7\u0187\u0178\3\2\2\2\u0188"+
		"\u018b\3\2\2\2\u0189\u0187\3\2\2\2\u0189\u018a\3\2\2\2\u018a!\3\2\2\2"+
		"\u018b\u0189\3\2\2\2\u018c\u018f\5 \21\2\u018d\u018f\7+\2\2\u018e\u018c"+
		"\3\2\2\2\u018e\u018d\3\2\2\2\u018f#\3\2\2\2\u0190\u0191\t\4\2\2\u0191"+
		"%\3\2\2\2\66*\60\66<BHQX_dotz\u0085\u008e\u0094\u0096\u00a1\u00aa\u00b2"+
		"\u00b6\u00bc\u00c3\u00ca\u00d1\u00d8\u00df\u00e8\u00ec\u00f3\u00fb\u0100"+
		"\u0106\u010d\u0118\u0120\u0127\u012e\u0135\u013d\u0140\u0146\u014d\u0150"+
		"\u0157\u015d\u0168\u0176\u017c\u0183\u0189\u018e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
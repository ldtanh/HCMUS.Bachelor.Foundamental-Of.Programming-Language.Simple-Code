// Generated from d:\NLNNLT_1819_2\nlnnlt-1819\SimpleCode.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SimpleCodeLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, Identifier=38, 
		Alpha_Num=39, Decimal_Literal=40, Hex_Literal=41, Boolean_Literal=42, 
		CHAR=43, Char_Literal=44, ALPHA=45, DIGIT=46, HEX_DIGIT=47, INT=48, BOOL=49, 
		White=50, Newline=51, LineComment=52;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
		"T__25", "T__26", "T__27", "T__28", "T__29", "T__30", "T__31", "T__32", 
		"T__33", "T__34", "T__35", "T__36", "Identifier", "Alpha_Num", "Decimal_Literal", 
		"Hex_Literal", "Boolean_Literal", "CHAR", "Char_Literal", "ALPHA", "DIGIT", 
		"HEX_DIGIT", "INT", "BOOL", "White", "Newline", "LineComment"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'class'", "' '", "'Program'", "'{'", "'}'", "','", "';'", "'void'", 
		"'('", "')'", "'['", "']'", "'if'", "'else'", "'for'", "'='", "'return'", 
		"'break'", "'continue'", "'+='", "'-='", "'callout'", "'-'", "'!'", "'+'", 
		"'*'", "'/'", "'%'", "'<'", "'>'", "'<='", "'>='", "'=='", "'!='", "'&&'", 
		"'||'", "'\"'", null, null, null, null, null, null, null, null, null, 
		null, "'int'", "'boolean'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, "Identifier", "Alpha_Num", "Decimal_Literal", "Hex_Literal", 
		"Boolean_Literal", "CHAR", "Char_Literal", "ALPHA", "DIGIT", "HEX_DIGIT", 
		"INT", "BOOL", "White", "Newline", "LineComment"
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


	public SimpleCodeLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "SimpleCode.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\66\u013e\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n"+
		"\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20"+
		"\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25"+
		"\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30"+
		"\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37"+
		"\3\37\3 \3 \3 \3!\3!\3!\3\"\3\"\3\"\3#\3#\3#\3$\3$\3$\3%\3%\3%\3&\3&\3"+
		"\'\3\'\7\'\u00e9\n\'\f\'\16\'\u00ec\13\'\3(\3(\5(\u00f0\n(\3)\3)\7)\u00f4"+
		"\n)\f)\16)\u00f7\13)\3*\3*\3*\3*\6*\u00fd\n*\r*\16*\u00fe\3+\3+\3+\3+"+
		"\3+\3+\3+\3+\3+\5+\u010a\n+\3,\3,\3-\3-\3-\3-\3.\3.\3/\3/\3\60\3\60\3"+
		"\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\63\6\63\u0125"+
		"\n\63\r\63\16\63\u0126\3\63\3\63\3\64\3\64\5\64\u012d\n\64\3\64\5\64\u0130"+
		"\n\64\3\64\3\64\3\65\3\65\3\65\3\65\7\65\u0138\n\65\f\65\16\65\u013b\13"+
		"\65\3\65\3\65\2\2\66\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27"+
		"\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33"+
		"\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63"+
		"e\64g\65i\66\3\2\7\4\2C\\c|\3\2\62;\5\2\62;CHch\4\2\13\13\"\"\4\2\f\f"+
		"\17\17\2\u0146\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3"+
		"\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2"+
		"\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3"+
		"\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2"+
		"\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\2"+
		"9\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3"+
		"\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2"+
		"\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2"+
		"_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\3k\3"+
		"\2\2\2\5q\3\2\2\2\7s\3\2\2\2\t{\3\2\2\2\13}\3\2\2\2\r\177\3\2\2\2\17\u0081"+
		"\3\2\2\2\21\u0083\3\2\2\2\23\u0088\3\2\2\2\25\u008a\3\2\2\2\27\u008c\3"+
		"\2\2\2\31\u008e\3\2\2\2\33\u0090\3\2\2\2\35\u0093\3\2\2\2\37\u0098\3\2"+
		"\2\2!\u009c\3\2\2\2#\u009e\3\2\2\2%\u00a5\3\2\2\2\'\u00ab\3\2\2\2)\u00b4"+
		"\3\2\2\2+\u00b7\3\2\2\2-\u00ba\3\2\2\2/\u00c2\3\2\2\2\61\u00c4\3\2\2\2"+
		"\63\u00c6\3\2\2\2\65\u00c8\3\2\2\2\67\u00ca\3\2\2\29\u00cc\3\2\2\2;\u00ce"+
		"\3\2\2\2=\u00d0\3\2\2\2?\u00d2\3\2\2\2A\u00d5\3\2\2\2C\u00d8\3\2\2\2E"+
		"\u00db\3\2\2\2G\u00de\3\2\2\2I\u00e1\3\2\2\2K\u00e4\3\2\2\2M\u00e6\3\2"+
		"\2\2O\u00ef\3\2\2\2Q\u00f1\3\2\2\2S\u00f8\3\2\2\2U\u0109\3\2\2\2W\u010b"+
		"\3\2\2\2Y\u010d\3\2\2\2[\u0111\3\2\2\2]\u0113\3\2\2\2_\u0115\3\2\2\2a"+
		"\u0117\3\2\2\2c\u011b\3\2\2\2e\u0124\3\2\2\2g\u012f\3\2\2\2i\u0133\3\2"+
		"\2\2kl\7e\2\2lm\7n\2\2mn\7c\2\2no\7u\2\2op\7u\2\2p\4\3\2\2\2qr\7\"\2\2"+
		"r\6\3\2\2\2st\7R\2\2tu\7t\2\2uv\7q\2\2vw\7i\2\2wx\7t\2\2xy\7c\2\2yz\7"+
		"o\2\2z\b\3\2\2\2{|\7}\2\2|\n\3\2\2\2}~\7\177\2\2~\f\3\2\2\2\177\u0080"+
		"\7.\2\2\u0080\16\3\2\2\2\u0081\u0082\7=\2\2\u0082\20\3\2\2\2\u0083\u0084"+
		"\7x\2\2\u0084\u0085\7q\2\2\u0085\u0086\7k\2\2\u0086\u0087\7f\2\2\u0087"+
		"\22\3\2\2\2\u0088\u0089\7*\2\2\u0089\24\3\2\2\2\u008a\u008b\7+\2\2\u008b"+
		"\26\3\2\2\2\u008c\u008d\7]\2\2\u008d\30\3\2\2\2\u008e\u008f\7_\2\2\u008f"+
		"\32\3\2\2\2\u0090\u0091\7k\2\2\u0091\u0092\7h\2\2\u0092\34\3\2\2\2\u0093"+
		"\u0094\7g\2\2\u0094\u0095\7n\2\2\u0095\u0096\7u\2\2\u0096\u0097\7g\2\2"+
		"\u0097\36\3\2\2\2\u0098\u0099\7h\2\2\u0099\u009a\7q\2\2\u009a\u009b\7"+
		"t\2\2\u009b \3\2\2\2\u009c\u009d\7?\2\2\u009d\"\3\2\2\2\u009e\u009f\7"+
		"t\2\2\u009f\u00a0\7g\2\2\u00a0\u00a1\7v\2\2\u00a1\u00a2\7w\2\2\u00a2\u00a3"+
		"\7t\2\2\u00a3\u00a4\7p\2\2\u00a4$\3\2\2\2\u00a5\u00a6\7d\2\2\u00a6\u00a7"+
		"\7t\2\2\u00a7\u00a8\7g\2\2\u00a8\u00a9\7c\2\2\u00a9\u00aa\7m\2\2\u00aa"+
		"&\3\2\2\2\u00ab\u00ac\7e\2\2\u00ac\u00ad\7q\2\2\u00ad\u00ae\7p\2\2\u00ae"+
		"\u00af\7v\2\2\u00af\u00b0\7k\2\2\u00b0\u00b1\7p\2\2\u00b1\u00b2\7w\2\2"+
		"\u00b2\u00b3\7g\2\2\u00b3(\3\2\2\2\u00b4\u00b5\7-\2\2\u00b5\u00b6\7?\2"+
		"\2\u00b6*\3\2\2\2\u00b7\u00b8\7/\2\2\u00b8\u00b9\7?\2\2\u00b9,\3\2\2\2"+
		"\u00ba\u00bb\7e\2\2\u00bb\u00bc\7c\2\2\u00bc\u00bd\7n\2\2\u00bd\u00be"+
		"\7n\2\2\u00be\u00bf\7q\2\2\u00bf\u00c0\7w\2\2\u00c0\u00c1\7v\2\2\u00c1"+
		".\3\2\2\2\u00c2\u00c3\7/\2\2\u00c3\60\3\2\2\2\u00c4\u00c5\7#\2\2\u00c5"+
		"\62\3\2\2\2\u00c6\u00c7\7-\2\2\u00c7\64\3\2\2\2\u00c8\u00c9\7,\2\2\u00c9"+
		"\66\3\2\2\2\u00ca\u00cb\7\61\2\2\u00cb8\3\2\2\2\u00cc\u00cd\7\'\2\2\u00cd"+
		":\3\2\2\2\u00ce\u00cf\7>\2\2\u00cf<\3\2\2\2\u00d0\u00d1\7@\2\2\u00d1>"+
		"\3\2\2\2\u00d2\u00d3\7>\2\2\u00d3\u00d4\7?\2\2\u00d4@\3\2\2\2\u00d5\u00d6"+
		"\7@\2\2\u00d6\u00d7\7?\2\2\u00d7B\3\2\2\2\u00d8\u00d9\7?\2\2\u00d9\u00da"+
		"\7?\2\2\u00daD\3\2\2\2\u00db\u00dc\7#\2\2\u00dc\u00dd\7?\2\2\u00ddF\3"+
		"\2\2\2\u00de\u00df\7(\2\2\u00df\u00e0\7(\2\2\u00e0H\3\2\2\2\u00e1\u00e2"+
		"\7~\2\2\u00e2\u00e3\7~\2\2\u00e3J\3\2\2\2\u00e4\u00e5\7$\2\2\u00e5L\3"+
		"\2\2\2\u00e6\u00ea\5[.\2\u00e7\u00e9\5O(\2\u00e8\u00e7\3\2\2\2\u00e9\u00ec"+
		"\3\2\2\2\u00ea\u00e8\3\2\2\2\u00ea\u00eb\3\2\2\2\u00ebN\3\2\2\2\u00ec"+
		"\u00ea\3\2\2\2\u00ed\u00f0\5[.\2\u00ee\u00f0\5]/\2\u00ef\u00ed\3\2\2\2"+
		"\u00ef\u00ee\3\2\2\2\u00f0P\3\2\2\2\u00f1\u00f5\5]/\2\u00f2\u00f4\5]/"+
		"\2\u00f3\u00f2\3\2\2\2\u00f4\u00f7\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f5\u00f6"+
		"\3\2\2\2\u00f6R\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f8\u00f9\7\62\2\2\u00f9"+
		"\u00fa\7z\2\2\u00fa\u00fc\3\2\2\2\u00fb\u00fd\5_\60\2\u00fc\u00fb\3\2"+
		"\2\2\u00fd\u00fe\3\2\2\2\u00fe\u00fc\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff"+
		"T\3\2\2\2\u0100\u0101\7v\2\2\u0101\u0102\7t\2\2\u0102\u0103\7w\2\2\u0103"+
		"\u010a\7g\2\2\u0104\u0105\7h\2\2\u0105\u0106\7c\2\2\u0106\u0107\7n\2\2"+
		"\u0107\u0108\7u\2\2\u0108\u010a\7g\2\2\u0109\u0100\3\2\2\2\u0109\u0104"+
		"\3\2\2\2\u010aV\3\2\2\2\u010b\u010c\13\2\2\2\u010cX\3\2\2\2\u010d\u010e"+
		"\7)\2\2\u010e\u010f\5W,\2\u010f\u0110\7)\2\2\u0110Z\3\2\2\2\u0111\u0112"+
		"\t\2\2\2\u0112\\\3\2\2\2\u0113\u0114\t\3\2\2\u0114^\3\2\2\2\u0115\u0116"+
		"\t\4\2\2\u0116`\3\2\2\2\u0117\u0118\7k\2\2\u0118\u0119\7p\2\2\u0119\u011a"+
		"\7v\2\2\u011ab\3\2\2\2\u011b\u011c\7d\2\2\u011c\u011d\7q\2\2\u011d\u011e"+
		"\7q\2\2\u011e\u011f\7n\2\2\u011f\u0120\7g\2\2\u0120\u0121\7c\2\2\u0121"+
		"\u0122\7p\2\2\u0122d\3\2\2\2\u0123\u0125\t\5\2\2\u0124\u0123\3\2\2\2\u0125"+
		"\u0126\3\2\2\2\u0126\u0124\3\2\2\2\u0126\u0127\3\2\2\2\u0127\u0128\3\2"+
		"\2\2\u0128\u0129\b\63\2\2\u0129f\3\2\2\2\u012a\u012c\7\17\2\2\u012b\u012d"+
		"\7\f\2\2\u012c\u012b\3\2\2\2\u012c\u012d\3\2\2\2\u012d\u0130\3\2\2\2\u012e"+
		"\u0130\7\f\2\2\u012f\u012a\3\2\2\2\u012f\u012e\3\2\2\2\u0130\u0131\3\2"+
		"\2\2\u0131\u0132\b\64\2\2\u0132h\3\2\2\2\u0133\u0134\7\61\2\2\u0134\u0135"+
		"\7\61\2\2\u0135\u0139\3\2\2\2\u0136\u0138\n\6\2\2\u0137\u0136\3\2\2\2"+
		"\u0138\u013b\3\2\2\2\u0139\u0137\3\2\2\2\u0139\u013a\3\2\2\2\u013a\u013c"+
		"\3\2\2\2\u013b\u0139\3\2\2\2\u013c\u013d\b\65\2\2\u013dj\3\2\2\2\f\2\u00ea"+
		"\u00ef\u00f5\u00fe\u0109\u0126\u012c\u012f\u0139\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
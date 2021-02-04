// Generated from SyntaxSat.g4 by ANTLR 4.9
package syntaxSat.generated;

// antlr exo3

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SyntaxSatLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Commande=1, Instruction=2, AppelMethode=3, Declaration=4, Parametres=5, 
		Parametre=6, Assignement=7, PG=8, PD=9, Variable=10, Champ=11, Valeur=12, 
		WS=13, None=14;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"Commande", "Instruction", "AppelMethode", "Declaration", "Parametres", 
			"Parametre", "Assignement", "PG", "PD", "Variable", "Champ", "Valeur", 
			"WS", "None"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "' '"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "Commande", "Instruction", "AppelMethode", "Declaration", "Parametres", 
			"Parametre", "Assignement", "PG", "PD", "Variable", "Champ", "Valeur", 
			"WS", "None"
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


	public SyntaxSatLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "SyntaxSat.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\20}\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\2\3\3\3\3\5\3%\n\3\3"+
		"\4\3\4\3\4\6\4*\n\4\r\4\16\4+\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5"+
		"\6\58\n\5\r\5\16\59\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\7\6D\n\6\f\6\16\6"+
		"G\13\6\3\6\3\6\3\6\5\6L\n\6\3\7\3\7\3\7\3\7\3\7\5\7S\n\7\3\b\3\b\3\b\3"+
		"\b\3\t\3\t\5\t[\n\t\3\n\3\n\3\n\3\n\3\n\5\nb\n\n\3\13\6\13e\n\13\r\13"+
		"\16\13f\3\f\3\f\3\f\6\fl\n\f\r\f\16\fm\3\r\6\rq\n\r\r\r\16\rr\3\16\6\16"+
		"v\n\16\r\16\16\16w\3\16\3\16\3\17\3\17\2\2\20\3\3\5\4\7\5\t\6\13\7\r\b"+
		"\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\3\2\5\4\2C\\c|\3\2\62;\5"+
		"\2\13\f\17\17\"\"\2\u008f\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2"+
		"\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2"+
		"\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\3\37\3"+
		"\2\2\2\5$\3\2\2\2\7&\3\2\2\2\t\62\3\2\2\2\13K\3\2\2\2\rR\3\2\2\2\17T\3"+
		"\2\2\2\21Z\3\2\2\2\23a\3\2\2\2\25d\3\2\2\2\27h\3\2\2\2\31p\3\2\2\2\33"+
		"u\3\2\2\2\35{\3\2\2\2\37 \5\5\3\2 !\7=\2\2!\4\3\2\2\2\"%\5\7\4\2#%\5\17"+
		"\b\2$\"\3\2\2\2$#\3\2\2\2%\6\3\2\2\2&\'\5\25\13\2\')\7\60\2\2(*\t\2\2"+
		"\2)(\3\2\2\2*+\3\2\2\2+)\3\2\2\2+,\3\2\2\2,-\3\2\2\2-.\7*\2\2./\5\13\6"+
		"\2/\60\7+\2\2\60\61\7=\2\2\61\b\3\2\2\2\62\63\7p\2\2\63\64\7g\2\2\64\65"+
		"\7y\2\2\65\67\3\2\2\2\668\t\2\2\2\67\66\3\2\2\289\3\2\2\29\67\3\2\2\2"+
		"9:\3\2\2\2:;\3\2\2\2;<\7*\2\2<=\5\13\6\2=>\7+\2\2>?\7=\2\2?\n\3\2\2\2"+
		"@A\5\r\7\2AB\7.\2\2BD\3\2\2\2C@\3\2\2\2DG\3\2\2\2EC\3\2\2\2EF\3\2\2\2"+
		"FH\3\2\2\2GE\3\2\2\2HL\5\r\7\2IL\5\r\7\2JL\5\35\17\2KE\3\2\2\2KI\3\2\2"+
		"\2KJ\3\2\2\2L\f\3\2\2\2MS\5\25\13\2NS\5\27\f\2OS\5\31\r\2PS\5\t\5\2QS"+
		"\5\7\4\2RM\3\2\2\2RN\3\2\2\2RO\3\2\2\2RP\3\2\2\2RQ\3\2\2\2S\16\3\2\2\2"+
		"TU\5\21\t\2UV\7?\2\2VW\5\23\n\2W\20\3\2\2\2X[\5\25\13\2Y[\5\27\f\2ZX\3"+
		"\2\2\2ZY\3\2\2\2[\22\3\2\2\2\\b\5\25\13\2]b\5\27\f\2^b\5\t\5\2_b\5\7\4"+
		"\2`b\5\31\r\2a\\\3\2\2\2a]\3\2\2\2a^\3\2\2\2a_\3\2\2\2a`\3\2\2\2b\24\3"+
		"\2\2\2ce\t\2\2\2dc\3\2\2\2ef\3\2\2\2fd\3\2\2\2fg\3\2\2\2g\26\3\2\2\2h"+
		"i\5\25\13\2ik\7\60\2\2jl\t\2\2\2kj\3\2\2\2lm\3\2\2\2mk\3\2\2\2mn\3\2\2"+
		"\2n\30\3\2\2\2oq\t\3\2\2po\3\2\2\2qr\3\2\2\2rp\3\2\2\2rs\3\2\2\2s\32\3"+
		"\2\2\2tv\t\4\2\2ut\3\2\2\2vw\3\2\2\2wu\3\2\2\2wx\3\2\2\2xy\3\2\2\2yz\b"+
		"\16\2\2z\34\3\2\2\2{|\7\"\2\2|\36\3\2\2\2\17\2$+9EKRZafmrw\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
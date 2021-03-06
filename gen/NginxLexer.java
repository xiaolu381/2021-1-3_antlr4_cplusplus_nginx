// Generated from /home/lu/Downloads/nginx_demo_v2_20201226_by_lyuqiang/nginx_demo/grammar/NginxLexer.g4 by ANTLR 4.9
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class NginxLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		USER=1, WORKER_PROCESSES=2, ERROR_LOG=3, WORKER_RLIMIT_NOFILE=4, PID=5, 
		EVENTS=6, USE=7, WORKER_CONNECTIONS=8, HTTP=9, INCLUDE=10, DEFAULT_TYPE=11, 
		LOG_FORMAT=12, ACCESS_LOG=13, SERVER_NAMES_HASH_BUCKET_SIZE=14, SERVER_NAME_IN_REDIRECT=15, 
		CLIENT_HEADER_BUFFER_SIZE=16, LARGE_CLIENT_HEADER_BUFFERS=17, SENDFILE=18, 
		TCP_NOPUSH=19, KEEPALIVE_TIMEOUT=20, CLIENT_HEADER_TIMEOUT=21, CLIENT_BODY_TIMEOUT=22, 
		SEND_TIMEOUT=23, GZIP=24, GZIP_MIN_LENGTH=25, GZIP_BUFFERS=26, GZIP_HTTP_VERSION=27, 
		GZIP_COMP_LEVEL=28, GZIP_TYPES=29, GZIP_VARY=30, PROXY_REDIRECT=31, PROXY_SET_HEADER=32, 
		CLIENT_MAX_BODY_SIZE=33, CLIENT_BODY_BUFFER_SIZE=34, PROXY_CONNECT_TIMEOUT=35, 
		PROXY_SEND_TIMEOUT=36, PROXY_READ_TIMEOUT=37, PROXY_BUFFER_SIZE=38, PROXY_BUFFERS=39, 
		PROXY_BUSY_BUFFERS_SIZE=40, PROXY_TEMP_FILE_WRITE_SIZE=41, PROXY_NEXT_UPSTREAM=42, 
		PROXY_MAX_TEMP_FILE_SIZE=43, INDEX=44, SERVER=45, LISTEN=46, SERVER_NAME=47, 
		ROOT=48, AUTOINDEX=49, AUTOINDEX_LOCALTIME=50, CHARSET=51, LOCATION=52, 
		LEFT_OPENING_BRACE=53, RIGTH_OPENING_BRACE=54, LOWER_STRING_WITH_UNDER_LINE=55, 
		LOWER_STRING=56, SPACE=57, STRING_WITH_OTHER=58, NUMBER=59, STRING=60, 
		LOWER_ALPHABET=61, UPPER_ALPHABET=62, ALPHABET=63, UNDER_LINE=64, SLASH=65, 
		PLUS=66, MINUS=67, DOT=68, EQUALS_SIGN=69, S1_DELIMITER=70, SINGLE_QUOTATION_MARK=71, 
		DOUBLE_QUOTATION_MARK=72, NOTES=73, DOLLER=74, LEFT_BRACKET=75, RIGHT_BRACKET=76, 
		NOTES_STRING=77, WS=78;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"USER", "WORKER_PROCESSES", "ERROR_LOG", "WORKER_RLIMIT_NOFILE", "PID", 
			"EVENTS", "USE", "WORKER_CONNECTIONS", "HTTP", "INCLUDE", "DEFAULT_TYPE", 
			"LOG_FORMAT", "ACCESS_LOG", "SERVER_NAMES_HASH_BUCKET_SIZE", "SERVER_NAME_IN_REDIRECT", 
			"CLIENT_HEADER_BUFFER_SIZE", "LARGE_CLIENT_HEADER_BUFFERS", "SENDFILE", 
			"TCP_NOPUSH", "KEEPALIVE_TIMEOUT", "CLIENT_HEADER_TIMEOUT", "CLIENT_BODY_TIMEOUT", 
			"SEND_TIMEOUT", "GZIP", "GZIP_MIN_LENGTH", "GZIP_BUFFERS", "GZIP_HTTP_VERSION", 
			"GZIP_COMP_LEVEL", "GZIP_TYPES", "GZIP_VARY", "PROXY_REDIRECT", "PROXY_SET_HEADER", 
			"CLIENT_MAX_BODY_SIZE", "CLIENT_BODY_BUFFER_SIZE", "PROXY_CONNECT_TIMEOUT", 
			"PROXY_SEND_TIMEOUT", "PROXY_READ_TIMEOUT", "PROXY_BUFFER_SIZE", "PROXY_BUFFERS", 
			"PROXY_BUSY_BUFFERS_SIZE", "PROXY_TEMP_FILE_WRITE_SIZE", "PROXY_NEXT_UPSTREAM", 
			"PROXY_MAX_TEMP_FILE_SIZE", "INDEX", "SERVER", "LISTEN", "SERVER_NAME", 
			"ROOT", "AUTOINDEX", "AUTOINDEX_LOCALTIME", "CHARSET", "LOCATION", "LEFT_OPENING_BRACE", 
			"RIGTH_OPENING_BRACE", "LOWER_STRING_WITH_UNDER_LINE", "LOWER_STRING", 
			"SPACE", "STRING_WITH_OTHER", "NUMBER", "STRING", "LOWER_ALPHABET", "UPPER_ALPHABET", 
			"ALPHABET", "UNDER_LINE", "SLASH", "PLUS", "MINUS", "DOT", "EQUALS_SIGN", 
			"S1_DELIMITER", "SINGLE_QUOTATION_MARK", "DOUBLE_QUOTATION_MARK", "NOTES", 
			"DOLLER", "LEFT_BRACKET", "RIGHT_BRACKET", "NOTES_STRING", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'user'", "'worker_processes'", "'error_log'", "'worker_rlimit_nofile'", 
			"'pid'", "'events'", "'use'", "'worker_connections'", "'http'", "'include'", 
			"'default_type'", "'log_format'", "'access_log'", "'server_names_hash_bucket_size'", 
			"'server_name_in_redirect'", "'client_header_buffer_size'", "'large_client_header_buffers'", 
			"'sendfile'", "'tcp_nopush'", "'keepalive_timeout'", "'client_header_timeout'", 
			"'client_body_timeout'", "'send_timeout'", "'gzip'", "'gzip_min_length'", 
			"'gzip_buffers'", "'gzip_http_version'", "'gzip_comp_level'", "'gzip_types'", 
			"'gzip_vary'", "'proxy_redirect'", "'proxy_set_header'", "'client_max_body_size'", 
			"'client_body_buffer_size'", "'proxy_connect_timeout'", "'proxy_send_timeout'", 
			"'proxy_read_timeout'", "'proxy_buffer_size'", "'proxy_buffers'", "'proxy_busy_buffers_size'", 
			"'proxy_temp_file_write_size'", "'proxy_next_upstream'", "'proxy_max_temp_file_size'", 
			"'index'", "'server'", "'listen'", "'server_name'", "'root'", "'autoindex'", 
			"'autoindex_localtime'", "'charset'", "'location'", "'{'", "'}'", null, 
			null, "' '", null, null, null, null, null, null, "'_'", "'/'", "'+'", 
			"'-'", "'.'", "'='", "';'", null, null, "'#'", "'$'", "'['", "']'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "USER", "WORKER_PROCESSES", "ERROR_LOG", "WORKER_RLIMIT_NOFILE", 
			"PID", "EVENTS", "USE", "WORKER_CONNECTIONS", "HTTP", "INCLUDE", "DEFAULT_TYPE", 
			"LOG_FORMAT", "ACCESS_LOG", "SERVER_NAMES_HASH_BUCKET_SIZE", "SERVER_NAME_IN_REDIRECT", 
			"CLIENT_HEADER_BUFFER_SIZE", "LARGE_CLIENT_HEADER_BUFFERS", "SENDFILE", 
			"TCP_NOPUSH", "KEEPALIVE_TIMEOUT", "CLIENT_HEADER_TIMEOUT", "CLIENT_BODY_TIMEOUT", 
			"SEND_TIMEOUT", "GZIP", "GZIP_MIN_LENGTH", "GZIP_BUFFERS", "GZIP_HTTP_VERSION", 
			"GZIP_COMP_LEVEL", "GZIP_TYPES", "GZIP_VARY", "PROXY_REDIRECT", "PROXY_SET_HEADER", 
			"CLIENT_MAX_BODY_SIZE", "CLIENT_BODY_BUFFER_SIZE", "PROXY_CONNECT_TIMEOUT", 
			"PROXY_SEND_TIMEOUT", "PROXY_READ_TIMEOUT", "PROXY_BUFFER_SIZE", "PROXY_BUFFERS", 
			"PROXY_BUSY_BUFFERS_SIZE", "PROXY_TEMP_FILE_WRITE_SIZE", "PROXY_NEXT_UPSTREAM", 
			"PROXY_MAX_TEMP_FILE_SIZE", "INDEX", "SERVER", "LISTEN", "SERVER_NAME", 
			"ROOT", "AUTOINDEX", "AUTOINDEX_LOCALTIME", "CHARSET", "LOCATION", "LEFT_OPENING_BRACE", 
			"RIGTH_OPENING_BRACE", "LOWER_STRING_WITH_UNDER_LINE", "LOWER_STRING", 
			"SPACE", "STRING_WITH_OTHER", "NUMBER", "STRING", "LOWER_ALPHABET", "UPPER_ALPHABET", 
			"ALPHABET", "UNDER_LINE", "SLASH", "PLUS", "MINUS", "DOT", "EQUALS_SIGN", 
			"S1_DELIMITER", "SINGLE_QUOTATION_MARK", "DOUBLE_QUOTATION_MARK", "NOTES", 
			"DOLLER", "LEFT_BRACKET", "RIGHT_BRACKET", "NOTES_STRING", "WS"
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


	public NginxLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "NginxLexer.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2P\u0402\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31"+
		"\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3!\3"+
		"!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\""+
		"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#"+
		"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3$\3$"+
		"\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3%\3%\3%"+
		"\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3&"+
		"\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3"+
		"\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3"+
		"(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3"+
		")\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3"+
		"*\3*\3*\3*\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3"+
		"+\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3"+
		",\3,\3,\3,\3,\3,\3,\3,\3-\3-\3-\3-\3-\3-\3.\3.\3.\3.\3.\3.\3.\3/\3/\3"+
		"/\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3"+
		"\60\3\61\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3"+
		"\62\3\62\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3"+
		"\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\64\3\64\3"+
		"\64\3\64\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\66\3\66\3\67\3"+
		"\67\38\38\38\38\68\u03ae\n8\r8\168\u03af\39\69\u03b3\n9\r9\169\u03b4\3"+
		":\3:\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\6;\u03c6\n;\r;\16;\u03c7\3"+
		"<\3<\3=\6=\u03cd\n=\r=\16=\u03ce\3>\3>\3?\3?\3@\3@\3A\3A\3B\3B\3C\3C\3"+
		"D\3D\3E\3E\3F\3F\3G\3G\3H\3H\3I\3I\3J\3J\3K\3K\3L\3L\3M\3M\3N\3N\7N\u03f3"+
		"\nN\fN\16N\u03f6\13N\3N\3N\3N\3N\3O\6O\u03fd\nO\rO\16O\u03fe\3O\3O\3\u03f4"+
		"\2P\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36"+
		";\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67"+
		"m8o9q:s;u<w=y>{?}@\177A\u0081B\u0083C\u0085D\u0087E\u0089F\u008bG\u008d"+
		"H\u008fI\u0091J\u0093K\u0095L\u0097M\u0099N\u009bO\u009dP\3\2\t\3\2\62"+
		";\3\2c|\3\2C\\\4\2C\\c|\3\2))\3\2$$\4\2\13\f\17\17\2\u0413\2\3\3\2\2\2"+
		"\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2"+
		"\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2"+
		"\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2"+
		"\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2"+
		"\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2"+
		"\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2"+
		"\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W"+
		"\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2"+
		"\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2"+
		"\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}"+
		"\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2"+
		"\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u008f"+
		"\3\2\2\2\2\u0091\3\2\2\2\2\u0093\3\2\2\2\2\u0095\3\2\2\2\2\u0097\3\2\2"+
		"\2\2\u0099\3\2\2\2\2\u009b\3\2\2\2\2\u009d\3\2\2\2\3\u009f\3\2\2\2\5\u00a4"+
		"\3\2\2\2\7\u00b5\3\2\2\2\t\u00bf\3\2\2\2\13\u00d4\3\2\2\2\r\u00d8\3\2"+
		"\2\2\17\u00df\3\2\2\2\21\u00e3\3\2\2\2\23\u00f6\3\2\2\2\25\u00fb\3\2\2"+
		"\2\27\u0103\3\2\2\2\31\u0110\3\2\2\2\33\u011b\3\2\2\2\35\u0126\3\2\2\2"+
		"\37\u0144\3\2\2\2!\u015c\3\2\2\2#\u0176\3\2\2\2%\u0192\3\2\2\2\'\u019b"+
		"\3\2\2\2)\u01a6\3\2\2\2+\u01b8\3\2\2\2-\u01ce\3\2\2\2/\u01e2\3\2\2\2\61"+
		"\u01ef\3\2\2\2\63\u01f4\3\2\2\2\65\u0204\3\2\2\2\67\u0211\3\2\2\29\u0223"+
		"\3\2\2\2;\u0233\3\2\2\2=\u023e\3\2\2\2?\u0248\3\2\2\2A\u0257\3\2\2\2C"+
		"\u0268\3\2\2\2E\u027d\3\2\2\2G\u0295\3\2\2\2I\u02ab\3\2\2\2K\u02be\3\2"+
		"\2\2M\u02d1\3\2\2\2O\u02e3\3\2\2\2Q\u02f1\3\2\2\2S\u0309\3\2\2\2U\u0324"+
		"\3\2\2\2W\u0338\3\2\2\2Y\u0351\3\2\2\2[\u0357\3\2\2\2]\u035e\3\2\2\2_"+
		"\u0365\3\2\2\2a\u0371\3\2\2\2c\u0376\3\2\2\2e\u0380\3\2\2\2g\u0394\3\2"+
		"\2\2i\u039c\3\2\2\2k\u03a5\3\2\2\2m\u03a7\3\2\2\2o\u03a9\3\2\2\2q\u03b2"+
		"\3\2\2\2s\u03b6\3\2\2\2u\u03c5\3\2\2\2w\u03c9\3\2\2\2y\u03cc\3\2\2\2{"+
		"\u03d0\3\2\2\2}\u03d2\3\2\2\2\177\u03d4\3\2\2\2\u0081\u03d6\3\2\2\2\u0083"+
		"\u03d8\3\2\2\2\u0085\u03da\3\2\2\2\u0087\u03dc\3\2\2\2\u0089\u03de\3\2"+
		"\2\2\u008b\u03e0\3\2\2\2\u008d\u03e2\3\2\2\2\u008f\u03e4\3\2\2\2\u0091"+
		"\u03e6\3\2\2\2\u0093\u03e8\3\2\2\2\u0095\u03ea\3\2\2\2\u0097\u03ec\3\2"+
		"\2\2\u0099\u03ee\3\2\2\2\u009b\u03f0\3\2\2\2\u009d\u03fc\3\2\2\2\u009f"+
		"\u00a0\7w\2\2\u00a0\u00a1\7u\2\2\u00a1\u00a2\7g\2\2\u00a2\u00a3\7t\2\2"+
		"\u00a3\4\3\2\2\2\u00a4\u00a5\7y\2\2\u00a5\u00a6\7q\2\2\u00a6\u00a7\7t"+
		"\2\2\u00a7\u00a8\7m\2\2\u00a8\u00a9\7g\2\2\u00a9\u00aa\7t\2\2\u00aa\u00ab"+
		"\7a\2\2\u00ab\u00ac\7r\2\2\u00ac\u00ad\7t\2\2\u00ad\u00ae\7q\2\2\u00ae"+
		"\u00af\7e\2\2\u00af\u00b0\7g\2\2\u00b0\u00b1\7u\2\2\u00b1\u00b2\7u\2\2"+
		"\u00b2\u00b3\7g\2\2\u00b3\u00b4\7u\2\2\u00b4\6\3\2\2\2\u00b5\u00b6\7g"+
		"\2\2\u00b6\u00b7\7t\2\2\u00b7\u00b8\7t\2\2\u00b8\u00b9\7q\2\2\u00b9\u00ba"+
		"\7t\2\2\u00ba\u00bb\7a\2\2\u00bb\u00bc\7n\2\2\u00bc\u00bd\7q\2\2\u00bd"+
		"\u00be\7i\2\2\u00be\b\3\2\2\2\u00bf\u00c0\7y\2\2\u00c0\u00c1\7q\2\2\u00c1"+
		"\u00c2\7t\2\2\u00c2\u00c3\7m\2\2\u00c3\u00c4\7g\2\2\u00c4\u00c5\7t\2\2"+
		"\u00c5\u00c6\7a\2\2\u00c6\u00c7\7t\2\2\u00c7\u00c8\7n\2\2\u00c8\u00c9"+
		"\7k\2\2\u00c9\u00ca\7o\2\2\u00ca\u00cb\7k\2\2\u00cb\u00cc\7v\2\2\u00cc"+
		"\u00cd\7a\2\2\u00cd\u00ce\7p\2\2\u00ce\u00cf\7q\2\2\u00cf\u00d0\7h\2\2"+
		"\u00d0\u00d1\7k\2\2\u00d1\u00d2\7n\2\2\u00d2\u00d3\7g\2\2\u00d3\n\3\2"+
		"\2\2\u00d4\u00d5\7r\2\2\u00d5\u00d6\7k\2\2\u00d6\u00d7\7f\2\2\u00d7\f"+
		"\3\2\2\2\u00d8\u00d9\7g\2\2\u00d9\u00da\7x\2\2\u00da\u00db\7g\2\2\u00db"+
		"\u00dc\7p\2\2\u00dc\u00dd\7v\2\2\u00dd\u00de\7u\2\2\u00de\16\3\2\2\2\u00df"+
		"\u00e0\7w\2\2\u00e0\u00e1\7u\2\2\u00e1\u00e2\7g\2\2\u00e2\20\3\2\2\2\u00e3"+
		"\u00e4\7y\2\2\u00e4\u00e5\7q\2\2\u00e5\u00e6\7t\2\2\u00e6\u00e7\7m\2\2"+
		"\u00e7\u00e8\7g\2\2\u00e8\u00e9\7t\2\2\u00e9\u00ea\7a\2\2\u00ea\u00eb"+
		"\7e\2\2\u00eb\u00ec\7q\2\2\u00ec\u00ed\7p\2\2\u00ed\u00ee\7p\2\2\u00ee"+
		"\u00ef\7g\2\2\u00ef\u00f0\7e\2\2\u00f0\u00f1\7v\2\2\u00f1\u00f2\7k\2\2"+
		"\u00f2\u00f3\7q\2\2\u00f3\u00f4\7p\2\2\u00f4\u00f5\7u\2\2\u00f5\22\3\2"+
		"\2\2\u00f6\u00f7\7j\2\2\u00f7\u00f8\7v\2\2\u00f8\u00f9\7v\2\2\u00f9\u00fa"+
		"\7r\2\2\u00fa\24\3\2\2\2\u00fb\u00fc\7k\2\2\u00fc\u00fd\7p\2\2\u00fd\u00fe"+
		"\7e\2\2\u00fe\u00ff\7n\2\2\u00ff\u0100\7w\2\2\u0100\u0101\7f\2\2\u0101"+
		"\u0102\7g\2\2\u0102\26\3\2\2\2\u0103\u0104\7f\2\2\u0104\u0105\7g\2\2\u0105"+
		"\u0106\7h\2\2\u0106\u0107\7c\2\2\u0107\u0108\7w\2\2\u0108\u0109\7n\2\2"+
		"\u0109\u010a\7v\2\2\u010a\u010b\7a\2\2\u010b\u010c\7v\2\2\u010c\u010d"+
		"\7{\2\2\u010d\u010e\7r\2\2\u010e\u010f\7g\2\2\u010f\30\3\2\2\2\u0110\u0111"+
		"\7n\2\2\u0111\u0112\7q\2\2\u0112\u0113\7i\2\2\u0113\u0114\7a\2\2\u0114"+
		"\u0115\7h\2\2\u0115\u0116\7q\2\2\u0116\u0117\7t\2\2\u0117\u0118\7o\2\2"+
		"\u0118\u0119\7c\2\2\u0119\u011a\7v\2\2\u011a\32\3\2\2\2\u011b\u011c\7"+
		"c\2\2\u011c\u011d\7e\2\2\u011d\u011e\7e\2\2\u011e\u011f\7g\2\2\u011f\u0120"+
		"\7u\2\2\u0120\u0121\7u\2\2\u0121\u0122\7a\2\2\u0122\u0123\7n\2\2\u0123"+
		"\u0124\7q\2\2\u0124\u0125\7i\2\2\u0125\34\3\2\2\2\u0126\u0127\7u\2\2\u0127"+
		"\u0128\7g\2\2\u0128\u0129\7t\2\2\u0129\u012a\7x\2\2\u012a\u012b\7g\2\2"+
		"\u012b\u012c\7t\2\2\u012c\u012d\7a\2\2\u012d\u012e\7p\2\2\u012e\u012f"+
		"\7c\2\2\u012f\u0130\7o\2\2\u0130\u0131\7g\2\2\u0131\u0132\7u\2\2\u0132"+
		"\u0133\7a\2\2\u0133\u0134\7j\2\2\u0134\u0135\7c\2\2\u0135\u0136\7u\2\2"+
		"\u0136\u0137\7j\2\2\u0137\u0138\7a\2\2\u0138\u0139\7d\2\2\u0139\u013a"+
		"\7w\2\2\u013a\u013b\7e\2\2\u013b\u013c\7m\2\2\u013c\u013d\7g\2\2\u013d"+
		"\u013e\7v\2\2\u013e\u013f\7a\2\2\u013f\u0140\7u\2\2\u0140\u0141\7k\2\2"+
		"\u0141\u0142\7|\2\2\u0142\u0143\7g\2\2\u0143\36\3\2\2\2\u0144\u0145\7"+
		"u\2\2\u0145\u0146\7g\2\2\u0146\u0147\7t\2\2\u0147\u0148\7x\2\2\u0148\u0149"+
		"\7g\2\2\u0149\u014a\7t\2\2\u014a\u014b\7a\2\2\u014b\u014c\7p\2\2\u014c"+
		"\u014d\7c\2\2\u014d\u014e\7o\2\2\u014e\u014f\7g\2\2\u014f\u0150\7a\2\2"+
		"\u0150\u0151\7k\2\2\u0151\u0152\7p\2\2\u0152\u0153\7a\2\2\u0153\u0154"+
		"\7t\2\2\u0154\u0155\7g\2\2\u0155\u0156\7f\2\2\u0156\u0157\7k\2\2\u0157"+
		"\u0158\7t\2\2\u0158\u0159\7g\2\2\u0159\u015a\7e\2\2\u015a\u015b\7v\2\2"+
		"\u015b \3\2\2\2\u015c\u015d\7e\2\2\u015d\u015e\7n\2\2\u015e\u015f\7k\2"+
		"\2\u015f\u0160\7g\2\2\u0160\u0161\7p\2\2\u0161\u0162\7v\2\2\u0162\u0163"+
		"\7a\2\2\u0163\u0164\7j\2\2\u0164\u0165\7g\2\2\u0165\u0166\7c\2\2\u0166"+
		"\u0167\7f\2\2\u0167\u0168\7g\2\2\u0168\u0169\7t\2\2\u0169\u016a\7a\2\2"+
		"\u016a\u016b\7d\2\2\u016b\u016c\7w\2\2\u016c\u016d\7h\2\2\u016d\u016e"+
		"\7h\2\2\u016e\u016f\7g\2\2\u016f\u0170\7t\2\2\u0170\u0171\7a\2\2\u0171"+
		"\u0172\7u\2\2\u0172\u0173\7k\2\2\u0173\u0174\7|\2\2\u0174\u0175\7g\2\2"+
		"\u0175\"\3\2\2\2\u0176\u0177\7n\2\2\u0177\u0178\7c\2\2\u0178\u0179\7t"+
		"\2\2\u0179\u017a\7i\2\2\u017a\u017b\7g\2\2\u017b\u017c\7a\2\2\u017c\u017d"+
		"\7e\2\2\u017d\u017e\7n\2\2\u017e\u017f\7k\2\2\u017f\u0180\7g\2\2\u0180"+
		"\u0181\7p\2\2\u0181\u0182\7v\2\2\u0182\u0183\7a\2\2\u0183\u0184\7j\2\2"+
		"\u0184\u0185\7g\2\2\u0185\u0186\7c\2\2\u0186\u0187\7f\2\2\u0187\u0188"+
		"\7g\2\2\u0188\u0189\7t\2\2\u0189\u018a\7a\2\2\u018a\u018b\7d\2\2\u018b"+
		"\u018c\7w\2\2\u018c\u018d\7h\2\2\u018d\u018e\7h\2\2\u018e\u018f\7g\2\2"+
		"\u018f\u0190\7t\2\2\u0190\u0191\7u\2\2\u0191$\3\2\2\2\u0192\u0193\7u\2"+
		"\2\u0193\u0194\7g\2\2\u0194\u0195\7p\2\2\u0195\u0196\7f\2\2\u0196\u0197"+
		"\7h\2\2\u0197\u0198\7k\2\2\u0198\u0199\7n\2\2\u0199\u019a\7g\2\2\u019a"+
		"&\3\2\2\2\u019b\u019c\7v\2\2\u019c\u019d\7e\2\2\u019d\u019e\7r\2\2\u019e"+
		"\u019f\7a\2\2\u019f\u01a0\7p\2\2\u01a0\u01a1\7q\2\2\u01a1\u01a2\7r\2\2"+
		"\u01a2\u01a3\7w\2\2\u01a3\u01a4\7u\2\2\u01a4\u01a5\7j\2\2\u01a5(\3\2\2"+
		"\2\u01a6\u01a7\7m\2\2\u01a7\u01a8\7g\2\2\u01a8\u01a9\7g\2\2\u01a9\u01aa"+
		"\7r\2\2\u01aa\u01ab\7c\2\2\u01ab\u01ac\7n\2\2\u01ac\u01ad\7k\2\2\u01ad"+
		"\u01ae\7x\2\2\u01ae\u01af\7g\2\2\u01af\u01b0\7a\2\2\u01b0\u01b1\7v\2\2"+
		"\u01b1\u01b2\7k\2\2\u01b2\u01b3\7o\2\2\u01b3\u01b4\7g\2\2\u01b4\u01b5"+
		"\7q\2\2\u01b5\u01b6\7w\2\2\u01b6\u01b7\7v\2\2\u01b7*\3\2\2\2\u01b8\u01b9"+
		"\7e\2\2\u01b9\u01ba\7n\2\2\u01ba\u01bb\7k\2\2\u01bb\u01bc\7g\2\2\u01bc"+
		"\u01bd\7p\2\2\u01bd\u01be\7v\2\2\u01be\u01bf\7a\2\2\u01bf\u01c0\7j\2\2"+
		"\u01c0\u01c1\7g\2\2\u01c1\u01c2\7c\2\2\u01c2\u01c3\7f\2\2\u01c3\u01c4"+
		"\7g\2\2\u01c4\u01c5\7t\2\2\u01c5\u01c6\7a\2\2\u01c6\u01c7\7v\2\2\u01c7"+
		"\u01c8\7k\2\2\u01c8\u01c9\7o\2\2\u01c9\u01ca\7g\2\2\u01ca\u01cb\7q\2\2"+
		"\u01cb\u01cc\7w\2\2\u01cc\u01cd\7v\2\2\u01cd,\3\2\2\2\u01ce\u01cf\7e\2"+
		"\2\u01cf\u01d0\7n\2\2\u01d0\u01d1\7k\2\2\u01d1\u01d2\7g\2\2\u01d2\u01d3"+
		"\7p\2\2\u01d3\u01d4\7v\2\2\u01d4\u01d5\7a\2\2\u01d5\u01d6\7d\2\2\u01d6"+
		"\u01d7\7q\2\2\u01d7\u01d8\7f\2\2\u01d8\u01d9\7{\2\2\u01d9\u01da\7a\2\2"+
		"\u01da\u01db\7v\2\2\u01db\u01dc\7k\2\2\u01dc\u01dd\7o\2\2\u01dd\u01de"+
		"\7g\2\2\u01de\u01df\7q\2\2\u01df\u01e0\7w\2\2\u01e0\u01e1\7v\2\2\u01e1"+
		".\3\2\2\2\u01e2\u01e3\7u\2\2\u01e3\u01e4\7g\2\2\u01e4\u01e5\7p\2\2\u01e5"+
		"\u01e6\7f\2\2\u01e6\u01e7\7a\2\2\u01e7\u01e8\7v\2\2\u01e8\u01e9\7k\2\2"+
		"\u01e9\u01ea\7o\2\2\u01ea\u01eb\7g\2\2\u01eb\u01ec\7q\2\2\u01ec\u01ed"+
		"\7w\2\2\u01ed\u01ee\7v\2\2\u01ee\60\3\2\2\2\u01ef\u01f0\7i\2\2\u01f0\u01f1"+
		"\7|\2\2\u01f1\u01f2\7k\2\2\u01f2\u01f3\7r\2\2\u01f3\62\3\2\2\2\u01f4\u01f5"+
		"\7i\2\2\u01f5\u01f6\7|\2\2\u01f6\u01f7\7k\2\2\u01f7\u01f8\7r\2\2\u01f8"+
		"\u01f9\7a\2\2\u01f9\u01fa\7o\2\2\u01fa\u01fb\7k\2\2\u01fb\u01fc\7p\2\2"+
		"\u01fc\u01fd\7a\2\2\u01fd\u01fe\7n\2\2\u01fe\u01ff\7g\2\2\u01ff\u0200"+
		"\7p\2\2\u0200\u0201\7i\2\2\u0201\u0202\7v\2\2\u0202\u0203\7j\2\2\u0203"+
		"\64\3\2\2\2\u0204\u0205\7i\2\2\u0205\u0206\7|\2\2\u0206\u0207\7k\2\2\u0207"+
		"\u0208\7r\2\2\u0208\u0209\7a\2\2\u0209\u020a\7d\2\2\u020a\u020b\7w\2\2"+
		"\u020b\u020c\7h\2\2\u020c\u020d\7h\2\2\u020d\u020e\7g\2\2\u020e\u020f"+
		"\7t\2\2\u020f\u0210\7u\2\2\u0210\66\3\2\2\2\u0211\u0212\7i\2\2\u0212\u0213"+
		"\7|\2\2\u0213\u0214\7k\2\2\u0214\u0215\7r\2\2\u0215\u0216\7a\2\2\u0216"+
		"\u0217\7j\2\2\u0217\u0218\7v\2\2\u0218\u0219\7v\2\2\u0219\u021a\7r\2\2"+
		"\u021a\u021b\7a\2\2\u021b\u021c\7x\2\2\u021c\u021d\7g\2\2\u021d\u021e"+
		"\7t\2\2\u021e\u021f\7u\2\2\u021f\u0220\7k\2\2\u0220\u0221\7q\2\2\u0221"+
		"\u0222\7p\2\2\u02228\3\2\2\2\u0223\u0224\7i\2\2\u0224\u0225\7|\2\2\u0225"+
		"\u0226\7k\2\2\u0226\u0227\7r\2\2\u0227\u0228\7a\2\2\u0228\u0229\7e\2\2"+
		"\u0229\u022a\7q\2\2\u022a\u022b\7o\2\2\u022b\u022c\7r\2\2\u022c\u022d"+
		"\7a\2\2\u022d\u022e\7n\2\2\u022e\u022f\7g\2\2\u022f\u0230\7x\2\2\u0230"+
		"\u0231\7g\2\2\u0231\u0232\7n\2\2\u0232:\3\2\2\2\u0233\u0234\7i\2\2\u0234"+
		"\u0235\7|\2\2\u0235\u0236\7k\2\2\u0236\u0237\7r\2\2\u0237\u0238\7a\2\2"+
		"\u0238\u0239\7v\2\2\u0239\u023a\7{\2\2\u023a\u023b\7r\2\2\u023b\u023c"+
		"\7g\2\2\u023c\u023d\7u\2\2\u023d<\3\2\2\2\u023e\u023f\7i\2\2\u023f\u0240"+
		"\7|\2\2\u0240\u0241\7k\2\2\u0241\u0242\7r\2\2\u0242\u0243\7a\2\2\u0243"+
		"\u0244\7x\2\2\u0244\u0245\7c\2\2\u0245\u0246\7t\2\2\u0246\u0247\7{\2\2"+
		"\u0247>\3\2\2\2\u0248\u0249\7r\2\2\u0249\u024a\7t\2\2\u024a\u024b\7q\2"+
		"\2\u024b\u024c\7z\2\2\u024c\u024d\7{\2\2\u024d\u024e\7a\2\2\u024e\u024f"+
		"\7t\2\2\u024f\u0250\7g\2\2\u0250\u0251\7f\2\2\u0251\u0252\7k\2\2\u0252"+
		"\u0253\7t\2\2\u0253\u0254\7g\2\2\u0254\u0255\7e\2\2\u0255\u0256\7v\2\2"+
		"\u0256@\3\2\2\2\u0257\u0258\7r\2\2\u0258\u0259\7t\2\2\u0259\u025a\7q\2"+
		"\2\u025a\u025b\7z\2\2\u025b\u025c\7{\2\2\u025c\u025d\7a\2\2\u025d\u025e"+
		"\7u\2\2\u025e\u025f\7g\2\2\u025f\u0260\7v\2\2\u0260\u0261\7a\2\2\u0261"+
		"\u0262\7j\2\2\u0262\u0263\7g\2\2\u0263\u0264\7c\2\2\u0264\u0265\7f\2\2"+
		"\u0265\u0266\7g\2\2\u0266\u0267\7t\2\2\u0267B\3\2\2\2\u0268\u0269\7e\2"+
		"\2\u0269\u026a\7n\2\2\u026a\u026b\7k\2\2\u026b\u026c\7g\2\2\u026c\u026d"+
		"\7p\2\2\u026d\u026e\7v\2\2\u026e\u026f\7a\2\2\u026f\u0270\7o\2\2\u0270"+
		"\u0271\7c\2\2\u0271\u0272\7z\2\2\u0272\u0273\7a\2\2\u0273\u0274\7d\2\2"+
		"\u0274\u0275\7q\2\2\u0275\u0276\7f\2\2\u0276\u0277\7{\2\2\u0277\u0278"+
		"\7a\2\2\u0278\u0279\7u\2\2\u0279\u027a\7k\2\2\u027a\u027b\7|\2\2\u027b"+
		"\u027c\7g\2\2\u027cD\3\2\2\2\u027d\u027e\7e\2\2\u027e\u027f\7n\2\2\u027f"+
		"\u0280\7k\2\2\u0280\u0281\7g\2\2\u0281\u0282\7p\2\2\u0282\u0283\7v\2\2"+
		"\u0283\u0284\7a\2\2\u0284\u0285\7d\2\2\u0285\u0286\7q\2\2\u0286\u0287"+
		"\7f\2\2\u0287\u0288\7{\2\2\u0288\u0289\7a\2\2\u0289\u028a\7d\2\2\u028a"+
		"\u028b\7w\2\2\u028b\u028c\7h\2\2\u028c\u028d\7h\2\2\u028d\u028e\7g\2\2"+
		"\u028e\u028f\7t\2\2\u028f\u0290\7a\2\2\u0290\u0291\7u\2\2\u0291\u0292"+
		"\7k\2\2\u0292\u0293\7|\2\2\u0293\u0294\7g\2\2\u0294F\3\2\2\2\u0295\u0296"+
		"\7r\2\2\u0296\u0297\7t\2\2\u0297\u0298\7q\2\2\u0298\u0299\7z\2\2\u0299"+
		"\u029a\7{\2\2\u029a\u029b\7a\2\2\u029b\u029c\7e\2\2\u029c\u029d\7q\2\2"+
		"\u029d\u029e\7p\2\2\u029e\u029f\7p\2\2\u029f\u02a0\7g\2\2\u02a0\u02a1"+
		"\7e\2\2\u02a1\u02a2\7v\2\2\u02a2\u02a3\7a\2\2\u02a3\u02a4\7v\2\2\u02a4"+
		"\u02a5\7k\2\2\u02a5\u02a6\7o\2\2\u02a6\u02a7\7g\2\2\u02a7\u02a8\7q\2\2"+
		"\u02a8\u02a9\7w\2\2\u02a9\u02aa\7v\2\2\u02aaH\3\2\2\2\u02ab\u02ac\7r\2"+
		"\2\u02ac\u02ad\7t\2\2\u02ad\u02ae\7q\2\2\u02ae\u02af\7z\2\2\u02af\u02b0"+
		"\7{\2\2\u02b0\u02b1\7a\2\2\u02b1\u02b2\7u\2\2\u02b2\u02b3\7g\2\2\u02b3"+
		"\u02b4\7p\2\2\u02b4\u02b5\7f\2\2\u02b5\u02b6\7a\2\2\u02b6\u02b7\7v\2\2"+
		"\u02b7\u02b8\7k\2\2\u02b8\u02b9\7o\2\2\u02b9\u02ba\7g\2\2\u02ba\u02bb"+
		"\7q\2\2\u02bb\u02bc\7w\2\2\u02bc\u02bd\7v\2\2\u02bdJ\3\2\2\2\u02be\u02bf"+
		"\7r\2\2\u02bf\u02c0\7t\2\2\u02c0\u02c1\7q\2\2\u02c1\u02c2\7z\2\2\u02c2"+
		"\u02c3\7{\2\2\u02c3\u02c4\7a\2\2\u02c4\u02c5\7t\2\2\u02c5\u02c6\7g\2\2"+
		"\u02c6\u02c7\7c\2\2\u02c7\u02c8\7f\2\2\u02c8\u02c9\7a\2\2\u02c9\u02ca"+
		"\7v\2\2\u02ca\u02cb\7k\2\2\u02cb\u02cc\7o\2\2\u02cc\u02cd\7g\2\2\u02cd"+
		"\u02ce\7q\2\2\u02ce\u02cf\7w\2\2\u02cf\u02d0\7v\2\2\u02d0L\3\2\2\2\u02d1"+
		"\u02d2\7r\2\2\u02d2\u02d3\7t\2\2\u02d3\u02d4\7q\2\2\u02d4\u02d5\7z\2\2"+
		"\u02d5\u02d6\7{\2\2\u02d6\u02d7\7a\2\2\u02d7\u02d8\7d\2\2\u02d8\u02d9"+
		"\7w\2\2\u02d9\u02da\7h\2\2\u02da\u02db\7h\2\2\u02db\u02dc\7g\2\2\u02dc"+
		"\u02dd\7t\2\2\u02dd\u02de\7a\2\2\u02de\u02df\7u\2\2\u02df\u02e0\7k\2\2"+
		"\u02e0\u02e1\7|\2\2\u02e1\u02e2\7g\2\2\u02e2N\3\2\2\2\u02e3\u02e4\7r\2"+
		"\2\u02e4\u02e5\7t\2\2\u02e5\u02e6\7q\2\2\u02e6\u02e7\7z\2\2\u02e7\u02e8"+
		"\7{\2\2\u02e8\u02e9\7a\2\2\u02e9\u02ea\7d\2\2\u02ea\u02eb\7w\2\2\u02eb"+
		"\u02ec\7h\2\2\u02ec\u02ed\7h\2\2\u02ed\u02ee\7g\2\2\u02ee\u02ef\7t\2\2"+
		"\u02ef\u02f0\7u\2\2\u02f0P\3\2\2\2\u02f1\u02f2\7r\2\2\u02f2\u02f3\7t\2"+
		"\2\u02f3\u02f4\7q\2\2\u02f4\u02f5\7z\2\2\u02f5\u02f6\7{\2\2\u02f6\u02f7"+
		"\7a\2\2\u02f7\u02f8\7d\2\2\u02f8\u02f9\7w\2\2\u02f9\u02fa\7u\2\2\u02fa"+
		"\u02fb\7{\2\2\u02fb\u02fc\7a\2\2\u02fc\u02fd\7d\2\2\u02fd\u02fe\7w\2\2"+
		"\u02fe\u02ff\7h\2\2\u02ff\u0300\7h\2\2\u0300\u0301\7g\2\2\u0301\u0302"+
		"\7t\2\2\u0302\u0303\7u\2\2\u0303\u0304\7a\2\2\u0304\u0305\7u\2\2\u0305"+
		"\u0306\7k\2\2\u0306\u0307\7|\2\2\u0307\u0308\7g\2\2\u0308R\3\2\2\2\u0309"+
		"\u030a\7r\2\2\u030a\u030b\7t\2\2\u030b\u030c\7q\2\2\u030c\u030d\7z\2\2"+
		"\u030d\u030e\7{\2\2\u030e\u030f\7a\2\2\u030f\u0310\7v\2\2\u0310\u0311"+
		"\7g\2\2\u0311\u0312\7o\2\2\u0312\u0313\7r\2\2\u0313\u0314\7a\2\2\u0314"+
		"\u0315\7h\2\2\u0315\u0316\7k\2\2\u0316\u0317\7n\2\2\u0317\u0318\7g\2\2"+
		"\u0318\u0319\7a\2\2\u0319\u031a\7y\2\2\u031a\u031b\7t\2\2\u031b\u031c"+
		"\7k\2\2\u031c\u031d\7v\2\2\u031d\u031e\7g\2\2\u031e\u031f\7a\2\2\u031f"+
		"\u0320\7u\2\2\u0320\u0321\7k\2\2\u0321\u0322\7|\2\2\u0322\u0323\7g\2\2"+
		"\u0323T\3\2\2\2\u0324\u0325\7r\2\2\u0325\u0326\7t\2\2\u0326\u0327\7q\2"+
		"\2\u0327\u0328\7z\2\2\u0328\u0329\7{\2\2\u0329\u032a\7a\2\2\u032a\u032b"+
		"\7p\2\2\u032b\u032c\7g\2\2\u032c\u032d\7z\2\2\u032d\u032e\7v\2\2\u032e"+
		"\u032f\7a\2\2\u032f\u0330\7w\2\2\u0330\u0331\7r\2\2\u0331\u0332\7u\2\2"+
		"\u0332\u0333\7v\2\2\u0333\u0334\7t\2\2\u0334\u0335\7g\2\2\u0335\u0336"+
		"\7c\2\2\u0336\u0337\7o\2\2\u0337V\3\2\2\2\u0338\u0339\7r\2\2\u0339\u033a"+
		"\7t\2\2\u033a\u033b\7q\2\2\u033b\u033c\7z\2\2\u033c\u033d\7{\2\2\u033d"+
		"\u033e\7a\2\2\u033e\u033f\7o\2\2\u033f\u0340\7c\2\2\u0340\u0341\7z\2\2"+
		"\u0341\u0342\7a\2\2\u0342\u0343\7v\2\2\u0343\u0344\7g\2\2\u0344\u0345"+
		"\7o\2\2\u0345\u0346\7r\2\2\u0346\u0347\7a\2\2\u0347\u0348\7h\2\2\u0348"+
		"\u0349\7k\2\2\u0349\u034a\7n\2\2\u034a\u034b\7g\2\2\u034b\u034c\7a\2\2"+
		"\u034c\u034d\7u\2\2\u034d\u034e\7k\2\2\u034e\u034f\7|\2\2\u034f\u0350"+
		"\7g\2\2\u0350X\3\2\2\2\u0351\u0352\7k\2\2\u0352\u0353\7p\2\2\u0353\u0354"+
		"\7f\2\2\u0354\u0355\7g\2\2\u0355\u0356\7z\2\2\u0356Z\3\2\2\2\u0357\u0358"+
		"\7u\2\2\u0358\u0359\7g\2\2\u0359\u035a\7t\2\2\u035a\u035b\7x\2\2\u035b"+
		"\u035c\7g\2\2\u035c\u035d\7t\2\2\u035d\\\3\2\2\2\u035e\u035f\7n\2\2\u035f"+
		"\u0360\7k\2\2\u0360\u0361\7u\2\2\u0361\u0362\7v\2\2\u0362\u0363\7g\2\2"+
		"\u0363\u0364\7p\2\2\u0364^\3\2\2\2\u0365\u0366\7u\2\2\u0366\u0367\7g\2"+
		"\2\u0367\u0368\7t\2\2\u0368\u0369\7x\2\2\u0369\u036a\7g\2\2\u036a\u036b"+
		"\7t\2\2\u036b\u036c\7a\2\2\u036c\u036d\7p\2\2\u036d\u036e\7c\2\2\u036e"+
		"\u036f\7o\2\2\u036f\u0370\7g\2\2\u0370`\3\2\2\2\u0371\u0372\7t\2\2\u0372"+
		"\u0373\7q\2\2\u0373\u0374\7q\2\2\u0374\u0375\7v\2\2\u0375b\3\2\2\2\u0376"+
		"\u0377\7c\2\2\u0377\u0378\7w\2\2\u0378\u0379\7v\2\2\u0379\u037a\7q\2\2"+
		"\u037a\u037b\7k\2\2\u037b\u037c\7p\2\2\u037c\u037d\7f\2\2\u037d\u037e"+
		"\7g\2\2\u037e\u037f\7z\2\2\u037fd\3\2\2\2\u0380\u0381\7c\2\2\u0381\u0382"+
		"\7w\2\2\u0382\u0383\7v\2\2\u0383\u0384\7q\2\2\u0384\u0385\7k\2\2\u0385"+
		"\u0386\7p\2\2\u0386\u0387\7f\2\2\u0387\u0388\7g\2\2\u0388\u0389\7z\2\2"+
		"\u0389\u038a\7a\2\2\u038a\u038b\7n\2\2\u038b\u038c\7q\2\2\u038c\u038d"+
		"\7e\2\2\u038d\u038e\7c\2\2\u038e\u038f\7n\2\2\u038f\u0390\7v\2\2\u0390"+
		"\u0391\7k\2\2\u0391\u0392\7o\2\2\u0392\u0393\7g\2\2\u0393f\3\2\2\2\u0394"+
		"\u0395\7e\2\2\u0395\u0396\7j\2\2\u0396\u0397\7c\2\2\u0397\u0398\7t\2\2"+
		"\u0398\u0399\7u\2\2\u0399\u039a\7g\2\2\u039a\u039b\7v\2\2\u039bh\3\2\2"+
		"\2\u039c\u039d\7n\2\2\u039d\u039e\7q\2\2\u039e\u039f\7e\2\2\u039f\u03a0"+
		"\7c\2\2\u03a0\u03a1\7v\2\2\u03a1\u03a2\7k\2\2\u03a2\u03a3\7q\2\2\u03a3"+
		"\u03a4\7p\2\2\u03a4j\3\2\2\2\u03a5\u03a6\7}\2\2\u03a6l\3\2\2\2\u03a7\u03a8"+
		"\7\177\2\2\u03a8n\3\2\2\2\u03a9\u03ad\5q9\2\u03aa\u03ab\5\u0081A\2\u03ab"+
		"\u03ac\5q9\2\u03ac\u03ae\3\2\2\2\u03ad\u03aa\3\2\2\2\u03ae\u03af\3\2\2"+
		"\2\u03af\u03ad\3\2\2\2\u03af\u03b0\3\2\2\2\u03b0p\3\2\2\2\u03b1\u03b3"+
		"\5{>\2\u03b2\u03b1\3\2\2\2\u03b3\u03b4\3\2\2\2\u03b4\u03b2\3\2\2\2\u03b4"+
		"\u03b5\3\2\2\2\u03b5r\3\2\2\2\u03b6\u03b7\7\"\2\2\u03b7t\3\2\2\2\u03b8"+
		"\u03c6\5{>\2\u03b9\u03c6\5\u0081A\2\u03ba\u03c6\5w<\2\u03bb\u03c6\5\u0083"+
		"B\2\u03bc\u03c6\5\u0091I\2\u03bd\u03c6\5\u0097L\2\u03be\u03c6\5\u0099"+
		"M\2\u03bf\u03c6\5\u0085C\2\u03c0\u03c6\5\u0087D\2\u03c1\u03c6\5\u0089"+
		"E\2\u03c2\u03c6\5}?\2\u03c3\u03c6\5\u008bF\2\u03c4\u03c6\5\u0095K\2\u03c5"+
		"\u03b8\3\2\2\2\u03c5\u03b9\3\2\2\2\u03c5\u03ba\3\2\2\2\u03c5\u03bb\3\2"+
		"\2\2\u03c5\u03bc\3\2\2\2\u03c5\u03bd\3\2\2\2\u03c5\u03be\3\2\2\2\u03c5"+
		"\u03bf\3\2\2\2\u03c5\u03c0\3\2\2\2\u03c5\u03c1\3\2\2\2\u03c5\u03c2\3\2"+
		"\2\2\u03c5\u03c3\3\2\2\2\u03c5\u03c4\3\2\2\2\u03c6\u03c7\3\2\2\2\u03c7"+
		"\u03c5\3\2\2\2\u03c7\u03c8\3\2\2\2\u03c8v\3\2\2\2\u03c9\u03ca\t\2\2\2"+
		"\u03cax\3\2\2\2\u03cb\u03cd\5\177@\2\u03cc\u03cb\3\2\2\2\u03cd\u03ce\3"+
		"\2\2\2\u03ce\u03cc\3\2\2\2\u03ce\u03cf\3\2\2\2\u03cfz\3\2\2\2\u03d0\u03d1"+
		"\t\3\2\2\u03d1|\3\2\2\2\u03d2\u03d3\t\4\2\2\u03d3~\3\2\2\2\u03d4\u03d5"+
		"\t\5\2\2\u03d5\u0080\3\2\2\2\u03d6\u03d7\7a\2\2\u03d7\u0082\3\2\2\2\u03d8"+
		"\u03d9\7\61\2\2\u03d9\u0084\3\2\2\2\u03da\u03db\7-\2\2\u03db\u0086\3\2"+
		"\2\2\u03dc\u03dd\7/\2\2\u03dd\u0088\3\2\2\2\u03de\u03df\7\60\2\2\u03df"+
		"\u008a\3\2\2\2\u03e0\u03e1\7?\2\2\u03e1\u008c\3\2\2\2\u03e2\u03e3\7=\2"+
		"\2\u03e3\u008e\3\2\2\2\u03e4\u03e5\t\6\2\2\u03e5\u0090\3\2\2\2\u03e6\u03e7"+
		"\t\7\2\2\u03e7\u0092\3\2\2\2\u03e8\u03e9\7%\2\2\u03e9\u0094\3\2\2\2\u03ea"+
		"\u03eb\7&\2\2\u03eb\u0096\3\2\2\2\u03ec\u03ed\7]\2\2\u03ed\u0098\3\2\2"+
		"\2\u03ee\u03ef\7_\2\2\u03ef\u009a\3\2\2\2\u03f0\u03f4\5\u0093J\2\u03f1"+
		"\u03f3\13\2\2\2\u03f2\u03f1\3\2\2\2\u03f3\u03f6\3\2\2\2\u03f4\u03f5\3"+
		"\2\2\2\u03f4\u03f2\3\2\2\2\u03f5\u03f7\3\2\2\2\u03f6\u03f4\3\2\2\2\u03f7"+
		"\u03f8\7\f\2\2\u03f8\u03f9\3\2\2\2\u03f9\u03fa\bN\2\2\u03fa\u009c\3\2"+
		"\2\2\u03fb\u03fd\t\b\2\2\u03fc\u03fb\3\2\2\2\u03fd\u03fe\3\2\2\2\u03fe"+
		"\u03fc\3\2\2\2\u03fe\u03ff\3\2\2\2\u03ff\u0400\3\2\2\2\u0400\u0401\bO"+
		"\2\2\u0401\u009e\3\2\2\2\n\2\u03af\u03b4\u03c5\u03c7\u03ce\u03f4\u03fe"+
		"\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
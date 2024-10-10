// Generated from c:/Users/chen_/Workspace/genai/llama_index_test/antlr_g4/SqlBase.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class SqlBaseParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		SELECT=10, FROM=11, ADD=12, AS=13, ALL=14, DISTINCT=15, WHERE=16, GROUP=17, 
		BY=18, GROUPING=19, SETS=20, CUBE=21, ROLLUP=22, ORDER=23, HAVING=24, 
		LIMIT=25, AT=26, OR=27, AND=28, IN=29, NOT=30, NO=31, EXISTS=32, BETWEEN=33, 
		LIKE=34, RLIKE=35, IS=36, NULL=37, TRUE=38, FALSE=39, NULLS=40, ASC=41, 
		DESC=42, FOR=43, INTERVAL=44, CASE=45, WHEN=46, THEN=47, ELSE=48, END=49, 
		JOIN=50, CROSS=51, OUTER=52, INNER=53, LEFT=54, SEMI=55, RIGHT=56, FULL=57, 
		NATURAL=58, ON=59, LATERAL=60, WINDOW=61, OVER=62, PARTITION=63, RANGE=64, 
		ROWS=65, UNBOUNDED=66, PRECEDING=67, FOLLOWING=68, CURRENT=69, FIRST=70, 
		AFTER=71, LAST=72, ROW=73, WITH=74, VALUES=75, CREATE=76, TABLE=77, VIEW=78, 
		REPLACE=79, INSERT=80, DELETE=81, INTO=82, DESCRIBE=83, EXPLAIN=84, FORMAT=85, 
		LOGICAL=86, CODEGEN=87, COST=88, CAST=89, SHOW=90, TABLES=91, COLUMNS=92, 
		COLUMN=93, USE=94, PARTITIONS=95, FUNCTIONS=96, DROP=97, UNION=98, EXCEPT=99, 
		SETMINUS=100, INTERSECT=101, TO=102, TABLESAMPLE=103, STRATIFY=104, ALTER=105, 
		RENAME=106, ARRAY=107, MAP=108, STRUCT=109, COMMENT=110, SET=111, RESET=112, 
		DATA=113, START=114, TRANSACTION=115, COMMIT=116, ROLLBACK=117, MACRO=118, 
		IGNORE=119, KNN=120, POINT=121, KNNPRED=122, IF=123, EQ=124, NSEQ=125, 
		NEQ=126, NEQJ=127, LT=128, LTE=129, GT=130, GTE=131, PLUS=132, MINUS=133, 
		ASTERISK=134, SLASH=135, PERCENT=136, DIV=137, TILDE=138, AMPERSAND=139, 
		PIPE=140, HAT=141, PERCENTLIT=142, BUCKET=143, OUT=144, OF=145, SORT=146, 
		CLUSTER=147, DISTRIBUTE=148, OVERWRITE=149, TRANSFORM=150, REDUCE=151, 
		USING=152, SERDE=153, SERDEPROPERTIES=154, RECORDREADER=155, RECORDWRITER=156, 
		DELIMITED=157, FIELDS=158, TERMINATED=159, COLLECTION=160, ITEMS=161, 
		KEYS=162, ESCAPED=163, LINES=164, SEPARATED=165, FUNCTION=166, EXTENDED=167, 
		REFRESH=168, CLEAR=169, CACHE=170, UNCACHE=171, LAZY=172, FORMATTED=173, 
		GLOBAL=174, TEMPORARY=175, OPTIONS=176, UNSET=177, TBLPROPERTIES=178, 
		DBPROPERTIES=179, BUCKETS=180, SKEWED=181, STORED=182, DIRECTORIES=183, 
		LOCATION=184, EXCHANGE=185, ARCHIVE=186, UNARCHIVE=187, FILEFORMAT=188, 
		TOUCH=189, COMPACT=190, CONCATENATE=191, CHANGE=192, CASCADE=193, RESTRICT=194, 
		CLUSTERED=195, SORTED=196, PURGE=197, INPUTFORMAT=198, OUTPUTFORMAT=199, 
		DATABASE=200, DATABASES=201, DFS=202, TRUNCATE=203, ANALYZE=204, COMPUTE=205, 
		LIST=206, STATISTICS=207, PARTITIONED=208, EXTERNAL=209, DEFINED=210, 
		REVOKE=211, GRANT=212, LOCK=213, UNLOCK=214, MSCK=215, REPAIR=216, RECOVER=217, 
		EXPORT=218, IMPORT=219, LOAD=220, ROLE=221, ROLES=222, COMPACTIONS=223, 
		PRINCIPALS=224, TRANSACTIONS=225, INDEX=226, INDEXES=227, LOCKS=228, OPTION=229, 
		ANTI=230, LOCAL=231, INPATH=232, STRING=233, BIGINT_LITERAL=234, SMALLINT_LITERAL=235, 
		TINYINT_LITERAL=236, BYTELENGTH_LITERAL=237, INTEGER_VALUE=238, DECIMAL_VALUE=239, 
		DOUBLE_LITERAL=240, BIGDECIMAL_LITERAL=241, IDENTIFIER=242, BACKQUOTED_IDENTIFIER=243, 
		SIMPLE_COMMENT=244, BRACKETED_EMPTY_COMMENT=245, BRACKETED_COMMENT=246, 
		WS=247, UNRECOGNIZED=248, DELIMITER=249;
	public static final int
		RULE_singleStatement = 0, RULE_singleExpression = 1, RULE_singleTableIdentifier = 2, 
		RULE_singleFunctionIdentifier = 3, RULE_singleDataType = 4, RULE_statement = 5, 
		RULE_unsupportedHiveNativeCommands = 6, RULE_createTableHeader = 7, RULE_bucketSpec = 8, 
		RULE_skewSpec = 9, RULE_locationSpec = 10, RULE_query = 11, RULE_insertInto = 12, 
		RULE_partitionSpecLocation = 13, RULE_partitionSpec = 14, RULE_partitionVal = 15, 
		RULE_describeFuncName = 16, RULE_describeColName = 17, RULE_ctes = 18, 
		RULE_namedQuery = 19, RULE_tableProvider = 20, RULE_tablePropertyList = 21, 
		RULE_tableProperty = 22, RULE_tablePropertyKey = 23, RULE_tablePropertyValue = 24, 
		RULE_constantList = 25, RULE_nestedConstantList = 26, RULE_createFileFormat = 27, 
		RULE_fileFormat = 28, RULE_storageHandler = 29, RULE_resource = 30, RULE_queryNoWith = 31, 
		RULE_queryOrganization = 32, RULE_multiInsertQueryBody = 33, RULE_queryTerm = 34, 
		RULE_queryPrimary = 35, RULE_sortItem = 36, RULE_querySpecification = 37, 
		RULE_hint = 38, RULE_hintStatement = 39, RULE_fromClause = 40, RULE_aggregation = 41, 
		RULE_groupingSet = 42, RULE_lateralView = 43, RULE_setQuantifier = 44, 
		RULE_relation = 45, RULE_joinRelation = 46, RULE_joinType = 47, RULE_joinCriteria = 48, 
		RULE_sample = 49, RULE_identifierList = 50, RULE_identifierSeq = 51, RULE_orderedIdentifierList = 52, 
		RULE_orderedIdentifier = 53, RULE_identifierCommentList = 54, RULE_identifierComment = 55, 
		RULE_relationPrimary = 56, RULE_inlineTable = 57, RULE_rowFormat = 58, 
		RULE_tableIdentifier = 59, RULE_functionIdentifier = 60, RULE_namedExpression = 61, 
		RULE_namedExpressionSeq = 62, RULE_expression = 63, RULE_booleanExpression = 64, 
		RULE_predicated = 65, RULE_spatialpredicated = 66, RULE_predicate = 67, 
		RULE_myexpressionlist1 = 68, RULE_myexpressionlist2 = 69, RULE_valueExpression = 70, 
		RULE_primaryExpression = 71, RULE_constant = 72, RULE_comparisonOperator = 73, 
		RULE_arithmeticOperator = 74, RULE_predicateOperator = 75, RULE_booleanValue = 76, 
		RULE_interval = 77, RULE_intervalField = 78, RULE_intervalValue = 79, 
		RULE_colPosition = 80, RULE_dataType = 81, RULE_colTypeList = 82, RULE_colType = 83, 
		RULE_complexColTypeList = 84, RULE_complexColType = 85, RULE_whenClause = 86, 
		RULE_windows = 87, RULE_namedWindow = 88, RULE_windowSpec = 89, RULE_windowFrame = 90, 
		RULE_frameBound = 91, RULE_qualifiedName = 92, RULE_identifier = 93, RULE_strictIdentifier = 94, 
		RULE_quotedIdentifier = 95, RULE_number = 96, RULE_nonReserved = 97;
	private static String[] makeRuleNames() {
		return new String[] {
			"singleStatement", "singleExpression", "singleTableIdentifier", "singleFunctionIdentifier", 
			"singleDataType", "statement", "unsupportedHiveNativeCommands", "createTableHeader", 
			"bucketSpec", "skewSpec", "locationSpec", "query", "insertInto", "partitionSpecLocation", 
			"partitionSpec", "partitionVal", "describeFuncName", "describeColName", 
			"ctes", "namedQuery", "tableProvider", "tablePropertyList", "tableProperty", 
			"tablePropertyKey", "tablePropertyValue", "constantList", "nestedConstantList", 
			"createFileFormat", "fileFormat", "storageHandler", "resource", "queryNoWith", 
			"queryOrganization", "multiInsertQueryBody", "queryTerm", "queryPrimary", 
			"sortItem", "querySpecification", "hint", "hintStatement", "fromClause", 
			"aggregation", "groupingSet", "lateralView", "setQuantifier", "relation", 
			"joinRelation", "joinType", "joinCriteria", "sample", "identifierList", 
			"identifierSeq", "orderedIdentifierList", "orderedIdentifier", "identifierCommentList", 
			"identifierComment", "relationPrimary", "inlineTable", "rowFormat", "tableIdentifier", 
			"functionIdentifier", "namedExpression", "namedExpressionSeq", "expression", 
			"booleanExpression", "predicated", "spatialpredicated", "predicate", 
			"myexpressionlist1", "myexpressionlist2", "valueExpression", "primaryExpression", 
			"constant", "comparisonOperator", "arithmeticOperator", "predicateOperator", 
			"booleanValue", "interval", "intervalField", "intervalValue", "colPosition", 
			"dataType", "colTypeList", "colType", "complexColTypeList", "complexColType", 
			"whenClause", "windows", "namedWindow", "windowSpec", "windowFrame", 
			"frameBound", "qualifiedName", "identifier", "strictIdentifier", "quotedIdentifier", 
			"number", "nonReserved"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "','", "'.'", "'/*+'", "'*/'", "'['", "']'", "':'", 
			"'SELECT'", "'FROM'", "'ADD'", "'AS'", "'ALL'", "'DISTINCT'", "'WHERE'", 
			"'GROUP'", "'BY'", "'GROUPING'", "'SETS'", "'CUBE'", "'ROLLUP'", "'ORDER'", 
			"'HAVING'", "'LIMIT'", "'AT'", "'OR'", "'AND'", "'IN'", null, "'NO'", 
			"'EXISTS'", "'BETWEEN'", "'LIKE'", null, "'IS'", "'NULL'", "'TRUE'", 
			"'FALSE'", "'NULLS'", "'ASC'", "'DESC'", "'FOR'", "'INTERVAL'", "'CASE'", 
			"'WHEN'", "'THEN'", "'ELSE'", "'END'", "'JOIN'", "'CROSS'", "'OUTER'", 
			"'INNER'", "'LEFT'", "'SEMI'", "'RIGHT'", "'FULL'", "'NATURAL'", "'ON'", 
			"'LATERAL'", "'WINDOW'", "'OVER'", "'PARTITION'", "'RANGE'", "'ROWS'", 
			"'UNBOUNDED'", "'PRECEDING'", "'FOLLOWING'", "'CURRENT'", "'FIRST'", 
			"'AFTER'", "'LAST'", "'ROW'", "'WITH'", "'VALUES'", "'CREATE'", "'TABLE'", 
			"'VIEW'", "'REPLACE'", "'INSERT'", "'DELETE'", "'INTO'", "'DESCRIBE'", 
			"'EXPLAIN'", "'FORMAT'", "'LOGICAL'", "'CODEGEN'", "'COST'", "'CAST'", 
			"'SHOW'", "'TABLES'", "'COLUMNS'", "'COLUMN'", "'USE'", "'PARTITIONS'", 
			"'FUNCTIONS'", "'DROP'", "'UNION'", "'EXCEPT'", "'MINUS'", "'INTERSECT'", 
			"'TO'", "'TABLESAMPLE'", "'STRATIFY'", "'ALTER'", "'RENAME'", "'ARRAY'", 
			"'MAP'", "'STRUCT'", "'COMMENT'", "'SET'", "'RESET'", "'DATA'", "'START'", 
			"'TRANSACTION'", "'COMMIT'", "'ROLLBACK'", "'MACRO'", "'IGNORE'", "'KNN'", 
			"'POINT'", "'KNNPRED'", "'IF'", null, "'<=>'", "'<>'", "'!='", "'<'", 
			null, "'>'", null, "'+'", "'-'", "'*'", "'/'", "'%'", "'DIV'", "'~'", 
			"'&'", "'|'", "'^'", "'PERCENT'", "'BUCKET'", "'OUT'", "'OF'", "'SORT'", 
			"'CLUSTER'", "'DISTRIBUTE'", "'OVERWRITE'", "'TRANSFORM'", "'REDUCE'", 
			"'USING'", "'SERDE'", "'SERDEPROPERTIES'", "'RECORDREADER'", "'RECORDWRITER'", 
			"'DELIMITED'", "'FIELDS'", "'TERMINATED'", "'COLLECTION'", "'ITEMS'", 
			"'KEYS'", "'ESCAPED'", "'LINES'", "'SEPARATED'", "'FUNCTION'", "'EXTENDED'", 
			"'REFRESH'", "'CLEAR'", "'CACHE'", "'UNCACHE'", "'LAZY'", "'FORMATTED'", 
			"'GLOBAL'", null, "'OPTIONS'", "'UNSET'", "'TBLPROPERTIES'", "'DBPROPERTIES'", 
			"'BUCKETS'", "'SKEWED'", "'STORED'", "'DIRECTORIES'", "'LOCATION'", "'EXCHANGE'", 
			"'ARCHIVE'", "'UNARCHIVE'", "'FILEFORMAT'", "'TOUCH'", "'COMPACT'", "'CONCATENATE'", 
			"'CHANGE'", "'CASCADE'", "'RESTRICT'", "'CLUSTERED'", "'SORTED'", "'PURGE'", 
			"'INPUTFORMAT'", "'OUTPUTFORMAT'", null, null, "'DFS'", "'TRUNCATE'", 
			"'ANALYZE'", "'COMPUTE'", "'LIST'", "'STATISTICS'", "'PARTITIONED'", 
			"'EXTERNAL'", "'DEFINED'", "'REVOKE'", "'GRANT'", "'LOCK'", "'UNLOCK'", 
			"'MSCK'", "'REPAIR'", "'RECOVER'", "'EXPORT'", "'IMPORT'", "'LOAD'", 
			"'ROLE'", "'ROLES'", "'COMPACTIONS'", "'PRINCIPALS'", "'TRANSACTIONS'", 
			"'INDEX'", "'INDEXES'", "'LOCKS'", "'OPTION'", "'ANTI'", "'LOCAL'", "'INPATH'", 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"'/**/'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, "SELECT", 
			"FROM", "ADD", "AS", "ALL", "DISTINCT", "WHERE", "GROUP", "BY", "GROUPING", 
			"SETS", "CUBE", "ROLLUP", "ORDER", "HAVING", "LIMIT", "AT", "OR", "AND", 
			"IN", "NOT", "NO", "EXISTS", "BETWEEN", "LIKE", "RLIKE", "IS", "NULL", 
			"TRUE", "FALSE", "NULLS", "ASC", "DESC", "FOR", "INTERVAL", "CASE", "WHEN", 
			"THEN", "ELSE", "END", "JOIN", "CROSS", "OUTER", "INNER", "LEFT", "SEMI", 
			"RIGHT", "FULL", "NATURAL", "ON", "LATERAL", "WINDOW", "OVER", "PARTITION", 
			"RANGE", "ROWS", "UNBOUNDED", "PRECEDING", "FOLLOWING", "CURRENT", "FIRST", 
			"AFTER", "LAST", "ROW", "WITH", "VALUES", "CREATE", "TABLE", "VIEW", 
			"REPLACE", "INSERT", "DELETE", "INTO", "DESCRIBE", "EXPLAIN", "FORMAT", 
			"LOGICAL", "CODEGEN", "COST", "CAST", "SHOW", "TABLES", "COLUMNS", "COLUMN", 
			"USE", "PARTITIONS", "FUNCTIONS", "DROP", "UNION", "EXCEPT", "SETMINUS", 
			"INTERSECT", "TO", "TABLESAMPLE", "STRATIFY", "ALTER", "RENAME", "ARRAY", 
			"MAP", "STRUCT", "COMMENT", "SET", "RESET", "DATA", "START", "TRANSACTION", 
			"COMMIT", "ROLLBACK", "MACRO", "IGNORE", "KNN", "POINT", "KNNPRED", "IF", 
			"EQ", "NSEQ", "NEQ", "NEQJ", "LT", "LTE", "GT", "GTE", "PLUS", "MINUS", 
			"ASTERISK", "SLASH", "PERCENT", "DIV", "TILDE", "AMPERSAND", "PIPE", 
			"HAT", "PERCENTLIT", "BUCKET", "OUT", "OF", "SORT", "CLUSTER", "DISTRIBUTE", 
			"OVERWRITE", "TRANSFORM", "REDUCE", "USING", "SERDE", "SERDEPROPERTIES", 
			"RECORDREADER", "RECORDWRITER", "DELIMITED", "FIELDS", "TERMINATED", 
			"COLLECTION", "ITEMS", "KEYS", "ESCAPED", "LINES", "SEPARATED", "FUNCTION", 
			"EXTENDED", "REFRESH", "CLEAR", "CACHE", "UNCACHE", "LAZY", "FORMATTED", 
			"GLOBAL", "TEMPORARY", "OPTIONS", "UNSET", "TBLPROPERTIES", "DBPROPERTIES", 
			"BUCKETS", "SKEWED", "STORED", "DIRECTORIES", "LOCATION", "EXCHANGE", 
			"ARCHIVE", "UNARCHIVE", "FILEFORMAT", "TOUCH", "COMPACT", "CONCATENATE", 
			"CHANGE", "CASCADE", "RESTRICT", "CLUSTERED", "SORTED", "PURGE", "INPUTFORMAT", 
			"OUTPUTFORMAT", "DATABASE", "DATABASES", "DFS", "TRUNCATE", "ANALYZE", 
			"COMPUTE", "LIST", "STATISTICS", "PARTITIONED", "EXTERNAL", "DEFINED", 
			"REVOKE", "GRANT", "LOCK", "UNLOCK", "MSCK", "REPAIR", "RECOVER", "EXPORT", 
			"IMPORT", "LOAD", "ROLE", "ROLES", "COMPACTIONS", "PRINCIPALS", "TRANSACTIONS", 
			"INDEX", "INDEXES", "LOCKS", "OPTION", "ANTI", "LOCAL", "INPATH", "STRING", 
			"BIGINT_LITERAL", "SMALLINT_LITERAL", "TINYINT_LITERAL", "BYTELENGTH_LITERAL", 
			"INTEGER_VALUE", "DECIMAL_VALUE", "DOUBLE_LITERAL", "BIGDECIMAL_LITERAL", 
			"IDENTIFIER", "BACKQUOTED_IDENTIFIER", "SIMPLE_COMMENT", "BRACKETED_EMPTY_COMMENT", 
			"BRACKETED_COMMENT", "WS", "UNRECOGNIZED", "DELIMITER"
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
	public String getGrammarFileName() { return "SqlBase.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	def is_valid_decimal(self):
	    """
	    验证当前标记是否为有效的十进制数（包含小数点）。
	    如果标记后跟随的字符不是数字、字母或下划线，则返回True。

	    示例：
	    对于字符流 "2.3"，"2." 不是有效的十进制数，因为它后面跟着数字 '3'。
	    对于字符流 "2.3_"，"2.3" 不是有效的十进制数，因为它后面跟着 '_'。
	    对于字符流 "2.3W"，"2.3" 不是有效的十进制数，因为它后面跟着 'W'。
	    对于字符流 "12.0D 34.E2+0.12"，"12.0D" 是有效的十进制数，因为它后面跟着空格。
	    "34.E2" 是有效的十进制数，因为它后面跟着符号 '+'，这不是数字、字母或下划线。
	    """
	    next_char = self._input.LA(1)
	    if ('A' <= chr(next_char) <= 'Z') or ('0' <= chr(next_char) <= '9') or (chr(next_char) == '_'):
	        return False
	    else:
	        return True

	public SqlBaseParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SingleStatementContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SqlBaseParser.EOF, 0); }
		public SingleStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleStatement; }
	}

	public final SingleStatementContext singleStatement() throws RecognitionException {
		SingleStatementContext _localctx = new SingleStatementContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_singleStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			statement();
			setState(197);
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
	public static class SingleExpressionContext extends ParserRuleContext {
		public NamedExpressionContext namedExpression() {
			return getRuleContext(NamedExpressionContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SqlBaseParser.EOF, 0); }
		public SingleExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleExpression; }
	}

	public final SingleExpressionContext singleExpression() throws RecognitionException {
		SingleExpressionContext _localctx = new SingleExpressionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_singleExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			namedExpression();
			setState(200);
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
	public static class SingleTableIdentifierContext extends ParserRuleContext {
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SqlBaseParser.EOF, 0); }
		public SingleTableIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleTableIdentifier; }
	}

	public final SingleTableIdentifierContext singleTableIdentifier() throws RecognitionException {
		SingleTableIdentifierContext _localctx = new SingleTableIdentifierContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_singleTableIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			tableIdentifier();
			setState(203);
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
	public static class SingleFunctionIdentifierContext extends ParserRuleContext {
		public FunctionIdentifierContext functionIdentifier() {
			return getRuleContext(FunctionIdentifierContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SqlBaseParser.EOF, 0); }
		public SingleFunctionIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleFunctionIdentifier; }
	}

	public final SingleFunctionIdentifierContext singleFunctionIdentifier() throws RecognitionException {
		SingleFunctionIdentifierContext _localctx = new SingleFunctionIdentifierContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_singleFunctionIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			functionIdentifier();
			setState(206);
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
	public static class SingleDataTypeContext extends ParserRuleContext {
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SqlBaseParser.EOF, 0); }
		public SingleDataTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleDataType; }
	}

	public final SingleDataTypeContext singleDataType() throws RecognitionException {
		SingleDataTypeContext _localctx = new SingleDataTypeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_singleDataType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			dataType();
			setState(209);
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
	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExplainContext extends StatementContext {
		public TerminalNode EXPLAIN() { return getToken(SqlBaseParser.EXPLAIN, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode LOGICAL() { return getToken(SqlBaseParser.LOGICAL, 0); }
		public TerminalNode FORMATTED() { return getToken(SqlBaseParser.FORMATTED, 0); }
		public TerminalNode EXTENDED() { return getToken(SqlBaseParser.EXTENDED, 0); }
		public TerminalNode CODEGEN() { return getToken(SqlBaseParser.CODEGEN, 0); }
		public TerminalNode COST() { return getToken(SqlBaseParser.COST, 0); }
		public ExplainContext(StatementContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DropDatabaseContext extends StatementContext {
		public TerminalNode DROP() { return getToken(SqlBaseParser.DROP, 0); }
		public TerminalNode DATABASE() { return getToken(SqlBaseParser.DATABASE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public TerminalNode RESTRICT() { return getToken(SqlBaseParser.RESTRICT, 0); }
		public TerminalNode CASCADE() { return getToken(SqlBaseParser.CASCADE, 0); }
		public DropDatabaseContext(StatementContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ResetConfigurationContext extends StatementContext {
		public TerminalNode RESET() { return getToken(SqlBaseParser.RESET, 0); }
		public ResetConfigurationContext(StatementContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DescribeDatabaseContext extends StatementContext {
		public TerminalNode DATABASE() { return getToken(SqlBaseParser.DATABASE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode DESC() { return getToken(SqlBaseParser.DESC, 0); }
		public TerminalNode DESCRIBE() { return getToken(SqlBaseParser.DESCRIBE, 0); }
		public TerminalNode EXTENDED() { return getToken(SqlBaseParser.EXTENDED, 0); }
		public DescribeDatabaseContext(StatementContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AlterViewQueryContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode VIEW() { return getToken(SqlBaseParser.VIEW, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public AlterViewQueryContext(StatementContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UseContext extends StatementContext {
		public IdentifierContext db;
		public TerminalNode USE() { return getToken(SqlBaseParser.USE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public UseContext(StatementContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CreateTempViewUsingContext extends StatementContext {
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public TerminalNode TEMPORARY() { return getToken(SqlBaseParser.TEMPORARY, 0); }
		public TerminalNode VIEW() { return getToken(SqlBaseParser.VIEW, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TableProviderContext tableProvider() {
			return getRuleContext(TableProviderContext.class,0);
		}
		public TerminalNode OR() { return getToken(SqlBaseParser.OR, 0); }
		public TerminalNode REPLACE() { return getToken(SqlBaseParser.REPLACE, 0); }
		public TerminalNode GLOBAL() { return getToken(SqlBaseParser.GLOBAL, 0); }
		public ColTypeListContext colTypeList() {
			return getRuleContext(ColTypeListContext.class,0);
		}
		public TerminalNode OPTIONS() { return getToken(SqlBaseParser.OPTIONS, 0); }
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public CreateTempViewUsingContext(StatementContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RenameTableContext extends StatementContext {
		public TableIdentifierContext from;
		public TableIdentifierContext to;
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode RENAME() { return getToken(SqlBaseParser.RENAME, 0); }
		public TerminalNode TO() { return getToken(SqlBaseParser.TO, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TerminalNode VIEW() { return getToken(SqlBaseParser.VIEW, 0); }
		public List<TableIdentifierContext> tableIdentifier() {
			return getRuleContexts(TableIdentifierContext.class);
		}
		public TableIdentifierContext tableIdentifier(int i) {
			return getRuleContext(TableIdentifierContext.class,i);
		}
		public RenameTableContext(StatementContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FailNativeCommandContext extends StatementContext {
		public TerminalNode SET() { return getToken(SqlBaseParser.SET, 0); }
		public TerminalNode ROLE() { return getToken(SqlBaseParser.ROLE, 0); }
		public UnsupportedHiveNativeCommandsContext unsupportedHiveNativeCommands() {
			return getRuleContext(UnsupportedHiveNativeCommandsContext.class,0);
		}
		public FailNativeCommandContext(StatementContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ClearCacheContext extends StatementContext {
		public TerminalNode CLEAR() { return getToken(SqlBaseParser.CLEAR, 0); }
		public TerminalNode CACHE() { return getToken(SqlBaseParser.CACHE, 0); }
		public ClearCacheContext(StatementContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ShowTablesContext extends StatementContext {
		public IdentifierContext db;
		public Token pattern;
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode TABLES() { return getToken(SqlBaseParser.TABLES, 0); }
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public TerminalNode IN() { return getToken(SqlBaseParser.IN, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public TerminalNode LIKE() { return getToken(SqlBaseParser.LIKE, 0); }
		public ShowTablesContext(StatementContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RecoverPartitionsContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode RECOVER() { return getToken(SqlBaseParser.RECOVER, 0); }
		public TerminalNode PARTITIONS() { return getToken(SqlBaseParser.PARTITIONS, 0); }
		public RecoverPartitionsContext(StatementContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RenameTablePartitionContext extends StatementContext {
		public PartitionSpecContext from;
		public PartitionSpecContext to;
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode RENAME() { return getToken(SqlBaseParser.RENAME, 0); }
		public TerminalNode TO() { return getToken(SqlBaseParser.TO, 0); }
		public List<PartitionSpecContext> partitionSpec() {
			return getRuleContexts(PartitionSpecContext.class);
		}
		public PartitionSpecContext partitionSpec(int i) {
			return getRuleContext(PartitionSpecContext.class,i);
		}
		public RenameTablePartitionContext(StatementContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RepairTableContext extends StatementContext {
		public TerminalNode MSCK() { return getToken(SqlBaseParser.MSCK, 0); }
		public TerminalNode REPAIR() { return getToken(SqlBaseParser.REPAIR, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public RepairTableContext(StatementContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RefreshResourceContext extends StatementContext {
		public TerminalNode REFRESH() { return getToken(SqlBaseParser.REFRESH, 0); }
		public RefreshResourceContext(StatementContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ShowCreateTableContext extends StatementContext {
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public ShowCreateTableContext(StatementContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ShowColumnsContext extends StatementContext {
		public IdentifierContext db;
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode COLUMNS() { return getToken(SqlBaseParser.COLUMNS, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public List<TerminalNode> FROM() { return getTokens(SqlBaseParser.FROM); }
		public TerminalNode FROM(int i) {
			return getToken(SqlBaseParser.FROM, i);
		}
		public List<TerminalNode> IN() { return getTokens(SqlBaseParser.IN); }
		public TerminalNode IN(int i) {
			return getToken(SqlBaseParser.IN, i);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ShowColumnsContext(StatementContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AddTablePartitionContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode ADD() { return getToken(SqlBaseParser.ADD, 0); }
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public List<PartitionSpecLocationContext> partitionSpecLocation() {
			return getRuleContexts(PartitionSpecLocationContext.class);
		}
		public PartitionSpecLocationContext partitionSpecLocation(int i) {
			return getRuleContext(PartitionSpecLocationContext.class,i);
		}
		public TerminalNode VIEW() { return getToken(SqlBaseParser.VIEW, 0); }
		public List<PartitionSpecContext> partitionSpec() {
			return getRuleContexts(PartitionSpecContext.class);
		}
		public PartitionSpecContext partitionSpec(int i) {
			return getRuleContext(PartitionSpecContext.class,i);
		}
		public AddTablePartitionContext(StatementContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RefreshTableContext extends StatementContext {
		public TerminalNode REFRESH() { return getToken(SqlBaseParser.REFRESH, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public RefreshTableContext(StatementContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ManageResourceContext extends StatementContext {
		public Token op;
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode ADD() { return getToken(SqlBaseParser.ADD, 0); }
		public TerminalNode LIST() { return getToken(SqlBaseParser.LIST, 0); }
		public ManageResourceContext(StatementContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CreateDatabaseContext extends StatementContext {
		public Token comment;
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public TerminalNode DATABASE() { return getToken(SqlBaseParser.DATABASE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public TerminalNode COMMENT() { return getToken(SqlBaseParser.COMMENT, 0); }
		public LocationSpecContext locationSpec() {
			return getRuleContext(LocationSpecContext.class,0);
		}
		public TerminalNode WITH() { return getToken(SqlBaseParser.WITH, 0); }
		public TerminalNode DBPROPERTIES() { return getToken(SqlBaseParser.DBPROPERTIES, 0); }
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public CreateDatabaseContext(StatementContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AnalyzeContext extends StatementContext {
		public TerminalNode ANALYZE() { return getToken(SqlBaseParser.ANALYZE, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode COMPUTE() { return getToken(SqlBaseParser.COMPUTE, 0); }
		public TerminalNode STATISTICS() { return getToken(SqlBaseParser.STATISTICS, 0); }
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode FOR() { return getToken(SqlBaseParser.FOR, 0); }
		public TerminalNode COLUMNS() { return getToken(SqlBaseParser.COLUMNS, 0); }
		public IdentifierSeqContext identifierSeq() {
			return getRuleContext(IdentifierSeqContext.class,0);
		}
		public AnalyzeContext(StatementContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CreateHiveTableContext extends StatementContext {
		public ColTypeListContext columns;
		public Token comment;
		public ColTypeListContext partitionColumns;
		public CreateTableHeaderContext createTableHeader() {
			return getRuleContext(CreateTableHeaderContext.class,0);
		}
		public TerminalNode COMMENT() { return getToken(SqlBaseParser.COMMENT, 0); }
		public TerminalNode PARTITIONED() { return getToken(SqlBaseParser.PARTITIONED, 0); }
		public TerminalNode BY() { return getToken(SqlBaseParser.BY, 0); }
		public BucketSpecContext bucketSpec() {
			return getRuleContext(BucketSpecContext.class,0);
		}
		public SkewSpecContext skewSpec() {
			return getRuleContext(SkewSpecContext.class,0);
		}
		public RowFormatContext rowFormat() {
			return getRuleContext(RowFormatContext.class,0);
		}
		public CreateFileFormatContext createFileFormat() {
			return getRuleContext(CreateFileFormatContext.class,0);
		}
		public LocationSpecContext locationSpec() {
			return getRuleContext(LocationSpecContext.class,0);
		}
		public TerminalNode TBLPROPERTIES() { return getToken(SqlBaseParser.TBLPROPERTIES, 0); }
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public List<ColTypeListContext> colTypeList() {
			return getRuleContexts(ColTypeListContext.class);
		}
		public ColTypeListContext colTypeList(int i) {
			return getRuleContext(ColTypeListContext.class,i);
		}
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public CreateHiveTableContext(StatementContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CreateFunctionContext extends StatementContext {
		public Token className;
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public TerminalNode FUNCTION() { return getToken(SqlBaseParser.FUNCTION, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public TerminalNode TEMPORARY() { return getToken(SqlBaseParser.TEMPORARY, 0); }
		public TerminalNode USING() { return getToken(SqlBaseParser.USING, 0); }
		public List<ResourceContext> resource() {
			return getRuleContexts(ResourceContext.class);
		}
		public ResourceContext resource(int i) {
			return getRuleContext(ResourceContext.class,i);
		}
		public CreateFunctionContext(StatementContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ShowTableContext extends StatementContext {
		public IdentifierContext db;
		public Token pattern;
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TerminalNode EXTENDED() { return getToken(SqlBaseParser.EXTENDED, 0); }
		public TerminalNode LIKE() { return getToken(SqlBaseParser.LIKE, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public TerminalNode IN() { return getToken(SqlBaseParser.IN, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ShowTableContext(StatementContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SetDatabasePropertiesContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode DATABASE() { return getToken(SqlBaseParser.DATABASE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode SET() { return getToken(SqlBaseParser.SET, 0); }
		public TerminalNode DBPROPERTIES() { return getToken(SqlBaseParser.DBPROPERTIES, 0); }
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public SetDatabasePropertiesContext(StatementContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CreateTableContext extends StatementContext {
		public TablePropertyListContext options;
		public IdentifierListContext partitionColumnNames;
		public Token comment;
		public CreateTableHeaderContext createTableHeader() {
			return getRuleContext(CreateTableHeaderContext.class,0);
		}
		public TableProviderContext tableProvider() {
			return getRuleContext(TableProviderContext.class,0);
		}
		public ColTypeListContext colTypeList() {
			return getRuleContext(ColTypeListContext.class,0);
		}
		public TerminalNode OPTIONS() { return getToken(SqlBaseParser.OPTIONS, 0); }
		public TerminalNode PARTITIONED() { return getToken(SqlBaseParser.PARTITIONED, 0); }
		public TerminalNode BY() { return getToken(SqlBaseParser.BY, 0); }
		public BucketSpecContext bucketSpec() {
			return getRuleContext(BucketSpecContext.class,0);
		}
		public LocationSpecContext locationSpec() {
			return getRuleContext(LocationSpecContext.class,0);
		}
		public TerminalNode COMMENT() { return getToken(SqlBaseParser.COMMENT, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public CreateTableContext(StatementContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DescribeTableContext extends StatementContext {
		public Token option;
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode DESC() { return getToken(SqlBaseParser.DESC, 0); }
		public TerminalNode DESCRIBE() { return getToken(SqlBaseParser.DESCRIBE, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public DescribeColNameContext describeColName() {
			return getRuleContext(DescribeColNameContext.class,0);
		}
		public TerminalNode EXTENDED() { return getToken(SqlBaseParser.EXTENDED, 0); }
		public TerminalNode FORMATTED() { return getToken(SqlBaseParser.FORMATTED, 0); }
		public DescribeTableContext(StatementContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CreateTableLikeContext extends StatementContext {
		public TableIdentifierContext target;
		public TableIdentifierContext source;
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TerminalNode LIKE() { return getToken(SqlBaseParser.LIKE, 0); }
		public List<TableIdentifierContext> tableIdentifier() {
			return getRuleContexts(TableIdentifierContext.class);
		}
		public TableIdentifierContext tableIdentifier(int i) {
			return getRuleContext(TableIdentifierContext.class,i);
		}
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public LocationSpecContext locationSpec() {
			return getRuleContext(LocationSpecContext.class,0);
		}
		public CreateTableLikeContext(StatementContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UncacheTableContext extends StatementContext {
		public TerminalNode UNCACHE() { return getToken(SqlBaseParser.UNCACHE, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public UncacheTableContext(StatementContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DropFunctionContext extends StatementContext {
		public TerminalNode DROP() { return getToken(SqlBaseParser.DROP, 0); }
		public TerminalNode FUNCTION() { return getToken(SqlBaseParser.FUNCTION, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode TEMPORARY() { return getToken(SqlBaseParser.TEMPORARY, 0); }
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public DropFunctionContext(StatementContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LoadDataContext extends StatementContext {
		public Token path;
		public TerminalNode LOAD() { return getToken(SqlBaseParser.LOAD, 0); }
		public TerminalNode DATA() { return getToken(SqlBaseParser.DATA, 0); }
		public TerminalNode INPATH() { return getToken(SqlBaseParser.INPATH, 0); }
		public TerminalNode INTO() { return getToken(SqlBaseParser.INTO, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public TerminalNode LOCAL() { return getToken(SqlBaseParser.LOCAL, 0); }
		public TerminalNode OVERWRITE() { return getToken(SqlBaseParser.OVERWRITE, 0); }
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public LoadDataContext(StatementContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ShowPartitionsContext extends StatementContext {
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode PARTITIONS() { return getToken(SqlBaseParser.PARTITIONS, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public ShowPartitionsContext(StatementContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DescribeFunctionContext extends StatementContext {
		public TerminalNode FUNCTION() { return getToken(SqlBaseParser.FUNCTION, 0); }
		public DescribeFuncNameContext describeFuncName() {
			return getRuleContext(DescribeFuncNameContext.class,0);
		}
		public TerminalNode DESC() { return getToken(SqlBaseParser.DESC, 0); }
		public TerminalNode DESCRIBE() { return getToken(SqlBaseParser.DESCRIBE, 0); }
		public TerminalNode EXTENDED() { return getToken(SqlBaseParser.EXTENDED, 0); }
		public DescribeFunctionContext(StatementContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ChangeColumnContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode CHANGE() { return getToken(SqlBaseParser.CHANGE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ColTypeContext colType() {
			return getRuleContext(ColTypeContext.class,0);
		}
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public TerminalNode COLUMN() { return getToken(SqlBaseParser.COLUMN, 0); }
		public ColPositionContext colPosition() {
			return getRuleContext(ColPositionContext.class,0);
		}
		public ChangeColumnContext(StatementContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StatementDefaultContext extends StatementContext {
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public StatementDefaultContext(StatementContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TruncateTableContext extends StatementContext {
		public TerminalNode TRUNCATE() { return getToken(SqlBaseParser.TRUNCATE, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public TruncateTableContext(StatementContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SetTableSerDeContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode SET() { return getToken(SqlBaseParser.SET, 0); }
		public TerminalNode SERDE() { return getToken(SqlBaseParser.SERDE, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public TerminalNode WITH() { return getToken(SqlBaseParser.WITH, 0); }
		public TerminalNode SERDEPROPERTIES() { return getToken(SqlBaseParser.SERDEPROPERTIES, 0); }
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public SetTableSerDeContext(StatementContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CreateViewContext extends StatementContext {
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public TerminalNode VIEW() { return getToken(SqlBaseParser.VIEW, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode OR() { return getToken(SqlBaseParser.OR, 0); }
		public TerminalNode REPLACE() { return getToken(SqlBaseParser.REPLACE, 0); }
		public TerminalNode TEMPORARY() { return getToken(SqlBaseParser.TEMPORARY, 0); }
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public IdentifierCommentListContext identifierCommentList() {
			return getRuleContext(IdentifierCommentListContext.class,0);
		}
		public TerminalNode COMMENT() { return getToken(SqlBaseParser.COMMENT, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public TerminalNode PARTITIONED() { return getToken(SqlBaseParser.PARTITIONED, 0); }
		public TerminalNode ON() { return getToken(SqlBaseParser.ON, 0); }
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode TBLPROPERTIES() { return getToken(SqlBaseParser.TBLPROPERTIES, 0); }
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public TerminalNode GLOBAL() { return getToken(SqlBaseParser.GLOBAL, 0); }
		public CreateViewContext(StatementContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DropTablePartitionsContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode DROP() { return getToken(SqlBaseParser.DROP, 0); }
		public List<PartitionSpecContext> partitionSpec() {
			return getRuleContexts(PartitionSpecContext.class);
		}
		public PartitionSpecContext partitionSpec(int i) {
			return getRuleContext(PartitionSpecContext.class,i);
		}
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public TerminalNode PURGE() { return getToken(SqlBaseParser.PURGE, 0); }
		public TerminalNode VIEW() { return getToken(SqlBaseParser.VIEW, 0); }
		public DropTablePartitionsContext(StatementContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SetConfigurationContext extends StatementContext {
		public TerminalNode SET() { return getToken(SqlBaseParser.SET, 0); }
		public SetConfigurationContext(StatementContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DropTableContext extends StatementContext {
		public TerminalNode DROP() { return getToken(SqlBaseParser.DROP, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public TerminalNode PURGE() { return getToken(SqlBaseParser.PURGE, 0); }
		public TerminalNode VIEW() { return getToken(SqlBaseParser.VIEW, 0); }
		public DropTableContext(StatementContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ShowDatabasesContext extends StatementContext {
		public Token pattern;
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode DATABASES() { return getToken(SqlBaseParser.DATABASES, 0); }
		public TerminalNode LIKE() { return getToken(SqlBaseParser.LIKE, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public ShowDatabasesContext(StatementContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ShowTblPropertiesContext extends StatementContext {
		public TableIdentifierContext table;
		public TablePropertyKeyContext key;
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode TBLPROPERTIES() { return getToken(SqlBaseParser.TBLPROPERTIES, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TablePropertyKeyContext tablePropertyKey() {
			return getRuleContext(TablePropertyKeyContext.class,0);
		}
		public ShowTblPropertiesContext(StatementContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UnsetTablePropertiesContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode UNSET() { return getToken(SqlBaseParser.UNSET, 0); }
		public TerminalNode TBLPROPERTIES() { return getToken(SqlBaseParser.TBLPROPERTIES, 0); }
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TerminalNode VIEW() { return getToken(SqlBaseParser.VIEW, 0); }
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public UnsetTablePropertiesContext(StatementContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SetTableLocationContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode SET() { return getToken(SqlBaseParser.SET, 0); }
		public LocationSpecContext locationSpec() {
			return getRuleContext(LocationSpecContext.class,0);
		}
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public SetTableLocationContext(StatementContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ShowFunctionsContext extends StatementContext {
		public Token pattern;
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode FUNCTIONS() { return getToken(SqlBaseParser.FUNCTIONS, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode LIKE() { return getToken(SqlBaseParser.LIKE, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public ShowFunctionsContext(StatementContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CacheTableContext extends StatementContext {
		public TerminalNode CACHE() { return getToken(SqlBaseParser.CACHE, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode LAZY() { return getToken(SqlBaseParser.LAZY, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public CacheTableContext(StatementContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AddTableColumnsContext extends StatementContext {
		public ColTypeListContext columns;
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode ADD() { return getToken(SqlBaseParser.ADD, 0); }
		public TerminalNode COLUMNS() { return getToken(SqlBaseParser.COLUMNS, 0); }
		public ColTypeListContext colTypeList() {
			return getRuleContext(ColTypeListContext.class,0);
		}
		public AddTableColumnsContext(StatementContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SetTablePropertiesContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode SET() { return getToken(SqlBaseParser.SET, 0); }
		public TerminalNode TBLPROPERTIES() { return getToken(SqlBaseParser.TBLPROPERTIES, 0); }
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TerminalNode VIEW() { return getToken(SqlBaseParser.VIEW, 0); }
		public SetTablePropertiesContext(StatementContext ctx) { copyFrom(ctx); }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_statement);
		int _la;
		try {
			int _alt;
			setState(817);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
			case 1:
				_localctx = new StatementDefaultContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(211);
				query();
				}
				break;
			case 2:
				_localctx = new UseContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(212);
				match(USE);
				setState(213);
				((UseContext)_localctx).db = identifier();
				}
				break;
			case 3:
				_localctx = new CreateDatabaseContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(214);
				match(CREATE);
				setState(215);
				match(DATABASE);
				setState(219);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(216);
					match(IF);
					setState(217);
					match(NOT);
					setState(218);
					match(EXISTS);
					}
					break;
				}
				setState(221);
				identifier();
				setState(224);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(222);
					match(COMMENT);
					setState(223);
					((CreateDatabaseContext)_localctx).comment = match(STRING);
					}
				}

				setState(227);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LOCATION) {
					{
					setState(226);
					locationSpec();
					}
				}

				setState(232);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(229);
					match(WITH);
					setState(230);
					match(DBPROPERTIES);
					setState(231);
					tablePropertyList();
					}
				}

				}
				break;
			case 4:
				_localctx = new SetDatabasePropertiesContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(234);
				match(ALTER);
				setState(235);
				match(DATABASE);
				setState(236);
				identifier();
				setState(237);
				match(SET);
				setState(238);
				match(DBPROPERTIES);
				setState(239);
				tablePropertyList();
				}
				break;
			case 5:
				_localctx = new DropDatabaseContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(241);
				match(DROP);
				setState(242);
				match(DATABASE);
				setState(245);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(243);
					match(IF);
					setState(244);
					match(EXISTS);
					}
					break;
				}
				setState(247);
				identifier();
				setState(249);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CASCADE || _la==RESTRICT) {
					{
					setState(248);
					_la = _input.LA(1);
					if ( !(_la==CASCADE || _la==RESTRICT) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				}
				break;
			case 6:
				_localctx = new CreateTableContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(251);
				createTableHeader();
				setState(256);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(252);
					match(T__0);
					setState(253);
					colTypeList();
					setState(254);
					match(T__1);
					}
				}

				setState(258);
				tableProvider();
				setState(261);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPTIONS) {
					{
					setState(259);
					match(OPTIONS);
					setState(260);
					((CreateTableContext)_localctx).options = tablePropertyList();
					}
				}

				setState(266);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITIONED) {
					{
					setState(263);
					match(PARTITIONED);
					setState(264);
					match(BY);
					setState(265);
					((CreateTableContext)_localctx).partitionColumnNames = identifierList();
					}
				}

				setState(269);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CLUSTERED) {
					{
					setState(268);
					bucketSpec();
					}
				}

				setState(272);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LOCATION) {
					{
					setState(271);
					locationSpec();
					}
				}

				setState(276);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(274);
					match(COMMENT);
					setState(275);
					((CreateTableContext)_localctx).comment = match(STRING);
					}
				}

				setState(282);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 11266L) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & 17179869259L) != 0) || _la==REDUCE) {
					{
					setState(279);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(278);
						match(AS);
						}
					}

					setState(281);
					query();
					}
				}

				}
				break;
			case 7:
				_localctx = new CreateHiveTableContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(284);
				createTableHeader();
				setState(289);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(285);
					match(T__0);
					setState(286);
					((CreateHiveTableContext)_localctx).columns = colTypeList();
					setState(287);
					match(T__1);
					}
					break;
				}
				setState(293);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(291);
					match(COMMENT);
					setState(292);
					((CreateHiveTableContext)_localctx).comment = match(STRING);
					}
				}

				setState(301);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITIONED) {
					{
					setState(295);
					match(PARTITIONED);
					setState(296);
					match(BY);
					setState(297);
					match(T__0);
					setState(298);
					((CreateHiveTableContext)_localctx).partitionColumns = colTypeList();
					setState(299);
					match(T__1);
					}
				}

				setState(304);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CLUSTERED) {
					{
					setState(303);
					bucketSpec();
					}
				}

				setState(307);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SKEWED) {
					{
					setState(306);
					skewSpec();
					}
				}

				setState(310);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ROW) {
					{
					setState(309);
					rowFormat();
					}
				}

				setState(313);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STORED) {
					{
					setState(312);
					createFileFormat();
					}
				}

				setState(316);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LOCATION) {
					{
					setState(315);
					locationSpec();
					}
				}

				setState(320);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TBLPROPERTIES) {
					{
					setState(318);
					match(TBLPROPERTIES);
					setState(319);
					tablePropertyList();
					}
				}

				setState(326);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 11266L) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & 17179869259L) != 0) || _la==REDUCE) {
					{
					setState(323);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(322);
						match(AS);
						}
					}

					setState(325);
					query();
					}
				}

				}
				break;
			case 8:
				_localctx = new CreateTableLikeContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(328);
				match(CREATE);
				setState(329);
				match(TABLE);
				setState(333);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
				case 1:
					{
					setState(330);
					match(IF);
					setState(331);
					match(NOT);
					setState(332);
					match(EXISTS);
					}
					break;
				}
				setState(335);
				((CreateTableLikeContext)_localctx).target = tableIdentifier();
				setState(336);
				match(LIKE);
				setState(337);
				((CreateTableLikeContext)_localctx).source = tableIdentifier();
				setState(339);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LOCATION) {
					{
					setState(338);
					locationSpec();
					}
				}

				}
				break;
			case 9:
				_localctx = new AnalyzeContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(341);
				match(ANALYZE);
				setState(342);
				match(TABLE);
				setState(343);
				tableIdentifier();
				setState(345);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(344);
					partitionSpec();
					}
				}

				setState(347);
				match(COMPUTE);
				setState(348);
				match(STATISTICS);
				setState(353);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
				case 1:
					{
					setState(349);
					identifier();
					}
					break;
				case 2:
					{
					setState(350);
					match(FOR);
					setState(351);
					match(COLUMNS);
					setState(352);
					identifierSeq();
					}
					break;
				}
				}
				break;
			case 10:
				_localctx = new AddTableColumnsContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(355);
				match(ALTER);
				setState(356);
				match(TABLE);
				setState(357);
				tableIdentifier();
				setState(358);
				match(ADD);
				setState(359);
				match(COLUMNS);
				setState(360);
				match(T__0);
				setState(361);
				((AddTableColumnsContext)_localctx).columns = colTypeList();
				setState(362);
				match(T__1);
				}
				break;
			case 11:
				_localctx = new RenameTableContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(364);
				match(ALTER);
				setState(365);
				_la = _input.LA(1);
				if ( !(_la==TABLE || _la==VIEW) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(366);
				((RenameTableContext)_localctx).from = tableIdentifier();
				setState(367);
				match(RENAME);
				setState(368);
				match(TO);
				setState(369);
				((RenameTableContext)_localctx).to = tableIdentifier();
				}
				break;
			case 12:
				_localctx = new SetTablePropertiesContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(371);
				match(ALTER);
				setState(372);
				_la = _input.LA(1);
				if ( !(_la==TABLE || _la==VIEW) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(373);
				tableIdentifier();
				setState(374);
				match(SET);
				setState(375);
				match(TBLPROPERTIES);
				setState(376);
				tablePropertyList();
				}
				break;
			case 13:
				_localctx = new UnsetTablePropertiesContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(378);
				match(ALTER);
				setState(379);
				_la = _input.LA(1);
				if ( !(_la==TABLE || _la==VIEW) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(380);
				tableIdentifier();
				setState(381);
				match(UNSET);
				setState(382);
				match(TBLPROPERTIES);
				setState(385);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IF) {
					{
					setState(383);
					match(IF);
					setState(384);
					match(EXISTS);
					}
				}

				setState(387);
				tablePropertyList();
				}
				break;
			case 14:
				_localctx = new ChangeColumnContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(389);
				match(ALTER);
				setState(390);
				match(TABLE);
				setState(391);
				tableIdentifier();
				setState(393);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(392);
					partitionSpec();
					}
				}

				setState(395);
				match(CHANGE);
				setState(397);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
				case 1:
					{
					setState(396);
					match(COLUMN);
					}
					break;
				}
				setState(399);
				identifier();
				setState(400);
				colType();
				setState(402);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FIRST || _la==AFTER) {
					{
					setState(401);
					colPosition();
					}
				}

				}
				break;
			case 15:
				_localctx = new SetTableSerDeContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(404);
				match(ALTER);
				setState(405);
				match(TABLE);
				setState(406);
				tableIdentifier();
				setState(408);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(407);
					partitionSpec();
					}
				}

				setState(410);
				match(SET);
				setState(411);
				match(SERDE);
				setState(412);
				match(STRING);
				setState(416);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(413);
					match(WITH);
					setState(414);
					match(SERDEPROPERTIES);
					setState(415);
					tablePropertyList();
					}
				}

				}
				break;
			case 16:
				_localctx = new SetTableSerDeContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(418);
				match(ALTER);
				setState(419);
				match(TABLE);
				setState(420);
				tableIdentifier();
				setState(422);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(421);
					partitionSpec();
					}
				}

				setState(424);
				match(SET);
				setState(425);
				match(SERDEPROPERTIES);
				setState(426);
				tablePropertyList();
				}
				break;
			case 17:
				_localctx = new AddTablePartitionContext(_localctx);
				enterOuterAlt(_localctx, 17);
				{
				setState(428);
				match(ALTER);
				setState(429);
				match(TABLE);
				setState(430);
				tableIdentifier();
				setState(431);
				match(ADD);
				setState(435);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IF) {
					{
					setState(432);
					match(IF);
					setState(433);
					match(NOT);
					setState(434);
					match(EXISTS);
					}
				}

				setState(438); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(437);
					partitionSpecLocation();
					}
					}
					setState(440); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==PARTITION );
				}
				break;
			case 18:
				_localctx = new AddTablePartitionContext(_localctx);
				enterOuterAlt(_localctx, 18);
				{
				setState(442);
				match(ALTER);
				setState(443);
				match(VIEW);
				setState(444);
				tableIdentifier();
				setState(445);
				match(ADD);
				setState(449);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IF) {
					{
					setState(446);
					match(IF);
					setState(447);
					match(NOT);
					setState(448);
					match(EXISTS);
					}
				}

				setState(452); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(451);
					partitionSpec();
					}
					}
					setState(454); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==PARTITION );
				}
				break;
			case 19:
				_localctx = new RenameTablePartitionContext(_localctx);
				enterOuterAlt(_localctx, 19);
				{
				setState(456);
				match(ALTER);
				setState(457);
				match(TABLE);
				setState(458);
				tableIdentifier();
				setState(459);
				((RenameTablePartitionContext)_localctx).from = partitionSpec();
				setState(460);
				match(RENAME);
				setState(461);
				match(TO);
				setState(462);
				((RenameTablePartitionContext)_localctx).to = partitionSpec();
				}
				break;
			case 20:
				_localctx = new DropTablePartitionsContext(_localctx);
				enterOuterAlt(_localctx, 20);
				{
				setState(464);
				match(ALTER);
				setState(465);
				match(TABLE);
				setState(466);
				tableIdentifier();
				setState(467);
				match(DROP);
				setState(470);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IF) {
					{
					setState(468);
					match(IF);
					setState(469);
					match(EXISTS);
					}
				}

				setState(472);
				partitionSpec();
				setState(477);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(473);
					match(T__2);
					setState(474);
					partitionSpec();
					}
					}
					setState(479);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(481);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PURGE) {
					{
					setState(480);
					match(PURGE);
					}
				}

				}
				break;
			case 21:
				_localctx = new DropTablePartitionsContext(_localctx);
				enterOuterAlt(_localctx, 21);
				{
				setState(483);
				match(ALTER);
				setState(484);
				match(VIEW);
				setState(485);
				tableIdentifier();
				setState(486);
				match(DROP);
				setState(489);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IF) {
					{
					setState(487);
					match(IF);
					setState(488);
					match(EXISTS);
					}
				}

				setState(491);
				partitionSpec();
				setState(496);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(492);
					match(T__2);
					setState(493);
					partitionSpec();
					}
					}
					setState(498);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 22:
				_localctx = new SetTableLocationContext(_localctx);
				enterOuterAlt(_localctx, 22);
				{
				setState(499);
				match(ALTER);
				setState(500);
				match(TABLE);
				setState(501);
				tableIdentifier();
				setState(503);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(502);
					partitionSpec();
					}
				}

				setState(505);
				match(SET);
				setState(506);
				locationSpec();
				}
				break;
			case 23:
				_localctx = new RecoverPartitionsContext(_localctx);
				enterOuterAlt(_localctx, 23);
				{
				setState(508);
				match(ALTER);
				setState(509);
				match(TABLE);
				setState(510);
				tableIdentifier();
				setState(511);
				match(RECOVER);
				setState(512);
				match(PARTITIONS);
				}
				break;
			case 24:
				_localctx = new DropTableContext(_localctx);
				enterOuterAlt(_localctx, 24);
				{
				setState(514);
				match(DROP);
				setState(515);
				match(TABLE);
				setState(518);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
				case 1:
					{
					setState(516);
					match(IF);
					setState(517);
					match(EXISTS);
					}
					break;
				}
				setState(520);
				tableIdentifier();
				setState(522);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PURGE) {
					{
					setState(521);
					match(PURGE);
					}
				}

				}
				break;
			case 25:
				_localctx = new DropTableContext(_localctx);
				enterOuterAlt(_localctx, 25);
				{
				setState(524);
				match(DROP);
				setState(525);
				match(VIEW);
				setState(528);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
				case 1:
					{
					setState(526);
					match(IF);
					setState(527);
					match(EXISTS);
					}
					break;
				}
				setState(530);
				tableIdentifier();
				}
				break;
			case 26:
				_localctx = new CreateViewContext(_localctx);
				enterOuterAlt(_localctx, 26);
				{
				setState(531);
				match(CREATE);
				setState(534);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OR) {
					{
					setState(532);
					match(OR);
					setState(533);
					match(REPLACE);
					}
				}

				setState(540);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==GLOBAL || _la==TEMPORARY) {
					{
					setState(537);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==GLOBAL) {
						{
						setState(536);
						match(GLOBAL);
						}
					}

					setState(539);
					match(TEMPORARY);
					}
				}

				setState(542);
				match(VIEW);
				setState(546);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
				case 1:
					{
					setState(543);
					match(IF);
					setState(544);
					match(NOT);
					setState(545);
					match(EXISTS);
					}
					break;
				}
				setState(548);
				tableIdentifier();
				setState(550);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(549);
					identifierCommentList();
					}
				}

				setState(554);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(552);
					match(COMMENT);
					setState(553);
					match(STRING);
					}
				}

				setState(559);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITIONED) {
					{
					setState(556);
					match(PARTITIONED);
					setState(557);
					match(ON);
					setState(558);
					identifierList();
					}
				}

				setState(563);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TBLPROPERTIES) {
					{
					setState(561);
					match(TBLPROPERTIES);
					setState(562);
					tablePropertyList();
					}
				}

				setState(565);
				match(AS);
				setState(566);
				query();
				}
				break;
			case 27:
				_localctx = new CreateTempViewUsingContext(_localctx);
				enterOuterAlt(_localctx, 27);
				{
				setState(568);
				match(CREATE);
				setState(571);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OR) {
					{
					setState(569);
					match(OR);
					setState(570);
					match(REPLACE);
					}
				}

				setState(574);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==GLOBAL) {
					{
					setState(573);
					match(GLOBAL);
					}
				}

				setState(576);
				match(TEMPORARY);
				setState(577);
				match(VIEW);
				setState(578);
				tableIdentifier();
				setState(583);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(579);
					match(T__0);
					setState(580);
					colTypeList();
					setState(581);
					match(T__1);
					}
				}

				setState(585);
				tableProvider();
				setState(588);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPTIONS) {
					{
					setState(586);
					match(OPTIONS);
					setState(587);
					tablePropertyList();
					}
				}

				}
				break;
			case 28:
				_localctx = new AlterViewQueryContext(_localctx);
				enterOuterAlt(_localctx, 28);
				{
				setState(590);
				match(ALTER);
				setState(591);
				match(VIEW);
				setState(592);
				tableIdentifier();
				setState(594);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(593);
					match(AS);
					}
				}

				setState(596);
				query();
				}
				break;
			case 29:
				_localctx = new CreateFunctionContext(_localctx);
				enterOuterAlt(_localctx, 29);
				{
				setState(598);
				match(CREATE);
				setState(600);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TEMPORARY) {
					{
					setState(599);
					match(TEMPORARY);
					}
				}

				setState(602);
				match(FUNCTION);
				setState(603);
				qualifiedName();
				setState(604);
				match(AS);
				setState(605);
				((CreateFunctionContext)_localctx).className = match(STRING);
				setState(615);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==USING) {
					{
					setState(606);
					match(USING);
					setState(607);
					resource();
					setState(612);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__2) {
						{
						{
						setState(608);
						match(T__2);
						setState(609);
						resource();
						}
						}
						setState(614);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				}
				break;
			case 30:
				_localctx = new DropFunctionContext(_localctx);
				enterOuterAlt(_localctx, 30);
				{
				setState(617);
				match(DROP);
				setState(619);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TEMPORARY) {
					{
					setState(618);
					match(TEMPORARY);
					}
				}

				setState(621);
				match(FUNCTION);
				setState(624);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
				case 1:
					{
					setState(622);
					match(IF);
					setState(623);
					match(EXISTS);
					}
					break;
				}
				setState(626);
				qualifiedName();
				}
				break;
			case 31:
				_localctx = new ExplainContext(_localctx);
				enterOuterAlt(_localctx, 31);
				{
				setState(627);
				match(EXPLAIN);
				setState(629);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 86)) & ~0x3f) == 0 && ((1L << (_la - 86)) & 7L) != 0) || _la==EXTENDED || _la==FORMATTED) {
					{
					setState(628);
					_la = _input.LA(1);
					if ( !(((((_la - 86)) & ~0x3f) == 0 && ((1L << (_la - 86)) & 7L) != 0) || _la==EXTENDED || _la==FORMATTED) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(631);
				statement();
				}
				break;
			case 32:
				_localctx = new ShowTablesContext(_localctx);
				enterOuterAlt(_localctx, 32);
				{
				setState(632);
				match(SHOW);
				setState(633);
				match(TABLES);
				setState(636);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FROM || _la==IN) {
					{
					setState(634);
					_la = _input.LA(1);
					if ( !(_la==FROM || _la==IN) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(635);
					((ShowTablesContext)_localctx).db = identifier();
					}
				}

				setState(642);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LIKE || _la==STRING) {
					{
					setState(639);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LIKE) {
						{
						setState(638);
						match(LIKE);
						}
					}

					setState(641);
					((ShowTablesContext)_localctx).pattern = match(STRING);
					}
				}

				}
				break;
			case 33:
				_localctx = new ShowTableContext(_localctx);
				enterOuterAlt(_localctx, 33);
				{
				setState(644);
				match(SHOW);
				setState(645);
				match(TABLE);
				setState(646);
				match(EXTENDED);
				setState(649);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FROM || _la==IN) {
					{
					setState(647);
					_la = _input.LA(1);
					if ( !(_la==FROM || _la==IN) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(648);
					((ShowTableContext)_localctx).db = identifier();
					}
				}

				setState(651);
				match(LIKE);
				setState(652);
				((ShowTableContext)_localctx).pattern = match(STRING);
				setState(654);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(653);
					partitionSpec();
					}
				}

				}
				break;
			case 34:
				_localctx = new ShowDatabasesContext(_localctx);
				enterOuterAlt(_localctx, 34);
				{
				setState(656);
				match(SHOW);
				setState(657);
				match(DATABASES);
				setState(660);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LIKE) {
					{
					setState(658);
					match(LIKE);
					setState(659);
					((ShowDatabasesContext)_localctx).pattern = match(STRING);
					}
				}

				}
				break;
			case 35:
				_localctx = new ShowTblPropertiesContext(_localctx);
				enterOuterAlt(_localctx, 35);
				{
				setState(662);
				match(SHOW);
				setState(663);
				match(TBLPROPERTIES);
				setState(664);
				((ShowTblPropertiesContext)_localctx).table = tableIdentifier();
				setState(669);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(665);
					match(T__0);
					setState(666);
					((ShowTblPropertiesContext)_localctx).key = tablePropertyKey();
					setState(667);
					match(T__1);
					}
				}

				}
				break;
			case 36:
				_localctx = new ShowColumnsContext(_localctx);
				enterOuterAlt(_localctx, 36);
				{
				setState(671);
				match(SHOW);
				setState(672);
				match(COLUMNS);
				setState(673);
				_la = _input.LA(1);
				if ( !(_la==FROM || _la==IN) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(674);
				tableIdentifier();
				setState(677);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FROM || _la==IN) {
					{
					setState(675);
					_la = _input.LA(1);
					if ( !(_la==FROM || _la==IN) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(676);
					((ShowColumnsContext)_localctx).db = identifier();
					}
				}

				}
				break;
			case 37:
				_localctx = new ShowPartitionsContext(_localctx);
				enterOuterAlt(_localctx, 37);
				{
				setState(679);
				match(SHOW);
				setState(680);
				match(PARTITIONS);
				setState(681);
				tableIdentifier();
				setState(683);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(682);
					partitionSpec();
					}
				}

				}
				break;
			case 38:
				_localctx = new ShowFunctionsContext(_localctx);
				enterOuterAlt(_localctx, 38);
				{
				setState(685);
				match(SHOW);
				setState(687);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
				case 1:
					{
					setState(686);
					identifier();
					}
					break;
				}
				setState(689);
				match(FUNCTIONS);
				setState(697);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -1024L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 720575940379279359L) != 0) || ((((_la - 137)) & ~0x3f) == 0 && ((1L << (_la - 137)) & -31L) != 0) || ((((_la - 201)) & ~0x3f) == 0 && ((1L << (_la - 201)) & 6605659701247L) != 0)) {
					{
					setState(691);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
					case 1:
						{
						setState(690);
						match(LIKE);
						}
						break;
					}
					setState(695);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case SELECT:
					case FROM:
					case ADD:
					case AS:
					case ALL:
					case DISTINCT:
					case WHERE:
					case GROUP:
					case BY:
					case GROUPING:
					case SETS:
					case CUBE:
					case ROLLUP:
					case ORDER:
					case HAVING:
					case LIMIT:
					case AT:
					case OR:
					case AND:
					case IN:
					case NOT:
					case NO:
					case EXISTS:
					case BETWEEN:
					case LIKE:
					case RLIKE:
					case IS:
					case NULL:
					case TRUE:
					case FALSE:
					case NULLS:
					case ASC:
					case DESC:
					case FOR:
					case INTERVAL:
					case CASE:
					case WHEN:
					case THEN:
					case ELSE:
					case END:
					case JOIN:
					case CROSS:
					case OUTER:
					case INNER:
					case LEFT:
					case SEMI:
					case RIGHT:
					case FULL:
					case NATURAL:
					case ON:
					case LATERAL:
					case WINDOW:
					case OVER:
					case PARTITION:
					case RANGE:
					case ROWS:
					case UNBOUNDED:
					case PRECEDING:
					case FOLLOWING:
					case CURRENT:
					case FIRST:
					case AFTER:
					case LAST:
					case ROW:
					case WITH:
					case VALUES:
					case CREATE:
					case TABLE:
					case VIEW:
					case REPLACE:
					case INSERT:
					case DELETE:
					case INTO:
					case DESCRIBE:
					case EXPLAIN:
					case FORMAT:
					case LOGICAL:
					case CODEGEN:
					case COST:
					case CAST:
					case SHOW:
					case TABLES:
					case COLUMNS:
					case COLUMN:
					case USE:
					case PARTITIONS:
					case FUNCTIONS:
					case DROP:
					case UNION:
					case EXCEPT:
					case SETMINUS:
					case INTERSECT:
					case TO:
					case TABLESAMPLE:
					case STRATIFY:
					case ALTER:
					case RENAME:
					case ARRAY:
					case MAP:
					case STRUCT:
					case COMMENT:
					case SET:
					case RESET:
					case DATA:
					case START:
					case TRANSACTION:
					case COMMIT:
					case ROLLBACK:
					case MACRO:
					case IGNORE:
					case KNN:
					case IF:
					case DIV:
					case PERCENTLIT:
					case BUCKET:
					case OUT:
					case OF:
					case SORT:
					case CLUSTER:
					case DISTRIBUTE:
					case OVERWRITE:
					case TRANSFORM:
					case REDUCE:
					case USING:
					case SERDE:
					case SERDEPROPERTIES:
					case RECORDREADER:
					case RECORDWRITER:
					case DELIMITED:
					case FIELDS:
					case TERMINATED:
					case COLLECTION:
					case ITEMS:
					case KEYS:
					case ESCAPED:
					case LINES:
					case SEPARATED:
					case FUNCTION:
					case EXTENDED:
					case REFRESH:
					case CLEAR:
					case CACHE:
					case UNCACHE:
					case LAZY:
					case FORMATTED:
					case GLOBAL:
					case TEMPORARY:
					case OPTIONS:
					case UNSET:
					case TBLPROPERTIES:
					case DBPROPERTIES:
					case BUCKETS:
					case SKEWED:
					case STORED:
					case DIRECTORIES:
					case LOCATION:
					case EXCHANGE:
					case ARCHIVE:
					case UNARCHIVE:
					case FILEFORMAT:
					case TOUCH:
					case COMPACT:
					case CONCATENATE:
					case CHANGE:
					case CASCADE:
					case RESTRICT:
					case CLUSTERED:
					case SORTED:
					case PURGE:
					case INPUTFORMAT:
					case OUTPUTFORMAT:
					case DATABASE:
					case DATABASES:
					case DFS:
					case TRUNCATE:
					case ANALYZE:
					case COMPUTE:
					case LIST:
					case STATISTICS:
					case PARTITIONED:
					case EXTERNAL:
					case DEFINED:
					case REVOKE:
					case GRANT:
					case LOCK:
					case UNLOCK:
					case MSCK:
					case REPAIR:
					case RECOVER:
					case EXPORT:
					case IMPORT:
					case LOAD:
					case ROLE:
					case ROLES:
					case COMPACTIONS:
					case PRINCIPALS:
					case TRANSACTIONS:
					case INDEX:
					case INDEXES:
					case LOCKS:
					case OPTION:
					case ANTI:
					case LOCAL:
					case INPATH:
					case IDENTIFIER:
					case BACKQUOTED_IDENTIFIER:
						{
						setState(693);
						qualifiedName();
						}
						break;
					case STRING:
						{
						setState(694);
						((ShowFunctionsContext)_localctx).pattern = match(STRING);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
				}

				}
				break;
			case 39:
				_localctx = new ShowCreateTableContext(_localctx);
				enterOuterAlt(_localctx, 39);
				{
				setState(699);
				match(SHOW);
				setState(700);
				match(CREATE);
				setState(701);
				match(TABLE);
				setState(702);
				tableIdentifier();
				}
				break;
			case 40:
				_localctx = new DescribeFunctionContext(_localctx);
				enterOuterAlt(_localctx, 40);
				{
				setState(703);
				_la = _input.LA(1);
				if ( !(_la==DESC || _la==DESCRIBE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(704);
				match(FUNCTION);
				setState(706);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
				case 1:
					{
					setState(705);
					match(EXTENDED);
					}
					break;
				}
				setState(708);
				describeFuncName();
				}
				break;
			case 41:
				_localctx = new DescribeDatabaseContext(_localctx);
				enterOuterAlt(_localctx, 41);
				{
				setState(709);
				_la = _input.LA(1);
				if ( !(_la==DESC || _la==DESCRIBE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(710);
				match(DATABASE);
				setState(712);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
				case 1:
					{
					setState(711);
					match(EXTENDED);
					}
					break;
				}
				setState(714);
				identifier();
				}
				break;
			case 42:
				_localctx = new DescribeTableContext(_localctx);
				enterOuterAlt(_localctx, 42);
				{
				setState(715);
				_la = _input.LA(1);
				if ( !(_la==DESC || _la==DESCRIBE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(717);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
				case 1:
					{
					setState(716);
					match(TABLE);
					}
					break;
				}
				setState(720);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
				case 1:
					{
					setState(719);
					((DescribeTableContext)_localctx).option = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==EXTENDED || _la==FORMATTED) ) {
						((DescribeTableContext)_localctx).option = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				}
				setState(722);
				tableIdentifier();
				setState(724);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
				case 1:
					{
					setState(723);
					partitionSpec();
					}
					break;
				}
				setState(727);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -1024L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 720575940379279359L) != 0) || ((((_la - 137)) & ~0x3f) == 0 && ((1L << (_la - 137)) & -31L) != 0) || ((((_la - 201)) & ~0x3f) == 0 && ((1L << (_la - 201)) & 6601364733951L) != 0)) {
					{
					setState(726);
					describeColName();
					}
				}

				}
				break;
			case 43:
				_localctx = new RefreshTableContext(_localctx);
				enterOuterAlt(_localctx, 43);
				{
				setState(729);
				match(REFRESH);
				setState(730);
				match(TABLE);
				setState(731);
				tableIdentifier();
				}
				break;
			case 44:
				_localctx = new RefreshResourceContext(_localctx);
				enterOuterAlt(_localctx, 44);
				{
				setState(732);
				match(REFRESH);
				setState(736);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,87,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(733);
						matchWildcard();
						}
						} 
					}
					setState(738);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,87,_ctx);
				}
				}
				break;
			case 45:
				_localctx = new CacheTableContext(_localctx);
				enterOuterAlt(_localctx, 45);
				{
				setState(739);
				match(CACHE);
				setState(741);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LAZY) {
					{
					setState(740);
					match(LAZY);
					}
				}

				setState(743);
				match(TABLE);
				setState(744);
				tableIdentifier();
				setState(749);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 11266L) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & 17179869259L) != 0) || _la==REDUCE) {
					{
					setState(746);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(745);
						match(AS);
						}
					}

					setState(748);
					query();
					}
				}

				}
				break;
			case 46:
				_localctx = new UncacheTableContext(_localctx);
				enterOuterAlt(_localctx, 46);
				{
				setState(751);
				match(UNCACHE);
				setState(752);
				match(TABLE);
				setState(755);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
				case 1:
					{
					setState(753);
					match(IF);
					setState(754);
					match(EXISTS);
					}
					break;
				}
				setState(757);
				tableIdentifier();
				}
				break;
			case 47:
				_localctx = new ClearCacheContext(_localctx);
				enterOuterAlt(_localctx, 47);
				{
				setState(758);
				match(CLEAR);
				setState(759);
				match(CACHE);
				}
				break;
			case 48:
				_localctx = new LoadDataContext(_localctx);
				enterOuterAlt(_localctx, 48);
				{
				setState(760);
				match(LOAD);
				setState(761);
				match(DATA);
				setState(763);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LOCAL) {
					{
					setState(762);
					match(LOCAL);
					}
				}

				setState(765);
				match(INPATH);
				setState(766);
				((LoadDataContext)_localctx).path = match(STRING);
				setState(768);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OVERWRITE) {
					{
					setState(767);
					match(OVERWRITE);
					}
				}

				setState(770);
				match(INTO);
				setState(771);
				match(TABLE);
				setState(772);
				tableIdentifier();
				setState(774);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(773);
					partitionSpec();
					}
				}

				}
				break;
			case 49:
				_localctx = new TruncateTableContext(_localctx);
				enterOuterAlt(_localctx, 49);
				{
				setState(776);
				match(TRUNCATE);
				setState(777);
				match(TABLE);
				setState(778);
				tableIdentifier();
				setState(780);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(779);
					partitionSpec();
					}
				}

				}
				break;
			case 50:
				_localctx = new RepairTableContext(_localctx);
				enterOuterAlt(_localctx, 50);
				{
				setState(782);
				match(MSCK);
				setState(783);
				match(REPAIR);
				setState(784);
				match(TABLE);
				setState(785);
				tableIdentifier();
				}
				break;
			case 51:
				_localctx = new ManageResourceContext(_localctx);
				enterOuterAlt(_localctx, 51);
				{
				setState(786);
				((ManageResourceContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ADD || _la==LIST) ) {
					((ManageResourceContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(787);
				identifier();
				setState(791);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,96,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(788);
						matchWildcard();
						}
						} 
					}
					setState(793);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,96,_ctx);
				}
				}
				break;
			case 52:
				_localctx = new FailNativeCommandContext(_localctx);
				enterOuterAlt(_localctx, 52);
				{
				setState(794);
				match(SET);
				setState(795);
				match(ROLE);
				setState(799);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,97,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(796);
						matchWildcard();
						}
						} 
					}
					setState(801);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,97,_ctx);
				}
				}
				break;
			case 53:
				_localctx = new SetConfigurationContext(_localctx);
				enterOuterAlt(_localctx, 53);
				{
				setState(802);
				match(SET);
				setState(806);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,98,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(803);
						matchWildcard();
						}
						} 
					}
					setState(808);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,98,_ctx);
				}
				}
				break;
			case 54:
				_localctx = new ResetConfigurationContext(_localctx);
				enterOuterAlt(_localctx, 54);
				{
				setState(809);
				match(RESET);
				}
				break;
			case 55:
				_localctx = new FailNativeCommandContext(_localctx);
				enterOuterAlt(_localctx, 55);
				{
				setState(810);
				unsupportedHiveNativeCommands();
				setState(814);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,99,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(811);
						matchWildcard();
						}
						} 
					}
					setState(816);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,99,_ctx);
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
	public static class UnsupportedHiveNativeCommandsContext extends ParserRuleContext {
		public Token kw1;
		public Token kw2;
		public Token kw3;
		public Token kw4;
		public Token kw5;
		public Token kw6;
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public TerminalNode ROLE() { return getToken(SqlBaseParser.ROLE, 0); }
		public TerminalNode DROP() { return getToken(SqlBaseParser.DROP, 0); }
		public TerminalNode GRANT() { return getToken(SqlBaseParser.GRANT, 0); }
		public TerminalNode REVOKE() { return getToken(SqlBaseParser.REVOKE, 0); }
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode PRINCIPALS() { return getToken(SqlBaseParser.PRINCIPALS, 0); }
		public TerminalNode ROLES() { return getToken(SqlBaseParser.ROLES, 0); }
		public TerminalNode CURRENT() { return getToken(SqlBaseParser.CURRENT, 0); }
		public TerminalNode EXPORT() { return getToken(SqlBaseParser.EXPORT, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TerminalNode IMPORT() { return getToken(SqlBaseParser.IMPORT, 0); }
		public TerminalNode COMPACTIONS() { return getToken(SqlBaseParser.COMPACTIONS, 0); }
		public TerminalNode TRANSACTIONS() { return getToken(SqlBaseParser.TRANSACTIONS, 0); }
		public TerminalNode INDEXES() { return getToken(SqlBaseParser.INDEXES, 0); }
		public TerminalNode LOCKS() { return getToken(SqlBaseParser.LOCKS, 0); }
		public TerminalNode INDEX() { return getToken(SqlBaseParser.INDEX, 0); }
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode LOCK() { return getToken(SqlBaseParser.LOCK, 0); }
		public TerminalNode DATABASE() { return getToken(SqlBaseParser.DATABASE, 0); }
		public TerminalNode UNLOCK() { return getToken(SqlBaseParser.UNLOCK, 0); }
		public TerminalNode TEMPORARY() { return getToken(SqlBaseParser.TEMPORARY, 0); }
		public TerminalNode MACRO() { return getToken(SqlBaseParser.MACRO, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode CLUSTERED() { return getToken(SqlBaseParser.CLUSTERED, 0); }
		public TerminalNode BY() { return getToken(SqlBaseParser.BY, 0); }
		public TerminalNode SORTED() { return getToken(SqlBaseParser.SORTED, 0); }
		public TerminalNode SKEWED() { return getToken(SqlBaseParser.SKEWED, 0); }
		public TerminalNode STORED() { return getToken(SqlBaseParser.STORED, 0); }
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public TerminalNode DIRECTORIES() { return getToken(SqlBaseParser.DIRECTORIES, 0); }
		public TerminalNode SET() { return getToken(SqlBaseParser.SET, 0); }
		public TerminalNode LOCATION() { return getToken(SqlBaseParser.LOCATION, 0); }
		public TerminalNode EXCHANGE() { return getToken(SqlBaseParser.EXCHANGE, 0); }
		public TerminalNode PARTITION() { return getToken(SqlBaseParser.PARTITION, 0); }
		public TerminalNode ARCHIVE() { return getToken(SqlBaseParser.ARCHIVE, 0); }
		public TerminalNode UNARCHIVE() { return getToken(SqlBaseParser.UNARCHIVE, 0); }
		public TerminalNode TOUCH() { return getToken(SqlBaseParser.TOUCH, 0); }
		public TerminalNode COMPACT() { return getToken(SqlBaseParser.COMPACT, 0); }
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public TerminalNode CONCATENATE() { return getToken(SqlBaseParser.CONCATENATE, 0); }
		public TerminalNode FILEFORMAT() { return getToken(SqlBaseParser.FILEFORMAT, 0); }
		public TerminalNode REPLACE() { return getToken(SqlBaseParser.REPLACE, 0); }
		public TerminalNode COLUMNS() { return getToken(SqlBaseParser.COLUMNS, 0); }
		public TerminalNode START() { return getToken(SqlBaseParser.START, 0); }
		public TerminalNode TRANSACTION() { return getToken(SqlBaseParser.TRANSACTION, 0); }
		public TerminalNode COMMIT() { return getToken(SqlBaseParser.COMMIT, 0); }
		public TerminalNode ROLLBACK() { return getToken(SqlBaseParser.ROLLBACK, 0); }
		public TerminalNode DFS() { return getToken(SqlBaseParser.DFS, 0); }
		public TerminalNode DELETE() { return getToken(SqlBaseParser.DELETE, 0); }
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public UnsupportedHiveNativeCommandsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unsupportedHiveNativeCommands; }
	}

	public final UnsupportedHiveNativeCommandsContext unsupportedHiveNativeCommands() throws RecognitionException {
		UnsupportedHiveNativeCommandsContext _localctx = new UnsupportedHiveNativeCommandsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_unsupportedHiveNativeCommands);
		int _la;
		try {
			setState(989);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(819);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(CREATE);
				setState(820);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(ROLE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(821);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(DROP);
				setState(822);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(ROLE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(823);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(GRANT);
				setState(825);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,101,_ctx) ) {
				case 1:
					{
					setState(824);
					((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(ROLE);
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(827);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(REVOKE);
				setState(829);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
				case 1:
					{
					setState(828);
					((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(ROLE);
					}
					break;
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(831);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(832);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(GRANT);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(833);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(834);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(ROLE);
				setState(836);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,103,_ctx) ) {
				case 1:
					{
					setState(835);
					((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(GRANT);
					}
					break;
				}
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(838);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(839);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(PRINCIPALS);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(840);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(841);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(ROLES);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(842);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(843);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(CURRENT);
				setState(844);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(ROLES);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(845);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(EXPORT);
				setState(846);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(847);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(IMPORT);
				setState(848);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(849);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(850);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(COMPACTIONS);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(851);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(852);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(CREATE);
				setState(853);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(TABLE);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(854);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(855);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TRANSACTIONS);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(856);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(857);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(INDEXES);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(858);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(859);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(LOCKS);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(860);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(CREATE);
				setState(861);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(INDEX);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(862);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(DROP);
				setState(863);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(INDEX);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(864);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(865);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(INDEX);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(866);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(LOCK);
				setState(867);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(868);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(LOCK);
				setState(869);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(DATABASE);
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(870);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(UNLOCK);
				setState(871);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(872);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(UNLOCK);
				setState(873);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(DATABASE);
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(874);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(CREATE);
				setState(875);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TEMPORARY);
				setState(876);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(MACRO);
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(877);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(DROP);
				setState(878);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TEMPORARY);
				setState(879);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(MACRO);
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(880);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(881);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(882);
				tableIdentifier();
				setState(883);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(NOT);
				setState(884);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(CLUSTERED);
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(886);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(887);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(888);
				tableIdentifier();
				setState(889);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(CLUSTERED);
				setState(890);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(BY);
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 28);
				{
				setState(892);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(893);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(894);
				tableIdentifier();
				setState(895);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(NOT);
				setState(896);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(SORTED);
				}
				break;
			case 29:
				enterOuterAlt(_localctx, 29);
				{
				setState(898);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(899);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(900);
				tableIdentifier();
				setState(901);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(SKEWED);
				setState(902);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(BY);
				}
				break;
			case 30:
				enterOuterAlt(_localctx, 30);
				{
				setState(904);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(905);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(906);
				tableIdentifier();
				setState(907);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(NOT);
				setState(908);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(SKEWED);
				}
				break;
			case 31:
				enterOuterAlt(_localctx, 31);
				{
				setState(910);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(911);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(912);
				tableIdentifier();
				setState(913);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(NOT);
				setState(914);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(STORED);
				setState(915);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw5 = match(AS);
				setState(916);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw6 = match(DIRECTORIES);
				}
				break;
			case 32:
				enterOuterAlt(_localctx, 32);
				{
				setState(918);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(919);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(920);
				tableIdentifier();
				setState(921);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(SET);
				setState(922);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(SKEWED);
				setState(923);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw5 = match(LOCATION);
				}
				break;
			case 33:
				enterOuterAlt(_localctx, 33);
				{
				setState(925);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(926);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(927);
				tableIdentifier();
				setState(928);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(EXCHANGE);
				setState(929);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(PARTITION);
				}
				break;
			case 34:
				enterOuterAlt(_localctx, 34);
				{
				setState(931);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(932);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(933);
				tableIdentifier();
				setState(934);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(ARCHIVE);
				setState(935);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(PARTITION);
				}
				break;
			case 35:
				enterOuterAlt(_localctx, 35);
				{
				setState(937);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(938);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(939);
				tableIdentifier();
				setState(940);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(UNARCHIVE);
				setState(941);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(PARTITION);
				}
				break;
			case 36:
				enterOuterAlt(_localctx, 36);
				{
				setState(943);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(944);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(945);
				tableIdentifier();
				setState(946);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(TOUCH);
				}
				break;
			case 37:
				enterOuterAlt(_localctx, 37);
				{
				setState(948);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(949);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(950);
				tableIdentifier();
				setState(952);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(951);
					partitionSpec();
					}
				}

				setState(954);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(COMPACT);
				}
				break;
			case 38:
				enterOuterAlt(_localctx, 38);
				{
				setState(956);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(957);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(958);
				tableIdentifier();
				setState(960);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(959);
					partitionSpec();
					}
				}

				setState(962);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(CONCATENATE);
				}
				break;
			case 39:
				enterOuterAlt(_localctx, 39);
				{
				setState(964);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(965);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(966);
				tableIdentifier();
				setState(968);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(967);
					partitionSpec();
					}
				}

				setState(970);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(SET);
				setState(971);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(FILEFORMAT);
				}
				break;
			case 40:
				enterOuterAlt(_localctx, 40);
				{
				setState(973);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(974);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(975);
				tableIdentifier();
				setState(977);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(976);
					partitionSpec();
					}
				}

				setState(979);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(REPLACE);
				setState(980);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(COLUMNS);
				}
				break;
			case 41:
				enterOuterAlt(_localctx, 41);
				{
				setState(982);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(START);
				setState(983);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TRANSACTION);
				}
				break;
			case 42:
				enterOuterAlt(_localctx, 42);
				{
				setState(984);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(COMMIT);
				}
				break;
			case 43:
				enterOuterAlt(_localctx, 43);
				{
				setState(985);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ROLLBACK);
				}
				break;
			case 44:
				enterOuterAlt(_localctx, 44);
				{
				setState(986);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(DFS);
				}
				break;
			case 45:
				enterOuterAlt(_localctx, 45);
				{
				setState(987);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(DELETE);
				setState(988);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(FROM);
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
	public static class CreateTableHeaderContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode TEMPORARY() { return getToken(SqlBaseParser.TEMPORARY, 0); }
		public TerminalNode EXTERNAL() { return getToken(SqlBaseParser.EXTERNAL, 0); }
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public CreateTableHeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createTableHeader; }
	}

	public final CreateTableHeaderContext createTableHeader() throws RecognitionException {
		CreateTableHeaderContext _localctx = new CreateTableHeaderContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_createTableHeader);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(991);
			match(CREATE);
			setState(993);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TEMPORARY) {
				{
				setState(992);
				match(TEMPORARY);
				}
			}

			setState(996);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTERNAL) {
				{
				setState(995);
				match(EXTERNAL);
				}
			}

			setState(998);
			match(TABLE);
			setState(1002);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,111,_ctx) ) {
			case 1:
				{
				setState(999);
				match(IF);
				setState(1000);
				match(NOT);
				setState(1001);
				match(EXISTS);
				}
				break;
			}
			setState(1004);
			tableIdentifier();
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
	public static class BucketSpecContext extends ParserRuleContext {
		public TerminalNode CLUSTERED() { return getToken(SqlBaseParser.CLUSTERED, 0); }
		public List<TerminalNode> BY() { return getTokens(SqlBaseParser.BY); }
		public TerminalNode BY(int i) {
			return getToken(SqlBaseParser.BY, i);
		}
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode INTO() { return getToken(SqlBaseParser.INTO, 0); }
		public TerminalNode INTEGER_VALUE() { return getToken(SqlBaseParser.INTEGER_VALUE, 0); }
		public TerminalNode BUCKETS() { return getToken(SqlBaseParser.BUCKETS, 0); }
		public TerminalNode SORTED() { return getToken(SqlBaseParser.SORTED, 0); }
		public OrderedIdentifierListContext orderedIdentifierList() {
			return getRuleContext(OrderedIdentifierListContext.class,0);
		}
		public BucketSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bucketSpec; }
	}

	public final BucketSpecContext bucketSpec() throws RecognitionException {
		BucketSpecContext _localctx = new BucketSpecContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_bucketSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1006);
			match(CLUSTERED);
			setState(1007);
			match(BY);
			setState(1008);
			identifierList();
			setState(1012);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SORTED) {
				{
				setState(1009);
				match(SORTED);
				setState(1010);
				match(BY);
				setState(1011);
				orderedIdentifierList();
				}
			}

			setState(1014);
			match(INTO);
			setState(1015);
			match(INTEGER_VALUE);
			setState(1016);
			match(BUCKETS);
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
	public static class SkewSpecContext extends ParserRuleContext {
		public TerminalNode SKEWED() { return getToken(SqlBaseParser.SKEWED, 0); }
		public TerminalNode BY() { return getToken(SqlBaseParser.BY, 0); }
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode ON() { return getToken(SqlBaseParser.ON, 0); }
		public ConstantListContext constantList() {
			return getRuleContext(ConstantListContext.class,0);
		}
		public NestedConstantListContext nestedConstantList() {
			return getRuleContext(NestedConstantListContext.class,0);
		}
		public TerminalNode STORED() { return getToken(SqlBaseParser.STORED, 0); }
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public TerminalNode DIRECTORIES() { return getToken(SqlBaseParser.DIRECTORIES, 0); }
		public SkewSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_skewSpec; }
	}

	public final SkewSpecContext skewSpec() throws RecognitionException {
		SkewSpecContext _localctx = new SkewSpecContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_skewSpec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1018);
			match(SKEWED);
			setState(1019);
			match(BY);
			setState(1020);
			identifierList();
			setState(1021);
			match(ON);
			setState(1024);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,113,_ctx) ) {
			case 1:
				{
				setState(1022);
				constantList();
				}
				break;
			case 2:
				{
				setState(1023);
				nestedConstantList();
				}
				break;
			}
			setState(1029);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,114,_ctx) ) {
			case 1:
				{
				setState(1026);
				match(STORED);
				setState(1027);
				match(AS);
				setState(1028);
				match(DIRECTORIES);
				}
				break;
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
	public static class LocationSpecContext extends ParserRuleContext {
		public TerminalNode LOCATION() { return getToken(SqlBaseParser.LOCATION, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public LocationSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_locationSpec; }
	}

	public final LocationSpecContext locationSpec() throws RecognitionException {
		LocationSpecContext _localctx = new LocationSpecContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_locationSpec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1031);
			match(LOCATION);
			setState(1032);
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
	public static class QueryContext extends ParserRuleContext {
		public QueryNoWithContext queryNoWith() {
			return getRuleContext(QueryNoWithContext.class,0);
		}
		public CtesContext ctes() {
			return getRuleContext(CtesContext.class,0);
		}
		public QueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query; }
	}

	public final QueryContext query() throws RecognitionException {
		QueryContext _localctx = new QueryContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_query);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1035);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(1034);
				ctes();
				}
			}

			setState(1037);
			queryNoWith();
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
	public static class InsertIntoContext extends ParserRuleContext {
		public TerminalNode INSERT() { return getToken(SqlBaseParser.INSERT, 0); }
		public TerminalNode OVERWRITE() { return getToken(SqlBaseParser.OVERWRITE, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public TerminalNode INTO() { return getToken(SqlBaseParser.INTO, 0); }
		public InsertIntoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insertInto; }
	}

	public final InsertIntoContext insertInto() throws RecognitionException {
		InsertIntoContext _localctx = new InsertIntoContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_insertInto);
		int _la;
		try {
			setState(1060);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,120,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1039);
				match(INSERT);
				setState(1040);
				match(OVERWRITE);
				setState(1041);
				match(TABLE);
				setState(1042);
				tableIdentifier();
				setState(1049);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(1043);
					partitionSpec();
					setState(1047);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==IF) {
						{
						setState(1044);
						match(IF);
						setState(1045);
						match(NOT);
						setState(1046);
						match(EXISTS);
						}
					}

					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1051);
				match(INSERT);
				setState(1052);
				match(INTO);
				setState(1054);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,118,_ctx) ) {
				case 1:
					{
					setState(1053);
					match(TABLE);
					}
					break;
				}
				setState(1056);
				tableIdentifier();
				setState(1058);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(1057);
					partitionSpec();
					}
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
	public static class PartitionSpecLocationContext extends ParserRuleContext {
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public LocationSpecContext locationSpec() {
			return getRuleContext(LocationSpecContext.class,0);
		}
		public PartitionSpecLocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partitionSpecLocation; }
	}

	public final PartitionSpecLocationContext partitionSpecLocation() throws RecognitionException {
		PartitionSpecLocationContext _localctx = new PartitionSpecLocationContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_partitionSpecLocation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1062);
			partitionSpec();
			setState(1064);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LOCATION) {
				{
				setState(1063);
				locationSpec();
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
	public static class PartitionSpecContext extends ParserRuleContext {
		public TerminalNode PARTITION() { return getToken(SqlBaseParser.PARTITION, 0); }
		public List<PartitionValContext> partitionVal() {
			return getRuleContexts(PartitionValContext.class);
		}
		public PartitionValContext partitionVal(int i) {
			return getRuleContext(PartitionValContext.class,i);
		}
		public PartitionSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partitionSpec; }
	}

	public final PartitionSpecContext partitionSpec() throws RecognitionException {
		PartitionSpecContext _localctx = new PartitionSpecContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_partitionSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1066);
			match(PARTITION);
			setState(1067);
			match(T__0);
			setState(1068);
			partitionVal();
			setState(1073);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(1069);
				match(T__2);
				setState(1070);
				partitionVal();
				}
				}
				setState(1075);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1076);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PartitionValContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode EQ() { return getToken(SqlBaseParser.EQ, 0); }
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public PartitionValContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partitionVal; }
	}

	public final PartitionValContext partitionVal() throws RecognitionException {
		PartitionValContext _localctx = new PartitionValContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_partitionVal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1078);
			identifier();
			setState(1081);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQ) {
				{
				setState(1079);
				match(EQ);
				setState(1080);
				constant();
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
	public static class DescribeFuncNameContext extends ParserRuleContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public ComparisonOperatorContext comparisonOperator() {
			return getRuleContext(ComparisonOperatorContext.class,0);
		}
		public ArithmeticOperatorContext arithmeticOperator() {
			return getRuleContext(ArithmeticOperatorContext.class,0);
		}
		public PredicateOperatorContext predicateOperator() {
			return getRuleContext(PredicateOperatorContext.class,0);
		}
		public DescribeFuncNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_describeFuncName; }
	}

	public final DescribeFuncNameContext describeFuncName() throws RecognitionException {
		DescribeFuncNameContext _localctx = new DescribeFuncNameContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_describeFuncName);
		try {
			setState(1088);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,124,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1083);
				qualifiedName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1084);
				match(STRING);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1085);
				comparisonOperator();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1086);
				arithmeticOperator();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1087);
				predicateOperator();
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
	public static class DescribeColNameContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> STRING() { return getTokens(SqlBaseParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(SqlBaseParser.STRING, i);
		}
		public DescribeColNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_describeColName; }
	}

	public final DescribeColNameContext describeColName() throws RecognitionException {
		DescribeColNameContext _localctx = new DescribeColNameContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_describeColName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1090);
			identifier();
			setState(1098);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(1091);
				match(T__3);
				setState(1094);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SELECT:
				case FROM:
				case ADD:
				case AS:
				case ALL:
				case DISTINCT:
				case WHERE:
				case GROUP:
				case BY:
				case GROUPING:
				case SETS:
				case CUBE:
				case ROLLUP:
				case ORDER:
				case HAVING:
				case LIMIT:
				case AT:
				case OR:
				case AND:
				case IN:
				case NOT:
				case NO:
				case EXISTS:
				case BETWEEN:
				case LIKE:
				case RLIKE:
				case IS:
				case NULL:
				case TRUE:
				case FALSE:
				case NULLS:
				case ASC:
				case DESC:
				case FOR:
				case INTERVAL:
				case CASE:
				case WHEN:
				case THEN:
				case ELSE:
				case END:
				case JOIN:
				case CROSS:
				case OUTER:
				case INNER:
				case LEFT:
				case SEMI:
				case RIGHT:
				case FULL:
				case NATURAL:
				case ON:
				case LATERAL:
				case WINDOW:
				case OVER:
				case PARTITION:
				case RANGE:
				case ROWS:
				case UNBOUNDED:
				case PRECEDING:
				case FOLLOWING:
				case CURRENT:
				case FIRST:
				case AFTER:
				case LAST:
				case ROW:
				case WITH:
				case VALUES:
				case CREATE:
				case TABLE:
				case VIEW:
				case REPLACE:
				case INSERT:
				case DELETE:
				case INTO:
				case DESCRIBE:
				case EXPLAIN:
				case FORMAT:
				case LOGICAL:
				case CODEGEN:
				case COST:
				case CAST:
				case SHOW:
				case TABLES:
				case COLUMNS:
				case COLUMN:
				case USE:
				case PARTITIONS:
				case FUNCTIONS:
				case DROP:
				case UNION:
				case EXCEPT:
				case SETMINUS:
				case INTERSECT:
				case TO:
				case TABLESAMPLE:
				case STRATIFY:
				case ALTER:
				case RENAME:
				case ARRAY:
				case MAP:
				case STRUCT:
				case COMMENT:
				case SET:
				case RESET:
				case DATA:
				case START:
				case TRANSACTION:
				case COMMIT:
				case ROLLBACK:
				case MACRO:
				case IGNORE:
				case KNN:
				case IF:
				case DIV:
				case PERCENTLIT:
				case BUCKET:
				case OUT:
				case OF:
				case SORT:
				case CLUSTER:
				case DISTRIBUTE:
				case OVERWRITE:
				case TRANSFORM:
				case REDUCE:
				case USING:
				case SERDE:
				case SERDEPROPERTIES:
				case RECORDREADER:
				case RECORDWRITER:
				case DELIMITED:
				case FIELDS:
				case TERMINATED:
				case COLLECTION:
				case ITEMS:
				case KEYS:
				case ESCAPED:
				case LINES:
				case SEPARATED:
				case FUNCTION:
				case EXTENDED:
				case REFRESH:
				case CLEAR:
				case CACHE:
				case UNCACHE:
				case LAZY:
				case FORMATTED:
				case GLOBAL:
				case TEMPORARY:
				case OPTIONS:
				case UNSET:
				case TBLPROPERTIES:
				case DBPROPERTIES:
				case BUCKETS:
				case SKEWED:
				case STORED:
				case DIRECTORIES:
				case LOCATION:
				case EXCHANGE:
				case ARCHIVE:
				case UNARCHIVE:
				case FILEFORMAT:
				case TOUCH:
				case COMPACT:
				case CONCATENATE:
				case CHANGE:
				case CASCADE:
				case RESTRICT:
				case CLUSTERED:
				case SORTED:
				case PURGE:
				case INPUTFORMAT:
				case OUTPUTFORMAT:
				case DATABASE:
				case DATABASES:
				case DFS:
				case TRUNCATE:
				case ANALYZE:
				case COMPUTE:
				case LIST:
				case STATISTICS:
				case PARTITIONED:
				case EXTERNAL:
				case DEFINED:
				case REVOKE:
				case GRANT:
				case LOCK:
				case UNLOCK:
				case MSCK:
				case REPAIR:
				case RECOVER:
				case EXPORT:
				case IMPORT:
				case LOAD:
				case ROLE:
				case ROLES:
				case COMPACTIONS:
				case PRINCIPALS:
				case TRANSACTIONS:
				case INDEX:
				case INDEXES:
				case LOCKS:
				case OPTION:
				case ANTI:
				case LOCAL:
				case INPATH:
				case IDENTIFIER:
				case BACKQUOTED_IDENTIFIER:
					{
					setState(1092);
					identifier();
					}
					break;
				case STRING:
					{
					setState(1093);
					match(STRING);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(1100);
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
	public static class CtesContext extends ParserRuleContext {
		public TerminalNode WITH() { return getToken(SqlBaseParser.WITH, 0); }
		public List<NamedQueryContext> namedQuery() {
			return getRuleContexts(NamedQueryContext.class);
		}
		public NamedQueryContext namedQuery(int i) {
			return getRuleContext(NamedQueryContext.class,i);
		}
		public CtesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ctes; }
	}

	public final CtesContext ctes() throws RecognitionException {
		CtesContext _localctx = new CtesContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_ctes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1101);
			match(WITH);
			setState(1102);
			namedQuery();
			setState(1107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(1103);
				match(T__2);
				setState(1104);
				namedQuery();
				}
				}
				setState(1109);
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
	public static class NamedQueryContext extends ParserRuleContext {
		public IdentifierContext name;
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public NamedQueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedQuery; }
	}

	public final NamedQueryContext namedQuery() throws RecognitionException {
		NamedQueryContext _localctx = new NamedQueryContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_namedQuery);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1110);
			((NamedQueryContext)_localctx).name = identifier();
			setState(1112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(1111);
				match(AS);
				}
			}

			setState(1114);
			match(T__0);
			setState(1115);
			query();
			setState(1116);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TableProviderContext extends ParserRuleContext {
		public TerminalNode USING() { return getToken(SqlBaseParser.USING, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TableProviderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableProvider; }
	}

	public final TableProviderContext tableProvider() throws RecognitionException {
		TableProviderContext _localctx = new TableProviderContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_tableProvider);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1118);
			match(USING);
			setState(1119);
			qualifiedName();
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
	public static class TablePropertyListContext extends ParserRuleContext {
		public List<TablePropertyContext> tableProperty() {
			return getRuleContexts(TablePropertyContext.class);
		}
		public TablePropertyContext tableProperty(int i) {
			return getRuleContext(TablePropertyContext.class,i);
		}
		public TablePropertyListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tablePropertyList; }
	}

	public final TablePropertyListContext tablePropertyList() throws RecognitionException {
		TablePropertyListContext _localctx = new TablePropertyListContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_tablePropertyList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1121);
			match(T__0);
			setState(1122);
			tableProperty();
			setState(1127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(1123);
				match(T__2);
				setState(1124);
				tableProperty();
				}
				}
				setState(1129);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1130);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TablePropertyContext extends ParserRuleContext {
		public TablePropertyKeyContext key;
		public TablePropertyValueContext value;
		public TablePropertyKeyContext tablePropertyKey() {
			return getRuleContext(TablePropertyKeyContext.class,0);
		}
		public TablePropertyValueContext tablePropertyValue() {
			return getRuleContext(TablePropertyValueContext.class,0);
		}
		public TerminalNode EQ() { return getToken(SqlBaseParser.EQ, 0); }
		public TablePropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableProperty; }
	}

	public final TablePropertyContext tableProperty() throws RecognitionException {
		TablePropertyContext _localctx = new TablePropertyContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_tableProperty);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1132);
			((TablePropertyContext)_localctx).key = tablePropertyKey();
			setState(1137);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TRUE || _la==FALSE || _la==EQ || ((((_la - 233)) & ~0x3f) == 0 && ((1L << (_la - 233)) & 97L) != 0)) {
				{
				setState(1134);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQ) {
					{
					setState(1133);
					match(EQ);
					}
				}

				setState(1136);
				((TablePropertyContext)_localctx).value = tablePropertyValue();
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
	public static class TablePropertyKeyContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public TablePropertyKeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tablePropertyKey; }
	}

	public final TablePropertyKeyContext tablePropertyKey() throws RecognitionException {
		TablePropertyKeyContext _localctx = new TablePropertyKeyContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_tablePropertyKey);
		int _la;
		try {
			setState(1148);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECT:
			case FROM:
			case ADD:
			case AS:
			case ALL:
			case DISTINCT:
			case WHERE:
			case GROUP:
			case BY:
			case GROUPING:
			case SETS:
			case CUBE:
			case ROLLUP:
			case ORDER:
			case HAVING:
			case LIMIT:
			case AT:
			case OR:
			case AND:
			case IN:
			case NOT:
			case NO:
			case EXISTS:
			case BETWEEN:
			case LIKE:
			case RLIKE:
			case IS:
			case NULL:
			case TRUE:
			case FALSE:
			case NULLS:
			case ASC:
			case DESC:
			case FOR:
			case INTERVAL:
			case CASE:
			case WHEN:
			case THEN:
			case ELSE:
			case END:
			case JOIN:
			case CROSS:
			case OUTER:
			case INNER:
			case LEFT:
			case SEMI:
			case RIGHT:
			case FULL:
			case NATURAL:
			case ON:
			case LATERAL:
			case WINDOW:
			case OVER:
			case PARTITION:
			case RANGE:
			case ROWS:
			case UNBOUNDED:
			case PRECEDING:
			case FOLLOWING:
			case CURRENT:
			case FIRST:
			case AFTER:
			case LAST:
			case ROW:
			case WITH:
			case VALUES:
			case CREATE:
			case TABLE:
			case VIEW:
			case REPLACE:
			case INSERT:
			case DELETE:
			case INTO:
			case DESCRIBE:
			case EXPLAIN:
			case FORMAT:
			case LOGICAL:
			case CODEGEN:
			case COST:
			case CAST:
			case SHOW:
			case TABLES:
			case COLUMNS:
			case COLUMN:
			case USE:
			case PARTITIONS:
			case FUNCTIONS:
			case DROP:
			case UNION:
			case EXCEPT:
			case SETMINUS:
			case INTERSECT:
			case TO:
			case TABLESAMPLE:
			case STRATIFY:
			case ALTER:
			case RENAME:
			case ARRAY:
			case MAP:
			case STRUCT:
			case COMMENT:
			case SET:
			case RESET:
			case DATA:
			case START:
			case TRANSACTION:
			case COMMIT:
			case ROLLBACK:
			case MACRO:
			case IGNORE:
			case KNN:
			case IF:
			case DIV:
			case PERCENTLIT:
			case BUCKET:
			case OUT:
			case OF:
			case SORT:
			case CLUSTER:
			case DISTRIBUTE:
			case OVERWRITE:
			case TRANSFORM:
			case REDUCE:
			case USING:
			case SERDE:
			case SERDEPROPERTIES:
			case RECORDREADER:
			case RECORDWRITER:
			case DELIMITED:
			case FIELDS:
			case TERMINATED:
			case COLLECTION:
			case ITEMS:
			case KEYS:
			case ESCAPED:
			case LINES:
			case SEPARATED:
			case FUNCTION:
			case EXTENDED:
			case REFRESH:
			case CLEAR:
			case CACHE:
			case UNCACHE:
			case LAZY:
			case FORMATTED:
			case GLOBAL:
			case TEMPORARY:
			case OPTIONS:
			case UNSET:
			case TBLPROPERTIES:
			case DBPROPERTIES:
			case BUCKETS:
			case SKEWED:
			case STORED:
			case DIRECTORIES:
			case LOCATION:
			case EXCHANGE:
			case ARCHIVE:
			case UNARCHIVE:
			case FILEFORMAT:
			case TOUCH:
			case COMPACT:
			case CONCATENATE:
			case CHANGE:
			case CASCADE:
			case RESTRICT:
			case CLUSTERED:
			case SORTED:
			case PURGE:
			case INPUTFORMAT:
			case OUTPUTFORMAT:
			case DATABASE:
			case DATABASES:
			case DFS:
			case TRUNCATE:
			case ANALYZE:
			case COMPUTE:
			case LIST:
			case STATISTICS:
			case PARTITIONED:
			case EXTERNAL:
			case DEFINED:
			case REVOKE:
			case GRANT:
			case LOCK:
			case UNLOCK:
			case MSCK:
			case REPAIR:
			case RECOVER:
			case EXPORT:
			case IMPORT:
			case LOAD:
			case ROLE:
			case ROLES:
			case COMPACTIONS:
			case PRINCIPALS:
			case TRANSACTIONS:
			case INDEX:
			case INDEXES:
			case LOCKS:
			case OPTION:
			case ANTI:
			case LOCAL:
			case INPATH:
			case IDENTIFIER:
			case BACKQUOTED_IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1139);
				identifier();
				setState(1144);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(1140);
					match(T__3);
					setState(1141);
					identifier();
					}
					}
					setState(1146);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(1147);
				match(STRING);
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
	public static class TablePropertyValueContext extends ParserRuleContext {
		public TerminalNode INTEGER_VALUE() { return getToken(SqlBaseParser.INTEGER_VALUE, 0); }
		public TerminalNode DECIMAL_VALUE() { return getToken(SqlBaseParser.DECIMAL_VALUE, 0); }
		public BooleanValueContext booleanValue() {
			return getRuleContext(BooleanValueContext.class,0);
		}
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public TablePropertyValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tablePropertyValue; }
	}

	public final TablePropertyValueContext tablePropertyValue() throws RecognitionException {
		TablePropertyValueContext _localctx = new TablePropertyValueContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_tablePropertyValue);
		try {
			setState(1154);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER_VALUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1150);
				match(INTEGER_VALUE);
				}
				break;
			case DECIMAL_VALUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1151);
				match(DECIMAL_VALUE);
				}
				break;
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 3);
				{
				setState(1152);
				booleanValue();
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 4);
				{
				setState(1153);
				match(STRING);
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
	public static class ConstantListContext extends ParserRuleContext {
		public List<ConstantContext> constant() {
			return getRuleContexts(ConstantContext.class);
		}
		public ConstantContext constant(int i) {
			return getRuleContext(ConstantContext.class,i);
		}
		public ConstantListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantList; }
	}

	public final ConstantListContext constantList() throws RecognitionException {
		ConstantListContext _localctx = new ConstantListContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_constantList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1156);
			match(T__0);
			setState(1157);
			constant();
			setState(1162);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(1158);
				match(T__2);
				setState(1159);
				constant();
				}
				}
				setState(1164);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1165);
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

	@SuppressWarnings("CheckReturnValue")
	public static class NestedConstantListContext extends ParserRuleContext {
		public List<ConstantListContext> constantList() {
			return getRuleContexts(ConstantListContext.class);
		}
		public ConstantListContext constantList(int i) {
			return getRuleContext(ConstantListContext.class,i);
		}
		public NestedConstantListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nestedConstantList; }
	}

	public final NestedConstantListContext nestedConstantList() throws RecognitionException {
		NestedConstantListContext _localctx = new NestedConstantListContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_nestedConstantList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1167);
			match(T__0);
			setState(1168);
			constantList();
			setState(1173);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(1169);
				match(T__2);
				setState(1170);
				constantList();
				}
				}
				setState(1175);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1176);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CreateFileFormatContext extends ParserRuleContext {
		public TerminalNode STORED() { return getToken(SqlBaseParser.STORED, 0); }
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public FileFormatContext fileFormat() {
			return getRuleContext(FileFormatContext.class,0);
		}
		public TerminalNode BY() { return getToken(SqlBaseParser.BY, 0); }
		public StorageHandlerContext storageHandler() {
			return getRuleContext(StorageHandlerContext.class,0);
		}
		public CreateFileFormatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createFileFormat; }
	}

	public final CreateFileFormatContext createFileFormat() throws RecognitionException {
		CreateFileFormatContext _localctx = new CreateFileFormatContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_createFileFormat);
		try {
			setState(1184);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,137,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1178);
				match(STORED);
				setState(1179);
				match(AS);
				setState(1180);
				fileFormat();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1181);
				match(STORED);
				setState(1182);
				match(BY);
				setState(1183);
				storageHandler();
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
	public static class FileFormatContext extends ParserRuleContext {
		public FileFormatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fileFormat; }
	 
		public FileFormatContext() { }
		public void copyFrom(FileFormatContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TableFileFormatContext extends FileFormatContext {
		public Token inFmt;
		public Token outFmt;
		public TerminalNode INPUTFORMAT() { return getToken(SqlBaseParser.INPUTFORMAT, 0); }
		public TerminalNode OUTPUTFORMAT() { return getToken(SqlBaseParser.OUTPUTFORMAT, 0); }
		public List<TerminalNode> STRING() { return getTokens(SqlBaseParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(SqlBaseParser.STRING, i);
		}
		public TableFileFormatContext(FileFormatContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GenericFileFormatContext extends FileFormatContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public GenericFileFormatContext(FileFormatContext ctx) { copyFrom(ctx); }
	}

	public final FileFormatContext fileFormat() throws RecognitionException {
		FileFormatContext _localctx = new FileFormatContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_fileFormat);
		try {
			setState(1191);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,138,_ctx) ) {
			case 1:
				_localctx = new TableFileFormatContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1186);
				match(INPUTFORMAT);
				setState(1187);
				((TableFileFormatContext)_localctx).inFmt = match(STRING);
				setState(1188);
				match(OUTPUTFORMAT);
				setState(1189);
				((TableFileFormatContext)_localctx).outFmt = match(STRING);
				}
				break;
			case 2:
				_localctx = new GenericFileFormatContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1190);
				identifier();
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
	public static class StorageHandlerContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public TerminalNode WITH() { return getToken(SqlBaseParser.WITH, 0); }
		public TerminalNode SERDEPROPERTIES() { return getToken(SqlBaseParser.SERDEPROPERTIES, 0); }
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public StorageHandlerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_storageHandler; }
	}

	public final StorageHandlerContext storageHandler() throws RecognitionException {
		StorageHandlerContext _localctx = new StorageHandlerContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_storageHandler);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1193);
			match(STRING);
			setState(1197);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,139,_ctx) ) {
			case 1:
				{
				setState(1194);
				match(WITH);
				setState(1195);
				match(SERDEPROPERTIES);
				setState(1196);
				tablePropertyList();
				}
				break;
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
	public static class ResourceContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public ResourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resource; }
	}

	public final ResourceContext resource() throws RecognitionException {
		ResourceContext _localctx = new ResourceContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_resource);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1199);
			identifier();
			setState(1200);
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
	public static class QueryNoWithContext extends ParserRuleContext {
		public QueryNoWithContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryNoWith; }
	 
		public QueryNoWithContext() { }
		public void copyFrom(QueryNoWithContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SingleInsertQueryContext extends QueryNoWithContext {
		public QueryTermContext queryTerm() {
			return getRuleContext(QueryTermContext.class,0);
		}
		public QueryOrganizationContext queryOrganization() {
			return getRuleContext(QueryOrganizationContext.class,0);
		}
		public InsertIntoContext insertInto() {
			return getRuleContext(InsertIntoContext.class,0);
		}
		public SingleInsertQueryContext(QueryNoWithContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MultiInsertQueryContext extends QueryNoWithContext {
		public FromClauseContext fromClause() {
			return getRuleContext(FromClauseContext.class,0);
		}
		public List<MultiInsertQueryBodyContext> multiInsertQueryBody() {
			return getRuleContexts(MultiInsertQueryBodyContext.class);
		}
		public MultiInsertQueryBodyContext multiInsertQueryBody(int i) {
			return getRuleContext(MultiInsertQueryBodyContext.class,i);
		}
		public MultiInsertQueryContext(QueryNoWithContext ctx) { copyFrom(ctx); }
	}

	public final QueryNoWithContext queryNoWith() throws RecognitionException {
		QueryNoWithContext _localctx = new QueryNoWithContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_queryNoWith);
		int _la;
		try {
			setState(1214);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,142,_ctx) ) {
			case 1:
				_localctx = new SingleInsertQueryContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1203);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INSERT) {
					{
					setState(1202);
					insertInto();
					}
				}

				setState(1205);
				queryTerm(0);
				setState(1206);
				queryOrganization();
				}
				break;
			case 2:
				_localctx = new MultiInsertQueryContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1208);
				fromClause();
				setState(1210); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1209);
					multiInsertQueryBody();
					}
					}
					setState(1212); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==SELECT || _la==FROM || _la==INSERT || _la==MAP || _la==REDUCE );
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
	public static class QueryOrganizationContext extends ParserRuleContext {
		public SortItemContext sortItem;
		public List<SortItemContext> order = new ArrayList<SortItemContext>();
		public ExpressionContext expression;
		public List<ExpressionContext> clusterBy = new ArrayList<ExpressionContext>();
		public List<ExpressionContext> distributeBy = new ArrayList<ExpressionContext>();
		public List<SortItemContext> sort = new ArrayList<SortItemContext>();
		public ExpressionContext limit;
		public TerminalNode ORDER() { return getToken(SqlBaseParser.ORDER, 0); }
		public List<TerminalNode> BY() { return getTokens(SqlBaseParser.BY); }
		public TerminalNode BY(int i) {
			return getToken(SqlBaseParser.BY, i);
		}
		public TerminalNode CLUSTER() { return getToken(SqlBaseParser.CLUSTER, 0); }
		public TerminalNode DISTRIBUTE() { return getToken(SqlBaseParser.DISTRIBUTE, 0); }
		public TerminalNode SORT() { return getToken(SqlBaseParser.SORT, 0); }
		public WindowsContext windows() {
			return getRuleContext(WindowsContext.class,0);
		}
		public TerminalNode LIMIT() { return getToken(SqlBaseParser.LIMIT, 0); }
		public List<SortItemContext> sortItem() {
			return getRuleContexts(SortItemContext.class);
		}
		public SortItemContext sortItem(int i) {
			return getRuleContext(SortItemContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public QueryOrganizationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryOrganization; }
	}

	public final QueryOrganizationContext queryOrganization() throws RecognitionException {
		QueryOrganizationContext _localctx = new QueryOrganizationContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_queryOrganization);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1226);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(1216);
				match(ORDER);
				setState(1217);
				match(BY);
				setState(1218);
				((QueryOrganizationContext)_localctx).sortItem = sortItem();
				((QueryOrganizationContext)_localctx).order.add(((QueryOrganizationContext)_localctx).sortItem);
				setState(1223);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(1219);
					match(T__2);
					setState(1220);
					((QueryOrganizationContext)_localctx).sortItem = sortItem();
					((QueryOrganizationContext)_localctx).order.add(((QueryOrganizationContext)_localctx).sortItem);
					}
					}
					setState(1225);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1238);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CLUSTER) {
				{
				setState(1228);
				match(CLUSTER);
				setState(1229);
				match(BY);
				setState(1230);
				((QueryOrganizationContext)_localctx).expression = expression();
				((QueryOrganizationContext)_localctx).clusterBy.add(((QueryOrganizationContext)_localctx).expression);
				setState(1235);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(1231);
					match(T__2);
					setState(1232);
					((QueryOrganizationContext)_localctx).expression = expression();
					((QueryOrganizationContext)_localctx).clusterBy.add(((QueryOrganizationContext)_localctx).expression);
					}
					}
					setState(1237);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1250);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DISTRIBUTE) {
				{
				setState(1240);
				match(DISTRIBUTE);
				setState(1241);
				match(BY);
				setState(1242);
				((QueryOrganizationContext)_localctx).expression = expression();
				((QueryOrganizationContext)_localctx).distributeBy.add(((QueryOrganizationContext)_localctx).expression);
				setState(1247);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(1243);
					match(T__2);
					setState(1244);
					((QueryOrganizationContext)_localctx).expression = expression();
					((QueryOrganizationContext)_localctx).distributeBy.add(((QueryOrganizationContext)_localctx).expression);
					}
					}
					setState(1249);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1262);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SORT) {
				{
				setState(1252);
				match(SORT);
				setState(1253);
				match(BY);
				setState(1254);
				((QueryOrganizationContext)_localctx).sortItem = sortItem();
				((QueryOrganizationContext)_localctx).sort.add(((QueryOrganizationContext)_localctx).sortItem);
				setState(1259);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(1255);
					match(T__2);
					setState(1256);
					((QueryOrganizationContext)_localctx).sortItem = sortItem();
					((QueryOrganizationContext)_localctx).sort.add(((QueryOrganizationContext)_localctx).sortItem);
					}
					}
					setState(1261);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1265);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WINDOW) {
				{
				setState(1264);
				windows();
				}
			}

			setState(1269);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LIMIT) {
				{
				setState(1267);
				match(LIMIT);
				setState(1268);
				((QueryOrganizationContext)_localctx).limit = expression();
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
	public static class MultiInsertQueryBodyContext extends ParserRuleContext {
		public QuerySpecificationContext querySpecification() {
			return getRuleContext(QuerySpecificationContext.class,0);
		}
		public QueryOrganizationContext queryOrganization() {
			return getRuleContext(QueryOrganizationContext.class,0);
		}
		public InsertIntoContext insertInto() {
			return getRuleContext(InsertIntoContext.class,0);
		}
		public MultiInsertQueryBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiInsertQueryBody; }
	}

	public final MultiInsertQueryBodyContext multiInsertQueryBody() throws RecognitionException {
		MultiInsertQueryBodyContext _localctx = new MultiInsertQueryBodyContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_multiInsertQueryBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1272);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INSERT) {
				{
				setState(1271);
				insertInto();
				}
			}

			setState(1274);
			querySpecification();
			setState(1275);
			queryOrganization();
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
	public static class QueryTermContext extends ParserRuleContext {
		public QueryTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryTerm; }
	 
		public QueryTermContext() { }
		public void copyFrom(QueryTermContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class QueryTermDefaultContext extends QueryTermContext {
		public QueryPrimaryContext queryPrimary() {
			return getRuleContext(QueryPrimaryContext.class,0);
		}
		public QueryTermDefaultContext(QueryTermContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SetOperationContext extends QueryTermContext {
		public QueryTermContext left;
		public Token operator;
		public QueryTermContext right;
		public List<QueryTermContext> queryTerm() {
			return getRuleContexts(QueryTermContext.class);
		}
		public QueryTermContext queryTerm(int i) {
			return getRuleContext(QueryTermContext.class,i);
		}
		public TerminalNode INTERSECT() { return getToken(SqlBaseParser.INTERSECT, 0); }
		public TerminalNode UNION() { return getToken(SqlBaseParser.UNION, 0); }
		public TerminalNode EXCEPT() { return getToken(SqlBaseParser.EXCEPT, 0); }
		public TerminalNode SETMINUS() { return getToken(SqlBaseParser.SETMINUS, 0); }
		public SetQuantifierContext setQuantifier() {
			return getRuleContext(SetQuantifierContext.class,0);
		}
		public SetOperationContext(QueryTermContext ctx) { copyFrom(ctx); }
	}

	public final QueryTermContext queryTerm() throws RecognitionException {
		return queryTerm(0);
	}

	private QueryTermContext queryTerm(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		QueryTermContext _localctx = new QueryTermContext(_ctx, _parentState);
		QueryTermContext _prevctx = _localctx;
		int _startState = 68;
		enterRecursionRule(_localctx, 68, RULE_queryTerm, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new QueryTermDefaultContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(1278);
			queryPrimary();
			}
			_ctx.stop = _input.LT(-1);
			setState(1288);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,155,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new SetOperationContext(new QueryTermContext(_parentctx, _parentState));
					((SetOperationContext)_localctx).left = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_queryTerm);
					setState(1280);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1281);
					((SetOperationContext)_localctx).operator = _input.LT(1);
					_la = _input.LA(1);
					if ( !(((((_la - 98)) & ~0x3f) == 0 && ((1L << (_la - 98)) & 15L) != 0)) ) {
						((SetOperationContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(1283);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ALL || _la==DISTINCT) {
						{
						setState(1282);
						setQuantifier();
						}
					}

					setState(1285);
					((SetOperationContext)_localctx).right = queryTerm(2);
					}
					} 
				}
				setState(1290);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,155,_ctx);
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
	public static class QueryPrimaryContext extends ParserRuleContext {
		public QueryPrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryPrimary; }
	 
		public QueryPrimaryContext() { }
		public void copyFrom(QueryPrimaryContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SubqueryContext extends QueryPrimaryContext {
		public QueryNoWithContext queryNoWith() {
			return getRuleContext(QueryNoWithContext.class,0);
		}
		public SubqueryContext(QueryPrimaryContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class QueryPrimaryDefaultContext extends QueryPrimaryContext {
		public QuerySpecificationContext querySpecification() {
			return getRuleContext(QuerySpecificationContext.class,0);
		}
		public QueryPrimaryDefaultContext(QueryPrimaryContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InlineTableDefault1Context extends QueryPrimaryContext {
		public InlineTableContext inlineTable() {
			return getRuleContext(InlineTableContext.class,0);
		}
		public InlineTableDefault1Context(QueryPrimaryContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TableContext extends QueryPrimaryContext {
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TableContext(QueryPrimaryContext ctx) { copyFrom(ctx); }
	}

	public final QueryPrimaryContext queryPrimary() throws RecognitionException {
		QueryPrimaryContext _localctx = new QueryPrimaryContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_queryPrimary);
		try {
			setState(1299);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECT:
			case FROM:
			case MAP:
			case REDUCE:
				_localctx = new QueryPrimaryDefaultContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1291);
				querySpecification();
				}
				break;
			case TABLE:
				_localctx = new TableContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1292);
				match(TABLE);
				setState(1293);
				tableIdentifier();
				}
				break;
			case VALUES:
				_localctx = new InlineTableDefault1Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1294);
				inlineTable();
				}
				break;
			case T__0:
				_localctx = new SubqueryContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1295);
				match(T__0);
				setState(1296);
				queryNoWith();
				setState(1297);
				match(T__1);
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
	public static class SortItemContext extends ParserRuleContext {
		public Token ordering;
		public Token nullOrder;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode NULLS() { return getToken(SqlBaseParser.NULLS, 0); }
		public TerminalNode ASC() { return getToken(SqlBaseParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(SqlBaseParser.DESC, 0); }
		public TerminalNode LAST() { return getToken(SqlBaseParser.LAST, 0); }
		public TerminalNode FIRST() { return getToken(SqlBaseParser.FIRST, 0); }
		public SortItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sortItem; }
	}

	public final SortItemContext sortItem() throws RecognitionException {
		SortItemContext _localctx = new SortItemContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_sortItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1301);
			expression();
			setState(1303);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(1302);
				((SortItemContext)_localctx).ordering = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ASC || _la==DESC) ) {
					((SortItemContext)_localctx).ordering = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(1307);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NULLS) {
				{
				setState(1305);
				match(NULLS);
				setState(1306);
				((SortItemContext)_localctx).nullOrder = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==FIRST || _la==LAST) ) {
					((SortItemContext)_localctx).nullOrder = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
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
	public static class QuerySpecificationContext extends ParserRuleContext {
		public Token kind;
		public RowFormatContext inRowFormat;
		public Token recordWriter;
		public Token script;
		public RowFormatContext outRowFormat;
		public Token recordReader;
		public BooleanExpressionContext where;
		public HintContext hint;
		public List<HintContext> hints = new ArrayList<HintContext>();
		public BooleanExpressionContext having;
		public TerminalNode USING() { return getToken(SqlBaseParser.USING, 0); }
		public List<TerminalNode> STRING() { return getTokens(SqlBaseParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(SqlBaseParser.STRING, i);
		}
		public TerminalNode RECORDWRITER() { return getToken(SqlBaseParser.RECORDWRITER, 0); }
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public TerminalNode RECORDREADER() { return getToken(SqlBaseParser.RECORDREADER, 0); }
		public FromClauseContext fromClause() {
			return getRuleContext(FromClauseContext.class,0);
		}
		public TerminalNode WHERE() { return getToken(SqlBaseParser.WHERE, 0); }
		public TerminalNode SELECT() { return getToken(SqlBaseParser.SELECT, 0); }
		public NamedExpressionSeqContext namedExpressionSeq() {
			return getRuleContext(NamedExpressionSeqContext.class,0);
		}
		public List<RowFormatContext> rowFormat() {
			return getRuleContexts(RowFormatContext.class);
		}
		public RowFormatContext rowFormat(int i) {
			return getRuleContext(RowFormatContext.class,i);
		}
		public List<BooleanExpressionContext> booleanExpression() {
			return getRuleContexts(BooleanExpressionContext.class);
		}
		public BooleanExpressionContext booleanExpression(int i) {
			return getRuleContext(BooleanExpressionContext.class,i);
		}
		public TerminalNode TRANSFORM() { return getToken(SqlBaseParser.TRANSFORM, 0); }
		public TerminalNode MAP() { return getToken(SqlBaseParser.MAP, 0); }
		public TerminalNode REDUCE() { return getToken(SqlBaseParser.REDUCE, 0); }
		public IdentifierSeqContext identifierSeq() {
			return getRuleContext(IdentifierSeqContext.class,0);
		}
		public ColTypeListContext colTypeList() {
			return getRuleContext(ColTypeListContext.class,0);
		}
		public List<LateralViewContext> lateralView() {
			return getRuleContexts(LateralViewContext.class);
		}
		public LateralViewContext lateralView(int i) {
			return getRuleContext(LateralViewContext.class,i);
		}
		public AggregationContext aggregation() {
			return getRuleContext(AggregationContext.class,0);
		}
		public TerminalNode HAVING() { return getToken(SqlBaseParser.HAVING, 0); }
		public WindowsContext windows() {
			return getRuleContext(WindowsContext.class,0);
		}
		public SetQuantifierContext setQuantifier() {
			return getRuleContext(SetQuantifierContext.class,0);
		}
		public List<HintContext> hint() {
			return getRuleContexts(HintContext.class);
		}
		public HintContext hint(int i) {
			return getRuleContext(HintContext.class,i);
		}
		public QuerySpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_querySpecification; }
	}

	public final QuerySpecificationContext querySpecification() throws RecognitionException {
		QuerySpecificationContext _localctx = new QuerySpecificationContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_querySpecification);
		int _la;
		try {
			int _alt;
			setState(1402);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,180,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				{
				setState(1319);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SELECT:
					{
					setState(1309);
					match(SELECT);
					setState(1310);
					((QuerySpecificationContext)_localctx).kind = match(TRANSFORM);
					setState(1311);
					match(T__0);
					setState(1312);
					namedExpressionSeq();
					setState(1313);
					match(T__1);
					}
					break;
				case MAP:
					{
					setState(1315);
					((QuerySpecificationContext)_localctx).kind = match(MAP);
					setState(1316);
					namedExpressionSeq();
					}
					break;
				case REDUCE:
					{
					setState(1317);
					((QuerySpecificationContext)_localctx).kind = match(REDUCE);
					setState(1318);
					namedExpressionSeq();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(1322);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ROW) {
					{
					setState(1321);
					((QuerySpecificationContext)_localctx).inRowFormat = rowFormat();
					}
				}

				setState(1326);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==RECORDWRITER) {
					{
					setState(1324);
					match(RECORDWRITER);
					setState(1325);
					((QuerySpecificationContext)_localctx).recordWriter = match(STRING);
					}
				}

				setState(1328);
				match(USING);
				setState(1329);
				((QuerySpecificationContext)_localctx).script = match(STRING);
				setState(1342);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,164,_ctx) ) {
				case 1:
					{
					setState(1330);
					match(AS);
					setState(1340);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,163,_ctx) ) {
					case 1:
						{
						setState(1331);
						identifierSeq();
						}
						break;
					case 2:
						{
						setState(1332);
						colTypeList();
						}
						break;
					case 3:
						{
						{
						setState(1333);
						match(T__0);
						setState(1336);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,162,_ctx) ) {
						case 1:
							{
							setState(1334);
							identifierSeq();
							}
							break;
						case 2:
							{
							setState(1335);
							colTypeList();
							}
							break;
						}
						setState(1338);
						match(T__1);
						}
						}
						break;
					}
					}
					break;
				}
				setState(1345);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,165,_ctx) ) {
				case 1:
					{
					setState(1344);
					((QuerySpecificationContext)_localctx).outRowFormat = rowFormat();
					}
					break;
				}
				setState(1349);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,166,_ctx) ) {
				case 1:
					{
					setState(1347);
					match(RECORDREADER);
					setState(1348);
					((QuerySpecificationContext)_localctx).recordReader = match(STRING);
					}
					break;
				}
				setState(1352);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,167,_ctx) ) {
				case 1:
					{
					setState(1351);
					fromClause();
					}
					break;
				}
				setState(1356);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,168,_ctx) ) {
				case 1:
					{
					setState(1354);
					match(WHERE);
					setState(1355);
					((QuerySpecificationContext)_localctx).where = booleanExpression(0);
					}
					break;
				}
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(1380);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SELECT:
					{
					setState(1358);
					((QuerySpecificationContext)_localctx).kind = match(SELECT);
					setState(1362);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__4) {
						{
						{
						setState(1359);
						((QuerySpecificationContext)_localctx).hint = hint();
						((QuerySpecificationContext)_localctx).hints.add(((QuerySpecificationContext)_localctx).hint);
						}
						}
						setState(1364);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1366);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,170,_ctx) ) {
					case 1:
						{
						setState(1365);
						setQuantifier();
						}
						break;
					}
					setState(1368);
					namedExpressionSeq();
					setState(1370);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,171,_ctx) ) {
					case 1:
						{
						setState(1369);
						fromClause();
						}
						break;
					}
					}
					break;
				case FROM:
					{
					setState(1372);
					fromClause();
					setState(1378);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,173,_ctx) ) {
					case 1:
						{
						setState(1373);
						((QuerySpecificationContext)_localctx).kind = match(SELECT);
						setState(1375);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,172,_ctx) ) {
						case 1:
							{
							setState(1374);
							setQuantifier();
							}
							break;
						}
						setState(1377);
						namedExpressionSeq();
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1385);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,175,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1382);
						lateralView();
						}
						} 
					}
					setState(1387);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,175,_ctx);
				}
				setState(1390);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,176,_ctx) ) {
				case 1:
					{
					setState(1388);
					match(WHERE);
					setState(1389);
					((QuerySpecificationContext)_localctx).where = booleanExpression(0);
					}
					break;
				}
				setState(1393);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,177,_ctx) ) {
				case 1:
					{
					setState(1392);
					aggregation();
					}
					break;
				}
				setState(1397);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,178,_ctx) ) {
				case 1:
					{
					setState(1395);
					match(HAVING);
					setState(1396);
					((QuerySpecificationContext)_localctx).having = booleanExpression(0);
					}
					break;
				}
				setState(1400);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,179,_ctx) ) {
				case 1:
					{
					setState(1399);
					windows();
					}
					break;
				}
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
	public static class HintContext extends ParserRuleContext {
		public HintStatementContext hintStatement;
		public List<HintStatementContext> hintStatements = new ArrayList<HintStatementContext>();
		public List<HintStatementContext> hintStatement() {
			return getRuleContexts(HintStatementContext.class);
		}
		public HintStatementContext hintStatement(int i) {
			return getRuleContext(HintStatementContext.class,i);
		}
		public HintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hint; }
	}

	public final HintContext hint() throws RecognitionException {
		HintContext _localctx = new HintContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_hint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1404);
			match(T__4);
			setState(1405);
			((HintContext)_localctx).hintStatement = hintStatement();
			((HintContext)_localctx).hintStatements.add(((HintContext)_localctx).hintStatement);
			setState(1412);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -1016L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 720575940379279359L) != 0) || ((((_la - 137)) & ~0x3f) == 0 && ((1L << (_la - 137)) & -31L) != 0) || ((((_la - 201)) & ~0x3f) == 0 && ((1L << (_la - 201)) & 6601364733951L) != 0)) {
				{
				{
				setState(1407);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__2) {
					{
					setState(1406);
					match(T__2);
					}
				}

				setState(1409);
				((HintContext)_localctx).hintStatement = hintStatement();
				((HintContext)_localctx).hintStatements.add(((HintContext)_localctx).hintStatement);
				}
				}
				setState(1414);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1415);
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

	@SuppressWarnings("CheckReturnValue")
	public static class HintStatementContext extends ParserRuleContext {
		public IdentifierContext hintName;
		public PrimaryExpressionContext primaryExpression;
		public List<PrimaryExpressionContext> parameters = new ArrayList<PrimaryExpressionContext>();
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<PrimaryExpressionContext> primaryExpression() {
			return getRuleContexts(PrimaryExpressionContext.class);
		}
		public PrimaryExpressionContext primaryExpression(int i) {
			return getRuleContext(PrimaryExpressionContext.class,i);
		}
		public HintStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hintStatement; }
	}

	public final HintStatementContext hintStatement() throws RecognitionException {
		HintStatementContext _localctx = new HintStatementContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_hintStatement);
		int _la;
		try {
			setState(1430);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,184,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1417);
				((HintStatementContext)_localctx).hintName = identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1418);
				((HintStatementContext)_localctx).hintName = identifier();
				setState(1419);
				match(T__0);
				setState(1420);
				((HintStatementContext)_localctx).primaryExpression = primaryExpression(0);
				((HintStatementContext)_localctx).parameters.add(((HintStatementContext)_localctx).primaryExpression);
				setState(1425);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(1421);
					match(T__2);
					setState(1422);
					((HintStatementContext)_localctx).primaryExpression = primaryExpression(0);
					((HintStatementContext)_localctx).parameters.add(((HintStatementContext)_localctx).primaryExpression);
					}
					}
					setState(1427);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1428);
				match(T__1);
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
	public static class FromClauseContext extends ParserRuleContext {
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public List<RelationContext> relation() {
			return getRuleContexts(RelationContext.class);
		}
		public RelationContext relation(int i) {
			return getRuleContext(RelationContext.class,i);
		}
		public List<LateralViewContext> lateralView() {
			return getRuleContexts(LateralViewContext.class);
		}
		public LateralViewContext lateralView(int i) {
			return getRuleContext(LateralViewContext.class,i);
		}
		public FromClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fromClause; }
	}

	public final FromClauseContext fromClause() throws RecognitionException {
		FromClauseContext _localctx = new FromClauseContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_fromClause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1432);
			match(FROM);
			setState(1433);
			relation();
			setState(1438);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,185,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1434);
					match(T__2);
					setState(1435);
					relation();
					}
					} 
				}
				setState(1440);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,185,_ctx);
			}
			setState(1444);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,186,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1441);
					lateralView();
					}
					} 
				}
				setState(1446);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,186,_ctx);
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
	public static class AggregationContext extends ParserRuleContext {
		public ExpressionContext expression;
		public List<ExpressionContext> groupingExpressions = new ArrayList<ExpressionContext>();
		public Token kind;
		public TerminalNode GROUP() { return getToken(SqlBaseParser.GROUP, 0); }
		public TerminalNode BY() { return getToken(SqlBaseParser.BY, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode WITH() { return getToken(SqlBaseParser.WITH, 0); }
		public TerminalNode SETS() { return getToken(SqlBaseParser.SETS, 0); }
		public List<GroupingSetContext> groupingSet() {
			return getRuleContexts(GroupingSetContext.class);
		}
		public GroupingSetContext groupingSet(int i) {
			return getRuleContext(GroupingSetContext.class,i);
		}
		public TerminalNode ROLLUP() { return getToken(SqlBaseParser.ROLLUP, 0); }
		public TerminalNode CUBE() { return getToken(SqlBaseParser.CUBE, 0); }
		public TerminalNode GROUPING() { return getToken(SqlBaseParser.GROUPING, 0); }
		public AggregationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggregation; }
	}

	public final AggregationContext aggregation() throws RecognitionException {
		AggregationContext _localctx = new AggregationContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_aggregation);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1447);
			match(GROUP);
			setState(1448);
			match(BY);
			setState(1449);
			((AggregationContext)_localctx).expression = expression();
			((AggregationContext)_localctx).groupingExpressions.add(((AggregationContext)_localctx).expression);
			setState(1454);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,187,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1450);
					match(T__2);
					setState(1451);
					((AggregationContext)_localctx).expression = expression();
					((AggregationContext)_localctx).groupingExpressions.add(((AggregationContext)_localctx).expression);
					}
					} 
				}
				setState(1456);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,187,_ctx);
			}
			setState(1474);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,189,_ctx) ) {
			case 1:
				{
				setState(1457);
				match(WITH);
				setState(1458);
				((AggregationContext)_localctx).kind = match(ROLLUP);
				}
				break;
			case 2:
				{
				setState(1459);
				match(WITH);
				setState(1460);
				((AggregationContext)_localctx).kind = match(CUBE);
				}
				break;
			case 3:
				{
				setState(1461);
				((AggregationContext)_localctx).kind = match(GROUPING);
				setState(1462);
				match(SETS);
				setState(1463);
				match(T__0);
				setState(1464);
				groupingSet();
				setState(1469);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(1465);
					match(T__2);
					setState(1466);
					groupingSet();
					}
					}
					setState(1471);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1472);
				match(T__1);
				}
				break;
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
	public static class GroupingSetContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public GroupingSetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupingSet; }
	}

	public final GroupingSetContext groupingSet() throws RecognitionException {
		GroupingSetContext _localctx = new GroupingSetContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_groupingSet);
		int _la;
		try {
			setState(1489);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,192,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1476);
				match(T__0);
				setState(1485);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -1022L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 720575940379279359L) != 0) || ((((_la - 132)) & ~0x3f) == 0 && ((1L << (_la - 132)) & -921L) != 0) || ((((_la - 196)) & ~0x3f) == 0 && ((1L << (_la - 196)) & 279275953455103L) != 0)) {
					{
					setState(1477);
					expression();
					setState(1482);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__2) {
						{
						{
						setState(1478);
						match(T__2);
						setState(1479);
						expression();
						}
						}
						setState(1484);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1487);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1488);
				expression();
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
	public static class LateralViewContext extends ParserRuleContext {
		public IdentifierContext tblName;
		public IdentifierContext identifier;
		public List<IdentifierContext> colName = new ArrayList<IdentifierContext>();
		public TerminalNode LATERAL() { return getToken(SqlBaseParser.LATERAL, 0); }
		public TerminalNode VIEW() { return getToken(SqlBaseParser.VIEW, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode OUTER() { return getToken(SqlBaseParser.OUTER, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public LateralViewContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lateralView; }
	}

	public final LateralViewContext lateralView() throws RecognitionException {
		LateralViewContext _localctx = new LateralViewContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_lateralView);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1491);
			match(LATERAL);
			setState(1492);
			match(VIEW);
			setState(1494);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,193,_ctx) ) {
			case 1:
				{
				setState(1493);
				match(OUTER);
				}
				break;
			}
			setState(1496);
			qualifiedName();
			setState(1497);
			match(T__0);
			setState(1506);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -1022L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 720575940379279359L) != 0) || ((((_la - 132)) & ~0x3f) == 0 && ((1L << (_la - 132)) & -921L) != 0) || ((((_la - 196)) & ~0x3f) == 0 && ((1L << (_la - 196)) & 279275953455103L) != 0)) {
				{
				setState(1498);
				expression();
				setState(1503);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(1499);
					match(T__2);
					setState(1500);
					expression();
					}
					}
					setState(1505);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1508);
			match(T__1);
			setState(1509);
			((LateralViewContext)_localctx).tblName = identifier();
			setState(1521);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,198,_ctx) ) {
			case 1:
				{
				setState(1511);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,196,_ctx) ) {
				case 1:
					{
					setState(1510);
					match(AS);
					}
					break;
				}
				setState(1513);
				((LateralViewContext)_localctx).identifier = identifier();
				((LateralViewContext)_localctx).colName.add(((LateralViewContext)_localctx).identifier);
				setState(1518);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,197,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1514);
						match(T__2);
						setState(1515);
						((LateralViewContext)_localctx).identifier = identifier();
						((LateralViewContext)_localctx).colName.add(((LateralViewContext)_localctx).identifier);
						}
						} 
					}
					setState(1520);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,197,_ctx);
				}
				}
				break;
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
	public static class SetQuantifierContext extends ParserRuleContext {
		public TerminalNode DISTINCT() { return getToken(SqlBaseParser.DISTINCT, 0); }
		public TerminalNode ALL() { return getToken(SqlBaseParser.ALL, 0); }
		public SetQuantifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setQuantifier; }
	}

	public final SetQuantifierContext setQuantifier() throws RecognitionException {
		SetQuantifierContext _localctx = new SetQuantifierContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_setQuantifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1523);
			_la = _input.LA(1);
			if ( !(_la==ALL || _la==DISTINCT) ) {
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
	public static class RelationContext extends ParserRuleContext {
		public RelationPrimaryContext relationPrimary() {
			return getRuleContext(RelationPrimaryContext.class,0);
		}
		public List<JoinRelationContext> joinRelation() {
			return getRuleContexts(JoinRelationContext.class);
		}
		public JoinRelationContext joinRelation(int i) {
			return getRuleContext(JoinRelationContext.class,i);
		}
		public RelationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relation; }
	}

	public final RelationContext relation() throws RecognitionException {
		RelationContext _localctx = new RelationContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_relation);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1525);
			relationPrimary();
			setState(1529);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,199,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1526);
					joinRelation();
					}
					} 
				}
				setState(1531);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,199,_ctx);
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
	public static class JoinRelationContext extends ParserRuleContext {
		public RelationPrimaryContext right;
		public TerminalNode JOIN() { return getToken(SqlBaseParser.JOIN, 0); }
		public RelationPrimaryContext relationPrimary() {
			return getRuleContext(RelationPrimaryContext.class,0);
		}
		public JoinTypeContext joinType() {
			return getRuleContext(JoinTypeContext.class,0);
		}
		public JoinCriteriaContext joinCriteria() {
			return getRuleContext(JoinCriteriaContext.class,0);
		}
		public TerminalNode NATURAL() { return getToken(SqlBaseParser.NATURAL, 0); }
		public JoinRelationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinRelation; }
	}

	public final JoinRelationContext joinRelation() throws RecognitionException {
		JoinRelationContext _localctx = new JoinRelationContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_joinRelation);
		try {
			setState(1543);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case JOIN:
			case CROSS:
			case INNER:
			case LEFT:
			case RIGHT:
			case FULL:
			case KNN:
			case ANTI:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1532);
				joinType();
				}
				setState(1533);
				match(JOIN);
				setState(1534);
				((JoinRelationContext)_localctx).right = relationPrimary();
				setState(1536);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,200,_ctx) ) {
				case 1:
					{
					setState(1535);
					joinCriteria();
					}
					break;
				}
				}
				break;
			case NATURAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(1538);
				match(NATURAL);
				setState(1539);
				joinType();
				setState(1540);
				match(JOIN);
				setState(1541);
				((JoinRelationContext)_localctx).right = relationPrimary();
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
	public static class JoinTypeContext extends ParserRuleContext {
		public TerminalNode INNER() { return getToken(SqlBaseParser.INNER, 0); }
		public TerminalNode CROSS() { return getToken(SqlBaseParser.CROSS, 0); }
		public TerminalNode LEFT() { return getToken(SqlBaseParser.LEFT, 0); }
		public TerminalNode OUTER() { return getToken(SqlBaseParser.OUTER, 0); }
		public TerminalNode SEMI() { return getToken(SqlBaseParser.SEMI, 0); }
		public TerminalNode RIGHT() { return getToken(SqlBaseParser.RIGHT, 0); }
		public TerminalNode FULL() { return getToken(SqlBaseParser.FULL, 0); }
		public TerminalNode ANTI() { return getToken(SqlBaseParser.ANTI, 0); }
		public TerminalNode KNN() { return getToken(SqlBaseParser.KNN, 0); }
		public JoinTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinType; }
	}

	public final JoinTypeContext joinType() throws RecognitionException {
		JoinTypeContext _localctx = new JoinTypeContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_joinType);
		int _la;
		try {
			setState(1568);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,207,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1546);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INNER) {
					{
					setState(1545);
					match(INNER);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1548);
				match(CROSS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1549);
				match(LEFT);
				setState(1551);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(1550);
					match(OUTER);
					}
				}

				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1553);
				match(LEFT);
				setState(1554);
				match(SEMI);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1555);
				match(RIGHT);
				setState(1557);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(1556);
					match(OUTER);
					}
				}

				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1559);
				match(FULL);
				setState(1561);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(1560);
					match(OUTER);
					}
				}

				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1564);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LEFT) {
					{
					setState(1563);
					match(LEFT);
					}
				}

				setState(1566);
				match(ANTI);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1567);
				match(KNN);
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
	public static class JoinCriteriaContext extends ParserRuleContext {
		public TerminalNode ON() { return getToken(SqlBaseParser.ON, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public TerminalNode USING() { return getToken(SqlBaseParser.USING, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode POINT() { return getToken(SqlBaseParser.POINT, 0); }
		public JoinCriteriaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinCriteria; }
	}

	public final JoinCriteriaContext joinCriteria() throws RecognitionException {
		JoinCriteriaContext _localctx = new JoinCriteriaContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_joinCriteria);
		int _la;
		try {
			setState(1588);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ON:
				enterOuterAlt(_localctx, 1);
				{
				setState(1570);
				match(ON);
				setState(1571);
				booleanExpression(0);
				}
				break;
			case USING:
				enterOuterAlt(_localctx, 2);
				{
				setState(1572);
				match(USING);
				setState(1586);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__0:
					{
					setState(1573);
					match(T__0);
					setState(1574);
					identifier();
					setState(1579);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__2) {
						{
						{
						setState(1575);
						match(T__2);
						setState(1576);
						identifier();
						}
						}
						setState(1581);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1582);
					match(T__1);
					}
					break;
				case POINT:
					{
					setState(1584);
					match(POINT);
					setState(1585);
					booleanExpression(0);
					}
					break;
				default:
					throw new NoViableAltException(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SampleContext extends ParserRuleContext {
		public Token percentage;
		public Token sampleType;
		public Token numerator;
		public Token denominator;
		public TerminalNode TABLESAMPLE() { return getToken(SqlBaseParser.TABLESAMPLE, 0); }
		public TerminalNode BYTELENGTH_LITERAL() { return getToken(SqlBaseParser.BYTELENGTH_LITERAL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode OUT() { return getToken(SqlBaseParser.OUT, 0); }
		public TerminalNode OF() { return getToken(SqlBaseParser.OF, 0); }
		public TerminalNode PERCENTLIT() { return getToken(SqlBaseParser.PERCENTLIT, 0); }
		public TerminalNode ROWS() { return getToken(SqlBaseParser.ROWS, 0); }
		public TerminalNode BUCKET() { return getToken(SqlBaseParser.BUCKET, 0); }
		public List<TerminalNode> INTEGER_VALUE() { return getTokens(SqlBaseParser.INTEGER_VALUE); }
		public TerminalNode INTEGER_VALUE(int i) {
			return getToken(SqlBaseParser.INTEGER_VALUE, i);
		}
		public TerminalNode DECIMAL_VALUE() { return getToken(SqlBaseParser.DECIMAL_VALUE, 0); }
		public TerminalNode ON() { return getToken(SqlBaseParser.ON, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public SampleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sample; }
	}

	public final SampleContext sample() throws RecognitionException {
		SampleContext _localctx = new SampleContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_sample);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1590);
			match(TABLESAMPLE);
			setState(1591);
			match(T__0);
			setState(1613);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,213,_ctx) ) {
			case 1:
				{
				{
				setState(1592);
				((SampleContext)_localctx).percentage = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==INTEGER_VALUE || _la==DECIMAL_VALUE) ) {
					((SampleContext)_localctx).percentage = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1593);
				((SampleContext)_localctx).sampleType = match(PERCENTLIT);
				}
				}
				break;
			case 2:
				{
				{
				setState(1594);
				expression();
				setState(1595);
				((SampleContext)_localctx).sampleType = match(ROWS);
				}
				}
				break;
			case 3:
				{
				setState(1597);
				((SampleContext)_localctx).sampleType = match(BYTELENGTH_LITERAL);
				}
				break;
			case 4:
				{
				{
				setState(1598);
				((SampleContext)_localctx).sampleType = match(BUCKET);
				setState(1599);
				((SampleContext)_localctx).numerator = match(INTEGER_VALUE);
				setState(1600);
				match(OUT);
				setState(1601);
				match(OF);
				setState(1602);
				((SampleContext)_localctx).denominator = match(INTEGER_VALUE);
				setState(1611);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ON) {
					{
					setState(1603);
					match(ON);
					setState(1609);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,211,_ctx) ) {
					case 1:
						{
						setState(1604);
						identifier();
						}
						break;
					case 2:
						{
						setState(1605);
						qualifiedName();
						setState(1606);
						match(T__0);
						setState(1607);
						match(T__1);
						}
						break;
					}
					}
				}

				}
				}
				break;
			}
			setState(1615);
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

	@SuppressWarnings("CheckReturnValue")
	public static class IdentifierListContext extends ParserRuleContext {
		public IdentifierSeqContext identifierSeq() {
			return getRuleContext(IdentifierSeqContext.class,0);
		}
		public IdentifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierList; }
	}

	public final IdentifierListContext identifierList() throws RecognitionException {
		IdentifierListContext _localctx = new IdentifierListContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_identifierList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1617);
			match(T__0);
			setState(1618);
			identifierSeq();
			setState(1619);
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

	@SuppressWarnings("CheckReturnValue")
	public static class IdentifierSeqContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public IdentifierSeqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierSeq; }
	}

	public final IdentifierSeqContext identifierSeq() throws RecognitionException {
		IdentifierSeqContext _localctx = new IdentifierSeqContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_identifierSeq);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1621);
			identifier();
			setState(1626);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,214,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1622);
					match(T__2);
					setState(1623);
					identifier();
					}
					} 
				}
				setState(1628);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,214,_ctx);
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
	public static class OrderedIdentifierListContext extends ParserRuleContext {
		public List<OrderedIdentifierContext> orderedIdentifier() {
			return getRuleContexts(OrderedIdentifierContext.class);
		}
		public OrderedIdentifierContext orderedIdentifier(int i) {
			return getRuleContext(OrderedIdentifierContext.class,i);
		}
		public OrderedIdentifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderedIdentifierList; }
	}

	public final OrderedIdentifierListContext orderedIdentifierList() throws RecognitionException {
		OrderedIdentifierListContext _localctx = new OrderedIdentifierListContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_orderedIdentifierList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1629);
			match(T__0);
			setState(1630);
			orderedIdentifier();
			setState(1635);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(1631);
				match(T__2);
				setState(1632);
				orderedIdentifier();
				}
				}
				setState(1637);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1638);
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

	@SuppressWarnings("CheckReturnValue")
	public static class OrderedIdentifierContext extends ParserRuleContext {
		public Token ordering;
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode ASC() { return getToken(SqlBaseParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(SqlBaseParser.DESC, 0); }
		public OrderedIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderedIdentifier; }
	}

	public final OrderedIdentifierContext orderedIdentifier() throws RecognitionException {
		OrderedIdentifierContext _localctx = new OrderedIdentifierContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_orderedIdentifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1640);
			identifier();
			setState(1642);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(1641);
				((OrderedIdentifierContext)_localctx).ordering = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ASC || _la==DESC) ) {
					((OrderedIdentifierContext)_localctx).ordering = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
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
	public static class IdentifierCommentListContext extends ParserRuleContext {
		public List<IdentifierCommentContext> identifierComment() {
			return getRuleContexts(IdentifierCommentContext.class);
		}
		public IdentifierCommentContext identifierComment(int i) {
			return getRuleContext(IdentifierCommentContext.class,i);
		}
		public IdentifierCommentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierCommentList; }
	}

	public final IdentifierCommentListContext identifierCommentList() throws RecognitionException {
		IdentifierCommentListContext _localctx = new IdentifierCommentListContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_identifierCommentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1644);
			match(T__0);
			setState(1645);
			identifierComment();
			setState(1650);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(1646);
				match(T__2);
				setState(1647);
				identifierComment();
				}
				}
				setState(1652);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1653);
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

	@SuppressWarnings("CheckReturnValue")
	public static class IdentifierCommentContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode COMMENT() { return getToken(SqlBaseParser.COMMENT, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public IdentifierCommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierComment; }
	}

	public final IdentifierCommentContext identifierComment() throws RecognitionException {
		IdentifierCommentContext _localctx = new IdentifierCommentContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_identifierComment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1655);
			identifier();
			setState(1658);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMENT) {
				{
				setState(1656);
				match(COMMENT);
				setState(1657);
				match(STRING);
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
	public static class RelationPrimaryContext extends ParserRuleContext {
		public RelationPrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationPrimary; }
	 
		public RelationPrimaryContext() { }
		public void copyFrom(RelationPrimaryContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TableValuedFunctionContext extends RelationPrimaryContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TableValuedFunctionContext(RelationPrimaryContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InlineTableDefault2Context extends RelationPrimaryContext {
		public InlineTableContext inlineTable() {
			return getRuleContext(InlineTableContext.class,0);
		}
		public InlineTableDefault2Context(RelationPrimaryContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AliasedRelationContext extends RelationPrimaryContext {
		public RelationContext relation() {
			return getRuleContext(RelationContext.class,0);
		}
		public SampleContext sample() {
			return getRuleContext(SampleContext.class,0);
		}
		public StrictIdentifierContext strictIdentifier() {
			return getRuleContext(StrictIdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public AliasedRelationContext(RelationPrimaryContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AliasedQueryContext extends RelationPrimaryContext {
		public QueryNoWithContext queryNoWith() {
			return getRuleContext(QueryNoWithContext.class,0);
		}
		public SampleContext sample() {
			return getRuleContext(SampleContext.class,0);
		}
		public StrictIdentifierContext strictIdentifier() {
			return getRuleContext(StrictIdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public AliasedQueryContext(RelationPrimaryContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TableNameContext extends RelationPrimaryContext {
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public SampleContext sample() {
			return getRuleContext(SampleContext.class,0);
		}
		public StrictIdentifierContext strictIdentifier() {
			return getRuleContext(StrictIdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public TableNameContext(RelationPrimaryContext ctx) { copyFrom(ctx); }
	}

	public final RelationPrimaryContext relationPrimary() throws RecognitionException {
		RelationPrimaryContext _localctx = new RelationPrimaryContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_relationPrimary);
		int _la;
		try {
			setState(1709);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,230,_ctx) ) {
			case 1:
				_localctx = new TableNameContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1660);
				tableIdentifier();
				setState(1662);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,219,_ctx) ) {
				case 1:
					{
					setState(1661);
					sample();
					}
					break;
				}
				setState(1668);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,221,_ctx) ) {
				case 1:
					{
					setState(1665);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,220,_ctx) ) {
					case 1:
						{
						setState(1664);
						match(AS);
						}
						break;
					}
					setState(1667);
					strictIdentifier();
					}
					break;
				}
				}
				break;
			case 2:
				_localctx = new AliasedQueryContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1670);
				match(T__0);
				setState(1671);
				queryNoWith();
				setState(1672);
				match(T__1);
				setState(1674);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,222,_ctx) ) {
				case 1:
					{
					setState(1673);
					sample();
					}
					break;
				}
				setState(1680);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,224,_ctx) ) {
				case 1:
					{
					setState(1677);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,223,_ctx) ) {
					case 1:
						{
						setState(1676);
						match(AS);
						}
						break;
					}
					setState(1679);
					strictIdentifier();
					}
					break;
				}
				}
				break;
			case 3:
				_localctx = new AliasedRelationContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1682);
				match(T__0);
				setState(1683);
				relation();
				setState(1684);
				match(T__1);
				setState(1686);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,225,_ctx) ) {
				case 1:
					{
					setState(1685);
					sample();
					}
					break;
				}
				setState(1692);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,227,_ctx) ) {
				case 1:
					{
					setState(1689);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,226,_ctx) ) {
					case 1:
						{
						setState(1688);
						match(AS);
						}
						break;
					}
					setState(1691);
					strictIdentifier();
					}
					break;
				}
				}
				break;
			case 4:
				_localctx = new InlineTableDefault2Context(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1694);
				inlineTable();
				}
				break;
			case 5:
				_localctx = new TableValuedFunctionContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1695);
				identifier();
				setState(1696);
				match(T__0);
				setState(1705);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -1022L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 720575940379279359L) != 0) || ((((_la - 132)) & ~0x3f) == 0 && ((1L << (_la - 132)) & -921L) != 0) || ((((_la - 196)) & ~0x3f) == 0 && ((1L << (_la - 196)) & 279275953455103L) != 0)) {
					{
					setState(1697);
					expression();
					setState(1702);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__2) {
						{
						{
						setState(1698);
						match(T__2);
						setState(1699);
						expression();
						}
						}
						setState(1704);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1707);
				match(T__1);
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
	public static class InlineTableContext extends ParserRuleContext {
		public TerminalNode VALUES() { return getToken(SqlBaseParser.VALUES, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public InlineTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inlineTable; }
	}

	public final InlineTableContext inlineTable() throws RecognitionException {
		InlineTableContext _localctx = new InlineTableContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_inlineTable);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1711);
			match(VALUES);
			setState(1712);
			expression();
			setState(1717);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,231,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1713);
					match(T__2);
					setState(1714);
					expression();
					}
					} 
				}
				setState(1719);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,231,_ctx);
			}
			setState(1727);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,234,_ctx) ) {
			case 1:
				{
				setState(1721);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,232,_ctx) ) {
				case 1:
					{
					setState(1720);
					match(AS);
					}
					break;
				}
				setState(1723);
				identifier();
				setState(1725);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,233,_ctx) ) {
				case 1:
					{
					setState(1724);
					identifierList();
					}
					break;
				}
				}
				break;
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
	public static class RowFormatContext extends ParserRuleContext {
		public RowFormatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rowFormat; }
	 
		public RowFormatContext() { }
		public void copyFrom(RowFormatContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RowFormatSerdeContext extends RowFormatContext {
		public Token name;
		public TablePropertyListContext props;
		public TerminalNode ROW() { return getToken(SqlBaseParser.ROW, 0); }
		public TerminalNode FORMAT() { return getToken(SqlBaseParser.FORMAT, 0); }
		public TerminalNode SERDE() { return getToken(SqlBaseParser.SERDE, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public TerminalNode WITH() { return getToken(SqlBaseParser.WITH, 0); }
		public TerminalNode SERDEPROPERTIES() { return getToken(SqlBaseParser.SERDEPROPERTIES, 0); }
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public RowFormatSerdeContext(RowFormatContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RowFormatDelimitedContext extends RowFormatContext {
		public Token fieldsTerminatedBy;
		public Token escapedBy;
		public Token collectionItemsTerminatedBy;
		public Token keysTerminatedBy;
		public Token linesSeparatedBy;
		public Token nullDefinedAs;
		public TerminalNode ROW() { return getToken(SqlBaseParser.ROW, 0); }
		public TerminalNode FORMAT() { return getToken(SqlBaseParser.FORMAT, 0); }
		public TerminalNode DELIMITED() { return getToken(SqlBaseParser.DELIMITED, 0); }
		public TerminalNode FIELDS() { return getToken(SqlBaseParser.FIELDS, 0); }
		public List<TerminalNode> TERMINATED() { return getTokens(SqlBaseParser.TERMINATED); }
		public TerminalNode TERMINATED(int i) {
			return getToken(SqlBaseParser.TERMINATED, i);
		}
		public List<TerminalNode> BY() { return getTokens(SqlBaseParser.BY); }
		public TerminalNode BY(int i) {
			return getToken(SqlBaseParser.BY, i);
		}
		public TerminalNode COLLECTION() { return getToken(SqlBaseParser.COLLECTION, 0); }
		public TerminalNode ITEMS() { return getToken(SqlBaseParser.ITEMS, 0); }
		public TerminalNode MAP() { return getToken(SqlBaseParser.MAP, 0); }
		public TerminalNode KEYS() { return getToken(SqlBaseParser.KEYS, 0); }
		public TerminalNode LINES() { return getToken(SqlBaseParser.LINES, 0); }
		public TerminalNode NULL() { return getToken(SqlBaseParser.NULL, 0); }
		public TerminalNode DEFINED() { return getToken(SqlBaseParser.DEFINED, 0); }
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public List<TerminalNode> STRING() { return getTokens(SqlBaseParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(SqlBaseParser.STRING, i);
		}
		public TerminalNode ESCAPED() { return getToken(SqlBaseParser.ESCAPED, 0); }
		public RowFormatDelimitedContext(RowFormatContext ctx) { copyFrom(ctx); }
	}

	public final RowFormatContext rowFormat() throws RecognitionException {
		RowFormatContext _localctx = new RowFormatContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_rowFormat);
		try {
			setState(1778);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,242,_ctx) ) {
			case 1:
				_localctx = new RowFormatSerdeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1729);
				match(ROW);
				setState(1730);
				match(FORMAT);
				setState(1731);
				match(SERDE);
				setState(1732);
				((RowFormatSerdeContext)_localctx).name = match(STRING);
				setState(1736);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,235,_ctx) ) {
				case 1:
					{
					setState(1733);
					match(WITH);
					setState(1734);
					match(SERDEPROPERTIES);
					setState(1735);
					((RowFormatSerdeContext)_localctx).props = tablePropertyList();
					}
					break;
				}
				}
				break;
			case 2:
				_localctx = new RowFormatDelimitedContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1738);
				match(ROW);
				setState(1739);
				match(FORMAT);
				setState(1740);
				match(DELIMITED);
				setState(1750);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,237,_ctx) ) {
				case 1:
					{
					setState(1741);
					match(FIELDS);
					setState(1742);
					match(TERMINATED);
					setState(1743);
					match(BY);
					setState(1744);
					((RowFormatDelimitedContext)_localctx).fieldsTerminatedBy = match(STRING);
					setState(1748);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,236,_ctx) ) {
					case 1:
						{
						setState(1745);
						match(ESCAPED);
						setState(1746);
						match(BY);
						setState(1747);
						((RowFormatDelimitedContext)_localctx).escapedBy = match(STRING);
						}
						break;
					}
					}
					break;
				}
				setState(1757);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,238,_ctx) ) {
				case 1:
					{
					setState(1752);
					match(COLLECTION);
					setState(1753);
					match(ITEMS);
					setState(1754);
					match(TERMINATED);
					setState(1755);
					match(BY);
					setState(1756);
					((RowFormatDelimitedContext)_localctx).collectionItemsTerminatedBy = match(STRING);
					}
					break;
				}
				setState(1764);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,239,_ctx) ) {
				case 1:
					{
					setState(1759);
					match(MAP);
					setState(1760);
					match(KEYS);
					setState(1761);
					match(TERMINATED);
					setState(1762);
					match(BY);
					setState(1763);
					((RowFormatDelimitedContext)_localctx).keysTerminatedBy = match(STRING);
					}
					break;
				}
				setState(1770);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,240,_ctx) ) {
				case 1:
					{
					setState(1766);
					match(LINES);
					setState(1767);
					match(TERMINATED);
					setState(1768);
					match(BY);
					setState(1769);
					((RowFormatDelimitedContext)_localctx).linesSeparatedBy = match(STRING);
					}
					break;
				}
				setState(1776);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,241,_ctx) ) {
				case 1:
					{
					setState(1772);
					match(NULL);
					setState(1773);
					match(DEFINED);
					setState(1774);
					match(AS);
					setState(1775);
					((RowFormatDelimitedContext)_localctx).nullDefinedAs = match(STRING);
					}
					break;
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
	public static class TableIdentifierContext extends ParserRuleContext {
		public IdentifierContext db;
		public IdentifierContext table;
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TableIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableIdentifier; }
	}

	public final TableIdentifierContext tableIdentifier() throws RecognitionException {
		TableIdentifierContext _localctx = new TableIdentifierContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_tableIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1783);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,243,_ctx) ) {
			case 1:
				{
				setState(1780);
				((TableIdentifierContext)_localctx).db = identifier();
				setState(1781);
				match(T__3);
				}
				break;
			}
			setState(1785);
			((TableIdentifierContext)_localctx).table = identifier();
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
	public static class FunctionIdentifierContext extends ParserRuleContext {
		public IdentifierContext db;
		public IdentifierContext function;
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public FunctionIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionIdentifier; }
	}

	public final FunctionIdentifierContext functionIdentifier() throws RecognitionException {
		FunctionIdentifierContext _localctx = new FunctionIdentifierContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_functionIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1790);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,244,_ctx) ) {
			case 1:
				{
				setState(1787);
				((FunctionIdentifierContext)_localctx).db = identifier();
				setState(1788);
				match(T__3);
				}
				break;
			}
			setState(1792);
			((FunctionIdentifierContext)_localctx).function = identifier();
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
	public static class NamedExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public NamedExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedExpression; }
	}

	public final NamedExpressionContext namedExpression() throws RecognitionException {
		NamedExpressionContext _localctx = new NamedExpressionContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_namedExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1794);
			expression();
			setState(1802);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,247,_ctx) ) {
			case 1:
				{
				setState(1796);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,245,_ctx) ) {
				case 1:
					{
					setState(1795);
					match(AS);
					}
					break;
				}
				setState(1800);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SELECT:
				case FROM:
				case ADD:
				case AS:
				case ALL:
				case DISTINCT:
				case WHERE:
				case GROUP:
				case BY:
				case GROUPING:
				case SETS:
				case CUBE:
				case ROLLUP:
				case ORDER:
				case HAVING:
				case LIMIT:
				case AT:
				case OR:
				case AND:
				case IN:
				case NOT:
				case NO:
				case EXISTS:
				case BETWEEN:
				case LIKE:
				case RLIKE:
				case IS:
				case NULL:
				case TRUE:
				case FALSE:
				case NULLS:
				case ASC:
				case DESC:
				case FOR:
				case INTERVAL:
				case CASE:
				case WHEN:
				case THEN:
				case ELSE:
				case END:
				case JOIN:
				case CROSS:
				case OUTER:
				case INNER:
				case LEFT:
				case SEMI:
				case RIGHT:
				case FULL:
				case NATURAL:
				case ON:
				case LATERAL:
				case WINDOW:
				case OVER:
				case PARTITION:
				case RANGE:
				case ROWS:
				case UNBOUNDED:
				case PRECEDING:
				case FOLLOWING:
				case CURRENT:
				case FIRST:
				case AFTER:
				case LAST:
				case ROW:
				case WITH:
				case VALUES:
				case CREATE:
				case TABLE:
				case VIEW:
				case REPLACE:
				case INSERT:
				case DELETE:
				case INTO:
				case DESCRIBE:
				case EXPLAIN:
				case FORMAT:
				case LOGICAL:
				case CODEGEN:
				case COST:
				case CAST:
				case SHOW:
				case TABLES:
				case COLUMNS:
				case COLUMN:
				case USE:
				case PARTITIONS:
				case FUNCTIONS:
				case DROP:
				case UNION:
				case EXCEPT:
				case SETMINUS:
				case INTERSECT:
				case TO:
				case TABLESAMPLE:
				case STRATIFY:
				case ALTER:
				case RENAME:
				case ARRAY:
				case MAP:
				case STRUCT:
				case COMMENT:
				case SET:
				case RESET:
				case DATA:
				case START:
				case TRANSACTION:
				case COMMIT:
				case ROLLBACK:
				case MACRO:
				case IGNORE:
				case KNN:
				case IF:
				case DIV:
				case PERCENTLIT:
				case BUCKET:
				case OUT:
				case OF:
				case SORT:
				case CLUSTER:
				case DISTRIBUTE:
				case OVERWRITE:
				case TRANSFORM:
				case REDUCE:
				case USING:
				case SERDE:
				case SERDEPROPERTIES:
				case RECORDREADER:
				case RECORDWRITER:
				case DELIMITED:
				case FIELDS:
				case TERMINATED:
				case COLLECTION:
				case ITEMS:
				case KEYS:
				case ESCAPED:
				case LINES:
				case SEPARATED:
				case FUNCTION:
				case EXTENDED:
				case REFRESH:
				case CLEAR:
				case CACHE:
				case UNCACHE:
				case LAZY:
				case FORMATTED:
				case GLOBAL:
				case TEMPORARY:
				case OPTIONS:
				case UNSET:
				case TBLPROPERTIES:
				case DBPROPERTIES:
				case BUCKETS:
				case SKEWED:
				case STORED:
				case DIRECTORIES:
				case LOCATION:
				case EXCHANGE:
				case ARCHIVE:
				case UNARCHIVE:
				case FILEFORMAT:
				case TOUCH:
				case COMPACT:
				case CONCATENATE:
				case CHANGE:
				case CASCADE:
				case RESTRICT:
				case CLUSTERED:
				case SORTED:
				case PURGE:
				case INPUTFORMAT:
				case OUTPUTFORMAT:
				case DATABASE:
				case DATABASES:
				case DFS:
				case TRUNCATE:
				case ANALYZE:
				case COMPUTE:
				case LIST:
				case STATISTICS:
				case PARTITIONED:
				case EXTERNAL:
				case DEFINED:
				case REVOKE:
				case GRANT:
				case LOCK:
				case UNLOCK:
				case MSCK:
				case REPAIR:
				case RECOVER:
				case EXPORT:
				case IMPORT:
				case LOAD:
				case ROLE:
				case ROLES:
				case COMPACTIONS:
				case PRINCIPALS:
				case TRANSACTIONS:
				case INDEX:
				case INDEXES:
				case LOCKS:
				case OPTION:
				case ANTI:
				case LOCAL:
				case INPATH:
				case IDENTIFIER:
				case BACKQUOTED_IDENTIFIER:
					{
					setState(1798);
					identifier();
					}
					break;
				case T__0:
					{
					setState(1799);
					identifierList();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
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
	public static class NamedExpressionSeqContext extends ParserRuleContext {
		public List<NamedExpressionContext> namedExpression() {
			return getRuleContexts(NamedExpressionContext.class);
		}
		public NamedExpressionContext namedExpression(int i) {
			return getRuleContext(NamedExpressionContext.class,i);
		}
		public NamedExpressionSeqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedExpressionSeq; }
	}

	public final NamedExpressionSeqContext namedExpressionSeq() throws RecognitionException {
		NamedExpressionSeqContext _localctx = new NamedExpressionSeqContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_namedExpressionSeq);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1804);
			namedExpression();
			setState(1809);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,248,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1805);
					match(T__2);
					setState(1806);
					namedExpression();
					}
					} 
				}
				setState(1811);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,248,_ctx);
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
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1812);
			booleanExpression(0);
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
	public static class BooleanExpressionContext extends ParserRuleContext {
		public BooleanExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanExpression; }
	 
		public BooleanExpressionContext() { }
		public void copyFrom(BooleanExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BooleanDefaultSpatialContext extends BooleanExpressionContext {
		public SpatialpredicatedContext spatialpredicated() {
			return getRuleContext(SpatialpredicatedContext.class,0);
		}
		public BooleanDefaultSpatialContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LogicalNotContext extends BooleanExpressionContext {
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public LogicalNotContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BooleanDefaultContext extends BooleanExpressionContext {
		public PredicatedContext predicated() {
			return getRuleContext(PredicatedContext.class,0);
		}
		public BooleanDefaultContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExistsContext extends BooleanExpressionContext {
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public ExistsContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LogicalBinaryContext extends BooleanExpressionContext {
		public BooleanExpressionContext left;
		public Token operator;
		public BooleanExpressionContext right;
		public List<BooleanExpressionContext> booleanExpression() {
			return getRuleContexts(BooleanExpressionContext.class);
		}
		public BooleanExpressionContext booleanExpression(int i) {
			return getRuleContext(BooleanExpressionContext.class,i);
		}
		public TerminalNode AND() { return getToken(SqlBaseParser.AND, 0); }
		public TerminalNode OR() { return getToken(SqlBaseParser.OR, 0); }
		public LogicalBinaryContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
	}

	public final BooleanExpressionContext booleanExpression() throws RecognitionException {
		return booleanExpression(0);
	}

	private BooleanExpressionContext booleanExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BooleanExpressionContext _localctx = new BooleanExpressionContext(_ctx, _parentState);
		BooleanExpressionContext _prevctx = _localctx;
		int _startState = 128;
		enterRecursionRule(_localctx, 128, RULE_booleanExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1824);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,249,_ctx) ) {
			case 1:
				{
				_localctx = new LogicalNotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(1815);
				match(NOT);
				setState(1816);
				booleanExpression(6);
				}
				break;
			case 2:
				{
				_localctx = new ExistsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1817);
				match(EXISTS);
				setState(1818);
				match(T__0);
				setState(1819);
				query();
				setState(1820);
				match(T__1);
				}
				break;
			case 3:
				{
				_localctx = new BooleanDefaultContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1822);
				predicated();
				}
				break;
			case 4:
				{
				_localctx = new BooleanDefaultSpatialContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1823);
				spatialpredicated();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1834);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,251,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1832);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,250,_ctx) ) {
					case 1:
						{
						_localctx = new LogicalBinaryContext(new BooleanExpressionContext(_parentctx, _parentState));
						((LogicalBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_booleanExpression);
						setState(1826);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1827);
						((LogicalBinaryContext)_localctx).operator = match(AND);
						setState(1828);
						((LogicalBinaryContext)_localctx).right = booleanExpression(3);
						}
						break;
					case 2:
						{
						_localctx = new LogicalBinaryContext(new BooleanExpressionContext(_parentctx, _parentState));
						((LogicalBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_booleanExpression);
						setState(1829);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1830);
						((LogicalBinaryContext)_localctx).operator = match(OR);
						setState(1831);
						((LogicalBinaryContext)_localctx).right = booleanExpression(2);
						}
						break;
					}
					} 
				}
				setState(1836);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,251,_ctx);
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
	public static class PredicatedContext extends ParserRuleContext {
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public PredicatedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicated; }
	}

	public final PredicatedContext predicated() throws RecognitionException {
		PredicatedContext _localctx = new PredicatedContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_predicated);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1837);
			valueExpression(0);
			setState(1839);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,252,_ctx) ) {
			case 1:
				{
				setState(1838);
				predicate();
				}
				break;
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
	public static class SpatialpredicatedContext extends ParserRuleContext {
		public Token kind;
		public Myexpressionlist1Context myexpressionlist1() {
			return getRuleContext(Myexpressionlist1Context.class,0);
		}
		public TerminalNode POINT() { return getToken(SqlBaseParser.POINT, 0); }
		public Myexpressionlist2Context myexpressionlist2() {
			return getRuleContext(Myexpressionlist2Context.class,0);
		}
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public TerminalNode KNNPRED() { return getToken(SqlBaseParser.KNNPRED, 0); }
		public SpatialpredicatedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_spatialpredicated; }
	}

	public final SpatialpredicatedContext spatialpredicated() throws RecognitionException {
		SpatialpredicatedContext _localctx = new SpatialpredicatedContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_spatialpredicated);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1841);
			myexpressionlist1();
			setState(1842);
			((SpatialpredicatedContext)_localctx).kind = match(KNNPRED);
			setState(1843);
			match(T__0);
			setState(1844);
			match(POINT);
			setState(1845);
			myexpressionlist2();
			setState(1846);
			match(T__2);
			setState(1847);
			valueExpression(0);
			setState(1848);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PredicateContext extends ParserRuleContext {
		public Token kind;
		public ValueExpressionContext lower;
		public ValueExpressionContext upper;
		public ValueExpressionContext pattern;
		public TerminalNode AND() { return getToken(SqlBaseParser.AND, 0); }
		public TerminalNode BETWEEN() { return getToken(SqlBaseParser.BETWEEN, 0); }
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode IN() { return getToken(SqlBaseParser.IN, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode RLIKE() { return getToken(SqlBaseParser.RLIKE, 0); }
		public TerminalNode LIKE() { return getToken(SqlBaseParser.LIKE, 0); }
		public TerminalNode IS() { return getToken(SqlBaseParser.IS, 0); }
		public TerminalNode NULL() { return getToken(SqlBaseParser.NULL, 0); }
		public PredicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicate; }
	}

	public final PredicateContext predicate() throws RecognitionException {
		PredicateContext _localctx = new PredicateContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_predicate);
		int _la;
		try {
			setState(1891);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,259,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1851);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1850);
					match(NOT);
					}
				}

				setState(1853);
				((PredicateContext)_localctx).kind = match(BETWEEN);
				setState(1854);
				((PredicateContext)_localctx).lower = valueExpression(0);
				setState(1855);
				match(AND);
				setState(1856);
				((PredicateContext)_localctx).upper = valueExpression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1859);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1858);
					match(NOT);
					}
				}

				setState(1861);
				((PredicateContext)_localctx).kind = match(IN);
				setState(1862);
				match(T__0);
				setState(1863);
				expression();
				setState(1868);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(1864);
					match(T__2);
					setState(1865);
					expression();
					}
					}
					setState(1870);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1871);
				match(T__1);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1874);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1873);
					match(NOT);
					}
				}

				setState(1876);
				((PredicateContext)_localctx).kind = match(IN);
				setState(1877);
				match(T__0);
				setState(1878);
				query();
				setState(1879);
				match(T__1);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1882);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1881);
					match(NOT);
					}
				}

				setState(1884);
				((PredicateContext)_localctx).kind = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==LIKE || _la==RLIKE) ) {
					((PredicateContext)_localctx).kind = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1885);
				((PredicateContext)_localctx).pattern = valueExpression(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1886);
				match(IS);
				setState(1888);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1887);
					match(NOT);
					}
				}

				setState(1890);
				((PredicateContext)_localctx).kind = match(NULL);
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
	public static class Myexpressionlist1Context extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Myexpressionlist1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_myexpressionlist1; }
	}

	public final Myexpressionlist1Context myexpressionlist1() throws RecognitionException {
		Myexpressionlist1Context _localctx = new Myexpressionlist1Context(_ctx, getState());
		enterRule(_localctx, 136, RULE_myexpressionlist1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1893);
			match(T__0);
			setState(1894);
			expression();
			setState(1899);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(1895);
				match(T__2);
				setState(1896);
				expression();
				}
				}
				setState(1901);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1902);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Myexpressionlist2Context extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Myexpressionlist2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_myexpressionlist2; }
	}

	public final Myexpressionlist2Context myexpressionlist2() throws RecognitionException {
		Myexpressionlist2Context _localctx = new Myexpressionlist2Context(_ctx, getState());
		enterRule(_localctx, 138, RULE_myexpressionlist2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1904);
			match(T__0);
			setState(1905);
			expression();
			setState(1910);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(1906);
				match(T__2);
				setState(1907);
				expression();
				}
				}
				setState(1912);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1913);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ValueExpressionContext extends ParserRuleContext {
		public ValueExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valueExpression; }
	 
		public ValueExpressionContext() { }
		public void copyFrom(ValueExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ValueExpressionDefaultContext extends ValueExpressionContext {
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public ValueExpressionDefaultContext(ValueExpressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ComparisonContext extends ValueExpressionContext {
		public ValueExpressionContext left;
		public ValueExpressionContext right;
		public ComparisonOperatorContext comparisonOperator() {
			return getRuleContext(ComparisonOperatorContext.class,0);
		}
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public ComparisonContext(ValueExpressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArithmeticBinaryContext extends ValueExpressionContext {
		public ValueExpressionContext left;
		public Token operator;
		public ValueExpressionContext right;
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public TerminalNode ASTERISK() { return getToken(SqlBaseParser.ASTERISK, 0); }
		public TerminalNode SLASH() { return getToken(SqlBaseParser.SLASH, 0); }
		public TerminalNode PERCENT() { return getToken(SqlBaseParser.PERCENT, 0); }
		public TerminalNode DIV() { return getToken(SqlBaseParser.DIV, 0); }
		public TerminalNode PLUS() { return getToken(SqlBaseParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public TerminalNode AMPERSAND() { return getToken(SqlBaseParser.AMPERSAND, 0); }
		public TerminalNode HAT() { return getToken(SqlBaseParser.HAT, 0); }
		public TerminalNode PIPE() { return getToken(SqlBaseParser.PIPE, 0); }
		public ArithmeticBinaryContext(ValueExpressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArithmeticUnaryContext extends ValueExpressionContext {
		public Token operator;
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public TerminalNode PLUS() { return getToken(SqlBaseParser.PLUS, 0); }
		public TerminalNode TILDE() { return getToken(SqlBaseParser.TILDE, 0); }
		public ArithmeticUnaryContext(ValueExpressionContext ctx) { copyFrom(ctx); }
	}

	public final ValueExpressionContext valueExpression() throws RecognitionException {
		return valueExpression(0);
	}

	private ValueExpressionContext valueExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ValueExpressionContext _localctx = new ValueExpressionContext(_ctx, _parentState);
		ValueExpressionContext _prevctx = _localctx;
		int _startState = 140;
		enterRecursionRule(_localctx, 140, RULE_valueExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1919);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,262,_ctx) ) {
			case 1:
				{
				_localctx = new ValueExpressionDefaultContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(1916);
				primaryExpression(0);
				}
				break;
			case 2:
				{
				_localctx = new ArithmeticUnaryContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1917);
				((ArithmeticUnaryContext)_localctx).operator = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 132)) & ~0x3f) == 0 && ((1L << (_la - 132)) & 67L) != 0)) ) {
					((ArithmeticUnaryContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1918);
				valueExpression(7);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1942);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,264,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1940);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,263,_ctx) ) {
					case 1:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(1921);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(1922);
						((ArithmeticBinaryContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 134)) & ~0x3f) == 0 && ((1L << (_la - 134)) & 15L) != 0)) ) {
							((ArithmeticBinaryContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1923);
						((ArithmeticBinaryContext)_localctx).right = valueExpression(7);
						}
						break;
					case 2:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(1924);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1925);
						((ArithmeticBinaryContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
							((ArithmeticBinaryContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1926);
						((ArithmeticBinaryContext)_localctx).right = valueExpression(6);
						}
						break;
					case 3:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(1927);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(1928);
						((ArithmeticBinaryContext)_localctx).operator = match(AMPERSAND);
						setState(1929);
						((ArithmeticBinaryContext)_localctx).right = valueExpression(5);
						}
						break;
					case 4:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(1930);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1931);
						((ArithmeticBinaryContext)_localctx).operator = match(HAT);
						setState(1932);
						((ArithmeticBinaryContext)_localctx).right = valueExpression(4);
						}
						break;
					case 5:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(1933);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1934);
						((ArithmeticBinaryContext)_localctx).operator = match(PIPE);
						setState(1935);
						((ArithmeticBinaryContext)_localctx).right = valueExpression(3);
						}
						break;
					case 6:
						{
						_localctx = new ComparisonContext(new ValueExpressionContext(_parentctx, _parentState));
						((ComparisonContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(1936);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1937);
						comparisonOperator();
						setState(1938);
						((ComparisonContext)_localctx).right = valueExpression(2);
						}
						break;
					}
					} 
				}
				setState(1944);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,264,_ctx);
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
	public static class PrimaryExpressionContext extends ParserRuleContext {
		public PrimaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpression; }
	 
		public PrimaryExpressionContext() { }
		public void copyFrom(PrimaryExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StructContext extends PrimaryExpressionContext {
		public NamedExpressionContext namedExpression;
		public List<NamedExpressionContext> argument = new ArrayList<NamedExpressionContext>();
		public TerminalNode STRUCT() { return getToken(SqlBaseParser.STRUCT, 0); }
		public List<NamedExpressionContext> namedExpression() {
			return getRuleContexts(NamedExpressionContext.class);
		}
		public NamedExpressionContext namedExpression(int i) {
			return getRuleContext(NamedExpressionContext.class,i);
		}
		public StructContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DereferenceContext extends PrimaryExpressionContext {
		public PrimaryExpressionContext base;
		public IdentifierContext fieldName;
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DereferenceContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SimpleCaseContext extends PrimaryExpressionContext {
		public ExpressionContext value;
		public ExpressionContext elseExpression;
		public TerminalNode CASE() { return getToken(SqlBaseParser.CASE, 0); }
		public TerminalNode END() { return getToken(SqlBaseParser.END, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<WhenClauseContext> whenClause() {
			return getRuleContexts(WhenClauseContext.class);
		}
		public WhenClauseContext whenClause(int i) {
			return getRuleContext(WhenClauseContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(SqlBaseParser.ELSE, 0); }
		public SimpleCaseContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ColumnReferenceContext extends PrimaryExpressionContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ColumnReferenceContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RowConstructorContext extends PrimaryExpressionContext {
		public List<NamedExpressionContext> namedExpression() {
			return getRuleContexts(NamedExpressionContext.class);
		}
		public NamedExpressionContext namedExpression(int i) {
			return getRuleContext(NamedExpressionContext.class,i);
		}
		public RowConstructorContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LastContext extends PrimaryExpressionContext {
		public TerminalNode LAST() { return getToken(SqlBaseParser.LAST, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode IGNORE() { return getToken(SqlBaseParser.IGNORE, 0); }
		public TerminalNode NULLS() { return getToken(SqlBaseParser.NULLS, 0); }
		public LastContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StarContext extends PrimaryExpressionContext {
		public TerminalNode ASTERISK() { return getToken(SqlBaseParser.ASTERISK, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public StarContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SubscriptContext extends PrimaryExpressionContext {
		public PrimaryExpressionContext value;
		public ValueExpressionContext index;
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public SubscriptContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SubqueryExpressionContext extends PrimaryExpressionContext {
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public SubqueryExpressionContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CastContext extends PrimaryExpressionContext {
		public TerminalNode CAST() { return getToken(SqlBaseParser.CAST, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public CastContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ConstantDefaultContext extends PrimaryExpressionContext {
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public ConstantDefaultContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParenthesizedExpressionContext extends PrimaryExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParenthesizedExpressionContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionCallContext extends PrimaryExpressionContext {
		public ExpressionContext expression;
		public List<ExpressionContext> argument = new ArrayList<ExpressionContext>();
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode OVER() { return getToken(SqlBaseParser.OVER, 0); }
		public WindowSpecContext windowSpec() {
			return getRuleContext(WindowSpecContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public SetQuantifierContext setQuantifier() {
			return getRuleContext(SetQuantifierContext.class,0);
		}
		public FunctionCallContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SearchedCaseContext extends PrimaryExpressionContext {
		public ExpressionContext elseExpression;
		public TerminalNode CASE() { return getToken(SqlBaseParser.CASE, 0); }
		public TerminalNode END() { return getToken(SqlBaseParser.END, 0); }
		public List<WhenClauseContext> whenClause() {
			return getRuleContexts(WhenClauseContext.class);
		}
		public WhenClauseContext whenClause(int i) {
			return getRuleContext(WhenClauseContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(SqlBaseParser.ELSE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SearchedCaseContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FirstContext extends PrimaryExpressionContext {
		public TerminalNode FIRST() { return getToken(SqlBaseParser.FIRST, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode IGNORE() { return getToken(SqlBaseParser.IGNORE, 0); }
		public TerminalNode NULLS() { return getToken(SqlBaseParser.NULLS, 0); }
		public FirstContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
	}

	public final PrimaryExpressionContext primaryExpression() throws RecognitionException {
		return primaryExpression(0);
	}

	private PrimaryExpressionContext primaryExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PrimaryExpressionContext _localctx = new PrimaryExpressionContext(_ctx, _parentState);
		PrimaryExpressionContext _prevctx = _localctx;
		int _startState = 142;
		enterRecursionRule(_localctx, 142, RULE_primaryExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2054);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,278,_ctx) ) {
			case 1:
				{
				_localctx = new SearchedCaseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(1946);
				match(CASE);
				setState(1948); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1947);
					whenClause();
					}
					}
					setState(1950); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WHEN );
				setState(1954);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(1952);
					match(ELSE);
					setState(1953);
					((SearchedCaseContext)_localctx).elseExpression = expression();
					}
				}

				setState(1956);
				match(END);
				}
				break;
			case 2:
				{
				_localctx = new SimpleCaseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1958);
				match(CASE);
				setState(1959);
				((SimpleCaseContext)_localctx).value = expression();
				setState(1961); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1960);
					whenClause();
					}
					}
					setState(1963); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WHEN );
				setState(1967);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(1965);
					match(ELSE);
					setState(1966);
					((SimpleCaseContext)_localctx).elseExpression = expression();
					}
				}

				setState(1969);
				match(END);
				}
				break;
			case 3:
				{
				_localctx = new CastContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1971);
				match(CAST);
				setState(1972);
				match(T__0);
				setState(1973);
				expression();
				setState(1974);
				match(AS);
				setState(1975);
				dataType();
				setState(1976);
				match(T__1);
				}
				break;
			case 4:
				{
				_localctx = new StructContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1978);
				match(STRUCT);
				setState(1979);
				match(T__0);
				setState(1988);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -1022L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 720575940379279359L) != 0) || ((((_la - 132)) & ~0x3f) == 0 && ((1L << (_la - 132)) & -921L) != 0) || ((((_la - 196)) & ~0x3f) == 0 && ((1L << (_la - 196)) & 279275953455103L) != 0)) {
					{
					setState(1980);
					((StructContext)_localctx).namedExpression = namedExpression();
					((StructContext)_localctx).argument.add(((StructContext)_localctx).namedExpression);
					setState(1985);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__2) {
						{
						{
						setState(1981);
						match(T__2);
						setState(1982);
						((StructContext)_localctx).namedExpression = namedExpression();
						((StructContext)_localctx).argument.add(((StructContext)_localctx).namedExpression);
						}
						}
						setState(1987);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1990);
				match(T__1);
				}
				break;
			case 5:
				{
				_localctx = new FirstContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1991);
				match(FIRST);
				setState(1992);
				match(T__0);
				setState(1993);
				expression();
				setState(1996);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IGNORE) {
					{
					setState(1994);
					match(IGNORE);
					setState(1995);
					match(NULLS);
					}
				}

				setState(1998);
				match(T__1);
				}
				break;
			case 6:
				{
				_localctx = new LastContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2000);
				match(LAST);
				setState(2001);
				match(T__0);
				setState(2002);
				expression();
				setState(2005);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IGNORE) {
					{
					setState(2003);
					match(IGNORE);
					setState(2004);
					match(NULLS);
					}
				}

				setState(2007);
				match(T__1);
				}
				break;
			case 7:
				{
				_localctx = new ConstantDefaultContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2009);
				constant();
				}
				break;
			case 8:
				{
				_localctx = new StarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2010);
				match(ASTERISK);
				}
				break;
			case 9:
				{
				_localctx = new StarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2011);
				qualifiedName();
				setState(2012);
				match(T__3);
				setState(2013);
				match(ASTERISK);
				}
				break;
			case 10:
				{
				_localctx = new RowConstructorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2015);
				match(T__0);
				setState(2016);
				namedExpression();
				setState(2019); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2017);
					match(T__2);
					setState(2018);
					namedExpression();
					}
					}
					setState(2021); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__2 );
				setState(2023);
				match(T__1);
				}
				break;
			case 11:
				{
				_localctx = new SubqueryExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2025);
				match(T__0);
				setState(2026);
				query();
				setState(2027);
				match(T__1);
				}
				break;
			case 12:
				{
				_localctx = new FunctionCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2029);
				qualifiedName();
				setState(2030);
				match(T__0);
				setState(2042);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -1022L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 720575940379279359L) != 0) || ((((_la - 132)) & ~0x3f) == 0 && ((1L << (_la - 132)) & -921L) != 0) || ((((_la - 196)) & ~0x3f) == 0 && ((1L << (_la - 196)) & 279275953455103L) != 0)) {
					{
					setState(2032);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,274,_ctx) ) {
					case 1:
						{
						setState(2031);
						setQuantifier();
						}
						break;
					}
					setState(2034);
					((FunctionCallContext)_localctx).expression = expression();
					((FunctionCallContext)_localctx).argument.add(((FunctionCallContext)_localctx).expression);
					setState(2039);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__2) {
						{
						{
						setState(2035);
						match(T__2);
						setState(2036);
						((FunctionCallContext)_localctx).expression = expression();
						((FunctionCallContext)_localctx).argument.add(((FunctionCallContext)_localctx).expression);
						}
						}
						setState(2041);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(2044);
				match(T__1);
				setState(2047);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,277,_ctx) ) {
				case 1:
					{
					setState(2045);
					match(OVER);
					setState(2046);
					windowSpec();
					}
					break;
				}
				}
				break;
			case 13:
				{
				_localctx = new ColumnReferenceContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2049);
				identifier();
				}
				break;
			case 14:
				{
				_localctx = new ParenthesizedExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2050);
				match(T__0);
				setState(2051);
				expression();
				setState(2052);
				match(T__1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(2066);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,280,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2064);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,279,_ctx) ) {
					case 1:
						{
						_localctx = new SubscriptContext(new PrimaryExpressionContext(_parentctx, _parentState));
						((SubscriptContext)_localctx).value = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_primaryExpression);
						setState(2056);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(2057);
						match(T__6);
						setState(2058);
						((SubscriptContext)_localctx).index = valueExpression(0);
						setState(2059);
						match(T__7);
						}
						break;
					case 2:
						{
						_localctx = new DereferenceContext(new PrimaryExpressionContext(_parentctx, _parentState));
						((DereferenceContext)_localctx).base = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_primaryExpression);
						setState(2061);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(2062);
						match(T__3);
						setState(2063);
						((DereferenceContext)_localctx).fieldName = identifier();
						}
						break;
					}
					} 
				}
				setState(2068);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,280,_ctx);
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
	public static class ConstantContext extends ParserRuleContext {
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
	 
		public ConstantContext() { }
		public void copyFrom(ConstantContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NullLiteralContext extends ConstantContext {
		public TerminalNode NULL() { return getToken(SqlBaseParser.NULL, 0); }
		public NullLiteralContext(ConstantContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StringLiteralContext extends ConstantContext {
		public List<TerminalNode> STRING() { return getTokens(SqlBaseParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(SqlBaseParser.STRING, i);
		}
		public StringLiteralContext(ConstantContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TypeConstructorContext extends ConstantContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public TypeConstructorContext(ConstantContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IntervalLiteralContext extends ConstantContext {
		public IntervalContext interval() {
			return getRuleContext(IntervalContext.class,0);
		}
		public IntervalLiteralContext(ConstantContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NumericLiteralContext extends ConstantContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public NumericLiteralContext(ConstantContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BooleanLiteralContext extends ConstantContext {
		public BooleanValueContext booleanValue() {
			return getRuleContext(BooleanValueContext.class,0);
		}
		public BooleanLiteralContext(ConstantContext ctx) { copyFrom(ctx); }
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_constant);
		try {
			int _alt;
			setState(2081);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,282,_ctx) ) {
			case 1:
				_localctx = new NullLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2069);
				match(NULL);
				}
				break;
			case 2:
				_localctx = new IntervalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2070);
				interval();
				}
				break;
			case 3:
				_localctx = new TypeConstructorContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2071);
				identifier();
				setState(2072);
				match(STRING);
				}
				break;
			case 4:
				_localctx = new NumericLiteralContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(2074);
				number();
				}
				break;
			case 5:
				_localctx = new BooleanLiteralContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(2075);
				booleanValue();
				}
				break;
			case 6:
				_localctx = new StringLiteralContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(2077); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(2076);
						match(STRING);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(2079); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,281,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
	public static class ComparisonOperatorContext extends ParserRuleContext {
		public TerminalNode EQ() { return getToken(SqlBaseParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(SqlBaseParser.NEQ, 0); }
		public TerminalNode NEQJ() { return getToken(SqlBaseParser.NEQJ, 0); }
		public TerminalNode LT() { return getToken(SqlBaseParser.LT, 0); }
		public TerminalNode LTE() { return getToken(SqlBaseParser.LTE, 0); }
		public TerminalNode GT() { return getToken(SqlBaseParser.GT, 0); }
		public TerminalNode GTE() { return getToken(SqlBaseParser.GTE, 0); }
		public TerminalNode NSEQ() { return getToken(SqlBaseParser.NSEQ, 0); }
		public ComparisonOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonOperator; }
	}

	public final ComparisonOperatorContext comparisonOperator() throws RecognitionException {
		ComparisonOperatorContext _localctx = new ComparisonOperatorContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_comparisonOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2083);
			_la = _input.LA(1);
			if ( !(((((_la - 124)) & ~0x3f) == 0 && ((1L << (_la - 124)) & 255L) != 0)) ) {
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
	public static class ArithmeticOperatorContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(SqlBaseParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public TerminalNode ASTERISK() { return getToken(SqlBaseParser.ASTERISK, 0); }
		public TerminalNode SLASH() { return getToken(SqlBaseParser.SLASH, 0); }
		public TerminalNode PERCENT() { return getToken(SqlBaseParser.PERCENT, 0); }
		public TerminalNode DIV() { return getToken(SqlBaseParser.DIV, 0); }
		public TerminalNode TILDE() { return getToken(SqlBaseParser.TILDE, 0); }
		public TerminalNode AMPERSAND() { return getToken(SqlBaseParser.AMPERSAND, 0); }
		public TerminalNode PIPE() { return getToken(SqlBaseParser.PIPE, 0); }
		public TerminalNode HAT() { return getToken(SqlBaseParser.HAT, 0); }
		public ArithmeticOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmeticOperator; }
	}

	public final ArithmeticOperatorContext arithmeticOperator() throws RecognitionException {
		ArithmeticOperatorContext _localctx = new ArithmeticOperatorContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_arithmeticOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2085);
			_la = _input.LA(1);
			if ( !(((((_la - 132)) & ~0x3f) == 0 && ((1L << (_la - 132)) & 1023L) != 0)) ) {
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
	public static class PredicateOperatorContext extends ParserRuleContext {
		public TerminalNode OR() { return getToken(SqlBaseParser.OR, 0); }
		public TerminalNode AND() { return getToken(SqlBaseParser.AND, 0); }
		public TerminalNode IN() { return getToken(SqlBaseParser.IN, 0); }
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public PredicateOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicateOperator; }
	}

	public final PredicateOperatorContext predicateOperator() throws RecognitionException {
		PredicateOperatorContext _localctx = new PredicateOperatorContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_predicateOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2087);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 2013265920L) != 0)) ) {
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
	public static class BooleanValueContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(SqlBaseParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(SqlBaseParser.FALSE, 0); }
		public BooleanValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanValue; }
	}

	public final BooleanValueContext booleanValue() throws RecognitionException {
		BooleanValueContext _localctx = new BooleanValueContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_booleanValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2089);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
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
	public static class IntervalContext extends ParserRuleContext {
		public TerminalNode INTERVAL() { return getToken(SqlBaseParser.INTERVAL, 0); }
		public List<IntervalFieldContext> intervalField() {
			return getRuleContexts(IntervalFieldContext.class);
		}
		public IntervalFieldContext intervalField(int i) {
			return getRuleContext(IntervalFieldContext.class,i);
		}
		public IntervalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interval; }
	}

	public final IntervalContext interval() throws RecognitionException {
		IntervalContext _localctx = new IntervalContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_interval);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2091);
			match(INTERVAL);
			setState(2095);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,283,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2092);
					intervalField();
					}
					} 
				}
				setState(2097);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,283,_ctx);
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
	public static class IntervalFieldContext extends ParserRuleContext {
		public IntervalValueContext value;
		public IdentifierContext unit;
		public IdentifierContext to;
		public IntervalValueContext intervalValue() {
			return getRuleContext(IntervalValueContext.class,0);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode TO() { return getToken(SqlBaseParser.TO, 0); }
		public IntervalFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intervalField; }
	}

	public final IntervalFieldContext intervalField() throws RecognitionException {
		IntervalFieldContext _localctx = new IntervalFieldContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_intervalField);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2098);
			((IntervalFieldContext)_localctx).value = intervalValue();
			setState(2099);
			((IntervalFieldContext)_localctx).unit = identifier();
			setState(2102);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,284,_ctx) ) {
			case 1:
				{
				setState(2100);
				match(TO);
				setState(2101);
				((IntervalFieldContext)_localctx).to = identifier();
				}
				break;
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
	public static class IntervalValueContext extends ParserRuleContext {
		public TerminalNode INTEGER_VALUE() { return getToken(SqlBaseParser.INTEGER_VALUE, 0); }
		public TerminalNode DECIMAL_VALUE() { return getToken(SqlBaseParser.DECIMAL_VALUE, 0); }
		public TerminalNode PLUS() { return getToken(SqlBaseParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public IntervalValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intervalValue; }
	}

	public final IntervalValueContext intervalValue() throws RecognitionException {
		IntervalValueContext _localctx = new IntervalValueContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_intervalValue);
		int _la;
		try {
			setState(2109);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
			case MINUS:
			case INTEGER_VALUE:
			case DECIMAL_VALUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(2105);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PLUS || _la==MINUS) {
					{
					setState(2104);
					_la = _input.LA(1);
					if ( !(_la==PLUS || _la==MINUS) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(2107);
				_la = _input.LA(1);
				if ( !(_la==INTEGER_VALUE || _la==DECIMAL_VALUE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(2108);
				match(STRING);
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
	public static class ColPositionContext extends ParserRuleContext {
		public TerminalNode FIRST() { return getToken(SqlBaseParser.FIRST, 0); }
		public TerminalNode AFTER() { return getToken(SqlBaseParser.AFTER, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ColPositionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_colPosition; }
	}

	public final ColPositionContext colPosition() throws RecognitionException {
		ColPositionContext _localctx = new ColPositionContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_colPosition);
		try {
			setState(2114);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FIRST:
				enterOuterAlt(_localctx, 1);
				{
				setState(2111);
				match(FIRST);
				}
				break;
			case AFTER:
				enterOuterAlt(_localctx, 2);
				{
				setState(2112);
				match(AFTER);
				setState(2113);
				identifier();
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
	public static class DataTypeContext extends ParserRuleContext {
		public DataTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataType; }
	 
		public DataTypeContext() { }
		public void copyFrom(DataTypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ComplexDataTypeContext extends DataTypeContext {
		public Token complex;
		public TerminalNode LT() { return getToken(SqlBaseParser.LT, 0); }
		public List<DataTypeContext> dataType() {
			return getRuleContexts(DataTypeContext.class);
		}
		public DataTypeContext dataType(int i) {
			return getRuleContext(DataTypeContext.class,i);
		}
		public TerminalNode GT() { return getToken(SqlBaseParser.GT, 0); }
		public TerminalNode ARRAY() { return getToken(SqlBaseParser.ARRAY, 0); }
		public TerminalNode MAP() { return getToken(SqlBaseParser.MAP, 0); }
		public TerminalNode STRUCT() { return getToken(SqlBaseParser.STRUCT, 0); }
		public TerminalNode NEQ() { return getToken(SqlBaseParser.NEQ, 0); }
		public ComplexColTypeListContext complexColTypeList() {
			return getRuleContext(ComplexColTypeListContext.class,0);
		}
		public ComplexDataTypeContext(DataTypeContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrimitiveDataTypeContext extends DataTypeContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<TerminalNode> INTEGER_VALUE() { return getTokens(SqlBaseParser.INTEGER_VALUE); }
		public TerminalNode INTEGER_VALUE(int i) {
			return getToken(SqlBaseParser.INTEGER_VALUE, i);
		}
		public PrimitiveDataTypeContext(DataTypeContext ctx) { copyFrom(ctx); }
	}

	public final DataTypeContext dataType() throws RecognitionException {
		DataTypeContext _localctx = new DataTypeContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_dataType);
		int _la;
		try {
			setState(2150);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,292,_ctx) ) {
			case 1:
				_localctx = new ComplexDataTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2116);
				((ComplexDataTypeContext)_localctx).complex = match(ARRAY);
				setState(2117);
				match(LT);
				setState(2118);
				dataType();
				setState(2119);
				match(GT);
				}
				break;
			case 2:
				_localctx = new ComplexDataTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2121);
				((ComplexDataTypeContext)_localctx).complex = match(MAP);
				setState(2122);
				match(LT);
				setState(2123);
				dataType();
				setState(2124);
				match(T__2);
				setState(2125);
				dataType();
				setState(2126);
				match(GT);
				}
				break;
			case 3:
				_localctx = new ComplexDataTypeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2128);
				((ComplexDataTypeContext)_localctx).complex = match(STRUCT);
				setState(2135);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LT:
					{
					setState(2129);
					match(LT);
					setState(2131);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -1024L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 720575940379279359L) != 0) || ((((_la - 137)) & ~0x3f) == 0 && ((1L << (_la - 137)) & -31L) != 0) || ((((_la - 201)) & ~0x3f) == 0 && ((1L << (_la - 201)) & 6601364733951L) != 0)) {
						{
						setState(2130);
						complexColTypeList();
						}
					}

					setState(2133);
					match(GT);
					}
					break;
				case NEQ:
					{
					setState(2134);
					match(NEQ);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 4:
				_localctx = new PrimitiveDataTypeContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(2137);
				identifier();
				setState(2148);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,291,_ctx) ) {
				case 1:
					{
					setState(2138);
					match(T__0);
					setState(2139);
					match(INTEGER_VALUE);
					setState(2144);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__2) {
						{
						{
						setState(2140);
						match(T__2);
						setState(2141);
						match(INTEGER_VALUE);
						}
						}
						setState(2146);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2147);
					match(T__1);
					}
					break;
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
	public static class ColTypeListContext extends ParserRuleContext {
		public List<ColTypeContext> colType() {
			return getRuleContexts(ColTypeContext.class);
		}
		public ColTypeContext colType(int i) {
			return getRuleContext(ColTypeContext.class,i);
		}
		public ColTypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_colTypeList; }
	}

	public final ColTypeListContext colTypeList() throws RecognitionException {
		ColTypeListContext _localctx = new ColTypeListContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_colTypeList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2152);
			colType();
			setState(2157);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,293,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2153);
					match(T__2);
					setState(2154);
					colType();
					}
					} 
				}
				setState(2159);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,293,_ctx);
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
	public static class ColTypeContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TerminalNode COMMENT() { return getToken(SqlBaseParser.COMMENT, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public ColTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_colType; }
	}

	public final ColTypeContext colType() throws RecognitionException {
		ColTypeContext _localctx = new ColTypeContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_colType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2160);
			identifier();
			setState(2161);
			dataType();
			setState(2164);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,294,_ctx) ) {
			case 1:
				{
				setState(2162);
				match(COMMENT);
				setState(2163);
				match(STRING);
				}
				break;
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
	public static class ComplexColTypeListContext extends ParserRuleContext {
		public List<ComplexColTypeContext> complexColType() {
			return getRuleContexts(ComplexColTypeContext.class);
		}
		public ComplexColTypeContext complexColType(int i) {
			return getRuleContext(ComplexColTypeContext.class,i);
		}
		public ComplexColTypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_complexColTypeList; }
	}

	public final ComplexColTypeListContext complexColTypeList() throws RecognitionException {
		ComplexColTypeListContext _localctx = new ComplexColTypeListContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_complexColTypeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2166);
			complexColType();
			setState(2171);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(2167);
				match(T__2);
				setState(2168);
				complexColType();
				}
				}
				setState(2173);
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
	public static class ComplexColTypeContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TerminalNode COMMENT() { return getToken(SqlBaseParser.COMMENT, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public ComplexColTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_complexColType; }
	}

	public final ComplexColTypeContext complexColType() throws RecognitionException {
		ComplexColTypeContext _localctx = new ComplexColTypeContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_complexColType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2174);
			identifier();
			setState(2175);
			match(T__8);
			setState(2176);
			dataType();
			setState(2179);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMENT) {
				{
				setState(2177);
				match(COMMENT);
				setState(2178);
				match(STRING);
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
	public static class WhenClauseContext extends ParserRuleContext {
		public ExpressionContext condition;
		public ExpressionContext result;
		public TerminalNode WHEN() { return getToken(SqlBaseParser.WHEN, 0); }
		public TerminalNode THEN() { return getToken(SqlBaseParser.THEN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public WhenClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whenClause; }
	}

	public final WhenClauseContext whenClause() throws RecognitionException {
		WhenClauseContext _localctx = new WhenClauseContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_whenClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2181);
			match(WHEN);
			setState(2182);
			((WhenClauseContext)_localctx).condition = expression();
			setState(2183);
			match(THEN);
			setState(2184);
			((WhenClauseContext)_localctx).result = expression();
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
	public static class WindowsContext extends ParserRuleContext {
		public TerminalNode WINDOW() { return getToken(SqlBaseParser.WINDOW, 0); }
		public List<NamedWindowContext> namedWindow() {
			return getRuleContexts(NamedWindowContext.class);
		}
		public NamedWindowContext namedWindow(int i) {
			return getRuleContext(NamedWindowContext.class,i);
		}
		public WindowsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windows; }
	}

	public final WindowsContext windows() throws RecognitionException {
		WindowsContext _localctx = new WindowsContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_windows);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2186);
			match(WINDOW);
			setState(2187);
			namedWindow();
			setState(2192);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,297,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2188);
					match(T__2);
					setState(2189);
					namedWindow();
					}
					} 
				}
				setState(2194);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,297,_ctx);
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
	public static class NamedWindowContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public WindowSpecContext windowSpec() {
			return getRuleContext(WindowSpecContext.class,0);
		}
		public NamedWindowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedWindow; }
	}

	public final NamedWindowContext namedWindow() throws RecognitionException {
		NamedWindowContext _localctx = new NamedWindowContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_namedWindow);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2195);
			identifier();
			setState(2196);
			match(AS);
			setState(2197);
			windowSpec();
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
	public static class WindowSpecContext extends ParserRuleContext {
		public WindowSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowSpec; }
	 
		public WindowSpecContext() { }
		public void copyFrom(WindowSpecContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WindowRefContext extends WindowSpecContext {
		public IdentifierContext name;
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public WindowRefContext(WindowSpecContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WindowDefContext extends WindowSpecContext {
		public ExpressionContext expression;
		public List<ExpressionContext> partition = new ArrayList<ExpressionContext>();
		public TerminalNode CLUSTER() { return getToken(SqlBaseParser.CLUSTER, 0); }
		public List<TerminalNode> BY() { return getTokens(SqlBaseParser.BY); }
		public TerminalNode BY(int i) {
			return getToken(SqlBaseParser.BY, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public WindowFrameContext windowFrame() {
			return getRuleContext(WindowFrameContext.class,0);
		}
		public List<SortItemContext> sortItem() {
			return getRuleContexts(SortItemContext.class);
		}
		public SortItemContext sortItem(int i) {
			return getRuleContext(SortItemContext.class,i);
		}
		public TerminalNode PARTITION() { return getToken(SqlBaseParser.PARTITION, 0); }
		public TerminalNode DISTRIBUTE() { return getToken(SqlBaseParser.DISTRIBUTE, 0); }
		public TerminalNode ORDER() { return getToken(SqlBaseParser.ORDER, 0); }
		public TerminalNode SORT() { return getToken(SqlBaseParser.SORT, 0); }
		public WindowDefContext(WindowSpecContext ctx) { copyFrom(ctx); }
	}

	public final WindowSpecContext windowSpec() throws RecognitionException {
		WindowSpecContext _localctx = new WindowSpecContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_windowSpec);
		int _la;
		try {
			setState(2241);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECT:
			case FROM:
			case ADD:
			case AS:
			case ALL:
			case DISTINCT:
			case WHERE:
			case GROUP:
			case BY:
			case GROUPING:
			case SETS:
			case CUBE:
			case ROLLUP:
			case ORDER:
			case HAVING:
			case LIMIT:
			case AT:
			case OR:
			case AND:
			case IN:
			case NOT:
			case NO:
			case EXISTS:
			case BETWEEN:
			case LIKE:
			case RLIKE:
			case IS:
			case NULL:
			case TRUE:
			case FALSE:
			case NULLS:
			case ASC:
			case DESC:
			case FOR:
			case INTERVAL:
			case CASE:
			case WHEN:
			case THEN:
			case ELSE:
			case END:
			case JOIN:
			case CROSS:
			case OUTER:
			case INNER:
			case LEFT:
			case SEMI:
			case RIGHT:
			case FULL:
			case NATURAL:
			case ON:
			case LATERAL:
			case WINDOW:
			case OVER:
			case PARTITION:
			case RANGE:
			case ROWS:
			case UNBOUNDED:
			case PRECEDING:
			case FOLLOWING:
			case CURRENT:
			case FIRST:
			case AFTER:
			case LAST:
			case ROW:
			case WITH:
			case VALUES:
			case CREATE:
			case TABLE:
			case VIEW:
			case REPLACE:
			case INSERT:
			case DELETE:
			case INTO:
			case DESCRIBE:
			case EXPLAIN:
			case FORMAT:
			case LOGICAL:
			case CODEGEN:
			case COST:
			case CAST:
			case SHOW:
			case TABLES:
			case COLUMNS:
			case COLUMN:
			case USE:
			case PARTITIONS:
			case FUNCTIONS:
			case DROP:
			case UNION:
			case EXCEPT:
			case SETMINUS:
			case INTERSECT:
			case TO:
			case TABLESAMPLE:
			case STRATIFY:
			case ALTER:
			case RENAME:
			case ARRAY:
			case MAP:
			case STRUCT:
			case COMMENT:
			case SET:
			case RESET:
			case DATA:
			case START:
			case TRANSACTION:
			case COMMIT:
			case ROLLBACK:
			case MACRO:
			case IGNORE:
			case KNN:
			case IF:
			case DIV:
			case PERCENTLIT:
			case BUCKET:
			case OUT:
			case OF:
			case SORT:
			case CLUSTER:
			case DISTRIBUTE:
			case OVERWRITE:
			case TRANSFORM:
			case REDUCE:
			case USING:
			case SERDE:
			case SERDEPROPERTIES:
			case RECORDREADER:
			case RECORDWRITER:
			case DELIMITED:
			case FIELDS:
			case TERMINATED:
			case COLLECTION:
			case ITEMS:
			case KEYS:
			case ESCAPED:
			case LINES:
			case SEPARATED:
			case FUNCTION:
			case EXTENDED:
			case REFRESH:
			case CLEAR:
			case CACHE:
			case UNCACHE:
			case LAZY:
			case FORMATTED:
			case GLOBAL:
			case TEMPORARY:
			case OPTIONS:
			case UNSET:
			case TBLPROPERTIES:
			case DBPROPERTIES:
			case BUCKETS:
			case SKEWED:
			case STORED:
			case DIRECTORIES:
			case LOCATION:
			case EXCHANGE:
			case ARCHIVE:
			case UNARCHIVE:
			case FILEFORMAT:
			case TOUCH:
			case COMPACT:
			case CONCATENATE:
			case CHANGE:
			case CASCADE:
			case RESTRICT:
			case CLUSTERED:
			case SORTED:
			case PURGE:
			case INPUTFORMAT:
			case OUTPUTFORMAT:
			case DATABASE:
			case DATABASES:
			case DFS:
			case TRUNCATE:
			case ANALYZE:
			case COMPUTE:
			case LIST:
			case STATISTICS:
			case PARTITIONED:
			case EXTERNAL:
			case DEFINED:
			case REVOKE:
			case GRANT:
			case LOCK:
			case UNLOCK:
			case MSCK:
			case REPAIR:
			case RECOVER:
			case EXPORT:
			case IMPORT:
			case LOAD:
			case ROLE:
			case ROLES:
			case COMPACTIONS:
			case PRINCIPALS:
			case TRANSACTIONS:
			case INDEX:
			case INDEXES:
			case LOCKS:
			case OPTION:
			case ANTI:
			case LOCAL:
			case INPATH:
			case IDENTIFIER:
			case BACKQUOTED_IDENTIFIER:
				_localctx = new WindowRefContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2199);
				((WindowRefContext)_localctx).name = identifier();
				}
				break;
			case T__0:
				_localctx = new WindowDefContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2200);
				match(T__0);
				setState(2235);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CLUSTER:
					{
					setState(2201);
					match(CLUSTER);
					setState(2202);
					match(BY);
					setState(2203);
					((WindowDefContext)_localctx).expression = expression();
					((WindowDefContext)_localctx).partition.add(((WindowDefContext)_localctx).expression);
					setState(2208);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__2) {
						{
						{
						setState(2204);
						match(T__2);
						setState(2205);
						((WindowDefContext)_localctx).expression = expression();
						((WindowDefContext)_localctx).partition.add(((WindowDefContext)_localctx).expression);
						}
						}
						setState(2210);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case T__1:
				case ORDER:
				case PARTITION:
				case RANGE:
				case ROWS:
				case SORT:
				case DISTRIBUTE:
					{
					setState(2221);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==PARTITION || _la==DISTRIBUTE) {
						{
						setState(2211);
						_la = _input.LA(1);
						if ( !(_la==PARTITION || _la==DISTRIBUTE) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(2212);
						match(BY);
						setState(2213);
						((WindowDefContext)_localctx).expression = expression();
						((WindowDefContext)_localctx).partition.add(((WindowDefContext)_localctx).expression);
						setState(2218);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==T__2) {
							{
							{
							setState(2214);
							match(T__2);
							setState(2215);
							((WindowDefContext)_localctx).expression = expression();
							((WindowDefContext)_localctx).partition.add(((WindowDefContext)_localctx).expression);
							}
							}
							setState(2220);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
					}

					setState(2233);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ORDER || _la==SORT) {
						{
						setState(2223);
						_la = _input.LA(1);
						if ( !(_la==ORDER || _la==SORT) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(2224);
						match(BY);
						setState(2225);
						sortItem();
						setState(2230);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==T__2) {
							{
							{
							setState(2226);
							match(T__2);
							setState(2227);
							sortItem();
							}
							}
							setState(2232);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
					}

					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2238);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==RANGE || _la==ROWS) {
					{
					setState(2237);
					windowFrame();
					}
				}

				setState(2240);
				match(T__1);
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
	public static class WindowFrameContext extends ParserRuleContext {
		public Token frameType;
		public FrameBoundContext start;
		public FrameBoundContext end;
		public TerminalNode RANGE() { return getToken(SqlBaseParser.RANGE, 0); }
		public List<FrameBoundContext> frameBound() {
			return getRuleContexts(FrameBoundContext.class);
		}
		public FrameBoundContext frameBound(int i) {
			return getRuleContext(FrameBoundContext.class,i);
		}
		public TerminalNode ROWS() { return getToken(SqlBaseParser.ROWS, 0); }
		public TerminalNode BETWEEN() { return getToken(SqlBaseParser.BETWEEN, 0); }
		public TerminalNode AND() { return getToken(SqlBaseParser.AND, 0); }
		public WindowFrameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowFrame; }
	}

	public final WindowFrameContext windowFrame() throws RecognitionException {
		WindowFrameContext _localctx = new WindowFrameContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_windowFrame);
		try {
			setState(2259);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,306,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2243);
				((WindowFrameContext)_localctx).frameType = match(RANGE);
				setState(2244);
				((WindowFrameContext)_localctx).start = frameBound();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2245);
				((WindowFrameContext)_localctx).frameType = match(ROWS);
				setState(2246);
				((WindowFrameContext)_localctx).start = frameBound();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2247);
				((WindowFrameContext)_localctx).frameType = match(RANGE);
				setState(2248);
				match(BETWEEN);
				setState(2249);
				((WindowFrameContext)_localctx).start = frameBound();
				setState(2250);
				match(AND);
				setState(2251);
				((WindowFrameContext)_localctx).end = frameBound();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2253);
				((WindowFrameContext)_localctx).frameType = match(ROWS);
				setState(2254);
				match(BETWEEN);
				setState(2255);
				((WindowFrameContext)_localctx).start = frameBound();
				setState(2256);
				match(AND);
				setState(2257);
				((WindowFrameContext)_localctx).end = frameBound();
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
	public static class FrameBoundContext extends ParserRuleContext {
		public Token boundType;
		public TerminalNode UNBOUNDED() { return getToken(SqlBaseParser.UNBOUNDED, 0); }
		public TerminalNode PRECEDING() { return getToken(SqlBaseParser.PRECEDING, 0); }
		public TerminalNode FOLLOWING() { return getToken(SqlBaseParser.FOLLOWING, 0); }
		public TerminalNode ROW() { return getToken(SqlBaseParser.ROW, 0); }
		public TerminalNode CURRENT() { return getToken(SqlBaseParser.CURRENT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FrameBoundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_frameBound; }
	}

	public final FrameBoundContext frameBound() throws RecognitionException {
		FrameBoundContext _localctx = new FrameBoundContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_frameBound);
		int _la;
		try {
			setState(2268);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,307,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2261);
				match(UNBOUNDED);
				setState(2262);
				((FrameBoundContext)_localctx).boundType = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==PRECEDING || _la==FOLLOWING) ) {
					((FrameBoundContext)_localctx).boundType = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2263);
				((FrameBoundContext)_localctx).boundType = match(CURRENT);
				setState(2264);
				match(ROW);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2265);
				expression();
				setState(2266);
				((FrameBoundContext)_localctx).boundType = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==PRECEDING || _la==FOLLOWING) ) {
					((FrameBoundContext)_localctx).boundType = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
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
	public static class QualifiedNameContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public QualifiedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedName; }
	}

	public final QualifiedNameContext qualifiedName() throws RecognitionException {
		QualifiedNameContext _localctx = new QualifiedNameContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_qualifiedName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2270);
			identifier();
			setState(2275);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,308,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2271);
					match(T__3);
					setState(2272);
					identifier();
					}
					} 
				}
				setState(2277);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,308,_ctx);
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
	public static class IdentifierContext extends ParserRuleContext {
		public StrictIdentifierContext strictIdentifier() {
			return getRuleContext(StrictIdentifierContext.class,0);
		}
		public TerminalNode ANTI() { return getToken(SqlBaseParser.ANTI, 0); }
		public TerminalNode FULL() { return getToken(SqlBaseParser.FULL, 0); }
		public TerminalNode INNER() { return getToken(SqlBaseParser.INNER, 0); }
		public TerminalNode LEFT() { return getToken(SqlBaseParser.LEFT, 0); }
		public TerminalNode SEMI() { return getToken(SqlBaseParser.SEMI, 0); }
		public TerminalNode RIGHT() { return getToken(SqlBaseParser.RIGHT, 0); }
		public TerminalNode NATURAL() { return getToken(SqlBaseParser.NATURAL, 0); }
		public TerminalNode JOIN() { return getToken(SqlBaseParser.JOIN, 0); }
		public TerminalNode CROSS() { return getToken(SqlBaseParser.CROSS, 0); }
		public TerminalNode ON() { return getToken(SqlBaseParser.ON, 0); }
		public TerminalNode KNN() { return getToken(SqlBaseParser.KNN, 0); }
		public TerminalNode UNION() { return getToken(SqlBaseParser.UNION, 0); }
		public TerminalNode INTERSECT() { return getToken(SqlBaseParser.INTERSECT, 0); }
		public TerminalNode EXCEPT() { return getToken(SqlBaseParser.EXCEPT, 0); }
		public TerminalNode SETMINUS() { return getToken(SqlBaseParser.SETMINUS, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_identifier);
		try {
			setState(2294);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECT:
			case FROM:
			case ADD:
			case AS:
			case ALL:
			case DISTINCT:
			case WHERE:
			case GROUP:
			case BY:
			case GROUPING:
			case SETS:
			case CUBE:
			case ROLLUP:
			case ORDER:
			case HAVING:
			case LIMIT:
			case AT:
			case OR:
			case AND:
			case IN:
			case NOT:
			case NO:
			case EXISTS:
			case BETWEEN:
			case LIKE:
			case RLIKE:
			case IS:
			case NULL:
			case TRUE:
			case FALSE:
			case NULLS:
			case ASC:
			case DESC:
			case FOR:
			case INTERVAL:
			case CASE:
			case WHEN:
			case THEN:
			case ELSE:
			case END:
			case OUTER:
			case LATERAL:
			case WINDOW:
			case OVER:
			case PARTITION:
			case RANGE:
			case ROWS:
			case UNBOUNDED:
			case PRECEDING:
			case FOLLOWING:
			case CURRENT:
			case FIRST:
			case AFTER:
			case LAST:
			case ROW:
			case WITH:
			case VALUES:
			case CREATE:
			case TABLE:
			case VIEW:
			case REPLACE:
			case INSERT:
			case DELETE:
			case INTO:
			case DESCRIBE:
			case EXPLAIN:
			case FORMAT:
			case LOGICAL:
			case CODEGEN:
			case COST:
			case CAST:
			case SHOW:
			case TABLES:
			case COLUMNS:
			case COLUMN:
			case USE:
			case PARTITIONS:
			case FUNCTIONS:
			case DROP:
			case TO:
			case TABLESAMPLE:
			case STRATIFY:
			case ALTER:
			case RENAME:
			case ARRAY:
			case MAP:
			case STRUCT:
			case COMMENT:
			case SET:
			case RESET:
			case DATA:
			case START:
			case TRANSACTION:
			case COMMIT:
			case ROLLBACK:
			case MACRO:
			case IGNORE:
			case IF:
			case DIV:
			case PERCENTLIT:
			case BUCKET:
			case OUT:
			case OF:
			case SORT:
			case CLUSTER:
			case DISTRIBUTE:
			case OVERWRITE:
			case TRANSFORM:
			case REDUCE:
			case USING:
			case SERDE:
			case SERDEPROPERTIES:
			case RECORDREADER:
			case RECORDWRITER:
			case DELIMITED:
			case FIELDS:
			case TERMINATED:
			case COLLECTION:
			case ITEMS:
			case KEYS:
			case ESCAPED:
			case LINES:
			case SEPARATED:
			case FUNCTION:
			case EXTENDED:
			case REFRESH:
			case CLEAR:
			case CACHE:
			case UNCACHE:
			case LAZY:
			case FORMATTED:
			case GLOBAL:
			case TEMPORARY:
			case OPTIONS:
			case UNSET:
			case TBLPROPERTIES:
			case DBPROPERTIES:
			case BUCKETS:
			case SKEWED:
			case STORED:
			case DIRECTORIES:
			case LOCATION:
			case EXCHANGE:
			case ARCHIVE:
			case UNARCHIVE:
			case FILEFORMAT:
			case TOUCH:
			case COMPACT:
			case CONCATENATE:
			case CHANGE:
			case CASCADE:
			case RESTRICT:
			case CLUSTERED:
			case SORTED:
			case PURGE:
			case INPUTFORMAT:
			case OUTPUTFORMAT:
			case DATABASE:
			case DATABASES:
			case DFS:
			case TRUNCATE:
			case ANALYZE:
			case COMPUTE:
			case LIST:
			case STATISTICS:
			case PARTITIONED:
			case EXTERNAL:
			case DEFINED:
			case REVOKE:
			case GRANT:
			case LOCK:
			case UNLOCK:
			case MSCK:
			case REPAIR:
			case RECOVER:
			case EXPORT:
			case IMPORT:
			case LOAD:
			case ROLE:
			case ROLES:
			case COMPACTIONS:
			case PRINCIPALS:
			case TRANSACTIONS:
			case INDEX:
			case INDEXES:
			case LOCKS:
			case OPTION:
			case LOCAL:
			case INPATH:
			case IDENTIFIER:
			case BACKQUOTED_IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(2278);
				strictIdentifier();
				}
				break;
			case ANTI:
				enterOuterAlt(_localctx, 2);
				{
				setState(2279);
				match(ANTI);
				}
				break;
			case FULL:
				enterOuterAlt(_localctx, 3);
				{
				setState(2280);
				match(FULL);
				}
				break;
			case INNER:
				enterOuterAlt(_localctx, 4);
				{
				setState(2281);
				match(INNER);
				}
				break;
			case LEFT:
				enterOuterAlt(_localctx, 5);
				{
				setState(2282);
				match(LEFT);
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 6);
				{
				setState(2283);
				match(SEMI);
				}
				break;
			case RIGHT:
				enterOuterAlt(_localctx, 7);
				{
				setState(2284);
				match(RIGHT);
				}
				break;
			case NATURAL:
				enterOuterAlt(_localctx, 8);
				{
				setState(2285);
				match(NATURAL);
				}
				break;
			case JOIN:
				enterOuterAlt(_localctx, 9);
				{
				setState(2286);
				match(JOIN);
				}
				break;
			case CROSS:
				enterOuterAlt(_localctx, 10);
				{
				setState(2287);
				match(CROSS);
				}
				break;
			case ON:
				enterOuterAlt(_localctx, 11);
				{
				setState(2288);
				match(ON);
				}
				break;
			case KNN:
				enterOuterAlt(_localctx, 12);
				{
				setState(2289);
				match(KNN);
				}
				break;
			case UNION:
				enterOuterAlt(_localctx, 13);
				{
				setState(2290);
				match(UNION);
				}
				break;
			case INTERSECT:
				enterOuterAlt(_localctx, 14);
				{
				setState(2291);
				match(INTERSECT);
				}
				break;
			case EXCEPT:
				enterOuterAlt(_localctx, 15);
				{
				setState(2292);
				match(EXCEPT);
				}
				break;
			case SETMINUS:
				enterOuterAlt(_localctx, 16);
				{
				setState(2293);
				match(SETMINUS);
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
	public static class StrictIdentifierContext extends ParserRuleContext {
		public StrictIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_strictIdentifier; }
	 
		public StrictIdentifierContext() { }
		public void copyFrom(StrictIdentifierContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class QuotedIdentifierAlternativeContext extends StrictIdentifierContext {
		public QuotedIdentifierContext quotedIdentifier() {
			return getRuleContext(QuotedIdentifierContext.class,0);
		}
		public QuotedIdentifierAlternativeContext(StrictIdentifierContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UnquotedIdentifierContext extends StrictIdentifierContext {
		public TerminalNode IDENTIFIER() { return getToken(SqlBaseParser.IDENTIFIER, 0); }
		public NonReservedContext nonReserved() {
			return getRuleContext(NonReservedContext.class,0);
		}
		public UnquotedIdentifierContext(StrictIdentifierContext ctx) { copyFrom(ctx); }
	}

	public final StrictIdentifierContext strictIdentifier() throws RecognitionException {
		StrictIdentifierContext _localctx = new StrictIdentifierContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_strictIdentifier);
		try {
			setState(2299);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				_localctx = new UnquotedIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2296);
				match(IDENTIFIER);
				}
				break;
			case BACKQUOTED_IDENTIFIER:
				_localctx = new QuotedIdentifierAlternativeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2297);
				quotedIdentifier();
				}
				break;
			case SELECT:
			case FROM:
			case ADD:
			case AS:
			case ALL:
			case DISTINCT:
			case WHERE:
			case GROUP:
			case BY:
			case GROUPING:
			case SETS:
			case CUBE:
			case ROLLUP:
			case ORDER:
			case HAVING:
			case LIMIT:
			case AT:
			case OR:
			case AND:
			case IN:
			case NOT:
			case NO:
			case EXISTS:
			case BETWEEN:
			case LIKE:
			case RLIKE:
			case IS:
			case NULL:
			case TRUE:
			case FALSE:
			case NULLS:
			case ASC:
			case DESC:
			case FOR:
			case INTERVAL:
			case CASE:
			case WHEN:
			case THEN:
			case ELSE:
			case END:
			case OUTER:
			case LATERAL:
			case WINDOW:
			case OVER:
			case PARTITION:
			case RANGE:
			case ROWS:
			case UNBOUNDED:
			case PRECEDING:
			case FOLLOWING:
			case CURRENT:
			case FIRST:
			case AFTER:
			case LAST:
			case ROW:
			case WITH:
			case VALUES:
			case CREATE:
			case TABLE:
			case VIEW:
			case REPLACE:
			case INSERT:
			case DELETE:
			case INTO:
			case DESCRIBE:
			case EXPLAIN:
			case FORMAT:
			case LOGICAL:
			case CODEGEN:
			case COST:
			case CAST:
			case SHOW:
			case TABLES:
			case COLUMNS:
			case COLUMN:
			case USE:
			case PARTITIONS:
			case FUNCTIONS:
			case DROP:
			case TO:
			case TABLESAMPLE:
			case STRATIFY:
			case ALTER:
			case RENAME:
			case ARRAY:
			case MAP:
			case STRUCT:
			case COMMENT:
			case SET:
			case RESET:
			case DATA:
			case START:
			case TRANSACTION:
			case COMMIT:
			case ROLLBACK:
			case MACRO:
			case IGNORE:
			case IF:
			case DIV:
			case PERCENTLIT:
			case BUCKET:
			case OUT:
			case OF:
			case SORT:
			case CLUSTER:
			case DISTRIBUTE:
			case OVERWRITE:
			case TRANSFORM:
			case REDUCE:
			case USING:
			case SERDE:
			case SERDEPROPERTIES:
			case RECORDREADER:
			case RECORDWRITER:
			case DELIMITED:
			case FIELDS:
			case TERMINATED:
			case COLLECTION:
			case ITEMS:
			case KEYS:
			case ESCAPED:
			case LINES:
			case SEPARATED:
			case FUNCTION:
			case EXTENDED:
			case REFRESH:
			case CLEAR:
			case CACHE:
			case UNCACHE:
			case LAZY:
			case FORMATTED:
			case GLOBAL:
			case TEMPORARY:
			case OPTIONS:
			case UNSET:
			case TBLPROPERTIES:
			case DBPROPERTIES:
			case BUCKETS:
			case SKEWED:
			case STORED:
			case DIRECTORIES:
			case LOCATION:
			case EXCHANGE:
			case ARCHIVE:
			case UNARCHIVE:
			case FILEFORMAT:
			case TOUCH:
			case COMPACT:
			case CONCATENATE:
			case CHANGE:
			case CASCADE:
			case RESTRICT:
			case CLUSTERED:
			case SORTED:
			case PURGE:
			case INPUTFORMAT:
			case OUTPUTFORMAT:
			case DATABASE:
			case DATABASES:
			case DFS:
			case TRUNCATE:
			case ANALYZE:
			case COMPUTE:
			case LIST:
			case STATISTICS:
			case PARTITIONED:
			case EXTERNAL:
			case DEFINED:
			case REVOKE:
			case GRANT:
			case LOCK:
			case UNLOCK:
			case MSCK:
			case REPAIR:
			case RECOVER:
			case EXPORT:
			case IMPORT:
			case LOAD:
			case ROLE:
			case ROLES:
			case COMPACTIONS:
			case PRINCIPALS:
			case TRANSACTIONS:
			case INDEX:
			case INDEXES:
			case LOCKS:
			case OPTION:
			case LOCAL:
			case INPATH:
				_localctx = new UnquotedIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2298);
				nonReserved();
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
	public static class QuotedIdentifierContext extends ParserRuleContext {
		public TerminalNode BACKQUOTED_IDENTIFIER() { return getToken(SqlBaseParser.BACKQUOTED_IDENTIFIER, 0); }
		public QuotedIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quotedIdentifier; }
	}

	public final QuotedIdentifierContext quotedIdentifier() throws RecognitionException {
		QuotedIdentifierContext _localctx = new QuotedIdentifierContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_quotedIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2301);
			match(BACKQUOTED_IDENTIFIER);
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
	public static class NumberContext extends ParserRuleContext {
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
	 
		public NumberContext() { }
		public void copyFrom(NumberContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DecimalLiteralContext extends NumberContext {
		public TerminalNode DECIMAL_VALUE() { return getToken(SqlBaseParser.DECIMAL_VALUE, 0); }
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public DecimalLiteralContext(NumberContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BigIntLiteralContext extends NumberContext {
		public TerminalNode BIGINT_LITERAL() { return getToken(SqlBaseParser.BIGINT_LITERAL, 0); }
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public BigIntLiteralContext(NumberContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TinyIntLiteralContext extends NumberContext {
		public TerminalNode TINYINT_LITERAL() { return getToken(SqlBaseParser.TINYINT_LITERAL, 0); }
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public TinyIntLiteralContext(NumberContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BigDecimalLiteralContext extends NumberContext {
		public TerminalNode BIGDECIMAL_LITERAL() { return getToken(SqlBaseParser.BIGDECIMAL_LITERAL, 0); }
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public BigDecimalLiteralContext(NumberContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DoubleLiteralContext extends NumberContext {
		public TerminalNode DOUBLE_LITERAL() { return getToken(SqlBaseParser.DOUBLE_LITERAL, 0); }
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public DoubleLiteralContext(NumberContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IntegerLiteralContext extends NumberContext {
		public TerminalNode INTEGER_VALUE() { return getToken(SqlBaseParser.INTEGER_VALUE, 0); }
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public IntegerLiteralContext(NumberContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SmallIntLiteralContext extends NumberContext {
		public TerminalNode SMALLINT_LITERAL() { return getToken(SqlBaseParser.SMALLINT_LITERAL, 0); }
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public SmallIntLiteralContext(NumberContext ctx) { copyFrom(ctx); }
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_number);
		int _la;
		try {
			setState(2331);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,318,_ctx) ) {
			case 1:
				_localctx = new DecimalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2304);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(2303);
					match(MINUS);
					}
				}

				setState(2306);
				match(DECIMAL_VALUE);
				}
				break;
			case 2:
				_localctx = new IntegerLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2308);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(2307);
					match(MINUS);
					}
				}

				setState(2310);
				match(INTEGER_VALUE);
				}
				break;
			case 3:
				_localctx = new BigIntLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2312);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(2311);
					match(MINUS);
					}
				}

				setState(2314);
				match(BIGINT_LITERAL);
				}
				break;
			case 4:
				_localctx = new SmallIntLiteralContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(2316);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(2315);
					match(MINUS);
					}
				}

				setState(2318);
				match(SMALLINT_LITERAL);
				}
				break;
			case 5:
				_localctx = new TinyIntLiteralContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(2320);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(2319);
					match(MINUS);
					}
				}

				setState(2322);
				match(TINYINT_LITERAL);
				}
				break;
			case 6:
				_localctx = new DoubleLiteralContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(2324);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(2323);
					match(MINUS);
					}
				}

				setState(2326);
				match(DOUBLE_LITERAL);
				}
				break;
			case 7:
				_localctx = new BigDecimalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(2328);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(2327);
					match(MINUS);
					}
				}

				setState(2330);
				match(BIGDECIMAL_LITERAL);
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
	public static class NonReservedContext extends ParserRuleContext {
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode TABLES() { return getToken(SqlBaseParser.TABLES, 0); }
		public TerminalNode COLUMNS() { return getToken(SqlBaseParser.COLUMNS, 0); }
		public TerminalNode COLUMN() { return getToken(SqlBaseParser.COLUMN, 0); }
		public TerminalNode PARTITIONS() { return getToken(SqlBaseParser.PARTITIONS, 0); }
		public TerminalNode FUNCTIONS() { return getToken(SqlBaseParser.FUNCTIONS, 0); }
		public TerminalNode DATABASES() { return getToken(SqlBaseParser.DATABASES, 0); }
		public TerminalNode ADD() { return getToken(SqlBaseParser.ADD, 0); }
		public TerminalNode OVER() { return getToken(SqlBaseParser.OVER, 0); }
		public TerminalNode PARTITION() { return getToken(SqlBaseParser.PARTITION, 0); }
		public TerminalNode RANGE() { return getToken(SqlBaseParser.RANGE, 0); }
		public TerminalNode ROWS() { return getToken(SqlBaseParser.ROWS, 0); }
		public TerminalNode PRECEDING() { return getToken(SqlBaseParser.PRECEDING, 0); }
		public TerminalNode FOLLOWING() { return getToken(SqlBaseParser.FOLLOWING, 0); }
		public TerminalNode CURRENT() { return getToken(SqlBaseParser.CURRENT, 0); }
		public TerminalNode ROW() { return getToken(SqlBaseParser.ROW, 0); }
		public TerminalNode LAST() { return getToken(SqlBaseParser.LAST, 0); }
		public TerminalNode FIRST() { return getToken(SqlBaseParser.FIRST, 0); }
		public TerminalNode AFTER() { return getToken(SqlBaseParser.AFTER, 0); }
		public TerminalNode MAP() { return getToken(SqlBaseParser.MAP, 0); }
		public TerminalNode ARRAY() { return getToken(SqlBaseParser.ARRAY, 0); }
		public TerminalNode STRUCT() { return getToken(SqlBaseParser.STRUCT, 0); }
		public TerminalNode LATERAL() { return getToken(SqlBaseParser.LATERAL, 0); }
		public TerminalNode WINDOW() { return getToken(SqlBaseParser.WINDOW, 0); }
		public TerminalNode REDUCE() { return getToken(SqlBaseParser.REDUCE, 0); }
		public TerminalNode TRANSFORM() { return getToken(SqlBaseParser.TRANSFORM, 0); }
		public TerminalNode USING() { return getToken(SqlBaseParser.USING, 0); }
		public TerminalNode SERDE() { return getToken(SqlBaseParser.SERDE, 0); }
		public TerminalNode SERDEPROPERTIES() { return getToken(SqlBaseParser.SERDEPROPERTIES, 0); }
		public TerminalNode RECORDREADER() { return getToken(SqlBaseParser.RECORDREADER, 0); }
		public TerminalNode DELIMITED() { return getToken(SqlBaseParser.DELIMITED, 0); }
		public TerminalNode FIELDS() { return getToken(SqlBaseParser.FIELDS, 0); }
		public TerminalNode TERMINATED() { return getToken(SqlBaseParser.TERMINATED, 0); }
		public TerminalNode COLLECTION() { return getToken(SqlBaseParser.COLLECTION, 0); }
		public TerminalNode ITEMS() { return getToken(SqlBaseParser.ITEMS, 0); }
		public TerminalNode KEYS() { return getToken(SqlBaseParser.KEYS, 0); }
		public TerminalNode ESCAPED() { return getToken(SqlBaseParser.ESCAPED, 0); }
		public TerminalNode LINES() { return getToken(SqlBaseParser.LINES, 0); }
		public TerminalNode SEPARATED() { return getToken(SqlBaseParser.SEPARATED, 0); }
		public TerminalNode EXTENDED() { return getToken(SqlBaseParser.EXTENDED, 0); }
		public TerminalNode REFRESH() { return getToken(SqlBaseParser.REFRESH, 0); }
		public TerminalNode CLEAR() { return getToken(SqlBaseParser.CLEAR, 0); }
		public TerminalNode CACHE() { return getToken(SqlBaseParser.CACHE, 0); }
		public TerminalNode UNCACHE() { return getToken(SqlBaseParser.UNCACHE, 0); }
		public TerminalNode LAZY() { return getToken(SqlBaseParser.LAZY, 0); }
		public TerminalNode GLOBAL() { return getToken(SqlBaseParser.GLOBAL, 0); }
		public TerminalNode TEMPORARY() { return getToken(SqlBaseParser.TEMPORARY, 0); }
		public TerminalNode OPTIONS() { return getToken(SqlBaseParser.OPTIONS, 0); }
		public TerminalNode GROUPING() { return getToken(SqlBaseParser.GROUPING, 0); }
		public TerminalNode CUBE() { return getToken(SqlBaseParser.CUBE, 0); }
		public TerminalNode ROLLUP() { return getToken(SqlBaseParser.ROLLUP, 0); }
		public TerminalNode EXPLAIN() { return getToken(SqlBaseParser.EXPLAIN, 0); }
		public TerminalNode FORMAT() { return getToken(SqlBaseParser.FORMAT, 0); }
		public TerminalNode LOGICAL() { return getToken(SqlBaseParser.LOGICAL, 0); }
		public TerminalNode FORMATTED() { return getToken(SqlBaseParser.FORMATTED, 0); }
		public TerminalNode CODEGEN() { return getToken(SqlBaseParser.CODEGEN, 0); }
		public TerminalNode COST() { return getToken(SqlBaseParser.COST, 0); }
		public TerminalNode TABLESAMPLE() { return getToken(SqlBaseParser.TABLESAMPLE, 0); }
		public TerminalNode USE() { return getToken(SqlBaseParser.USE, 0); }
		public TerminalNode TO() { return getToken(SqlBaseParser.TO, 0); }
		public TerminalNode BUCKET() { return getToken(SqlBaseParser.BUCKET, 0); }
		public TerminalNode PERCENTLIT() { return getToken(SqlBaseParser.PERCENTLIT, 0); }
		public TerminalNode OUT() { return getToken(SqlBaseParser.OUT, 0); }
		public TerminalNode OF() { return getToken(SqlBaseParser.OF, 0); }
		public TerminalNode SET() { return getToken(SqlBaseParser.SET, 0); }
		public TerminalNode RESET() { return getToken(SqlBaseParser.RESET, 0); }
		public TerminalNode VIEW() { return getToken(SqlBaseParser.VIEW, 0); }
		public TerminalNode REPLACE() { return getToken(SqlBaseParser.REPLACE, 0); }
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode NO() { return getToken(SqlBaseParser.NO, 0); }
		public TerminalNode DATA() { return getToken(SqlBaseParser.DATA, 0); }
		public TerminalNode START() { return getToken(SqlBaseParser.START, 0); }
		public TerminalNode TRANSACTION() { return getToken(SqlBaseParser.TRANSACTION, 0); }
		public TerminalNode COMMIT() { return getToken(SqlBaseParser.COMMIT, 0); }
		public TerminalNode ROLLBACK() { return getToken(SqlBaseParser.ROLLBACK, 0); }
		public TerminalNode IGNORE() { return getToken(SqlBaseParser.IGNORE, 0); }
		public TerminalNode SORT() { return getToken(SqlBaseParser.SORT, 0); }
		public TerminalNode CLUSTER() { return getToken(SqlBaseParser.CLUSTER, 0); }
		public TerminalNode DISTRIBUTE() { return getToken(SqlBaseParser.DISTRIBUTE, 0); }
		public TerminalNode UNSET() { return getToken(SqlBaseParser.UNSET, 0); }
		public TerminalNode TBLPROPERTIES() { return getToken(SqlBaseParser.TBLPROPERTIES, 0); }
		public TerminalNode SKEWED() { return getToken(SqlBaseParser.SKEWED, 0); }
		public TerminalNode STORED() { return getToken(SqlBaseParser.STORED, 0); }
		public TerminalNode DIRECTORIES() { return getToken(SqlBaseParser.DIRECTORIES, 0); }
		public TerminalNode LOCATION() { return getToken(SqlBaseParser.LOCATION, 0); }
		public TerminalNode EXCHANGE() { return getToken(SqlBaseParser.EXCHANGE, 0); }
		public TerminalNode ARCHIVE() { return getToken(SqlBaseParser.ARCHIVE, 0); }
		public TerminalNode UNARCHIVE() { return getToken(SqlBaseParser.UNARCHIVE, 0); }
		public TerminalNode FILEFORMAT() { return getToken(SqlBaseParser.FILEFORMAT, 0); }
		public TerminalNode TOUCH() { return getToken(SqlBaseParser.TOUCH, 0); }
		public TerminalNode COMPACT() { return getToken(SqlBaseParser.COMPACT, 0); }
		public TerminalNode CONCATENATE() { return getToken(SqlBaseParser.CONCATENATE, 0); }
		public TerminalNode CHANGE() { return getToken(SqlBaseParser.CHANGE, 0); }
		public TerminalNode CASCADE() { return getToken(SqlBaseParser.CASCADE, 0); }
		public TerminalNode RESTRICT() { return getToken(SqlBaseParser.RESTRICT, 0); }
		public TerminalNode BUCKETS() { return getToken(SqlBaseParser.BUCKETS, 0); }
		public TerminalNode CLUSTERED() { return getToken(SqlBaseParser.CLUSTERED, 0); }
		public TerminalNode SORTED() { return getToken(SqlBaseParser.SORTED, 0); }
		public TerminalNode PURGE() { return getToken(SqlBaseParser.PURGE, 0); }
		public TerminalNode INPUTFORMAT() { return getToken(SqlBaseParser.INPUTFORMAT, 0); }
		public TerminalNode OUTPUTFORMAT() { return getToken(SqlBaseParser.OUTPUTFORMAT, 0); }
		public TerminalNode DBPROPERTIES() { return getToken(SqlBaseParser.DBPROPERTIES, 0); }
		public TerminalNode DFS() { return getToken(SqlBaseParser.DFS, 0); }
		public TerminalNode TRUNCATE() { return getToken(SqlBaseParser.TRUNCATE, 0); }
		public TerminalNode COMPUTE() { return getToken(SqlBaseParser.COMPUTE, 0); }
		public TerminalNode LIST() { return getToken(SqlBaseParser.LIST, 0); }
		public TerminalNode STATISTICS() { return getToken(SqlBaseParser.STATISTICS, 0); }
		public TerminalNode ANALYZE() { return getToken(SqlBaseParser.ANALYZE, 0); }
		public TerminalNode PARTITIONED() { return getToken(SqlBaseParser.PARTITIONED, 0); }
		public TerminalNode EXTERNAL() { return getToken(SqlBaseParser.EXTERNAL, 0); }
		public TerminalNode DEFINED() { return getToken(SqlBaseParser.DEFINED, 0); }
		public TerminalNode RECORDWRITER() { return getToken(SqlBaseParser.RECORDWRITER, 0); }
		public TerminalNode REVOKE() { return getToken(SqlBaseParser.REVOKE, 0); }
		public TerminalNode GRANT() { return getToken(SqlBaseParser.GRANT, 0); }
		public TerminalNode LOCK() { return getToken(SqlBaseParser.LOCK, 0); }
		public TerminalNode UNLOCK() { return getToken(SqlBaseParser.UNLOCK, 0); }
		public TerminalNode MSCK() { return getToken(SqlBaseParser.MSCK, 0); }
		public TerminalNode REPAIR() { return getToken(SqlBaseParser.REPAIR, 0); }
		public TerminalNode RECOVER() { return getToken(SqlBaseParser.RECOVER, 0); }
		public TerminalNode EXPORT() { return getToken(SqlBaseParser.EXPORT, 0); }
		public TerminalNode IMPORT() { return getToken(SqlBaseParser.IMPORT, 0); }
		public TerminalNode LOAD() { return getToken(SqlBaseParser.LOAD, 0); }
		public TerminalNode VALUES() { return getToken(SqlBaseParser.VALUES, 0); }
		public TerminalNode COMMENT() { return getToken(SqlBaseParser.COMMENT, 0); }
		public TerminalNode ROLE() { return getToken(SqlBaseParser.ROLE, 0); }
		public TerminalNode ROLES() { return getToken(SqlBaseParser.ROLES, 0); }
		public TerminalNode COMPACTIONS() { return getToken(SqlBaseParser.COMPACTIONS, 0); }
		public TerminalNode PRINCIPALS() { return getToken(SqlBaseParser.PRINCIPALS, 0); }
		public TerminalNode TRANSACTIONS() { return getToken(SqlBaseParser.TRANSACTIONS, 0); }
		public TerminalNode INDEX() { return getToken(SqlBaseParser.INDEX, 0); }
		public TerminalNode INDEXES() { return getToken(SqlBaseParser.INDEXES, 0); }
		public TerminalNode LOCKS() { return getToken(SqlBaseParser.LOCKS, 0); }
		public TerminalNode OPTION() { return getToken(SqlBaseParser.OPTION, 0); }
		public TerminalNode LOCAL() { return getToken(SqlBaseParser.LOCAL, 0); }
		public TerminalNode INPATH() { return getToken(SqlBaseParser.INPATH, 0); }
		public TerminalNode ASC() { return getToken(SqlBaseParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(SqlBaseParser.DESC, 0); }
		public TerminalNode LIMIT() { return getToken(SqlBaseParser.LIMIT, 0); }
		public TerminalNode RENAME() { return getToken(SqlBaseParser.RENAME, 0); }
		public TerminalNode SETS() { return getToken(SqlBaseParser.SETS, 0); }
		public TerminalNode AT() { return getToken(SqlBaseParser.AT, 0); }
		public TerminalNode NULLS() { return getToken(SqlBaseParser.NULLS, 0); }
		public TerminalNode OVERWRITE() { return getToken(SqlBaseParser.OVERWRITE, 0); }
		public TerminalNode ALL() { return getToken(SqlBaseParser.ALL, 0); }
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public TerminalNode BETWEEN() { return getToken(SqlBaseParser.BETWEEN, 0); }
		public TerminalNode BY() { return getToken(SqlBaseParser.BY, 0); }
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public TerminalNode DELETE() { return getToken(SqlBaseParser.DELETE, 0); }
		public TerminalNode DESCRIBE() { return getToken(SqlBaseParser.DESCRIBE, 0); }
		public TerminalNode DROP() { return getToken(SqlBaseParser.DROP, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public TerminalNode FALSE() { return getToken(SqlBaseParser.FALSE, 0); }
		public TerminalNode FOR() { return getToken(SqlBaseParser.FOR, 0); }
		public TerminalNode GROUP() { return getToken(SqlBaseParser.GROUP, 0); }
		public TerminalNode IN() { return getToken(SqlBaseParser.IN, 0); }
		public TerminalNode INSERT() { return getToken(SqlBaseParser.INSERT, 0); }
		public TerminalNode INTO() { return getToken(SqlBaseParser.INTO, 0); }
		public TerminalNode IS() { return getToken(SqlBaseParser.IS, 0); }
		public TerminalNode LIKE() { return getToken(SqlBaseParser.LIKE, 0); }
		public TerminalNode NULL() { return getToken(SqlBaseParser.NULL, 0); }
		public TerminalNode ORDER() { return getToken(SqlBaseParser.ORDER, 0); }
		public TerminalNode OUTER() { return getToken(SqlBaseParser.OUTER, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TerminalNode TRUE() { return getToken(SqlBaseParser.TRUE, 0); }
		public TerminalNode WITH() { return getToken(SqlBaseParser.WITH, 0); }
		public TerminalNode RLIKE() { return getToken(SqlBaseParser.RLIKE, 0); }
		public TerminalNode AND() { return getToken(SqlBaseParser.AND, 0); }
		public TerminalNode CASE() { return getToken(SqlBaseParser.CASE, 0); }
		public TerminalNode CAST() { return getToken(SqlBaseParser.CAST, 0); }
		public TerminalNode DISTINCT() { return getToken(SqlBaseParser.DISTINCT, 0); }
		public TerminalNode DIV() { return getToken(SqlBaseParser.DIV, 0); }
		public TerminalNode ELSE() { return getToken(SqlBaseParser.ELSE, 0); }
		public TerminalNode END() { return getToken(SqlBaseParser.END, 0); }
		public TerminalNode FUNCTION() { return getToken(SqlBaseParser.FUNCTION, 0); }
		public TerminalNode INTERVAL() { return getToken(SqlBaseParser.INTERVAL, 0); }
		public TerminalNode MACRO() { return getToken(SqlBaseParser.MACRO, 0); }
		public TerminalNode OR() { return getToken(SqlBaseParser.OR, 0); }
		public TerminalNode STRATIFY() { return getToken(SqlBaseParser.STRATIFY, 0); }
		public TerminalNode THEN() { return getToken(SqlBaseParser.THEN, 0); }
		public TerminalNode UNBOUNDED() { return getToken(SqlBaseParser.UNBOUNDED, 0); }
		public TerminalNode WHEN() { return getToken(SqlBaseParser.WHEN, 0); }
		public TerminalNode DATABASE() { return getToken(SqlBaseParser.DATABASE, 0); }
		public TerminalNode SELECT() { return getToken(SqlBaseParser.SELECT, 0); }
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public TerminalNode WHERE() { return getToken(SqlBaseParser.WHERE, 0); }
		public TerminalNode HAVING() { return getToken(SqlBaseParser.HAVING, 0); }
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public NonReservedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonReserved; }
	}

	public final NonReservedContext nonReserved() throws RecognitionException {
		NonReservedContext _localctx = new NonReservedContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_nonReserved);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2333);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & -1147292005072634880L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 648518088643313663L) != 0) || ((((_la - 137)) & ~0x3f) == 0 && ((1L << (_la - 137)) & -31L) != 0) || ((((_la - 201)) & ~0x3f) == 0 && ((1L << (_la - 201)) & 3758096383L) != 0)) ) {
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
		case 34:
			return queryTerm_sempred((QueryTermContext)_localctx, predIndex);
		case 64:
			return booleanExpression_sempred((BooleanExpressionContext)_localctx, predIndex);
		case 70:
			return valueExpression_sempred((ValueExpressionContext)_localctx, predIndex);
		case 71:
			return primaryExpression_sempred((PrimaryExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean queryTerm_sempred(QueryTermContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean booleanExpression_sempred(BooleanExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 2);
		case 2:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean valueExpression_sempred(ValueExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 6);
		case 4:
			return precpred(_ctx, 5);
		case 5:
			return precpred(_ctx, 4);
		case 6:
			return precpred(_ctx, 3);
		case 7:
			return precpred(_ctx, 2);
		case 8:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean primaryExpression_sempred(PrimaryExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 9:
			return precpred(_ctx, 4);
		case 10:
			return precpred(_ctx, 2);
		}
		return true;
	}

	private static final String _serializedATNSegment0 =
		"\u0004\u0001\u00f9\u0920\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"+
		"\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007"+
		"\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007"+
		"\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007"+
		"\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007"+
		"\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007"+
		"\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007"+
		",\u0002-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u0007"+
		"1\u00022\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u0007"+
		"6\u00027\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0002;\u0007"+
		";\u0002<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007?\u0002@\u0007"+
		"@\u0002A\u0007A\u0002B\u0007B\u0002C\u0007C\u0002D\u0007D\u0002E\u0007"+
		"E\u0002F\u0007F\u0002G\u0007G\u0002H\u0007H\u0002I\u0007I\u0002J\u0007"+
		"J\u0002K\u0007K\u0002L\u0007L\u0002M\u0007M\u0002N\u0007N\u0002O\u0007"+
		"O\u0002P\u0007P\u0002Q\u0007Q\u0002R\u0007R\u0002S\u0007S\u0002T\u0007"+
		"T\u0002U\u0007U\u0002V\u0007V\u0002W\u0007W\u0002X\u0007X\u0002Y\u0007"+
		"Y\u0002Z\u0007Z\u0002[\u0007[\u0002\\\u0007\\\u0002]\u0007]\u0002^\u0007"+
		"^\u0002_\u0007_\u0002`\u0007`\u0002a\u0007a\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u00dc\b\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0003\u0005\u00e1\b\u0005\u0001\u0005\u0003\u0005\u00e4"+
		"\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u00e9\b\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005"+
		"\u00f6\b\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u00fa\b\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u0101"+
		"\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u0106\b\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u010b\b\u0005\u0001\u0005"+
		"\u0003\u0005\u010e\b\u0005\u0001\u0005\u0003\u0005\u0111\b\u0005\u0001"+
		"\u0005\u0001\u0005\u0003\u0005\u0115\b\u0005\u0001\u0005\u0003\u0005\u0118"+
		"\b\u0005\u0001\u0005\u0003\u0005\u011b\b\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u0122\b\u0005\u0001\u0005"+
		"\u0001\u0005\u0003\u0005\u0126\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u012e\b\u0005\u0001\u0005"+
		"\u0003\u0005\u0131\b\u0005\u0001\u0005\u0003\u0005\u0134\b\u0005\u0001"+
		"\u0005\u0003\u0005\u0137\b\u0005\u0001\u0005\u0003\u0005\u013a\b\u0005"+
		"\u0001\u0005\u0003\u0005\u013d\b\u0005\u0001\u0005\u0001\u0005\u0003\u0005"+
		"\u0141\b\u0005\u0001\u0005\u0003\u0005\u0144\b\u0005\u0001\u0005\u0003"+
		"\u0005\u0147\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0003\u0005\u014e\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0003\u0005\u0154\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0003\u0005\u015a\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u0162\b\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u0182"+
		"\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0003\u0005\u018a\b\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u018e"+
		"\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u0193\b\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u0199\b\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0003\u0005\u01a1\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0003\u0005\u01a7\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0003\u0005\u01b4\b\u0005\u0001\u0005\u0004\u0005\u01b7\b"+
		"\u0005\u000b\u0005\f\u0005\u01b8\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u01c2\b\u0005\u0001"+
		"\u0005\u0004\u0005\u01c5\b\u0005\u000b\u0005\f\u0005\u01c6\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0003\u0005\u01d7\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0005\u0005\u01dc\b\u0005\n\u0005\f\u0005\u01df\t\u0005\u0001\u0005\u0003"+
		"\u0005\u01e2\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0003\u0005\u01ea\b\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0005\u0005\u01ef\b\u0005\n\u0005\f\u0005\u01f2\t\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u01f8\b\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0003\u0005\u0207\b\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u020b\b"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u0211"+
		"\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u0217"+
		"\b\u0005\u0001\u0005\u0003\u0005\u021a\b\u0005\u0001\u0005\u0003\u0005"+
		"\u021d\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005"+
		"\u0223\b\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u0227\b\u0005\u0001"+
		"\u0005\u0001\u0005\u0003\u0005\u022b\b\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0003\u0005\u0230\b\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u0234"+
		"\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0003\u0005\u023c\b\u0005\u0001\u0005\u0003\u0005\u023f\b\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0003\u0005\u0248\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0003\u0005\u024d\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0003\u0005\u0253\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0003\u0005\u0259\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005\u0263\b\u0005"+
		"\n\u0005\f\u0005\u0266\t\u0005\u0003\u0005\u0268\b\u0005\u0001\u0005\u0001"+
		"\u0005\u0003\u0005\u026c\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003"+
		"\u0005\u0271\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u0276"+
		"\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003"+
		"\u0005\u027d\b\u0005\u0001\u0005\u0003\u0005\u0280\b\u0005\u0001\u0005"+
		"\u0003\u0005\u0283\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0003\u0005\u028a\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0003\u0005\u028f\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0003\u0005\u0295\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u029e\b\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005"+
		"\u02a6\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005"+
		"\u02ac\b\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u02b0\b\u0005\u0001"+
		"\u0005\u0001\u0005\u0003\u0005\u02b4\b\u0005\u0001\u0005\u0001\u0005\u0003"+
		"\u0005\u02b8\b\u0005\u0003\u0005\u02ba\b\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005"+
		"\u02c3\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005"+
		"\u02c9\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u02ce\b"+
		"\u0005\u0001\u0005\u0003\u0005\u02d1\b\u0005\u0001\u0005\u0001\u0005\u0003"+
		"\u0005\u02d5\b\u0005\u0001\u0005\u0003\u0005\u02d8\b\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005\u02df\b\u0005"+
		"\n\u0005\f\u0005\u02e2\t\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u02e6"+
		"\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u02eb\b\u0005"+
		"\u0001\u0005\u0003\u0005\u02ee\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0003\u0005\u02f4\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u02fc\b\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0003\u0005\u0301\b\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0003\u0005\u0307\b\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0003\u0005\u030d\b\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005"+
		"\u0316\b\u0005\n\u0005\f\u0005\u0319\t\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0005\u0005\u031e\b\u0005\n\u0005\f\u0005\u0321\t\u0005\u0001\u0005"+
		"\u0001\u0005\u0005\u0005\u0325\b\u0005\n\u0005\f\u0005\u0328\t\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0005\u0005\u032d\b\u0005\n\u0005\f\u0005"+
		"\u0330\t\u0005\u0003\u0005\u0332\b\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u033a\b\u0006\u0001"+
		"\u0006\u0001\u0006\u0003\u0006\u033e\b\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u0345\b\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u03b9"+
		"\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0003\u0006\u03c1\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u03c9\b\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003"+
		"\u0006\u03d2\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003"+
		"\u0006\u03de\b\u0006\u0001\u0007\u0001\u0007\u0003\u0007\u03e2\b\u0007"+
		"\u0001\u0007\u0003\u0007\u03e5\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0003\u0007\u03eb\b\u0007\u0001\u0007\u0001\u0007\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u03f5\b\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003"+
		"\t\u0401\b\t\u0001\t\u0001\t\u0001\t\u0003\t\u0406\b\t\u0001\n\u0001\n"+
		"\u0001\n\u0001\u000b\u0003\u000b\u040c\b\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003"+
		"\f\u0418\b\f\u0003\f\u041a\b\f\u0001\f\u0001\f\u0001\f\u0003\f\u041f\b"+
		"\f\u0001\f\u0001\f\u0003\f\u0423\b\f\u0003\f\u0425\b\f\u0001\r\u0001\r"+
		"\u0003\r\u0429\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0005\u000e\u0430\b\u000e\n\u000e\f\u000e\u0433\t\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u043a\b\u000f"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010"+
		"\u0441\b\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011"+
		"\u0447\b\u0011\u0005\u0011\u0449\b\u0011\n\u0011\f\u0011\u044c\t\u0011"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0005\u0012\u0452\b\u0012"+
		"\n\u0012\f\u0012\u0455\t\u0012\u0001\u0013\u0001\u0013\u0003\u0013\u0459"+
		"\b\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0005"+
		"\u0015\u0466\b\u0015\n\u0015\f\u0015\u0469\t\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0016\u0001\u0016\u0003\u0016\u046f\b\u0016\u0001\u0016\u0003\u0016"+
		"\u0472\b\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0005\u0017\u0477\b"+
		"\u0017\n\u0017\f\u0017\u047a\t\u0017\u0001\u0017\u0003\u0017\u047d\b\u0017"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u0483\b\u0018"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0005\u0019\u0489\b\u0019"+
		"\n\u0019\f\u0019\u048c\t\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0005\u001a\u0494\b\u001a\n\u001a\f\u001a"+
		"\u0497\t\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u04a1\b\u001b\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0003\u001c\u04a8\b\u001c"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0003\u001d\u04ae\b\u001d"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001f\u0003\u001f\u04b4\b\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0004\u001f"+
		"\u04bb\b\u001f\u000b\u001f\f\u001f\u04bc\u0003\u001f\u04bf\b\u001f\u0001"+
		" \u0001 \u0001 \u0001 \u0001 \u0005 \u04c6\b \n \f \u04c9\t \u0003 \u04cb"+
		"\b \u0001 \u0001 \u0001 \u0001 \u0001 \u0005 \u04d2\b \n \f \u04d5\t "+
		"\u0003 \u04d7\b \u0001 \u0001 \u0001 \u0001 \u0001 \u0005 \u04de\b \n"+
		" \f \u04e1\t \u0003 \u04e3\b \u0001 \u0001 \u0001 \u0001 \u0001 \u0005"+
		" \u04ea\b \n \f \u04ed\t \u0003 \u04ef\b \u0001 \u0003 \u04f2\b \u0001"+
		" \u0001 \u0003 \u04f6\b \u0001!\u0003!\u04f9\b!\u0001!\u0001!\u0001!\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0003\"\u0504\b\"\u0001\"\u0005"+
		"\"\u0507\b\"\n\"\f\"\u050a\t\"\u0001#\u0001#\u0001#\u0001#\u0001#\u0001"+
		"#\u0001#\u0001#\u0003#\u0514\b#\u0001$\u0001$\u0003$\u0518\b$\u0001$\u0001"+
		"$\u0003$\u051c\b$\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001"+
		"%\u0001%\u0001%\u0003%\u0528\b%\u0001%\u0003%\u052b\b%\u0001%\u0001%\u0003"+
		"%\u052f\b%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0003"+
		"%\u0539\b%\u0001%\u0001%\u0003%\u053d\b%\u0003%\u053f\b%\u0001%\u0003"+
		"%\u0542\b%\u0001%\u0001%\u0003%\u0546\b%\u0001%\u0003%\u0549\b%\u0001"+
		"%\u0001%\u0003%\u054d\b%\u0001%\u0001%\u0005%\u0551\b%\n%\f%\u0554\t%"+
		"\u0001%\u0003%\u0557\b%\u0001%\u0001%\u0003%\u055b\b%\u0001%\u0001%\u0001"+
		"%\u0003%\u0560\b%\u0001%\u0003%\u0563\b%\u0003%\u0565\b%\u0001%\u0005"+
		"%\u0568\b%\n%\f%\u056b\t%\u0001%\u0001%\u0003%\u056f\b%\u0001%\u0003%"+
		"\u0572\b%\u0001%\u0001%\u0003%\u0576\b%\u0001%\u0003%\u0579\b%\u0003%"+
		"\u057b\b%\u0001&\u0001&\u0001&\u0003&\u0580\b&\u0001&\u0005&\u0583\b&"+
		"\n&\f&\u0586\t&\u0001&\u0001&\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'"+
		"\u0001\'\u0005\'\u0590\b\'\n\'\f\'\u0593\t\'\u0001\'\u0001\'\u0003\'\u0597"+
		"\b\'\u0001(\u0001(\u0001(\u0001(\u0005(\u059d\b(\n(\f(\u05a0\t(\u0001"+
		"(\u0005(\u05a3\b(\n(\f(\u05a6\t(\u0001)\u0001)\u0001)\u0001)\u0001)\u0005"+
		")\u05ad\b)\n)\f)\u05b0\t)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001"+
		")\u0001)\u0001)\u0001)\u0005)\u05bc\b)\n)\f)\u05bf\t)\u0001)\u0001)\u0003"+
		")\u05c3\b)\u0001*\u0001*\u0001*\u0001*\u0005*\u05c9\b*\n*\f*\u05cc\t*"+
		"\u0003*\u05ce\b*\u0001*\u0001*\u0003*\u05d2\b*\u0001+\u0001+\u0001+\u0003"+
		"+\u05d7\b+\u0001+\u0001+\u0001+\u0001+\u0001+\u0005+\u05de\b+\n+\f+\u05e1"+
		"\t+\u0003+\u05e3\b+\u0001+\u0001+\u0001+\u0003+\u05e8\b+\u0001+\u0001"+
		"+\u0001+\u0005+\u05ed\b+\n+\f+\u05f0\t+\u0003+\u05f2\b+\u0001,\u0001,"+
		"\u0001-\u0001-\u0005-\u05f8\b-\n-\f-\u05fb\t-\u0001.\u0001.\u0001.\u0001"+
		".\u0003.\u0601\b.\u0001.\u0001.\u0001.\u0001.\u0001.\u0003.\u0608\b.\u0001"+
		"/\u0003/\u060b\b/\u0001/\u0001/\u0001/\u0003/\u0610\b/\u0001/\u0001/\u0001"+
		"/\u0001/\u0003/\u0616\b/\u0001/\u0001/\u0003/\u061a\b/\u0001/\u0003/\u061d"+
		"\b/\u0001/\u0001/\u0003/\u0621\b/\u00010\u00010\u00010\u00010\u00010\u0001"+
		"0\u00010\u00050\u062a\b0\n0\f0\u062d\t0\u00010\u00010\u00010\u00010\u0003"+
		"0\u0633\b0\u00030\u0635\b0\u00011\u00011\u00011\u00011\u00011\u00011\u0001"+
		"1\u00011\u00011\u00011\u00011\u00011\u00011\u00011\u00011\u00011\u0001"+
		"1\u00011\u00011\u00031\u064a\b1\u00031\u064c\b1\u00031\u064e\b1\u0001"+
		"1\u00011\u00012\u00012\u00012\u00012\u00013\u00013\u00013\u00053\u0659"+
		"\b3\n3\f3\u065c\t3\u00014\u00014\u00014\u00014\u00054\u0662\b4\n4\f4\u0665"+
		"\t4\u00014\u00014\u00015\u00015\u00035\u066b\b5\u00016\u00016\u00016\u0001"+
		"6\u00056\u0671\b6\n6\f6\u0674\t6\u00016\u00016\u00017\u00017\u00017\u0003"+
		"7\u067b\b7\u00018\u00018\u00038\u067f\b8\u00018\u00038\u0682\b8\u0001"+
		"8\u00038\u0685\b8\u00018\u00018\u00018\u00018\u00038\u068b\b8\u00018\u0003"+
		"8\u068e\b8\u00018\u00038\u0691\b8\u00018\u00018\u00018\u00018\u00038\u0697"+
		"\b8\u00018\u00038\u069a\b8\u00018\u00038\u069d\b8\u00018\u00018\u0001"+
		"8\u00018\u00018\u00018\u00058\u06a5\b8\n8\f8\u06a8\t8\u00038\u06aa\b8"+
		"\u00018\u00018\u00038\u06ae\b8\u00019\u00019\u00019\u00019\u00059\u06b4"+
		"\b9\n9\f9\u06b7\t9\u00019\u00039\u06ba\b9\u00019\u00019\u00039\u06be\b"+
		"9\u00039\u06c0\b9\u0001:\u0001:\u0001:\u0001:\u0001:\u0001:\u0001:\u0003"+
		":\u06c9\b:\u0001:\u0001:\u0001:\u0001:\u0001:\u0001:\u0001:\u0001:\u0001"+
		":\u0001:\u0003:\u06d5\b:\u0003:\u06d7\b:\u0001:\u0001:\u0001:\u0001:\u0001"+
		":\u0003:\u06de\b:\u0001:\u0001:\u0001:\u0001:\u0001:\u0003:\u06e5\b:\u0001"+
		":\u0001:\u0001:\u0001:\u0003:\u06eb\b:\u0001:\u0001:\u0001:\u0001:\u0003"+
		":\u06f1\b:\u0003:\u06f3\b:\u0001;\u0001;\u0001;\u0003;\u06f8\b;\u0001"+
		";\u0001;\u0001<\u0001<\u0001<\u0003<\u06ff\b<\u0001<\u0001<\u0001=\u0001"+
		"=\u0003=\u0705\b=\u0001=\u0001=\u0003=\u0709\b=\u0003=\u070b\b=\u0001"+
		">\u0001>\u0001>\u0005>\u0710\b>\n>\f>\u0713\t>\u0001?\u0001?\u0001@\u0001"+
		"@\u0001@\u0001@\u0001@\u0001@\u0001@\u0001@\u0001@\u0001@\u0003@\u0721"+
		"\b@\u0001@\u0001@\u0001@\u0001@\u0001@\u0001@\u0005@\u0729\b@\n@\f@\u072c"+
		"\t@\u0001A\u0001A\u0003A\u0730\bA\u0001B\u0001B\u0001B\u0001B\u0001B\u0001"+
		"B\u0001B\u0001B\u0001B\u0001C\u0003C\u073c\bC\u0001C\u0001C\u0001C\u0001"+
		"C\u0001C\u0001C\u0003C\u0744\bC\u0001C\u0001C\u0001C\u0001C\u0001C\u0005"+
		"C\u074b\bC\nC\fC\u074e\tC\u0001C\u0001C\u0001C\u0003C\u0753\bC\u0001C"+
		"\u0001C\u0001C\u0001C\u0001C\u0001C\u0003C\u075b\bC\u0001C\u0001C\u0001"+
		"C\u0001C\u0003C\u0761\bC\u0001C\u0003C\u0764\bC\u0001D\u0001D\u0001D\u0001"+
		"D\u0005D\u076a\bD\nD\fD\u076d\tD\u0001D\u0001D\u0001E\u0001E\u0001E\u0001"+
		"E\u0005E\u0775\bE\nE\fE\u0778\tE\u0001E\u0001E\u0001F\u0001F\u0001F\u0001"+
		"F\u0003F\u0780\bF\u0001F\u0001F\u0001F\u0001F\u0001F\u0001F\u0001F\u0001"+
		"F\u0001F\u0001F\u0001F\u0001F\u0001F\u0001F\u0001F\u0001F\u0001F\u0001"+
		"F\u0001F\u0005F\u0795\bF\nF\fF\u0798\tF\u0001G\u0001G\u0001G\u0004G\u079d"+
		"\bG\u000bG\fG\u079e\u0001G\u0001G\u0003G\u07a3\bG\u0001G\u0001G\u0001"+
		"G\u0001G\u0001G\u0004G\u07aa\bG\u000bG\fG\u07ab\u0001G\u0001G\u0003G\u07b0"+
		"\bG\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001"+
		"G\u0001G\u0001G\u0001G\u0001G\u0005G\u07c0\bG\nG\fG\u07c3\tG\u0003G\u07c5"+
		"\bG\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0003G\u07cd\bG\u0001G\u0001"+
		"G\u0001G\u0001G\u0001G\u0001G\u0001G\u0003G\u07d6\bG\u0001G\u0001G\u0001"+
		"G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0004"+
		"G\u07e4\bG\u000bG\fG\u07e5\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001"+
		"G\u0001G\u0001G\u0003G\u07f1\bG\u0001G\u0001G\u0001G\u0005G\u07f6\bG\n"+
		"G\fG\u07f9\tG\u0003G\u07fb\bG\u0001G\u0001G\u0001G\u0003G\u0800\bG\u0001"+
		"G\u0001G\u0001G\u0001G\u0001G\u0003G\u0807\bG\u0001G\u0001G\u0001G\u0001"+
		"G\u0001G\u0001G\u0001G\u0001G\u0005G\u0811\bG\nG\fG\u0814\tG\u0001H\u0001"+
		"H\u0001H\u0001H\u0001H\u0001H\u0001H\u0001H\u0004H\u081e\bH\u000bH\fH"+
		"\u081f\u0003H\u0822\bH\u0001I\u0001I\u0001J\u0001J\u0001K\u0001K\u0001"+
		"L\u0001L\u0001M\u0001M\u0005M\u082e\bM\nM\fM\u0831\tM\u0001N\u0001N\u0001"+
		"N\u0001N\u0003N\u0837\bN\u0001O\u0003O\u083a\bO\u0001O\u0001O\u0003O\u083e"+
		"\bO\u0001P\u0001P\u0001P\u0003P\u0843\bP\u0001Q\u0001Q\u0001Q\u0001Q\u0001"+
		"Q\u0001Q\u0001Q\u0001Q\u0001Q\u0001Q\u0001Q\u0001Q\u0001Q\u0001Q\u0001"+
		"Q\u0003Q\u0854\bQ\u0001Q\u0001Q\u0003Q\u0858\bQ\u0001Q\u0001Q\u0001Q\u0001"+
		"Q\u0001Q\u0005Q\u085f\bQ\nQ\fQ\u0862\tQ\u0001Q\u0003Q\u0865\bQ\u0003Q"+
		"\u0867\bQ\u0001R\u0001R\u0001R\u0005R\u086c\bR\nR\fR\u086f\tR\u0001S\u0001"+
		"S\u0001S\u0001S\u0003S\u0875\bS\u0001T\u0001T\u0001T\u0005T\u087a\bT\n"+
		"T\fT\u087d\tT\u0001U\u0001U\u0001U\u0001U\u0001U\u0003U\u0884\bU\u0001"+
		"V\u0001V\u0001V\u0001V\u0001V\u0001W\u0001W\u0001W\u0001W\u0005W\u088f"+
		"\bW\nW\fW\u0892\tW\u0001X\u0001X\u0001X\u0001X\u0001Y\u0001Y\u0001Y\u0001"+
		"Y\u0001Y\u0001Y\u0001Y\u0005Y\u089f\bY\nY\fY\u08a2\tY\u0001Y\u0001Y\u0001"+
		"Y\u0001Y\u0001Y\u0005Y\u08a9\bY\nY\fY\u08ac\tY\u0003Y\u08ae\bY\u0001Y"+
		"\u0001Y\u0001Y\u0001Y\u0001Y\u0005Y\u08b5\bY\nY\fY\u08b8\tY\u0003Y\u08ba"+
		"\bY\u0003Y\u08bc\bY\u0001Y\u0003Y\u08bf\bY\u0001Y\u0003Y\u08c2\bY\u0001"+
		"Z\u0001Z\u0001Z\u0001Z\u0001Z\u0001Z\u0001Z\u0001Z\u0001Z\u0001Z\u0001"+
		"Z\u0001Z\u0001Z\u0001Z\u0001Z\u0001Z\u0003Z\u08d4\bZ\u0001[\u0001[\u0001"+
		"[\u0001[\u0001[\u0001[\u0001[\u0003[\u08dd\b[\u0001\\\u0001\\\u0001\\"+
		"\u0005\\\u08e2\b\\\n\\\f\\\u08e5\t\\\u0001]\u0001]\u0001]\u0001]\u0001"+
		"]\u0001]\u0001]\u0001]\u0001]\u0001]\u0001]\u0001]\u0001]\u0001]\u0001"+
		"]\u0001]\u0003]\u08f7\b]\u0001^\u0001^\u0001^\u0003^\u08fc\b^\u0001_\u0001"+
		"_\u0001`\u0003`\u0901\b`\u0001`\u0001`\u0003`\u0905\b`\u0001`\u0001`\u0003"+
		"`\u0909\b`\u0001`\u0001`\u0003`\u090d\b`\u0001`\u0001`\u0003`\u0911\b"+
		"`\u0001`\u0001`\u0003`\u0915\b`\u0001`\u0001`\u0003`\u0919\b`\u0001`\u0003"+
		"`\u091c\b`\u0001a\u0001a\u0001a\u0005\u02e0\u0317\u031f\u0326\u032e\u0004"+
		"D\u0080\u008c\u008eb\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014"+
		"\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfh"+
		"jlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092"+
		"\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa"+
		"\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2"+
		"\u0000\u0018\u0001\u0000\u00c1\u00c2\u0001\u0000MN\u0003\u0000VX\u00a7"+
		"\u00a7\u00ad\u00ad\u0002\u0000\u000b\u000b\u001d\u001d\u0002\u0000**S"+
		"S\u0002\u0000\u00a7\u00a7\u00ad\u00ad\u0002\u0000\f\f\u00ce\u00ce\u0001"+
		"\u0000be\u0001\u0000)*\u0002\u0000FFHH\u0001\u0000\u000e\u000f\u0001\u0000"+
		"\u00ee\u00ef\u0001\u0000\"#\u0002\u0000\u0084\u0085\u008a\u008a\u0001"+
		"\u0000\u0086\u0089\u0001\u0000\u0084\u0085\u0001\u0000|\u0083\u0001\u0000"+
		"\u0084\u008d\u0001\u0000\u001b\u001e\u0001\u0000&\'\u0002\u0000??\u0094"+
		"\u0094\u0002\u0000\u0017\u0017\u0092\u0092\u0001\u0000CD\b\u0000\n144"+
		"<afw{{\u0089\u0089\u008e\u00e5\u00e7\u00e8\u0aa5\u0000\u00c4\u0001\u0000"+
		"\u0000\u0000\u0002\u00c7\u0001\u0000\u0000\u0000\u0004\u00ca\u0001\u0000"+
		"\u0000\u0000\u0006\u00cd\u0001\u0000\u0000\u0000\b\u00d0\u0001\u0000\u0000"+
		"\u0000\n\u0331\u0001\u0000\u0000\u0000\f\u03dd\u0001\u0000\u0000\u0000"+
		"\u000e\u03df\u0001\u0000\u0000\u0000\u0010\u03ee\u0001\u0000\u0000\u0000"+
		"\u0012\u03fa\u0001\u0000\u0000\u0000\u0014\u0407\u0001\u0000\u0000\u0000"+
		"\u0016\u040b\u0001\u0000\u0000\u0000\u0018\u0424\u0001\u0000\u0000\u0000"+
		"\u001a\u0426\u0001\u0000\u0000\u0000\u001c\u042a\u0001\u0000\u0000\u0000"+
		"\u001e\u0436\u0001\u0000\u0000\u0000 \u0440\u0001\u0000\u0000\u0000\""+
		"\u0442\u0001\u0000\u0000\u0000$\u044d\u0001\u0000\u0000\u0000&\u0456\u0001"+
		"\u0000\u0000\u0000(\u045e\u0001\u0000\u0000\u0000*\u0461\u0001\u0000\u0000"+
		"\u0000,\u046c\u0001\u0000\u0000\u0000.\u047c\u0001\u0000\u0000\u00000"+
		"\u0482\u0001\u0000\u0000\u00002\u0484\u0001\u0000\u0000\u00004\u048f\u0001"+
		"\u0000\u0000\u00006\u04a0\u0001\u0000\u0000\u00008\u04a7\u0001\u0000\u0000"+
		"\u0000:\u04a9\u0001\u0000\u0000\u0000<\u04af\u0001\u0000\u0000\u0000>"+
		"\u04be\u0001\u0000\u0000\u0000@\u04ca\u0001\u0000\u0000\u0000B\u04f8\u0001"+
		"\u0000\u0000\u0000D\u04fd\u0001\u0000\u0000\u0000F\u0513\u0001\u0000\u0000"+
		"\u0000H\u0515\u0001\u0000\u0000\u0000J\u057a\u0001\u0000\u0000\u0000L"+
		"\u057c\u0001\u0000\u0000\u0000N\u0596\u0001\u0000\u0000\u0000P\u0598\u0001"+
		"\u0000\u0000\u0000R\u05a7\u0001\u0000\u0000\u0000T\u05d1\u0001\u0000\u0000"+
		"\u0000V\u05d3\u0001\u0000\u0000\u0000X\u05f3\u0001\u0000\u0000\u0000Z"+
		"\u05f5\u0001\u0000\u0000\u0000\\\u0607\u0001\u0000\u0000\u0000^\u0620"+
		"\u0001\u0000\u0000\u0000`\u0634\u0001\u0000\u0000\u0000b\u0636\u0001\u0000"+
		"\u0000\u0000d\u0651\u0001\u0000\u0000\u0000f\u0655\u0001\u0000\u0000\u0000"+
		"h\u065d\u0001\u0000\u0000\u0000j\u0668\u0001\u0000\u0000\u0000l\u066c"+
		"\u0001\u0000\u0000\u0000n\u0677\u0001\u0000\u0000\u0000p\u06ad\u0001\u0000"+
		"\u0000\u0000r\u06af\u0001\u0000\u0000\u0000t\u06f2\u0001\u0000\u0000\u0000"+
		"v\u06f7\u0001\u0000\u0000\u0000x\u06fe\u0001\u0000\u0000\u0000z\u0702"+
		"\u0001\u0000\u0000\u0000|\u070c\u0001\u0000\u0000\u0000~\u0714\u0001\u0000"+
		"\u0000\u0000\u0080\u0720\u0001\u0000\u0000\u0000\u0082\u072d\u0001\u0000"+
		"\u0000\u0000\u0084\u0731\u0001\u0000\u0000\u0000\u0086\u0763\u0001\u0000"+
		"\u0000\u0000\u0088\u0765\u0001\u0000\u0000\u0000\u008a\u0770\u0001\u0000"+
		"\u0000\u0000\u008c\u077f\u0001\u0000\u0000\u0000\u008e\u0806\u0001\u0000"+
		"\u0000\u0000\u0090\u0821\u0001\u0000\u0000\u0000\u0092\u0823\u0001\u0000"+
		"\u0000\u0000\u0094\u0825\u0001\u0000\u0000\u0000\u0096\u0827\u0001\u0000"+
		"\u0000\u0000\u0098\u0829\u0001\u0000\u0000\u0000\u009a\u082b\u0001\u0000"+
		"\u0000\u0000\u009c\u0832\u0001\u0000\u0000\u0000\u009e\u083d\u0001\u0000"+
		"\u0000\u0000\u00a0\u0842\u0001\u0000\u0000\u0000\u00a2\u0866\u0001\u0000"+
		"\u0000\u0000\u00a4\u0868\u0001\u0000\u0000\u0000\u00a6\u0870\u0001\u0000"+
		"\u0000\u0000\u00a8\u0876\u0001\u0000\u0000\u0000\u00aa\u087e\u0001\u0000"+
		"\u0000\u0000\u00ac\u0885\u0001\u0000\u0000\u0000\u00ae\u088a\u0001\u0000"+
		"\u0000\u0000\u00b0\u0893\u0001\u0000\u0000\u0000\u00b2\u08c1\u0001\u0000"+
		"\u0000\u0000\u00b4\u08d3\u0001\u0000\u0000\u0000\u00b6\u08dc\u0001\u0000"+
		"\u0000\u0000\u00b8\u08de\u0001\u0000\u0000\u0000\u00ba\u08f6\u0001\u0000"+
		"\u0000\u0000\u00bc\u08fb\u0001\u0000\u0000\u0000\u00be\u08fd\u0001\u0000"+
		"\u0000\u0000\u00c0\u091b\u0001\u0000\u0000\u0000\u00c2\u091d\u0001\u0000"+
		"\u0000\u0000\u00c4\u00c5\u0003\n\u0005\u0000\u00c5\u00c6\u0005\u0000\u0000"+
		"\u0001\u00c6\u0001\u0001\u0000\u0000\u0000\u00c7\u00c8\u0003z=\u0000\u00c8"+
		"\u00c9\u0005\u0000\u0000\u0001\u00c9\u0003\u0001\u0000\u0000\u0000\u00ca"+
		"\u00cb\u0003v;\u0000\u00cb\u00cc\u0005\u0000\u0000\u0001\u00cc\u0005\u0001"+
		"\u0000\u0000\u0000\u00cd\u00ce\u0003x<\u0000\u00ce\u00cf\u0005\u0000\u0000"+
		"\u0001\u00cf\u0007\u0001\u0000\u0000\u0000\u00d0\u00d1\u0003\u00a2Q\u0000"+
		"\u00d1\u00d2\u0005\u0000\u0000\u0001\u00d2\t\u0001\u0000\u0000\u0000\u00d3"+
		"\u0332\u0003\u0016\u000b\u0000\u00d4\u00d5\u0005^\u0000\u0000\u00d5\u0332"+
		"\u0003\u00ba]\u0000\u00d6\u00d7\u0005L\u0000\u0000\u00d7\u00db\u0005\u00c8"+
		"\u0000\u0000\u00d8\u00d9\u0005{\u0000\u0000\u00d9\u00da\u0005\u001e\u0000"+
		"\u0000\u00da\u00dc\u0005 \u0000\u0000\u00db\u00d8\u0001\u0000\u0000\u0000"+
		"\u00db\u00dc\u0001\u0000\u0000\u0000\u00dc\u00dd\u0001\u0000\u0000\u0000"+
		"\u00dd\u00e0\u0003\u00ba]\u0000\u00de\u00df\u0005n\u0000\u0000\u00df\u00e1"+
		"\u0005\u00e9\u0000\u0000\u00e0\u00de\u0001\u0000\u0000\u0000\u00e0\u00e1"+
		"\u0001\u0000\u0000\u0000\u00e1\u00e3\u0001\u0000\u0000\u0000\u00e2\u00e4"+
		"\u0003\u0014\n\u0000\u00e3\u00e2\u0001\u0000\u0000\u0000\u00e3\u00e4\u0001"+
		"\u0000\u0000\u0000\u00e4\u00e8\u0001\u0000\u0000\u0000\u00e5\u00e6\u0005"+
		"J\u0000\u0000\u00e6\u00e7\u0005\u00b3\u0000\u0000\u00e7\u00e9\u0003*\u0015"+
		"\u0000\u00e8\u00e5\u0001\u0000\u0000\u0000\u00e8\u00e9\u0001\u0000\u0000"+
		"\u0000\u00e9\u0332\u0001\u0000\u0000\u0000\u00ea\u00eb\u0005i\u0000\u0000"+
		"\u00eb\u00ec\u0005\u00c8\u0000\u0000\u00ec\u00ed\u0003\u00ba]\u0000\u00ed"+
		"\u00ee\u0005o\u0000\u0000\u00ee\u00ef\u0005\u00b3\u0000\u0000\u00ef\u00f0"+
		"\u0003*\u0015\u0000\u00f0\u0332\u0001\u0000\u0000\u0000\u00f1\u00f2\u0005"+
		"a\u0000\u0000\u00f2\u00f5\u0005\u00c8\u0000\u0000\u00f3\u00f4\u0005{\u0000"+
		"\u0000\u00f4\u00f6\u0005 \u0000\u0000\u00f5\u00f3\u0001\u0000\u0000\u0000"+
		"\u00f5\u00f6\u0001\u0000\u0000\u0000\u00f6\u00f7\u0001\u0000\u0000\u0000"+
		"\u00f7\u00f9\u0003\u00ba]\u0000\u00f8\u00fa\u0007\u0000\u0000\u0000\u00f9"+
		"\u00f8\u0001\u0000\u0000\u0000\u00f9\u00fa\u0001\u0000\u0000\u0000\u00fa"+
		"\u0332\u0001\u0000\u0000\u0000\u00fb\u0100\u0003\u000e\u0007\u0000\u00fc"+
		"\u00fd\u0005\u0001\u0000\u0000\u00fd\u00fe\u0003\u00a4R\u0000\u00fe\u00ff"+
		"\u0005\u0002\u0000\u0000\u00ff\u0101\u0001\u0000\u0000\u0000\u0100\u00fc"+
		"\u0001\u0000\u0000\u0000\u0100\u0101\u0001\u0000\u0000\u0000\u0101\u0102"+
		"\u0001\u0000\u0000\u0000\u0102\u0105\u0003(\u0014\u0000\u0103\u0104\u0005"+
		"\u00b0\u0000\u0000\u0104\u0106\u0003*\u0015\u0000\u0105\u0103\u0001\u0000"+
		"\u0000\u0000\u0105\u0106\u0001\u0000\u0000\u0000\u0106\u010a\u0001\u0000"+
		"\u0000\u0000\u0107\u0108\u0005\u00d0\u0000\u0000\u0108\u0109\u0005\u0012"+
		"\u0000\u0000\u0109\u010b\u0003d2\u0000\u010a\u0107\u0001\u0000\u0000\u0000"+
		"\u010a\u010b\u0001\u0000\u0000\u0000\u010b\u010d\u0001\u0000\u0000\u0000"+
		"\u010c\u010e\u0003\u0010\b\u0000\u010d\u010c\u0001\u0000\u0000\u0000\u010d"+
		"\u010e\u0001\u0000\u0000\u0000\u010e\u0110\u0001\u0000\u0000\u0000\u010f"+
		"\u0111\u0003\u0014\n\u0000\u0110\u010f\u0001\u0000\u0000\u0000\u0110\u0111"+
		"\u0001\u0000\u0000\u0000\u0111\u0114\u0001\u0000\u0000\u0000\u0112\u0113"+
		"\u0005n\u0000\u0000\u0113\u0115\u0005\u00e9\u0000\u0000\u0114\u0112\u0001"+
		"\u0000\u0000\u0000\u0114\u0115\u0001\u0000\u0000\u0000\u0115\u011a\u0001"+
		"\u0000\u0000\u0000\u0116\u0118\u0005\r\u0000\u0000\u0117\u0116\u0001\u0000"+
		"\u0000\u0000\u0117\u0118\u0001\u0000\u0000\u0000\u0118\u0119\u0001\u0000"+
		"\u0000\u0000\u0119\u011b\u0003\u0016\u000b\u0000\u011a\u0117\u0001\u0000"+
		"\u0000\u0000\u011a\u011b\u0001\u0000\u0000\u0000\u011b\u0332\u0001\u0000"+
		"\u0000\u0000\u011c\u0121\u0003\u000e\u0007\u0000\u011d\u011e\u0005\u0001"+
		"\u0000\u0000\u011e\u011f\u0003\u00a4R\u0000\u011f\u0120\u0005\u0002\u0000"+
		"\u0000\u0120\u0122\u0001\u0000\u0000\u0000\u0121\u011d\u0001\u0000\u0000"+
		"\u0000\u0121\u0122\u0001\u0000\u0000\u0000\u0122\u0125\u0001\u0000\u0000"+
		"\u0000\u0123\u0124\u0005n\u0000\u0000\u0124\u0126\u0005\u00e9\u0000\u0000"+
		"\u0125\u0123\u0001\u0000\u0000\u0000\u0125\u0126\u0001\u0000\u0000\u0000"+
		"\u0126\u012d\u0001\u0000\u0000\u0000\u0127\u0128\u0005\u00d0\u0000\u0000"+
		"\u0128\u0129\u0005\u0012\u0000\u0000\u0129\u012a\u0005\u0001\u0000\u0000"+
		"\u012a\u012b\u0003\u00a4R\u0000\u012b\u012c\u0005\u0002\u0000\u0000\u012c"+
		"\u012e\u0001\u0000\u0000\u0000\u012d\u0127\u0001\u0000\u0000\u0000\u012d"+
		"\u012e\u0001\u0000\u0000\u0000\u012e\u0130\u0001\u0000\u0000\u0000\u012f"+
		"\u0131\u0003\u0010\b\u0000\u0130\u012f\u0001\u0000\u0000\u0000\u0130\u0131"+
		"\u0001\u0000\u0000\u0000\u0131\u0133\u0001\u0000\u0000\u0000\u0132\u0134"+
		"\u0003\u0012\t\u0000\u0133\u0132\u0001\u0000\u0000\u0000\u0133\u0134\u0001"+
		"\u0000\u0000\u0000\u0134\u0136\u0001\u0000\u0000\u0000\u0135\u0137\u0003"+
		"t:\u0000\u0136\u0135\u0001\u0000\u0000\u0000\u0136\u0137\u0001\u0000\u0000"+
		"\u0000\u0137\u0139\u0001\u0000\u0000\u0000\u0138\u013a\u00036\u001b\u0000"+
		"\u0139\u0138\u0001\u0000\u0000\u0000\u0139\u013a\u0001\u0000\u0000\u0000"+
		"\u013a\u013c\u0001\u0000\u0000\u0000\u013b\u013d\u0003\u0014\n\u0000\u013c"+
		"\u013b\u0001\u0000\u0000\u0000\u013c\u013d\u0001\u0000\u0000\u0000\u013d"+
		"\u0140\u0001\u0000\u0000\u0000\u013e\u013f\u0005\u00b2\u0000\u0000\u013f"+
		"\u0141\u0003*\u0015\u0000\u0140\u013e\u0001\u0000\u0000\u0000\u0140\u0141"+
		"\u0001\u0000\u0000\u0000\u0141\u0146\u0001\u0000\u0000\u0000\u0142\u0144"+
		"\u0005\r\u0000\u0000\u0143\u0142\u0001\u0000\u0000\u0000\u0143\u0144\u0001"+
		"\u0000\u0000\u0000\u0144\u0145\u0001\u0000\u0000\u0000\u0145\u0147\u0003"+
		"\u0016\u000b\u0000\u0146\u0143\u0001\u0000\u0000\u0000\u0146\u0147\u0001"+
		"\u0000\u0000\u0000\u0147\u0332\u0001\u0000\u0000\u0000\u0148\u0149\u0005"+
		"L\u0000\u0000\u0149\u014d\u0005M\u0000\u0000\u014a\u014b\u0005{\u0000"+
		"\u0000\u014b\u014c\u0005\u001e\u0000\u0000\u014c\u014e\u0005 \u0000\u0000"+
		"\u014d\u014a\u0001\u0000\u0000\u0000\u014d\u014e\u0001\u0000\u0000\u0000"+
		"\u014e\u014f\u0001\u0000\u0000\u0000\u014f\u0150\u0003v;\u0000\u0150\u0151"+
		"\u0005\"\u0000\u0000\u0151\u0153\u0003v;\u0000\u0152\u0154\u0003\u0014"+
		"\n\u0000\u0153\u0152\u0001\u0000\u0000\u0000\u0153\u0154\u0001\u0000\u0000"+
		"\u0000\u0154\u0332\u0001\u0000\u0000\u0000\u0155\u0156\u0005\u00cc\u0000"+
		"\u0000\u0156\u0157\u0005M\u0000\u0000\u0157\u0159\u0003v;\u0000\u0158"+
		"\u015a\u0003\u001c\u000e\u0000\u0159\u0158\u0001\u0000\u0000\u0000\u0159"+
		"\u015a\u0001\u0000\u0000\u0000\u015a\u015b\u0001\u0000\u0000\u0000\u015b"+
		"\u015c\u0005\u00cd\u0000\u0000\u015c\u0161\u0005\u00cf\u0000\u0000\u015d"+
		"\u0162\u0003\u00ba]\u0000\u015e\u015f\u0005+\u0000\u0000\u015f\u0160\u0005"+
		"\\\u0000\u0000\u0160\u0162\u0003f3\u0000\u0161\u015d\u0001\u0000\u0000"+
		"\u0000\u0161\u015e\u0001\u0000\u0000\u0000\u0161\u0162\u0001\u0000\u0000"+
		"\u0000\u0162\u0332\u0001\u0000\u0000\u0000\u0163\u0164\u0005i\u0000\u0000"+
		"\u0164\u0165\u0005M\u0000\u0000\u0165\u0166\u0003v;\u0000\u0166\u0167"+
		"\u0005\f\u0000\u0000\u0167\u0168\u0005\\\u0000\u0000\u0168\u0169\u0005"+
		"\u0001\u0000\u0000\u0169\u016a\u0003\u00a4R\u0000\u016a\u016b\u0005\u0002"+
		"\u0000\u0000\u016b\u0332\u0001\u0000\u0000\u0000\u016c\u016d\u0005i\u0000"+
		"\u0000\u016d\u016e\u0007\u0001\u0000\u0000\u016e\u016f\u0003v;\u0000\u016f"+
		"\u0170\u0005j\u0000\u0000\u0170\u0171\u0005f\u0000\u0000\u0171\u0172\u0003"+
		"v;\u0000\u0172\u0332\u0001\u0000\u0000\u0000\u0173\u0174\u0005i\u0000"+
		"\u0000\u0174\u0175\u0007\u0001\u0000\u0000\u0175\u0176\u0003v;\u0000\u0176"+
		"\u0177\u0005o\u0000\u0000\u0177\u0178\u0005\u00b2\u0000\u0000\u0178\u0179"+
		"\u0003*\u0015\u0000\u0179\u0332\u0001\u0000\u0000\u0000\u017a\u017b\u0005"+
		"i\u0000\u0000\u017b\u017c\u0007\u0001\u0000\u0000\u017c\u017d\u0003v;"+
		"\u0000\u017d\u017e\u0005\u00b1\u0000\u0000\u017e\u0181\u0005\u00b2\u0000"+
		"\u0000\u017f\u0180\u0005{\u0000\u0000\u0180\u0182\u0005 \u0000\u0000\u0181"+
		"\u017f\u0001\u0000\u0000\u0000\u0181\u0182\u0001\u0000\u0000\u0000\u0182"+
		"\u0183\u0001\u0000\u0000\u0000\u0183\u0184\u0003*\u0015\u0000\u0184\u0332"+
		"\u0001\u0000\u0000\u0000\u0185\u0186\u0005i\u0000\u0000\u0186\u0187\u0005"+
		"M\u0000\u0000\u0187\u0189\u0003v;\u0000\u0188\u018a\u0003\u001c\u000e"+
		"\u0000\u0189\u0188\u0001\u0000\u0000\u0000\u0189\u018a\u0001\u0000\u0000"+
		"\u0000\u018a\u018b\u0001\u0000\u0000\u0000\u018b\u018d\u0005\u00c0\u0000"+
		"\u0000\u018c\u018e\u0005]\u0000\u0000\u018d\u018c\u0001\u0000\u0000\u0000"+
		"\u018d\u018e\u0001\u0000\u0000\u0000\u018e\u018f\u0001\u0000\u0000\u0000"+
		"\u018f\u0190\u0003\u00ba]\u0000\u0190\u0192\u0003\u00a6S\u0000\u0191\u0193"+
		"\u0003\u00a0P\u0000\u0192\u0191\u0001\u0000\u0000\u0000\u0192\u0193\u0001"+
		"\u0000\u0000\u0000\u0193\u0332\u0001\u0000\u0000\u0000\u0194\u0195\u0005"+
		"i\u0000\u0000\u0195\u0196\u0005M\u0000\u0000\u0196\u0198\u0003v;\u0000"+
		"\u0197\u0199\u0003\u001c\u000e\u0000\u0198\u0197\u0001\u0000\u0000\u0000"+
		"\u0198\u0199\u0001\u0000\u0000\u0000\u0199\u019a\u0001\u0000\u0000\u0000"+
		"\u019a\u019b\u0005o\u0000\u0000\u019b\u019c\u0005\u0099\u0000\u0000\u019c"+
		"\u01a0\u0005\u00e9\u0000\u0000\u019d\u019e\u0005J\u0000\u0000\u019e\u019f"+
		"\u0005\u009a\u0000\u0000\u019f\u01a1\u0003*\u0015\u0000\u01a0\u019d\u0001"+
		"\u0000\u0000\u0000\u01a0\u01a1\u0001\u0000\u0000\u0000\u01a1\u0332\u0001"+
		"\u0000\u0000\u0000\u01a2\u01a3\u0005i\u0000\u0000\u01a3\u01a4\u0005M\u0000"+
		"\u0000\u01a4\u01a6\u0003v;\u0000\u01a5\u01a7\u0003\u001c\u000e\u0000\u01a6"+
		"\u01a5\u0001\u0000\u0000\u0000\u01a6\u01a7\u0001\u0000\u0000\u0000\u01a7"+
		"\u01a8\u0001\u0000\u0000\u0000\u01a8\u01a9\u0005o\u0000\u0000\u01a9\u01aa"+
		"\u0005\u009a\u0000\u0000\u01aa\u01ab\u0003*\u0015\u0000\u01ab\u0332\u0001"+
		"\u0000\u0000\u0000\u01ac\u01ad\u0005i\u0000\u0000\u01ad\u01ae\u0005M\u0000"+
		"\u0000\u01ae\u01af\u0003v;\u0000\u01af\u01b3\u0005\f\u0000\u0000\u01b0"+
		"\u01b1\u0005{\u0000\u0000\u01b1\u01b2\u0005\u001e\u0000\u0000\u01b2\u01b4"+
		"\u0005 \u0000\u0000\u01b3\u01b0\u0001\u0000\u0000\u0000\u01b3\u01b4\u0001"+
		"\u0000\u0000\u0000\u01b4\u01b6\u0001\u0000\u0000\u0000\u01b5\u01b7\u0003"+
		"\u001a\r\u0000\u01b6\u01b5\u0001\u0000\u0000\u0000\u01b7\u01b8\u0001\u0000"+
		"\u0000\u0000\u01b8\u01b6\u0001\u0000\u0000\u0000\u01b8\u01b9\u0001\u0000"+
		"\u0000\u0000\u01b9\u0332\u0001\u0000\u0000\u0000\u01ba\u01bb\u0005i\u0000"+
		"\u0000\u01bb\u01bc\u0005N\u0000\u0000\u01bc\u01bd\u0003v;\u0000\u01bd"+
		"\u01c1\u0005\f\u0000\u0000\u01be\u01bf\u0005{\u0000\u0000\u01bf\u01c0"+
		"\u0005\u001e\u0000\u0000\u01c0\u01c2\u0005 \u0000\u0000\u01c1\u01be\u0001"+
		"\u0000\u0000\u0000\u01c1\u01c2\u0001\u0000\u0000\u0000\u01c2\u01c4\u0001"+
		"\u0000\u0000\u0000\u01c3\u01c5\u0003\u001c\u000e\u0000\u01c4\u01c3\u0001"+
		"\u0000\u0000\u0000\u01c5\u01c6\u0001\u0000\u0000\u0000\u01c6\u01c4\u0001"+
		"\u0000\u0000\u0000\u01c6\u01c7\u0001\u0000\u0000\u0000\u01c7\u0332\u0001"+
		"\u0000\u0000\u0000\u01c8\u01c9\u0005i\u0000\u0000\u01c9\u01ca\u0005M\u0000"+
		"\u0000\u01ca\u01cb\u0003v;\u0000\u01cb\u01cc\u0003\u001c\u000e\u0000\u01cc"+
		"\u01cd\u0005j\u0000\u0000\u01cd\u01ce\u0005f\u0000\u0000\u01ce\u01cf\u0003"+
		"\u001c\u000e\u0000\u01cf\u0332\u0001\u0000\u0000\u0000\u01d0\u01d1\u0005"+
		"i\u0000\u0000\u01d1\u01d2\u0005M\u0000\u0000\u01d2\u01d3\u0003v;\u0000"+
		"\u01d3\u01d6\u0005a\u0000\u0000\u01d4\u01d5\u0005{\u0000\u0000\u01d5\u01d7"+
		"\u0005 \u0000\u0000\u01d6\u01d4\u0001\u0000\u0000\u0000\u01d6\u01d7\u0001"+
		"\u0000\u0000\u0000\u01d7\u01d8\u0001\u0000\u0000\u0000\u01d8\u01dd\u0003"+
		"\u001c\u000e\u0000\u01d9\u01da\u0005\u0003\u0000\u0000\u01da\u01dc\u0003"+
		"\u001c\u000e\u0000\u01db\u01d9\u0001\u0000\u0000\u0000\u01dc\u01df\u0001"+
		"\u0000\u0000\u0000\u01dd\u01db\u0001\u0000\u0000\u0000\u01dd\u01de\u0001"+
		"\u0000\u0000\u0000\u01de\u01e1\u0001\u0000\u0000\u0000\u01df\u01dd\u0001"+
		"\u0000\u0000\u0000\u01e0\u01e2\u0005\u00c5\u0000\u0000\u01e1\u01e0\u0001"+
		"\u0000\u0000\u0000\u01e1\u01e2\u0001\u0000\u0000\u0000\u01e2\u0332\u0001"+
		"\u0000\u0000\u0000\u01e3\u01e4\u0005i\u0000\u0000\u01e4\u01e5\u0005N\u0000"+
		"\u0000\u01e5\u01e6\u0003v;\u0000\u01e6\u01e9\u0005a\u0000\u0000\u01e7"+
		"\u01e8\u0005{\u0000\u0000\u01e8\u01ea\u0005 \u0000\u0000\u01e9\u01e7\u0001"+
		"\u0000\u0000\u0000\u01e9\u01ea\u0001\u0000\u0000\u0000\u01ea\u01eb\u0001"+
		"\u0000\u0000\u0000\u01eb\u01f0\u0003\u001c\u000e\u0000\u01ec\u01ed\u0005"+
		"\u0003\u0000\u0000\u01ed\u01ef\u0003\u001c\u000e\u0000\u01ee\u01ec\u0001"+
		"\u0000\u0000\u0000\u01ef\u01f2\u0001\u0000\u0000\u0000\u01f0\u01ee\u0001"+
		"\u0000\u0000\u0000\u01f0\u01f1\u0001\u0000\u0000\u0000\u01f1\u0332\u0001"+
		"\u0000\u0000\u0000\u01f2\u01f0\u0001\u0000\u0000\u0000\u01f3\u01f4\u0005"+
		"i\u0000\u0000\u01f4\u01f5\u0005M\u0000\u0000\u01f5\u01f7\u0003v;\u0000"+
		"\u01f6\u01f8\u0003\u001c\u000e\u0000\u01f7\u01f6\u0001\u0000\u0000\u0000"+
		"\u01f7\u01f8\u0001\u0000\u0000\u0000\u01f8\u01f9\u0001\u0000\u0000\u0000"+
		"\u01f9\u01fa\u0005o\u0000\u0000\u01fa\u01fb\u0003\u0014\n\u0000\u01fb"+
		"\u0332\u0001\u0000\u0000\u0000\u01fc\u01fd\u0005i\u0000\u0000\u01fd\u01fe"+
		"\u0005M\u0000\u0000\u01fe\u01ff\u0003v;\u0000\u01ff\u0200\u0005\u00d9"+
		"\u0000\u0000\u0200\u0201\u0005_\u0000\u0000\u0201\u0332\u0001\u0000\u0000"+
		"\u0000\u0202\u0203\u0005a\u0000\u0000\u0203\u0206\u0005M\u0000\u0000\u0204"+
		"\u0205\u0005{\u0000\u0000\u0205\u0207\u0005 \u0000\u0000\u0206\u0204\u0001"+
		"\u0000\u0000\u0000\u0206\u0207\u0001\u0000\u0000\u0000\u0207\u0208\u0001"+
		"\u0000\u0000\u0000\u0208\u020a\u0003v;\u0000\u0209\u020b\u0005\u00c5\u0000"+
		"\u0000\u020a\u0209\u0001\u0000\u0000\u0000\u020a\u020b\u0001\u0000\u0000"+
		"\u0000\u020b\u0332\u0001\u0000\u0000\u0000\u020c\u020d\u0005a\u0000\u0000"+
		"\u020d\u0210\u0005N\u0000\u0000\u020e\u020f\u0005{\u0000\u0000\u020f\u0211"+
		"\u0005 \u0000\u0000\u0210\u020e\u0001\u0000\u0000\u0000\u0210\u0211\u0001"+
		"\u0000\u0000\u0000\u0211\u0212\u0001\u0000\u0000\u0000\u0212\u0332\u0003"+
		"v;\u0000\u0213\u0216\u0005L\u0000\u0000\u0214\u0215\u0005\u001b\u0000"+
		"\u0000\u0215\u0217\u0005O\u0000\u0000\u0216\u0214\u0001\u0000\u0000\u0000"+
		"\u0216\u0217\u0001\u0000\u0000\u0000\u0217\u021c\u0001\u0000\u0000\u0000"+
		"\u0218\u021a\u0005\u00ae\u0000\u0000\u0219\u0218\u0001\u0000\u0000\u0000"+
		"\u0219\u021a\u0001\u0000\u0000\u0000\u021a\u021b\u0001\u0000\u0000\u0000"+
		"\u021b\u021d\u0005\u00af\u0000\u0000\u021c\u0219\u0001\u0000\u0000\u0000"+
		"\u021c\u021d\u0001\u0000\u0000\u0000\u021d\u021e\u0001\u0000\u0000\u0000"+
		"\u021e\u0222\u0005N\u0000\u0000\u021f\u0220\u0005{\u0000\u0000\u0220\u0221"+
		"\u0005\u001e\u0000\u0000\u0221\u0223\u0005 \u0000\u0000\u0222\u021f\u0001"+
		"\u0000\u0000\u0000\u0222\u0223\u0001\u0000\u0000\u0000\u0223\u0224\u0001"+
		"\u0000\u0000\u0000\u0224\u0226\u0003v;\u0000\u0225\u0227\u0003l6\u0000"+
		"\u0226\u0225\u0001\u0000\u0000\u0000\u0226\u0227\u0001\u0000\u0000\u0000"+
		"\u0227\u022a\u0001\u0000\u0000\u0000\u0228\u0229\u0005n\u0000\u0000\u0229"+
		"\u022b\u0005\u00e9\u0000\u0000\u022a\u0228\u0001\u0000\u0000\u0000\u022a"+
		"\u022b\u0001\u0000\u0000\u0000\u022b\u022f\u0001\u0000\u0000\u0000\u022c"+
		"\u022d\u0005\u00d0\u0000\u0000\u022d\u022e\u0005;\u0000\u0000\u022e\u0230"+
		"\u0003d2\u0000\u022f\u022c\u0001\u0000\u0000\u0000\u022f\u0230\u0001\u0000"+
		"\u0000\u0000\u0230\u0233\u0001\u0000\u0000\u0000\u0231\u0232\u0005\u00b2"+
		"\u0000\u0000\u0232\u0234\u0003*\u0015\u0000\u0233\u0231\u0001\u0000\u0000"+
		"\u0000\u0233\u0234\u0001\u0000\u0000\u0000\u0234\u0235\u0001\u0000\u0000"+
		"\u0000\u0235\u0236\u0005\r\u0000\u0000\u0236\u0237\u0003\u0016\u000b\u0000"+
		"\u0237\u0332\u0001\u0000\u0000\u0000\u0238\u023b\u0005L\u0000\u0000\u0239"+
		"\u023a\u0005\u001b\u0000\u0000\u023a\u023c\u0005O\u0000\u0000\u023b\u0239"+
		"\u0001\u0000\u0000\u0000\u023b\u023c\u0001\u0000\u0000\u0000\u023c\u023e"+
		"\u0001\u0000\u0000\u0000\u023d\u023f\u0005\u00ae\u0000\u0000\u023e\u023d"+
		"\u0001\u0000\u0000\u0000\u023e\u023f\u0001\u0000\u0000\u0000\u023f\u0240"+
		"\u0001\u0000\u0000\u0000\u0240\u0241\u0005\u00af\u0000\u0000\u0241\u0242"+
		"\u0005N\u0000\u0000\u0242\u0247\u0003v;\u0000\u0243\u0244\u0005\u0001"+
		"\u0000\u0000\u0244\u0245\u0003\u00a4R\u0000\u0245\u0246\u0005\u0002\u0000"+
		"\u0000\u0246\u0248\u0001\u0000\u0000\u0000\u0247\u0243\u0001\u0000\u0000"+
		"\u0000\u0247\u0248\u0001\u0000\u0000\u0000\u0248\u0249\u0001\u0000\u0000"+
		"\u0000\u0249\u024c\u0003(\u0014\u0000\u024a\u024b\u0005\u00b0\u0000\u0000"+
		"\u024b\u024d\u0003*\u0015\u0000\u024c\u024a\u0001\u0000\u0000\u0000\u024c"+
		"\u024d\u0001\u0000\u0000\u0000\u024d\u0332\u0001\u0000\u0000\u0000\u024e"+
		"\u024f\u0005i\u0000\u0000\u024f\u0250\u0005N\u0000\u0000\u0250\u0252\u0003"+
		"v;\u0000\u0251\u0253\u0005\r\u0000\u0000\u0252\u0251\u0001\u0000\u0000"+
		"\u0000\u0252\u0253\u0001\u0000\u0000\u0000\u0253\u0254\u0001\u0000\u0000"+
		"\u0000\u0254\u0255\u0003\u0016\u000b\u0000\u0255\u0332\u0001\u0000\u0000"+
		"\u0000\u0256\u0258\u0005L\u0000\u0000\u0257\u0259\u0005\u00af\u0000\u0000"+
		"\u0258\u0257\u0001\u0000\u0000\u0000\u0258\u0259\u0001\u0000\u0000\u0000"+
		"\u0259\u025a\u0001\u0000\u0000\u0000\u025a\u025b\u0005\u00a6\u0000\u0000"+
		"\u025b\u025c\u0003\u00b8\\\u0000\u025c\u025d\u0005\r\u0000\u0000\u025d"+
		"\u0267\u0005\u00e9\u0000\u0000\u025e\u025f\u0005\u0098\u0000\u0000\u025f"+
		"\u0264\u0003<\u001e\u0000\u0260\u0261\u0005\u0003\u0000\u0000\u0261\u0263"+
		"\u0003<\u001e\u0000\u0262\u0260\u0001\u0000\u0000\u0000\u0263\u0266\u0001"+
		"\u0000\u0000\u0000\u0264\u0262\u0001\u0000\u0000\u0000\u0264\u0265\u0001"+
		"\u0000\u0000\u0000\u0265\u0268\u0001\u0000\u0000\u0000\u0266\u0264\u0001"+
		"\u0000\u0000\u0000\u0267\u025e\u0001\u0000\u0000\u0000\u0267\u0268\u0001"+
		"\u0000\u0000\u0000\u0268\u0332\u0001\u0000\u0000\u0000\u0269\u026b\u0005"+
		"a\u0000\u0000\u026a\u026c\u0005\u00af\u0000\u0000\u026b\u026a\u0001\u0000"+
		"\u0000\u0000\u026b\u026c\u0001\u0000\u0000\u0000\u026c\u026d\u0001\u0000"+
		"\u0000\u0000\u026d\u0270\u0005\u00a6\u0000\u0000\u026e\u026f\u0005{\u0000"+
		"\u0000\u026f\u0271\u0005 \u0000\u0000\u0270\u026e\u0001\u0000\u0000\u0000"+
		"\u0270\u0271\u0001\u0000\u0000\u0000\u0271\u0272\u0001\u0000\u0000\u0000"+
		"\u0272\u0332\u0003\u00b8\\\u0000\u0273\u0275\u0005T\u0000\u0000\u0274"+
		"\u0276\u0007\u0002\u0000\u0000\u0275\u0274\u0001\u0000\u0000\u0000\u0275"+
		"\u0276\u0001\u0000\u0000\u0000\u0276\u0277\u0001\u0000\u0000\u0000\u0277"+
		"\u0332\u0003\n\u0005\u0000\u0278\u0279\u0005Z\u0000\u0000\u0279\u027c"+
		"\u0005[\u0000\u0000\u027a\u027b\u0007\u0003\u0000\u0000\u027b\u027d\u0003"+
		"\u00ba]\u0000\u027c\u027a\u0001\u0000\u0000\u0000\u027c\u027d\u0001\u0000"+
		"\u0000\u0000\u027d\u0282\u0001\u0000\u0000\u0000\u027e\u0280\u0005\"\u0000"+
		"\u0000\u027f\u027e\u0001\u0000\u0000\u0000\u027f\u0280\u0001\u0000\u0000"+
		"\u0000\u0280\u0281\u0001\u0000\u0000\u0000\u0281\u0283\u0005\u00e9\u0000"+
		"\u0000\u0282\u027f\u0001\u0000\u0000\u0000\u0282\u0283\u0001\u0000\u0000"+
		"\u0000\u0283\u0332\u0001\u0000\u0000\u0000\u0284\u0285\u0005Z\u0000\u0000"+
		"\u0285\u0286\u0005M\u0000\u0000\u0286\u0289\u0005\u00a7\u0000\u0000\u0287"+
		"\u0288\u0007\u0003\u0000\u0000\u0288\u028a\u0003\u00ba]\u0000\u0289\u0287"+
		"\u0001\u0000\u0000\u0000\u0289\u028a\u0001\u0000\u0000\u0000\u028a\u028b"+
		"\u0001\u0000\u0000\u0000\u028b\u028c\u0005\"\u0000\u0000\u028c\u028e\u0005"+
		"\u00e9\u0000\u0000\u028d\u028f\u0003\u001c\u000e\u0000\u028e\u028d\u0001"+
		"\u0000\u0000\u0000\u028e\u028f\u0001\u0000\u0000\u0000\u028f\u0332\u0001"+
		"\u0000\u0000\u0000\u0290\u0291\u0005Z\u0000\u0000\u0291\u0294\u0005\u00c9"+
		"\u0000\u0000\u0292\u0293\u0005\"\u0000\u0000\u0293\u0295\u0005\u00e9\u0000"+
		"\u0000\u0294\u0292\u0001\u0000\u0000\u0000\u0294\u0295\u0001\u0000\u0000"+
		"\u0000\u0295\u0332\u0001\u0000\u0000\u0000\u0296\u0297\u0005Z\u0000\u0000"+
		"\u0297\u0298\u0005\u00b2\u0000\u0000\u0298\u029d\u0003v;\u0000\u0299\u029a"+
		"\u0005\u0001\u0000\u0000\u029a\u029b\u0003.\u0017\u0000\u029b\u029c\u0005"+
		"\u0002\u0000\u0000\u029c\u029e\u0001\u0000\u0000\u0000\u029d\u0299\u0001"+
		"\u0000\u0000\u0000\u029d\u029e\u0001\u0000\u0000\u0000\u029e\u0332\u0001"+
		"\u0000\u0000\u0000\u029f\u02a0\u0005Z\u0000\u0000\u02a0\u02a1\u0005\\"+
		"\u0000\u0000\u02a1\u02a2\u0007\u0003\u0000\u0000\u02a2\u02a5\u0003v;\u0000"+
		"\u02a3\u02a4\u0007\u0003\u0000\u0000\u02a4\u02a6\u0003\u00ba]\u0000\u02a5"+
		"\u02a3\u0001\u0000\u0000\u0000\u02a5\u02a6\u0001\u0000\u0000\u0000\u02a6"+
		"\u0332\u0001\u0000\u0000\u0000\u02a7\u02a8\u0005Z\u0000\u0000\u02a8\u02a9"+
		"\u0005_\u0000\u0000\u02a9\u02ab\u0003v;\u0000\u02aa\u02ac\u0003\u001c"+
		"\u000e\u0000\u02ab\u02aa\u0001\u0000\u0000\u0000\u02ab\u02ac\u0001\u0000"+
		"\u0000\u0000\u02ac\u0332\u0001\u0000\u0000\u0000\u02ad\u02af\u0005Z\u0000"+
		"\u0000\u02ae\u02b0\u0003\u00ba]\u0000\u02af\u02ae\u0001\u0000\u0000\u0000"+
		"\u02af\u02b0\u0001\u0000\u0000\u0000\u02b0\u02b1\u0001\u0000\u0000\u0000"+
		"\u02b1\u02b9\u0005`\u0000\u0000\u02b2\u02b4\u0005\"\u0000\u0000\u02b3"+
		"\u02b2\u0001\u0000\u0000\u0000\u02b3\u02b4\u0001\u0000\u0000\u0000\u02b4"+
		"\u02b7\u0001\u0000\u0000\u0000\u02b5\u02b8\u0003\u00b8\\\u0000\u02b6\u02b8"+
		"\u0005\u00e9\u0000\u0000\u02b7\u02b5\u0001\u0000\u0000\u0000\u02b7\u02b6"+
		"\u0001\u0000\u0000\u0000\u02b8\u02ba\u0001\u0000\u0000\u0000\u02b9\u02b3"+
		"\u0001\u0000\u0000\u0000\u02b9\u02ba\u0001\u0000\u0000\u0000\u02ba\u0332"+
		"\u0001\u0000\u0000\u0000\u02bb\u02bc\u0005Z\u0000\u0000\u02bc\u02bd\u0005"+
		"L\u0000\u0000\u02bd\u02be\u0005M\u0000\u0000\u02be\u0332\u0003v;\u0000"+
		"\u02bf\u02c0\u0007\u0004\u0000\u0000\u02c0\u02c2\u0005\u00a6\u0000\u0000"+
		"\u02c1\u02c3\u0005\u00a7\u0000\u0000\u02c2\u02c1\u0001\u0000\u0000\u0000"+
		"\u02c2\u02c3\u0001\u0000\u0000\u0000\u02c3\u02c4\u0001\u0000\u0000\u0000"+
		"\u02c4\u0332\u0003 \u0010\u0000\u02c5\u02c6\u0007\u0004\u0000\u0000\u02c6"+
		"\u02c8\u0005\u00c8\u0000\u0000\u02c7\u02c9\u0005\u00a7\u0000\u0000\u02c8"+
		"\u02c7\u0001\u0000\u0000\u0000\u02c8\u02c9\u0001\u0000\u0000\u0000\u02c9"+
		"\u02ca\u0001\u0000\u0000\u0000\u02ca\u0332\u0003\u00ba]\u0000\u02cb\u02cd"+
		"\u0007\u0004\u0000\u0000\u02cc\u02ce\u0005M\u0000\u0000\u02cd\u02cc\u0001"+
		"\u0000\u0000\u0000\u02cd\u02ce\u0001\u0000\u0000\u0000\u02ce\u02d0\u0001"+
		"\u0000\u0000\u0000\u02cf\u02d1\u0007\u0005\u0000\u0000\u02d0\u02cf\u0001"+
		"\u0000\u0000\u0000\u02d0\u02d1\u0001\u0000\u0000\u0000\u02d1\u02d2\u0001"+
		"\u0000\u0000\u0000\u02d2\u02d4\u0003v;\u0000\u02d3\u02d5\u0003\u001c\u000e"+
		"\u0000\u02d4\u02d3\u0001\u0000\u0000\u0000\u02d4\u02d5\u0001\u0000\u0000"+
		"\u0000\u02d5\u02d7\u0001\u0000\u0000\u0000\u02d6\u02d8\u0003\"\u0011\u0000"+
		"\u02d7\u02d6\u0001\u0000\u0000\u0000\u02d7\u02d8\u0001\u0000\u0000\u0000"+
		"\u02d8\u0332\u0001\u0000\u0000\u0000\u02d9\u02da\u0005\u00a8\u0000\u0000"+
		"\u02da\u02db\u0005M\u0000\u0000\u02db\u0332\u0003v;\u0000\u02dc\u02e0"+
		"\u0005\u00a8\u0000\u0000\u02dd\u02df\t\u0000\u0000\u0000\u02de\u02dd\u0001"+
		"\u0000\u0000\u0000\u02df\u02e2\u0001\u0000\u0000\u0000\u02e0\u02e1\u0001"+
		"\u0000\u0000\u0000\u02e0\u02de\u0001\u0000\u0000\u0000\u02e1\u0332\u0001"+
		"\u0000\u0000\u0000\u02e2\u02e0\u0001\u0000\u0000\u0000\u02e3\u02e5\u0005"+
		"\u00aa\u0000\u0000\u02e4\u02e6\u0005\u00ac\u0000\u0000\u02e5\u02e4\u0001"+
		"\u0000\u0000\u0000\u02e5\u02e6\u0001\u0000\u0000\u0000\u02e6\u02e7\u0001"+
		"\u0000\u0000\u0000\u02e7\u02e8\u0005M\u0000\u0000\u02e8\u02ed\u0003v;"+
		"\u0000\u02e9\u02eb\u0005\r\u0000\u0000\u02ea\u02e9\u0001\u0000\u0000\u0000"+
		"\u02ea\u02eb\u0001\u0000\u0000\u0000\u02eb\u02ec\u0001\u0000\u0000\u0000"+
		"\u02ec\u02ee\u0003\u0016\u000b\u0000\u02ed\u02ea\u0001\u0000\u0000\u0000"+
		"\u02ed\u02ee\u0001\u0000\u0000\u0000\u02ee\u0332\u0001\u0000\u0000\u0000"+
		"\u02ef\u02f0\u0005\u00ab\u0000\u0000\u02f0\u02f3\u0005M\u0000\u0000\u02f1"+
		"\u02f2\u0005{\u0000\u0000\u02f2\u02f4\u0005 \u0000\u0000\u02f3\u02f1\u0001"+
		"\u0000\u0000\u0000\u02f3\u02f4\u0001\u0000\u0000\u0000\u02f4\u02f5\u0001"+
		"\u0000\u0000\u0000\u02f5\u0332\u0003v;\u0000\u02f6\u02f7\u0005\u00a9\u0000"+
		"\u0000\u02f7\u0332\u0005\u00aa\u0000\u0000\u02f8\u02f9\u0005\u00dc\u0000"+
		"\u0000\u02f9\u02fb\u0005q\u0000\u0000\u02fa\u02fc\u0005\u00e7\u0000\u0000"+
		"\u02fb\u02fa\u0001\u0000\u0000\u0000\u02fb\u02fc\u0001\u0000\u0000\u0000"+
		"\u02fc\u02fd\u0001\u0000\u0000\u0000\u02fd\u02fe\u0005\u00e8\u0000\u0000"+
		"\u02fe\u0300\u0005\u00e9\u0000\u0000\u02ff\u0301\u0005\u0095\u0000\u0000"+
		"\u0300\u02ff\u0001\u0000\u0000\u0000\u0300\u0301\u0001\u0000\u0000\u0000"+
		"\u0301\u0302\u0001\u0000\u0000\u0000\u0302\u0303\u0005R\u0000\u0000\u0303"+
		"\u0304\u0005M\u0000\u0000\u0304\u0306\u0003v;\u0000\u0305\u0307\u0003"+
		"\u001c\u000e\u0000\u0306\u0305\u0001\u0000\u0000\u0000\u0306\u0307\u0001"+
		"\u0000\u0000\u0000\u0307\u0332\u0001\u0000\u0000\u0000\u0308\u0309\u0005"+
		"\u00cb\u0000\u0000\u0309\u030a\u0005M\u0000\u0000\u030a\u030c\u0003v;"+
		"\u0000\u030b\u030d\u0003\u001c\u000e\u0000\u030c\u030b\u0001\u0000\u0000"+
		"\u0000\u030c\u030d\u0001\u0000\u0000\u0000\u030d\u0332\u0001\u0000\u0000"+
		"\u0000\u030e\u030f\u0005\u00d7\u0000\u0000\u030f\u0310\u0005\u00d8\u0000"+
		"\u0000\u0310\u0311\u0005M\u0000\u0000\u0311\u0332\u0003v;\u0000\u0312"+
		"\u0313\u0007\u0006\u0000\u0000\u0313\u0317\u0003\u00ba]\u0000\u0314\u0316"+
		"\t\u0000\u0000\u0000\u0315\u0314\u0001\u0000\u0000\u0000\u0316\u0319\u0001"+
		"\u0000\u0000\u0000\u0317\u0318\u0001\u0000\u0000\u0000\u0317\u0315\u0001"+
		"\u0000\u0000\u0000\u0318\u0332\u0001\u0000\u0000\u0000\u0319\u0317\u0001"+
		"\u0000\u0000\u0000\u031a\u031b\u0005o\u0000\u0000\u031b\u031f\u0005\u00dd"+
		"\u0000\u0000\u031c\u031e\t\u0000\u0000\u0000\u031d\u031c\u0001\u0000\u0000"+
		"\u0000\u031e\u0321\u0001\u0000\u0000\u0000\u031f\u0320\u0001\u0000\u0000"+
		"\u0000\u031f\u031d\u0001\u0000\u0000\u0000\u0320\u0332\u0001\u0000\u0000"+
		"\u0000\u0321\u031f\u0001\u0000\u0000\u0000\u0322\u0326\u0005o\u0000\u0000"+
		"\u0323\u0325\t\u0000\u0000\u0000\u0324\u0323\u0001\u0000\u0000\u0000\u0325"+
		"\u0328\u0001\u0000\u0000\u0000\u0326\u0327\u0001\u0000\u0000\u0000\u0326"+
		"\u0324\u0001\u0000\u0000\u0000\u0327\u0332\u0001\u0000\u0000\u0000\u0328"+
		"\u0326\u0001\u0000\u0000\u0000\u0329\u0332\u0005p\u0000\u0000\u032a\u032e"+
		"\u0003\f\u0006\u0000\u032b\u032d\t\u0000\u0000\u0000\u032c\u032b\u0001"+
		"\u0000\u0000\u0000\u032d\u0330\u0001\u0000\u0000\u0000\u032e\u032f\u0001"+
		"\u0000\u0000\u0000\u032e\u032c\u0001\u0000\u0000\u0000\u032f\u0332\u0001"+
		"\u0000\u0000\u0000\u0330\u032e\u0001\u0000\u0000\u0000\u0331\u00d3\u0001"+
		"\u0000\u0000\u0000\u0331\u00d4\u0001\u0000\u0000\u0000\u0331\u00d6\u0001"+
		"\u0000\u0000\u0000\u0331\u00ea\u0001\u0000\u0000\u0000\u0331\u00f1\u0001"+
		"\u0000\u0000\u0000\u0331\u00fb\u0001\u0000\u0000\u0000\u0331\u011c\u0001"+
		"\u0000\u0000\u0000\u0331\u0148\u0001\u0000\u0000\u0000\u0331\u0155\u0001"+
		"\u0000\u0000\u0000\u0331\u0163\u0001\u0000\u0000\u0000\u0331\u016c\u0001"+
		"\u0000\u0000\u0000\u0331\u0173\u0001\u0000\u0000\u0000\u0331\u017a\u0001"+
		"\u0000\u0000\u0000\u0331\u0185\u0001\u0000\u0000\u0000\u0331\u0194\u0001"+
		"\u0000\u0000\u0000\u0331\u01a2\u0001\u0000\u0000\u0000\u0331\u01ac\u0001"+
		"\u0000\u0000\u0000\u0331\u01ba\u0001\u0000\u0000\u0000\u0331\u01c8\u0001"+
		"\u0000\u0000\u0000\u0331\u01d0\u0001\u0000\u0000\u0000\u0331\u01e3\u0001"+
		"\u0000\u0000\u0000\u0331\u01f3\u0001\u0000\u0000\u0000\u0331\u01fc\u0001"+
		"\u0000\u0000\u0000\u0331\u0202\u0001\u0000\u0000\u0000\u0331\u020c\u0001"+
		"\u0000\u0000\u0000\u0331\u0213\u0001\u0000\u0000\u0000\u0331\u0238\u0001"+
		"\u0000\u0000\u0000\u0331\u024e\u0001\u0000\u0000\u0000\u0331\u0256\u0001"+
		"\u0000\u0000\u0000\u0331\u0269\u0001\u0000\u0000\u0000\u0331\u0273\u0001"+
		"\u0000\u0000\u0000\u0331\u0278\u0001\u0000\u0000\u0000\u0331\u0284\u0001"+
		"\u0000\u0000\u0000\u0331\u0290\u0001\u0000\u0000\u0000\u0331\u0296\u0001"+
		"\u0000\u0000\u0000\u0331\u029f\u0001\u0000\u0000\u0000\u0331\u02a7\u0001"+
		"\u0000\u0000\u0000\u0331\u02ad\u0001\u0000\u0000\u0000\u0331\u02bb\u0001"+
		"\u0000\u0000\u0000\u0331\u02bf\u0001\u0000\u0000\u0000\u0331\u02c5\u0001"+
		"\u0000\u0000\u0000\u0331\u02cb\u0001\u0000\u0000\u0000\u0331\u02d9\u0001"+
		"\u0000\u0000\u0000\u0331\u02dc\u0001\u0000\u0000\u0000\u0331\u02e3\u0001"+
		"\u0000\u0000\u0000\u0331\u02ef\u0001\u0000\u0000\u0000\u0331\u02f6\u0001"+
		"\u0000\u0000\u0000\u0331\u02f8\u0001\u0000\u0000\u0000\u0331\u0308\u0001"+
		"\u0000\u0000\u0000\u0331\u030e\u0001\u0000\u0000\u0000\u0331\u0312\u0001"+
		"\u0000\u0000\u0000\u0331\u031a\u0001\u0000\u0000\u0000\u0331\u0322\u0001"+
		"\u0000\u0000\u0000\u0331\u0329\u0001\u0000\u0000\u0000\u0331\u032a\u0001"+
		"\u0000\u0000\u0000\u0332\u000b\u0001\u0000\u0000\u0000\u0333\u0334\u0005"+
		"L\u0000\u0000\u0334\u03de\u0005\u00dd\u0000\u0000\u0335\u0336\u0005a\u0000"+
		"\u0000\u0336\u03de\u0005\u00dd\u0000\u0000\u0337\u0339\u0005\u00d4\u0000"+
		"\u0000\u0338\u033a\u0005\u00dd\u0000\u0000\u0339\u0338\u0001\u0000\u0000"+
		"\u0000\u0339\u033a\u0001\u0000\u0000\u0000\u033a\u03de\u0001\u0000\u0000"+
		"\u0000\u033b\u033d\u0005\u00d3\u0000\u0000\u033c\u033e\u0005\u00dd\u0000"+
		"\u0000\u033d\u033c\u0001\u0000\u0000\u0000\u033d\u033e\u0001\u0000\u0000"+
		"\u0000\u033e\u03de\u0001\u0000\u0000\u0000\u033f\u0340\u0005Z\u0000\u0000"+
		"\u0340\u03de\u0005\u00d4\u0000\u0000\u0341\u0342\u0005Z\u0000\u0000\u0342"+
		"\u0344\u0005\u00dd\u0000\u0000\u0343\u0345\u0005\u00d4\u0000\u0000\u0344"+
		"\u0343\u0001\u0000\u0000\u0000\u0344\u0345\u0001\u0000\u0000\u0000\u0345"+
		"\u03de\u0001\u0000\u0000\u0000\u0346\u0347\u0005Z\u0000\u0000\u0347\u03de"+
		"\u0005\u00e0\u0000\u0000\u0348\u0349\u0005Z\u0000\u0000\u0349\u03de\u0005"+
		"\u00de\u0000\u0000\u034a\u034b\u0005Z\u0000\u0000\u034b\u034c\u0005E\u0000"+
		"\u0000\u034c\u03de\u0005\u00de\u0000\u0000\u034d\u034e\u0005\u00da\u0000"+
		"\u0000\u034e\u03de\u0005M\u0000\u0000\u034f\u0350\u0005\u00db\u0000\u0000"+
		"\u0350\u03de\u0005M\u0000\u0000\u0351\u0352\u0005Z\u0000\u0000\u0352\u03de"+
		"\u0005\u00df\u0000\u0000\u0353\u0354\u0005Z\u0000\u0000\u0354\u0355\u0005"+
		"L\u0000\u0000\u0355\u03de\u0005M\u0000\u0000\u0356\u0357\u0005Z\u0000"+
		"\u0000\u0357\u03de\u0005\u00e1\u0000\u0000\u0358\u0359\u0005Z\u0000\u0000"+
		"\u0359\u03de\u0005\u00e3\u0000\u0000\u035a\u035b\u0005Z\u0000\u0000\u035b"+
		"\u03de\u0005\u00e4\u0000\u0000\u035c\u035d\u0005L\u0000\u0000\u035d\u03de"+
		"\u0005\u00e2\u0000\u0000\u035e\u035f\u0005a\u0000\u0000\u035f\u03de\u0005"+
		"\u00e2\u0000\u0000\u0360\u0361\u0005i\u0000\u0000\u0361\u03de\u0005\u00e2"+
		"\u0000\u0000\u0362\u0363\u0005\u00d5\u0000\u0000\u0363\u03de\u0005M\u0000"+
		"\u0000\u0364\u0365\u0005\u00d5\u0000\u0000\u0365\u03de\u0005\u00c8\u0000"+
		"\u0000\u0366\u0367\u0005\u00d6\u0000\u0000\u0367\u03de\u0005M\u0000\u0000"+
		"\u0368\u0369\u0005\u00d6\u0000\u0000\u0369\u03de\u0005\u00c8\u0000\u0000"+
		"\u036a\u036b\u0005L\u0000\u0000\u036b\u036c\u0005\u00af\u0000\u0000\u036c"+
		"\u03de\u0005v\u0000\u0000\u036d\u036e\u0005a\u0000\u0000\u036e\u036f\u0005"+
		"\u00af\u0000\u0000\u036f\u03de\u0005v\u0000\u0000\u0370\u0371\u0005i\u0000"+
		"\u0000\u0371\u0372\u0005M\u0000\u0000\u0372\u0373\u0003v;\u0000\u0373"+
		"\u0374\u0005\u001e\u0000\u0000\u0374\u0375\u0005\u00c3\u0000\u0000\u0375"+
		"\u03de\u0001\u0000\u0000\u0000\u0376\u0377\u0005i\u0000\u0000\u0377\u0378"+
		"\u0005M\u0000\u0000\u0378\u0379\u0003v;\u0000\u0379\u037a\u0005\u00c3"+
		"\u0000\u0000\u037a\u037b\u0005\u0012\u0000\u0000\u037b\u03de\u0001\u0000"+
		"\u0000\u0000\u037c\u037d\u0005i\u0000\u0000\u037d\u037e\u0005M\u0000\u0000"+
		"\u037e\u037f\u0003v;\u0000\u037f\u0380\u0005\u001e\u0000\u0000\u0380\u0381"+
		"\u0005\u00c4\u0000\u0000\u0381\u03de\u0001\u0000\u0000\u0000\u0382\u0383"+
		"\u0005i\u0000\u0000\u0383\u0384\u0005M\u0000\u0000\u0384\u0385\u0003v"+
		";\u0000\u0385\u0386\u0005\u00b5\u0000\u0000\u0386\u0387\u0005\u0012\u0000"+
		"\u0000\u0387\u03de\u0001\u0000\u0000\u0000\u0388\u0389\u0005i\u0000\u0000"+
		"\u0389\u038a\u0005M\u0000\u0000\u038a\u038b\u0003v;\u0000\u038b\u038c"+
		"\u0005\u001e\u0000\u0000\u038c\u038d\u0005\u00b5\u0000\u0000\u038d\u03de"+
		"\u0001\u0000\u0000\u0000\u038e\u038f\u0005i\u0000\u0000\u038f\u0390\u0005"+
		"M\u0000\u0000\u0390\u0391\u0003v;\u0000\u0391\u0392\u0005\u001e\u0000"+
		"\u0000\u0392\u0393\u0005\u00b6\u0000\u0000\u0393\u0394\u0005\r\u0000\u0000"+
		"\u0394\u0395\u0005\u00b7\u0000\u0000\u0395\u03de\u0001\u0000\u0000\u0000"+
		"\u0396\u0397\u0005i\u0000\u0000\u0397\u0398\u0005M\u0000\u0000\u0398\u0399"+
		"\u0003v;\u0000\u0399\u039a\u0005o\u0000\u0000\u039a\u039b\u0005\u00b5"+
		"\u0000\u0000\u039b\u039c\u0005\u00b8\u0000\u0000\u039c\u03de\u0001\u0000"+
		"\u0000\u0000\u039d\u039e\u0005i\u0000\u0000\u039e\u039f\u0005M\u0000\u0000"+
		"\u039f\u03a0\u0003v;\u0000\u03a0\u03a1\u0005\u00b9\u0000\u0000\u03a1\u03a2"+
		"\u0005?\u0000\u0000\u03a2\u03de\u0001\u0000\u0000\u0000\u03a3\u03a4\u0005"+
		"i\u0000\u0000\u03a4\u03a5\u0005M\u0000\u0000\u03a5\u03a6\u0003v;\u0000"+
		"\u03a6\u03a7\u0005\u00ba\u0000\u0000\u03a7\u03a8\u0005?\u0000\u0000\u03a8"+
		"\u03de\u0001\u0000\u0000\u0000\u03a9\u03aa\u0005i\u0000\u0000\u03aa\u03ab"+
		"\u0005M\u0000\u0000\u03ab\u03ac\u0003v;\u0000\u03ac\u03ad\u0005\u00bb"+
		"\u0000\u0000\u03ad\u03ae\u0005?\u0000\u0000\u03ae\u03de\u0001\u0000\u0000"+
		"\u0000\u03af\u03b0\u0005i\u0000\u0000\u03b0\u03b1\u0005M\u0000\u0000\u03b1"+
		"\u03b2\u0003v;\u0000\u03b2\u03b3\u0005\u00bd\u0000\u0000\u03b3\u03de\u0001"+
		"\u0000\u0000\u0000\u03b4\u03b5\u0005i\u0000\u0000\u03b5\u03b6\u0005M\u0000"+
		"\u0000\u03b6\u03b8\u0003v;\u0000\u03b7\u03b9\u0003\u001c\u000e\u0000\u03b8"+
		"\u03b7\u0001\u0000\u0000\u0000\u03b8\u03b9\u0001\u0000\u0000\u0000\u03b9"+
		"\u03ba\u0001\u0000\u0000\u0000\u03ba\u03bb\u0005\u00be\u0000\u0000\u03bb"+
		"\u03de\u0001\u0000\u0000\u0000\u03bc\u03bd\u0005i\u0000\u0000\u03bd\u03be"+
		"\u0005M\u0000\u0000\u03be\u03c0\u0003v;\u0000\u03bf\u03c1\u0003\u001c"+
		"\u000e\u0000\u03c0\u03bf\u0001\u0000\u0000\u0000\u03c0\u03c1\u0001\u0000"+
		"\u0000\u0000\u03c1\u03c2\u0001\u0000\u0000\u0000\u03c2\u03c3\u0005\u00bf"+
		"\u0000\u0000\u03c3\u03de\u0001\u0000\u0000\u0000\u03c4\u03c5\u0005i\u0000"+
		"\u0000\u03c5\u03c6\u0005M\u0000\u0000\u03c6\u03c8\u0003v;\u0000\u03c7"+
		"\u03c9\u0003\u001c\u000e\u0000\u03c8\u03c7\u0001\u0000\u0000\u0000\u03c8"+
		"\u03c9\u0001\u0000\u0000\u0000\u03c9\u03ca\u0001\u0000\u0000\u0000\u03ca"+
		"\u03cb\u0005o\u0000\u0000\u03cb\u03cc\u0005\u00bc\u0000\u0000\u03cc\u03de"+
		"\u0001\u0000\u0000\u0000\u03cd\u03ce\u0005i\u0000\u0000\u03ce\u03cf\u0005"+
		"M\u0000\u0000\u03cf\u03d1\u0003v;\u0000\u03d0\u03d2\u0003\u001c\u000e"+
		"\u0000\u03d1\u03d0\u0001\u0000\u0000\u0000\u03d1\u03d2\u0001\u0000\u0000"+
		"\u0000\u03d2\u03d3\u0001\u0000\u0000\u0000\u03d3\u03d4\u0005O\u0000\u0000"+
		"\u03d4\u03d5\u0005\\\u0000\u0000\u03d5\u03de\u0001\u0000\u0000\u0000\u03d6"+
		"\u03d7\u0005r\u0000\u0000\u03d7\u03de\u0005s\u0000\u0000\u03d8\u03de\u0005"+
		"t\u0000\u0000\u03d9\u03de\u0005u\u0000\u0000\u03da\u03de\u0005\u00ca\u0000"+
		"\u0000\u03db\u03dc\u0005Q\u0000\u0000\u03dc\u03de\u0005\u000b\u0000\u0000"+
		"\u03dd\u0333\u0001\u0000\u0000\u0000\u03dd\u0335\u0001\u0000\u0000\u0000"+
		"\u03dd\u0337\u0001\u0000\u0000\u0000\u03dd\u033b\u0001\u0000\u0000\u0000"+
		"\u03dd\u033f\u0001\u0000\u0000\u0000\u03dd\u0341\u0001\u0000\u0000\u0000"+
		"\u03dd\u0346\u0001\u0000\u0000\u0000\u03dd\u0348\u0001\u0000\u0000\u0000"+
		"\u03dd\u034a\u0001\u0000\u0000\u0000\u03dd\u034d\u0001\u0000\u0000\u0000"+
		"\u03dd\u034f\u0001\u0000\u0000\u0000\u03dd\u0351\u0001\u0000\u0000\u0000"+
		"\u03dd\u0353\u0001\u0000\u0000\u0000\u03dd\u0356\u0001\u0000\u0000\u0000"+
		"\u03dd\u0358\u0001\u0000\u0000\u0000\u03dd\u035a\u0001\u0000\u0000\u0000"+
		"\u03dd\u035c\u0001\u0000\u0000\u0000\u03dd\u035e\u0001\u0000\u0000\u0000"+
		"\u03dd\u0360\u0001\u0000\u0000\u0000\u03dd\u0362\u0001\u0000\u0000\u0000"+
		"\u03dd\u0364\u0001\u0000\u0000\u0000\u03dd\u0366\u0001\u0000\u0000\u0000"+
		"\u03dd\u0368\u0001\u0000\u0000\u0000\u03dd\u036a\u0001\u0000\u0000\u0000"+
		"\u03dd\u036d\u0001\u0000\u0000\u0000\u03dd\u0370\u0001\u0000\u0000\u0000"+
		"\u03dd\u0376\u0001\u0000\u0000\u0000\u03dd\u037c\u0001\u0000\u0000\u0000"+
		"\u03dd\u0382\u0001\u0000\u0000\u0000\u03dd\u0388\u0001\u0000\u0000\u0000"+
		"\u03dd\u038e\u0001\u0000\u0000\u0000\u03dd\u0396\u0001\u0000\u0000\u0000"+
		"\u03dd\u039d\u0001\u0000\u0000\u0000\u03dd\u03a3\u0001\u0000\u0000\u0000"+
		"\u03dd\u03a9\u0001\u0000\u0000\u0000\u03dd\u03af\u0001\u0000\u0000\u0000"+
		"\u03dd\u03b4\u0001\u0000\u0000\u0000\u03dd\u03bc\u0001\u0000\u0000\u0000"+
		"\u03dd\u03c4\u0001\u0000\u0000\u0000\u03dd\u03cd\u0001\u0000\u0000\u0000"+
		"\u03dd\u03d6\u0001\u0000\u0000\u0000\u03dd\u03d8\u0001\u0000\u0000\u0000"+
		"\u03dd\u03d9\u0001\u0000\u0000\u0000\u03dd\u03da\u0001\u0000\u0000\u0000"+
		"\u03dd\u03db\u0001\u0000\u0000\u0000\u03de\r\u0001\u0000\u0000\u0000\u03df"+
		"\u03e1\u0005L\u0000\u0000\u03e0\u03e2\u0005\u00af\u0000\u0000\u03e1\u03e0"+
		"\u0001\u0000\u0000\u0000\u03e1\u03e2\u0001\u0000\u0000\u0000\u03e2\u03e4"+
		"\u0001\u0000\u0000\u0000\u03e3\u03e5\u0005\u00d1\u0000\u0000\u03e4\u03e3"+
		"\u0001\u0000\u0000\u0000\u03e4\u03e5\u0001\u0000\u0000\u0000\u03e5\u03e6"+
		"\u0001\u0000\u0000\u0000\u03e6\u03ea\u0005M\u0000\u0000\u03e7\u03e8\u0005"+
		"{\u0000\u0000\u03e8\u03e9\u0005\u001e\u0000\u0000\u03e9\u03eb\u0005 \u0000"+
		"\u0000\u03ea\u03e7\u0001\u0000\u0000\u0000\u03ea\u03eb\u0001\u0000\u0000"+
		"\u0000\u03eb\u03ec\u0001\u0000\u0000\u0000\u03ec\u03ed\u0003v;\u0000\u03ed"+
		"\u000f\u0001\u0000\u0000\u0000\u03ee\u03ef\u0005\u00c3\u0000\u0000\u03ef"+
		"\u03f0\u0005\u0012\u0000\u0000\u03f0\u03f4\u0003d2\u0000\u03f1\u03f2\u0005"+
		"\u00c4\u0000\u0000\u03f2\u03f3\u0005\u0012\u0000\u0000\u03f3\u03f5\u0003"+
		"h4\u0000\u03f4\u03f1\u0001\u0000\u0000\u0000\u03f4\u03f5\u0001\u0000\u0000"+
		"\u0000\u03f5\u03f6\u0001\u0000\u0000\u0000\u03f6\u03f7\u0005R\u0000\u0000"+
		"\u03f7\u03f8\u0005\u00ee\u0000\u0000\u03f8\u03f9\u0005\u00b4\u0000\u0000"+
		"\u03f9\u0011\u0001\u0000\u0000\u0000\u03fa\u03fb\u0005\u00b5\u0000\u0000"+
		"\u03fb\u03fc\u0005\u0012\u0000\u0000\u03fc\u03fd\u0003d2\u0000\u03fd\u0400"+
		"\u0005;\u0000\u0000\u03fe\u0401\u00032\u0019\u0000\u03ff\u0401\u00034"+
		"\u001a\u0000\u0400\u03fe\u0001\u0000\u0000\u0000\u0400\u03ff\u0001\u0000"+
		"\u0000\u0000\u0401\u0405\u0001\u0000\u0000\u0000\u0402\u0403\u0005\u00b6"+
		"\u0000\u0000\u0403\u0404\u0005\r\u0000\u0000\u0404\u0406\u0005\u00b7\u0000"+
		"\u0000\u0405\u0402\u0001\u0000\u0000\u0000\u0405\u0406\u0001\u0000\u0000"+
		"\u0000\u0406\u0013\u0001\u0000\u0000\u0000\u0407\u0408\u0005\u00b8\u0000"+
		"\u0000\u0408\u0409\u0005\u00e9\u0000\u0000\u0409\u0015\u0001\u0000\u0000"+
		"\u0000\u040a\u040c\u0003$\u0012\u0000\u040b\u040a\u0001\u0000\u0000\u0000"+
		"\u040b\u040c\u0001\u0000\u0000\u0000\u040c\u040d\u0001\u0000\u0000\u0000"+
		"\u040d\u040e\u0003>\u001f\u0000\u040e\u0017\u0001\u0000\u0000\u0000\u040f"+
		"\u0410\u0005P\u0000\u0000\u0410\u0411\u0005\u0095\u0000\u0000\u0411\u0412"+
		"\u0005M\u0000\u0000\u0412\u0419\u0003v;\u0000\u0413\u0417\u0003\u001c"+
		"\u000e\u0000\u0414\u0415\u0005{\u0000\u0000\u0415\u0416\u0005\u001e\u0000"+
		"\u0000\u0416\u0418\u0005 \u0000\u0000\u0417\u0414\u0001\u0000\u0000\u0000"+
		"\u0417\u0418\u0001\u0000\u0000\u0000\u0418\u041a\u0001\u0000\u0000\u0000"+
		"\u0419\u0413\u0001\u0000\u0000\u0000\u0419\u041a\u0001\u0000\u0000\u0000"+
		"\u041a\u0425\u0001\u0000\u0000\u0000\u041b\u041c\u0005P\u0000\u0000\u041c"+
		"\u041e\u0005R\u0000\u0000\u041d\u041f\u0005M\u0000\u0000\u041e\u041d\u0001"+
		"\u0000\u0000\u0000\u041e\u041f\u0001\u0000\u0000\u0000\u041f\u0420\u0001"+
		"\u0000\u0000\u0000\u0420\u0422\u0003v;\u0000\u0421\u0423\u0003\u001c\u000e"+
		"\u0000\u0422\u0421\u0001\u0000\u0000\u0000\u0422\u0423\u0001\u0000\u0000"+
		"\u0000\u0423\u0425\u0001\u0000\u0000\u0000\u0424\u040f\u0001\u0000\u0000"+
		"\u0000\u0424\u041b\u0001\u0000\u0000\u0000\u0425\u0019\u0001\u0000\u0000"+
		"\u0000\u0426\u0428\u0003\u001c\u000e\u0000\u0427\u0429\u0003\u0014\n\u0000"+
		"\u0428\u0427\u0001\u0000\u0000\u0000\u0428\u0429\u0001\u0000\u0000\u0000"+
		"\u0429\u001b\u0001\u0000\u0000\u0000\u042a\u042b\u0005?\u0000\u0000\u042b"+
		"\u042c\u0005\u0001\u0000\u0000\u042c\u0431\u0003\u001e\u000f\u0000\u042d"+
		"\u042e\u0005\u0003\u0000\u0000\u042e\u0430\u0003\u001e\u000f\u0000\u042f"+
		"\u042d\u0001\u0000\u0000\u0000\u0430\u0433\u0001\u0000\u0000\u0000\u0431"+
		"\u042f\u0001\u0000\u0000\u0000\u0431\u0432\u0001\u0000\u0000\u0000\u0432"+
		"\u0434\u0001\u0000\u0000\u0000\u0433\u0431\u0001\u0000\u0000\u0000\u0434"+
		"\u0435\u0005\u0002\u0000\u0000\u0435\u001d\u0001\u0000\u0000\u0000\u0436"+
		"\u0439\u0003\u00ba]\u0000\u0437\u0438\u0005|\u0000\u0000\u0438\u043a\u0003"+
		"\u0090H\u0000\u0439\u0437\u0001\u0000\u0000\u0000\u0439\u043a\u0001\u0000"+
		"\u0000\u0000\u043a\u001f\u0001\u0000\u0000\u0000\u043b\u0441\u0003\u00b8"+
		"\\\u0000\u043c\u0441\u0005\u00e9\u0000\u0000\u043d\u0441\u0003\u0092I"+
		"\u0000\u043e\u0441\u0003\u0094J\u0000\u043f\u0441\u0003\u0096K\u0000\u0440"+
		"\u043b\u0001\u0000\u0000\u0000\u0440\u043c\u0001\u0000\u0000\u0000\u0440"+
		"\u043d\u0001\u0000\u0000\u0000\u0440\u043e\u0001\u0000\u0000\u0000\u0440"+
		"\u043f\u0001\u0000\u0000\u0000\u0441!\u0001\u0000\u0000\u0000\u0442\u044a"+
		"\u0003\u00ba]\u0000\u0443\u0446\u0005\u0004\u0000\u0000\u0444\u0447\u0003"+
		"\u00ba]\u0000\u0445\u0447\u0005\u00e9\u0000\u0000\u0446\u0444\u0001\u0000"+
		"\u0000\u0000\u0446\u0445\u0001\u0000\u0000\u0000\u0447\u0449\u0001\u0000"+
		"\u0000\u0000\u0448\u0443\u0001\u0000\u0000\u0000\u0449\u044c\u0001\u0000"+
		"\u0000\u0000\u044a\u0448\u0001\u0000\u0000\u0000\u044a\u044b\u0001\u0000"+
		"\u0000\u0000\u044b#\u0001\u0000\u0000\u0000\u044c\u044a\u0001\u0000\u0000"+
		"\u0000\u044d\u044e\u0005J\u0000\u0000\u044e\u0453\u0003&\u0013\u0000\u044f"+
		"\u0450\u0005\u0003\u0000\u0000\u0450\u0452\u0003&\u0013\u0000\u0451\u044f"+
		"\u0001\u0000\u0000\u0000\u0452\u0455\u0001\u0000\u0000\u0000\u0453\u0451"+
		"\u0001\u0000\u0000\u0000\u0453\u0454\u0001\u0000\u0000\u0000\u0454%\u0001"+
		"\u0000\u0000\u0000\u0455\u0453\u0001\u0000\u0000\u0000\u0456\u0458\u0003"+
		"\u00ba]\u0000\u0457\u0459\u0005\r\u0000\u0000\u0458\u0457\u0001\u0000"+
		"\u0000\u0000\u0458\u0459\u0001\u0000\u0000\u0000\u0459\u045a\u0001\u0000"+
		"\u0000\u0000\u045a\u045b\u0005\u0001\u0000\u0000\u045b\u045c\u0003\u0016"+
		"\u000b\u0000\u045c\u045d\u0005\u0002\u0000\u0000\u045d\'\u0001\u0000\u0000"+
		"\u0000\u045e\u045f\u0005\u0098\u0000\u0000\u045f\u0460\u0003\u00b8\\\u0000"+
		"\u0460)\u0001\u0000\u0000\u0000\u0461\u0462\u0005\u0001\u0000\u0000\u0462"+
		"\u0467\u0003,\u0016\u0000\u0463\u0464\u0005\u0003\u0000\u0000\u0464\u0466"+
		"\u0003,\u0016\u0000\u0465\u0463\u0001\u0000\u0000\u0000\u0466\u0469\u0001"+
		"\u0000\u0000\u0000\u0467\u0465\u0001\u0000\u0000\u0000\u0467\u0468\u0001"+
		"\u0000\u0000\u0000\u0468\u046a\u0001\u0000\u0000\u0000\u0469\u0467\u0001"+
		"\u0000\u0000\u0000\u046a\u046b\u0005\u0002\u0000\u0000\u046b+\u0001\u0000"+
		"\u0000\u0000\u046c\u0471\u0003.\u0017\u0000\u046d\u046f\u0005|\u0000\u0000"+
		"\u046e\u046d\u0001\u0000\u0000\u0000\u046e\u046f\u0001\u0000\u0000\u0000"+
		"\u046f\u0470\u0001\u0000\u0000\u0000\u0470\u0472\u00030\u0018\u0000\u0471"+
		"\u046e\u0001\u0000\u0000\u0000\u0471\u0472\u0001\u0000\u0000\u0000\u0472"+
		"-\u0001\u0000\u0000\u0000\u0473\u0478\u0003\u00ba]\u0000\u0474\u0475\u0005"+
		"\u0004\u0000\u0000\u0475\u0477\u0003\u00ba]\u0000\u0476\u0474\u0001\u0000"+
		"\u0000\u0000\u0477\u047a\u0001\u0000\u0000\u0000\u0478\u0476\u0001\u0000"+
		"\u0000\u0000\u0478\u0479\u0001\u0000\u0000\u0000\u0479\u047d\u0001\u0000"+
		"\u0000\u0000\u047a\u0478\u0001\u0000\u0000\u0000\u047b\u047d\u0005\u00e9"+
		"\u0000\u0000\u047c\u0473\u0001\u0000\u0000\u0000\u047c\u047b\u0001\u0000"+
		"\u0000\u0000\u047d/\u0001\u0000\u0000\u0000\u047e\u0483\u0005\u00ee\u0000"+
		"\u0000\u047f\u0483\u0005\u00ef\u0000\u0000\u0480\u0483\u0003\u0098L\u0000"+
		"\u0481\u0483\u0005\u00e9\u0000\u0000\u0482\u047e\u0001\u0000\u0000\u0000"+
		"\u0482\u047f\u0001\u0000\u0000\u0000\u0482\u0480\u0001\u0000\u0000\u0000"+
		"\u0482\u0481\u0001\u0000\u0000\u0000\u04831\u0001\u0000\u0000\u0000\u0484"+
		"\u0485\u0005\u0001\u0000\u0000\u0485\u048a\u0003\u0090H\u0000\u0486\u0487"+
		"\u0005\u0003\u0000\u0000\u0487\u0489\u0003\u0090H\u0000\u0488\u0486\u0001"+
		"\u0000\u0000\u0000\u0489\u048c\u0001\u0000\u0000\u0000\u048a\u0488\u0001"+
		"\u0000\u0000\u0000\u048a\u048b\u0001\u0000\u0000\u0000\u048b\u048d\u0001"+
		"\u0000\u0000\u0000\u048c\u048a\u0001\u0000\u0000\u0000\u048d\u048e\u0005"+
		"\u0002\u0000\u0000\u048e3\u0001\u0000\u0000\u0000\u048f\u0490\u0005\u0001"+
		"\u0000\u0000\u0490\u0495\u00032\u0019\u0000\u0491\u0492\u0005\u0003\u0000"+
		"\u0000\u0492\u0494\u00032\u0019\u0000\u0493\u0491\u0001\u0000\u0000\u0000"+
		"\u0494\u0497\u0001\u0000\u0000\u0000\u0495\u0493\u0001\u0000\u0000\u0000"+
		"\u0495\u0496\u0001\u0000\u0000\u0000\u0496\u0498\u0001\u0000\u0000\u0000"+
		"\u0497\u0495\u0001\u0000\u0000\u0000\u0498\u0499\u0005\u0002\u0000\u0000"+
		"\u04995\u0001\u0000\u0000\u0000\u049a\u049b\u0005\u00b6\u0000\u0000\u049b"+
		"\u049c\u0005\r\u0000\u0000\u049c\u04a1\u00038\u001c\u0000\u049d\u049e"+
		"\u0005\u00b6\u0000\u0000\u049e\u049f\u0005\u0012\u0000\u0000\u049f\u04a1"+
		"\u0003:\u001d\u0000\u04a0\u049a\u0001\u0000\u0000\u0000\u04a0\u049d\u0001"+
		"\u0000\u0000\u0000\u04a17\u0001\u0000\u0000\u0000\u04a2\u04a3\u0005\u00c6"+
		"\u0000\u0000\u04a3\u04a4\u0005\u00e9\u0000\u0000\u04a4\u04a5\u0005\u00c7"+
		"\u0000\u0000\u04a5\u04a8\u0005\u00e9\u0000\u0000\u04a6\u04a8\u0003\u00ba"+
		"]\u0000\u04a7\u04a2\u0001\u0000\u0000\u0000\u04a7\u04a6\u0001\u0000\u0000"+
		"\u0000\u04a89\u0001\u0000\u0000\u0000\u04a9\u04ad\u0005\u00e9\u0000\u0000"+
		"\u04aa\u04ab\u0005J\u0000\u0000\u04ab\u04ac\u0005\u009a\u0000\u0000\u04ac"+
		"\u04ae\u0003*\u0015\u0000\u04ad\u04aa\u0001\u0000\u0000\u0000\u04ad\u04ae"+
		"\u0001\u0000\u0000\u0000\u04ae;\u0001\u0000\u0000\u0000\u04af\u04b0\u0003"+
		"\u00ba]\u0000\u04b0\u04b1\u0005\u00e9\u0000\u0000\u04b1=\u0001\u0000\u0000"+
		"\u0000\u04b2\u04b4\u0003\u0018\f\u0000\u04b3\u04b2\u0001\u0000\u0000\u0000"+
		"\u04b3\u04b4\u0001\u0000\u0000\u0000\u04b4\u04b5\u0001\u0000\u0000\u0000"+
		"\u04b5\u04b6\u0003D\"\u0000\u04b6\u04b7\u0003@ \u0000\u04b7\u04bf\u0001"+
		"\u0000\u0000\u0000\u04b8\u04ba\u0003P(\u0000\u04b9\u04bb\u0003B!\u0000"+
		"\u04ba\u04b9\u0001\u0000\u0000\u0000\u04bb\u04bc\u0001\u0000\u0000\u0000"+
		"\u04bc\u04ba\u0001\u0000\u0000\u0000\u04bc\u04bd\u0001\u0000\u0000\u0000"+
		"\u04bd\u04bf\u0001\u0000\u0000\u0000\u04be\u04b3\u0001\u0000\u0000\u0000"+
		"\u04be\u04b8\u0001\u0000\u0000\u0000\u04bf?\u0001\u0000\u0000\u0000\u04c0"+
		"\u04c1\u0005\u0017\u0000\u0000\u04c1\u04c2\u0005\u0012\u0000\u0000\u04c2"+
		"\u04c7\u0003H$\u0000\u04c3\u04c4\u0005\u0003\u0000\u0000\u04c4\u04c6\u0003"+
		"H$\u0000\u04c5\u04c3\u0001\u0000\u0000\u0000\u04c6\u04c9\u0001\u0000\u0000"+
		"\u0000\u04c7\u04c5\u0001\u0000\u0000\u0000\u04c7\u04c8\u0001\u0000\u0000"+
		"\u0000\u04c8\u04cb\u0001\u0000\u0000\u0000\u04c9\u04c7\u0001\u0000\u0000"+
		"\u0000\u04ca\u04c0\u0001\u0000\u0000\u0000\u04ca\u04cb\u0001\u0000\u0000"+
		"\u0000\u04cb\u04d6\u0001\u0000\u0000\u0000\u04cc\u04cd\u0005\u0093\u0000"+
		"\u0000\u04cd\u04ce\u0005\u0012\u0000\u0000\u04ce\u04d3\u0003~?\u0000\u04cf"+
		"\u04d0\u0005\u0003\u0000\u0000\u04d0\u04d2\u0003~?\u0000\u04d1\u04cf\u0001"+
		"\u0000\u0000\u0000\u04d2\u04d5\u0001\u0000\u0000\u0000\u04d3\u04d1\u0001"+
		"\u0000\u0000\u0000\u04d3\u04d4\u0001\u0000\u0000\u0000\u04d4\u04d7\u0001"+
		"\u0000\u0000\u0000\u04d5\u04d3\u0001\u0000\u0000\u0000\u04d6\u04cc\u0001"+
		"\u0000\u0000\u0000\u04d6\u04d7\u0001\u0000\u0000\u0000\u04d7\u04e2\u0001"+
		"\u0000\u0000\u0000\u04d8\u04d9\u0005\u0094\u0000\u0000\u04d9\u04da\u0005"+
		"\u0012\u0000\u0000\u04da\u04df\u0003~?\u0000\u04db\u04dc\u0005\u0003\u0000"+
		"\u0000\u04dc\u04de\u0003~?\u0000\u04dd\u04db\u0001\u0000\u0000\u0000\u04de"+
		"\u04e1\u0001\u0000\u0000\u0000\u04df\u04dd\u0001\u0000\u0000\u0000\u04df"+
		"\u04e0\u0001\u0000\u0000\u0000\u04e0\u04e3\u0001\u0000\u0000\u0000\u04e1"+
		"\u04df\u0001\u0000\u0000\u0000\u04e2\u04d8\u0001\u0000\u0000\u0000\u04e2"+
		"\u04e3\u0001\u0000\u0000\u0000\u04e3\u04ee\u0001\u0000\u0000\u0000\u04e4"+
		"\u04e5\u0005\u0092\u0000\u0000\u04e5\u04e6\u0005\u0012\u0000\u0000\u04e6"+
		"\u04eb\u0003H$\u0000\u04e7\u04e8\u0005\u0003\u0000\u0000\u04e8\u04ea\u0003"+
		"H$\u0000\u04e9\u04e7\u0001\u0000\u0000\u0000\u04ea\u04ed\u0001\u0000\u0000"+
		"\u0000\u04eb\u04e9\u0001\u0000\u0000\u0000\u04eb\u04ec\u0001\u0000\u0000"+
		"\u0000\u04ec\u04ef\u0001\u0000\u0000\u0000\u04ed\u04eb\u0001\u0000\u0000"+
		"\u0000\u04ee\u04e4\u0001\u0000\u0000\u0000\u04ee\u04ef\u0001\u0000\u0000"+
		"\u0000\u04ef\u04f1\u0001\u0000\u0000\u0000\u04f0\u04f2\u0003\u00aeW\u0000"+
		"\u04f1\u04f0\u0001\u0000\u0000\u0000\u04f1\u04f2\u0001\u0000\u0000\u0000"+
		"\u04f2\u04f5\u0001\u0000\u0000\u0000\u04f3\u04f4\u0005\u0019\u0000\u0000"+
		"\u04f4\u04f6\u0003~?\u0000\u04f5\u04f3\u0001\u0000\u0000\u0000\u04f5\u04f6"+
		"\u0001\u0000\u0000\u0000\u04f6A\u0001\u0000\u0000\u0000\u04f7\u04f9\u0003"+
		"\u0018\f\u0000\u04f8\u04f7\u0001\u0000\u0000\u0000\u04f8\u04f9\u0001\u0000"+
		"\u0000\u0000\u04f9\u04fa\u0001\u0000\u0000\u0000\u04fa\u04fb\u0003J%\u0000"+
		"\u04fb\u04fc\u0003@ \u0000\u04fcC\u0001\u0000\u0000\u0000\u04fd\u04fe"+
		"\u0006\"\uffff\uffff\u0000\u04fe\u04ff\u0003F#\u0000\u04ff\u0508\u0001"+
		"\u0000\u0000\u0000\u0500\u0501\n\u0001\u0000\u0000\u0501\u0503\u0007\u0007"+
		"\u0000\u0000\u0502\u0504\u0003X,\u0000\u0503\u0502\u0001\u0000\u0000\u0000"+
		"\u0503\u0504\u0001\u0000\u0000\u0000\u0504\u0505\u0001\u0000\u0000\u0000"+
		"\u0505\u0507\u0003D\"\u0002\u0506\u0500\u0001\u0000\u0000\u0000\u0507"+
		"\u050a\u0001\u0000\u0000\u0000\u0508\u0506\u0001\u0000\u0000\u0000\u0508"+
		"\u0509\u0001\u0000\u0000\u0000\u0509E\u0001\u0000\u0000\u0000\u050a\u0508"+
		"\u0001\u0000\u0000\u0000\u050b\u0514\u0003J%\u0000\u050c\u050d\u0005M"+
		"\u0000\u0000\u050d\u0514\u0003v;\u0000\u050e\u0514\u0003r9\u0000\u050f"+
		"\u0510\u0005\u0001\u0000\u0000\u0510\u0511\u0003>\u001f\u0000\u0511\u0512"+
		"\u0005\u0002\u0000\u0000\u0512\u0514\u0001\u0000\u0000\u0000\u0513\u050b"+
		"\u0001\u0000\u0000\u0000\u0513\u050c\u0001\u0000\u0000\u0000\u0513\u050e"+
		"\u0001\u0000\u0000\u0000\u0513\u050f\u0001\u0000\u0000\u0000\u0514G\u0001"+
		"\u0000\u0000\u0000\u0515\u0517\u0003~?\u0000\u0516\u0518\u0007\b\u0000"+
		"\u0000\u0517\u0516\u0001\u0000\u0000\u0000\u0517\u0518\u0001\u0000\u0000"+
		"\u0000\u0518\u051b\u0001\u0000\u0000\u0000\u0519\u051a\u0005(\u0000\u0000"+
		"\u051a\u051c\u0007\t\u0000\u0000\u051b\u0519\u0001\u0000\u0000\u0000\u051b"+
		"\u051c\u0001\u0000\u0000\u0000\u051cI\u0001\u0000\u0000\u0000\u051d\u051e"+
		"\u0005\n\u0000\u0000\u051e\u051f\u0005\u0096\u0000\u0000\u051f\u0520\u0005"+
		"\u0001\u0000\u0000\u0520\u0521\u0003|>\u0000\u0521\u0522\u0005\u0002\u0000"+
		"\u0000\u0522\u0528\u0001\u0000\u0000\u0000\u0523\u0524\u0005l\u0000\u0000"+
		"\u0524\u0528\u0003|>\u0000\u0525\u0526\u0005\u0097\u0000\u0000\u0526\u0528"+
		"\u0003|>\u0000\u0527\u051d\u0001\u0000\u0000\u0000\u0527\u0523\u0001\u0000"+
		"\u0000\u0000\u0527\u0525\u0001\u0000\u0000\u0000\u0528\u052a\u0001\u0000"+
		"\u0000\u0000\u0529\u052b\u0003t:\u0000\u052a\u0529\u0001\u0000\u0000\u0000"+
		"\u052a\u052b\u0001\u0000\u0000\u0000\u052b\u052e\u0001\u0000\u0000\u0000"+
		"\u052c\u052d\u0005\u009c\u0000\u0000\u052d\u052f\u0005\u00e9\u0000\u0000"+
		"\u052e\u052c\u0001\u0000\u0000\u0000\u052e\u052f\u0001\u0000\u0000\u0000"+
		"\u052f\u0530\u0001\u0000\u0000\u0000\u0530\u0531\u0005\u0098\u0000\u0000"+
		"\u0531\u053e\u0005\u00e9\u0000\u0000\u0532\u053c\u0005\r\u0000\u0000\u0533"+
		"\u053d\u0003f3\u0000\u0534\u053d\u0003\u00a4R\u0000\u0535\u0538\u0005"+
		"\u0001\u0000\u0000\u0536\u0539\u0003f3\u0000\u0537\u0539\u0003\u00a4R"+
		"\u0000\u0538\u0536\u0001\u0000\u0000\u0000\u0538\u0537\u0001\u0000\u0000"+
		"\u0000\u0539\u053a\u0001\u0000\u0000\u0000\u053a\u053b\u0005\u0002\u0000"+
		"\u0000\u053b\u053d\u0001\u0000\u0000\u0000\u053c\u0533\u0001\u0000\u0000"+
		"\u0000\u053c\u0534\u0001\u0000\u0000\u0000\u053c\u0535\u0001\u0000\u0000"+
		"\u0000\u053d\u053f\u0001\u0000\u0000\u0000\u053e\u0532\u0001\u0000\u0000"+
		"\u0000\u053e\u053f\u0001\u0000\u0000\u0000\u053f\u0541\u0001\u0000\u0000"+
		"\u0000\u0540\u0542\u0003t:\u0000\u0541\u0540\u0001\u0000\u0000\u0000\u0541"+
		"\u0542\u0001\u0000\u0000\u0000\u0542\u0545\u0001\u0000\u0000\u0000\u0543"+
		"\u0544\u0005\u009b\u0000\u0000\u0544\u0546\u0005\u00e9\u0000\u0000\u0545"+
		"\u0543\u0001\u0000\u0000\u0000\u0545\u0546\u0001\u0000\u0000\u0000\u0546"+
		"\u0548\u0001\u0000\u0000\u0000\u0547\u0549\u0003P(\u0000\u0548\u0547\u0001"+
		"\u0000\u0000\u0000\u0548\u0549\u0001\u0000\u0000\u0000\u0549\u054c\u0001"+
		"\u0000\u0000\u0000\u054a\u054b\u0005\u0010\u0000\u0000\u054b\u054d\u0003"+
		"\u0080@\u0000\u054c\u054a\u0001\u0000\u0000\u0000\u054c\u054d\u0001\u0000"+
		"\u0000\u0000\u054d\u057b\u0001\u0000\u0000\u0000\u054e\u0552\u0005\n\u0000"+
		"\u0000\u054f\u0551\u0003L&\u0000\u0550\u054f\u0001\u0000\u0000\u0000\u0551"+
		"\u0554\u0001\u0000\u0000\u0000\u0552\u0550\u0001\u0000\u0000\u0000\u0552"+
		"\u0553\u0001\u0000\u0000\u0000\u0553\u0556\u0001\u0000\u0000\u0000\u0554"+
		"\u0552\u0001\u0000\u0000\u0000\u0555\u0557\u0003X,\u0000\u0556\u0555\u0001"+
		"\u0000\u0000\u0000\u0556\u0557\u0001\u0000\u0000\u0000\u0557\u0558\u0001"+
		"\u0000\u0000\u0000\u0558\u055a\u0003|>\u0000\u0559\u055b\u0003P(\u0000"+
		"\u055a\u0559\u0001\u0000\u0000\u0000\u055a\u055b\u0001\u0000\u0000\u0000"+
		"\u055b\u0565\u0001\u0000\u0000\u0000\u055c\u0562\u0003P(\u0000\u055d\u055f"+
		"\u0005\n\u0000\u0000\u055e\u0560\u0003X,\u0000\u055f\u055e\u0001\u0000"+
		"\u0000\u0000\u055f\u0560\u0001\u0000\u0000\u0000\u0560\u0561\u0001\u0000"+
		"\u0000\u0000\u0561\u0563\u0003|>\u0000\u0562\u055d\u0001\u0000\u0000\u0000"+
		"\u0562\u0563\u0001\u0000\u0000\u0000\u0563\u0565\u0001\u0000\u0000\u0000"+
		"\u0564\u054e\u0001\u0000\u0000\u0000\u0564\u055c\u0001\u0000\u0000\u0000"+
		"\u0565\u0569\u0001\u0000\u0000\u0000\u0566\u0568\u0003V+\u0000\u0567\u0566"+
		"\u0001\u0000\u0000\u0000\u0568\u056b\u0001\u0000\u0000\u0000\u0569\u0567"+
		"\u0001\u0000\u0000\u0000\u0569\u056a\u0001\u0000\u0000\u0000\u056a\u056e"+
		"\u0001\u0000\u0000\u0000\u056b\u0569\u0001\u0000\u0000\u0000\u056c\u056d"+
		"\u0005\u0010\u0000\u0000\u056d\u056f\u0003\u0080@\u0000\u056e\u056c\u0001"+
		"\u0000\u0000\u0000\u056e\u056f\u0001\u0000\u0000\u0000\u056f\u0571\u0001"+
		"\u0000\u0000\u0000\u0570\u0572\u0003R)\u0000\u0571\u0570\u0001\u0000\u0000"+
		"\u0000\u0571\u0572\u0001\u0000\u0000\u0000\u0572\u0575\u0001\u0000\u0000"+
		"\u0000\u0573\u0574\u0005\u0018\u0000\u0000\u0574\u0576\u0003\u0080@\u0000"+
		"\u0575\u0573\u0001\u0000\u0000\u0000\u0575\u0576\u0001\u0000\u0000\u0000"+
		"\u0576\u0578\u0001\u0000\u0000\u0000\u0577\u0579\u0003\u00aeW\u0000\u0578"+
		"\u0577\u0001\u0000\u0000\u0000\u0578\u0579\u0001\u0000\u0000\u0000\u0579"+
		"\u057b\u0001\u0000\u0000\u0000\u057a\u0527\u0001\u0000\u0000\u0000\u057a"+
		"\u0564\u0001\u0000\u0000\u0000\u057bK\u0001\u0000\u0000\u0000\u057c\u057d"+
		"\u0005\u0005\u0000\u0000\u057d\u0584\u0003N\'\u0000\u057e\u0580\u0005"+
		"\u0003\u0000\u0000\u057f\u057e\u0001\u0000\u0000\u0000\u057f\u0580\u0001"+
		"\u0000\u0000\u0000\u0580\u0581\u0001\u0000\u0000\u0000\u0581\u0583\u0003"+
		"N\'\u0000\u0582\u057f\u0001\u0000\u0000\u0000\u0583\u0586\u0001\u0000"+
		"\u0000\u0000\u0584\u0582\u0001\u0000\u0000\u0000\u0584\u0585\u0001\u0000"+
		"\u0000\u0000\u0585\u0587\u0001\u0000\u0000\u0000\u0586\u0584\u0001\u0000"+
		"\u0000\u0000\u0587\u0588\u0005\u0006\u0000\u0000\u0588M\u0001\u0000\u0000"+
		"\u0000\u0589\u0597\u0003\u00ba]\u0000\u058a\u058b\u0003\u00ba]\u0000\u058b"+
		"\u058c\u0005\u0001\u0000\u0000\u058c\u0591\u0003\u008eG\u0000\u058d\u058e"+
		"\u0005\u0003\u0000\u0000\u058e\u0590\u0003\u008eG\u0000\u058f\u058d\u0001"+
		"\u0000\u0000\u0000\u0590\u0593\u0001\u0000\u0000\u0000\u0591\u058f\u0001"+
		"\u0000\u0000\u0000\u0591\u0592\u0001\u0000\u0000\u0000\u0592\u0594\u0001"+
		"\u0000\u0000\u0000\u0593\u0591\u0001\u0000\u0000\u0000\u0594\u0595\u0005"+
		"\u0002\u0000\u0000\u0595\u0597\u0001\u0000\u0000\u0000\u0596\u0589\u0001"+
		"\u0000\u0000\u0000\u0596\u058a\u0001\u0000\u0000\u0000\u0597O\u0001\u0000"+
		"\u0000\u0000\u0598\u0599\u0005\u000b\u0000\u0000\u0599\u059e\u0003Z-\u0000"+
		"\u059a\u059b\u0005\u0003\u0000\u0000\u059b\u059d\u0003Z-\u0000\u059c\u059a"+
		"\u0001\u0000\u0000\u0000\u059d\u05a0\u0001\u0000\u0000\u0000\u059e\u059c"+
		"\u0001\u0000\u0000\u0000\u059e\u059f\u0001\u0000\u0000\u0000\u059f\u05a4"+
		"\u0001\u0000\u0000\u0000\u05a0\u059e\u0001\u0000\u0000\u0000\u05a1\u05a3"+
		"\u0003V+\u0000\u05a2\u05a1\u0001\u0000\u0000\u0000\u05a3\u05a6\u0001\u0000"+
		"\u0000\u0000\u05a4\u05a2\u0001\u0000\u0000\u0000\u05a4\u05a5\u0001\u0000"+
		"\u0000\u0000\u05a5Q\u0001\u0000\u0000\u0000\u05a6\u05a4\u0001\u0000\u0000"+
		"\u0000\u05a7\u05a8\u0005\u0011\u0000\u0000\u05a8\u05a9\u0005\u0012\u0000"+
		"\u0000\u05a9\u05ae\u0003~?\u0000\u05aa\u05ab\u0005\u0003\u0000\u0000\u05ab"+
		"\u05ad\u0003~?\u0000\u05ac\u05aa\u0001\u0000\u0000\u0000\u05ad\u05b0\u0001"+
		"\u0000\u0000\u0000\u05ae\u05ac\u0001\u0000\u0000\u0000\u05ae\u05af\u0001"+
		"\u0000\u0000\u0000\u05af\u05c2\u0001\u0000\u0000\u0000\u05b0\u05ae\u0001"+
		"\u0000\u0000\u0000\u05b1\u05b2\u0005J\u0000\u0000\u05b2\u05c3\u0005\u0016"+
		"\u0000\u0000\u05b3\u05b4\u0005J\u0000\u0000\u05b4\u05c3\u0005\u0015\u0000"+
		"\u0000\u05b5\u05b6\u0005\u0013\u0000\u0000\u05b6\u05b7\u0005\u0014\u0000"+
		"\u0000\u05b7\u05b8\u0005\u0001\u0000\u0000\u05b8\u05bd\u0003T*\u0000\u05b9"+
		"\u05ba\u0005\u0003\u0000\u0000\u05ba\u05bc\u0003T*\u0000\u05bb\u05b9\u0001"+
		"\u0000\u0000\u0000\u05bc\u05bf\u0001\u0000\u0000\u0000\u05bd\u05bb\u0001"+
		"\u0000\u0000\u0000\u05bd\u05be\u0001\u0000\u0000\u0000\u05be\u05c0\u0001"+
		"\u0000\u0000\u0000\u05bf\u05bd\u0001\u0000\u0000\u0000\u05c0\u05c1\u0005"+
		"\u0002\u0000\u0000\u05c1\u05c3\u0001\u0000\u0000\u0000\u05c2\u05b1\u0001"+
		"\u0000\u0000\u0000\u05c2\u05b3\u0001\u0000\u0000\u0000\u05c2\u05b5\u0001"+
		"\u0000\u0000\u0000\u05c2\u05c3\u0001\u0000\u0000\u0000\u05c3S\u0001\u0000"+
		"\u0000\u0000\u05c4\u05cd\u0005\u0001\u0000\u0000\u05c5\u05ca\u0003~?\u0000"+
		"\u05c6\u05c7\u0005\u0003\u0000\u0000\u05c7\u05c9\u0003~?\u0000\u05c8\u05c6"+
		"\u0001\u0000\u0000\u0000\u05c9\u05cc\u0001\u0000\u0000\u0000\u05ca\u05c8"+
		"\u0001\u0000\u0000\u0000\u05ca\u05cb\u0001\u0000\u0000\u0000\u05cb\u05ce"+
		"\u0001\u0000\u0000\u0000\u05cc\u05ca\u0001\u0000\u0000\u0000\u05cd\u05c5"+
		"\u0001\u0000\u0000\u0000\u05cd\u05ce\u0001\u0000\u0000\u0000\u05ce\u05cf"+
		"\u0001\u0000\u0000\u0000\u05cf\u05d2\u0005\u0002\u0000\u0000\u05d0\u05d2"+
		"\u0003~?\u0000\u05d1\u05c4\u0001\u0000\u0000\u0000\u05d1\u05d0\u0001\u0000"+
		"\u0000\u0000\u05d2U\u0001\u0000\u0000\u0000\u05d3\u05d4\u0005<\u0000\u0000"+
		"\u05d4\u05d6\u0005N\u0000\u0000\u05d5\u05d7\u00054\u0000\u0000\u05d6\u05d5"+
		"\u0001\u0000\u0000\u0000\u05d6\u05d7\u0001\u0000\u0000\u0000\u05d7\u05d8"+
		"\u0001\u0000\u0000\u0000\u05d8\u05d9\u0003\u00b8\\\u0000\u05d9\u05e2\u0005"+
		"\u0001\u0000\u0000\u05da\u05df\u0003~?\u0000\u05db\u05dc\u0005\u0003\u0000"+
		"\u0000\u05dc\u05de\u0003~?\u0000\u05dd\u05db\u0001\u0000\u0000\u0000\u05de"+
		"\u05e1\u0001\u0000\u0000\u0000\u05df\u05dd\u0001\u0000\u0000\u0000\u05df"+
		"\u05e0\u0001\u0000\u0000\u0000\u05e0\u05e3\u0001\u0000\u0000\u0000\u05e1"+
		"\u05df\u0001\u0000\u0000\u0000\u05e2\u05da\u0001\u0000\u0000\u0000\u05e2"+
		"\u05e3\u0001\u0000\u0000\u0000\u05e3\u05e4\u0001\u0000\u0000\u0000\u05e4"+
		"\u05e5\u0005\u0002\u0000\u0000\u05e5\u05f1\u0003\u00ba]\u0000\u05e6\u05e8"+
		"\u0005\r\u0000\u0000\u05e7\u05e6\u0001\u0000\u0000\u0000\u05e7\u05e8\u0001"+
		"\u0000\u0000\u0000\u05e8\u05e9\u0001\u0000\u0000\u0000\u05e9\u05ee\u0003"+
		"\u00ba]\u0000\u05ea\u05eb\u0005\u0003\u0000\u0000\u05eb\u05ed\u0003\u00ba"+
		"]\u0000\u05ec\u05ea\u0001\u0000\u0000\u0000\u05ed\u05f0\u0001\u0000\u0000"+
		"\u0000\u05ee\u05ec\u0001\u0000\u0000\u0000\u05ee\u05ef\u0001\u0000\u0000"+
		"\u0000\u05ef\u05f2\u0001\u0000\u0000\u0000\u05f0\u05ee\u0001\u0000\u0000"+
		"\u0000\u05f1\u05e7\u0001\u0000\u0000\u0000\u05f1\u05f2\u0001\u0000\u0000"+
		"\u0000\u05f2W\u0001\u0000\u0000\u0000\u05f3\u05f4\u0007\n\u0000\u0000"+
		"\u05f4Y\u0001\u0000\u0000\u0000\u05f5\u05f9\u0003p8\u0000\u05f6\u05f8"+
		"\u0003\\.\u0000\u05f7\u05f6\u0001\u0000\u0000\u0000\u05f8\u05fb\u0001"+
		"\u0000\u0000\u0000\u05f9\u05f7\u0001\u0000\u0000\u0000\u05f9\u05fa\u0001"+
		"\u0000\u0000\u0000\u05fa[\u0001\u0000\u0000\u0000\u05fb\u05f9\u0001\u0000"+
		"\u0000\u0000\u05fc\u05fd\u0003^/\u0000\u05fd\u05fe\u00052\u0000\u0000"+
		"\u05fe\u0600\u0003p8\u0000\u05ff\u0601\u0003`0\u0000\u0600\u05ff\u0001"+
		"\u0000\u0000\u0000\u0600\u0601\u0001\u0000\u0000\u0000\u0601\u0608\u0001"+
		"\u0000\u0000\u0000\u0602\u0603\u0005:\u0000\u0000\u0603\u0604\u0003^/"+
		"\u0000\u0604\u0605\u00052\u0000\u0000\u0605\u0606\u0003p8\u0000\u0606"+
		"\u0608\u0001\u0000\u0000\u0000\u0607\u05fc\u0001\u0000\u0000\u0000\u0607"+
		"\u0602\u0001\u0000\u0000\u0000\u0608]\u0001\u0000\u0000\u0000\u0609\u060b"+
		"\u00055\u0000\u0000\u060a\u0609\u0001\u0000\u0000\u0000\u060a\u060b\u0001"+
		"\u0000\u0000\u0000\u060b\u0621\u0001\u0000\u0000\u0000\u060c\u0621\u0005"+
		"3\u0000\u0000\u060d\u060f\u00056\u0000\u0000\u060e\u0610\u00054\u0000"+
		"\u0000\u060f\u060e\u0001\u0000\u0000\u0000\u060f\u0610\u0001\u0000\u0000"+
		"\u0000\u0610\u0621\u0001\u0000\u0000\u0000\u0611\u0612\u00056\u0000\u0000"+
		"\u0612\u0621\u00057\u0000\u0000\u0613\u0615\u00058\u0000\u0000\u0614\u0616"+
		"\u00054\u0000\u0000\u0615\u0614\u0001\u0000\u0000\u0000\u0615\u0616\u0001"+
		"\u0000\u0000\u0000\u0616\u0621\u0001\u0000\u0000\u0000\u0617\u0619\u0005"+
		"9\u0000\u0000\u0618\u061a\u00054\u0000\u0000\u0619\u0618\u0001\u0000\u0000"+
		"\u0000\u0619\u061a\u0001\u0000\u0000\u0000\u061a\u0621\u0001\u0000\u0000"+
		"\u0000\u061b\u061d\u00056\u0000\u0000\u061c\u061b\u0001\u0000\u0000\u0000"+
		"\u061c\u061d\u0001\u0000\u0000\u0000\u061d\u061e\u0001\u0000\u0000\u0000"+
		"\u061e\u0621\u0005\u00e6\u0000\u0000\u061f\u0621\u0005x\u0000\u0000\u0620"+
		"\u060a\u0001\u0000\u0000\u0000\u0620\u060c\u0001\u0000\u0000\u0000\u0620"+
		"\u060d\u0001\u0000\u0000\u0000\u0620\u0611\u0001\u0000\u0000\u0000\u0620"+
		"\u0613\u0001\u0000\u0000\u0000\u0620\u0617\u0001\u0000\u0000\u0000\u0620"+
		"\u061c\u0001\u0000\u0000\u0000\u0620\u061f\u0001\u0000\u0000\u0000\u0621"+
		"_\u0001\u0000\u0000\u0000\u0622\u0623\u0005;\u0000\u0000\u0623\u0635\u0003"+
		"\u0080@\u0000\u0624\u0632\u0005\u0098\u0000\u0000\u0625\u0626\u0005\u0001"+
		"\u0000\u0000\u0626\u062b\u0003\u00ba]\u0000\u0627\u0628\u0005\u0003\u0000"+
		"\u0000\u0628\u062a\u0003\u00ba]\u0000\u0629\u0627\u0001\u0000\u0000\u0000"+
		"\u062a\u062d\u0001\u0000\u0000\u0000\u062b\u0629\u0001\u0000\u0000\u0000"+
		"\u062b\u062c\u0001\u0000\u0000\u0000\u062c\u062e\u0001\u0000\u0000\u0000"+
		"\u062d\u062b\u0001\u0000\u0000\u0000\u062e\u062f\u0005\u0002\u0000\u0000"+
		"\u062f\u0633\u0001\u0000\u0000\u0000\u0630\u0631\u0005y\u0000\u0000\u0631"+
		"\u0633\u0003\u0080@\u0000\u0632\u0625\u0001\u0000\u0000\u0000\u0632\u0630"+
		"\u0001\u0000\u0000\u0000\u0633\u0635\u0001\u0000\u0000\u0000\u0634\u0622"+
		"\u0001\u0000\u0000\u0000\u0634\u0624\u0001\u0000\u0000\u0000\u0635a\u0001"+
		"\u0000\u0000\u0000\u0636\u0637\u0005g\u0000\u0000\u0637\u064d\u0005\u0001"+
		"\u0000\u0000\u0638\u0639\u0007\u000b\u0000\u0000\u0639\u064e\u0005\u008e"+
		"\u0000\u0000\u063a\u063b\u0003~?\u0000\u063b\u063c\u0005A\u0000\u0000"+
		"\u063c\u064e\u0001\u0000\u0000\u0000\u063d\u064e\u0005\u00ed\u0000\u0000"+
		"\u063e\u063f\u0005\u008f\u0000\u0000\u063f\u0640\u0005\u00ee\u0000\u0000"+
		"\u0640\u0641\u0005\u0090\u0000\u0000\u0641\u0642\u0005\u0091\u0000\u0000"+
		"\u0642\u064b\u0005\u00ee\u0000\u0000\u0643\u0649\u0005;\u0000\u0000\u0644"+
		"\u064a\u0003\u00ba]\u0000\u0645\u0646\u0003\u00b8\\\u0000\u0646\u0647"+
		"\u0005\u0001\u0000\u0000\u0647\u0648\u0005\u0002\u0000\u0000\u0648\u064a"+
		"\u0001\u0000\u0000\u0000\u0649\u0644\u0001\u0000\u0000\u0000\u0649\u0645"+
		"\u0001\u0000\u0000\u0000\u064a\u064c\u0001\u0000\u0000\u0000\u064b\u0643"+
		"\u0001\u0000\u0000\u0000\u064b\u064c\u0001\u0000\u0000\u0000\u064c\u064e"+
		"\u0001\u0000\u0000\u0000\u064d\u0638\u0001\u0000\u0000\u0000\u064d\u063a"+
		"\u0001\u0000\u0000\u0000\u064d\u063d\u0001\u0000\u0000\u0000\u064d\u063e"+
		"\u0001\u0000\u0000\u0000\u064e\u064f\u0001\u0000\u0000\u0000\u064f\u0650"+
		"\u0005\u0002\u0000\u0000\u0650c\u0001\u0000\u0000\u0000\u0651\u0652\u0005"+
		"\u0001\u0000\u0000\u0652\u0653\u0003f3\u0000\u0653\u0654\u0005\u0002\u0000"+
		"\u0000\u0654e\u0001\u0000\u0000\u0000\u0655\u065a\u0003\u00ba]\u0000\u0656"+
		"\u0657\u0005\u0003\u0000\u0000\u0657\u0659\u0003\u00ba]\u0000\u0658\u0656"+
		"\u0001\u0000\u0000\u0000\u0659\u065c\u0001\u0000\u0000\u0000\u065a\u0658"+
		"\u0001\u0000\u0000\u0000\u065a\u065b\u0001\u0000\u0000\u0000\u065bg\u0001"+
		"\u0000\u0000\u0000\u065c\u065a\u0001\u0000\u0000\u0000\u065d\u065e\u0005"+
		"\u0001\u0000\u0000\u065e\u0663\u0003j5\u0000\u065f\u0660\u0005\u0003\u0000"+
		"\u0000\u0660\u0662\u0003j5\u0000\u0661\u065f\u0001\u0000\u0000\u0000\u0662"+
		"\u0665\u0001\u0000\u0000\u0000\u0663\u0661\u0001\u0000\u0000\u0000\u0663"+
		"\u0664\u0001\u0000\u0000\u0000\u0664\u0666\u0001\u0000\u0000\u0000\u0665"+
		"\u0663\u0001\u0000\u0000\u0000\u0666\u0667\u0005\u0002\u0000\u0000\u0667"+
		"i\u0001\u0000\u0000\u0000\u0668\u066a\u0003\u00ba]\u0000\u0669\u066b\u0007"+
		"\b\u0000\u0000\u066a\u0669\u0001\u0000\u0000\u0000\u066a\u066b\u0001\u0000"+
		"\u0000\u0000\u066bk\u0001\u0000\u0000\u0000\u066c\u066d\u0005\u0001\u0000"+
		"\u0000\u066d\u0672\u0003n7\u0000\u066e\u066f\u0005\u0003\u0000\u0000\u066f"+
		"\u0671\u0003n7\u0000\u0670\u066e\u0001\u0000\u0000\u0000\u0671\u0674\u0001"+
		"\u0000\u0000\u0000\u0672\u0670\u0001\u0000\u0000\u0000\u0672\u0673\u0001"+
		"\u0000\u0000\u0000\u0673\u0675\u0001\u0000\u0000\u0000\u0674\u0672\u0001"+
		"\u0000\u0000\u0000\u0675\u0676\u0005\u0002\u0000\u0000\u0676m\u0001\u0000"+
		"\u0000\u0000\u0677\u067a\u0003\u00ba]\u0000\u0678\u0679\u0005n\u0000\u0000"+
		"\u0679\u067b\u0005\u00e9\u0000\u0000\u067a\u0678\u0001\u0000\u0000\u0000"+
		"\u067a\u067b\u0001\u0000\u0000\u0000\u067bo\u0001\u0000\u0000\u0000\u067c"+
		"\u067e\u0003v;\u0000\u067d\u067f\u0003b1\u0000\u067e\u067d\u0001\u0000"+
		"\u0000\u0000\u067e\u067f\u0001\u0000\u0000\u0000\u067f\u0684\u0001\u0000"+
		"\u0000\u0000\u0680\u0682\u0005\r\u0000\u0000\u0681\u0680\u0001\u0000\u0000"+
		"\u0000\u0681\u0682\u0001\u0000\u0000\u0000\u0682\u0683\u0001\u0000\u0000"+
		"\u0000\u0683\u0685\u0003\u00bc^\u0000\u0684\u0681\u0001\u0000\u0000\u0000"+
		"\u0684\u0685\u0001\u0000\u0000\u0000\u0685\u06ae\u0001\u0000\u0000\u0000"+
		"\u0686\u0687\u0005\u0001\u0000\u0000\u0687\u0688\u0003>\u001f\u0000\u0688"+
		"\u068a\u0005\u0002\u0000\u0000\u0689\u068b\u0003b1\u0000\u068a\u0689\u0001"+
		"\u0000\u0000\u0000\u068a\u068b\u0001\u0000\u0000\u0000\u068b\u0690\u0001"+
		"\u0000\u0000\u0000\u068c\u068e\u0005\r\u0000\u0000\u068d\u068c\u0001\u0000"+
		"\u0000\u0000\u068d\u068e\u0001\u0000\u0000\u0000\u068e\u068f\u0001\u0000"+
		"\u0000\u0000\u068f\u0691\u0003\u00bc^\u0000\u0690\u068d\u0001\u0000\u0000"+
		"\u0000\u0690\u0691\u0001\u0000\u0000\u0000\u0691\u06ae\u0001\u0000\u0000"+
		"\u0000\u0692\u0693\u0005\u0001\u0000\u0000\u0693\u0694\u0003Z-\u0000\u0694"+
		"\u0696\u0005\u0002\u0000\u0000\u0695\u0697\u0003b1\u0000\u0696\u0695\u0001"+
		"\u0000\u0000\u0000\u0696\u0697\u0001\u0000\u0000\u0000\u0697\u069c\u0001"+
		"\u0000\u0000\u0000\u0698\u069a\u0005\r\u0000\u0000\u0699\u0698\u0001\u0000"+
		"\u0000\u0000\u0699\u069a\u0001\u0000\u0000\u0000\u069a\u069b\u0001\u0000"+
		"\u0000\u0000\u069b\u069d\u0003\u00bc^\u0000\u069c\u0699\u0001\u0000\u0000"+
		"\u0000\u069c\u069d\u0001\u0000\u0000\u0000\u069d\u06ae\u0001\u0000\u0000"+
		"\u0000\u069e\u06ae\u0003r9\u0000\u069f\u06a0\u0003\u00ba]\u0000\u06a0"+
		"\u06a9\u0005\u0001\u0000\u0000\u06a1\u06a6\u0003~?\u0000\u06a2\u06a3\u0005"+
		"\u0003\u0000\u0000\u06a3\u06a5\u0003~?\u0000\u06a4\u06a2\u0001\u0000\u0000"+
		"\u0000\u06a5\u06a8\u0001\u0000\u0000\u0000\u06a6\u06a4\u0001\u0000\u0000"+
		"\u0000\u06a6\u06a7\u0001\u0000\u0000\u0000\u06a7\u06aa\u0001\u0000\u0000"+
		"\u0000\u06a8\u06a6\u0001\u0000\u0000\u0000\u06a9\u06a1\u0001\u0000\u0000"+
		"\u0000\u06a9\u06aa\u0001\u0000\u0000\u0000\u06aa\u06ab\u0001\u0000\u0000"+
		"\u0000\u06ab\u06ac\u0005\u0002\u0000\u0000\u06ac\u06ae\u0001\u0000\u0000"+
		"\u0000\u06ad\u067c\u0001\u0000\u0000\u0000\u06ad\u0686\u0001\u0000\u0000"+
		"\u0000\u06ad\u0692\u0001\u0000\u0000\u0000\u06ad\u069e\u0001\u0000\u0000"+
		"\u0000\u06ad\u069f\u0001\u0000\u0000\u0000\u06aeq\u0001\u0000\u0000\u0000"+
		"\u06af\u06b0\u0005K\u0000\u0000\u06b0\u06b5\u0003~?\u0000\u06b1\u06b2"+
		"\u0005\u0003\u0000\u0000\u06b2\u06b4\u0003~?\u0000\u06b3\u06b1\u0001\u0000"+
		"\u0000\u0000\u06b4\u06b7\u0001\u0000\u0000\u0000\u06b5\u06b3\u0001\u0000"+
		"\u0000\u0000\u06b5\u06b6\u0001\u0000\u0000\u0000\u06b6\u06bf\u0001\u0000"+
		"\u0000\u0000\u06b7\u06b5\u0001\u0000\u0000\u0000\u06b8\u06ba\u0005\r\u0000"+
		"\u0000\u06b9\u06b8\u0001\u0000\u0000\u0000\u06b9\u06ba\u0001\u0000\u0000"+
		"\u0000\u06ba\u06bb\u0001\u0000\u0000\u0000\u06bb\u06bd\u0003\u00ba]\u0000"+
		"\u06bc\u06be\u0003d2\u0000\u06bd\u06bc\u0001\u0000\u0000\u0000\u06bd\u06be"+
		"\u0001\u0000\u0000\u0000\u06be\u06c0\u0001\u0000\u0000\u0000\u06bf\u06b9"+
		"\u0001\u0000\u0000\u0000\u06bf\u06c0\u0001\u0000\u0000\u0000\u06c0s\u0001"+
		"\u0000\u0000\u0000\u06c1\u06c2\u0005I\u0000\u0000\u06c2\u06c3\u0005U\u0000"+
		"\u0000\u06c3\u06c4\u0005\u0099\u0000\u0000\u06c4\u06c8\u0005\u00e9\u0000"+
		"\u0000\u06c5\u06c6\u0005J\u0000\u0000\u06c6\u06c7\u0005\u009a\u0000\u0000"+
		"\u06c7\u06c9\u0003*\u0015\u0000\u06c8\u06c5\u0001\u0000\u0000\u0000\u06c8"+
		"\u06c9\u0001\u0000\u0000\u0000\u06c9\u06f3\u0001\u0000\u0000\u0000\u06ca"+
		"\u06cb\u0005I\u0000\u0000\u06cb\u06cc\u0005U\u0000\u0000\u06cc\u06d6\u0005"+
		"\u009d\u0000\u0000\u06cd\u06ce\u0005\u009e\u0000\u0000\u06ce\u06cf\u0005"+
		"\u009f\u0000\u0000\u06cf\u06d0\u0005\u0012\u0000\u0000\u06d0\u06d4\u0005"+
		"\u00e9\u0000\u0000\u06d1\u06d2\u0005\u00a3\u0000\u0000\u06d2\u06d3\u0005"+
		"\u0012\u0000\u0000\u06d3\u06d5\u0005\u00e9\u0000\u0000\u06d4\u06d1\u0001"+
		"\u0000\u0000\u0000\u06d4\u06d5\u0001\u0000\u0000\u0000\u06d5\u06d7\u0001"+
		"\u0000\u0000\u0000\u06d6\u06cd\u0001\u0000\u0000\u0000\u06d6\u06d7\u0001"+
		"\u0000\u0000\u0000\u06d7\u06dd\u0001\u0000\u0000\u0000\u06d8\u06d9\u0005"+
		"\u00a0\u0000\u0000\u06d9\u06da\u0005\u00a1\u0000\u0000\u06da\u06db\u0005"+
		"\u009f\u0000\u0000\u06db\u06dc\u0005\u0012\u0000\u0000\u06dc\u06de\u0005"+
		"\u00e9\u0000\u0000\u06dd\u06d8\u0001\u0000\u0000\u0000\u06dd\u06de\u0001"+
		"\u0000\u0000\u0000\u06de\u06e4\u0001\u0000\u0000\u0000\u06df\u06e0\u0005"+
		"l\u0000\u0000\u06e0\u06e1\u0005\u00a2\u0000\u0000\u06e1\u06e2\u0005\u009f"+
		"\u0000\u0000\u06e2\u06e3\u0005\u0012\u0000\u0000\u06e3\u06e5\u0005\u00e9"+
		"\u0000\u0000\u06e4\u06df\u0001\u0000\u0000\u0000\u06e4\u06e5\u0001\u0000"+
		"\u0000\u0000\u06e5\u06ea\u0001\u0000\u0000\u0000\u06e6\u06e7\u0005\u00a4"+
		"\u0000\u0000\u06e7\u06e8\u0005\u009f\u0000\u0000\u06e8\u06e9\u0005\u0012"+
		"\u0000\u0000\u06e9\u06eb\u0005\u00e9\u0000\u0000\u06ea\u06e6\u0001\u0000"+
		"\u0000\u0000\u06ea\u06eb\u0001\u0000\u0000\u0000\u06eb\u06f0\u0001\u0000"+
		"\u0000\u0000\u06ec\u06ed\u0005%\u0000\u0000\u06ed\u06ee\u0005\u00d2\u0000"+
		"\u0000\u06ee\u06ef\u0005\r\u0000\u0000\u06ef\u06f1\u0005\u00e9\u0000\u0000"+
		"\u06f0\u06ec\u0001\u0000\u0000\u0000\u06f0\u06f1\u0001\u0000\u0000\u0000"+
		"\u06f1\u06f3\u0001\u0000\u0000\u0000\u06f2\u06c1\u0001\u0000\u0000\u0000"+
		"\u06f2\u06ca\u0001\u0000\u0000\u0000\u06f3u\u0001\u0000\u0000\u0000\u06f4"+
		"\u06f5\u0003\u00ba]\u0000\u06f5\u06f6\u0005\u0004\u0000\u0000\u06f6\u06f8"+
		"\u0001\u0000\u0000\u0000\u06f7\u06f4\u0001\u0000\u0000\u0000\u06f7\u06f8"+
		"\u0001\u0000\u0000\u0000\u06f8\u06f9\u0001\u0000\u0000\u0000\u06f9\u06fa"+
		"\u0003\u00ba]\u0000\u06faw\u0001\u0000\u0000\u0000\u06fb\u06fc\u0003\u00ba"+
		"]\u0000\u06fc\u06fd\u0005\u0004\u0000\u0000\u06fd\u06ff\u0001\u0000\u0000"+
		"\u0000\u06fe\u06fb\u0001\u0000\u0000\u0000\u06fe\u06ff\u0001\u0000\u0000"+
		"\u0000\u06ff\u0700\u0001\u0000\u0000\u0000\u0700\u0701\u0003\u00ba]\u0000"+
		"\u0701y\u0001\u0000\u0000\u0000\u0702\u070a\u0003~?\u0000\u0703\u0705"+
		"\u0005\r\u0000\u0000\u0704\u0703\u0001\u0000\u0000\u0000\u0704\u0705\u0001"+
		"\u0000\u0000\u0000\u0705\u0708\u0001\u0000\u0000\u0000\u0706\u0709\u0003"+
		"\u00ba]\u0000\u0707\u0709\u0003d2\u0000\u0708\u0706\u0001\u0000\u0000"+
		"\u0000\u0708\u0707\u0001\u0000\u0000\u0000\u0709\u070b\u0001\u0000\u0000"+
		"\u0000\u070a\u0704\u0001\u0000\u0000\u0000\u070a\u070b\u0001\u0000\u0000"+
		"\u0000\u070b{\u0001\u0000\u0000\u0000\u070c\u0711\u0003z=\u0000\u070d"+
		"\u070e\u0005\u0003\u0000\u0000\u070e\u0710\u0003z=\u0000\u070f\u070d\u0001"+
		"\u0000\u0000\u0000\u0710\u0713\u0001\u0000\u0000\u0000\u0711\u070f\u0001"+
		"\u0000\u0000\u0000\u0711\u0712\u0001\u0000\u0000\u0000\u0712}\u0001\u0000"+
		"\u0000\u0000\u0713\u0711\u0001\u0000\u0000\u0000\u0714\u0715\u0003\u0080"+
		"@\u0000\u0715\u007f\u0001\u0000\u0000\u0000\u0716\u0717\u0006@\uffff\uffff"+
		"\u0000\u0717\u0718\u0005\u001e\u0000\u0000\u0718\u0721\u0003\u0080@\u0006"+
		"\u0719\u071a\u0005 \u0000\u0000\u071a\u071b\u0005\u0001\u0000\u0000\u071b"+
		"\u071c\u0003\u0016\u000b\u0000\u071c\u071d\u0005\u0002\u0000\u0000\u071d"+
		"\u0721\u0001\u0000\u0000\u0000\u071e\u0721\u0003\u0082A\u0000\u071f\u0721"+
		"\u0003\u0084B\u0000\u0720\u0716\u0001\u0000\u0000\u0000\u0720\u0719\u0001"+
		"\u0000\u0000\u0000\u0720\u071e\u0001\u0000\u0000\u0000\u0720\u071f\u0001"+
		"\u0000\u0000\u0000\u0721\u072a\u0001\u0000\u0000\u0000\u0722\u0723\n\u0002"+
		"\u0000\u0000\u0723\u0724\u0005\u001c\u0000\u0000\u0724\u0729\u0003\u0080"+
		"@\u0003\u0725\u0726\n\u0001\u0000\u0000\u0726\u0727\u0005\u001b\u0000"+
		"\u0000\u0727\u0729\u0003\u0080@\u0002\u0728\u0722\u0001\u0000\u0000\u0000"+
		"\u0728\u0725\u0001\u0000\u0000\u0000\u0729\u072c\u0001\u0000\u0000\u0000"+
		"\u072a\u0728\u0001\u0000\u0000\u0000\u072a\u072b\u0001\u0000\u0000\u0000"+
		"\u072b\u0081\u0001\u0000\u0000\u0000\u072c\u072a\u0001\u0000\u0000\u0000"+
		"\u072d\u072f\u0003\u008cF\u0000\u072e\u0730\u0003\u0086C\u0000\u072f\u072e"+
		"\u0001\u0000\u0000\u0000\u072f\u0730\u0001\u0000\u0000\u0000\u0730\u0083"+
		"\u0001\u0000\u0000\u0000\u0731\u0732\u0003\u0088D\u0000\u0732\u0733\u0005"+
		"z\u0000\u0000\u0733\u0734\u0005\u0001\u0000\u0000\u0734\u0735\u0005y\u0000"+
		"\u0000\u0735\u0736\u0003\u008aE\u0000\u0736\u0737\u0005\u0003\u0000\u0000"+
		"\u0737\u0738\u0003\u008cF\u0000\u0738\u0739\u0005\u0002\u0000\u0000\u0739"+
		"\u0085\u0001\u0000\u0000\u0000\u073a\u073c\u0005\u001e\u0000\u0000\u073b"+
		"\u073a\u0001\u0000\u0000\u0000\u073b\u073c\u0001\u0000\u0000\u0000\u073c"+
		"\u073d\u0001\u0000\u0000\u0000\u073d\u073e\u0005!\u0000\u0000\u073e\u073f"+
		"\u0003\u008cF\u0000\u073f\u0740\u0005\u001c\u0000\u0000\u0740\u0741\u0003"+
		"\u008cF\u0000\u0741\u0764\u0001\u0000\u0000\u0000\u0742\u0744\u0005\u001e"+
		"\u0000\u0000\u0743\u0742\u0001\u0000\u0000\u0000\u0743\u0744\u0001\u0000"+
		"\u0000\u0000\u0744\u0745\u0001\u0000\u0000\u0000\u0745\u0746\u0005\u001d"+
		"\u0000\u0000\u0746\u0747\u0005\u0001\u0000\u0000\u0747\u074c\u0003~?\u0000"+
		"\u0748\u0749\u0005\u0003\u0000\u0000\u0749\u074b\u0003~?\u0000\u074a\u0748"+
		"\u0001\u0000\u0000\u0000\u074b\u074e\u0001\u0000\u0000\u0000\u074c\u074a"+
		"\u0001\u0000\u0000\u0000\u074c\u074d\u0001\u0000\u0000\u0000\u074d\u074f"+
		"\u0001\u0000\u0000\u0000\u074e\u074c\u0001\u0000\u0000\u0000\u074f\u0750"+
		"\u0005\u0002\u0000\u0000\u0750\u0764\u0001\u0000\u0000\u0000\u0751\u0753"+
		"\u0005\u001e\u0000\u0000\u0752\u0751\u0001\u0000\u0000\u0000\u0752\u0753"+
		"\u0001\u0000\u0000\u0000\u0753\u0754\u0001\u0000\u0000\u0000\u0754\u0755"+
		"\u0005\u001d\u0000\u0000\u0755\u0756\u0005\u0001\u0000\u0000\u0756\u0757"+
		"\u0003\u0016\u000b\u0000\u0757\u0758\u0005\u0002\u0000\u0000\u0758\u0764"+
		"\u0001\u0000\u0000\u0000\u0759\u075b\u0005\u001e\u0000\u0000\u075a\u0759"+
		"\u0001\u0000\u0000\u0000\u075a\u075b\u0001\u0000\u0000\u0000\u075b\u075c"+
		"\u0001\u0000\u0000\u0000\u075c\u075d\u0007\f\u0000\u0000\u075d\u0764\u0003"+
		"\u008cF\u0000\u075e\u0760\u0005$\u0000\u0000\u075f\u0761\u0005\u001e\u0000"+
		"\u0000\u0760\u075f\u0001\u0000\u0000\u0000\u0760\u0761\u0001\u0000\u0000"+
		"\u0000\u0761\u0762\u0001\u0000\u0000\u0000\u0762\u0764\u0005%\u0000\u0000"+
		"\u0763\u073b\u0001\u0000\u0000\u0000\u0763\u0743\u0001\u0000\u0000\u0000"+
		"\u0763\u0752\u0001\u0000\u0000\u0000\u0763\u075a\u0001\u0000\u0000\u0000"+
		"\u0763\u075e\u0001\u0000\u0000\u0000\u0764\u0087\u0001\u0000\u0000\u0000"+
		"\u0765\u0766\u0005\u0001\u0000\u0000\u0766\u076b\u0003~?\u0000\u0767\u0768"+
		"\u0005\u0003\u0000\u0000\u0768\u076a\u0003~?\u0000\u0769\u0767\u0001\u0000"+
		"\u0000\u0000\u076a\u076d\u0001\u0000\u0000\u0000\u076b\u0769\u0001\u0000"+
		"\u0000\u0000\u076b\u076c\u0001\u0000\u0000\u0000\u076c\u076e\u0001\u0000"+
		"\u0000\u0000\u076d\u076b\u0001\u0000\u0000\u0000\u076e\u076f\u0005\u0002"+
		"\u0000\u0000\u076f\u0089\u0001\u0000\u0000\u0000\u0770\u0771\u0005\u0001"+
		"\u0000\u0000\u0771\u0776\u0003~?\u0000\u0772\u0773\u0005\u0003\u0000\u0000"+
		"\u0773\u0775\u0003~?\u0000\u0774\u0772\u0001\u0000\u0000\u0000\u0775\u0778"+
		"\u0001\u0000\u0000\u0000\u0776\u0774\u0001\u0000\u0000\u0000\u0776\u0777"+
		"\u0001\u0000\u0000\u0000\u0777\u0779\u0001\u0000\u0000\u0000\u0778\u0776"+
		"\u0001\u0000\u0000\u0000\u0779\u077a\u0005\u0002\u0000\u0000\u077a\u008b"+
		"\u0001\u0000\u0000\u0000\u077b\u077c\u0006F\uffff\uffff\u0000\u077c\u0780"+
		"\u0003\u008eG\u0000\u077d\u077e\u0007\r\u0000\u0000\u077e\u0780\u0003"+
		"\u008cF\u0007\u077f\u077b\u0001\u0000\u0000\u0000\u077f\u077d\u0001\u0000"+
		"\u0000\u0000\u0780\u0796\u0001\u0000\u0000\u0000\u0781\u0782\n\u0006\u0000"+
		"\u0000\u0782\u0783\u0007\u000e\u0000\u0000\u0783\u0795\u0003\u008cF\u0007"+
		"\u0784\u0785\n\u0005\u0000\u0000\u0785\u0786\u0007\u000f\u0000\u0000\u0786"+
		"\u0795\u0003\u008cF\u0006\u0787\u0788\n\u0004\u0000\u0000\u0788\u0789"+
		"\u0005\u008b\u0000\u0000\u0789\u0795\u0003\u008cF\u0005\u078a\u078b\n"+
		"\u0003\u0000\u0000\u078b\u078c\u0005\u008d\u0000\u0000\u078c\u0795\u0003"+
		"\u008cF\u0004\u078d\u078e\n\u0002\u0000\u0000\u078e\u078f\u0005\u008c"+
		"\u0000\u0000\u078f\u0795\u0003\u008cF\u0003\u0790\u0791\n\u0001\u0000"+
		"\u0000\u0791\u0792\u0003\u0092I\u0000\u0792\u0793\u0003\u008cF\u0002\u0793"+
		"\u0795\u0001\u0000\u0000\u0000\u0794\u0781\u0001\u0000\u0000\u0000\u0794"+
		"\u0784\u0001\u0000\u0000\u0000\u0794\u0787\u0001\u0000\u0000\u0000\u0794"+
		"\u078a\u0001\u0000\u0000\u0000\u0794\u078d\u0001\u0000\u0000\u0000\u0794"+
		"\u0790\u0001\u0000\u0000\u0000\u0795\u0798\u0001\u0000\u0000\u0000\u0796"+
		"\u0794\u0001\u0000\u0000\u0000\u0796\u0797\u0001\u0000\u0000\u0000\u0797"+
		"\u008d\u0001\u0000\u0000\u0000\u0798\u0796\u0001\u0000\u0000\u0000\u0799"+
		"\u079a\u0006G\uffff\uffff\u0000\u079a\u079c\u0005-\u0000\u0000\u079b\u079d"+
		"\u0003\u00acV\u0000\u079c\u079b\u0001\u0000\u0000\u0000\u079d\u079e\u0001"+
		"\u0000\u0000\u0000\u079e\u079c\u0001\u0000\u0000\u0000\u079e\u079f\u0001"+
		"\u0000\u0000\u0000\u079f\u07a2\u0001\u0000\u0000\u0000\u07a0\u07a1\u0005"+
		"0\u0000\u0000\u07a1\u07a3\u0003~?\u0000\u07a2\u07a0\u0001\u0000\u0000"+
		"\u0000\u07a2\u07a3\u0001\u0000\u0000\u0000\u07a3\u07a4\u0001\u0000\u0000"+
		"\u0000\u07a4\u07a5\u00051\u0000\u0000\u07a5\u0807\u0001\u0000\u0000\u0000"+
		"\u07a6\u07a7\u0005-\u0000\u0000\u07a7\u07a9\u0003~?\u0000\u07a8\u07aa"+
		"\u0003\u00acV\u0000\u07a9\u07a8\u0001\u0000\u0000\u0000\u07aa\u07ab\u0001"+
		"\u0000\u0000\u0000\u07ab\u07a9\u0001\u0000\u0000\u0000\u07ab\u07ac\u0001"+
		"\u0000\u0000\u0000\u07ac\u07af\u0001\u0000\u0000\u0000\u07ad\u07ae\u0005"+
		"0\u0000\u0000\u07ae\u07b0\u0003~?\u0000\u07af\u07ad\u0001\u0000\u0000"+
		"\u0000\u07af\u07b0\u0001\u0000\u0000\u0000\u07b0\u07b1\u0001\u0000\u0000"+
		"\u0000\u07b1\u07b2\u00051\u0000\u0000\u07b2\u0807\u0001\u0000\u0000\u0000"+
		"\u07b3\u07b4\u0005Y\u0000\u0000\u07b4\u07b5\u0005\u0001\u0000\u0000\u07b5"+
		"\u07b6\u0003~?\u0000\u07b6\u07b7\u0005\r\u0000\u0000\u07b7\u07b8\u0003"+
		"\u00a2Q\u0000\u07b8\u07b9\u0005\u0002\u0000\u0000\u07b9\u0807\u0001\u0000"+
		"\u0000\u0000\u07ba\u07bb\u0005m\u0000\u0000\u07bb\u07c4\u0005\u0001\u0000"+
		"\u0000\u07bc\u07c1\u0003z=\u0000\u07bd\u07be\u0005\u0003\u0000\u0000\u07be"+
		"\u07c0\u0003z=\u0000\u07bf\u07bd\u0001\u0000\u0000\u0000\u07c0\u07c3\u0001"+
		"\u0000\u0000\u0000\u07c1\u07bf\u0001\u0000\u0000\u0000\u07c1\u07c2\u0001"+
		"\u0000\u0000\u0000\u07c2\u07c5\u0001\u0000\u0000\u0000\u07c3\u07c1\u0001"+
		"\u0000\u0000\u0000\u07c4\u07bc\u0001\u0000\u0000\u0000\u07c4\u07c5\u0001"+
		"\u0000\u0000\u0000\u07c5\u07c6\u0001\u0000\u0000\u0000\u07c6\u0807\u0005"+
		"\u0002\u0000\u0000\u07c7\u07c8\u0005F\u0000\u0000\u07c8\u07c9\u0005\u0001"+
		"\u0000\u0000\u07c9\u07cc\u0003~?\u0000\u07ca\u07cb\u0005w\u0000\u0000"+
		"\u07cb\u07cd\u0005(\u0000\u0000\u07cc\u07ca\u0001\u0000\u0000\u0000\u07cc"+
		"\u07cd\u0001\u0000\u0000\u0000\u07cd\u07ce\u0001\u0000\u0000\u0000\u07ce"+
		"\u07cf\u0005\u0002\u0000\u0000\u07cf\u0807\u0001\u0000\u0000\u0000\u07d0"+
		"\u07d1\u0005H\u0000\u0000\u07d1\u07d2\u0005\u0001\u0000\u0000\u07d2\u07d5"+
		"\u0003~?\u0000\u07d3\u07d4\u0005w\u0000\u0000\u07d4\u07d6\u0005(\u0000"+
		"\u0000\u07d5\u07d3\u0001\u0000\u0000\u0000\u07d5\u07d6\u0001\u0000\u0000"+
		"\u0000\u07d6\u07d7\u0001\u0000\u0000\u0000\u07d7\u07d8\u0005\u0002\u0000"+
		"\u0000\u07d8\u0807\u0001\u0000\u0000\u0000\u07d9\u0807\u0003\u0090H\u0000"+
		"\u07da\u0807\u0005\u0086\u0000\u0000\u07db\u07dc\u0003\u00b8\\\u0000\u07dc"+
		"\u07dd\u0005\u0004\u0000\u0000\u07dd\u07de\u0005\u0086\u0000\u0000\u07de"+
		"\u0807\u0001\u0000\u0000\u0000\u07df\u07e0\u0005\u0001\u0000\u0000\u07e0"+
		"\u07e3\u0003z=\u0000\u07e1\u07e2\u0005\u0003\u0000\u0000\u07e2\u07e4\u0003"+
		"z=\u0000\u07e3\u07e1\u0001\u0000\u0000\u0000\u07e4\u07e5\u0001\u0000\u0000"+
		"\u0000\u07e5\u07e3\u0001\u0000\u0000\u0000\u07e5\u07e6\u0001\u0000\u0000"+
		"\u0000\u07e6\u07e7\u0001\u0000\u0000\u0000\u07e7\u07e8\u0005\u0002\u0000"+
		"\u0000\u07e8\u0807\u0001\u0000\u0000\u0000\u07e9\u07ea\u0005\u0001\u0000"+
		"\u0000\u07ea\u07eb\u0003\u0016\u000b\u0000\u07eb\u07ec\u0005\u0002\u0000"+
		"\u0000\u07ec\u0807\u0001\u0000\u0000\u0000\u07ed\u07ee\u0003\u00b8\\\u0000"+
		"\u07ee\u07fa\u0005\u0001\u0000\u0000\u07ef\u07f1\u0003X,\u0000\u07f0\u07ef"+
		"\u0001\u0000\u0000\u0000\u07f0\u07f1\u0001\u0000\u0000\u0000\u07f1\u07f2"+
		"\u0001\u0000\u0000\u0000\u07f2\u07f7\u0003~?\u0000\u07f3\u07f4\u0005\u0003"+
		"\u0000\u0000\u07f4\u07f6\u0003~?\u0000\u07f5\u07f3\u0001\u0000\u0000\u0000"+
		"\u07f6\u07f9\u0001\u0000\u0000\u0000\u07f7\u07f5\u0001\u0000\u0000\u0000"+
		"\u07f7\u07f8\u0001\u0000\u0000\u0000\u07f8\u07fb\u0001\u0000\u0000\u0000"+
		"\u07f9\u07f7\u0001\u0000\u0000\u0000\u07fa\u07f0\u0001\u0000\u0000\u0000"+
		"\u07fa\u07fb\u0001\u0000\u0000\u0000\u07fb\u07fc\u0001\u0000\u0000\u0000"+
		"\u07fc\u07ff\u0005\u0002\u0000\u0000\u07fd\u07fe\u0005>\u0000\u0000\u07fe"+
		"\u0800\u0003\u00b2Y\u0000\u07ff\u07fd\u0001\u0000\u0000\u0000\u07ff\u0800"+
		"\u0001\u0000\u0000\u0000\u0800\u0807\u0001\u0000\u0000\u0000\u0801\u0807"+
		"\u0003\u00ba]\u0000\u0802\u0803\u0005\u0001\u0000\u0000\u0803\u0804\u0003"+
		"~?\u0000\u0804\u0805\u0005\u0002\u0000\u0000\u0805\u0807\u0001\u0000\u0000"+
		"\u0000\u0806\u0799\u0001\u0000\u0000\u0000\u0806\u07a6\u0001\u0000\u0000"+
		"\u0000\u0806\u07b3\u0001\u0000\u0000\u0000\u0806\u07ba\u0001\u0000\u0000"+
		"\u0000\u0806\u07c7\u0001\u0000\u0000\u0000\u0806\u07d0\u0001\u0000\u0000"+
		"\u0000\u0806\u07d9\u0001\u0000\u0000\u0000\u0806\u07da\u0001\u0000\u0000"+
		"\u0000\u0806\u07db\u0001\u0000\u0000\u0000\u0806\u07df\u0001\u0000\u0000"+
		"\u0000\u0806\u07e9\u0001\u0000\u0000\u0000\u0806\u07ed\u0001\u0000\u0000"+
		"\u0000\u0806\u0801\u0001\u0000\u0000\u0000\u0806\u0802\u0001\u0000\u0000"+
		"\u0000\u0807\u0812\u0001\u0000\u0000\u0000\u0808\u0809\n\u0004\u0000\u0000"+
		"\u0809\u080a\u0005\u0007\u0000\u0000\u080a\u080b\u0003\u008cF\u0000\u080b"+
		"\u080c\u0005\b\u0000\u0000\u080c\u0811\u0001\u0000\u0000\u0000\u080d\u080e"+
		"\n\u0002\u0000\u0000\u080e\u080f\u0005\u0004\u0000\u0000\u080f\u0811\u0003"+
		"\u00ba]\u0000\u0810\u0808\u0001\u0000\u0000\u0000\u0810\u080d\u0001\u0000"+
		"\u0000\u0000\u0811\u0814\u0001\u0000\u0000\u0000\u0812\u0810\u0001\u0000"+
		"\u0000\u0000\u0812\u0813\u0001\u0000\u0000\u0000\u0813\u008f\u0001\u0000"+
		"\u0000\u0000\u0814\u0812\u0001\u0000\u0000\u0000\u0815\u0822\u0005%\u0000"+
		"\u0000\u0816\u0822\u0003\u009aM\u0000\u0817\u0818\u0003\u00ba]\u0000\u0818"+
		"\u0819\u0005\u00e9\u0000\u0000\u0819\u0822\u0001\u0000\u0000\u0000\u081a"+
		"\u0822\u0003\u00c0`\u0000\u081b\u0822\u0003\u0098L\u0000\u081c\u081e\u0005"+
		"\u00e9\u0000\u0000\u081d\u081c\u0001\u0000\u0000\u0000\u081e\u081f\u0001"+
		"\u0000\u0000\u0000\u081f\u081d\u0001\u0000\u0000\u0000\u081f\u0820\u0001"+
		"\u0000\u0000\u0000\u0820\u0822\u0001\u0000\u0000\u0000\u0821\u0815\u0001"+
		"\u0000\u0000\u0000\u0821\u0816\u0001\u0000\u0000\u0000\u0821\u0817\u0001"+
		"\u0000\u0000\u0000\u0821\u081a\u0001\u0000\u0000\u0000\u0821\u081b\u0001"+
		"\u0000\u0000\u0000\u0821\u081d\u0001\u0000\u0000\u0000\u0822\u0091\u0001"+
		"\u0000\u0000\u0000\u0823\u0824\u0007\u0010\u0000\u0000\u0824\u0093\u0001"+
		"\u0000\u0000\u0000\u0825\u0826\u0007\u0011\u0000\u0000\u0826\u0095\u0001"+
		"\u0000\u0000\u0000\u0827\u0828\u0007\u0012\u0000\u0000\u0828\u0097\u0001"+
		"\u0000\u0000\u0000\u0829\u082a\u0007\u0013\u0000\u0000\u082a\u0099\u0001"+
		"\u0000\u0000\u0000\u082b\u082f\u0005,\u0000\u0000\u082c\u082e\u0003\u009c"+
		"N\u0000\u082d\u082c\u0001\u0000\u0000\u0000\u082e\u0831\u0001\u0000\u0000"+
		"\u0000\u082f\u082d\u0001\u0000\u0000\u0000\u082f\u0830\u0001\u0000\u0000"+
		"\u0000\u0830\u009b\u0001\u0000\u0000\u0000\u0831\u082f\u0001\u0000\u0000"+
		"\u0000\u0832\u0833\u0003\u009eO\u0000\u0833\u0836\u0003\u00ba]\u0000\u0834"+
		"\u0835\u0005f\u0000\u0000\u0835\u0837\u0003\u00ba]\u0000\u0836\u0834\u0001"+
		"\u0000\u0000\u0000\u0836\u0837\u0001\u0000\u0000\u0000\u0837\u009d\u0001"+
		"\u0000\u0000\u0000\u0838\u083a\u0007\u000f\u0000\u0000\u0839\u0838\u0001"+
		"\u0000\u0000\u0000\u0839\u083a\u0001\u0000\u0000\u0000\u083a\u083b\u0001"+
		"\u0000\u0000\u0000\u083b\u083e\u0007\u000b\u0000\u0000\u083c\u083e\u0005"+
		"\u00e9\u0000\u0000\u083d\u0839\u0001\u0000\u0000\u0000\u083d\u083c\u0001"+
		"\u0000\u0000\u0000\u083e\u009f\u0001\u0000\u0000\u0000\u083f\u0843\u0005"+
		"F\u0000\u0000\u0840\u0841\u0005G\u0000\u0000\u0841\u0843\u0003\u00ba]"+
		"\u0000\u0842\u083f\u0001\u0000\u0000\u0000\u0842\u0840\u0001\u0000\u0000"+
		"\u0000\u0843\u00a1\u0001\u0000\u0000\u0000\u0844\u0845\u0005k\u0000\u0000"+
		"\u0845\u0846\u0005\u0080\u0000\u0000\u0846\u0847\u0003\u00a2Q\u0000\u0847"+
		"\u0848\u0005\u0082\u0000\u0000\u0848\u0867\u0001\u0000\u0000\u0000\u0849"+
		"\u084a\u0005l\u0000\u0000\u084a\u084b\u0005\u0080\u0000\u0000\u084b\u084c"+
		"\u0003\u00a2Q\u0000\u084c\u084d\u0005\u0003\u0000\u0000\u084d\u084e\u0003"+
		"\u00a2Q\u0000\u084e\u084f\u0005\u0082\u0000\u0000\u084f\u0867\u0001\u0000"+
		"\u0000\u0000\u0850\u0857\u0005m\u0000\u0000\u0851\u0853\u0005\u0080\u0000"+
		"\u0000\u0852\u0854\u0003\u00a8T\u0000\u0853\u0852\u0001\u0000\u0000\u0000"+
		"\u0853\u0854\u0001\u0000\u0000\u0000\u0854\u0855\u0001\u0000\u0000\u0000"+
		"\u0855\u0858\u0005\u0082\u0000\u0000\u0856\u0858\u0005~\u0000\u0000\u0857"+
		"\u0851\u0001\u0000\u0000\u0000\u0857\u0856\u0001\u0000\u0000\u0000\u0858"+
		"\u0867\u0001\u0000\u0000\u0000\u0859\u0864\u0003\u00ba]\u0000\u085a\u085b"+
		"\u0005\u0001\u0000\u0000\u085b\u0860\u0005\u00ee\u0000\u0000\u085c\u085d"+
		"\u0005\u0003\u0000\u0000\u085d\u085f\u0005\u00ee\u0000\u0000\u085e\u085c"+
		"\u0001\u0000\u0000\u0000\u085f\u0862\u0001\u0000\u0000\u0000\u0860\u085e"+
		"\u0001\u0000\u0000\u0000\u0860\u0861\u0001\u0000\u0000\u0000\u0861\u0863"+
		"\u0001\u0000\u0000\u0000\u0862\u0860\u0001\u0000\u0000\u0000\u0863\u0865"+
		"\u0005\u0002\u0000\u0000\u0864\u085a\u0001\u0000\u0000\u0000\u0864\u0865"+
		"\u0001\u0000\u0000\u0000\u0865\u0867\u0001\u0000\u0000\u0000\u0866\u0844"+
		"\u0001\u0000\u0000\u0000\u0866\u0849\u0001\u0000\u0000\u0000\u0866\u0850"+
		"\u0001\u0000\u0000\u0000\u0866\u0859\u0001\u0000\u0000\u0000\u0867\u00a3"+
		"\u0001\u0000\u0000\u0000\u0868\u086d\u0003\u00a6S\u0000\u0869\u086a\u0005"+
		"\u0003\u0000\u0000\u086a\u086c\u0003\u00a6S\u0000\u086b\u0869\u0001\u0000"+
		"\u0000\u0000\u086c\u086f\u0001\u0000\u0000\u0000\u086d\u086b\u0001\u0000"+
		"\u0000\u0000\u086d\u086e\u0001\u0000\u0000\u0000\u086e\u00a5\u0001\u0000"+
		"\u0000\u0000\u086f\u086d\u0001\u0000\u0000\u0000\u0870\u0871\u0003\u00ba"+
		"]\u0000\u0871\u0874\u0003\u00a2Q\u0000\u0872\u0873\u0005n\u0000\u0000"+
		"\u0873\u0875\u0005\u00e9\u0000\u0000\u0874\u0872\u0001\u0000\u0000\u0000"+
		"\u0874\u0875\u0001\u0000\u0000\u0000\u0875\u00a7\u0001\u0000\u0000\u0000"+
		"\u0876\u087b\u0003\u00aaU\u0000\u0877\u0878\u0005\u0003\u0000\u0000\u0878"+
		"\u087a\u0003\u00aaU\u0000\u0879\u0877\u0001\u0000\u0000\u0000\u087a\u087d"+
		"\u0001\u0000\u0000\u0000\u087b\u0879\u0001\u0000\u0000\u0000\u087b\u087c"+
		"\u0001\u0000\u0000\u0000\u087c\u00a9\u0001\u0000\u0000\u0000\u087d\u087b"+
		"\u0001\u0000\u0000\u0000\u087e\u087f\u0003\u00ba]\u0000\u087f\u0880\u0005"+
		"\t\u0000\u0000\u0880\u0883\u0003\u00a2Q\u0000\u0881\u0882\u0005n\u0000"+
		"\u0000\u0882\u0884\u0005\u00e9\u0000\u0000\u0883\u0881\u0001\u0000\u0000"+
		"\u0000\u0883\u0884\u0001\u0000\u0000\u0000\u0884\u00ab\u0001\u0000\u0000"+
		"\u0000\u0885\u0886\u0005.\u0000\u0000\u0886\u0887\u0003~?\u0000\u0887"+
		"\u0888\u0005/\u0000\u0000\u0888\u0889\u0003~?\u0000\u0889\u00ad\u0001"+
		"\u0000\u0000\u0000\u088a\u088b\u0005=\u0000\u0000\u088b\u0890\u0003\u00b0"+
		"X\u0000\u088c\u088d\u0005\u0003\u0000\u0000\u088d\u088f\u0003\u00b0X\u0000"+
		"\u088e\u088c\u0001\u0000\u0000\u0000\u088f\u0892\u0001\u0000\u0000\u0000"+
		"\u0890\u088e\u0001\u0000\u0000\u0000\u0890\u0891\u0001\u0000\u0000\u0000"+
		"\u0891\u00af\u0001\u0000\u0000\u0000\u0892\u0890\u0001\u0000\u0000\u0000"+
		"\u0893\u0894\u0003\u00ba]\u0000\u0894\u0895\u0005\r\u0000\u0000\u0895"+
		"\u0896\u0003\u00b2Y\u0000\u0896\u00b1\u0001\u0000\u0000\u0000\u0897\u08c2"+
		"\u0003\u00ba]\u0000\u0898\u08bb\u0005\u0001\u0000\u0000\u0899\u089a\u0005"+
		"\u0093\u0000\u0000\u089a\u089b\u0005\u0012\u0000\u0000\u089b\u08a0\u0003"+
		"~?\u0000\u089c\u089d\u0005\u0003\u0000\u0000\u089d\u089f\u0003~?\u0000"+
		"\u089e\u089c\u0001\u0000\u0000\u0000\u089f\u08a2\u0001\u0000\u0000\u0000"+
		"\u08a0\u089e\u0001\u0000\u0000\u0000\u08a0\u08a1\u0001\u0000\u0000\u0000"+
		"\u08a1\u08bc\u0001\u0000\u0000\u0000\u08a2\u08a0\u0001\u0000\u0000\u0000"+
		"\u08a3\u08a4\u0007\u0014\u0000\u0000\u08a4\u08a5\u0005\u0012\u0000\u0000"+
		"\u08a5\u08aa\u0003~?\u0000\u08a6\u08a7\u0005\u0003\u0000\u0000\u08a7\u08a9"+
		"\u0003~?\u0000\u08a8\u08a6\u0001\u0000\u0000\u0000\u08a9\u08ac\u0001\u0000"+
		"\u0000\u0000\u08aa\u08a8\u0001\u0000\u0000\u0000\u08aa\u08ab\u0001\u0000"+
		"\u0000\u0000\u08ab\u08ae\u0001\u0000\u0000\u0000\u08ac\u08aa\u0001\u0000"+
		"\u0000\u0000\u08ad\u08a3\u0001\u0000\u0000\u0000\u08ad\u08ae\u0001\u0000"+
		"\u0000\u0000\u08ae\u08b9\u0001\u0000\u0000\u0000\u08af\u08b0\u0007\u0015"+
		"\u0000\u0000\u08b0\u08b1\u0005\u0012\u0000\u0000\u08b1\u08b6\u0003H$\u0000"+
		"\u08b2\u08b3\u0005\u0003\u0000\u0000\u08b3\u08b5\u0003H$\u0000\u08b4\u08b2"+
		"\u0001\u0000\u0000\u0000\u08b5\u08b8\u0001\u0000\u0000\u0000\u08b6\u08b4"+
		"\u0001\u0000\u0000\u0000\u08b6\u08b7\u0001\u0000\u0000\u0000\u08b7\u08ba"+
		"\u0001\u0000\u0000\u0000\u08b8\u08b6\u0001\u0000\u0000\u0000\u08b9\u08af"+
		"\u0001\u0000\u0000\u0000\u08b9\u08ba\u0001\u0000\u0000\u0000\u08ba\u08bc"+
		"\u0001\u0000\u0000\u0000\u08bb\u0899\u0001\u0000\u0000\u0000\u08bb\u08ad"+
		"\u0001\u0000\u0000\u0000\u08bc\u08be\u0001\u0000\u0000\u0000\u08bd\u08bf"+
		"\u0003\u00b4Z\u0000\u08be\u08bd\u0001\u0000\u0000\u0000\u08be\u08bf\u0001"+
		"\u0000\u0000\u0000\u08bf\u08c0\u0001\u0000\u0000\u0000\u08c0\u08c2\u0005"+
		"\u0002\u0000\u0000\u08c1\u0897\u0001\u0000\u0000\u0000\u08c1\u0898\u0001"+
		"\u0000\u0000\u0000\u08c2\u00b3\u0001\u0000\u0000\u0000\u08c3\u08c4\u0005"+
		"@\u0000\u0000\u08c4\u08d4\u0003\u00b6[\u0000\u08c5\u08c6\u0005A\u0000"+
		"\u0000\u08c6\u08d4\u0003\u00b6[\u0000\u08c7\u08c8\u0005@\u0000\u0000\u08c8"+
		"\u08c9\u0005!\u0000\u0000\u08c9\u08ca\u0003\u00b6[\u0000\u08ca\u08cb\u0005"+
		"\u001c\u0000\u0000\u08cb\u08cc\u0003\u00b6[\u0000\u08cc\u08d4\u0001\u0000"+
		"\u0000\u0000\u08cd\u08ce\u0005A\u0000\u0000\u08ce\u08cf\u0005!\u0000\u0000"+
		"\u08cf\u08d0\u0003\u00b6[\u0000\u08d0\u08d1\u0005\u001c\u0000\u0000\u08d1"+
		"\u08d2\u0003\u00b6[\u0000\u08d2\u08d4\u0001\u0000\u0000\u0000\u08d3\u08c3"+
		"\u0001\u0000\u0000\u0000\u08d3\u08c5\u0001\u0000\u0000\u0000\u08d3\u08c7"+
		"\u0001\u0000\u0000\u0000\u08d3\u08cd\u0001\u0000\u0000\u0000\u08d4\u00b5"+
		"\u0001\u0000\u0000\u0000\u08d5\u08d6\u0005B\u0000\u0000\u08d6\u08dd\u0007"+
		"\u0016\u0000\u0000\u08d7\u08d8\u0005E\u0000\u0000\u08d8\u08dd\u0005I\u0000"+
		"\u0000\u08d9\u08da\u0003~?\u0000\u08da\u08db\u0007\u0016\u0000\u0000\u08db"+
		"\u08dd\u0001\u0000\u0000\u0000\u08dc\u08d5\u0001\u0000\u0000\u0000\u08dc"+
		"\u08d7\u0001\u0000\u0000\u0000\u08dc\u08d9\u0001\u0000\u0000\u0000\u08dd"+
		"\u00b7\u0001\u0000\u0000\u0000\u08de\u08e3\u0003\u00ba]\u0000\u08df\u08e0"+
		"\u0005\u0004\u0000\u0000\u08e0\u08e2\u0003\u00ba]\u0000\u08e1\u08df\u0001"+
		"\u0000\u0000\u0000\u08e2\u08e5\u0001\u0000\u0000\u0000\u08e3\u08e1\u0001"+
		"\u0000\u0000\u0000\u08e3\u08e4\u0001\u0000\u0000\u0000\u08e4\u00b9\u0001"+
		"\u0000\u0000\u0000\u08e5\u08e3\u0001\u0000\u0000\u0000\u08e6\u08f7\u0003"+
		"\u00bc^\u0000\u08e7\u08f7\u0005\u00e6\u0000\u0000\u08e8\u08f7\u00059\u0000"+
		"\u0000\u08e9\u08f7\u00055\u0000\u0000\u08ea\u08f7\u00056\u0000\u0000\u08eb"+
		"\u08f7\u00057\u0000\u0000\u08ec\u08f7\u00058\u0000\u0000\u08ed\u08f7\u0005"+
		":\u0000\u0000\u08ee\u08f7\u00052\u0000\u0000\u08ef\u08f7\u00053\u0000"+
		"\u0000\u08f0\u08f7\u0005;\u0000\u0000\u08f1\u08f7\u0005x\u0000\u0000\u08f2"+
		"\u08f7\u0005b\u0000\u0000\u08f3\u08f7\u0005e\u0000\u0000\u08f4\u08f7\u0005"+
		"c\u0000\u0000\u08f5\u08f7\u0005d\u0000\u0000\u08f6\u08e6\u0001\u0000\u0000"+
		"\u0000\u08f6\u08e7\u0001\u0000\u0000\u0000\u08f6\u08e8\u0001\u0000\u0000"+
		"\u0000\u08f6\u08e9\u0001\u0000\u0000\u0000\u08f6\u08ea\u0001\u0000\u0000"+
		"\u0000\u08f6\u08eb\u0001\u0000\u0000\u0000\u08f6\u08ec\u0001\u0000\u0000"+
		"\u0000\u08f6\u08ed\u0001\u0000\u0000\u0000\u08f6\u08ee\u0001\u0000\u0000"+
		"\u0000\u08f6\u08ef\u0001\u0000\u0000\u0000\u08f6\u08f0\u0001\u0000\u0000"+
		"\u0000\u08f6\u08f1\u0001\u0000\u0000\u0000\u08f6\u08f2\u0001\u0000\u0000"+
		"\u0000\u08f6\u08f3\u0001\u0000\u0000\u0000\u08f6\u08f4\u0001\u0000\u0000"+
		"\u0000\u08f6\u08f5\u0001\u0000\u0000\u0000\u08f7\u00bb\u0001\u0000\u0000"+
		"\u0000\u08f8\u08fc\u0005\u00f2\u0000\u0000\u08f9\u08fc\u0003\u00be_\u0000"+
		"\u08fa\u08fc\u0003\u00c2a\u0000\u08fb\u08f8\u0001\u0000\u0000\u0000\u08fb"+
		"\u08f9\u0001\u0000\u0000\u0000\u08fb\u08fa\u0001\u0000\u0000\u0000\u08fc"+
		"\u00bd\u0001\u0000\u0000\u0000\u08fd\u08fe\u0005\u00f3\u0000\u0000\u08fe"+
		"\u00bf\u0001\u0000\u0000\u0000\u08ff\u0901\u0005\u0085\u0000\u0000\u0900"+
		"\u08ff\u0001\u0000\u0000\u0000\u0900\u0901\u0001\u0000\u0000\u0000\u0901"+
		"\u0902\u0001\u0000\u0000\u0000\u0902\u091c\u0005\u00ef\u0000\u0000\u0903"+
		"\u0905\u0005\u0085\u0000\u0000\u0904\u0903\u0001\u0000\u0000\u0000\u0904"+
		"\u0905\u0001\u0000\u0000\u0000\u0905\u0906\u0001\u0000\u0000\u0000\u0906"+
		"\u091c\u0005\u00ee\u0000\u0000\u0907\u0909\u0005\u0085\u0000\u0000\u0908"+
		"\u0907\u0001\u0000\u0000\u0000\u0908\u0909\u0001\u0000\u0000\u0000\u0909"+
		"\u090a\u0001\u0000\u0000\u0000\u090a\u091c\u0005\u00ea\u0000\u0000\u090b"+
		"\u090d\u0005\u0085\u0000\u0000\u090c\u090b\u0001\u0000\u0000\u0000\u090c"+
		"\u090d\u0001\u0000\u0000\u0000\u090d\u090e\u0001\u0000\u0000\u0000\u090e"+
		"\u091c\u0005\u00eb\u0000\u0000\u090f\u0911\u0005\u0085\u0000\u0000\u0910"+
		"\u090f\u0001\u0000\u0000\u0000\u0910\u0911\u0001\u0000\u0000\u0000\u0911"+
		"\u0912\u0001\u0000\u0000\u0000\u0912\u091c\u0005\u00ec\u0000\u0000\u0913"+
		"\u0915\u0005\u0085\u0000\u0000\u0914\u0913\u0001\u0000\u0000\u0000\u0914"+
		"\u0915\u0001\u0000\u0000\u0000\u0915\u0916\u0001\u0000\u0000\u0000\u0916"+
		"\u091c\u0005\u00f0\u0000\u0000\u0917\u0919\u0005\u0085\u0000\u0000\u0918"+
		"\u0917\u0001\u0000\u0000\u0000\u0918\u0919\u0001\u0000\u0000\u0000\u0919"+
		"\u091a\u0001\u0000\u0000\u0000\u091a\u091c\u0005\u00f1\u0000\u0000\u091b"+
		"\u0900\u0001\u0000\u0000\u0000\u091b\u0904\u0001\u0000\u0000\u0000\u091b"+
		"\u0908\u0001\u0000\u0000\u0000\u091b\u090c\u0001\u0000\u0000\u0000\u091b"+
		"\u0910\u0001\u0000\u0000\u0000\u091b\u0914\u0001\u0000\u0000\u0000\u091b"+
		"\u0918\u0001\u0000\u0000\u0000\u091c\u00c1\u0001\u0000\u0000\u0000\u091d"+
		"\u091e\u0007\u0017\u0000\u0000\u091e\u00c3\u0001\u0000\u0000\u0000\u013f"+
		"\u00db\u00e0\u00e3\u00e8\u00f5\u00f9\u0100\u0105\u010a\u010d\u0110\u0114"+
		"\u0117\u011a\u0121\u0125\u012d\u0130\u0133\u0136\u0139\u013c\u0140\u0143"+
		"\u0146\u014d\u0153\u0159\u0161\u0181\u0189\u018d\u0192\u0198\u01a0\u01a6"+
		"\u01b3\u01b8\u01c1\u01c6\u01d6\u01dd\u01e1\u01e9\u01f0\u01f7\u0206\u020a"+
		"\u0210\u0216\u0219\u021c\u0222\u0226\u022a\u022f\u0233\u023b\u023e\u0247"+
		"\u024c\u0252\u0258\u0264\u0267\u026b\u0270\u0275\u027c\u027f\u0282\u0289"+
		"\u028e\u0294\u029d\u02a5\u02ab\u02af\u02b3\u02b7\u02b9\u02c2\u02c8\u02cd"+
		"\u02d0\u02d4\u02d7\u02e0\u02e5\u02ea\u02ed\u02f3\u02fb\u0300\u0306\u030c"+
		"\u0317\u031f\u0326\u032e\u0331\u0339\u033d\u0344\u03b8\u03c0\u03c8\u03d1"+
		"\u03dd\u03e1\u03e4\u03ea\u03f4\u0400\u0405\u040b\u0417\u0419\u041e\u0422"+
		"\u0424\u0428\u0431\u0439\u0440\u0446\u044a\u0453\u0458\u0467\u046e\u0471"+
		"\u0478\u047c\u0482\u048a\u0495\u04a0\u04a7\u04ad\u04b3\u04bc\u04be\u04c7"+
		"\u04ca\u04d3\u04d6\u04df\u04e2\u04eb\u04ee\u04f1\u04f5\u04f8\u0503\u0508"+
		"\u0513\u0517\u051b\u0527\u052a\u052e\u0538\u053c\u053e\u0541\u0545\u0548"+
		"\u054c\u0552\u0556\u055a\u055f\u0562\u0564\u0569\u056e\u0571\u0575\u0578"+
		"\u057a\u057f\u0584\u0591\u0596\u059e\u05a4\u05ae\u05bd\u05c2\u05ca\u05cd";
	private static final String _serializedATNSegment1 =
		"\u05d1\u05d6\u05df\u05e2\u05e7\u05ee\u05f1\u05f9\u0600\u0607\u060a\u060f"+
		"\u0615\u0619\u061c\u0620\u062b\u0632\u0634\u0649\u064b\u064d\u065a\u0663"+
		"\u066a\u0672\u067a\u067e\u0681\u0684\u068a\u068d\u0690\u0696\u0699\u069c"+
		"\u06a6\u06a9\u06ad\u06b5\u06b9\u06bd\u06bf\u06c8\u06d4\u06d6\u06dd\u06e4"+
		"\u06ea\u06f0\u06f2\u06f7\u06fe\u0704\u0708\u070a\u0711\u0720\u0728\u072a"+
		"\u072f\u073b\u0743\u074c\u0752\u075a\u0760\u0763\u076b\u0776\u077f\u0794"+
		"\u0796\u079e\u07a2\u07ab\u07af\u07c1\u07c4\u07cc\u07d5\u07e5\u07f0\u07f7"+
		"\u07fa\u07ff\u0806\u0810\u0812\u081f\u0821\u082f\u0836\u0839\u083d\u0842"+
		"\u0853\u0857\u0860\u0864\u0866\u086d\u0874\u087b\u0883\u0890\u08a0\u08aa"+
		"\u08ad\u08b6\u08b9\u08bb\u08be\u08c1\u08d3\u08dc\u08e3\u08f6\u08fb\u0900"+
		"\u0904\u0908\u090c\u0910\u0914\u0918\u091b";
	public static final String _serializedATN = Utils.join(
		new String[] {
			_serializedATNSegment0,
			_serializedATNSegment1
		},
		""
	);
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
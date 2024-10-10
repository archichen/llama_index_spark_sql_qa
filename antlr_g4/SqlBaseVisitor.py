# Generated from ./SqlBase.g4 by ANTLR 4.13.2
from antlr4 import *
if "." in __name__:
    from .SqlBaseParser import SqlBaseParser
else:
    from SqlBaseParser import SqlBaseParser

# This class defines a complete generic visitor for a parse tree produced by SqlBaseParser.

class SqlBaseVisitor(ParseTreeVisitor):

    # Visit a parse tree produced by SqlBaseParser#singleStatement.
    def visitSingleStatement(self, ctx:SqlBaseParser.SingleStatementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlBaseParser#singleExpression.
    def visitSingleExpression(self, ctx:SqlBaseParser.SingleExpressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlBaseParser#singleTableIdentifier.
    def visitSingleTableIdentifier(self, ctx:SqlBaseParser.SingleTableIdentifierContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlBaseParser#singleFunctionIdentifier.
    def visitSingleFunctionIdentifier(self, ctx:SqlBaseParser.SingleFunctionIdentifierContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlBaseParser#singleDataType.
    def visitSingleDataType(self, ctx:SqlBaseParser.SingleDataTypeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlBaseParser#statementDefault.
    def visitStatementDefault(self, ctx:SqlBaseParser.StatementDefaultContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlBaseParser#use.
    def visitUse(self, ctx:SqlBaseParser.UseContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlBaseParser#createDatabase.
    def visitCreateDatabase(self, ctx:SqlBaseParser.CreateDatabaseContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlBaseParser#setDatabaseProperties.
    def visitSetDatabaseProperties(self, ctx:SqlBaseParser.SetDatabasePropertiesContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlBaseParser#dropDatabase.
    def visitDropDatabase(self, ctx:SqlBaseParser.DropDatabaseContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlBaseParser#createTable.
    def visitCreateTable(self, ctx:SqlBaseParser.CreateTableContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlBaseParser#createHiveTable.
    def visitCreateHiveTable(self, ctx:SqlBaseParser.CreateHiveTableContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlBaseParser#createTableLike.
    def visitCreateTableLike(self, ctx:SqlBaseParser.CreateTableLikeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlBaseParser#analyze.
    def visitAnalyze(self, ctx:SqlBaseParser.AnalyzeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlBaseParser#addTableColumns.
    def visitAddTableColumns(self, ctx:SqlBaseParser.AddTableColumnsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlBaseParser#renameTable.
    def visitRenameTable(self, ctx:SqlBaseParser.RenameTableContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlBaseParser#setTableProperties.
    def visitSetTableProperties(self, ctx:SqlBaseParser.SetTablePropertiesContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlBaseParser#unsetTableProperties.
    def visitUnsetTableProperties(self, ctx:SqlBaseParser.UnsetTablePropertiesContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlBaseParser#changeColumn.
    def visitChangeColumn(self, ctx:SqlBaseParser.ChangeColumnContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlBaseParser#setTableSerDe.
    def visitSetTableSerDe(self, ctx:SqlBaseParser.SetTableSerDeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlBaseParser#addTablePartition.
    def visitAddTablePartition(self, ctx:SqlBaseParser.AddTablePartitionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlBaseParser#renameTablePartition.
    def visitRenameTablePartition(self, ctx:SqlBaseParser.RenameTablePartitionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlBaseParser#dropTablePartitions.
    def visitDropTablePartitions(self, ctx:SqlBaseParser.DropTablePartitionsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlBaseParser#setTableLocation.
    def visitSetTableLocation(self, ctx:SqlBaseParser.SetTableLocationContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlBaseParser#recoverPartitions.
    def visitRecoverPartitions(self, ctx:SqlBaseParser.RecoverPartitionsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlBaseParser#dropTable.
    def visitDropTable(self, ctx:SqlBaseParser.DropTableContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlBaseParser#createView.
    def visitCreateView(self, ctx:SqlBaseParser.CreateViewContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlBaseParser#createTempViewUsing.
    def visitCreateTempViewUsing(self, ctx:SqlBaseParser.CreateTempViewUsingContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlBaseParser#alterViewQuery.
    def visitAlterViewQuery(self, ctx:SqlBaseParser.AlterViewQueryContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlBaseParser#createFunction.
    def visitCreateFunction(self, ctx:SqlBaseParser.CreateFunctionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlBaseParser#dropFunction.
    def visitDropFunction(self, ctx:SqlBaseParser.DropFunctionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlBaseParser#explain.
    def visitExplain(self, ctx:SqlBaseParser.ExplainContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlBaseParser#showTables.
    def visitShowTables(self, ctx:SqlBaseParser.ShowTablesContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlBaseParser#showTable.
    def visitShowTable(self, ctx:SqlBaseParser.ShowTableContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlBaseParser#showDatabases.
    def visitShowDatabases(self, ctx:SqlBaseParser.ShowDatabasesContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlBaseParser#showTblProperties.
    def visitShowTblProperties(self, ctx:SqlBaseParser.ShowTblPropertiesContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlBaseParser#showColumns.
    def visitShowColumns(self, ctx:SqlBaseParser.ShowColumnsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlBaseParser#showPartitions.
    def visitShowPartitions(self, ctx:SqlBaseParser.ShowPartitionsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlBaseParser#showFunctions.
    def visitShowFunctions(self, ctx:SqlBaseParser.ShowFunctionsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlBaseParser#showCreateTable.
    def visitShowCreateTable(self, ctx:SqlBaseParser.ShowCreateTableContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlBaseParser#describeFunction.
    def visitDescribeFunction(self, ctx:SqlBaseParser.DescribeFunctionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlBaseParser#describeDatabase.
    def visitDescribeDatabase(self, ctx:SqlBaseParser.DescribeDatabaseContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlBaseParser#describeTable.
    def visitDescribeTable(self, ctx:SqlBaseParser.DescribeTableContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlBaseParser#refreshTable.
    def visitRefreshTable(self, ctx:SqlBaseParser.RefreshTableContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlBaseParser#refreshResource.
    def visitRefreshResource(self, ctx:SqlBaseParser.RefreshResourceContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlBaseParser#cacheTable.
    def visitCacheTable(self, ctx:SqlBaseParser.CacheTableContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlBaseParser#uncacheTable.
    def visitUncacheTable(self, ctx:SqlBaseParser.UncacheTableContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlBaseParser#clearCache.
    def visitClearCache(self, ctx:SqlBaseParser.ClearCacheContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlBaseParser#loadData.
    def visitLoadData(self, ctx:SqlBaseParser.LoadDataContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlBaseParser#truncateTable.
    def visitTruncateTable(self, ctx:SqlBaseParser.TruncateTableContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlBaseParser#repairTable.
    def visitRepairTable(self, ctx:SqlBaseParser.RepairTableContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlBaseParser#manageResource.
    def visitManageResource(self, ctx:SqlBaseParser.ManageResourceContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlBaseParser#failNativeCommand.
    def visitFailNativeCommand(self, ctx:SqlBaseParser.FailNativeCommandContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlBaseParser#setConfiguration.
    def visitSetConfiguration(self, ctx:SqlBaseParser.SetConfigurationContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlBaseParser#resetConfiguration.
    def visitResetConfiguration(self, ctx:SqlBaseParser.ResetConfigurationContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlBaseParser#unsupportedHiveNativeCommands.
    def visitUnsupportedHiveNativeCommands(self, ctx:SqlBaseParser.UnsupportedHiveNativeCommandsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlBaseParser#createTableHeader.
    def visitCreateTableHeader(self, ctx:SqlBaseParser.CreateTableHeaderContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlBaseParser#bucketSpec.
    def visitBucketSpec(self, ctx:SqlBaseParser.BucketSpecContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlBaseParser#skewSpec.
    def visitSkewSpec(self, ctx:SqlBaseParser.SkewSpecContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlBaseParser#locationSpec.
    def visitLocationSpec(self, ctx:SqlBaseParser.LocationSpecContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlBaseParser#query.
    def visitQuery(self, ctx:SqlBaseParser.QueryContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlBaseParser#insertInto.
    def visitInsertInto(self, ctx:SqlBaseParser.InsertIntoContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlBaseParser#partitionSpecLocation.
    def visitPartitionSpecLocation(self, ctx:SqlBaseParser.PartitionSpecLocationContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlBaseParser#partitionSpec.
    def visitPartitionSpec(self, ctx:SqlBaseParser.PartitionSpecContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlBaseParser#partitionVal.
    def visitPartitionVal(self, ctx:SqlBaseParser.PartitionValContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlBaseParser#describeFuncName.
    def visitDescribeFuncName(self, ctx:SqlBaseParser.DescribeFuncNameContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlBaseParser#describeColName.
    def visitDescribeColName(self, ctx:SqlBaseParser.DescribeColNameContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlBaseParser#ctes.
    def visitCtes(self, ctx:SqlBaseParser.CtesContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlBaseParser#namedQuery.
    def visitNamedQuery(self, ctx:SqlBaseParser.NamedQueryContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlBaseParser#tableProvider.
    def visitTableProvider(self, ctx:SqlBaseParser.TableProviderContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlBaseParser#tablePropertyList.
    def visitTablePropertyList(self, ctx:SqlBaseParser.TablePropertyListContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlBaseParser#tableProperty.
    def visitTableProperty(self, ctx:SqlBaseParser.TablePropertyContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlBaseParser#tablePropertyKey.
    def visitTablePropertyKey(self, ctx:SqlBaseParser.TablePropertyKeyContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlBaseParser#tablePropertyValue.
    def visitTablePropertyValue(self, ctx:SqlBaseParser.TablePropertyValueContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlBaseParser#constantList.
    def visitConstantList(self, ctx:SqlBaseParser.ConstantListContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlBaseParser#nestedConstantList.
    def visitNestedConstantList(self, ctx:SqlBaseParser.NestedConstantListContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlBaseParser#createFileFormat.
    def visitCreateFileFormat(self, ctx:SqlBaseParser.CreateFileFormatContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlBaseParser#tableFileFormat.
    def visitTableFileFormat(self, ctx:SqlBaseParser.TableFileFormatContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlBaseParser#genericFileFormat.
    def visitGenericFileFormat(self, ctx:SqlBaseParser.GenericFileFormatContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlBaseParser#storageHandler.
    def visitStorageHandler(self, ctx:SqlBaseParser.StorageHandlerContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlBaseParser#resource.
    def visitResource(self, ctx:SqlBaseParser.ResourceContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlBaseParser#singleInsertQuery.
    def visitSingleInsertQuery(self, ctx:SqlBaseParser.SingleInsertQueryContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlBaseParser#multiInsertQuery.
    def visitMultiInsertQuery(self, ctx:SqlBaseParser.MultiInsertQueryContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlBaseParser#queryOrganization.
    def visitQueryOrganization(self, ctx:SqlBaseParser.QueryOrganizationContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlBaseParser#multiInsertQueryBody.
    def visitMultiInsertQueryBody(self, ctx:SqlBaseParser.MultiInsertQueryBodyContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlBaseParser#queryTermDefault.
    def visitQueryTermDefault(self, ctx:SqlBaseParser.QueryTermDefaultContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlBaseParser#setOperation.
    def visitSetOperation(self, ctx:SqlBaseParser.SetOperationContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlBaseParser#queryPrimaryDefault.
    def visitQueryPrimaryDefault(self, ctx:SqlBaseParser.QueryPrimaryDefaultContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlBaseParser#table.
    def visitTable(self, ctx:SqlBaseParser.TableContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlBaseParser#inlineTableDefault1.
    def visitInlineTableDefault1(self, ctx:SqlBaseParser.InlineTableDefault1Context):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlBaseParser#subquery.
    def visitSubquery(self, ctx:SqlBaseParser.SubqueryContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlBaseParser#sortItem.
    def visitSortItem(self, ctx:SqlBaseParser.SortItemContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlBaseParser#querySpecification.
    def visitQuerySpecification(self, ctx:SqlBaseParser.QuerySpecificationContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlBaseParser#hint.
    def visitHint(self, ctx:SqlBaseParser.HintContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlBaseParser#hintStatement.
    def visitHintStatement(self, ctx:SqlBaseParser.HintStatementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlBaseParser#fromClause.
    def visitFromClause(self, ctx:SqlBaseParser.FromClauseContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlBaseParser#aggregation.
    def visitAggregation(self, ctx:SqlBaseParser.AggregationContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlBaseParser#groupingSet.
    def visitGroupingSet(self, ctx:SqlBaseParser.GroupingSetContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlBaseParser#lateralView.
    def visitLateralView(self, ctx:SqlBaseParser.LateralViewContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlBaseParser#setQuantifier.
    def visitSetQuantifier(self, ctx:SqlBaseParser.SetQuantifierContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlBaseParser#relation.
    def visitRelation(self, ctx:SqlBaseParser.RelationContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlBaseParser#joinRelation.
    def visitJoinRelation(self, ctx:SqlBaseParser.JoinRelationContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlBaseParser#joinType.
    def visitJoinType(self, ctx:SqlBaseParser.JoinTypeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlBaseParser#joinCriteria.
    def visitJoinCriteria(self, ctx:SqlBaseParser.JoinCriteriaContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlBaseParser#sample.
    def visitSample(self, ctx:SqlBaseParser.SampleContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlBaseParser#identifierList.
    def visitIdentifierList(self, ctx:SqlBaseParser.IdentifierListContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlBaseParser#identifierSeq.
    def visitIdentifierSeq(self, ctx:SqlBaseParser.IdentifierSeqContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlBaseParser#orderedIdentifierList.
    def visitOrderedIdentifierList(self, ctx:SqlBaseParser.OrderedIdentifierListContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlBaseParser#orderedIdentifier.
    def visitOrderedIdentifier(self, ctx:SqlBaseParser.OrderedIdentifierContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlBaseParser#identifierCommentList.
    def visitIdentifierCommentList(self, ctx:SqlBaseParser.IdentifierCommentListContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlBaseParser#identifierComment.
    def visitIdentifierComment(self, ctx:SqlBaseParser.IdentifierCommentContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlBaseParser#tableName.
    def visitTableName(self, ctx:SqlBaseParser.TableNameContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlBaseParser#aliasedQuery.
    def visitAliasedQuery(self, ctx:SqlBaseParser.AliasedQueryContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlBaseParser#aliasedRelation.
    def visitAliasedRelation(self, ctx:SqlBaseParser.AliasedRelationContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlBaseParser#inlineTableDefault2.
    def visitInlineTableDefault2(self, ctx:SqlBaseParser.InlineTableDefault2Context):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlBaseParser#tableValuedFunction.
    def visitTableValuedFunction(self, ctx:SqlBaseParser.TableValuedFunctionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlBaseParser#inlineTable.
    def visitInlineTable(self, ctx:SqlBaseParser.InlineTableContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlBaseParser#rowFormatSerde.
    def visitRowFormatSerde(self, ctx:SqlBaseParser.RowFormatSerdeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlBaseParser#rowFormatDelimited.
    def visitRowFormatDelimited(self, ctx:SqlBaseParser.RowFormatDelimitedContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlBaseParser#tableIdentifier.
    def visitTableIdentifier(self, ctx:SqlBaseParser.TableIdentifierContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlBaseParser#functionIdentifier.
    def visitFunctionIdentifier(self, ctx:SqlBaseParser.FunctionIdentifierContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlBaseParser#namedExpression.
    def visitNamedExpression(self, ctx:SqlBaseParser.NamedExpressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlBaseParser#namedExpressionSeq.
    def visitNamedExpressionSeq(self, ctx:SqlBaseParser.NamedExpressionSeqContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlBaseParser#expression.
    def visitExpression(self, ctx:SqlBaseParser.ExpressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlBaseParser#booleanDefaultSpatial.
    def visitBooleanDefaultSpatial(self, ctx:SqlBaseParser.BooleanDefaultSpatialContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlBaseParser#logicalNot.
    def visitLogicalNot(self, ctx:SqlBaseParser.LogicalNotContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlBaseParser#booleanDefault.
    def visitBooleanDefault(self, ctx:SqlBaseParser.BooleanDefaultContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlBaseParser#exists.
    def visitExists(self, ctx:SqlBaseParser.ExistsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlBaseParser#logicalBinary.
    def visitLogicalBinary(self, ctx:SqlBaseParser.LogicalBinaryContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlBaseParser#predicated.
    def visitPredicated(self, ctx:SqlBaseParser.PredicatedContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlBaseParser#spatialpredicated.
    def visitSpatialpredicated(self, ctx:SqlBaseParser.SpatialpredicatedContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlBaseParser#predicate.
    def visitPredicate(self, ctx:SqlBaseParser.PredicateContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlBaseParser#myexpressionlist1.
    def visitMyexpressionlist1(self, ctx:SqlBaseParser.Myexpressionlist1Context):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlBaseParser#myexpressionlist2.
    def visitMyexpressionlist2(self, ctx:SqlBaseParser.Myexpressionlist2Context):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlBaseParser#valueExpressionDefault.
    def visitValueExpressionDefault(self, ctx:SqlBaseParser.ValueExpressionDefaultContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlBaseParser#comparison.
    def visitComparison(self, ctx:SqlBaseParser.ComparisonContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlBaseParser#arithmeticBinary.
    def visitArithmeticBinary(self, ctx:SqlBaseParser.ArithmeticBinaryContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlBaseParser#arithmeticUnary.
    def visitArithmeticUnary(self, ctx:SqlBaseParser.ArithmeticUnaryContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlBaseParser#struct.
    def visitStruct(self, ctx:SqlBaseParser.StructContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlBaseParser#dereference.
    def visitDereference(self, ctx:SqlBaseParser.DereferenceContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlBaseParser#simpleCase.
    def visitSimpleCase(self, ctx:SqlBaseParser.SimpleCaseContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlBaseParser#columnReference.
    def visitColumnReference(self, ctx:SqlBaseParser.ColumnReferenceContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlBaseParser#rowConstructor.
    def visitRowConstructor(self, ctx:SqlBaseParser.RowConstructorContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlBaseParser#last.
    def visitLast(self, ctx:SqlBaseParser.LastContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlBaseParser#star.
    def visitStar(self, ctx:SqlBaseParser.StarContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlBaseParser#subscript.
    def visitSubscript(self, ctx:SqlBaseParser.SubscriptContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlBaseParser#subqueryExpression.
    def visitSubqueryExpression(self, ctx:SqlBaseParser.SubqueryExpressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlBaseParser#cast.
    def visitCast(self, ctx:SqlBaseParser.CastContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlBaseParser#constantDefault.
    def visitConstantDefault(self, ctx:SqlBaseParser.ConstantDefaultContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlBaseParser#parenthesizedExpression.
    def visitParenthesizedExpression(self, ctx:SqlBaseParser.ParenthesizedExpressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlBaseParser#functionCall.
    def visitFunctionCall(self, ctx:SqlBaseParser.FunctionCallContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlBaseParser#searchedCase.
    def visitSearchedCase(self, ctx:SqlBaseParser.SearchedCaseContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlBaseParser#first.
    def visitFirst(self, ctx:SqlBaseParser.FirstContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlBaseParser#nullLiteral.
    def visitNullLiteral(self, ctx:SqlBaseParser.NullLiteralContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlBaseParser#intervalLiteral.
    def visitIntervalLiteral(self, ctx:SqlBaseParser.IntervalLiteralContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlBaseParser#typeConstructor.
    def visitTypeConstructor(self, ctx:SqlBaseParser.TypeConstructorContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlBaseParser#numericLiteral.
    def visitNumericLiteral(self, ctx:SqlBaseParser.NumericLiteralContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlBaseParser#booleanLiteral.
    def visitBooleanLiteral(self, ctx:SqlBaseParser.BooleanLiteralContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlBaseParser#stringLiteral.
    def visitStringLiteral(self, ctx:SqlBaseParser.StringLiteralContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlBaseParser#comparisonOperator.
    def visitComparisonOperator(self, ctx:SqlBaseParser.ComparisonOperatorContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlBaseParser#arithmeticOperator.
    def visitArithmeticOperator(self, ctx:SqlBaseParser.ArithmeticOperatorContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlBaseParser#predicateOperator.
    def visitPredicateOperator(self, ctx:SqlBaseParser.PredicateOperatorContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlBaseParser#booleanValue.
    def visitBooleanValue(self, ctx:SqlBaseParser.BooleanValueContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlBaseParser#interval.
    def visitInterval(self, ctx:SqlBaseParser.IntervalContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlBaseParser#intervalField.
    def visitIntervalField(self, ctx:SqlBaseParser.IntervalFieldContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlBaseParser#intervalValue.
    def visitIntervalValue(self, ctx:SqlBaseParser.IntervalValueContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlBaseParser#colPosition.
    def visitColPosition(self, ctx:SqlBaseParser.ColPositionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlBaseParser#complexDataType.
    def visitComplexDataType(self, ctx:SqlBaseParser.ComplexDataTypeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlBaseParser#primitiveDataType.
    def visitPrimitiveDataType(self, ctx:SqlBaseParser.PrimitiveDataTypeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlBaseParser#colTypeList.
    def visitColTypeList(self, ctx:SqlBaseParser.ColTypeListContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlBaseParser#colType.
    def visitColType(self, ctx:SqlBaseParser.ColTypeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlBaseParser#complexColTypeList.
    def visitComplexColTypeList(self, ctx:SqlBaseParser.ComplexColTypeListContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlBaseParser#complexColType.
    def visitComplexColType(self, ctx:SqlBaseParser.ComplexColTypeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlBaseParser#whenClause.
    def visitWhenClause(self, ctx:SqlBaseParser.WhenClauseContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlBaseParser#windows.
    def visitWindows(self, ctx:SqlBaseParser.WindowsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlBaseParser#namedWindow.
    def visitNamedWindow(self, ctx:SqlBaseParser.NamedWindowContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlBaseParser#windowRef.
    def visitWindowRef(self, ctx:SqlBaseParser.WindowRefContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlBaseParser#windowDef.
    def visitWindowDef(self, ctx:SqlBaseParser.WindowDefContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlBaseParser#windowFrame.
    def visitWindowFrame(self, ctx:SqlBaseParser.WindowFrameContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlBaseParser#frameBound.
    def visitFrameBound(self, ctx:SqlBaseParser.FrameBoundContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlBaseParser#qualifiedName.
    def visitQualifiedName(self, ctx:SqlBaseParser.QualifiedNameContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlBaseParser#identifier.
    def visitIdentifier(self, ctx:SqlBaseParser.IdentifierContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlBaseParser#unquotedIdentifier.
    def visitUnquotedIdentifier(self, ctx:SqlBaseParser.UnquotedIdentifierContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlBaseParser#quotedIdentifierAlternative.
    def visitQuotedIdentifierAlternative(self, ctx:SqlBaseParser.QuotedIdentifierAlternativeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlBaseParser#quotedIdentifier.
    def visitQuotedIdentifier(self, ctx:SqlBaseParser.QuotedIdentifierContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlBaseParser#decimalLiteral.
    def visitDecimalLiteral(self, ctx:SqlBaseParser.DecimalLiteralContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlBaseParser#integerLiteral.
    def visitIntegerLiteral(self, ctx:SqlBaseParser.IntegerLiteralContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlBaseParser#bigIntLiteral.
    def visitBigIntLiteral(self, ctx:SqlBaseParser.BigIntLiteralContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlBaseParser#smallIntLiteral.
    def visitSmallIntLiteral(self, ctx:SqlBaseParser.SmallIntLiteralContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlBaseParser#tinyIntLiteral.
    def visitTinyIntLiteral(self, ctx:SqlBaseParser.TinyIntLiteralContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlBaseParser#doubleLiteral.
    def visitDoubleLiteral(self, ctx:SqlBaseParser.DoubleLiteralContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlBaseParser#bigDecimalLiteral.
    def visitBigDecimalLiteral(self, ctx:SqlBaseParser.BigDecimalLiteralContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlBaseParser#nonReserved.
    def visitNonReserved(self, ctx:SqlBaseParser.NonReservedContext):
        return self.visitChildren(ctx)



del SqlBaseParser
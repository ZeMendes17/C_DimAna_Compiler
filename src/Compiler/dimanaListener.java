// Generated from dimana.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link dimanaParser}.
 */
public interface dimanaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link dimanaParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(dimanaParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link dimanaParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(dimanaParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link dimanaParser#statList}.
	 * @param ctx the parse tree
	 */
	void enterStatList(dimanaParser.StatListContext ctx);
	/**
	 * Exit a parse tree produced by {@link dimanaParser#statList}.
	 * @param ctx the parse tree
	 */
	void exitStatList(dimanaParser.StatListContext ctx);
	/**
	 * Enter a parse tree produced by {@link dimanaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(dimanaParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link dimanaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(dimanaParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link dimanaParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(dimanaParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link dimanaParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(dimanaParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link dimanaParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(dimanaParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link dimanaParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(dimanaParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link dimanaParser#inputStatement}.
	 * @param ctx the parse tree
	 */
	void enterInputStatement(dimanaParser.InputStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link dimanaParser#inputStatement}.
	 * @param ctx the parse tree
	 */
	void exitInputStatement(dimanaParser.InputStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link dimanaParser#outputStatement}.
	 * @param ctx the parse tree
	 */
	void enterOutputStatement(dimanaParser.OutputStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link dimanaParser#outputStatement}.
	 * @param ctx the parse tree
	 */
	void exitOutputStatement(dimanaParser.OutputStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link dimanaParser#outputFormat}.
	 * @param ctx the parse tree
	 */
	void enterOutputFormat(dimanaParser.OutputFormatContext ctx);
	/**
	 * Exit a parse tree produced by {@link dimanaParser#outputFormat}.
	 * @param ctx the parse tree
	 */
	void exitOutputFormat(dimanaParser.OutputFormatContext ctx);
	/**
	 * Enter a parse tree produced by {@link dimanaParser#write_expr}.
	 * @param ctx the parse tree
	 */
	void enterWrite_expr(dimanaParser.Write_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link dimanaParser#write_expr}.
	 * @param ctx the parse tree
	 */
	void exitWrite_expr(dimanaParser.Write_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link dimanaParser#loopStatement}.
	 * @param ctx the parse tree
	 */
	void enterLoopStatement(dimanaParser.LoopStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link dimanaParser#loopStatement}.
	 * @param ctx the parse tree
	 */
	void exitLoopStatement(dimanaParser.LoopStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link dimanaParser#length}.
	 * @param ctx the parse tree
	 */
	void enterLength(dimanaParser.LengthContext ctx);
	/**
	 * Exit a parse tree produced by {@link dimanaParser#length}.
	 * @param ctx the parse tree
	 */
	void exitLength(dimanaParser.LengthContext ctx);
	/**
	 * Enter a parse tree produced by {@link dimanaParser#headerFile}.
	 * @param ctx the parse tree
	 */
	void enterHeaderFile(dimanaParser.HeaderFileContext ctx);
	/**
	 * Exit a parse tree produced by {@link dimanaParser#headerFile}.
	 * @param ctx the parse tree
	 */
	void exitHeaderFile(dimanaParser.HeaderFileContext ctx);
	/**
	 * Enter a parse tree produced by {@link dimanaParser#prefixUnit}.
	 * @param ctx the parse tree
	 */
	void enterPrefixUnit(dimanaParser.PrefixUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link dimanaParser#prefixUnit}.
	 * @param ctx the parse tree
	 */
	void exitPrefixUnit(dimanaParser.PrefixUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link dimanaParser#unit}.
	 * @param ctx the parse tree
	 */
	void enterUnit(dimanaParser.UnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link dimanaParser#unit}.
	 * @param ctx the parse tree
	 */
	void exitUnit(dimanaParser.UnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link dimanaParser#alternativeUnit}.
	 * @param ctx the parse tree
	 */
	void enterAlternativeUnit(dimanaParser.AlternativeUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link dimanaParser#alternativeUnit}.
	 * @param ctx the parse tree
	 */
	void exitAlternativeUnit(dimanaParser.AlternativeUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link dimanaParser#listDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterListDeclaration(dimanaParser.ListDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link dimanaParser#listDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitListDeclaration(dimanaParser.ListDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprListExpression}
	 * labeled alternative in {@link dimanaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExprListExpression(dimanaParser.ExprListExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprListExpression}
	 * labeled alternative in {@link dimanaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExprListExpression(dimanaParser.ExprListExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OutputExpression}
	 * labeled alternative in {@link dimanaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterOutputExpression(dimanaParser.OutputExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OutputExpression}
	 * labeled alternative in {@link dimanaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitOutputExpression(dimanaParser.OutputExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IndexExpression}
	 * labeled alternative in {@link dimanaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIndexExpression(dimanaParser.IndexExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IndexExpression}
	 * labeled alternative in {@link dimanaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIndexExpression(dimanaParser.IndexExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code InputExpression}
	 * labeled alternative in {@link dimanaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterInputExpression(dimanaParser.InputExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code InputExpression}
	 * labeled alternative in {@link dimanaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitInputExpression(dimanaParser.InputExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AddSubExpression}
	 * labeled alternative in {@link dimanaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAddSubExpression(dimanaParser.AddSubExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddSubExpression}
	 * labeled alternative in {@link dimanaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAddSubExpression(dimanaParser.AddSubExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RealLiteral}
	 * labeled alternative in {@link dimanaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterRealLiteral(dimanaParser.RealLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RealLiteral}
	 * labeled alternative in {@link dimanaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitRealLiteral(dimanaParser.RealLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StringAssignExpression}
	 * labeled alternative in {@link dimanaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterStringAssignExpression(dimanaParser.StringAssignExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StringAssignExpression}
	 * labeled alternative in {@link dimanaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitStringAssignExpression(dimanaParser.StringAssignExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TypeConversion}
	 * labeled alternative in {@link dimanaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterTypeConversion(dimanaParser.TypeConversionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TypeConversion}
	 * labeled alternative in {@link dimanaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitTypeConversion(dimanaParser.TypeConversionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StringLiteral}
	 * labeled alternative in {@link dimanaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterStringLiteral(dimanaParser.StringLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StringLiteral}
	 * labeled alternative in {@link dimanaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitStringLiteral(dimanaParser.StringLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IdExpression}
	 * labeled alternative in {@link dimanaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIdExpression(dimanaParser.IdExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IdExpression}
	 * labeled alternative in {@link dimanaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIdExpression(dimanaParser.IdExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParenExpression}
	 * labeled alternative in {@link dimanaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterParenExpression(dimanaParser.ParenExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParenExpression}
	 * labeled alternative in {@link dimanaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitParenExpression(dimanaParser.ParenExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IntLiteral}
	 * labeled alternative in {@link dimanaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIntLiteral(dimanaParser.IntLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IntLiteral}
	 * labeled alternative in {@link dimanaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIntLiteral(dimanaParser.IntLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code InputTypeExpression}
	 * labeled alternative in {@link dimanaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterInputTypeExpression(dimanaParser.InputTypeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code InputTypeExpression}
	 * labeled alternative in {@link dimanaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitInputTypeExpression(dimanaParser.InputTypeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MulDivExpression}
	 * labeled alternative in {@link dimanaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMulDivExpression(dimanaParser.MulDivExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MulDivExpression}
	 * labeled alternative in {@link dimanaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMulDivExpression(dimanaParser.MulDivExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link dimanaParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterDataType(dimanaParser.DataTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link dimanaParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitDataType(dimanaParser.DataTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link dimanaParser#castTypes}.
	 * @param ctx the parse tree
	 */
	void enterCastTypes(dimanaParser.CastTypesContext ctx);
	/**
	 * Exit a parse tree produced by {@link dimanaParser#castTypes}.
	 * @param ctx the parse tree
	 */
	void exitCastTypes(dimanaParser.CastTypesContext ctx);
}
// Generated from dimana.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link dimanaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface dimanaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link dimanaParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(dimanaParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link dimanaParser#statList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatList(dimanaParser.StatListContext ctx);
	/**
	 * Visit a parse tree produced by {@link dimanaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(dimanaParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link dimanaParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(dimanaParser.VariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link dimanaParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(dimanaParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link dimanaParser#inputStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInputStatement(dimanaParser.InputStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link dimanaParser#outputStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutputStatement(dimanaParser.OutputStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link dimanaParser#outputFormat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutputFormat(dimanaParser.OutputFormatContext ctx);
	/**
	 * Visit a parse tree produced by {@link dimanaParser#write_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWrite_expr(dimanaParser.Write_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link dimanaParser#loopStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoopStatement(dimanaParser.LoopStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link dimanaParser#length}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLength(dimanaParser.LengthContext ctx);
	/**
	 * Visit a parse tree produced by {@link dimanaParser#headerFile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHeaderFile(dimanaParser.HeaderFileContext ctx);
	/**
	 * Visit a parse tree produced by {@link dimanaParser#prefixUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrefixUnit(dimanaParser.PrefixUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link dimanaParser#unit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnit(dimanaParser.UnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link dimanaParser#alternativeUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlternativeUnit(dimanaParser.AlternativeUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link dimanaParser#listDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListDeclaration(dimanaParser.ListDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprListExpression}
	 * labeled alternative in {@link dimanaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprListExpression(dimanaParser.ExprListExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OutputExpression}
	 * labeled alternative in {@link dimanaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutputExpression(dimanaParser.OutputExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IndexExpression}
	 * labeled alternative in {@link dimanaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexExpression(dimanaParser.IndexExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code InputExpression}
	 * labeled alternative in {@link dimanaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInputExpression(dimanaParser.InputExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AddSubExpression}
	 * labeled alternative in {@link dimanaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSubExpression(dimanaParser.AddSubExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RealLiteral}
	 * labeled alternative in {@link dimanaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRealLiteral(dimanaParser.RealLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StringAssignExpression}
	 * labeled alternative in {@link dimanaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringAssignExpression(dimanaParser.StringAssignExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TypeConversion}
	 * labeled alternative in {@link dimanaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeConversion(dimanaParser.TypeConversionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StringLiteral}
	 * labeled alternative in {@link dimanaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringLiteral(dimanaParser.StringLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IdExpression}
	 * labeled alternative in {@link dimanaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdExpression(dimanaParser.IdExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParenExpression}
	 * labeled alternative in {@link dimanaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenExpression(dimanaParser.ParenExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IntLiteral}
	 * labeled alternative in {@link dimanaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntLiteral(dimanaParser.IntLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code InputTypeExpression}
	 * labeled alternative in {@link dimanaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInputTypeExpression(dimanaParser.InputTypeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MulDivExpression}
	 * labeled alternative in {@link dimanaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulDivExpression(dimanaParser.MulDivExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link dimanaParser#dataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataType(dimanaParser.DataTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link dimanaParser#castTypes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCastTypes(dimanaParser.CastTypesContext ctx);
}
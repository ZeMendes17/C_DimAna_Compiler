
import java.util.*;
import java.util.ArrayList;
import org.stringtemplate.v4.*;

@SuppressWarnings("CheckReturnValue")
public class DimanaCompiler extends dimanaBaseVisitor<String> {

    Arraylist<String> declared_dimensions = new ArrayList<String>();

   @Override public String visitProgram(dimanaParser.ProgramContext ctx) {
      String res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public String visitStatList(dimanaParser.StatListContext ctx) {
      String res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public String visitStatement(dimanaParser.StatementContext ctx) {
      String res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public String visitVariableDeclaration(dimanaParser.VariableDeclarationContext ctx) {
      String res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public String visitAssignment(dimanaParser.AssignmentContext ctx) {
      String res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public String visitOutputStatement(dimanaParser.OutputStatementContext ctx) {
      String res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public String visitLoopStatement(dimanaParser.LoopStatementContext ctx) {
      String res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public String visitHeaderFile(dimanaParser.HeaderFileContext ctx) {
      String res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public String visitPrefixUnit(dimanaParser.PrefixUnitContext ctx) {
      String res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public String visitUnit(dimanaParser.UnitContext ctx) {
      String res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public String visitAlternativeUnit(dimanaParser.AlternativeUnitContext ctx) {
      String res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public String visitListDeclaration(dimanaParser.ListDeclarationContext ctx) {
      String res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public String visitExprListExpression(dimanaParser.ExprListExpressionContext ctx) {
      String res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public String visitIndexExpression(dimanaParser.IndexExpressionContext ctx) {
      String res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public String visitInputExpression(dimanaParser.InputExpressionContext ctx) {
      String res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public String visitAddSubExpression(dimanaParser.AddSubExpressionContext ctx) {
      String res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public String visitRealLiteral(dimanaParser.RealLiteralContext ctx) {
      String res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public String visitStringAssignExpression(dimanaParser.StringAssignExpressionContext ctx) {
      String res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public String visitTypeConversion(dimanaParser.TypeConversionContext ctx) {
      String res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public String visitStringLiteral(dimanaParser.StringLiteralContext ctx) {
      String res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public String visitAddListExpression(dimanaParser.AddListExpressionContext ctx) {
      String res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public String visitIdExpression(dimanaParser.IdExpressionContext ctx) {
      String res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public String visitParenExpression(dimanaParser.ParenExpressionContext ctx) {
      String res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public String visitIntLiteral(dimanaParser.IntLiteralContext ctx) {
      String res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public String visitMulDivExpression(dimanaParser.MulDivExpressionContext ctx) {
      String res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public String visitDataType(dimanaParser.DataTypeContext ctx) {
      String res = null;
      return visitChildren(ctx);
      //return res;
   }

   // creates new vars to be used in the compiled file
   private String newVar() {
      numVars++;
      return "v" + numVars;
   }

   // increments the number of vars to update the name
   private int numVars=0;

   // to use the .stg file
   private STGroup templates = new STGroupFile("dimana.stg");
}

import java.util.*;
import org.stringtemplate.v4.*;

@SuppressWarnings("CheckReturnValue")
public class DimanaCompiler extends dimanaBaseVisitor<ST> {

   private STGroup templates = new STGroupFile("dimana.stg"); // stg file to be used
   private int varCount = 0; // variable counter
   HashMap<String, ArrayList<String>> varMap = new HashMap<String, ArrayList<String>>();
   // por exemplo, length: [real, m , cm , mm]
   // pra ser + facil, tentem definir por esta convenção , nome_dimensão : [tipo_de_dados, unidade_principal, unidade_alternativa1, unidade_alternativa2, ...]


   // não está acabada esta função, basica af
   @Override
   public ST visitUnit(dimanaParser.UnitContext ctx) {
      // usado para declaração das dimensões
      String dimension_name = ctx.ID(0).getText();
      String dataType = ctx.dataType().getText();
      String dimension_unit = ctx.ID(1).getText();
      varMap.put(dimension_name, new ArrayList<String>(){{
         add(dataType);
         add(dimension_unit);
      }});
      return visitChildren(ctx);
      // return res;
   }


   @Override
   public ST visitVariableDeclaration(dimanaParser.VariableDeclarationContext ctx) {
      // NMEC n (dataType ID )
      String dataType = ctx.dataType().getText();
      String id = ctx.ID().getText();
      String expression = "";
      // so se tem dataType e id garantidos, a expression é opcional
      if (ctx.expression() != null) {
         expression = ctx.expression().getText();
      }
      if (!varMap.containsKey(dataType)) // se esta dimensão ainda não foi declarada
      {
         System.out.println("Dimensão " + dataType + " usada antes de ser declarada");
         System.exit(0);
      }

      ST res = null;


      if (expression.isEmpty()) { // não é dado um valor inicial
         res = templates.getInstanceOf("declare_var");
         res.add("unit", dataType);
         res.add("name", id);
      } else { // é dado um valor inicial ( expression )
         ST res = templates.getInstanceOf("declare_var_with_value");
         res.add("unit", dataType);
         res.add("name", id);
         res.add("value", expression);
      }

      return res;

   }


   @Override
   public ST visitProgram(dimanaParser.ProgramContext ctx) {
      ST res = null;
      return visitChildren(ctx);
      // return res;
   }

   @Override
   public ST visitStatList(dimanaParser.StatListContext ctx) {
      ST res = null;
      return visitChildren(ctx);
      // return res;
   }

   @Override
   public ST visitStatement(dimanaParser.StatementContext ctx) {
      ST res = null;
      return visitChildren(ctx);
      // return res;
   }


   @Override
   public ST visitAssignment(dimanaParser.AssignmentContext ctx) {
      ST res = null;
      return visitChildren(ctx);
      // return res;
   }

   @Override
   public ST visitOutputStatement(dimanaParser.OutputStatementContext ctx) {
      ST res = null;
      return visitChildren(ctx);
      // return res;
   }

   @Override
   public ST visitLoopStatement(dimanaParser.LoopStatementContext ctx) {
      ST res = null;
      return visitChildren(ctx);
      // return res;
   }

   @Override
   public ST visitHeaderFile(dimanaParser.HeaderFileContext ctx) {
      ST res = null;
      return visitChildren(ctx);
      // return res;
   }

   @Override
   public ST visitPrefixUnit(dimanaParser.PrefixUnitContext ctx) {
      ST res = null;
      return visitChildren(ctx);
      // return res;
   }


   @Override
   public ST visitAlternativeUnit(dimanaParser.AlternativeUnitContext ctx) {
      ST res = null;
      return visitChildren(ctx);
      // return res;
   }

   @Override
   public ST visitListDeclaration(dimanaParser.ListDeclarationContext ctx) {
      ST res = null;
      return visitChildren(ctx);
      // return res;
   }

   @Override
   public ST visitExprListExpression(dimanaParser.ExprListExpressionContext ctx) {
      ST res = null;
      return visitChildren(ctx);
      // return res;
   }

   @Override
   public ST visitIndexExpression(dimanaParser.IndexExpressionContext ctx) {
      ST res = null;
      return visitChildren(ctx);
      // return res;
   }

   @Override
   public ST visitInputExpression(dimanaParser.InputExpressionContext ctx) {
      ST res = null;
      return visitChildren(ctx);
      // return res;
   }

   @Override
   public ST visitAddSubExpression(dimanaParser.AddSubExpressionContext ctx) {
      ST res = null;
      return visitChildren(ctx);
      // return res;
   }

   @Override
   public ST visitRealLiteral(dimanaParser.RealLiteralContext ctx) {
      ST res = null;
      return visitChildren(ctx);
      // return res;
   }

   @Override
   public ST visitStringAssignExpression(dimanaParser.StringAssignExpressionContext ctx) {
      ST res = null;
      return visitChildren(ctx);
      // return res;
   }

   @Override
   public ST visitTypeConversion(dimanaParser.TypeConversionContext ctx) {
      ST res = null;
      return visitChildren(ctx);
      // return res;
   }

   @Override
   public ST visitStringLiteral(dimanaParser.StringLiteralContext ctx) {
      ST res = null;
      return visitChildren(ctx);
      // return res;
   }

   @Override
   public ST visitAddListExpression(dimanaParser.AddListExpressionContext ctx) {
      ST res = null;
      return visitChildren(ctx);
      // return res;
   }

   @Override
   public ST visitIdExpression(dimanaParser.IdExpressionContext ctx) {
      ST res = null;
      return visitChildren(ctx);
      // return res;
   }

   @Override
   public ST visitParenExpression(dimanaParser.ParenExpressionContext ctx) {
      ST res = null;
      return visitChildren(ctx);
      // return res;
   }

   @Override
   public ST visitIntLiteral(dimanaParser.IntLiteralContext ctx) {
      ST res = null;
      return visitChildren(ctx);
      // return res;
   }

   @Override
   public ST visitMulDivExpression(dimanaParser.MulDivExpressionContext ctx) {
      ST res = null;
      return visitChildren(ctx);
      // return res;
   }

   @Override
   public ST visitDataType(dimanaParser.DataTypeContext ctx) {
      ST res = null;
      return visitChildren(ctx);
      // return res;
   }
}

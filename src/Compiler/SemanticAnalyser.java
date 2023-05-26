import static java.lang.System.*;
import org.antlr.v4.runtime.tree.ParseTreeProperty;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.TerminalNode;
import java.util.*;

@SuppressWarnings("CheckReturnValue")
public class SemanticAnalyser extends dimanaBaseVisitor<Boolean> {

   private static int varCount = 0; // variable counter
   private static HashMap<String, ArrayList<String>> varMap = new HashMap<String, ArrayList<String>>();
   // usem este array para guardar as coisas sobre variaveis/dimensoes
   // por exemplo --> {Length : [real, meter, m], ...}

   private static HashMap<String, ArrayList<String>> conversions = new HashMap<>();
   // vai guardar por exemplo --> {inch : ["0.0254", "meter"], ...}

   private static HashMap<String, String> declared_vars = new HashMap<String, String>();
   // guardar as variaveis -----> {l : Length}

   private static HashMap<String, ArrayList<String>> dependent_units = new HashMap<String, ArrayList<String>>();
   // guardar dependencias das unidades dependentes
   // p.ex Volume -> [Length*Length*Length]
   private static int temp_var_counter = 1;

   ArrayList<String> default_types = new ArrayList<String>() {
      {
         add("integer");
         add("real");
         add("string");
      }
   };




// qualquer cena que envolva ctx.expression() por enquanto vai tar a dar erro até se fazer as várias funções, por isso vai tar comentado
// qualquer cena que envolva ctx.expression() por enquanto vai tar a dar erro até se fazer as várias funções, por isso vai tar comentado
// qualquer cena que envolva ctx.expression() por enquanto vai tar a dar erro até se fazer as várias funções, por isso vai tar comentado
// qualquer cena que envolva ctx.expression() por enquanto vai tar a dar erro até se fazer as várias funções, por isso vai tar comentado
// qualquer cena que envolva ctx.expression() por enquanto vai tar a dar erro até se fazer as várias funções, por isso vai tar comentado


   @Override
   public Boolean visitVariableDeclaration(dimanaParser.VariableDeclarationContext ctx) {

      Boolean res = visit(ctx.dataType()); // check if there are no problems with the datatype

      if (ctx.expression() != null)
         res = res && visit(ctx.expression()); // if there is a expression, check if there are no problems with it also

      if (res != false) {

         String var_dataType = ctx.dataType().type; // this is used both for types and dimensions in the dataType rule

         if (ctx.dataType().type == null) {
            ErrorHandling.printError(ctx,
                  "Attempt at using a undeclared dimension when declaring the variable -> " + ctx.ID().getText());
            return false;
         }

         String varName = ctx.ID().getText();

         if (isReservedName(varName)) {
            ErrorHandling.printError(ctx, "Variable " + varName + " cant use a Java reserved name");
            return false;
         }

         if (declared_vars.containsKey(varName)) {
            ErrorHandling.printError(ctx, "Variable " + varName + " is already declared");
            return false;
         }

         if (ctx.expression() != null) { // se existir uma expressão a ser associada À variavel

            String expr_dataType = ctx.expression().dimension;


            /*  -> COMENTADO POR CAUSA DO CTX.EXPRESSION() , DESCOMENTAR DPS


            if (var_dataType.equals(expr_dataType)) { // verificar se a dimensão da variável é igual à resultante da
                                                      // expressão
               declared_vars.put(varName, var_dataType);
               return true;
            } else {
               ErrorHandling.printError(ctx, "Cant assign expression of dimension -> " + var_dataType + " to variable "
                     + varName + " of dimension -> " + expr_dataType);
               return false;
            }

            */
         }

         declared_vars.put(varName, var_dataType);

      }

      return res;
   }

   @Override
   public Boolean visitAssignment(dimanaParser.AssignmentContext ctx) {

      Boolean res = visit(ctx.expression()); // check if there are no problems with the expression

      //String alskdjasdk = ctx.expression().dimension;
      //System.out.println("expression dimension -> " + alskdjasdk);

      String var = declared_vars.get(ctx.ID().getText());
      System.out.println("variable dimension -> " + var);

      if (res != false) { // if there are no problems with the expression or the name of the variable


         /*  -> COMENTADO POR CAUSA DO CTX.EXPRESSION() , DESCOMENTAR DPS


            if (!(declared_vars.get(ctx.ID()).equals(ctx.expression().dimension))) { 
               // check if the dimension of the
               // variable is equal to the dimension
               // of the expression
               res = false;
               ErrorHandling.printError(ctx,
                     "Cant assign expression of dimension -> " + ctx.expression().dimension + " to variable "
                           + ctx.ID().getText() + " of dimension -> " + declared_vars.get(ctx.ID().getText()));
               return res;
            }


            */



         }
      return res;
   }

   @Override
   public Boolean visitInputStatement(dimanaParser.InputStatementContext ctx) {


      Boolean res = visit(ctx.ID(0));

      if (!declared_vars.containsKey(ctx.ID(0).getText())) // verificar se esta variavel já foi declarada
      {
         ErrorHandling.printError(ctx, "Variable " + ctx.ID(0).getText() + " is not declared");
         return false;
      }

      if (ctx.ID(1) != null) // se existir um cast
      {
         // ver se o cast que é feito é para a unidade base da dimensão da variável
         if (!(varMap.get(declared_vars.get(ctx.ID(0).getText())).get(1).equals(ctx.ID(1).getText()))) { 
            ErrorHandling.printError(ctx, ctx.ID(0).getText() + " has base unit of " + varMap.get(declared_vars.get(ctx.ID(0).getText())).get(1) + " and cant be casted to " + ctx.ID(1).getText());
            return false;
         }
      }

      if (ctx.dataType() != null){ // só permitir casts ( na esquerda ) para os tipos de dados base
         if (ctx.dataType().getText() != "string" || ctx.dataType().getText() != "real" || ctx.dataType().getText() != "integer"){
            ErrorHandling.printError(ctx, "Cant cast input given to types other than real, string or integer!!");
            return false;
         }
      }

      if (ctx.STRING() != null){ // verificar se a string não é um nome reservado do Java
         if (isReservedName(ctx.STRING().getText())){
            ErrorHandling.printError(ctx, "Cant use a Java reserved name as a string");
            return false;
         }
      }

      return res;
   }

   @Override
   public Boolean visitOutputStatement(dimanaParser.OutputStatementContext ctx) {
      Boolean res = true;
      return res;
      // return res;
   }

   @Override
   public Boolean visitOutputFormat(dimanaParser.OutputFormatContext ctx) {
      Boolean res = true;
      return res;
      // return res;
   }

   @Override
   public Boolean visitWrite_expr(dimanaParser.Write_exprContext ctx) {
      Boolean res = true;
      return res;
      // return res;
   }

   @Override
   public Boolean visitLoopStatement(dimanaParser.LoopStatementContext ctx) {
      Boolean res = true;
      return res;
      // return res;
   }

   @Override
   public Boolean visitLength(dimanaParser.LengthContext ctx) {
      Boolean res = true;
      return res;
      // return res;
   }

   @Override
   public Boolean visitHeaderFile(dimanaParser.HeaderFileContext ctx) {
      Boolean res = true;
      return res;
      // return res;
   }

   @Override
   public Boolean visitPrefixUnit(dimanaParser.PrefixUnitContext ctx) {
      Boolean res = true;
      return res;
      // return res;
   }

   @Override
   public Boolean visitIndependentUnit(dimanaParser.IndependentUnitContext ctx) {
      Boolean res = true;
      return res;
      // return res;
   }

   @Override
   public Boolean visitDependantUnit(dimanaParser.DependantUnitContext ctx) {
      Boolean res = true;
      return res;
      // return res;
   }

   @Override
   public Boolean visitAlternativeUnit(dimanaParser.AlternativeUnitContext ctx) {
      Boolean res = true;
      return res;
      // return res;
   }

   @Override
   public Boolean visitListDeclaration(dimanaParser.ListDeclarationContext ctx) {
      Boolean res = true;
      return res;
      // return res;
   }

   @Override
   public Boolean visitExprListExpression(dimanaParser.ExprListExpressionContext ctx) {
      Boolean res = true;
      return res;
      // return res;
   }

   @Override
   public Boolean visitOutputExpression(dimanaParser.OutputExpressionContext ctx) {
      Boolean res = true;
      return res;
      // return res;
   }

   @Override
   public Boolean visitIndexExpression(dimanaParser.IndexExpressionContext ctx) {
      Boolean res = true;
      return res;
      // return res;
   }

   @Override
   public Boolean visitInputExpression(dimanaParser.InputExpressionContext ctx) {
      Boolean res = true;
      return res;
      // return res;
   }

   @Override
   public Boolean visitAddSubExpression(dimanaParser.AddSubExpressionContext ctx) {
      Boolean res = true;
      return res;
      // return res;
   }

   @Override
   public Boolean visitRealLiteral(dimanaParser.RealLiteralContext ctx) {
      Boolean res = true;
      return res;
      // return res;
   }

   @Override
   public Boolean visitStringAssignExpression(dimanaParser.StringAssignExpressionContext ctx) {
      Boolean res = true;
      return res;
      // return res;
   }

   @Override
   public Boolean visitTypeConversion(dimanaParser.TypeConversionContext ctx) {
      Boolean res = true;
      return res;
      // return res;
   }

   @Override
   public Boolean visitStringLiteral(dimanaParser.StringLiteralContext ctx) {
      Boolean res = true;
      return res;
      // return res;
   }

   @Override
   public Boolean visitIdExpression(dimanaParser.IdExpressionContext ctx) {
      Boolean res = true;
      return res;
      // return res;
   }

   @Override
   public Boolean visitParenExpression(dimanaParser.ParenExpressionContext ctx) {
      Boolean res = true;
      return res;
      // return res;
   }

   @Override
   public Boolean visitIntLiteral(dimanaParser.IntLiteralContext ctx) {
      Boolean res = true;
      return res;
      // return res;
   }

   @Override
   public Boolean visitInputTypeExpression(dimanaParser.InputTypeExpressionContext ctx) {
      Boolean res = true;
      return res;
      // return res;
   }

   @Override
   public Boolean visitMulDivExpression(dimanaParser.MulDivExpressionContext ctx) {
      Boolean res = true;
      return res;
      // return res;
   }

   @Override
   public Boolean visitDataType(dimanaParser.DataTypeContext ctx) {
      ctx.type = ctx.getText();
      return true;
      // return res;
   }

   @Override
   public Boolean visitCastTypes(dimanaParser.CastTypesContext ctx) {
      Boolean res = true;
      return res;
      // return res;
   }

   /*
    * -> NOTHING TO CHECK HERE
    * 
    * @Override public Boolean visitProgram(dimanaParser.ProgramContext ctx) {
    * Boolean res = true;
    * return res;
    * //return res;
    * }
    */

   /*
    * -> NOTHING TO CHECK HERE
    * 
    * @Override public Boolean visitStatList(dimanaParser.StatListContext ctx) {
    * Boolean res = true;
    * return res;
    * //return res;
    * }
    */

   /*
    * -> NOTHING TO CHECK HERE, WE WILL DO THE VERIFICATION ON THE RESPECTIVE
    * SUBTYPES
    * 
    * @Override public Boolean visitStatement(dimanaParser.StatementContext ctx) {
    * Boolean res = true;
    * return res;
    * //return res;
    * }
    */

   private static Boolean isReservedName(String variableName) {
      Set<String> reservedKeywords = new HashSet<>(Arrays.asList(
            "abstract", "assert", "boolean", "break", "byte", "case", "catch", "char", "class", "const", "continue",
            "default", "do", "double", "else", "enum", "extends", "final", "finally", "float", "for", "goto",
            "if", "implements", "import", "instanceof", "int", "interface", "long", "native", "new", "package",
            "private", "protected", "public", "return", "short", "static", "strictfp", "super", "switch",
            "synchronized", "this", "throw", "throws", "transient", "try", "void", "volatile", "while"));

      return reservedKeywords.contains(variableName);
   }
}

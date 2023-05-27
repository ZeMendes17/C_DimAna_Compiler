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
   private static HashMap<String, String> declared_lists = new HashMap<String, String>();

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

   // qualquer cena que envolva ctx.expression() por enquanto vai tar a dar erro
   // até se fazer as várias funções, por isso vai tar comentado
   // qualquer cena que envolva ctx.expression() por enquanto vai tar a dar erro
   // até se fazer as várias funções, por isso vai tar comentado
   // qualquer cena que envolva ctx.expression() por enquanto vai tar a dar erro
   // até se fazer as várias funções, por isso vai tar comentado
   // qualquer cena que envolva ctx.expression() por enquanto vai tar a dar erro
   // até se fazer as várias funções, por isso vai tar comentado
   // qualquer cena que envolva ctx.expression() por enquanto vai tar a dar erro
   // até se fazer as várias funções, por isso vai tar comentado

   @Override
   public Boolean visitIndependentUnit(dimanaParser.IndependentUnitContext ctx) {

      Boolean res = true;

      if (res != false) {

         if (isReservedName(ctx.ID(0).getText())) {
            ErrorHandling.printError(ctx, "Unit " + ctx.ID(0) + " cant use a Java reserved name");
            return false;
         }

         if (isReservedName(ctx.ID(1).getText())) {
            ErrorHandling.printError(ctx, "Unit " + ctx.ID(0) + " cannot use a base unit thats a Java reserved name");
            return false;
         }

         if (ctx.ID(2) != null) {

            if (isReservedName(ctx.ID(2).getText())) {
               ErrorHandling.printError(ctx, "Unit " + ctx.ID(0) + " cannot use a suffix thats a Java reserved name");
               return false;
            }

            // independent units with suffix given
            varMap.put(ctx.ID(0).getText(), new ArrayList<String>() {
               {
                  add(ctx.dataType().type); // datatype -> real, integer
                  add(ctx.ID(1).getText()); // base unit -> meter, second
                  add(ctx.ID(2).getText()); // suffix -> m, s
               }
            });

            System.out.println("Added dimension" + ctx.ID(0).getText() + " with base unit " + ctx.ID(1).getText()
                  + " and suffix " + ctx.ID(2).getText());

         } else {
            // independent units without suffix given
            varMap.put(ctx.ID(0).getText(), new ArrayList<String>() {
               {
                  add(ctx.dataType().type); // datatype -> real, integer
                  add(ctx.ID(1).getText()); // base unit -> meter, second
               }
            });
            System.out.println("Added dimension" + ctx.ID(0).getText() + " with base unit " + ctx.ID(1).getText());

         }
      }
      System.out.println("Passed IndependentUnit check");
      System.out.flush();

      return res;
   }

   @Override
   public Boolean visitDependantUnit(dimanaParser.DependantUnitContext ctx) {
      Boolean res = true;
      return res;
      // return res;
   }

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

            /*
             * -> COMENTADO POR CAUSA DO CTX.EXPRESSION() , DESCOMENTAR DPS
             * 
             * 
             * if (var_dataType.equals(expr_dataType)) { // verificar se a dimensão da
             * variável é igual à resultante da
             * // expressão
             * declared_vars.put(varName, var_dataType);
             * return true;
             * } else {
             * ErrorHandling.printError(ctx, "Cant assign expression of dimension -> " +
             * var_dataType + " to variable "
             * + varName + " of dimension -> " + expr_dataType);
             * return false;
             * }
             * 
             */
         }

         declared_vars.put(varName, var_dataType);

      }
      System.out.println("Passed Variable Declaration check");
      System.out.flush();
      return res;
   }

   @Override
   public Boolean visitAssignment(dimanaParser.AssignmentContext ctx) {

      Boolean res = visit(ctx.expression()); // check if there are no problems with the expression

      // String alskdjasdk = ctx.expression().dimension;
      // System.out.println("expression dimension -> " + alskdjasdk);

      String var = declared_vars.get(ctx.ID().getText());
      // System.out.println("variable dimension -> " + var);

      if (res != false) { // if there are no problems with the expression or the name of the variable

         /*
          * -> COMENTADO POR CAUSA DO CTX.EXPRESSION() , DESCOMENTAR DPS
          * 
          * 
          * if (!(declared_vars.get(ctx.ID()).equals(ctx.expression().dimension))) {
          * // check if the dimension of the
          * // variable is equal to the dimension
          * // of the expression
          * res = false;
          * ErrorHandling.printError(ctx,
          * "Cant assign expression of dimension -> " + ctx.expression().dimension +
          * " to variable "
          * + ctx.ID().getText() + " of dimension -> " +
          * declared_vars.get(ctx.ID().getText()));
          * return res;
          * }
          * 
          * 
          */
         System.out.println("Passed Assignment check");
         System.out.flush();
      }
      return res;
   }

   @Override
   public Boolean visitInputStatement(dimanaParser.InputStatementContext ctx) {

      Boolean res = true;

      if (!declared_vars.containsKey(ctx.ID(0).getText())) // verificar se esta variavel já foi declarada
      {
         ErrorHandling.printError(ctx, "Variable " + ctx.ID(0).getText() + " is not declared");
         return false;
      }

      if (ctx.ID(1) != null) // se existir um cast
      {
         // ver se o cast que é feito é para a unidade base da dimensão da variável
         try {
            if (!(varMap.get(declared_vars.get(ctx.ID(0).getText())).get(1).equals(ctx.ID(1).getText()))) {
               ErrorHandling.printError(ctx,
                     "Variable " + ctx.ID(0).getText() + " has base unit of "
                           + varMap.get(declared_vars.get(ctx.ID(0).getText())).get(1) + " and a cast attempt to "
                           + ctx.ID(1).getText() + " was made");
               return false;
            }
         } catch (NullPointerException e) { // null pointer aqui significa que a dimensão da unidade base dada não
                                            // existe ( ou a variável não está registada ainda, mas isso já é verificado
                                            // acima)
            ErrorHandling.printError(ctx,
                  "Attempt at casting input (right cast) to a base unit of a dimension that is not declared, base unit -> "
                        + ctx.ID(1).getText() + "!!");
            return false;
         }
      }

      if (ctx.dataType() != null) { // só permitir casts ( na esquerda ) para os tipos de dados base

         if ((ctx.dataType().getText().equals("string")) == false && (ctx.dataType().getText().equals("real")) == false
               &&
               (ctx.dataType().getText().equals("integer")) == false) {
            ErrorHandling.printError(ctx,
                  "Cant cast input given (left cast) to types other than real, string or integer!! An attempt to cast to {"
                        +
                        ctx.dataType().getText() + "} was made");
            return false;
         }
      }

      if (ctx.STRING() != null) { // verificar se a string não é um nome reservado do Java
         if (isReservedName(ctx.STRING().getText())) {
            ErrorHandling.printError(ctx, "Cant use a Java reserved name as a string");
            return false;
         }
      }

      System.out.println("Passed inputStatement verification");
      System.out.flush();

      return res;
   }

   @Override
   public Boolean visitOutputStatement(dimanaParser.OutputStatementContext ctx) {
      Boolean res = true;

      // check if problems with output format exist
      Iterator<dimanaParser.OutputFormatContext> it = ctx.outputFormat().iterator();

      while (it.hasNext()) {
         if (visit(it.next()) == false) {
            res = false;
            return res;
         }
      }

      System.out.println("Passed outputStatement verification");
      System.out.flush();

      return res;
      // return res;
   }

   @Override
   public Boolean visitOutputFormat(dimanaParser.OutputFormatContext ctx) {
      Boolean res = true;

      // iterator of ID

      if (ctx.ID() != null) { //

         String var_name = ctx.ID().getText();

         if (!declared_vars.containsKey(var_name)) // verificar se esta variavel já foi declarada
         {
            ErrorHandling.printError(ctx,
                  "Attempting to print variable " + var_name + " but it is not declared");
            return false;
         }

         // should never get here because this verification is also done on variable
         // declaration beforehand

         if (isReservedName(var_name)) {
            ErrorHandling.printError(ctx,
                  "Attempting to print variable " + var_name + " that has a Java reserved name");
            return false;
         }

      }

      if (ctx.expression() != null) { // prints of array indexes

         if (visit(ctx.expression()) == false) // problems with the expression
            return false;

         String array_name = ctx.expression().varName;

         if (!declared_lists.containsKey(array_name)) // verificar se esta lista já foi declarada
         {
            ErrorHandling.printError(ctx, "Attempting to print list index of list " +
                  array_name + " thats not declared");
            return false;
         }

         // verificar se o valor do indice é o mesmo que tá na for loop, não sei bem como
         // fazer isso
         // por exemplo se é for ( int i = 0 ; ... ; i++) , verificar se tá a ser printed
         // nmecs[i]

      }

      System.out.println("Passed outputFormat verification");
      System.out.flush();
      return res;
      // return res;
   }

   @Override
   public Boolean visitLoopStatement(dimanaParser.LoopStatementContext ctx) {
      Boolean res = true;

      for (TerminalNode idNode : ctx.ID()) {
         if (isReservedName(idNode.getText())) {
            ErrorHandling.printError(ctx, "Can't use a Java reserved name as a loop variable");
            return false;
         }

         if (!declared_vars.containsKey(idNode.getText()) && !declared_lists.containsKey(idNode.getText())) // verificar
                                                                                                            // se esta
                                                                                                            // variavel
                                                                                                            // já foi
                                                                                                            // declarada
         {
            ErrorHandling.printError(ctx,
                  "Cant loop over variable or list " + idNode.getText() + " because it is not declared");
            return false;
         }
      }

      // check if start value is smaller than end value??
      // check if start value is smaller than end value??
      // check if start value is smaller than end value??
      // check if start value is smaller than end value??
      // cant do this unless i store the value of the variable in somewhere

      System.out.println("Passed loopStatement verification");
      System.out.flush();

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
   public Boolean visitAlternativeUnit(dimanaParser.AlternativeUnitContext ctx) {
      Boolean res = true;
      return res;
      // return res;
   }

   @Override
   public Boolean visitListDeclaration(dimanaParser.ListDeclarationContext ctx) {

      Boolean res = visit(ctx.dataType(0)) && visit(ctx.dataType(1));

      String list_type = ctx.dataType(0).type;

      if (!varMap.containsKey(list_type)) {
         ErrorHandling.printError(ctx, "Trying to declare a list {" + ctx.ID().getText() + "} with an invalid ( not declared ) dimension " + list_type + " is not a valid dimension type");
         return false;
      }

      if (!list_type.equals(ctx.dataType(1).type)) {
         ErrorHandling.printError(ctx, "Trying to declare a List {" + ctx.ID().getText() + "} with type {" + list_type + "} that is not the same as the type of the list elements -> " + ctx.dataType(1).type);
         return false;
      }

      if (isReservedName(ctx.ID().getText())) {
         ErrorHandling.printError(ctx, "Can't use a Java reserved name as a list name");
         return false;
      }

      declared_lists.put(ctx.ID().getText(), ctx.dataType(0).type);

      return res;
      // return res;
   }

     /* -> Removed from grammar for now
     @Override
     public Boolean visitExprListExpression(dimanaParser.ExprListExpressionContext ctx) {
     Boolean res = true;
     return res;
     // return res;
     }
     */
    

   /*
    * not being used i think
    * 
    * @Override
    * public Boolean visitOutputExpression(dimanaParser.OutputExpressionContext
    * ctx) {
    * Boolean res = true;
    * return res;
    * // return res;
    * }
    */

   @Override
   public Boolean visitIndexExpression(dimanaParser.IndexExpressionContext ctx) {

      if (isReservedName(ctx.ID(0).getText()) || isReservedName(ctx.ID(1).getText())) {
         ErrorHandling.printError(ctx, "Can't use a Java reserved name as a list name or index name");
         return false;
      }

      ctx.varName = ctx.ID(0).getText();
      return true;
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

   @Override
   public Boolean visitProgram(dimanaParser.ProgramContext ctx) {
      // add the default types/dimensions for verification purposes
      varMap.put("string", new ArrayList<String>() {
         {
            add("string");
         }
      });
      varMap.put("real", new ArrayList<String>() {
         {
            add("real");
         }
      });
      varMap.put("integer", new ArrayList<String>() {
         {
            add("integer");
         }

      });
      return visitChildren(ctx);
      // return res;
   }

   // nothing to be checked here
   @Override
   public Boolean visitLength(dimanaParser.LengthContext ctx) {
      Boolean res = true;
      return res;
      // return res;
   }

   // nothing to be checked here
   @Override
   public Boolean visitWrite_expr(dimanaParser.Write_exprContext ctx) {
      Boolean res = true;
      return res;
      // return res;
   }

   /*
    * -> This gets treated in precompiler, this rule never gets visited
    * 
    * @Override
    * public Boolean visitHeaderFile(dimanaParser.HeaderFileContext ctx) {
    * Boolean res = true;
    * return res;
    * // return res;
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

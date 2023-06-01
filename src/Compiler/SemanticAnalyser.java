import static java.lang.System.*;
import org.antlr.v4.runtime.tree.ParseTreeProperty;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.TerminalNode;
import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.math.BigInteger;

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


   public  HashMap<String, ArrayList<String>> getDependent_units() {
      return dependent_units;
   }

   public  HashMap<String, String> getDeclared_lists() {
      return declared_lists;
   }

   public  HashMap<String, String> getDeclared_vars() {
      return declared_vars;
   }

   public  HashMap<String, ArrayList<String>> getConversions() {
      return conversions;
   }

   public  HashMap<String, ArrayList<String>> getVarMap() {
      return varMap;
   }


   @Override
   public Boolean visitIndependentUnit(dimanaParser.IndependentUnitContext ctx) {

      Boolean res = visit(ctx.dataType());

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

            //System.out.println("Added dimension " + ctx.ID(0).getText() + " with base unit " + ctx.ID(1).getText()
              //    + " and suffix " + ctx.ID(2).getText());

         } else {

            // independent units without suffix given
            varMap.put(ctx.ID(0).getText(), new ArrayList<String>() {
               {
                  add(ctx.dataType().type); // datatype -> real, integer
                  add(ctx.ID(1).getText()); // base unit -> meter, second
               }
            });
            //System.out.println("Added dimension " + ctx.ID(0).getText() + " with base unit " + ctx.ID(1).getText());

         }

         //conversions.put(ctx.ID(1).getText(),1.0);

      }
      //System.out.println("Passed IndependentUnit check");
      //System.out.flush();

      return res;
   }

   @Override
   public Boolean visitDependantUnit(dimanaParser.DependantUnitContext ctx) {

      Boolean res = visit(ctx.expression()) && visit(ctx.dataType());

      // System.out.println("New unit " + ctx.ID(0).getText() + " with dimension " +
      // ctx.expression().dimension);

      if (varMap.containsKey(ctx.ID(0).getText())) {
         ErrorHandling.printError(ctx, "Unit " + ctx.ID(0).getText() + " already exists");
         return false;
      }

      for (String key : varMap.keySet()) {
         if (varMap.get(key).size() == 3) {
            if (varMap.get(key).get(1).equals(ctx.expression().dimension)) {
               ErrorHandling.printError(ctx,
                     "A unit with the same representation of " + ctx.ID(0).getText() + " already exists");
               return false;
            }
         }
      }

      varMap.put(ctx.ID(0).getText(), new ArrayList<String>() {
         {
            add(ctx.dataType().type);
            add(ctx.expression().dimension);
         }
      });

      System.out.println("Added dimension " + ctx.ID(0).getText() + " with dimension " + ctx.expression().dimension);

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

            if (varMap.get(var_dataType).size() > 1 && varMap.get(expr_dataType).size() > 1) {


               if (var_dataType.equals(expr_dataType) || varMap.get(var_dataType).get(1).equals(expr_dataType)
                     || varMap.get(expr_dataType).get(1).equals(var_dataType)) { // verificar se a dimensão da variável
                                                                                 // é igual à resultante da
                  // expressão
                  declared_vars.put(varName, var_dataType);
                  return true;
               } else {
                  ErrorHandling.printError(ctx, "Cant assign expression of dimension -> " +
                        var_dataType + " to variable "
                        + varName + " of dimension -> " + expr_dataType);
                  return false;
               }
            }

         }

         declared_vars.put(varName, var_dataType);

      }
      //System.out.println("Passed Variable Declaration check");
      //System.out.flush();
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
         //System.out.println("Visit assignment for variable " + ctx.ID().getText() + " expression dimension  -> "
           //    + ctx.expression().dimension);
         // System.out.println("CTX.ID() -> " + ctx.ID().getText());
         // System.out.println("Declared vars -> " + declared_vars.toString());

         String var_dim = declared_vars.get(ctx.ID().getText());

         //System.out.println(ctx.expression().dimension);
         //System.out.println(var_dim);

        
         if (!(var_dim.equals(ctx.expression().dimension)) && !(varMap.get(var_dim).get(1)
               .equals(ctx.expression().dimension)) ) {
            // check if the dimension of the
            // variable is equal to the dimension
            // of the expression
            res = false;
            ErrorHandling.printError(ctx,
                  "Cant assign expression of dimension -> " + ctx.expression().dimension +
                        " to variable "
                        + ctx.ID().getText() + " of dimension -> " +
                        declared_vars.get(ctx.ID().getText()));
            return res;
         }

         //System.out.println("Passed Assignment check");
         //System.out.flush();
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

      //System.out.println("Passed inputStatement verification");
      //System.out.flush();

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

      //System.out.println("Passed outputStatement verification");
      //System.out.flush();

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

      //System.out.println("Passed outputFormat verification");
      //System.out.flush();
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


      if (ctx.INT(0)!= null && ctx.INT(1)!= null){

         if (Integer.parseInt(ctx.INT(0).getText()) > Integer.parseInt(ctx.INT(1).getText())){
            ErrorHandling.printError(ctx,
                 " End value is smaller than start value in loop statement");
            return false;
         }
      }

      // check if start value is smaller than end value??
      // check if start value is smaller than end value??
      // check if start value is smaller than end value??
      // check if start value is smaller than end value??
      // cant do this unless i store the value of the variable in somewhere

      //ystem.out.println("Passed loopStatement verification");
      //System.out.flush();

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
      
      Boolean res = visit(ctx.expression());
      String type = ctx.expression().dimension;

      if (isReservedName(ctx.ID(0).getText())) {
         ErrorHandling.printError(ctx, "Unit " + ctx.ID(0) + " cant use a Java reserved name");
         return false;
      }

      if (isReservedName(ctx.ID(1).getText())) {
         ErrorHandling.printError(ctx, "Unit " + ctx.ID(0) + " cannot use a base unit thats a Java reserved name");
         return false;
      }


      if (!type.equals(ctx.ID(0).getText())){
         ErrorHandling.printError(ctx, "Trying to define a alternative unit of dimension" + type + " for a unit of a different dimension " + ctx.ID(0).getText());
         return false;
      }

      if (!varMap.containsKey(ctx.ID(0).getText())) {
         ErrorHandling.printError(ctx, "Trying to define a alternative unit " + ctx.ID(1).getText() + " for a dimension that is not declared -> " + ctx.ID(0).getText());
         return false;
      }

      String unit = ctx.ID(1).getText();
      String[] exprs = ctx.expression().getText().split("[/*]");
      
      conversions.put(unit, new ArrayList<String>(){{ // save the conversion with the following format {inch : ["0.0254", "meter", "m"], ...}
         add(exprs[0]);
         add(exprs[1]);
      }});

      if (ctx.ID(2)!=null){ // add the suffix if it exists
         conversions.get(unit).add(ctx.ID(2).getText());
      }
      
      return res;
   }

   @Override
   public Boolean visitListDeclaration(dimanaParser.ListDeclarationContext ctx) {

      Boolean res = visit(ctx.dataType(0)) && visit(ctx.dataType(1));

      String list_type = ctx.dataType(0).type;

      if (!varMap.containsKey(list_type)) {
         ErrorHandling.printError(ctx, "Trying to declare a list {" + ctx.ID().getText()
               + "} with an invalid ( not declared ) dimension " + list_type + " is not a valid dimension type");
         return false;
      }

      if (!list_type.equals(ctx.dataType(1).type)) {
         ErrorHandling.printError(ctx, "Trying to declare a List {" + ctx.ID().getText() + "} with type {" + list_type
               + "} that is not the same as the type of the list elements -> " + ctx.dataType(1).type);
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

   /*
    * -> Removed from grammar for now
    * 
    * @Override
    * public Boolean visitExprListExpression(dimanaParser.ExprListExpressionContext
    * ctx) {
    * Boolean res = true;
    * return res;
    * // return res;
    * }
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

   // not being used at the moment
   @Override
   public Boolean visitInputExpression(dimanaParser.InputExpressionContext ctx) {

      if (isReservedName(ctx.STRING().getText())) {
         ErrorHandling.printError(ctx, "Can't use a Java reserved name as a string");
         return false;
      }
      Boolean res = true;
      return res;
      // return res;
   }

   @Override
   public Boolean visitAddSubExpression(dimanaParser.AddSubExpressionContext ctx) {
      Boolean res = true;

      if (!(ctx.expression(0).type.equals(ctx.expression(1).type))) {
         ErrorHandling.printError(ctx, "Trying to add/subtract variables of different types");
         return false;
      }
      return res;
      // return res;
   }

   @Override
   public Boolean visitRealLiteral(dimanaParser.RealLiteralContext ctx) {
      ctx.dimension = "real";
      Boolean res = true;
      return res;
      // return res;
   }
   /*
    * @Override
    * public Boolean
    * visitStringAssignExpression(dimanaParser.StringAssignExpressionContext ctx) {
    * Boolean res = true;
    * return res;
    * // return res;
    * }
    */

   @Override
   public Boolean visitTypeConversion(dimanaParser.TypeConversionContext ctx) {
      Boolean res = visit(ctx.expression()) && visit(ctx.dataType());
      String convert_type = ctx.dataType().type;
      if (convert_type.equals("real")){
         try { 
            Double.parseDouble(ctx.expression().getText());
         } catch (NumberFormatException e) {
            ErrorHandling.printError(ctx, "Trying to convert a non-numeric value to real");
            return false;

         }
      }
      else if ( convert_type.equals("string"))
         return true; // any value can be converted to a string 
      else {
         try {
            Integer.parseInt(ctx.expression().getText());
         } catch (NumberFormatException e) {
            ErrorHandling.printError(ctx, "Trying to convert a non-numeric value to integer");
            return false;
         }
      }
      return res;
      // return res;
   }

   @Override
   public Boolean visitStringLiteral(dimanaParser.StringLiteralContext ctx) {
      ctx.dimension = "string";
      Boolean res = true;
      return res;
      // return res;
   }

   @Override
   public Boolean visitIdExpression(dimanaParser.IdExpressionContext ctx) {
      Boolean res = true;

      if (isReservedName(ctx.ID().getText())) {
         ErrorHandling.printError(ctx,
               "Can't use a Java reserved name as a variable name");
         return false;
      }

     //System.out.println(decla red_vars);
      if (declared_vars.containsKey(ctx.ID().getText())) {
         try {
            ctx.dimension = declared_vars.get(ctx.ID().getText()); // its a variable
         } catch (Exception e) {
            ctx.dimension = declared_lists.get(ctx.ID().getText()); // its a list
         }
         return res;
      }

      ctx.dimension = ctx.ID().getText();

      // System.out.println("Varmap " + varMap );
      // System.out.println("Checking for decomposal with unit " + ctx.dimension + " ,
      // does varMap have it? " + varMap.containsKey(ctx.dimension));
      if (varMap.containsKey(ctx.dimension)) {
         if (varMap.get(ctx.dimension).get(1).contains("*") || varMap.get(ctx.dimension).get(1).contains("/")) {
            // System.out.print("Entered unit replacement with " + ctx.dimension );
            // System.out.println("Replaced " + ctx.dimension + " for " +
            // varMap.get(ctx.dimension).get(1);
            ctx.dimension = "(" + varMap.get(ctx.dimension).get(1) + ")";
         }

      }

      //System.out.println("Dimension of " + ctx.ID().getText() + " is " + ctx.dimension);

      return res;
      // return res;
   }

   @Override
   public Boolean visitParenExpression(dimanaParser.ParenExpressionContext ctx) {
      Boolean res = visit(ctx.expression());
      ctx.dimension = ctx.expression().type;
      return res;
      // return res;
   }

   @Override
   public Boolean visitIntLiteral(dimanaParser.IntLiteralContext ctx) {
      ctx.dimension = "integer";
      Boolean res = true;
      return res;
      // return res;
   }

   @Override
   public Boolean visitInputTypeExpression(dimanaParser.InputTypeExpressionContext ctx) {
      Boolean res = true;

      if (ctx.castTypes() != null) {

         if (!ctx.castTypes().getText().equals("real") && !ctx.castTypes().getText().equals("integer")) {
            ErrorHandling.printError(ctx,
                  "Trying to cast input expression to an invalid type, valid types ->" + "real" + " or " + "integer");
            return false;
         }

      }

      ctx.dimension = "invalid";
      // "invalid" type will be used to signify that this expression cannot be used in
      // an
      // assignment or with another expression
      return res;
   }

   @Override
   public Boolean visitMulDivExpression(dimanaParser.MulDivExpressionContext ctx) {

      Boolean res = visit(ctx.expression(0)) && visit(ctx.expression(1));

      String dimension_1 = ctx.expression(0).dimension;
      String dimension_2 = ctx.expression(1).dimension;


      //System.out.println("Dimensão 1 no muldiv " + dimension_1 + " dimensão 2 " + dimension_2);

      String operator = ctx.op.getText();

      // System.out.println("VARMAP " + varMap);
      // System.out.println("DECLARED VARS " + declared_vars);

      if (dimension_1.equals("invalid") || dimension_2.equals("invalid")) {
         ErrorHandling.printError(ctx, "Trying to multiply/divide an invalid expression");
         return false;
      }

      if (dimension_1.equals("integer") && dimension_2.equals("integer")){
         ctx.dimension = "integer";
         return res;
      }

      if (dimension_1.equals("real") && dimension_2.equals("real")){
         ctx.dimension = "real";
         return res;
      }

      if (dimension_1.equals("integer") || dimension_1.equals("real")) {
         // operation between a number and a unit , will return to visitAssignment or
         // visitAlternativeUnit
         // such as 2 * meter , or for the alternative units , 0.2345 * meter

         System.out.println("Dimensão 1 no muldiv " + dimension_1 + " dimensão 2 " + dimension_2);

         for (String s : varMap.keySet()) {

            // find the dimension of the 2nd expression , for example, find dimension Length
            // for unit meter

            if (varMap.get(s).size() == 3) { // size() of "dimensions" string,real,integer is always 1, need to avoid
                                             // those

            // 3*inch 
           
              if (varMap.get(s).get(1).equals(dimension_2))  // normal units
                {

                  ctx.dimension = s;
               }
            }
         }
         if (ctx.dimension.isEmpty() || ctx.dimension == null){

            for (String s : varMap.keySet()) {

               // find the dimension of the 2nd expression , for example, find dimension Length
               // for unit meter
   
               if (varMap.get(s).size() == 3) { // size() of "dimensions" string,real,integer is always 1, need to avoid
                                                // those
   
                  // 3*inch 
              
                  if (varMap.get(s).get(1).equals(conversions.get(dimension_2).get(1))) { // normal units
                     ctx.dimension = s;
                  }
               }
            }
         }  
      } else if (declared_vars.containsKey(dimension_1) || declared_vars.containsKey(dimension_2)) {
         // operation that involves a variable and a unit, will return to visitAssignment
         // in this case the dimension variables may be the naem of the variables being
         // used

         dimension_1 = declared_vars.get(dimension_1);
         dimension_2 = declared_vars.get(dimension_2);
         String resulting_dimension = null;

         for (String dim : varMap.keySet()) {
            if (varMap.get(dim).size() != 1) { // skip real integer string default types, they have size 1
               if (varMap.get(dim).get(1).equals(dimension_1 + operator + dimension_2)) {
                  resulting_dimension = dim;
               }
            }
         }

         if (!dimension_1.equals(dimension_2)) {

            if (resulting_dimension == null) {
               // multiplications/divisions between variables of different dimensions will only
               // be allowed
               // if the resulting dimension is already defined

               ErrorHandling.printError(ctx,
                     "Trying to multiply/divide variables of different dimensions " + "{" + dimension_1 + "}" + " and "
                           + "{" + dimension_2 + "}\nThe resulting dimension would be " + "{" + dimension_1 + operator
                           + dimension_2 + "}" + " but it is not defined");
            }

            else {
               ctx.dimension = resulting_dimension;
            }

         }

      } else { // assign of a new
         // dependant unit,
         // will return to
         // visitDependantUnit

         String full_dim = dimension_1 + operator + dimension_2;
         full_dim = full_dim.replaceAll("[()]", "");

         String[] split_dim = full_dim.split("[/*]");

         for (String dim : split_dim) {

            if (!varMap.containsKey(dim)) {
               ErrorHandling.printError(ctx, "Dimension {" + dim + "} is trying to be used but does not exist ( not declared )");
            }
         }

         ctx.dimension = dimension_1 + operator + dimension_2;

         ctx.dimension = dimensionDivision(ctx.dimension).toString(); // reduce the fraction of dimensions


      }
      return res;
   }

   private static String dimensionDivision(String equation) {
      List<String> numerador = new ArrayList<String>();
      List<String> denominador = new ArrayList<String>();
      List<String> dimensions = new ArrayList<String>();
      List<String> operations = new ArrayList<String>();

      dimensions.addAll(Arrays.asList(equation.split("[/*()]")));
      dimensions.removeAll(Arrays.asList("", null));
      operations.addAll(Arrays.asList(equation.split("[0-9a-zA-Z]+")));
      operations.removeAll(Arrays.asList("", null));
      boolean inverted = false;

      numerador.add(dimensions.get(0));
      int dim_index = 1;
      for (String op : operations) {
         if (op.matches("[)]{0,}[/]")) {
            if (!inverted) {
               denominador.add(dimensions.get(dim_index));
            } else {
               numerador.add(dimensions.get(dim_index));
            }
            dim_index++;
         } else if (op.matches("[)]{0,}[*][(]{0,}")) {
            if (!inverted) {
               numerador.add(dimensions.get(dim_index));
            } else {
               denominador.add(dimensions.get(dim_index));
            }
            dim_index++;
         } else if (op.matches("[/][(]{0,}")) {
            if (inverted) {
               inverted = false;
            } else {
               inverted = true;
            }
            if (!inverted) {
               numerador.add(dimensions.get(dim_index));
            } else {
               denominador.add(dimensions.get(dim_index));
            }
            dim_index++;
         }
      }

      List<String> temp = new ArrayList<String>(denominador);
      for (String dim : temp) {
         if (numerador.contains(dim)) {
            numerador.remove(dim);
            denominador.remove(dim);
         }
      }

      StringBuilder final_str = new StringBuilder();
      for (String dim : numerador) {
         final_str.append(dim);
         final_str.append("*");
      }
      final_str.deleteCharAt(final_str.length() - 1);
      if (denominador.size() > 0) {
         final_str.append("/");
         if (denominador.size() > 1) {
            final_str.append("(");
         }
         for (String dim : denominador) {
            final_str.append(dim);
            final_str.append("*");
         }
         final_str.deleteCharAt(final_str.length() - 1);
         if (denominador.size() > 1) {
            final_str.append(")");
         }
      }
      // clear all arrays
      numerador.clear();
      denominador.clear();
      dimensions.clear();
      operations.clear();

      return final_str.toString();
   }

   @Override
   public Boolean visitDataType(dimanaParser.DataTypeContext ctx) {
      ctx.type = ctx.getText();
      // System.out.println("VISIT DATATYPE " + ctx.type);
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

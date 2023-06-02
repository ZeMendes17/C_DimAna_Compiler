
import java.util.*;

import org.stringtemplate.v4.*;

@SuppressWarnings("CheckReturnValue")
public class DimanaCompiler extends dimanaBaseVisitor<ST> {

   private STGroup templates = new STGroupFile("dimana.stg"); // stg file to be used
   private int varCount = 0; // variable counter
   HashMap<String, ArrayList<String>> varMap = new HashMap<String, ArrayList<String>>();
   // usem este array para guardar as coisas sobre variaveis/dimensoes
   // por exemplo --> {Length : [real, meter, m], ...}

   HashMap<String, ArrayList<String>> conversions = new HashMap<>();
   // vai guardar por exemplo --> {inch : ["0.0254", "meter"], ...}

   HashMap<String, String> declared_vars = new HashMap<String, String>();
   // guardar as variaveis -----> {l : Length}
   
   HashMap<String, ArrayList<String>> dependent_units = new HashMap<String, ArrayList<String>>();
   private static HashMap<String, String> declared_lists = new HashMap<String, String>();
   // guardar dependencias das unidades dependentes
   // p.ex Volume -> [Length, Length, Length]
   int temp_var_counter = 1; 


   public DimanaCompiler(HashMap<String, ArrayList<String>> dependent_units, HashMap<String, ArrayList<String>> varMap, HashMap<String, ArrayList<String>> conversions, HashMap<String, String> declared_vars, HashMap<String, String> declared_lists){
      this.varMap = varMap;
      this.conversions = conversions;
      this.declared_vars = declared_vars;
      this.dependent_units = dependent_units;
      this.declared_lists = declared_lists;
   }


   ArrayList<String> default_types = new ArrayList<String>() {
      {
         add("integer");
         add("real");
         add("string");
      }
   };

   @Override
   public ST visitProgram(dimanaParser.ProgramContext ctx) {
      ST res = templates.getInstanceOf("module");
      res.add("stat", visit(ctx.statList()));
      //res.add("name", "DimanaCompiled");
      return res;
   }

   @Override
   public ST visitStatList(dimanaParser.StatListContext ctx) {
      ST res = templates.getInstanceOf("stats");
      for (dimanaParser.StatementContext sc : ctx.statement())
         res.add("stat", visit(sc));
      return res;
   }

  /* 
   @Override
   public ST visitIndependentUnit(dimanaParser.IndependentUnitContext ctx) {
     // as variaveis independentes já sao definidas na análise semantica e estão presentes no array associativo varMap
      return visitChildren(ctx);
      // return res;
   }
   */
  

   @Override
   public ST visitDependantUnit(dimanaParser.DependantUnitContext ctx) {

      String dimension_name = ctx.ID(0).getText();
      String dataType = ctx.dataType().getText();

      String expression = visit(ctx.expression()).render();

      // dependant units that have suffix provided are already defined in the semantic analysis

      // when there is no suffix provided, we will calculate it ourselves based on the units that the dimension is dependent on
      if (ctx.ID(2) == null) { 

         String expressao_variavel = expression;
         String unit_dependency = expressao_variavel.replace(";", "");
         String[] dimParts = unit_dependency.split("(?<=[*|/|+|-])|(?=[*|/|+|-])"); 
         
         dependent_units.put(dimension_name, new ArrayList<String>() {
            {
               add(unit_dependency);
            }
         });

         StringBuilder sb = new StringBuilder();

         // calcular a unidade SI da dimensão dependente a partir das unidades SI das dimensões a que está associada
         for (int i = 0; i < dimParts.length; i++) {
            if (dimParts[i].equals("*") || dimParts[i].equals("/") || dimParts[i].equals("+")
                  || dimParts[i].equals("-"))
               sb.append(dimParts[i]);
            else {
               sb.append(varMap.get(dimParts[i]).get(2));
            }
         }

         // add the unit with the suffix created to the hashmap
         varMap.put(dimension_name, new ArrayList<String>() {
            {
               add(dataType);
               add(unit_dependency);
               add(sb.toString());
            }
         });

         

      }
      return null;
   }

   @Override
   public ST visitVariableDeclaration(dimanaParser.VariableDeclarationContext ctx) {
      // NMEC n (dataType ID )
      visit(ctx.dataType());
      String id = ctx.ID().getText();
      String expression = "";
      // so se tem dataType e id garantidos, a expression é opcional

      if (ctx.expression() != null) {
         expression = ctx.expression().getText(); // expressions mal feitas são verificadas na semantica
      }

      //System.out.println(visit(ctx.expression()));

      ST variable_declaration = null;

      if (ctx.dataType().type.equals("string") || ctx.dataType().type.equals("real") || ctx.dataType().type.equals("integer")) {
         if (ctx.expression() != null) {
            variable_declaration = templates.getInstanceOf("decl_value");
            variable_declaration.add("type", ctx.dataType().type);
            variable_declaration.add("var", id);
            variable_declaration.add("value", expression);
         } else {
            variable_declaration = templates.getInstanceOf("decl");
            variable_declaration.add("type", ctx.dataType().type);
            variable_declaration.add("var", id);
         }

      } else {

         if (expression.isEmpty()) { // não é dado um valor inicial
            variable_declaration = templates.getInstanceOf("declare_var");
            variable_declaration.add("unit", ctx.dataType().type);
            variable_declaration.add("name", id);

            // avoid the default variables in varMap, string real or integer, that only have size 1
            if (varMap.get(ctx.dataType().type).size() == 3) {
               String suffix = varMap.get(ctx.dataType().type).get(2);
               variable_declaration.add("suffix", suffix);

            }

         } else { // é dado um valor inicial ( expression )
            variable_declaration = templates.getInstanceOf("declare_var_with_value");
            variable_declaration.add("unit", ctx.dataType().type);
            variable_declaration.add("name", id);
            variable_declaration.add("value", visit(ctx.expression()).render());
            //System.out.println("Variavel  + " + id + " declarada com sucesso" + " do tipo " + dataType);

            if (varMap.get(ctx.dataType().type).size() != 1) {
               String suffix = varMap.get(ctx.dataType().type).get(2);
               variable_declaration.add("suffix", suffix);
            }
         }
      }
      return variable_declaration;
   }

   @Override
   public ST visitInputStatement(dimanaParser.InputStatementContext ctx) {
      if (ctx.dataType() != null) { // vai ser feito cast
         visit(ctx.dataType());
         String var_dataType = ctx.dataType().type;



         String var_name = ctx.ID(0).getText();
         String unidade_dimensão = ctx.ID(1).getText();
         String dimensão = "";
         for (String s : varMap.keySet()) {
            if (varMap.get(s).contains(unidade_dimensão)) {
               dimensão = s;
               break;
            }
         }

         ST read_and_cast = templates.getInstanceOf("read_and_cast");
         read_and_cast.add("type", var_dataType);
         read_and_cast.add("var", var_name);
         // read_and_cast.add("dimension", dimensão);
         read_and_cast.add("temp", temp_vars());
         return read_and_cast;

      } else { // não vai ser feito um cast diretamente ( é uma string)
         String nome_var = ctx.ID(0).getText();
         ST read = templates.getInstanceOf("read");
         read.add("var", nome_var);
         read.add("temp", temp_vars());
         return read;
      }
   }



   // due to the concatenation of statements inside a print statement, a string
   // builder was used in this method
   // because we couldnt know how much statements we had to print inside a write
   // statement beforehand
   // for example : writeln string(10,n) string(20,x)
   // it would be hard to define a string template for a case like this, because
   // the number of arguments would be variable
   @Override
   public ST visitOutputStatement(dimanaParser.OutputStatementContext ctx) {

      int print_amount = ctx.outputFormat().size();
      ST print = null;
      StringBuilder sb = new StringBuilder();
      String write_expr = ctx.write_expr().getText();
      if (write_expr.equals("writeln"))
         print = templates.getInstanceOf("println");
      else
         print = templates.getInstanceOf("print");
      // System.out.println("print amount " + print_amount + "\n");

      for (int i = 0; i < print_amount; i++) {
         String output_format = ctx.outputFormat(i).getText();

         if (ctx.outputFormat(i).INT() != null) { // write a formatted string
            String string_length = ctx.outputFormat(i).INT().getText();

            if (ctx.write_expr().getText().equals("write")) { // ''write'' statement

               if (ctx.outputFormat(i).ID() != null) { // write a ID ( variable )
                  String var_name = ctx.outputFormat(i).ID().getText();


                  // print id
                  String var_type = varMap.get(declared_vars.get(var_name)).get(0);
                  var_type = convert_Types(var_type);
                  if (var_type.equals("string")) {
                     sb.append("String.format(\"%" + string_length + "s" + "\"," + var_name + ")");

                  } else {
                     sb.append("String.format(\"%" + string_length + "s" + "\"," + var_name + ".getValue_"
                           + var_type + "())");

                  }
                  if (i == print_amount - 1) // if its the last one
                  {
                     print.add("value", sb.toString());
                     sb.setLength(0);
                  } else
                     sb.append(" + ");

               } else if (ctx.outputFormat(i).STRING() != null) { // write a string

                  String print_string = ctx.outputFormat(i).STRING().getText();
                  sb.append("String.format(\"%" + string_length + "s" + "\"," + print_string + ")");
                  if (i == print_amount - 1) // if its the last one
                  {
                     print.add("value", sb.toString());
                     sb.setLength(0);
                  } else
                     sb.append(" + ");

               } else { // write a array index

                  String array_value = ctx.outputFormat(i).expression().getText();
                  String array_name;
                  String array_idx;

                  int startIndex = array_value.indexOf('[');
                  array_name = array_value.substring(0, startIndex);

                  int endIndex = array_value.indexOf(']');
                  array_idx = array_value.substring(startIndex + 1, endIndex);

                  String datatype_of_idx = varMap.get(declared_vars.get(array_name)).get(0);
                  datatype_of_idx = convert_Types(datatype_of_idx); // convert it to integer, string or double for use
                                                                    // with
                                                                    // DimensionVar
                  if (datatype_of_idx.equals("string"))
                     sb.append(
                           "String.format(\"%" + string_length + "s" + "\"," + array_name + ".get(" + array_idx + ")");
                  else
                     sb.append(
                           "String.format(\"%" + string_length + "s" + "\"," + array_name + ".get(" + array_idx + ")"
                                 + ".getValue_" + datatype_of_idx + "()");
                  if (i == print_amount - 1) // if its the last one
                  {
                     print.add("value", sb.toString());
                     sb.setLength(0);
                  } else
                     sb.append(" + ");

               }

                

            } else if (ctx.write_expr().getText().equals("writeln")) { // writeln

               if (ctx.outputFormat(i).ID() != null) { // writeln a ID ( variable )

                  String var_name = ctx.outputFormat(i).ID().getText();


                  String var_type = varMap.get(declared_vars.get(var_name)).get(0);
                  if (var_type.equals("real"))
                     var_type = "double";
                  if (var_type.equals("string"))
                     sb.append("String.format(\"%" + string_length + "s" + "\"," + var_name + ")");
                  else
                     sb.append("String.format(\"%" + string_length + "s" + "\"," + var_name + ".getValue_"
                           + var_type + "())");

                  if (i == print_amount - 1) // if its the last one
                  {
                     print.add("value", sb.toString());
                     sb.setLength(0);
                  } else
                     sb.append(" + ");

               }

               else if (ctx.outputFormat(i).STRING() != null) { // writeln a string

                  String print_string = ctx.outputFormat(i).STRING().getText();
                  sb.append("String.format(\"%" + string_length + "s" + "\"," + print_string + ")");
                  if (i == print_amount - 1) // if its the last one
                  {
                     print.add("value", sb.toString());
                     sb.setLength(0);
                  } else
                     sb.append(" + ");

               } else { // writeln a array index

                  String array_value = ctx.outputFormat(i).expression().getText();
                  String array_name;
                  String array_idx;

                  int startIndex = array_value.indexOf('[');
                  array_name = array_value.substring(0, startIndex);

                  // Extracting the "i" value
                  int endIndex = array_value.indexOf(']');
                  array_idx = array_value.substring(startIndex + 1, endIndex);

                  String datatype_of_idx = varMap.get(declared_lists.get(array_name)).get(0);
                  datatype_of_idx = convert_Types(datatype_of_idx); // convert it to integer, string or double for use
                                                                    // with
                                                                    // DimensionVar
                  if (datatype_of_idx.equals("string"))
                     sb.append(
                           "String.format(\"%" + string_length + "s" + "\"," + array_name + ".get(" + array_idx + "))");
                  else
                     sb.append(
                           "String.format(\"%" + string_length + "s" + "\"," + array_name + ".get(" + array_idx + ")"
                                 + ".getValue_" + datatype_of_idx + "())");
                  if (i == print_amount - 1) // if its the last one
                  {
                     print.add("value", sb.toString());
                     sb.setLength(0);
                  } else
                     sb.append(" + ");
               }
            }

         } else { // write just a variable or a string , variable -> here is the case when we dont
                  // need right aligned strings

            if (ctx.outputFormat(i).STRING() == null) { // é so write variavel, nunca deve entrar aqui pelos exemplos
               String var_name = ctx.outputFormat(i).ID().getText();

               /* ANALISE SEMANTICA 
               if (!declared_vars.containsKey(var_name)) {
                  //System.out.println("Variável " + var_name + " usada antes de ser declarada");
                  System.exit(0);
               }
               */

               String var_type = varMap.get(declared_vars.get(var_name)).get(0);
               if (var_type.equals("real"))
                  var_type = "double";
               if (var_type.equals("string"))
                  sb.append(var_name);
               else
                  sb.append(var_name + ".getValue_" + var_type + "()+ " + var_name + ".getSuffix()");
               if (i == print_amount - 1) // if its the last one
               {
                  print.add("value", sb.toString());
                  sb.setLength(0);
               } else
                  sb.append(" + ");
            } else {
               String print_string = ctx.outputFormat(i).STRING().getText();
               String var_name = ctx.outputFormat(i).ID().getText();
               String var_type = varMap.get(declared_vars.get(var_name)).get(0);
               if (var_type.equals("real"))
                  var_type = "double";
               if (var_type.equals("string"))
                  sb.append(var_name);
               else
                  sb.append(print_string +"+"+ var_name + ".getValue_" + var_type + "()+ " + var_name + ".getSuffix()");
               if (i == print_amount - 1) // if its the last one
               {
                  print.add("value", sb.toString());
                  sb.setLength(0);
               } else
                  sb.append("+");

            }

         }
      }
      //System.out.println("Declared vars -> " + declared_vars.toString());
      //System.out.println("VarMap -> " + varMap.toString());
      //System.out.println("Dependent units -> " + dependent_units.toString());
      return print;

   }

   public String convert_Types(String type) {
      if (type.equals("real"))
         return "double";
      else if (type.equals("string"))
         return "string";
      else
         return "integer";
   }
  
   @Override
   public ST visitListDeclaration(dimanaParser.ListDeclarationContext ctx) {

      visit(ctx.dataType(0));

      String datatype = ctx.dataType(0).type;
      ST list = null;
      String list_name = ctx.ID().getText();

      if (!default_types.contains(datatype)) {
         // verificar se já existe uma lista com este nome maybe?
         list = templates.getInstanceOf("declare_list_dvar"); // declare list for declared dimensions
         list.add("var", list_name);
         list.add("type", "DimensionVar");
         list.add("unit", datatype);
      }

      else {
         // verificar se já existe uma lista com este nome maybe?
         list = templates.getInstanceOf("declare_list_dtypes"); // declare list for default types, real integer string
         list.add("var", list_name);
         list.add("type", datatype);
      }

      return list;

   }
   

   @Override
   public ST visitLoopStatement(dimanaParser.LoopStatementContext ctx) {
      

      int expression_amount = ctx.expression().size(); // amount of expressions/statements inside the for loop
      ST loop_statement = templates.getInstanceOf("for_loop");
      boolean is_length;
      String for_loop_statements = "";
      String final_value = "";
      String initial_value;

      if (ctx.INT(1) != null) // final value of for loop is a INT
         final_value = ctx.INT(1).getText();

      if (ctx.ID(1) != null && ctx.ID(2) != null)
         final_value = ctx.ID(2).getText();

      if (ctx.INT(0) != null)
         final_value = ctx.ID(1).getText();

      if (ctx.length() != null)
         final_value = final_value + ".size()-1";

     

      for (int i = 0; i < expression_amount; i++) {
         // System.out.println("Visiting expression " + i + " of " + expression_amount +
         // " in for loop");
         for_loop_statements += visit(ctx.expression(i)).render() + "\n";
      }
      if (ctx.ID(1) != null && ctx.INT(0) == null && ctx.INT(1) == null) // initial value is a variable
         initial_value = ctx.ID(1).getText();
      else // initial value is a number
         initial_value = ctx.INT(0).getText();

      loop_statement.add("initial_value", initial_value);
      loop_statement.add("end_value", final_value);
      loop_statement.add("statements", for_loop_statements);

      // visit the expression
      return loop_statement;
   }
   /*
    * @Override
    * public ST visitAddListExpression(dimanaParser.AddListExpressionContext ctx) {
    * ST add_list = templates.getInstanceOf("add_list");
    * String list_name = ctx.ID().getText(); // verificar se esta lista já foi
    * declarada??
    * System.out.println("dies of ctx.expression.render()");
    * String value = visit(ctx.expression()).render();
    * System.out.println(value);
    * add_list.add("listname", list_name);
    * add_list.add("value", value);
    *
    *
    *
    * return add_list;
    * // return res;
    * }
    */

   @Override
   public ST visitInputTypeExpression(dimanaParser.InputTypeExpressionContext ctx) {

      ST input = templates.getInstanceOf("read_toArray"); // its a string
      if (ctx.castTypes() != null) {
         input = templates.getInstanceOf("read_and_cast_toArray");
         input.add("type", ctx.castTypes().getText());
         if (ctx.ID(0) != null && ctx.ID(1) != null) { // cast to dimension default value
            input.add("var", ctx.ID(1).getText());
            // System.out.println("BASE UNIT DA DIMENSÃO" + ctx.ID(0).getText());
            String dimension = "";
            for (String s : varMap.keySet()) {
               if (varMap.get(s).contains(ctx.ID(0).getText())) {
                  dimension = s;
                  break;
               }
            }
            input.add("dimension", dimension);
         } else
            input.add("var", ctx.ID(0).getText());
         input.add("temp", temp_vars());
         input.add("temp2", temp_vars());
      } else {
         if (ctx.ID(0) != null && ctx.ID(1) != null)
            input.add("var", ctx.ID(1).getText());
         else
            input.add("var", ctx.ID(0).getText());
         input.add("temp", temp_vars());
         input.add("temp2", temp_vars());
      }
      return input;
   }

   @Override
   public ST visitAssignment(dimanaParser.AssignmentContext ctx) {

      ST res = templates.getInstanceOf("assign");
      String nome_var = ctx.ID().getText();
      String var_dimension = declared_vars.get(nome_var);
      String var_type = varMap.get(var_dimension).get(0);
      //System.out.println("VAR DIMENSION " + var_dimension);
      //System.out.println("VAR TYPE " + var_type);
      //if (var_type == null){
        // var_type = 
      //}
      res.add("initial_var", visit(ctx.expression()).render());
      res.add("type", var_type);
      res.add("var", nome_var);
      res.add("varName",ctx.expression().varName);
      //res.add("var", nome_var);
      //res.add("value" );
      return res;
   }

   @Override
   public ST visitOutputFormat(dimanaParser.OutputFormatContext ctx) {
      ST res = null;
      return visitChildren(ctx);
      // return res;
   }

   @Override
   public ST visitWrite_expr(dimanaParser.Write_exprContext ctx) {
      ST res = null;
      return visitChildren(ctx);
      // return res;
   }

   public String temp_vars() {
      return "temp" + temp_var_counter++;
   }

   @Override
   public ST visitStatement(dimanaParser.StatementContext ctx) {
      ST res = null;
      return visitChildren(ctx);
      // return res;
   }

   // return res;

   // como está definida a gramática, o Assignment só é usado no example3.da
   // vou ignorar por enquanto, até porque dar run no example3 não está a fazer
   // nada
   /*
    * @Override
    * public ST visitAssignment(dimanaParser.AssignmentContext dim =
    * SI_dimension.get(e2)[0]; ctx) {
    *
    *
    *
    * String expression1 = ctx.expression().getText();
    * String expression2 = ctx.expression().getText();
    * String expression3 = ctx.expression().getText();
    * System.out.println (expression1 + " " + expression2 + " " + expression3);
    *
    *
    *
    * return null;
    *
    * }
    */

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
   
   /* 
   @Override
   public ST visitExprListExpression(dimanaParser.ExprListExpressionContext ctx) {
      ST res = null;
      return visitChildren(ctx);
      // return res;
   }
   */
   
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
      String op = ctx.op.getText();
      String expression1 = ctx.expression(0).getText();
      String expression2 = ctx.expression(1).getText();

      if (declared_vars.containsKey(expression1) && declared_vars.containsKey(expression2)) {
         
      } else {
         //System.out.println("ERRO: Alguma variável não declarada");
         System.exit(0);
      }
      return visitChildren(ctx);
      // return res;
   }

   @Override
   public ST visitRealLiteral(dimanaParser.RealLiteralContext ctx) {
      ST res = null;
      return visitChildren(ctx);
      // return res;
   }

   /* @Override
   public ST visitStringAssignExpression(dimanaParser.StringAssignExpressionContext ctx) {
      ST res = null;
      return visitChildren(ctx);
      // return res;
   } */
   
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
   public ST visitIdExpression(dimanaParser.IdExpressionContext ctx) {
      ST res = templates.getInstanceOf("declString");
      ;
      ctx.varName = newVar();
      res.add("var", ctx.varName);
      res.add("value", ctx.ID().getText());
      return res;
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
   public ST visitConditionalExpression(dimanaParser.ConditionalExpressionContext ctx) {
      ST res = templates.getInstanceOf("binaryOperation");
   }

   
   @Override
   public ST visitMulDivExpression(dimanaParser.MulDivExpressionContext ctx) {
      

      ctx.varName = newVar();


      String temp = ctx.expression(0).getText() + ctx.op.getText() + ctx.expression(1).getText();

      String operando1 = ctx.expression(0).getText();
      String operando2 = ctx.expression(1).getText();

      
      if (declared_vars.containsKey(operando1) && declared_vars.containsKey(operando2)) { // operação entre variaveis
         //System.out.println("VARMAP -> " + varMap);
         String var_type = varMap.get(declared_vars.get(operando1)).get(0);
         ST assign_dvar = templates.getInstanceOf("assign_dvar");
         assign_dvar.add("var_name", ctx.varName);
         assign_dvar.add("operando1", operando1);
         assign_dvar.add("operando2", operando2);
         assign_dvar.add("dataType", var_type);
         assign_dvar.add("operacao", ctx.op.getText());
         declared_vars.put(ctx.varName, temp);
         //System.out.println("Return value from assign_dvar \n" + assign_dvar.render());
         return assign_dvar;
      }

      if (bothAreStrings(operando1)) { // operação entre dimensões
         ST Return = templates.getInstanceOf("return");
         // System.out.println("TEMP TEST -> " + temp);
         Return.add("value", temp);
         //System.out.println("Return value from Muldiv  ->" + Return.render());
         return Return;

      }

      // 2*meter , que pode ser um assign
      // 2*meter, mas ja pode ser 

      else { // assign de uma variável a um escalar * dimensão OU definição de unidade alternativa


         // if the parent of this is the node from function visitAlternativeUnit
          
         if (ctx.getParent() instanceof dimanaParser.AlternativeUnitContext) { // definição de unidades alternativas já sao feitas na analise semantica,
                                                                               // estão definidas no array associativo conversions
          return null;
         }
         

         ST var_setValue = templates.getInstanceOf("var_setValue");
         var_setValue.add("var", ctx.varName);
         String var_type = "";
         for (String s : varMap.keySet()) { // SI unit
            if (varMap.get(s).size() == 3) {
               if (varMap.get(s).get(1).equals(operando2))
                  var_type = varMap.get(s).get(0);
            }
         }

         if (var_type.equals("")) { // didnt get defined because its not the base unit
            String base_unit = conversions.get(operando2).get(1);
            String multiplier = conversions.get(operando2).get(0);
            for (String s: varMap.keySet()) {
               if (varMap.get(s).size() == 3) {
                  if (varMap.get(s).get(1).equals(base_unit))
                     var_type = varMap.get(s).get(0);
               }
            }
            String final_value = Double.parseDouble(operando1) + " * " + Double.parseDouble(multiplier);
            var_setValue.add("value", final_value);
         }
         else {
            var_setValue.add("value", operando1); // tou a assumir que é tipo sempre 3*meter e nunca meter*3
         }

         var_setValue.add("type", var_type);
         System.out.println("VAR TYPE -> " + var_type);
         System.out.println("Return value from muldiv " + var_setValue.render());
         return var_setValue;
      }
   }

   public boolean bothAreStrings(String operand1) {
      // in this case, in a multiplication if the first operand is a String, they are gonna be both Strings because there is only 
      // 1 case where this kind of multiplication happens and it is when defining a dependant dimension
      try {
         if ((Double) Double.parseDouble(operand1) instanceof Double) // parseDouble can parse integers aswell
            return false;
      } catch (NumberFormatException e) {
         return true;
      }
      return false;
   }

   @Override
   public ST visitDataType(dimanaParser.DataTypeContext ctx) {
      ctx.type = ctx.getText();
      return visitChildren(ctx);
      // return res;
   }

   private String newVar() {
      numVars++;
      return "v" + numVars;
   }

   private int numVars = 0;
}

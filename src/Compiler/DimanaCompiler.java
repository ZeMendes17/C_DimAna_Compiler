
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

   HashMap<String, ArrayList<String>> dependent_units = new HashMap<String, ArrayList<String>>();
   // guardar dependencias das unidades dependentes
   // p.ex Volume -> [Length, Length, Length]
   int temp_var_counter = 1;

   // used for unit
   // HashMap<String, String> dimension_type = new HashMap<>();
   // HashMap<String, List<String>> SI_dimension = new HashMap<>();
   // HashMap<String, List<String>> var_dimension = new HashMap<>();

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
      res.add("name", "DimanaCompiled");
      return res;
   }

   @Override
   public ST visitStatList(dimanaParser.StatListContext ctx) {
      ST res = templates.getInstanceOf("stats");
      for (dimanaParser.StatementContext sc : ctx.statement())
         res.add("stat", visit(sc));
      return res;
   }

   // agora aqui vao ser as independentes
   @Override
   public ST visitIndependentUnit(dimanaParser.IndependentUnitContext ctx) {
      // usado para declaração das dimensões
      String dimension_name = ctx.ID(0).getText();
      String dataType = ctx.dataType().getText();
      String dimension_unit = ctx.ID(1).getText();

      if (ctx.ID(2) != null) { // se houver um sufixo
         String suffix = ctx.ID(2).getText();
         varMap.put(dimension_name, new ArrayList<String>() {
            {
               add(dataType);
               add(dimension_unit);
               add(suffix);
               // Length -> [real, meter, m] p.ex
            }
         });
      } else {
         varMap.put(dimension_name, new ArrayList<String>() {
            {
               add(dataType);
               add(dimension_unit);
               // Length -> [real, meter] p.ex
            }
         });
      }

      // add the default types for verification purposes
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

      // dimension_type.put(dimension_name, dataType); -> o dataType ja ta definido no
      // varMap, é o indice 0 da lista
      // isto tava a fazer Length -> real e nao Length -> [real, m] ( que ja ta no
      // varMap )

      // sufixo
      /*
       * if (ctx.ID(2) != null) {
       * String suffix = ctx.ID(2).getText();
       * // System.out.println("YEEEEEEEEEEEEEEEEEEEEEEES");
       * List<String> temp = new ArrayList<>();
       * temp.add(dimension_name);
       * temp.add(suffix);
       * 
       * SI_dimension.put(dimension_unit, temp);
       * } else {
       * // System.out.println("NOOOOOOOOOOOOOOOOOOO");
       * List<String> temp = new ArrayList<>();
       * temp.add(dimension_name);
       * temp.add(null);
       * 
       * SI_dimension.put(dimension_unit, temp);
       * }
       */ // -> mesma coisa, tudo isto já ta definido no varMap

      // for(String s : SI_dimension.keySet()) {
      // System.out.println(s + " --> " + SI_dimension.get(s));
      // }
      // System.out.println();

      return visitChildren(ctx);
      // return res;
   }

   @Override
   public ST visitDependantUnit(dimanaParser.DependantUnitContext ctx) {

      String dimension_name = ctx.ID(0).getText();
      String dataType = ctx.dataType().getText();
      String expression = visit(ctx.expression()).render();
      //ST decl_value = templates.getInstanceOf("declare_var");

      if (ctx.ID(1) != null) { // é definido uma unidade base e um sufixo
         StringBuilder sb = new StringBuilder();
         String dimension_unit = ctx.ID(1).getText();
         String unit_dependency = declared_vars.get(ctx.expression().varName);
         // dimension_type.put(dimension_name, dataType);
         if (ctx.ID(2) != null) { // se houver um sufixo
            
            String suffix = ctx.ID(2).getText();
            varMap.put(dimension_name, new ArrayList<String>() {
               {
                  add(dataType);
                  add(dimension_unit);
                  add(suffix);
                  // Length -> [real, meter, m] p.ex
               }
            });
         } else {
            varMap.put(dimension_name, new ArrayList<String>() {
               {
                  add(dataType);
                  add(dimension_unit);
                  // Length -> [real, meter] p.ex
               }
            });
         }

      }

      else { // não é definida unidade base nem sufixo
         visit(ctx.expression());
         String unit_dependency = declared_vars.get(ctx.expression().varName);
         // System.out.println("Full dependent expression -> " + unit_dependency);
         String[] dimParts = unit_dependency.split("(?<=[*|/|+|-])|(?=[*|/|+|-])");
         // System.out.println("dimParts -> " + dimParts);
         dependent_units.put(dimension_name, new ArrayList<String>() {
            {
               add(unit_dependency);
            }
         });
         StringBuilder sb = new StringBuilder();
         for (int i = 0; i < dimParts.length; i++) {
            // System.out.println("dimParts[i] -> " + dimParts[i]);
            if (dimParts[i].equals("*") || dimParts[i].equals("/") || dimParts[i].equals("+")
                  || dimParts[i].equals("-"))
               sb.append(dimParts[i]);
            else
               sb.append(varMap.get(dimParts[i]).get(2));

         }
         varMap.put(dimension_name, new ArrayList<String>() {
            {
               add(dataType);
               add(unit_dependency);
               add(sb.toString());
               // Length -> [real, meter] p.ex
            }
         });

        // get the key corresponding to the value of unit_dependency in the unit_dependency hashmap
        /* 
         for (String key : dependent_units.keySet()) {
            if (dependent_units.get(key).get(0).equals(unit_dependency)) {
               decl_value.add("unit", key);
               break;
            }
         }
         decl_value.add("name", dimension_name);
         //decl_value.add("unit",dependent_units.get(expression).get(0));
         decl_value.add("suffix",sb.toString());
         */
         /*
          * for (int i = 0 ; i< dimParts.length ; i++){
          * verificar se o dataType de ambas as variaveis é o mesmo
          * if (i >= 1)
          * {
          * if
          * (!(varMap.get(dimParts[i]).get(0).equals(varMap.get(dimParts[i-1]).get(0))))
          * {
          * System.out.println("Error: Incompatible types for a dependent unit" +
          * dimension_name + " at line " + ctx.start.getLine() + " type1 " +
          * varMap.get(dimParts[i]).get(0) + " type2 " +
          * varMap.get(dimParts[i-1]).get(0));
          * System.exit(0);
          * }
          * 
          * }
          * 
          * }
          */

      }
      return null;

      // System.out.println("Dependent units: " + dependent_units);
      // System.out.println("VarMap: " + varMap);

      /*
       * List<String> temp = new ArrayList<>();
       * temp.add(dimension_name);
       * try {
       * String dimension_unit = ctx.ID(1).getText();
       * try {
       * String suffix = ctx.ID(2).getText();
       * temp.add(suffix);
       * SI_dimension.put(dimension_unit, temp);
       * } catch (NullPointerException e) {
       * temp.add(null);
       * SI_dimension.put(dimension_unit, temp);
       * }
       * 
       * } catch (NullPointerException e) {
       * }
       * 
       */

      // para substituir no caso Length*Length*Length --> Area*Length

      /*
       * for (String s : SI_dimension.keySet()) {
       * if (type.contains(s)) {
       * type = type.replace(s, SI_dimension.get(s).get(0));
       * // System.out.println("AAAAAAAAAAAAAAAA --> " + type);
       * }
       * }
       */

      /*
       * for (String s : SI_dimension.keySet()) {
       * if (SI_dimension.get(s).get(0).equals(dimParts[0]))
       * first = SI_dimension.get(s).get(1);
       * 
       * if (SI_dimension.get(s).get(0).equals(dimParts[1]))
       * second = SI_dimension.get(s).get(1);
       * }
       */

      // String expression_result = visit(ctx.expression()).render();

      // pseudocodigo gerado ( que deve tar no stg)

      // isto é um exemplo do que vai vir do render() de uma expressão de operação
      // binária
      // var_temp1 = 6
      // var_temp2 = 2
      // var_temp3 = 3
      // var_temp6 = var_temp1 * var_temp2 * var_temp3

      // array_que_guarda_dependencias_de_dependant_units.put(dimension_name,var_temp6)

      // please façam isto assim, não há necessidade de calcular o resultado da
      // expressão aqui
      // simplesmente metam a expression a retornar um ST que crie uma variavel com o
      // resultado do calculo


      // String[] dimParts = type.split("[*/]");
      /*
       * String operator = type.replace(dimParts[0], "").replace(dimParts[1], "");
       * String first = null;
       * String second = null;
       * for (String s : SI_dimension.keySet()) {
       * if (SI_dimension.get(s).get(0).equals(dimParts[0]))
       * first = SI_dimension.get(s).get(1);
       * 
       * if (SI_dimension.get(s).get(0).equals(dimParts[1]))
       * second = SI_dimension.get(s).get(1);
       * }
       * 
       * temp = new ArrayList<>();
       * temp.add(dimension_name);
       * temp.add(first + operator + second);
       * SI_dimension.put(type, temp);
       */

      // System.out.println(ctx.ID(0).getText() + " ---> " +
      // declared_vars.get(ctx.expression().varName));
      // for(String s : SI_dimension.keySet())
      // System.out.println(s + " -----> " + SI_dimension.get(s));

      // System.out.println();

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
         if (!default_types.contains(dataType)) {
            System.out.println("Dimensão " + dataType + " usada antes de ser declarada");
            System.exit(0);
         }
      }

      ST variable_declaration = null;

      if (dataType.equals("string") || dataType.equals("real") || dataType.equals("integer")) {
         if (ctx.expression() != null) {
            variable_declaration = templates.getInstanceOf("decl_value");
            variable_declaration.add("type", dataType);
            variable_declaration.add("var", id);
            variable_declaration.add("value", expression);
         } else {
            variable_declaration = templates.getInstanceOf("decl");
            variable_declaration.add("type", dataType);
            variable_declaration.add("var", id);
         }

      } else {

         if (expression.isEmpty()) { // não é dado um valor inicial
            variable_declaration = templates.getInstanceOf("declare_var");
            variable_declaration.add("unit", dataType);
            variable_declaration.add("name", id);
            //System.out.println("Variavel  + " + id + " declarada com sucesso" + " do tipo " + dataType);

            if (varMap.get(dataType).size() == 3) {
               String suffix = varMap.get(dataType).get(2);
               variable_declaration.add("suffix", suffix);

            } 

         } else { // é dado um valor inicial ( expression )
            variable_declaration = templates.getInstanceOf("declare_var_with_value");
            variable_declaration.add("unit", dataType);
            variable_declaration.add("name", id);
            variable_declaration.add("value", visit(ctx.expression()).render());
            System.out.println("Variavel  + " + id + " declarada com sucesso" + " do tipo " + dataType);

            if (varMap.get(dataType).size() == 3) {
               String suffix = varMap.get(dataType).get(2);
                  variable_declaration.add("suffix", suffix);
            } 
         }
      }

      declared_vars.put(id, dataType); // keep track of declared variables
      System.out.print("Added entry to declared_vars: " + id + " --->" + dataType + "\n");
      // este dataType aqui é a dimensão

      return variable_declaration;

   }

   @Override
   public ST visitInputStatement(dimanaParser.InputStatementContext ctx) {
      if (ctx.dataType() != null) { // vai ser feito cast
         String var_dataType = ctx.dataType().getText();

         // teoricamente este if nunca vai entrar porque é sempre usado real, integer ou
         // string nos casts nos exemplos, mas vou deixar
         if (!varMap.containsKey(var_dataType) && !default_types.contains(var_dataType)) {
            System.out.println("Tipo de dados " + var_dataType + " usado antes de ser declarada");
            System.exit(0);
         }

         String var_name = ctx.ID(0).getText();
         String unidade_dimensão = ctx.ID(1).getText();
         String dimensão = "";
         for (String s : varMap.keySet()) {
            if (varMap.get(s).contains(unidade_dimensão)) {
               dimensão = s;
               break;
            }
         }

         if (!declared_vars.containsKey(var_name)) {
            System.out.println("Variável " + var_name + " usada antes de ser declarada");
            System.exit(0);
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

   @Override

   // due to the concatenation of statements inside a print statement, a string
   // builder was used in this method
   // because we couldnt know how much statements we had to print inside a write
   // statement beforehand
   // for example : writeln string(10,n) string(20,x)
   // it would be hard to define a string template for a case like this, because
   // the number of arguments would be variable

   public ST visitOutputStatement(dimanaParser.OutputStatementContext ctx) {

      int print_amount = ctx.outputFormat().size();
      ST print = null;
      StringBuilder sb = new StringBuilder();
      // System.out.println("print amount " + print_amount + "\n");

      for (int i = 0; i < print_amount; i++) {
         String output_format = ctx.outputFormat(i).getText();
         String write_expr = ctx.write_expr().getText();
         if (write_expr.equals("writeln"))
            print = templates.getInstanceOf("println");
         else
            print = templates.getInstanceOf("print");
         if (ctx.outputFormat(i).INT() != null) { // write a formatted string
            String string_length = ctx.outputFormat(i).INT().getText();

            if (ctx.write_expr().getText().equals("write")) { // ''write'' statement

               if (ctx.outputFormat(i).ID() != null) { // write a ID ( variable )
                  String var_name = ctx.outputFormat(i).ID().getText();

                  if (!declared_vars.containsKey(var_name)) {
                     System.out.println("Variável " + var_name + " usada antes de ser declarada");
                     System.exit(0);

                  }

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
                  if (!declared_vars.containsKey(var_name)) {
                     System.out.println("Variável " + var_name + " usada antes de ser declarada");
                     System.exit(0);
                  }

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

                  String datatype_of_idx = varMap.get(declared_vars.get(array_name)).get(0);
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
            //System.out.println("Velocity entrou aqui");

            if (ctx.outputFormat(i).STRING() == null) { // é so write variavel, nunca deve entrar aqui pelos exemplos
               String var_name = ctx.outputFormat(i).ID().getText();
               if (!declared_vars.containsKey(var_name)) {
                  System.out.println("Variável " + var_name + " usada antes de ser declarada");
                  System.exit(0);
               }

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
                  sb.append(var_name + ".getValue_" + var_type + "()+ " + var_name + ".getSuffix()");
               if (i == print_amount - 1) // if its the last one
               {
                  print.add("value", sb.toString());
                  sb.setLength(0);
               } else
                  sb.append("+");

            }

         }
      }
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

      String datatype = ctx.dataType(0).getText();
      if (!varMap.containsKey(datatype)) {
         System.out.println("Tipo " + datatype + " não existe ou não foi declarado");
         System.exit(0);
      }
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
      declared_vars.put(list_name, datatype);

      return list;

   }

   @Override
   public ST visitLoopStatement(dimanaParser.LoopStatementContext ctx) {
      /*
       * ST res = null;
       * return visitChildren(ctx);
       * // return res;
       */

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

      // for (int i = 0; i < ctx.ID().size(); i++)
      // System.out.println(ctx.ID(i).getText());

      for (int i = 0; i < expression_amount; i++) {
         // System.out.println("Visiting expression " + i + " of " + expression_amount +
         // " in for loop");
         for_loop_statements += visit(ctx.expression(i)).render() + "\n";
      }
      if (ctx.ID(1) != null && ctx.INT(0) == null && ctx.INT(1) == null) // initial value is a variable
         initial_value = ctx.ID(1).getText();
      else // initial value is a number
         initial_value = ctx.INT(0).getText();

      /*
       * REFAZER ESTA VERIFICAÇÃO, NAO PODE SER FEITA ASSIM, PORQUE ALGUM DESTES
       * VALORES PODE SER UMA VARIAVEL
       *
       * if ( Integer.parseInt(initial_value) > Integer.parseInt(final_value)) {
       * System.out.println("Initial value of for loop is bigger than final value");
       * System.exit(0);
       * }
       *
       */
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
      res.add("var", nome_var);
      res.add("value", visit(ctx.expression()).render());
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

   // @Override
   // public ST visitStatement(dimanaParser.StatementContext ctx) {
   // ST res = null;
   // return visitChildren(ctx);
   // // return res;
   // }

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

   // @Override
   // public ST visitHeaderFile(dimanaParser.HeaderFileContext ctx) {
   // ST res = null;
   // return visitChildren(ctx);
   // // return res;
   // }

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
   public ST visitMulDivExpression(dimanaParser.MulDivExpressionContext ctx ) {
      // ta a funcionar para os exemplos do physics (tirar o Unit para nao dar erro
      // para ja)
      //ST res = templates.getInstanceOf("filler");

      // System.out.println(ctx.expression(0).getText());
      // res.add("stat", visit(ctx.expression(0)).render());
      // res.add("stat", visit(ctx.expression(1)).render());

      ctx.varName = newVar();

      // ST bop = templates.getInstanceOf("declStringPlus");
      // bop.add("var", ctx.varName);
      // bop.add("value1", ctx.expression(0).varName);
      // bop.add("value2", ctx.op.getText());
      // bop.add("value3", ctx.expression(1).varName);

      String temp = ctx.expression(0).getText() + ctx.op.getText() + ctx.expression(1).getText();
      //res.add("bruh", temp);
      // System.out.println(temp);


      String operando1 = ctx.expression(0).getText();
      String operando2 = ctx.expression(1).getText();
      /* 
      if (!(varMap.get(declared_vars.get(operando1)).get(0).equals(varMap.get(declared_vars.get(operando2)).get(0)))) 
         // variables are not from the same dimension
         System.out.println("ERROR: variables are not from the same dimension" + operando1 + " " + operando2 );
         */
      System.out.println(declared_vars.toString());
      //System.out.println("Operandos pra serem usados " + operando1 + " " + operando2);
      if (declared_vars.containsKey(operando1) && declared_vars.containsKey(operando2)) { // operação entre variaveis
         System.out.println(operando1 + ctx.op.getText() + operando2);
         String var_type = varMap.get(declared_vars.get(operando1)).get(0);
         ST assign_dvar = templates.getInstanceOf("assign_dvar"); 
         assign_dvar.add("var_name", ctx.varName);
         assign_dvar.add("operando1",operando1);
         assign_dvar.add("operando2",operando2);
         assign_dvar.add("dataType" , var_type);
         assign_dvar.add("operacao",ctx.op.getText());
         return assign_dvar;
      }
      
      if (bothAreStrings(operando1, operando2)) { // operação entre dimensões
         ST Return = templates.getInstanceOf("return");
         //System.out.println("TEMP TEST -> " + temp);
         declared_vars.put(ctx.varName, temp);
         Return.add("value",temp);
         //System.out.println("Return value from Muldiv  ->" + Return.render());
         return Return;
       
      } else { // assign de uma variável a um escalar * dimensão

         ST var_setValue = templates.getInstanceOf("var_setValue");
         var_setValue.add("var", ctx.varName);
         var_setValue.add("value", operando1); // tou a assumir que é tipo sempre 3*meter e nunca meter*3
         System.out.println(ctx.varName);
         System.out.println(declared_vars.toString());
         String var_type = varMap.get(declared_vars.get(ctx.varName)).get(0);
         var_setValue.add("type", var_type);
         return var_setValue;


         // 
         /* 
         if (declared_vars.get(operando1) != null)
         var_type = varMap.get(declared_vars.get(operando1)).get(0);
         else 
         var_type = varMap.get(declared_vars.get(operando2)).get(0);
         */

      }


      
      // for(String s : declared_vars.keySet())
      // System.out.println(s + " ---> " + declared_vars.get(s));
      // System.out.println();
      // res.add("stat", bop.render());

      // ST res = templates.getInstanceOf("binaryOperation");

      // dimension dim;
      // String e1 = visit(ctx.expression(0)).getText();
      // String e2 = visit(ctx.expression(1)).getText();
      // String op = ctx.op.getText();

      // // Se e1 for um numero, vai ser uma transformacao (e2 tem de ser unit)

      // // PRIMEIRO : VERIFICAR A DIMENSAO
      // // pseudo-codigo
      // if (e1.type == Integer || e1.type == Real) {
      // if (e1.type == e2.type) {
      // dim = e1.type;
      // }

      // else if (SI_dimension.containsKey(e2)) {
      // dim = SI_dimension.get(e2)[0];
      // }
      // }

      // else if (var_dimension.containsKey(e1) && var_dimension.containsKey(e2)) {
      // String temp = new
      // StringBuilder().append(var_dimension.get(e1)[0]).append(op).append(var_dimension.get(e1)[0]).toString();
      // System.out.println(temp);
      // if (SI_dimension.containsKey(temp)) {
      // dim = SI_dimension.get(temp)[0];
      // }
      // }

      // else {
      // System.err.println("ERROR: Incompatible dimensions");
      // System.exit(0); // 0 ou 1 ??
      // }

      // // return res;
   }

   public boolean bothAreStrings(String operand1, String operand2) {
    try {
        if ( (Double)Double.parseDouble(operand1) instanceof Double) // parseDouble can parse integers aswell
        return false;
    } 
    catch (NumberFormatException e) {
      return true;
    }

    try { 
      if ( (Double)Double.parseDouble(operand1) instanceof Double) // parseDouble can parse integers aswell
        return false;
      } 
      catch (NumberFormatException e) {
         return true;
    }
    return false;
   
}


   @Override
   public ST visitDataType(dimanaParser.DataTypeContext ctx) {
      ST res = null;
      return visitChildren(ctx);
      // return res;
   }

   private String newVar() {
      numVars++;
      return "v" + numVars;
   }

   private int numVars = 0;
}

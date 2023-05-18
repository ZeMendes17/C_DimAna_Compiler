import java.util.*;
import org.stringtemplate.v4.*;

@SuppressWarnings("CheckReturnValue")
public class DimanaCompiler extends dimanaBaseVisitor<ST> {

   private STGroup templates = new STGroupFile("dimana.stg"); // stg file to be used
   private int varCount = 0; // variable counter
   HashMap<String, ArrayList<String>> varMap = new HashMap<String, ArrayList<String>>();
   HashMap<String, String> declared_vars = new HashMap<String, String>();
   int temp_var_counter = 1;
   // por exemplo, length: [real, m , cm , mm]
   // pra ser + facil, tentem definir por esta convenção , nome_dimensão :
   // [tipo_de_dados, unidade_principal, unidade_alternativa1,
   // unidade_alternativa2, ...]

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

   // não está acabada esta função, basica af
   @Override
   public ST visitUnit(dimanaParser.UnitContext ctx) {
      // usado para declaração das dimensões
      String dimension_name = ctx.ID(0).getText();
      String dataType = ctx.dataType().getText();
      String dimension_unit = ctx.ID(1).getText();
      // System.out.print("New dimension declared " + dimension_name + " | Type: " +
      // dataType + " | Default Unit: " + dimension_unit + "\n" );
      varMap.put(dimension_name, new ArrayList<String>() {
         {
            add(dataType);
            add(dimension_unit);
         }
      });

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
         if (!default_types.contains(dataType)) {
            System.out.println("Dimensão " + dataType + " usada antes de ser declarada");
            System.exit(0);
         }
      }

      ST variable_declaration = null;

      if (dataType.equals("string") || dataType.equals("real") || dataType.equals("integer")) {

         if (!expression.isEmpty()) {

            variable_declaration = templates.getInstanceOf("decl_with_value");
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
         } else { // é dado um valor inicial ( expression )
            variable_declaration = templates.getInstanceOf("declare_var_with_value");
            variable_declaration.add("unit", dataType);
            variable_declaration.add("name", id);
            variable_declaration.add("value", expression);
         }
      }

      // System.out.println("New variable declared " + dataType + " " + id + " ") ;
      // expression + "\n");
      // System.out.println(variable_declaration.render() + "\n");
      declared_vars.put(id, dataType); // keep track of declared variables
      // System.out.println(declared_vars.toString());

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
         read_and_cast.add("dimension", dimensão);
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

   public ST visitOutputStatement(dimanaParser.OutputStatementContext ctx) {

      int print_amount = ctx.outputFormat().size();
      ST print = null;
      StringBuilder sb = new StringBuilder();
      // System.out.println("print amount " + print_amount + "\n");

      for (int i = 0; i < print_amount; i++) { // lidar com varias cenas num print, é necessário isto
         String output_format = ctx.outputFormat(i).getText();
         String write_expr = ctx.write_expr().getText();
         // System.out.println("write expr " + write_expr);
         String string_length = ctx.outputFormat(i).INT().getText();
         // System.out.println("String length ->" + string_length + "<-");

         if (ctx.write_expr().getText().equals("write")) {
            if (ctx.outputFormat(i).ID() != null) { // if its a id AKA a variable
               String var_name = ctx.outputFormat(i).ID().getText();
               print = templates.getInstanceOf("print");

               if (!declared_vars.containsKey(var_name)) {
                  System.out.println("Variável " + var_name + " usada antes de ser declarada");
                  System.exit(0);

               }

               // print id
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
                  sb.append("+");

            } else if (ctx.outputFormat(i).STRING() != null) { // its a string
               print = templates.getInstanceOf("print");
               String print_string = ctx.outputFormat(i).STRING().getText();
               sb.append("String.format(\"%" + string_length + "s" + "\"," + print_string + ")");
               if (i == print_amount - 1) // if its the last one
               {
                  print.add("value", sb.toString());
                  sb.setLength(0);
               } else
                  sb.append("+");

            } else if (ctx.outputFormat(i).expression() != null) {
               System.out.println("BING BONG ARRAY PRINT");
            }

         } else if (ctx.write_expr().getText().equals("writeln")) { // writeln

            if (ctx.outputFormat(i).ID() != null) {
               print = templates.getInstanceOf("println");
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
                  sb.append("+");

            } else if (ctx.outputFormat(i).STRING() != null) {
               print = templates.getInstanceOf("println");
               String print_string = ctx.outputFormat(i).STRING().getText();
               sb.append("String.format(\"%" + string_length + "s" + "\"," + print_string + ")");
               if (i == print_amount - 1) // if its the last one
               {
                  print.add("value", sb.toString());
                  sb.setLength(0);
               } else
                  sb.append("+");

            } else if (ctx.outputFormat(i).expression() != null) {
               System.out.println("BING BONG ARRAY PRINT");
            }
         }

      }
      return print;

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

      return list;

   }

   @Override
   public ST visitLoopStatement(dimanaParser.LoopStatementContext ctx) {
      /* 
      ST res = null;
      return visitChildren(ctx);
      // return res;
      */
      int expression_amount;
      int statlist_amount;
      if (ctx.expression() != null)
         expression_amount = ctx.expression().size(); // number of instructions executed in the loop
      if (ctx.statList() != null)
         statlist_amount = 1;
      // visit the expression
      return null;
   }

   // isto ainda não ta a funcionar, precisa de analise semantica
   // @Override
   // public ST visitAssignment(dimanaParser.AssignmentContext ctx) {
   
   //    // em principio deve ser assim, tesmo de adcionar uma verificação ainda
   //    // l = 10 dá erro, precisa de ser l = 10*meter;
   //    // v = l/t esta bom, t/l da erro
   //    ST res = templates.getInstanceOf("assign");
   //    String id = ctx.ID().getText();
   //    res.add("stat", visit(ctx.expression()).render());
   //    res.add("var", id);
   //    res.add("value", ctx.expression().varName);
   //    return res;
   // }
   
   
   

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
   //    ST res = null;
   //    return visitChildren(ctx);
   //    // return res;
   // }

   // como está definida a gramática, o Assignment só é usado no example3.da
   // vou ignorar por enquanto, até porque dar run no example3 não está a fazer
   // nada

   // @Override
   // public ST visitHeaderFile(dimanaParser.HeaderFileContext ctx) {
   //    ST res = null;
   //    return visitChildren(ctx);
   //    // return res;
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

   private String newVar() {
      numVars++;
      return "v" + numVars;
   }

   private int numVars=0;
}

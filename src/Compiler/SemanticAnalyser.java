

import java.util.*;
@SuppressWarnings("CheckReturnValue")
public class SemanticAnalyser extends dimanaBaseVisitor<Boolean> {

   private int varCount = 0; // variable counter
   HashMap<String, ArrayList<String>> varMap = new HashMap<String, ArrayList<String>>();
   // usem este array para guardar as coisas sobre variaveis/dimensoes
   // por exemplo --> {Length : [real, meter, m], ...}

   HashMap<String, ArrayList<String>> conversions = new HashMap<>();
   // vai guardar por exemplo --> {inch : ["0.0254", "meter"], ...}

   HashMap<String, String> declared_vars = new HashMap<String, String>();
   // guardar as variaveis -----> {l : Length}
   
   HashMap<String, ArrayList<String>> dependent_units = new HashMap<String, ArrayList<String>>();
   // guardar dependencias das unidades dependentes
   // p.ex Volume -> [Length, Length, Length]
   int temp_var_counter = 1;
   

   ArrayList<String> default_types = new ArrayList<String>() {
      {
         add("integer");
         add("real");
         add("string");
      }
   };

   @Override public Boolean visitProgram(dimanaParser.ProgramContext ctx) {
      Boolean res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public Boolean visitStatList(dimanaParser.StatListContext ctx) {
      Boolean res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public Boolean visitStatement(dimanaParser.StatementContext ctx) {
      Boolean res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public Boolean visitVariableDeclaration(dimanaParser.VariableDeclarationContext ctx) {
      Boolean res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public Boolean visitAssignment(dimanaParser.AssignmentContext ctx) {
      Boolean res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public Boolean visitInputStatement(dimanaParser.InputStatementContext ctx) {
      Boolean res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public Boolean visitOutputStatement(dimanaParser.OutputStatementContext ctx) {
      Boolean res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public Boolean visitOutputFormat(dimanaParser.OutputFormatContext ctx) {
      Boolean res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public Boolean visitWrite_expr(dimanaParser.Write_exprContext ctx) {
      Boolean res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public Boolean visitLoopStatement(dimanaParser.LoopStatementContext ctx) {
      Boolean res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public Boolean visitLength(dimanaParser.LengthContext ctx) {
      Boolean res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public Boolean visitHeaderFile(dimanaParser.HeaderFileContext ctx) {
      Boolean res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public Boolean visitPrefixUnit(dimanaParser.PrefixUnitContext ctx) {
      Boolean res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public Boolean visitIndependentUnit(dimanaParser.IndependentUnitContext ctx) {
      Boolean res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public Boolean visitDependantUnit(dimanaParser.DependantUnitContext ctx) {
      Boolean res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public Boolean visitAlternativeUnit(dimanaParser.AlternativeUnitContext ctx) {
      Boolean res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public Boolean visitListDeclaration(dimanaParser.ListDeclarationContext ctx) {
      Boolean res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public Boolean visitExprListExpression(dimanaParser.ExprListExpressionContext ctx) {
      Boolean res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public Boolean visitOutputExpression(dimanaParser.OutputExpressionContext ctx) {
      Boolean res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public Boolean visitIndexExpression(dimanaParser.IndexExpressionContext ctx) {
      Boolean res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public Boolean visitInputExpression(dimanaParser.InputExpressionContext ctx) {
      Boolean res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public Boolean visitAddSubExpression(dimanaParser.AddSubExpressionContext ctx) {
      Boolean res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public Boolean visitRealLiteral(dimanaParser.RealLiteralContext ctx) {
      Boolean res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public Boolean visitStringAssignExpression(dimanaParser.StringAssignExpressionContext ctx) {
      Boolean res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public Boolean visitTypeConversion(dimanaParser.TypeConversionContext ctx) {
      Boolean res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public Boolean visitStringLiteral(dimanaParser.StringLiteralContext ctx) {
      Boolean res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public Boolean visitIdExpression(dimanaParser.IdExpressionContext ctx) {
      Boolean res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public Boolean visitParenExpression(dimanaParser.ParenExpressionContext ctx) {
      Boolean res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public Boolean visitIntLiteral(dimanaParser.IntLiteralContext ctx) {
      Boolean res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public Boolean visitInputTypeExpression(dimanaParser.InputTypeExpressionContext ctx) {
      Boolean res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public Boolean visitMulDivExpression(dimanaParser.MulDivExpressionContext ctx) {
      Boolean res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public Boolean visitDataType(dimanaParser.DataTypeContext ctx) {
      Boolean res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public Boolean visitCastTypes(dimanaParser.CastTypesContext ctx) {
      Boolean res = null;
      return visitChildren(ctx);
      //return res;
   }

   private static boolean isReservedName(String variableName) {
        Set<String> reservedKeywords = new HashSet<>(Arrays.asList(
                "abstract", "assert", "boolean", "break", "byte", "case", "catch", "char", "class", "const", "continue",
                "default", "do", "double", "else", "enum", "extends", "final", "finally", "float", "for", "goto",
                "if", "implements", "import", "instanceof", "int", "interface", "long", "native", "new", "package",
                "private", "protected", "public", "return", "short", "static", "strictfp", "super", "switch",
                "synchronized", "this", "throw", "throws", "transient", "try", "void", "volatile", "while"
        ));

        return reservedKeywords.contains(variableName);
    }
}

import java.util.*;
//import java.io.*;

public class testCompiled {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in); /*para depois usar nos READS*/
      DimensionVar x = new DimensionVar("Length");
      x.setSuffix("m");
      DimensionVar y = new DimensionVar("Length");
      y.setSuffix("m");
      double v2;
      v2 = 1.0;
      x.setValue_double(v2);
      double v3;
      v3 = 1.0 * 0.0254;
      y.setValue_double(v3);
      sc.close(); /*tem de fechar*/
   }
}
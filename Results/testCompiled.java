import java.util.*;
//import java.io.*;

public class testCompiled {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in); /*para depois usar nos READS*/
      DimensionVar x = new DimensionVar("Length");
      x.setSuffix("m");
      DimensionVar y = new DimensionVar("Length");
      y.setSuffix("m");
      double v1;
      v1 = 1.0;
      x.setValue_double(v1);
      double v2;
      v2 = 2.0;
      y.setValue_double(v2);
      int N = 4;
      int z = 0;
      int v3 = N;

      int v4 = 6;
      do {
         System.out.print(N);
         continue;

      } while (
      v3<v4);
      int v5 = N;

      int v6 = 5;
      if (
      v5<v6) {
         int v7 = 300;
         N = v7;

      } else {
      }
      sc.close(); /*tem de fechar*/
   }
}
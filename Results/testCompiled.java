import java.util.*;
//import java.io.*;

public class testCompiled {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in); /*para depois usar nos READS*/
      double v1 = 5.0;;
      DimensionVar l = new DimensionVar("Length",v1);
      l.setSuffix("m");
      double v2 = 10.0;;
      DimensionVar t = new DimensionVar("Time",v2);
      t.setSuffix("s");
      double v3 = 100.0;;
      DimensionVar m = new DimensionVar("Mass",v3);
      m.setSuffix("g");
      double v4 = 20.0;;
      DimensionVar T = new DimensionVar("Temperature",v4);
      T.setSuffix("K");
      sc.close(); /*tem de fechar*/
   }
}
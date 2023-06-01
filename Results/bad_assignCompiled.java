import java.util.*;
//import java.io.*;

public class bad_assignCompiled {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in); /*para depois usar nos READS*/
      DimensionVar g = new DimensionVar("Grade");
      g.setSuffix("");
      DimensionVar l = new DimensionVar("Length");
      l.setSuffix("m");
      double v1;
      v1 = 3;
      l.setValue_double(v1);
      sc.close(); /*tem de fechar*/
   }
}
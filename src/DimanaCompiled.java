import java.util.*;
import java.io.*;

public class DimanaCompiled {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in); /*para depois usar nos READS*/
      DimensionVar n = new DimensionVar("NMEC");
      String name;
      DimensionVar g = new DimensionVar("Grade");
      System.out.print("Insert value into " + n + " : ");
      int temp1 = sc.nextint();
      n.setValue_int(temp1);
      System.out.print("Insert value into " + name + " : ");
      name = sc.next();
      System.out.print("Insert value into " + g + " : ");
      double temp3 = sc.nextdouble();
      g.setValue_double(temp3);
      sc.close(); /*tem de fechar*/
   }
}
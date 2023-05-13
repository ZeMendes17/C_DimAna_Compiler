import java.util.*;
import java.io.*;

public class DimanaCompiled {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in); /*para depois usar nos READS*/
      DimensionVar n = new DimensionVar("NMEC");
      String name;
      DimensionVar g = new DimensionVar("Grade");
      System.out.print("Insert value into variable n (int)  : ");
      int temp1 = sc.nextint();
      n.setValue_int(temp1);
      System.out.print("Insert value into variable name (string) : ");
      name = sc.next();
      System.out.print("Insert value into variable g (double)  : ");
      double temp3 = sc.nextdouble();
      g.setValue_double(temp3);
      System.out.print(String("NMEC:",10));
      System.out.print(string("Name",30));
      System.out.println(string("Grade:",10));
      System.out.println(string(n,10),string(name,30),string(g,10));
      sc.close(); /*tem de fechar*/
   }
}
import java.util.*;
//import java.io.*;

public class array_getCompiled {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in); /*para depois usar nos READS*/
      int N = 4;
      ArrayList<DimensionVar> nmecs = new ArrayList<DimensionVar>(); // List of NMEC ;
      nmecs.add(null); // fill index 0 so it starts at 1
      ArrayList<String> names = new ArrayList<String>(); // List of string ;
      names.add(null); // fill index 0 so it starts at 1
      ArrayList<DimensionVar> grades = new ArrayList<DimensionVar>(); // List of Grade ;
      grades.add(null); // fill index 0 so it starts at 1
      int i ;
      for (i = 1; i <= N; i++) {
         System.out.print("Insert value into array nmecs (int)  : ");
         int temp1 = sc.nextInt();
         DimensionVar temp2 = new DimensionVar("NMEC",temp1);
         nmecs.add(temp2);
         System.out.print("Insert value into array names (string) : ");
         String temp3 = sc.next();
         names.add(temp3);
         System.out.print("Insert value into array grades (double)  : ");
         double temp5 = sc.nextDouble();
         DimensionVar temp6 = new DimensionVar("Grade",temp5);
         grades.add(temp6);

      }
      int v1 = nmecs.get(3).getValue_int();
      DimensionVar n = new DimensionVar("NMEC",v1);
      n.setSuffix("");
      System.out.println(n.getValue_int() + " " + n.getSuffix());
      String v3 = names.get(3);
      String s = v3;
      System.out.println(s);
      sc.close(); /*tem de fechar*/
   }
}
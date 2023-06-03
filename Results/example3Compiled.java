import java.util.*;
//import java.io.*;

public class example3Compiled {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in); /*para depois usar nos READS*/
      DimensionVar l = new DimensionVar("Length");
      l.setSuffix("m");
      DimensionVar t = new DimensionVar("Time");
      t.setSuffix("s");
      DimensionVar v = new DimensionVar("Velocity");
      v.setSuffix("m/s");
      double v6;
      v6 = 10;
      l.setValue_double(v6);
      double v7;
      v7 = 2;
      t.setValue_double(v7);
      double v8 ;
      v8 = l.getValue_double() / t.getValue_double();
      v.setValue_double(v8);
      System.out.println("Velocity: " + v.getValue_double());
      System.out.print("Insert value into variable l (double)  : ");
      double temp1 = sc.nextDouble();
      l.setValue_double(temp1);
      System.out.print("Insert value into variable t (double)  : ");
      double temp2 = sc.nextDouble();
      t.setValue_double(temp2);
      double v9 ;
      v9 = l.getValue_double() / t.getValue_double();
      v.setValue_double(v9);
      System.out.println("Velocity: " + v.getValue_double());
      sc.close(); /*tem de fechar*/
   }
}
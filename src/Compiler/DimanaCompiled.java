import java.util.*;
import java.io.*;

public class DimanaCompiled {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in); /*para depois usar nos READS*/
      DimensionVar l = new DimensionVar("Length");
      l.setSuffix("m");
      DimensionVar t = new DimensionVar("Time");
      t.setSuffix("s");
      DimensionVar v = new DimensionVar("Velocity");
      v.setSuffix("m/s");
      double v9 = l.getValue_double() / t.getValue_double();
      System.out.println(v.getValue_double()+ v.getSuffix());
      System.out.print("Insert value into variable l (double)  : ");
      double temp1 = sc.nextDouble();
      l.setValue_double(temp1);
      System.out.print("Insert value into variable t (double)  : ");
      double temp2 = sc.nextDouble();
      t.setValue_double(temp2);
      double v10 = l.getValue_double() / t.getValue_double();
      System.out.println(v.getValue_double()+ v.getSuffix());
      sc.close(); /*tem de fechar*/
   }
}
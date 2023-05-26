import java.util.*;

public class dadosGuardados {
    private static int varCount = 0; // variable counter
    private static HashMap<String, ArrayList<String>> varMap = new HashMap<String, ArrayList<String>>();
    // usem este array para guardar as coisas sobre variaveis/dimensoes
    // por exemplo --> {Length : [real, meter, m], ...}

    private static HashMap<String, ArrayList<String>> conversions = new HashMap<>();
    // vai guardar por exemplo --> {inch : ["0.0254", "meter"], ...}

    private static HashMap<String, String> declared_vars = new HashMap<String, String>();
    // guardar as variaveis -----> {l : Length}
    
    private static HashMap<String, ArrayList<String>> dependent_units = new HashMap<String, ArrayList<String>>();
    // guardar dependencias das unidades dependentes
    // p.ex Volume -> [Length*Length*Length]
    private static int temp_var_counter = 1; 

    public static int getVarCount() {
        return varCount;
    }

    public static void setVarCount(int varCount1) {
        varCount = varCount1;
    }

    public static HashMap<String, ArrayList<String>> getVarMap() {
        return varMap;
    }

    public static void setVarMap(HashMap<String, ArrayList<String>> varMap1) {
        varMap = varMap1;
    }

    public static HashMap<String, ArrayList<String>> getConversions() {
        return conversions;
    }

    public static void setConversions(HashMap<String, ArrayList<String>> conversions1) {
        conversions = conversions1;
    }

    public static HashMap<String, String> getDeclared_vars() {
        return declared_vars;
    }

    public static void setDeclared_vars(HashMap<String, String> declared_vars1) {
        declared_vars = declared_vars1;
    }

    public static HashMap<String, ArrayList<String>> getDependent_units() {
        return dependent_units;
    }

    public static void setDependent_units(HashMap<String, ArrayList<String>> dependent_units1) {
        dependent_units = dependent_units1;
    }

    public static int getTemp_var_counter() {
        return temp_var_counter;
    }

    public static void setTemp_var_counter(int temp_var_counter1) {
        temp_var_counter = temp_var_counter1;
    }
}


public class DimensionVar  {

    private String type;
    private String dimension_unit;
    private int value_int;
    private double value_real;
    private String value_string;



    public DimensionVar(String type){
        this.type = type;
    }
 
    public DimensionVar(String type, String dimension_unit) {
        this.type = type; // tipo da variavel , (real ou integer)
        this.dimension_unit = dimension_unit; // dimensão da variável ( metros, kg etc...)
    }

    public DimensionVar(String type, String dimension_unit, int inicial_value) {
        this.type = type; // tipo da variavel , (real ou integer)
        this.dimension_unit = dimension_unit; // dimensão da variável ( metros, kg etc...)
        this.value_int = inicial_value; // para casos em que a expression é dada, tipo NMEC n = 5
    }

    public DimensionVar(String type, String dimension_unit, String inicial_value) {
        this.type = type; // tipo da variavel , (real ou integer)
        this.dimension_unit = dimension_unit; // dimensão da variável ( metros, kg etc...)
        this.value_string = inicial_value; // para casos em que a expression é dada, tipo NMEC n = 5
    }

    public DimensionVar(String type, String dimension_unit, double inicial_value) {
        this.type = type; // tipo da variavel , (real ou integer)
        this.dimension_unit = dimension_unit; // dimensão da variável ( metros, kg etc...)
        this.value_real = inicial_value; // para casos em que a expression é dada, tipo NMEC n = 5
    }


    public DimensionVar(String dimension_unit, int inicial_value ){
        this.dimension_unit = dimension_unit; 
        this.value_int = inicial_value; 
    }

    public DimensionVar(String dimension_unit, double value_real){
        this.dimension_unit = dimension_unit; // dimensão da variável ( metros, kg etc...)
        this.value_real = value_real; // para casos em que a expression é dada, tipo NMEC n = 5
    }

    /* conflito de metodos, dois constructores com String String
    public DimensionVar(String dimension_unit, String value_string){
        this.dimension_unit = dimension_unit; // dimensão da variável ( metros, kg etc...)
        this.value_string = value_string; // para casos em que a expression é dada, tipo NMEC n = 5
    }
    */

    public String getValue_string() {
        return value_string;
    }

    public void setValue_string(String value_string) {
        this.value_string = value_string;
    }


    public double getValue_double() {
        return value_real;
    }

    public void setValue_double(double value_real) {
        this.value_real = value_real;
    }

    
    public int getValue_integer() {
        return value_int;
    }

    public void setValue_integer(int inicial_value) {
        this.value_int = inicial_value;
    }


    public String getDimension_unit() {
        return dimension_unit;
    }

    public void setDimension_unit(String dimension_unit) {
        this.dimension_unit = dimension_unit;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


    }



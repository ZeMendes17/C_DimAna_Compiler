public class DimensionVar implements Comparable<DimensionVar> {

    private String type;
    private String dimension_unit;
    private int inicial_value;
 


    public DimensionVar(String type, String dimension_unit) {
        this.type = type; // tipo da variavel , (real ou integer)
        this.dimension_unit = dimension_unit; // dimensão da variável ( metros, kg etc...)
    }

    public DimensionVar(String type, String dimension_unit, int inicial_value) {
        this.type = type; // tipo da variavel , (real ou integer)
        this.dimension_unit = dimension_unit; // dimensão da variável ( metros, kg etc...)
        this.inicial_value = inicial_value; // para casos em que a expression é dada, tipo NMEC n = 5
    }

    public DimensionVar(String dimension_unit) {
        this.dimension_unit = dimension_unit; // dimensão da variável ( metros, kg etc...)
    }

    public DimensionVar(String dimension_unit, int inicial_value){
        this.dimension_unit = dimension_unit; // dimensão da variável ( metros, kg etc...)
        this.inicial_value = inicial_value; // para casos em que a expression é dada, tipo NMEC n = 5
    }

    
    public int getInicial_value() {
        return inicial_value;
    }

    public void setInicial_value(int inicial_value) {
        this.inicial_value = inicial_value;
    }


    public String getDimension_unit() {
        return dimension_unit;
    }

    public void setDimension_unit(String dimension_unit) {
        this.dimension_unit = dimension_unit;
    }


    @Override
    public int compareTo(DimensionVar o) {
        if (this.type.equals(o.type)) {
            return 1;
        } else {
            return 0;
        }
    }

    }



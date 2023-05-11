public class Dimension implements Comparable<Dimension> {

    private String type;
    private String dimension_unit;

    public Dimension(String type, String dimension_unit) {
        this.type = type;
        this.dimension_unit = dimension_unit;
    }

    public Dimension(String type) {
        this.type = type;
    }

    public Dimension() {
    }


    // return a instance of this class
    public Dimension getInstance() {
        return this;
    }




    public String getDimension_unit() {
        return dimension_unit;
    }

    public void setDimension_unit(String dimension_unit) {
        this.dimension_unit = dimension_unit;
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Dimension o) {
        if (this.type.equals(o.type)) {
            return 1;
        } else {
            return 0;
        }
    }

    }



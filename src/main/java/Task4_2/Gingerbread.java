package Task4_2;

public class Gingerbread extends Sweets {
    private String shape;

    public Gingerbread(String name, double weight, double price, String shape) {
        super(name, weight, price);
        this.shape = shape;
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    @Override
    public String toString()
    {
        return "Gingerbread " + "(" + super.toString() + ", форма - " + shape + ")";
    }
}



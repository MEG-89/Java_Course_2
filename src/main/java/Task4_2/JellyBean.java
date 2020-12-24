package Task4_2;

public class JellyBean extends Sweets {
    private String flavor;

    public JellyBean(String name, double weight, double price, String flavor) {
        super(name, weight, price);
        this.flavor = flavor;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    @Override
    public String toString()
    {
        return "JellyBean " + "(" + super.toString() + ", вкус - " + flavor + ")";
    }
}

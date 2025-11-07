public class Muffin extends BakeryItem {
    // Unique instance variable for Muffin
    private String flavor;

    // No-argument constructor
    public Muffin() {
        super();
        this.flavor = "Vanilla";
    }

    // Parameterized constructor
    public Muffin(String name, double price, int quantity, String flavor) {
        super(name, price, quantity);
        this.flavor = flavor;
    }

    // Accessor and mutator
    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    // toString method
    public String toString() {
        return super.toString() + ", Flavor: " + flavor;
    }
}

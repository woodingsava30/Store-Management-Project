public class Bread extends BakeryItem {
    // Unique instance variable for Bread
    private String flourType;

    // No-argument constructor
    public Bread() {
        super();
        this.flourType = "All-purpose";
    }

    // Parameterized constructor
    public Bread(String name, double price, int quantity, String flourType) {
        super(name, price, quantity);
        this.flourType = flourType;
    }

    // Accessor and mutator
    public String getFlourType() {
        return flourType;
    }

    public void setFlourType(String flourType) {
        this.flourType = flourType;
    }

    // toString method
    public String toString() {
        return super.toString() + ", Flour Type: " + flourType;
    }
}

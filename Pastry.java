public class Pastry extends BakeryItem {
    // Unique instance variable for Pastry
    private boolean hasFilling;

    // No-argument constructor
    public Pastry() {
        super();
        this.hasFilling = false;
    }

    // Parameterized constructor
    public Pastry(String name, double price, int quantity, boolean hasFilling) {
        super(name, price, quantity);
        this.hasFilling = hasFilling;
    }

    // Accessor and mutator
    public boolean getHasFilling() {
        return hasFilling;
    }

    public void setHasFilling(boolean hasFilling) {
        this.hasFilling = hasFilling;
    }

    // toString method
    public String toString() {
        return super.toString() + ", Has Filling: " + (hasFilling ? "Yes" : "No");
    }
}

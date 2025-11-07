// Superclass: BakeryItem
public class BakeryItem {
    // Instance variables shared by all bakery items
    private String name;
    private double price;
    private int quantity;

    // No-argument constructor
    public BakeryItem() {
        this.name = "Unknown Item";
        this.price = 0.0;
        this.quantity = 0;
    }

    // Parameterized constructor
    public BakeryItem(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    // Accessor methods (getters)
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    // Mutator methods (setters)
    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // toString method
    public String toString() {
        return "Item: " + name + ", Price: $" + price + ", Quantity: " + quantity;
    }
}

public class BakeryDemo {
    public static void main(String[] args) {
        // Create objects from each subclass
        Bread sourdough = new Bread("Sourdough Bread", 5.50, 20, "Whole Wheat");
        Pastry croissant = new Pastry("Croissant", 3.25, 15, true);
        Muffin blueberry = new Muffin("Blueberry Muffin", 2.75, 25, "Blueberry");

        // Display bakery items
        System.out.println(sourdough);
        System.out.println(croissant);
        System.out.println(blueberry);
    }
}

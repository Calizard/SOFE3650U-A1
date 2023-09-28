// Concrete Product
public class Banana extends GroceryProduct{
    // Sets the name of the grocery product
    public Banana() {
        super("Banana");
    }

    @Override
    public String getProductType() {
        return "Banana";
    }
}

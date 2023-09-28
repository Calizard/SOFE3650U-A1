// Concrete Product
public class Apple extends GroceryProduct{
    // Sets the name of the grocery product
    public Apple() {
        super("Apple");
    }

    @Override
    public String getProductType() {
        return "Apple";
    }
}

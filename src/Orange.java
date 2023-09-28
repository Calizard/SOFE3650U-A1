// Concrete Product
public class Orange extends GroceryProduct{
    // Sets the name of the grocery product
    public Orange() {
        super("Orange");
    }

    @Override
    public String getProductType() {
        return "Orange";
    }
}

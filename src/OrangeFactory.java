// Concrete Product Factory
public class OrangeFactory implements GroceryProductFactory{

    @Override
    public GroceryProduct createProduct() {
        return new Orange();
    }
}
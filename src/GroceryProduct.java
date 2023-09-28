// Abstract Product
public abstract class GroceryProduct {
    private String name;
    private double price;
    public GroceryProduct(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public abstract String getProductType();
}

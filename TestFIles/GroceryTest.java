import java.io.IOException;
import java.util.Map;

// Test Driver
public class GroceryTest {
    public static void main(String[] args) {
        try {
            // Reads prices from a specified file and stores product names and its price in a map
            Map<String, Double> prices = FileReader.readPrices();

            // Creates concrete factories
            GroceryProductFactory appleFactory = new AppleFactory();
            GroceryProductFactory bananaFactory = new BananaFactory();
            GroceryProductFactory orangeFactory = new OrangeFactory();

            // Creates grocery products
            GroceryProduct apple = appleFactory.createProduct();
            GroceryProduct banana = bananaFactory.createProduct();
            GroceryProduct orange = orangeFactory.createProduct();

            // Set product price based on its price stored in a file
            apple.setPrice(prices.get(apple.getName()));
            banana.setPrice(prices.get(banana.getName()));
            orange.setPrice(prices.get(orange.getName()));

            // Displays product information
            System.out.println("Product Name: " + apple.getName() + "\nProduct Type: " + apple.getProductType() + "\nPrice: $" + apple.getPrice() + "\n");
            System.out.println("Product Name: " + banana.getName() + "\nProduct Type: " + banana.getProductType() + "\nPrice: $" + banana.getPrice() + "\n");
            System.out.println("Product Name: " + orange.getName() + "\nProduct Type: " + orange.getProductType() + "\nPrice: $" + orange.getPrice() + "\n");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FileReader {
    private static final String DIRECTORY = "TestFiles/price_list.dat";

    public static Map<String, Double> readPrices() throws FileNotFoundException {
        Map<String, Double> prices = new HashMap<>();
        File file = new File(DIRECTORY);

        try (Scanner scan = new Scanner(file)) {
            while (scan.hasNextLine()) {
                String line = scan.nextLine();
                String[] parts = line.split(",");
                if (parts.length == 2) {
                    String productName = parts[0].trim();
                    double price = Double.parseDouble(parts[1].trim());
                    prices.put(productName,price);
                }
            }
        } catch (FileNotFoundException e) {
            throw e;
        }
        return prices;
    }
}

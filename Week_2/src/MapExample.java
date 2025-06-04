import java.util.HashMap;

public class MapExample {
    public static void main(String[] args) {
        // A map to store product prices (product name -> price)
        HashMap<String, Double> productPrices = new HashMap<>();

        // Adding key-value pairs
        productPrices.put("Apple", 1.2);
        productPrices.put("Banana", 0.5);
        productPrices.put("Orange", 0.8);

        // Updating price
        productPrices.put("Banana", 0.6); // overwrites old value

        // Removing an item
        productPrices.remove("Orange");

        // Printing all key-value pairs
        System.out.println("Product Prices:");
        for (String product : productPrices.keySet()) {
            System.out.println(product + " = $" + productPrices.get(product));
        }

        // Check if a product exists
        if (productPrices.containsKey("Apple")) {
            System.out.println("Apple is available at $" + productPrices.get("Apple"));
        }
    }
}

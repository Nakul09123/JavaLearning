import java.util.HashMap;

public class MapExample {
    public static void main(String[] args) {
        HashMap<String, Double> productPrices = new HashMap<>();

        productPrices.put("Apple", 1.2);
        productPrices.put("Banana", 0.5);
        productPrices.put("Orange", 0.8);

        productPrices.put("Banana", 0.6); // overwrites old value

        productPrices.remove("Orange");

        System.out.println("Product Prices:");
        for (String product : productPrices.keySet()) {
            System.out.println(product + " = $" + productPrices.get(product));
        }

        if (productPrices.containsKey("Apple")) {
            System.out.println("Apple is available at $" + productPrices.get("Apple"));
        }
    }
}

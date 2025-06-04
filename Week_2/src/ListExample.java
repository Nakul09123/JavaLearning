import java.util.ArrayList;

public class ListExample {
    public static void main(String[] args) {
        // Creating a list to store grocery items
        ArrayList<String> groceries = new ArrayList<>();

        // Adding items to the list
        groceries.add("Milk");
        groceries.add("Eggs");
        groceries.add("Bread");

        // Inserting an item at a specific index
        groceries.add(1, "Butter");

        // Removing an item
        groceries.remove("Eggs");

        // Printing the list
        System.out.println("Grocery list:");
        for (String item : groceries) {
            System.out.println("- " + item);
        }

        // Checking size
        System.out.println("Total items: " + groceries.size());
    }
}

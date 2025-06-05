import java.util.ArrayList;

public class ListExample {
    public static void main(String[] args) {
        ArrayList<String> groceries = new ArrayList<>();

        groceries.add("Milk");
        groceries.add("Eggs");
        groceries.add("Bread");

        groceries.add(1, "Butter");

        groceries.remove("Eggs");

        System.out.println("Grocery list:");
        for (String item : groceries) {
            System.out.println("- " + item);
        }

        System.out.println("Total items: " + groceries.size());
    }
}

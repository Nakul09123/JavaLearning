import java.util.HashSet;

public class SetExample {
    public static void main(String[] args) {
        // A set to store unique student IDs
        HashSet<Integer> studentIDs = new HashSet<>();

        // Adding IDs (some are duplicates)
        studentIDs.add(101);
        studentIDs.add(102);
        studentIDs.add(103);
        studentIDs.add(101); // duplicate
        studentIDs.add(104);

        // Printing the set
        System.out.println("Unique student IDs:");
        for (Integer id : studentIDs) {
            System.out.println(id);
        }

        // Check if a particular ID exists
        if (studentIDs.contains(102)) {
            System.out.println("ID 102 exists in the set.");
        }

        // Set does not maintain order and removes duplicates automatically
    }
}

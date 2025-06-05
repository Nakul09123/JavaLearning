import java.util.HashSet;

public class SetExample {
    public static void main(String[] args) {
        HashSet<Integer> studentIDs = new HashSet<>();

        studentIDs.add(101);
        studentIDs.add(102);
        studentIDs.add(103);
        studentIDs.add(101); // duplicate
        studentIDs.add(104);

        System.out.println("Unique student IDs:");
        for (Integer id : studentIDs) {
            System.out.println(id);
        }

        if (studentIDs.contains(102)) {
            System.out.println("ID 102 exists in the set.");
        }

    }
}

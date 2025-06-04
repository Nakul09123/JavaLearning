public class ArrayExample {
    public static void main(String[] args) {
        // Let's store the marks of 5 students using an array
        int[] marks = new int[5];

        // Assigning values to the array
        marks[0] = 75;
        marks[1] = 88;
        marks[2] = 90;
        marks[3] = 67;
        marks[4] = 95;

        // Printing the array using a loop
        System.out.println("Student marks:");
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Student " + (i + 1) + ": " + marks[i]);
        }
    }
}

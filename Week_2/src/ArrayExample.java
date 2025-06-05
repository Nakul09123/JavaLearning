public class ArrayExample {
    public static void main(String[] args) {
        int[] marks = new int[5];

        marks[0] = 75;
        marks[1] = 88;
        marks[2] = 90;
        marks[3] = 67;
        marks[4] = 95;

        System.out.println("Student marks:");
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Student " + (i + 1) + ": " + marks[i]);
        }
    }
}

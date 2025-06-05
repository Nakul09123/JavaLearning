public class TryCatchExample {
    public static void main(String[] args) {
        System.out.println("Program started");

        try {
            int result = 10 / 0; // This will throw ArithmeticException
            System.out.println("Result: " + result); // Won't run
        } catch (ArithmeticException e) {
            System.out.println("Caught an exception: " + e.getMessage());
        }

        System.out.println("Program continues after catch block");
    }
}

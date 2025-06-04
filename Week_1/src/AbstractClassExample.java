// This is an abstract class that cannot be directly instantiated
abstract class Animal {
    // Abstract method (must be implemented by child class)
    public abstract void makeSound();

    // Normal method with a defined body
    public void sleep() {
        System.out.println("The animal is sleeping");
    }
}

// This is a concrete class that extends the abstract class
public class AbstractClassExample extends Animal {
    // Providing implementation for the abstract method
    public void makeSound() {
        System.out.println("Dog barks");
    }

    public static void main(String[] args) {
        // Creating an object of the concrete class
        AbstractClassExample dog = new AbstractClassExample();

        // Calling the implemented abstract method
        dog.makeSound();

        // Calling the non-abstract method
        dog.sleep();
    }
}

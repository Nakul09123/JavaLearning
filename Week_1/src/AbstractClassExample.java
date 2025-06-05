abstract class Animal {
    public abstract void makeSound();

    public void sleep() {
        System.out.println("The animal is sleeping");
    }
}

public class AbstractClassExample extends Animal {
    public void makeSound() {
        System.out.println("Dog barks");
    }

    public static void main(String[] args) {
        AbstractClassExample dog = new AbstractClassExample();

        dog.makeSound();

        dog.sleep();
    }
}

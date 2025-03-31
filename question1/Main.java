// Main.java - Demonstration
public class Main {
    public static void main(String[] args) {
        // Method overloading demonstration
        MathOperations math = new MathOperations();
        System.out.println("2 * 3 = " + math.multiply(2, 3));
        System.out.println("2 * 3 * 4 = " + math.multiply(2, 3, 4));

        // Method overriding and polymorphism demonstration
        Animal myAnimal = new Animal();
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        myAnimal.makeSound();
        myDog.makeSound();
        myCat.makeSound();
    }
}

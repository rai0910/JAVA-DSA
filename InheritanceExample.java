// Base class
class Animal {
    // Method in the base class
    void eat() {
        System.out.println("This animal eats food.");
    }
}

// Derived class
class Dog extends Animal {
    // Method in the derived class
    void bark() {
        System.out.println("The dog barks.");
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        // Create an object of the Dog class
        Dog myDog = new Dog();
        
        // Call the method from the base class
        myDog.eat(); // Inherited method
        
        // Call the method from the Dog class
        myDog.bark(); // Dog's own method
    }
}
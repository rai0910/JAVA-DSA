interface Animal {
    void eat();
    void makeSound();
}

class Dog implements Animal {
    public void eat() {
        System.out.println("The dog eats dog food.");
    }
    
    public void makeSound() {
        System.out.println("The dog barks.");
    }
}

class Cat implements Animal {
    public void eat() {
        System.out.println("The cat eats cat food.");
    }
    
    public void makeSound() {
        System.out.println("The cat meows.");
    }
}

public class InterfaceExample {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        Animal myCat = new Cat();
        
        myDog.eat();
        myDog.makeSound();
        
        myCat.eat();
        myCat.makeSound();
    }
}
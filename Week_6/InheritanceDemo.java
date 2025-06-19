// Superclass (Parent)
class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

// Subclass (Child) inheriting from Animal
class Dog extends Animal {
    void bark() {
        System.out.println("The dog barks.");
    }
}

// Main class to demonstrate inheritance
public class InheritanceDemo {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.eat();   // Inherited method from Animal
        myDog.bark();  // Method from Dog
    }
}
public class Animal {
    // Access modifier: private
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    // Nested class (inner class)
    class AnimalSound {
        public void makeSound() {
            System.out.println(name + " makes a sound.");
        }
    }

    // Method demonstrating anonymous class
    public void performAction() {
        // Anonymous class implementing Runnable
        Runnable action = new Runnable() {
            @Override
            public void run() {
                System.out.println(name + " is running (from anonymous class).");
            }
        };
        action.run();
    }

    public static void main(String[] args) {
        Animal dog = new Animal("Dog");

        // Using nested (inner) class
        Animal.AnimalSound sound = dog.new AnimalSound();
        sound.makeSound();

        // Using anonymous class
        dog.performAction();
    }
}
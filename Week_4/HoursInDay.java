// Define the interface
interface TimeCalculator {
    int getHoursInDay();
    void printHoursInDay();
    default void printGreeting() {
        System.out.println("Welcome to the Hours Calculator!");
    }
}

// Implement the interface in a class
class DayHours implements TimeCalculator {
    public int getHoursInDay() {
        return 24;
    }

    public void printHoursInDay() {
        System.out.println("There are " + getHoursInDay() + " hours in a day.");
    }
}

// Main class to run the program
public class HoursInDay {
    public static void main(String[] args) {
        TimeCalculator calculator = new DayHours();
        calculator.printGreeting();      // Using default method
        calculator.printHoursInDay();    // Using implemented method
    }
}
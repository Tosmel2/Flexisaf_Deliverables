// Enum to capture days of the week
enum Day {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}

// Superclass
class Week {
    public void displayDays() {
        System.out.println("Days of the week:");
        for (Day day : Day.values()) {
            System.out.println(day);
        }
    }
}

// Subclass
class SpecialWeek extends Week {
    public void displayWeekend() {
        System.out.println("Weekend days:");
        System.out.println(Day.SATURDAY);
        System.out.println(Day.SUNDAY);
    }
}

// Main class to run the program
public class DaysOfTheWeek {
    public static void main(String[] args) {
        SpecialWeek week = new SpecialWeek();
        week.displayDays();
        System.out.println();
        week.displayWeekend();
    }
}
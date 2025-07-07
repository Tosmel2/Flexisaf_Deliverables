package school;
public class Student extends Learner implements StudentActions {
    private double gpa;
    private int year;

    public double getGpa() { return gpa; }
    public void setGpa(double gpa) { this.gpa = gpa; }

    public int getYear() { return year; }
    public void setYear(int year) { this.year = year; }

    @Override
    public void learn() {
        System.out.println("Student is learning.");
    }

    @Override
    public void study() {
        System.out.println("Student is studying.");
    }

    @Override
    public void attendClass() {
        System.out.println("Student is attending class.");
    }

    @Override
    public void submitAssignment() {
        System.out.println("Student is submitting assignment.");
    }

    @Override
    public void introduce() {
        System.out.println("I am a student.");
    }
}
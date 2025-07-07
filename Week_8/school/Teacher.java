package school;
public class Teacher extends Employee implements TeacherActions {
    private String subject;
    private int experience;

    public String getSubject() { return subject; }
    public void setSubject(String subject) { this.subject = subject; }

    public int getExperience() { return experience; }
    public void setExperience(int experience) { this.experience = experience; }

    @Override
    public void doWork() {
        System.out.println("Teacher is working.");
    }

    @Override
    public void teach() {
        System.out.println("Teacher is teaching.");
    }

    @Override
    public void grade() {
        System.out.println("Teacher is grading.");
    }

    @Override
    public void prepareLesson() {
        System.out.println("Teacher is preparing lesson.");
    }

    @Override
    public void introduce() {
        System.out.println("I am a teacher.");
    }
}
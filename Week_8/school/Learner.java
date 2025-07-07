package school;
public abstract class Learner extends Person {
    private String studentId;
    private String course;

    public String getStudentId() { return studentId; }
    public void setStudentId(String studentId) { this.studentId = studentId; }

    public String getCourse() { return course; }
    public void setCourse(String course) { this.course = course; }

    public abstract void learn();
}
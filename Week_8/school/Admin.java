package school;
public class Admin extends Employee implements AdminActions {
    private String department;
    private String role;

    public String getDepartment() { return department; }
    public void setDepartment(String department) { this.department = department; }

    public String getRole() { return role; }
    public void setRole(String role) { this.role = role; }

    @Override
    public void doWork() {
        System.out.println("Admin is working.");
    }

    @Override
    public void manage() {
        System.out.println("Admin is managing.");
    }

    @Override
    public void schedule() {
        System.out.println("Admin is scheduling.");
    }

    @Override
    public void evaluate() {
        System.out.println("Admin is evaluating.");
    }

    @Override
    public void introduce() {
        System.out.println("I am an admin.");
    }
}
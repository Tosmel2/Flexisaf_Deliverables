package school;
public abstract class Employee extends Person {
    private String employeeId;
    private double salary;

    public String getEmployeeId() { return employeeId; }
    public void setEmployeeId(String employeeId) { this.employeeId = employeeId; }

    public double getSalary() { return salary; }
    public void setSalary(double salary) { this.salary = salary; }

    public abstract void doWork();
}
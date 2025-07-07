package school;
public class Parent extends Person implements PersonActions {
    private String childName;
    private String contactNumber;

    public String getChildName() { return childName; }
    public void setChildName(String childName) { this.childName = childName; }

    public String getContactNumber() { return contactNumber; }
    public void setContactNumber(String contactNumber) { this.contactNumber = contactNumber; }

    @Override
    public void work() {
        System.out.println("Parent is working.");
    }

    @Override
    public void relax() {
        System.out.println("Parent is relaxing.");
    }

    @Override
    public void report() {
        System.out.println("Parent is reporting.");
    }

    @Override
    public void introduce() {
        System.out.println("I am a parent.");
    }
}
package school;

public class Main {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("Tosin");
        s.setGpa(3.8);
        s.introduce();
        s.study();

        Teacher t = new Teacher();
        t.setName("Mr. Adewale");
        t.setSubject("Math");
        t.introduce();
        t.teach();

        Admin a = new Admin();
        a.setName("Mrs. Johnson");
        a.setDepartment("Admissions");
        a.introduce();
        a.manage();

        Librarian l = new Librarian();
        l.setName("Mr. Musa");
        l.setBooksIssued(120);
        l.introduce();
        l.issueBook();

        Parent p = new Parent();
        p.setName("Mrs. Bello");
        p.setChildName("Tosin");
        p.introduce();
        p.report();
    }
}
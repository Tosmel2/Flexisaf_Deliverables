package school;
public class Librarian extends Employee implements LibraryActions {
    private int booksIssued;
    private String shift;

    public int getBooksIssued() { return booksIssued; }
    public void setBooksIssued(int booksIssued) { this.booksIssued = booksIssued; }

    public String getShift() { return shift; }
    public void setShift(String shift) { this.shift = shift; }

    @Override
    public void doWork() {
        System.out.println("Librarian is working.");
    }

    @Override
    public void issueBook() {
        System.out.println("Librarian is issuing a book.");
    }

    @Override
    public void returnBook() {
        System.out.println("Librarian is returning a book.");
    }

    @Override
    public void catalogBook() {
        System.out.println("Librarian is cataloging a book.");
    }

    @Override
    public void introduce() {
        System.out.println("I am a librarian.");
    }
}
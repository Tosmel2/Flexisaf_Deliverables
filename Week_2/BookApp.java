import java.util.Scanner;

class Book {
    String title;
    String author;
    String isbn;

    Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    void displayBook() {
        System.out.println("Title: " + title + ", Author: " + author + ", ISBN: " + isbn);
    }
}

public class BookApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create an array of books
        // Assuming a maximum of 3 books for simplicity
        Book[] books = new Book[3]; 
        int count = 0;

        // Add 3 books manually
        books[count++] = new Book("Flexisaf Backend", "Tosin", "1111");
        books[count++] = new Book("Clean Code", "Tosmel", "2222");
        books[count++] = new Book("Introduction to Java", "Adnegs", "3333");


        // Display all books
        System.out.println("Book Collection:");
        for (int i = 0; i < count; i++) {
            books[i].displayBook();
        }

        // Remove a book by ISBN
        System.out.print("\nEnter ISBN to remove: ");
        String isbnToRemove = scanner.nextLine();

        boolean removed = false;
        for (int i = 0; i < count; i++) {
            if (books[i] != null && books[i].isbn.equals(isbnToRemove)) {
                // Shift remaining books to the left
                for (int j = i; j < count - 1; j++) {
                    books[j] = books[j + 1];
                }
                books[count - 1] = null;
                count--;
                removed = true;
                System.out.println("Book removed.");
                break;
            }
        }

        if (!removed) {
            System.out.println("Book not found.");
        }

        // Display books after removal
        System.out.println("\nUpdated Book Collection:");
        for (int i = 0; i < count; i++) {
            books[i].displayBook();
        }

        scanner.close();
    }
}


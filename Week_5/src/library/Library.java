package library;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added successfully!");
    }

    public void viewBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available.");
        } else {
            for (Book book : books) {
                book.display();
            }
        }
    }

    public void searchBook(String keyword) {
        boolean found = false;
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(keyword) ||
                    book.getAuthor().equalsIgnoreCase(keyword) ||
                    book.getGenre().equalsIgnoreCase(keyword)) {
                book.display();
                found = true;
            }
        }
        if (!found) {
            System.out.println("No matching book found.");
        }
    }

    public boolean borrowBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                if (book.borrowBook()) {
                    System.out.println("Book borrowed successfully.");
                    return true;
                } else {
                    System.out.println("Book is currently not available.");
                    return false;
                }
            }
        }
        System.out.println("Book not found.");
        return false;
    }

    public void returnBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                book.returnBook();
                System.out.println("Book returned successfully.");
                return;
            }
        }
        System.out.println("Book not found.");
    }
}

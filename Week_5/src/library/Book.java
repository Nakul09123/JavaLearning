package library;

public class Book {
    private String title;
    private String author;
    private String genre;
    private int copies;

    public Book(String title, String author, String genre, int copies) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.copies = copies;
    }

    // Getters
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public String getGenre() { return genre; }
    public int getCopies() { return copies; }

    // Borrow book
    public boolean borrowBook() {
        if (copies > 0) {
            copies--;
            return true;
        }
        return false;
    }

    // Return book
    public void returnBook() {
        copies++;
    }

    // Display book
    public void display() {
        System.out.println("Title: " + title + " | Author: " + author + " | Genre: " + genre + " | Copies: " + copies);
    }
}

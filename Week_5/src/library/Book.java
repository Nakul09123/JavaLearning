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

    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public String getGenre() { return genre; }

    public boolean borrowBook() {
        if (copies > 0) {
            copies--;
            return true;
        }
        return false;
    }

    public void returnBook() {
        copies++;
    }

    public void display() {
        System.out.println("Title: " + title + " | Author: " + author + " | Genre: " + genre + " | Copies: " + copies);
    }
}

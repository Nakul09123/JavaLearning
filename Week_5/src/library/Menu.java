package library;

import java.util.Scanner;

public class Menu {
    private Library library;
    private Scanner scanner;

    public Menu() {
        library = new Library();
        scanner = new Scanner(System.in);
    }

    public void showMenu() {
        int choice;
        do {
            System.out.println("\n=== Library Management ===");
            System.out.println("1. Add Book");
            System.out.println("2. View Books");
            System.out.println("3. Search Book");
            System.out.println("4. Borrow Book");
            System.out.println("5. Return Book");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt(); scanner.nextLine();

            switch (choice) {
                case 1: addBook(); break;
                case 2: library.viewBooks(); break;
                case 3: searchBook(); break;
                case 4: borrowBook(); break;
                case 5: returnBook(); break;
                case 6: System.out.println("Exiting..."); break;
                default: System.out.println("Invalid choice!");
            }
        } while (choice != 6);
    }

    private void addBook() {
        System.out.print("Title: ");
        String title = scanner.nextLine();
        System.out.print("Author: ");
        String author = scanner.nextLine();
        System.out.print("Genre: ");
        String genre = scanner.nextLine();
        System.out.print("Copies: ");
        int copies = scanner.nextInt(); scanner.nextLine();
        library.addBook(new Book(title, author, genre, copies));
    }

    private void searchBook() {
        System.out.print("Enter title/author/genre to search: ");
        String keyword = scanner.nextLine();
        library.searchBook(keyword);
    }

    private void borrowBook() {
        System.out.print("Enter book title to borrow: ");
        String title = scanner.nextLine();
        library.borrowBook(title);
    }

    private void returnBook() {
        System.out.print("Enter book title to return: ");
        String title = scanner.nextLine();
        library.returnBook(title);
    }
}

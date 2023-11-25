
package libraryrs;

import java.util.List;
import java.util.Scanner;

public class LibraryRS {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner research = new Scanner(System.in);

        while (true) {
            System.out.println("Library Management System");
            System.out.println("1. Add Book");
            System.out.println("2. Search by Title");
            System.out.println("3. Search by Author");
            System.out.println("Enter your choice:");
            int choice = research.nextInt();
            research.nextLine(); 

            switch (choice) {
                case 1:
                    addBook(library, research);
                    break;
                case 2:
                    searchByTitle(library, research);
                    break;
                case 3:
                    searchByAuthor(library, research);
                    break;
               
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void addBook(Library library, Scanner research) {
        System.out.println("Enter Book Title:");
        String title = research.nextLine();
        System.out.println("Enter Author Name:");
        String author = research.nextLine();
        System.out.println("Enter Book ID:");
        String id = research.nextLine();

        Book newBook = new Book(title, author, id);
        library.addBook(newBook);
        System.out.println("Book added successfully.");
    }

    private static void searchByTitle(Library library, Scanner research) {
        System.out.println("Enter Book Title:");
        String title = research.nextLine();
        List<Book> foundBooks = library.searchByTitle(title);
        if (foundBooks.isEmpty()) {
            System.out.println("No books found with that title.");
        } else {
            foundBooks.forEach(System.out::println);
        }
    }

    private static void searchByAuthor(Library library, Scanner research) {
        System.out.println("Enter Author Name:");
        String author = research.nextLine();
        List<Book> foundBooks = library.searchByAuthor(author);
        if (foundBooks.isEmpty()) {
            System.out.println("No books found by that author.");
        } else {
            foundBooks.forEach(System.out::println);
        }
    }
}
   


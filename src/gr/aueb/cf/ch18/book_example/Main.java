package gr.aueb.cf.ch18.book_example;

import gr.aueb.cf.ch18.book_example.core.exceptions.BookNotFoundException;
import gr.aueb.cf.ch18.book_example.dao.BookDAOImpl;
import gr.aueb.cf.ch18.book_example.dao.IBookDAO;
import gr.aueb.cf.ch18.book_example.dto.BookInsertDTO;
import gr.aueb.cf.ch18.book_example.dto.BookReadOnlyDTO;
import gr.aueb.cf.ch18.book_example.service.BookServiceImpl;
import gr.aueb.cf.ch18.book_example.service.IBookService;
import gr.aueb.cf.ch18.book_example.validation.Validator;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private final static Scanner scanner = new Scanner(System.in);
    private final static IBookDAO bookDAO = new BookDAOImpl();
    private final static IBookService bookService = new BookServiceImpl();


    public static void main(String[] args) {
        String option;

        while (true) {
            printMenu();
            option = scanner.nextLine();

            try {
                switch (option) {
                    case "1":
                        addBook();
                        break;
                    case "2":
                        getBookByIsbn();
                        break;
                    case "3":
                        deleteBookByIsbn();
                        break;
                    case "4":
                        printAllBooks();
                        break;
                    case "5":
                        System.out.println("Έξοδος...");
                        scanner.close();
                        return;
                    default:
                        System.out.println("Μη έγκυρη επιλογή. Προσπαθήστε ξανά.");
                }
            } catch (BookNotFoundException e) {
                System.out.println("Σφάλμα: " + e.getMessage());
            }
        }
    }

    private static void addBook() {
        System.out.print("ISBN: ");
        String isbn = scanner.nextLine();
        System.out.print("Τίτλος: ");
        String title = scanner.nextLine();
        System.out.print("Συγγραφέας: ");
        String author = scanner.nextLine();

        BookInsertDTO dto = new BookInsertDTO(isbn, title, author);
        Map<String, String> errors = Validator.validate(dto);

        if (!errors.isEmpty()) {
            errors.forEach((k, v) -> System.out.println("Σφάλμα: " + v));
            return;
        }

        bookService.createNewBook(dto);
        System.out.println("Το βιβλίο προστέθηκε με επιτυχία.");
    }

    private static void getBookByIsbn() throws BookNotFoundException {
        System.out.print("ISBN: ");
        String isbn = scanner.nextLine();
        BookReadOnlyDTO dto = bookService.getBookByIsbn(isbn);
        System.out.println("Βρέθηκε: " + dto);
    }

    private static void deleteBookByIsbn() throws BookNotFoundException {
        System.out.print("ISBN: ");
        String isbn = scanner.nextLine();
        bookService.deleteBookByIsbn(isbn);
        System.out.println("Το βιβλίο διαγράφηκε.");
    }

    private static void printAllBooks() {
        List<BookReadOnlyDTO> books = bookService.getAllBooks();
        if (books.isEmpty()) {
            System.out.println("Δεν υπάρχουν βιβλία.");
        } else {
            books.forEach(System.out::println);
        }
    }

    private static void printMenu() {
        System.out.println("\n=== Διαχείριση Βιβλιοθήκης ===");
        System.out.println("1. Προσθήκη Βιβλίου");
        System.out.println("2. Εύρεση Βιβλίου με ISBN");
        System.out.println("3. Διαγραφή Βιβλίου");
        System.out.println("4. Εκτύπωση Όλων των Βιβλίων");
        System.out.println("5. Έξοδος");
        System.out.print("Επιλέξτε ενέργεια: ");
    }
}

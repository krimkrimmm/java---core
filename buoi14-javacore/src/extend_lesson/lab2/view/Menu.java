package extend_lesson.lab2.view;

import extend_lesson.lab2.entities.Book;
import extend_lesson.lab2.entities.Reader;
import extend_lesson.lab2.service.BookService;
import extend_lesson.lab2.service.ReaderService;
import extend_lesson.lab2.service.TicketbookService;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Menu {

    private BookService bookService = new BookService();
    private ReaderService readerService = new ReaderService();
    private TicketbookService ticketbookService = new TicketbookService();

    public void displayMenu(Scanner scanner) {
        while (true) {
            System.out.println("1. Manage Books");
            System.out.println("2. Manage Readers");
            System.out.println("3. Manage Borrow/Return");
            System.out.println("4. Exit");
            int choice = InputUtils.getInt("Choose an option: ");

            switch (choice) {
                case 1: manageBooks(); break;
                case 2: manageReaders(); break;
                case 3: manageBorrowReturn(); break;
                case 4: System.exit(0);
                default: System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private void manageBooks() {
        System.out.println("1. Add Book");
        System.out.println("2. Delete Book");
        System.out.println("3. Update Book");
        System.out.println("4. View Book");
        System.out.println("5. View All Books");
        System.out.println("6. Search Books by Name");
        System.out.println("7. Search Books by Author");
        int choice = InputUtils.getInt("Choose an option: ");

        switch (choice) {
            case 1: addBook(); break;
            case 2: deleteBook(); break;
            case 3: updateBook(); break;
            case 4: viewBook(); break;
            case 5: viewAllBooks(); break;
            case 6: searchBooksByName(); break;
            case 7: searchBooksByAuthor(); break;
            default: System.out.println("Invalid choice. Please try again.");
        }
    }

    private void addBook() {
        Book book = new Book(InputUtils.getInt("Enter book ID: "), InputUtils.getString("Enter book name: "), InputUtils.getString("Enter book topic: "), InputUtils.getString("Enter book author: "), InputUtils.getInt("Enter book quantity: "));
        bookService.addBook(book);
    }

    private void deleteBook() { bookService.deleteBook(InputUtils.getInt("Enter book ID to delete: ")); }

    private void updateBook() {
        Book book = new Book(InputUtils.getInt("Enter book ID to update: "), InputUtils.getString("Enter new book name: "), InputUtils.getString("Enter new book topic: "), InputUtils.getString("Enter new book author: "), InputUtils.getInt("Enter new book quantity: "));
        bookService.updateBook(book);
    }

    private void viewBook() {
        Book book = bookService.getBook(InputUtils.getInt("Enter book ID to view: "));
        if (book != null) System.out.println(book);
    }

    private void viewAllBooks() { bookService.getAllBooks().forEach(System.out::println); }

    private void searchBooksByName() {
        List<Book> books = bookService.searchBooksByName(InputUtils.getString("Enter book name to search: "));
        if (books.isEmpty()) System.out.println("No books found with the given name.");
        else books.forEach(System.out::println);
    }

    private void searchBooksByAuthor() {
        List<Book> books = bookService.searchBooksByAuthor(InputUtils.getString("Enter book author to search: "));
        if (books.isEmpty()) System.out.println("No books found with the given author.");
        else books.forEach(System.out::println);
    }

    private void manageReaders() {
        System.out.println("1. Add Reader");
        System.out.println("2. Delete Reader");
        System.out.println("3. Update Reader");
        System.out.println("4. View Reader");
        System.out.println("5. View All Readers");
        System.out.println("6. Search Readers by Name");
        System.out.println("7. Search Readers by Phone Number");
        int choice = InputUtils.getInt("Choose an option: ");

        switch (choice) {
            case 1: addReader(); break;
            case 2: deleteReader(); break;
            case 3: updateReader(); break;
            case 4: viewReader(); break;
            case 5: viewAllReaders(); break;
            case 6: searchReadersByName(); break;
            case 7: searchReadersByPhoneNumber(); break;
            default: System.out.println("Invalid choice. Please try again.");
        }
    }

    private void addReader() {
        Reader reader = new Reader(InputUtils.getInt("Enter reader ID: "), InputUtils.getString("Enter reader name: "), InputUtils.getString("Enter reader phone number: "), InputUtils.getString("Enter reader address: "));
        readerService.addReader(reader);
    }

    private void deleteReader() { readerService.deleteReader(InputUtils.getInt("Enter reader ID to delete: ")); }

    private void updateReader() {
        Reader reader = new Reader(InputUtils.getInt("Enter reader ID to update: "), InputUtils.getString("Enter new reader name: "), InputUtils.getString("Enter new reader phone number: "), InputUtils.getString("Enter new reader address: "));
        readerService.updateReader(reader);
    }

    private void viewReader() {
        Reader reader = readerService.getReader(InputUtils.getInt("Enter reader ID to view: "));
        if (reader != null) System.out.println(reader);
    }

    private void viewAllReaders() { readerService.getAllReaders().forEach(System.out::println); }

    private void searchReadersByName() {
        List<Reader> readers = readerService.searchReadersByName(InputUtils.getString("Enter reader name to search: "));
        if (readers.isEmpty()) System.out.println("No readers found with the given name.");
        else readers.forEach(System.out::println);
    }

    private void searchReadersByPhoneNumber() {
        List<Reader> readers = readerService.searchReadersByPhonenumber(InputUtils.getString("Enter reader phone number to search: "));
        if (readers.isEmpty()) System.out.println("No readers found with the given phone number.");
        else readers.forEach(System.out::println);
    }

    private void manageBorrowReturn() {
        System.out.println("1. Borrow Book");
        System.out.println("2. Return Book");
        int choice = InputUtils.getInt("Choose an option: ");

        switch (choice) {
            case 1: borrowBook(); break;
            case 2: returnBook(); break;
            default: System.out.println("Invalid choice. Please try again.");
        }
    }

    private void borrowBook() {
        int readerId = InputUtils.getInt("Enter reader ID: ");
        int bookId = InputUtils.getInt("Enter book ID: ");
        Date borrowDate = new Date(); // Current date
        Date dueDate = new Date(borrowDate.getTime() + (7 * 24 * 60 * 60 * 1000)); // 7 days later
        Reader reader = readerService.getReader(readerId);
        Book book = bookService.getBook(bookId);
        if (reader != null && book != null) {
            String returnDate;
            ticketbookService.createBorrowRecord(reader, book, borrowDate, returnDate);
        }
    }

    private void returnBook() {
        int readerId = InputUtils.getInt("Enter reader ID: ");
        int bookId = InputUtils.getInt("Enter book ID: ");
        Reader reader = readerService.getReader(readerId);
        Book book = bookService.getBook(bookId);
        if (reader != null && book != null) {
            ticketbookService.returnBook(reader, book);
        }
    }
}

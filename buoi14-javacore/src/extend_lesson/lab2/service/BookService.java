package extend_lesson.lab2.service;

import extend_lesson.lab2.entities.Book;
import java.util.ArrayList;
import java.util.List;

public class BookService {
    private List<Book> books = new ArrayList<>();

    // Method to add a new book
    public void addBook(Book book) {
        books.add(book);
    }

    // Method to delete a book by ID
    public void deleteBook(int id) {
        books.removeIf(book -> book.getId() == id);
    }

    // Method to update book information
    public void updateBook(Book updatedBook) {
        for (Book book : books) {
            if (book.getId() == updatedBook.getId()) {
                book.setName(updatedBook.getName());
                book.setTopic(updatedBook.getTopic());
                book.setAuthor(updatedBook.getAuthor());
                book.setQuality(updatedBook.getQuality());
                break;
            }
        }
    }

    // Method to get a book by ID
    public Book getBookById(int id) {
        for (Book book : books) {
            if (book.getId() == id) {
                return book;
            }
        }
        return null;
    }

    // Method to get all books
    public List<Book> getAllBooks() {
        return books;
    }
}

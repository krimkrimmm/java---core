package extend_lesson.exception.libraries.service;

import extend_lesson.exception.libraries.entities.Book;

import java.util.ArrayList;
import java.util.List;

public class LibrarianService {
    private List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Đã thêm sách: " + book.getTitle());
    }

    public void updateBook(String isbn, int quantity) {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                book.setQuantity(quantity);
                System.out.println("Số lượng sách đã cập nhật: " + book.getTitle());
            }
        }
    }
    public void deleteBook(String isbn) {
        books.removeIf(book -> book.getIsbn().equals(isbn));
        System.out.println("Sách đã xóa.");
    }
}


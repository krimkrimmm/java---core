package extend_lesson.exception.libraries.database;
import extend_lesson.exception.libraries.entities.Book;
import java.util.ArrayList;
import java.util.List;
public class Database {
    private static List<Book> bookList = new ArrayList<>();

    public static List<Book> getBooks() {
        return bookList;
    }

    public static void addBook(Book book) {
        bookList.add(book);
    }
    public static void removeBook(Book book) {
        bookList.remove(book);
    }
}


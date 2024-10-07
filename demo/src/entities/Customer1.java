package entities;
import java.util.ArrayList;
import java.util.List;
public class Customer1 {
    private String name;
    private String email;

    private String password;
    private List<Book> borrowedBooks = new ArrayList<>();
    public Customer1(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }
    // Getters and Setters
    public String getEmail()
    {
        return email;
    }
    public String getPassword() {
        return password;
    }
    public String getName() {
        return name;
    }
    public List<Book> getBorrowedBooks()
    {
        return borrowedBooks;
    }

    public void borrowBook(Book book) {
        borrowedBooks.add(book);
    }

    public void returnBook(Book book) {
        borrowedBooks.remove(book);
    }
}


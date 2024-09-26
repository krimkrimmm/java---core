package extend_lesson.managebook.entities;

import java.time.LocalDateTime;

public class Ticketbook {
    private static int autoId;
    private int id;
    private int bookId;
    private int personId;
    private int quantity;
    private LocalDateTime borrowDate;
    private LocalDateTime returnDate;

    public Ticketbook(int bookId, int personId, int quantity) {
        this.id = ++autoId;
        this.bookId = bookId;
        this.personId = personId;
        this.quantity = quantity;
    }

    public static int getAutoId() {
        return autoId;
    }

    public static void setAutoId(int autoId) {
        Ticketbook.autoId = autoId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public LocalDateTime getBorrowDate() {
        return borrowDate;
    }

    public void setBorrowDate(LocalDateTime borrowDate) {
        this.borrowDate = borrowDate;
    }

    public LocalDateTime getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(LocalDateTime returnDate) {
        this.returnDate = returnDate;
    }
}
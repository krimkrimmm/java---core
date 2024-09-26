package extend_lesson.lab2.service;
import extend_lesson.lab2.entities.Book;
import extend_lesson.lab2.entities.Reader;
import extend_lesson.lab2.entities.Ticketbook;
import java.util.ArrayList;
import java.util.List;

public class TicketbookService {
    private List<Ticketbook> Ticketbooks = new ArrayList<>();
    // Method to create a ticket book
    public void createBorrowRecord(Reader reader, Book book, String borrowDate, String returnDate) {
        Ticketbook ticketbook = new Ticketbook();
        record.setReader(reader);
        record.setBook(book);
        record.setBorrowDate(borrowDate);
        ticketbbook.setReturnDate(returnDate);
        ticketbooks.add(ticketbook);
    }

    // Method to return a book
    public void returnBook(Reader reader, Book book) {
        ticketbooks.removeIf(record -> record.getReader().equals(reader) && record.getBook().equals(book));
    }

    // Method to get all borrow records
    public List<BorrowRecord> getAllBorrowRecords() {
        return borrowRecords;
    }
}

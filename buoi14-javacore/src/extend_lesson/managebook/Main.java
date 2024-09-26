//Giúp Hương phân tích và thiết kế một chương trình quản lý sách trong Techmaster.
// Chương trình thực hiện các nhiệm vụ sau:
//▪ Nhiệm vụ 1 - Quản lý sách: Cho phép thêm, xóa, sửa đổi, thông tin về các sách trong Techmaster.
// Một quyển gồm: Id, name, chủ đề, tác giả, số lượng còn trong thư viện.
//▪ Nhiệm vụ 2 - Quản lý người đọc: Cho phép thêm, xóa, sửa đổi, tìm kiếm thông tin về người đọc trong thư viện.
// Người đọc gồm: Id, name, số điện thoại, địa chỉ.

//▪ Nhiệm vụ 3 - Quản lý mượn trả sách: Cho phép tạo phiếu mượn sách, và cho phép người đọc trả sách.
// Thông tin về phiếu mượn sách bao gồm: người mượn, sách được mượn, ngày mượn, ngày hạn phải trả

package extend_lesson.managebook;
import extend_lesson.managebook.data.Database;
import extend_lesson.managebook.entities.Book;
import extend_lesson.managebook.entities.Person;
import extend_lesson.managebook.entities.Ticketbook;
import extend_lesson.managebook.service.BookService;

import extend_lesson.managebook.service.PersonService;
import extend_lesson.managebook.service.TicketbookService;
import extend_lesson.managebook.service.IActionCommon;
import extend_lesson.managebook.service.IActionCommon2;
import extend_lesson.managebook.utils.Utils;

public class Main {
    public static void main(String[] args) {
        BookService bookService = new BookService();

        PersonService personService = new PersonService();
        BorrowService borrowService = new BorrowService();

        // Example usage
        Book book = new Book(1, "Java Programming", "Programming", "Author A", 10);
        bookService.addBook(book);

        Reader reader = new Reader(1, "Hương", "123456789", "Hanoi");
        readerService.addReader(reader);

        BorrowRecord borrowRecord = new BorrowRecord(reader, book, DateUtils.getCurrentDate(), "2024-10-01");
        borrowService.createBorrowRecord(borrowRecord);

        // Print out the details
        System.out.println("Books: " + DataStorage.books);
        System.out.println("Readers: " + DataStorage.readers);
        System.out.println("Borrow Records: " + DataStorage.borrowRecords);
    }
}


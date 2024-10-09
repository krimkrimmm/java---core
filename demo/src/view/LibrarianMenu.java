////2.Librarian (Người quản lý thư viện):
////- Đăng ký tài khoản/Đăng nhập: Người quản lý mới tạo tài khoản bằng cách nhập thông tin như tên, email, mật khẩu sau đó đăng nhập bằng tài khoản đã tạo.
////- Quản lý sách: Thêm mới, chỉnh sửa hoặc xóa sách.
////- Quản lý mượn/trả sách: Xem danh sách mượn sách, cập nhật trạng thái các giao dịch mượn/trả sách.
////- Quản lý người dùng: Xem thông tin người dùng và lịch sử mượn sách.
////- Đăng xuất: Kết thúc phiên làm việc và đăng xuất khỏi hệ thống.

package view;

import entities.Book;
import service.AccountService;
import service.LibrarianService;
import util.InputUtil;

import java.util.List;

public class LibrarianMenu
{
    private final LibrarianService librarianService;
    private final MainMenu mainMenu;
    public LibrarianMenu(LibrarianService librarianService, MainMenu mainMenu) {
        this.librarianService = librarianService;
        this.mainMenu = mainMenu;
    }
    public void menu(){
        while (true){
            System.out.println("------- PHẦN MỀM QUẢN LÝ THƯ VIỆN --------");
            System.out.println("1.Quản lý sách ");
            System.out.println("2.Quản lý mượn sách");
            System.out.println("3.Quản lý trả sách");

            System.out.println("4.Quản lý người dùng");
            System.out.println("5.Đăng xuất");

            int choice = InputUtil.chooseOption("Xin mời chọn chức năng: ",
                    "Chức năng là số dương từ 1 tới 5 vui lòng nhập lại: ", 1, 5);

            switch (choice) {
                case 1:
                    System.out.println("Thong tin sách ");
                    List<Book> books = librarianService.getBooks();
                    System.out.println(books);
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    mainMenu.mainmenu(AccountService.user);
                    return;
            }
        }
    }
}



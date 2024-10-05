////2.Librarian (Người quản lý thư viện):
////- Đăng ký tài khoản/Đăng nhập: Người quản lý mới tạo tài khoản bằng cách nhập thông tin như tên, email, mật khẩu sau đó đăng nhập bằng tài khoản đã tạo.
////- Quản lý sách: Thêm mới, chỉnh sửa hoặc xóa sách.
////- Quản lý mượn/trả sách: Xem danh sách mượn sách, cập nhật trạng thái các giao dịch mượn/trả sách.
////- Quản lý người dùng: Xem thông tin người dùng và lịch sử mượn sách.
////- Đăng xuất: Kết thúc phiên làm việc và đăng xuất khỏi hệ thống.

package view;
import entities.User;
import service.*;
import util.InputUtil;
import java.util.InputMismatchException;
import main.Main;
import java.util.Scanner;
public class LibrarianMenu {
    private final UserService userService;

    public LibrarianMenu(UserService userService) {
        this.userService = userService;
    }
    public void menu(){
        while (true){
            System.out.println("------- PHẦN MỀM QUẢN LÝ THƯ VIỆN --------");
            System.out.println("1.Quản lý sách ");
            System.out.println("2.Quản lý mượn sách");
            System.out.println("3.Quản lý trả sách");

            System.out.println("4.Quản lý người dùng");
            System.out.println("5.Đăng xuất");
        }
    }
}

//1.Customer (khách hang):
//- Đăng ký tài khoản/Đăng nhập(Log in): Người dùng mới tạo tài khoản bằng cách nhập thông tin như tên, email, mật khẩu sau đó đăng nhập bằng tài khoản đã tạo.
//- Xem danh sách sách: Xem danh mục các sách có sẵn, tìm kiếm sách theo từ khóa hoặc bộ lọc (tác giả, thể loại,…).
//- Xem chi tiết sách: Xem thông tin chi tiết của sách: tên sách, tác giả, mã sách, nsx, số lượng sách, giá sách, trạng thái sách: trc va sau khi cho mượn.
//- Thêm sách vào giỏ sách: Lựa chọn số lượng và thêm sách vào giỏ sách để mượn.
//- Xem giỏ sách: Xem danh sách các sách đã thêm vào giỏ sách, thay đổi số lượng hoặc xóa sách khỏi giỏ sách.
//- Mượn sách: Xác nhận mượn sách và nhập thông tin giao nhận.
//- Xem lịch sử mượn sách: Xem danh sách các sách đã mượn, bao gồm thông tin chi tiết về từng sách và trạng thái mượn
//- Mua sách: Xác nhận mua sách và nhập thông tin giao nhận.
//- Xem lịch sử mua sách: Xem danh sách các sách đã mua, bao gồm thông tin chi tiết về từng sách và trạng thái mua
//- Cập nhật tài khoản cá nhân: Thay đổi thông tin cá nhân như tên, địa chỉ email, mật khẩu.
//- Đăng xuất: Kết thúc phiên làm việc và đăng xuất khỏi hệ thống.

package view;
import entities.*;
import service.*;
import service.CustomerService;
import util.InputUtil;

public class CustomerMenu {
    private final CustomerService customerService;
    private final MainMenu mainMenu;  // Thay đổi để không khởi tạo MainMenu
    public CustomerMenu(CustomerService customerService, MainMenu mainMenu)
    {
        this.customerService = customerService;
        this.mainMenu = mainMenu;  // Nhận MainMenu từ tham số
    }
    public void menu(){
        while (true){
            System.out.println("------- PHẦN MỀM QUẢN LÝ THƯ VIỆN --------");
            System.out.println("1. Xem danh sách sách");
            System.out.println("2. Xem chi tiết sách");
            System.out.println("3. Thêm sách vào giỏ sách");
            System.out.println("4. Xem giỏ sách");
            System.out.println("5. Mượn sách");
            System.out.println("6. Xem lịch sử mượn sách");

            System.out.println("7. Mua sách");
            System.out.println("8. Xem lịch sử mua sách");
            System.out.println("9. Cập nhật tài khoản cá nhân");
            System.out.println("10. Đăng xuất");
            int choice = InputUtil.chooseOption("Xin mời chọn chức năng: ",
                    "Chức năng là số dương từ 1 tới 10 vui lòng nhập lại: ", 1, 10);
            switch (choice){
                case 1:
                    // Thực hiện hành động cho lựa chọn 1

                    break;
                case 2:
                    // Thực hiện hành động cho lựa chọn 2
                    break;
                case 3:
                    // Thực hiện hành động cho lựa chọn 3
                    break;
                case 4:
                    // Thực hiện hành động cho lựa chọn 4
                    break;
                case 5:
                    // Thực hiện hành động cho lựa chọn 5
                    break;
                case 6:
                    // Thực hiện hành động cho lựa chọn 6
                    break;
                case 7:
                    // Thực hiện hành động cho lựa chọn 7
                    break;
                case 8:
                    // Thực hiện hành động cho lựa chọn 8
                    break;
                case 9:
                    // Thực hiện hành động cho lựa chọn 9
                    break;

                case 10:
                    mainMenu.mainmenu(AccountService.user);
                    return;
            }
        }
    }
}


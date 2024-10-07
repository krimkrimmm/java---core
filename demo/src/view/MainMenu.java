package view;
import entities.Customer1;
import enums.Role;
import entities.Customer;
import main.Main;
import service.AccountService;
import service.AdminService;
import service.CustomerService;
import service.LibrarianService;
import util.InputUtil;

public class MainMenu {
    private final CustomerService customerService = new CustomerService();
    private final AccountService accountService = new AccountService();
    private final AdminService adminService = new AdminService();
    private final LibrarianService librarianService = new LibrarianService();
    private final AdminMenu adminMenu = new AdminMenu(adminService);
    private final CustomerMenu customerMenu = new CustomerMenu(customerService);
    private final LibrarianMenu librarianMenu = new LibrarianMenu(librarianService);

    public void menu() {

        while (true) {
            System.out.println("==================================================================");
            System.out.println("------- PHẦN MỀM QUẢN LÝ THƯ VỆN--------");
            System.out.println("1. Đăng nhập");
            System.out.println("2. Đăng ký");
            System.out.println("3. Thoát");
            int choice = InputUtil.chooseOption("Xin mời chọn chức năng",
                    "Chức năng là số dương từ 1 tới 3, vui lòng nhập lại: ", 1, 3);
            switch (choice) {
                case 1:
                    System.out.println("1. Đăng nhập voi admin");
                    System.out.println("2. Đăng nhập voi customer");
                    System.out.println("3. Đăng nhập voi librarian");
                    switch (choice) {
                        case 1:
                            Customer loggedInCustomer = accountService.login();
                            if (loggedInCustomer == null) {
                                System.out.println("Đăng nhập thất bại!!!");
                                break;
                            }
                            Main.LOGGED_IN_CUSTOMER = loggedInCustomer;
+                            if (loggedInCustomer.getRole().equals(Role.CUSTOMER)) {
                                customerMenu.menu();
                                break;
                            } else if (loggedInCustomer.getRole().equals(Role.ADMIN)) {
                                adminMenu.menu();
                                break;
                            } else {
                                librarianMenu.menu();
                                break;
                            }

                    }
                case 2:
                    Customer registeredUser = accountService.register();
                    if (registeredUser == null) {
                        System.out.println("Dừng đăng ký tài khoản!!!");
                        break;
                    }
                    System.out.println("Đăng ký tài khoản thành công, vui lòng đăng nhập để tiếp tục sử dụng phần mềm.");
                    break;
                case 3:
                    return;
            }
        }
    }
    public void initializeData() {
        accountService.setUsers();
        accountService.createDefaultAdminUser();
        accountService.findCurrentAutoId();
    }
}

package extend_lesson.exception.libraries.view;
import extend_lesson.exception.libraries.service.CustomerService;
import extend_lesson.exception.libraries.service.LibrarianService;
import extend_lesson.exception.libraries.service.AdminService;
import extend_lesson.exception.libraries.entities.Customer;
import extend_lesson.exception.libraries.entities.Librarian;

import java.util.Scanner;

public class Menu {
    private CustomerService customerService = new CustomerService();
    private LibrarianService librarianService = new LibrarianService();
    private AdminService adminService = new AdminService();

    public void displayMainMenu() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Đăng ký với tư cách là Khách hàng");
            System.out.println("2. Đăng nhập với tư cách là Khách hàng");
            System.out.println("3. Thoát");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Nhập tên: ");
                    String name = scanner.nextLine();
                    System.out.print("Nhập email: ");
                    String email = scanner.nextLine();
                    System.out.print("Nhập mật khẩu: ");
                    String password = scanner.nextLine();
                    customerService.register(new Customer(name, email, password));
                    break;
                case 2:
                    System.out.print("Nhập email: ");
                    String loginEmail = scanner.nextLine();

                    System.out.print("Nhập mật khẩu: ");
                    String loginPassword = scanner.nextLine();
                    System.out.println("Đăng nhập thành công");
                    Customer loggedInCustomer = customerService.login(loginEmail, loginPassword);
                    if (loggedInCustomer != null) {
                        // Proceed to customer functionalities
                    }
                    break;
                case 3:
                    System.out.println("Thoát...");
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Hãy thử lại.");
            }
        }
    }
}

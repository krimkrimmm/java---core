package extend_lesson.exception.login.view;

import extend_lesson.exception.login.entities.User;
import extend_lesson.exception.login.service.UserService;

import java.util.Scanner;

public class Menu {
    // Khởi tạo bằng singleton pattern
    UserService userService = UserService.getInstance();

    public void displayMenuPreLogin(Scanner scanner){
        do {
            System.out.println("1- Login");
            System.out.println("2- Register");
            System.out.println("Please choose: ");
            selectMenuPreLogin(scanner);
        } while (true);
    }

    public void displayMenuPostLogin(Scanner scanner){
        do {
            System.out.println("""
                    1 - Thay đổi username
                    2 - Thay đổi email
                    3 - Thay đổi mật khẩu
                    4 - Đăng xuất (Sau khi đăng xuất quay về mục yêu cầu đăng nhập hoặc đăng ký)
                    0 - Thoát chương trình""");
            System.out.println("Please choose: ");
            selectMenuPreLogin(scanner);
        } while (true);
    }

    private void selectMenuPreLogin(Scanner scanner){
        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice){
            case 1:
                // Đăng nhập
                User userLogin = userService.login(scanner);
                if(userLogin!= null){
                    System.out.println("Đăng nhập thành công - Xin chào: "+userLogin.getUsername());
                    // Hiển thị các tính năng sau khi login thành công
                    displayMenuPostLogin(scanner);
                } else {
                    System.out.println("Username hoặc password không đúng! ");
                    System.out.println("""
                            1 - Đăng nhập lại
                            2 - Quên mật khẩu
                            0 - Thoát""");
                }
                break;
            case 2:
                // Đăng ký
                boolean isRegisterSuccess = userService.register(scanner);
                if (isRegisterSuccess){
                    displayMenuPreLogin(scanner);
                }
                break;

        }
    }

    private void selectMenuPostLogin(Scanner scanner){
        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice){
            case 1:
                //Thay đổi username
                break;
            case 2:
                //Thay đổi email
                break;
            case 3:
                //Thay đổi mật khẩu
                break;
            case 4:
                //Đăng xuất (Sau khi đăng xuất quay về mục yêu cầu đăng nhập hoặc đăng ký)
                break;
            case 0:
                //Thoát chương trình
                System.exit(0);
        }
    }
}
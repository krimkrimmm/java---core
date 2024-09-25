package extend_lesson.mid.view;

import extend_lesson.mid.entities.User;
import extend_lesson.mid.service.UserService;

import java.util.Scanner;

public class Menu {
    UserService userService = new UserService();

    public void displayPreLogin(Scanner scanner){
        System.out.println("1.Đăng nhập");
        System.out.println("2.đăng kí");

        System.out.println("Mời b lựa chọn: ");
        selectPreLogin(scanner);

    }

    private void selectPreLogin(Scanner scanner){
        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice){
            case 1:
                System.out.println("Thực hiện login");
                User user = userService.login(scanner);
                if(user != null){
                    System.out.println("Chào mừng "+user.getUsername()+" , bạn có thể thực hiện các công việc sau:”\\n");
                    displayMenuPostLogin(scanner, user);
                } else {
                    System.out.println("Username or password is incorrect");
                }

                break;
            case 2:
                System.out.println("Thực hiện đăng ký");
                userService.register(scanner);
                displayPreLogin(scanner);
                break;
        }
    }

    private void displayMenuPostLogin(Scanner scanner, User user){
        System.out.println("" +
                "1 - Thay đổi username\n" +
                "\n" +
                "2 - Thay đổi email\n" +
                "\n" +
                "3 - Thay đổi mật khẩu\n" +
                "\n" +
                "4 - Đăng xuất (Sau khi đăng xuất quay về mục yêu cầu đăng nhập hoặc đăng ký)\n" +
                "\n" +
                "0 - Thoát chương trình");
        selectPostLogin(scanner, user);
    }

    private void selectPostLogin(Scanner scanner, User user){
        System.out.println("Mời b lựa chọn: ");
        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice){
            case 1:
                userService.changeUsername(scanner, user);
                break;
            case 2:
                break;
        }
    }


}
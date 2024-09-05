package extend_lesson.bai.services;
import extend_lesson.bai.entities.User;

import java.util.Scanner;
public class ChangePassword {

    private Scanner scanner;

    public ChangePassword(Scanner scanner) {
        this.scanner = scanner;
    }

    public void execute(User user) {
        System.out.print("New Password: ");
        String newPassword = scanner.nextLine();
        user.setPassword(newPassword);
        System.out.println("Đổi mật khẩu thành công.");
    }
}



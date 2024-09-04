package extend_lesson.bai.services;
import java.util.Scanner;
public class ForgotPassword {
    private UserService userService;
    private Scanner scanner;


    public ForgotPassword(UserService userService, Scanner scanner) {
        this.userService = userService;
        this.scanner = scanner;
    }
    public void execute(){
        System.out.println("nhập email:");
        String email = scanner.nextLine();
        System.out.println("nh p");
    }
}



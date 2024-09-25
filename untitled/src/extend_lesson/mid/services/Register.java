package extend_lesson.mid.services;
import extend_lesson.mid.entities.User;
import java.util.Scanner;
import java.util.List;
import java.util.regex.Pattern;
public class Register {
    private List<User> users;
    private Scanner scanner;

    public Register(List<User> users, Scanner scanner) {
        this.users = users;
        this.scanner = scanner;
    }

    public void execute() {
        System.out.print("Username: ");
        String username = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();
        System.out.print("Password: ");
        String password = scanner.nextLine();

        if (isUsernameTaken(username)) {
            System.out.println("Username đã tồn tại.");
            return;
        }

        if (!isValidEmail(email)) {
            System.out.println("Email không hợp lệ.");
            return;
        }

        if (isEmailTaken(email)) {
            System.out.println("Email đã tồn tại.");
            return;
        }

        if (!isValidPassword(password)) {
            System.out.println("Password không hợp lệ.");
            return;
        }

        users.add(new User(username, email, password));
        System.out.println("Đăng ký thành công.");
    }

    private boolean isUsernameTaken(String username) {
        for (User user : users) {
            if (user.getUsername().equals(username)) {
                return true;
            }
        }
        return false;
    }

    private boolean isEmailTaken(String email) {
        for (User user : users) {
            if (user.getEmail().equals(email)) {
                return true;
            }
        }
        return false;
    }

    private boolean isValidEmail(String email) {
        String emailRegex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$";
        return Pattern.matches(emailRegex, email);
    }

    private boolean isValidPassword(String password) {
        if (password.length() < 7 || password.length() > 15) {
            return false;
        }
        boolean hasUppercase = !password.equals(password.toLowerCase());
        boolean hasSpecial = password.matches("[A-Za-z0-9 ]*");
        return hasUppercase && !hasSpecial;
    }
}






package extend_lesson.exception.login;
import extend_lesson.exception.login.view.Menu;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Menu menu = new Menu();
        Scanner scanner = new Scanner(System.in);
        menu.displayMenuPreLogin(scanner);
    }
}








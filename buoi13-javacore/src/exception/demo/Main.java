package exception.demo;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        do {

            System.out.println("bạn nhâp vao môt so nguyen:");

            try {
                int n = Integer.parseInt(scanner.nextLine());
                System.out.println(n);
                break;
            } catch (Exception e) {
                System.out.println("có lỗi xảy ra vui long thu lai:");

            }
            finally {
                System.out.println("đã nhảy cả vao finally:");
            }
        }while (true) ;
    }
}






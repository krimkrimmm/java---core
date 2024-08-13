//Bài 1: Giải và biện luận phương trình bậc nhất ax + b = 0, với a và b nhập vào từ bàn phím, a khác 0.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập giá trị a và b từ bàn phím
        System.out.print("Nhập giá trị a (a ≠ 0): ");
        double a = scanner.nextDouble();
        System.out.print("Nhập giá trị b: ");
        double b = scanner.nextDouble();

        // Kiểm tra điều kiện a ≠ 0
        if (a == 0) {
            System.out.println("Giá trị của a phải khác 0.");
        } else {
            // Giải phương trình ax + b = 0
            double x = -b / a;
            System.out.println("Nghiệm của phương trình là: x = " + x);
        }
    }
}



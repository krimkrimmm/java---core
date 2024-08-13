//Bài 2: Giải và biện luận phương trình bậc hai ax2 + bx + c = 0, với a, b và c nhập vào từ bàn phím, a khác 0.
import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập các hệ số a, b, c từ bàn phím
        System.out.print("Nhập a (a ≠ 0): ");
        double a = scanner.nextDouble();
        System.out.print("Nhập b: ");
        double b = scanner.nextDouble();
        System.out.print("Nhập c: ");
        double c = scanner.nextDouble();

        // Tính delta
        double delta = b * b - 4 * a * c;

        // Biện luận phương trình
        if (delta < 0) {
            System.out.println("Phương trình vô nghiệm.");
        } else if (delta == 0) {
            double x = -b / (2 * a);
            System.out.println("Phương trình có nghiệm kép: x = " + x);
        } else {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Phương trình có hai nghiệm phân biệt: x1 = " + x1 + ", x2 = " + x2);
        }

        scanner.close();
    }
}


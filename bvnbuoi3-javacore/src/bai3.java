//Bài 3: Nhập vào chiều dài và chiều rộng của hình chữ nhật, tính chu vi và diện tích của hình chữ nhật đó.
import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập chiều dài và chiều rộng từ bàn phím
        System.out.print("Nhập chiều dài: ");
        double length = scanner.nextDouble();
        System.out.print("Nhập chiều rộng: ");
        double width = scanner.nextDouble();

        // Tính chu vi
        double perimeter = 2 * (length + width);
        // Tính diện tích
        double area = length * width;

        // Hiển thị kết quả
        System.out.println("Chu vi của hình chữ nhật là: " + perimeter);
        System.out.println("Diện tích của hình chữ nhật là: " + area);

        scanner.close();
    }
}



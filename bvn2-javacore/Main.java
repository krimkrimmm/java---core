//Viết chương trình tạo hai biến kiểu int number và randomNumber với:
//number được nhập vào từ bàn phím
//randomNumber được sinh ngẫu nhiên từ 1 đến 100
//So sánh hai số với nhau sử dụng toán tử 3 ngôi
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Nhập số từ bàn phím
        System.out.print("Nhập một số: ");
        int number = scanner.nextInt();

        // Sinh số ngẫu nhiên từ 1 đến 100
        int randomNumber = random.nextInt(100) + 1;

        // So sánh hai số sử dụng toán tử 3 ngôi
        String result = (number > randomNumber) ? "number lớn hơn randomNumber" :
                (number < randomNumber) ? "number nhỏ hơn randomNumber" :
                        "number bằng randomNumber";

        // In kết quả
        System.out.println("Số ngẫu nhiên là: " + randomNumber);
        System.out.println("Kết quả so sánh: " + result);
    }
}

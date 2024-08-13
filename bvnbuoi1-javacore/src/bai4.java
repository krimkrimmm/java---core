//Bài 4: Khai căn một số dương bất kì, kết quả làm tròn tới 3 chữ số thập phân.
import java.util.Scanner;
public class bai4 {

    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a positive number
        System.out.print("Nhập một số dương: ");
        double number = scanner.nextDouble();

        // Check if the number is positive
        if (number < 0) {
            System.out.println("Số không hợp lệ. Vui lòng nhập một số dương.");
        } else {
            // Calculate the square root of the number
            double squareRoot = Math.sqrt(number);

            // Round the result to 3 decimal places
            double roundedSquareRoot = Math.round(squareRoot * 1000.0) / 1000.0;

            // Display the rounded square root
            System.out.printf("Căn bậc hai của số là: %.3f\n", roundedSquareRoot);
        }

        // Close the scanner
        scanner.close();
    }
}

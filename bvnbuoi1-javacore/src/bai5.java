//Bài 5: Tìm thương của 2 số nguyên, làm tròn kết quả tới 3 chữ số thập phân.
import java.util.Scanner;

public class bai5 {

    public static void main(String[] args) {

        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter two integers
        System.out.print("Nhập số nguyên thứ nhất: ");
        int num1 = scanner.nextInt();

        System.out.print("Nhập số nguyên thứ hai: ");
        int num2 = scanner.nextInt();

        // Check if the second number is zero to avoid division by zero
        if (num2 == 0) {
            System.out.println("Không thể chia cho 0.");
        } else {
            // Calculate the quotient of the two numbers
            double quotient = (double) num1 / num2;

            // Round the result to 3 decimal places
            double roundedQuotient = Math.round(quotient * 1000.0) / 1000.0;

            // Display the rounded quotient
            System.out.printf("Thương của hai số là: %.3f\n", roundedQuotient);
        }

        // Close the scanner
        scanner.close();
    }
}





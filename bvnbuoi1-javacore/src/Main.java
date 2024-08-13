//bai1:
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the length of the rectangle
        System.out.print("Nhập chiều dài của hình chữ nhật: ");
        double length = scanner.nextDouble();

        // Prompt the user to enter the width of the rectangle
        System.out.print("Nhập chiều rộng của hình chữ nhật: ");
        double width = scanner.nextDouble();

        // Calculate the perimeter and area of the rectangle
        double perimeter = 2 * (length + width);
        double area = length * width;

        // Display the results
        System.out.println("Chu vi của hình chữ nhật: " + perimeter);
        System.out.println("Diện tích của hình chữ nhật: " + area);

        // Close the scanner
        scanner.close();
    }
}
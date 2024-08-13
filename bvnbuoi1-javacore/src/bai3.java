//Bài 3: Tìm số lớn nhất trong 4 số biết trước.

import java.util.Scanner;

public class bai3 {

    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter four numbers
        System.out.print("Nhập số thứ nhất: ");
        double num1 = scanner.nextDouble();

        System.out.print("Nhập số thứ hai: ");
        double num2 = scanner.nextDouble();

        System.out.print("Nhập số thứ ba: ");
        double num3 = scanner.nextDouble();

        System.out.print("Nhập số thứ tư: ");
        double num4 = scanner.nextDouble();

        // Find the maximum number among the four
        double max = Math.max(Math.max(num1, num2), Math.max(num3, num4));

        // Display the largest number
        System.out.println("Số lớn nhất trong 4 số là: " + max);

        // Close the scanner
        scanner.close();
    }
}


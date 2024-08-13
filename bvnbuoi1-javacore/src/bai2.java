//Bài 2: Tính chu vi và diện tích hình tròn khi biết bán kính của nó.

import java.util.Scanner;

public class bai2 {

    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the radius of the circle
        System.out.print("Nhập bán kính của hình tròn: ");
        double radius = scanner.nextDouble();

        // Calculate the circumference and area of the circle
        double circumference = 2 * Math.PI * radius;
        double area = Math.PI * radius * radius;

        // Display the results
        System.out.println("Chu vi của hình tròn: " + circumference);
        System.out.println("Diện tích của hình tròn: " + area);

        // Close the scanner
        scanner.close();
    }
}


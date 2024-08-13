//bai9:Please input information of a student: name (String), address(String), age (int)
//Display information of the student
//Display “Do you want to continues?(Y/N)”
//	 If “y” -> continue to input again
//	 If ‘n” -> stop the program
//Guide: use do while condition

import java.util.Scanner;

public class bai9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String continueInput;

        do {
            // Input student information
            System.out.print("Please input the name of the student: ");
            String name = scanner.nextLine();

            System.out.print("Please input the address of the student: ");
            String address = scanner.nextLine();

            System.out.print("Please input the age of the student: ");
            int age = scanner.nextInt();
            scanner.nextLine();  // Consume newline left-over

            // Display student information
            System.out.println("\nStudent Information:");
            System.out.println("Name: " + name);
            System.out.println("Address: " + address);
            System.out.println("Age: " + age);

            // Ask if the user wants to continue
            System.out.print("\nDo you want to continue? (Y/N): ");
            continueInput = scanner.nextLine();

        } while (continueInput.equalsIgnoreCase("Y"));

        System.out.println("Program terminated.");

        scanner.close();
    }
}

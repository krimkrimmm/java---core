package extend_lesson.exception.libraries.utils;

import java.util.Scanner;
public class Utils {
    public static int inputInteger(Scanner scanner){
        do
        {
            try {
                int n = Integer.parseInt(scanner.nextLine());
                return n;
            } catch (Exception e){
                System.out.println("Bạn nhập không hợp lệ vui lòng nhập vào số nguyên");
            }
        } while (true);
    }


    public static double inputDouble(Scanner scanner){
        do {
            try {
                double n = Integer.parseInt(scanner.nextLine());
                return n;
            } catch (Exception e){
                System.out.println("Bạn nhập không hợp lệ vui lòng nhập vào số thực");
            }
        } while (true);
    }
}


package extend_lesson.managebook.utils;

import java.util.Scanner;

public class Utils {
    public static int inputInteger(Scanner scanner){
        do {
            try {
                int n = Integer.parseInt(scanner.nextLine());
                return n;
            } catch (Exception e){
                System.out.println("Bạn nhập không hợp lệ vui lòng nhập vào số nguyên");
            }
        } while (true);
    }
}
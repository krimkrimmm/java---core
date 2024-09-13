//Loại bỏ chuỗi S1 từ chuỗi S2 với S1,S2 nhập vào từ bàn phím.
import java.util.Scanner;

public class RemoveSubstring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập chuỗi S1 và S2
        System.out.print("Nhập chuỗi S1: ");
        String S1 = scanner.nextLine();
        System.out.print("Nhập chuỗi S2: ");
        String S2 = scanner.nextLine();

        // Loại bỏ S1 khỏi S2
        String result = S2.replace(S1, "");


        // Xuất kết quả
        System.out.println("Chuỗi kết quả: " + result);
    }
}
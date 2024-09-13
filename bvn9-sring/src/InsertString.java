//Chèn chuỗi S1 vào chuỗi S2 ở vị trí k biết trước với S1, S2 và k nhập vào từ bàn phím.
import java.util.Scanner;

public class InsertString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào chuỗi S1: ");
        String s1 = scanner.nextLine();

        System.out.println("Nhập vào chuỗi S2: ");
        String s2 = scanner.nextLine();

        System.out.println("Nhập vào vị trí k: ");
        int k = scanner.nextInt();


        if (k < 0 || k > s2.length()) {
            System.out.println("Vị trí k không hợp lệ.");
        }
        else {
            String result = s2.substring(0, k) + s1 + s2.substring(k);
            System.out.println("Chuỗi sau khi chèn: " + result);
        }
    }
}



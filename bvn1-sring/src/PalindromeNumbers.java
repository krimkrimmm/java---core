//Sử dụng xâu ký tự để viết hàm kiểm tra số thuận nghịch. Áp dụng liệt kê các số thuận nghịch có 6 chữ số.
import java.util.Scanner;
public class PalindromeNumbers {
    // Hàm kiểm tra số thuận nghịch
    public static boolean isPalindrome(int number) {


        String str = Integer.toString(number);
        int len = str.length();
        for (int i = 0; i < len / 2; i++) {
            if (str.charAt(i) != str.charAt(len - i - 1)) {
                return false;
            }
        }
        return true;
    }

    // Hàm liệt kê các số thuận nghịch có 6 chữ số
    public static void listPalindromes() {
        int count = 0;
        for (int i = 100000; i <= 999999; i++) {
            if (isPalindrome(i)) {//isPalindrome(int number): Kiểm tra xem một số có phải là số thuận nghịch hay không.
                System.out.println(i);
                count++;
            }
        }

        System.out.println("Tổng các số thuận nghịch có 6 chữ số: " + count);
    }

    public static void main(String[] args) {
        listPalindromes();//listPalindromes(): Liệt kê tất cả các số thuận nghịch có 6 chữ số và in ra tổng số lượng.
    }
}






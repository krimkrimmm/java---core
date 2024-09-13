//Nhập hai xâu S1 và S2. Tìm xâu S2 trong S1. Nếu có hãy loại bỏ S2 trong S1.
//Chú ý: phải loại bỏ cho đến khi không tìm được S2 trong S1 nữa.

import java.util.Scanner;
public class RemoveSubstring {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào xâu S1: ");
        String s1 = scanner.nextLine();
        System.out.println("Nhập vào xâu S2: ");
        String s2 = scanner.nextLine();

        String result = removeAllOccurrences(s1, s2);
        System.out.println("Kết quả sau khi loại bỏ S2 trong S1: " + result);
    }

    public static String removeAllOccurrences(String s1, String s2) {
        while (s1.contains(s2)) {
            s1 = s1.replace(s2, "");
        }
        return s1;
    }
}






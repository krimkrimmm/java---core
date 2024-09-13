//Viết chương trình thực hiện nhập một xâu họ tên theo cấu trúc: họ…đệm…tên;
// chuyển xâu đó sang biểu diễn theo cấu trúc tên…họ…đệm.

import java.util.Scanner;
public class NameReformatter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào họ tên (họ…đệm…tên): ");
        String fullName = scanner.nextLine();
        String reformattedName = reformatName(fullName);
        System.out.println("Tên sau khi chuyển đổi: " + reformattedName);
    }
    public static String reformatName(String fullName) {
        String[] parts = fullName.trim().split("\\s+");
        if (parts.length < 2) {

            return fullName; // Trường hợp không đủ họ và tên
        }
        StringBuilder result = new StringBuilder();
        result.append(parts[parts.length - 1]); // Tên
        for (int i = 0; i < parts.length - 1; i++) {
            result.append(" ").append(parts[i]); // Họ và đệm
        }
        return result.toString();
    }
}



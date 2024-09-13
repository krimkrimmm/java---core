//Tìm kiếm vị trí xuất hiện đầu tiên của chuỗi S1 trong S2.
//Nếu không tìm thấy trả về -1.

import java.util.Scanner;
public class FindSubstring {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào chuỗi S1: ");
        String s1 = scanner.nextLine();
        System.out.println("Nhập vào chuỗi S2: ");
        String s2 = scanner.nextLine();

        int position = s2.indexOf(s1);
        System.out.println("Vị trí xuất hiện đầu tiên của S1 trong S2: " + position);
    }
}



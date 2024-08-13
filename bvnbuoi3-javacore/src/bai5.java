//Bài 5:
//a. Nhập vào một chuỗi bất kỳ và một ký tự nào đó. Tìm kiếm vị trí xuất hiện đầu tiên và cuối cùng của ký tự đó trong chuỗi vừa nhập.
//b. Nhập 3 xâu ký tự ký tự s, s1, s2. Tìm tất cả những lần xuất hiện của s1 trong s và thay thế bằng s2.
// Xuất s ra màn hình Ví dụ: s = “TIM KIEM VA THAY THE”, s1 = “TH”, s2 = “123”.
// Kết quả xâu ký tự s sẽ là: “TIM KIEM VA 123AY 123E”


import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập chuỗi và ký tự cần tìm
        System.out.print("Nhập chuỗi: ");
        String inputString = scanner.nextLine();
        System.out.print("Nhập ký tự cần tìm: ");
        char targetChar = scanner.next().charAt(0);

        // Tìm vị trí xuất hiện đầu tiên và cuối cùng của ký tự
        int firstIndex = inputString.indexOf(targetChar);
        int lastIndex = inputString.lastIndexOf(targetChar);

        if (firstIndex != -1) {
            System.out.println("Vị trí xuất hiện đầu tiên của ký tự '" + targetChar + "': " + firstIndex);
            System.out.println("Vị trí xuất hiện cuối cùng của ký tự '" + targetChar + "': " + lastIndex);
        } else {
            System.out.println("Không tìm thấy ký tự '" + targetChar + "' trong chuỗi.");
        }

        // Nhập 3 xâu ký tự s, s1, s2
        scanner.nextLine(); // Đọc bỏ dòng trống
        System.out.print("Nhập xâu ký tự s: ");
        String s = scanner.nextLine();
        System.out.print("Nhập xâu ký tự s1: ");
        String s1 = scanner.nextLine();
        System.out.print("Nhập xâu ký tự s2: ");
        String s2 = scanner.nextLine();

        // Thay thế s1 bằng s2 trong s
        String replacedString = s.replace(s1, s2);
        System.out.println("Kết quả sau khi thay thế: " + replacedString);
    }
}






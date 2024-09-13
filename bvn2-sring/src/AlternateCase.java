//Viết chương trình nhập vào một xâu ký tự s bất kỳ,
// sau đó chuyển sang dạng xen kẽ chữ in hoa và chữ in thường.
// Ví dụ s = ABCDefgh thì kết quả là AbCdEfGh

import java.util.Scanner;
public class AlternateCase {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào một xâu ký tự: ");
        String input = scanner.nextLine();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (i % 2 == 0) {
                result.append(Character.toUpperCase(c));
            }
            else {
                result.append(Character.toLowerCase(c));
            }
        }

        System.out.println("Kết quả: " + result.toString());
    }
}





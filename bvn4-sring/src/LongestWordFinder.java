//Viết chương trình thực hiện nhập một xâu ký tự và tìm từ dài nhất trong xâu đó.
// Từ đó xuất hiện ởa vị trí nào?
//(Chú ý. nếu có nhiều từ có độ dài giống nhau thì chọn từ đầu tiên tìm thấy).

import java.util.Scanner;
public class LongestWordFinder {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào một xâu ký tự: ");
        String input = scanner.nextLine();
        String[] words = input.split("\\s+");
        //
        //
        String longestWord = "";
        int maxLength = 0;
        int position = -1;

        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > maxLength) {
                longestWord = words[i];
                maxLength = words[i].length();
                position = i;
            }
        }
        System.out.println("Từ dài nhất: " + longestWord);
        System.out.println("Vị trí xuất hiện: " + position);
    }
}


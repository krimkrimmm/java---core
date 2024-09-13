//Nhập một câu không quá 20 từ, mỗi từ không quá 10 ký tự.
//Viết chương trình tách các từ trong câu và in các từ theo thứ tự Alphabet.

import java.util.Arrays;
import java.util.Scanner;
public class AlphabeticalOrder {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào một câu (không quá 20 từ, mỗi từ không quá 10 ký tự): ");
        String input = scanner.nextLine();
        // Tách các từ trong câu
        String[] words = input.split("\\s+");
        // Kiểm tra điều kiện số từ và độ dài từ
        if (words.length > 20) {
            System.out.println("Câu nhập vào có quá nhiều từ.");

            return;
        }
        for (String word : words) {
            if (word.length() > 10) {
                System.out.println("Có từ dài hơn 10 ký tự.");
                return;
            }
        }


        // Sắp xếp các từ theo thứ tự Alphabet
        Arrays.sort(words);

        // In các từ theo thứ tự Alphabet
        System.out.println("Các từ theo thứ tự Alphabet:");
        for (String word : words) {
            System.out.println(word);
        }
    }
}



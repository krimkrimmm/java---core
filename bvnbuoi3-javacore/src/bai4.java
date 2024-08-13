//Bài 4: Nhập vào ngày tháng năm sinh của một người theo định dạng nhất định (nhập chuỗi), tính tuổi của người đó (chỉ quan tâm tới năm, không cần tính chính xác tới ngày và tháng).
import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập ngày tháng năm sinh từ bàn phím
        System.out.print("Nhập ngày tháng năm sinh (dd/MM/yyyy): ");
        String birthDate = scanner.nextLine();

        // Tách năm sinh từ chuỗi nhập vào
        String[] parts = birthDate.split("/");
        int birthYear = Integer.parseInt(parts[2]);

        // Lấy năm hiện tại
        int currentYear = java.time.Year.now().getValue();

        // Tính tuổi
        int age = currentYear - birthYear;

        // Hiển thị kết quả
        System.out.println("Tuổi của bạn là: " + age);

        scanner.close();
    }
}


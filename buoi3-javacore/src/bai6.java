//bai6: Làm demo một chiếc máy tính bỏ túi
//Người dùng sẽ nhập vào 2 số a, b và phép toán họ muốn thực hiện (+=x/%)
//->  Thực hiện tính phép tính trên

import java.util.Scanner;


public class bai6 {

    public static void main(String[] args) {
        // Tạo đối tượng Scanner để đọc dữ liệu từ bàn phím
        Scanner scanner = new Scanner(System.in);

        try {
            // Nhập số a từ người dùng
            System.out.print("Nhập số thứ nhất (a): ");
            double a = scanner.nextDouble();

            // Nhập số b từ người dùng
            System.out.print("Nhập số thứ hai (b): ");
            double b = scanner.nextDouble();

            // Nhập phép toán từ người dùng
            System.out.print("Nhập phép toán (+, -, *, /): ");
            char phepToan = scanner.next().charAt(0);

            // Biến để lưu kết quả
            double ketQua;

            // Thực hiện phép toán dựa trên lựa chọn của người dùng
            switch (phepToan) {
                case '+':
                    ketQua = a + b;
                    System.out.printf("Kết quả của %.2f + %.2f là: %.2f%n", a, b, ketQua);
                    break;
                case '-':
                    ketQua = a - b;
                    System.out.printf("Kết quả của %.2f - %.2f là: %.2f%n", a, b, ketQua);
                    break;
                case '*':
                    ketQua = a * b;
                    System.out.printf("Kết quả của %.2f * %.2f là: %.2f%n", a, b, ketQua);
                    break;
                case '/':
                    // Kiểm tra chia cho 0
                    if (b != 0) {
                        ketQua = a / b;
                        System.out.printf("Kết quả của %.2f / %.2f là: %.2f%n", a, b, ketQua);
                    } else {
                        System.out.println("Lỗi: Không thể chia cho 0.");
                    }
                    break;
                default:
                    System.out.println("Phép toán không hợp lệ. Vui lòng nhập +, -, * hoặc /.");
                    break;
            }
        } catch (Exception e) {
            System.out.println("Đã xảy ra lỗi, vui lòng kiểm tra lại dữ liệu nhập.");
        } finally {
            // Đóng scanner để giải phóng tài nguyên
            scanner.close();
        }
    }
}




//bai7:Dùng for tính tổng tất cả các số nguyên từ phần tử thứ 0 -> n
//Tính tích từ phần tử thứ 0 -> n
//Viết chương trình cho phép nhập vào một số nguyên dương n, tính tổng tất cả số chẵn trong khoảng từ 0 - n.
//Sử dụng cả 3 cách
import java.util.Scanner;
public class bai7 {

    public static void main(String[] args) {
        // Tạo đối tượng Scanner để đọc dữ liệu từ bàn phím
        Scanner scanner = new Scanner(System.in);

        try {
            // Nhập số nguyên dương n từ người dùng
            System.out.print("Nhập một số nguyên dương n: ");
            int n = scanner.nextInt();

            // Kiểm tra nếu n là số nguyên dương
            if (n < 0) {
                System.out.println("Số nhập vào phải là số nguyên dương. Vui lòng thử lại.");
                return;
            }

            // Tính tổng tất cả các số nguyên từ 0 đến n
            int tong = 0;
            for (int i = 0; i <= n; i++) {
                tong += i;
            }
            System.out.println("Tổng tất cả các số nguyên từ 0 đến " + n + " là: " + tong);

            // Tính tích của tất cả các số nguyên từ 0 đến n
            // Lưu ý: tích của các số từ 0 đến n luôn là 0 nếu n >= 0 vì có số 0 trong phạm vi
            long tich = 1;
            for (int i = 0; i <= n; i++) {
                tich *= i;
            }
            System.out.println("Tích của tất cả các số nguyên từ 0 đến " + n + " là: " + tich);

            // Tính tổng tất cả các số chẵn trong khoảng từ 0 đến n
            int tongChan = 0;
            for (int i = 0; i <= n; i += 2) {
                tongChan += i;
            }
            System.out.println("Tổng tất cả các số chẵn trong khoảng từ 0 đến " + n + " là: " + tongChan);

        } catch (Exception e) {
            System.out.println("Đã xảy ra lỗi, vui lòng nhập một số hợp lệ.");
        } finally {
            // Đóng scanner để giải phóng tài nguyên
            scanner.close();
        }
    }
}







import java.util.Scanner;

//bai3:
//viet ctrinh nhập vao số điện sdung của tháng va tính tien điện theo phương pháp lũy tiến
//nếu số điện sdung tu 0 đến 50 -> gtri mỗi số điện la 1000
//nếu số điện sdung trn 50 -> giá mỗi số điện vượt hạn mức 1200
//
import java.util.Scanner;

public class bai3 {
    // Hàm tính tiền điện
    public static double tinhTienDien(double soDien) {
        // Định nghĩa mức giá
        double giaDienCoBan = 1000;
        double giaDienVuotQua = 1200;
        double tien;

        // Tính tiền theo phương pháp lũy tiến
        if (soDien <= 50) {
            tien = soDien * giaDienCoBan;
        } else {
            // Tính tiền cho 50 số điện đầu tiên
            tien = 50 * giaDienCoBan;
            // Tính tiền cho số điện vượt hạn mức
            tien += (soDien - 50) * giaDienVuotQua;
        }

        return tien;
    }

    public static void main(String[] args) {
        // Tạo đối tượng Scanner để đọc dữ liệu từ bàn phím
        Scanner scanner = new Scanner(System.in);

        try {
            // Nhập số điện sử dụng từ người dùng
            System.out.print("Nhập số điện sử dụng trong tháng: ");
            double soDien = scanner.nextDouble();

            // Kiểm tra số điện nhập vào phải lớn hơn hoặc bằng 0
            if (soDien < 0) {
                System.out.println("Số điện sử dụng không thể là số âm. Vui lòng nhập lại.");
                return;
            }

            // Tính tiền điện
            double tienDien = tinhTienDien(soDien);

            // Hiển thị kết quả
            System.out.printf("Tiền điện phải trả là: %.2f VND%n", tienDien);

        } catch (Exception e) {
            System.out.println("Vui lòng nhập một số hợp lệ.");
        } finally {
            // Đóng scanner để giải phóng tài nguyên
            scanner.close();
        }
    }
}

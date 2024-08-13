//bai4:
//Viết chương trình nhập vào username và password:
//        Kiểm tra xem username và password khi người dung nhập vào có trùng với username và password trên hệ thống hay không
//        Nếu username hoặc password sai -> in ra thông báo “Tài khoản không 	tồn tại, vui long thử lại”
//        Nếu đúng -> In ra “Đăng nhập thành công”
//        !! Username trên hệ thống: techmaster – password: hoclacoviec

import java.util.Scanner;

public class bai4 {
    // Thông tin đăng nhập trên hệ thống
    private static final String DUNG_USERNAME = "techmaster";
    private static final String DUNG_PASSWORD = "hoclacoviec";

    public static void main(String[] args) {
        // Tạo đối tượng Scanner để đọc dữ liệu từ bàn phím
        Scanner scanner = new Scanner(System.in);

        try {
            // Nhập username từ người dùng
            System.out.print("Nhập username: ");
            String username = scanner.nextLine();

            // Nhập password từ người dùng
            System.out.print("Nhập password: ");
            String password = scanner.nextLine();

            // Kiểm tra thông tin đăng nhập
            if (username.equals(DUNG_USERNAME) && password.equals(DUNG_PASSWORD)) {
                System.out.println("Đăng nhập thành công");
            } else {
                System.out.println("Tài khoản không tồn tại, vui lòng thử lại");
            }

        } catch (Exception e) {
            System.out.println("Đã xảy ra lỗi, vui lòng thử lại.");
        } finally {
            // Đóng scanner để giải phóng tài nguyên
            scanner.close();
        }
    }
}



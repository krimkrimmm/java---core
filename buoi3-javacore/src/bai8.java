//bai8:Cho người dùng nhập vào một số nguyên
//Mỗi khi người dùng nhập xong, hỏi người dùng có muốn tiếp tục nhập hay k (Do you want to continue? (Y/N) )
// 	Nếu người dùng chọn Y -> tiếp tục cho nhập
//	Nếu k thì in ra tổng các số người dung vừa nhập vào
import java.util.Scanner;
public class bai8 {

    public static void main(String[] args) {
        // Tạo đối tượng Scanner để đọc dữ liệu từ bàn phím
        Scanner scanner = new Scanner(System.in);

        int tong = 0; // Biến để lưu tổng các số nhập vào
        boolean tiepTuc = true; // Biến để kiểm soát việc tiếp tục nhập dữ liệu

        try {
            while (tiepTuc) {
                // Nhập số nguyên từ người dùng
                System.out.print("Nhập một số nguyên: ");
                int so = scanner.nextInt();

                // Cộng số vừa nhập vào tổng
                tong += so;

                // Hỏi người dùng có muốn tiếp tục không
                System.out.print("Bạn có muốn tiếp tục nhập không? (Y/N): ");
                char luaChon = scanner.next().charAt(0);

                // Kiểm tra lựa chọn của người dùng
                if (luaChon == 'Y' || luaChon == 'y') {
                    tiepTuc = true;
                } else if (luaChon == 'N' || luaChon == 'n') {
                    tiepTuc = false;
                } else {
                    System.out.println("Lựa chọn không hợp lệ. Kết thúc chương trình.");
                    tiepTuc = false;
                }
            }

            // In ra tổng các số đã nhập
            System.out.println("Tổng các số bạn đã nhập là: " + tong);

        } catch (Exception e) {
            System.out.println("Đã xảy ra lỗi, vui lòng nhập một số hợp lệ.");
        } finally {
            // Đóng scanner để giải phóng tài nguyên
            scanner.close();
        }
    }
}

//Web bán hàng (giày dép, quần áo, thực phẩm, điện tử, sách ...)
//"- Danh sách sản phẩm
//- Tìm kiếm sản phẩm theo 1 vài tiêu chí (tên, thể loại, giá tiền, địa chỉ, ...)
//- Xem chi tiết 1 sản phẩm (Mô tả, giá, các đánh giá liên quan, ...)
//- Giỏ hàng: thêm sản phẩm vào giỏ, bỏ sản phẩm
//- Mua hàng

//- Quản lý lịch sử mua hàng
//- Xếp hạng thành viên dựa trên số đơn hàng đã mua và số tiền đã tiêu trên web"
package extend_lesson.exception.sale;
import extend_lesson.exception.sale.view.Menu;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Menu menu = new Menu();

        do {
            menu.displayMenuForSeller(scanner);
        } while (true);

    }
}







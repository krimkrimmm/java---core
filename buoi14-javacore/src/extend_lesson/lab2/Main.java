//Giúp Hương phân tích và thiết kế một chương trình quản lý sách trong Techmaster.
// Chương trình thực hiện các nhiệm vụ sau:
//▪ Nhiệm vụ 1 - Quản lý sách: Cho phép thêm, xóa, sửa đổi, thông tin về các sách trong Techmaster.
// Một quyển gồm: Id, name, chủ đề, tác giả, số lượng còn trong thư viện.
//▪ Nhiệm vụ 2 - Quản lý người đọc: Cho phép thêm, xóa, sửa đổi, tìm kiếm thông tin về người đọc trong thư viện.
// Người đọc gồm: Id, name, số điện thoại, địa chỉ.

//▪ Nhiệm vụ 3 - Quản lý mượn trả sách: Cho phép tạo phiếu mượn sách, và cho phép người đọc trả sách.
// Thông tin về phiếu mượn sách bao gồm: người mượn, sách được mượn, ngày mượn, ngày hạn phải trả

package extend_lesson.lab2;


import extend_lesson.lab2.view.Menu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.displayMenu(new Scanner(System.in));
    }
}






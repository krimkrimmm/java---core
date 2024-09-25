//Viết chương trình thực hiện:
//Khi mới bắt đầu chương trình, người dùng có các lựa chọn:
//1 - Đăng nhập
//2 - Đăng ký

//Đăng nhập

//Để đăng nhập, cần sử dụng username và password.
//Nếu nhập sai username thì thông báo “Kiểm tra lại username” và cho đăng nhập lại, nhập sai password thì hiện yêu cầu:
//1 - Đăng nhập lại
//2 - Quên mật khẩu
//
//Sau khi đăng nhập thành công, hiển thị “Chào mừng <Tên user>, bạn có thể thực hiện các công việc sau:”
//1 - Thay đổi username
//2 - Thay đổi email
//3 - Thay đổi mật khẩu
//4 - Đăng xuất (Sau khi đăng xuất quay về mục yêu cầu đăng nhập hoặc đăng ký)
//0 - Thoát chương trình
//
//Lưu ý: username và email mới phải chưa tồn tại
//
//Quên mật khẩu
//Tại mục quên mật khẩu thì có nhập email.
//Nếu email đúng thì cho phép đổi mật khẩu và tiến hành đăng nhập. Nếu email sai thì báo chưa tồn tại tài khoản
//Tạo tài khoản mới
//Để tạo tài khoản mới cần nhập username, email, password. Trong đó:
//

//username phải chưa tồn tại
//email phải chuẩn (Sử dụng regex), chưa tồn tại trong List
//password dài từ 7 đến 15 ký tự, chứa ít nhất 1 ký tự in hoa, 1 ký tự đặc biệt (. , - _ ;)


//entities: user(username, email, password)
//service: 1 - Đăng nhập(log in)
////2 - Đăng ký(register)
//Đăng nhập lại(Log back in)
//2 - Quên mật khẩu(Forgot Password)
///1 - Thay đổi username(Change username)
////2 - Thay đổi email()
////3 - Thay đổi mật khẩu()
////4 - Đăng xuất (Sau khi đăng xuất quay về mục yêu cầu đăng nhập hoặc đăng ký)(Log out)
////0 - Thoát chương trình(Exit)

//pvi bai ktra: do while, arraylist, chia tách ham


package extend_lesson.mid;
import extend_lesson.mid.view.Menu;
import extend_lesson.mid.services.LogIn;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();

        Scanner scanner = new Scanner(System.in);
        menu.displayPreLogin(scanner);
    }
}
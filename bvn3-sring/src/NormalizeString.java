//Viết chương trình thực hiện chuẩn hoá một xâu ký tự nhập từ bàn phím (loại bỏ các dấu cách thừa,
// chuyển ký tự đầu mỗi từ thành chữ hoa,
// các ký tự khác thành chữ thường)

import java.util.Scanner;
public class NormalizeString{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập vao một xâu kí tự:");
        String input = scanner.nextLine();
        System.out.println("Chuẩn hóa: " + normalize(input));
        //"Chuẩn hóa: ": Đây là một chuỗi ký tự (string) được in ra trước kết quả chuẩn hóa
        //normalize(input): Đây là lời gọi đến phương thức normalize với tham số input.
        //Phương thức normalize thực hiện các bước chuẩn hóa xâu ký tự như loại bỏ dấu cách thừa, chuyển ký tự đầu mỗi từ thành chữ hoa và các ký tự khác thành chữ thường.
        // Kết quả của phương thức này là một xâu ký tự đã được chuẩn hóa.
        // Toán tử +:nối chuỗi "Chuẩn hóa: " với kết quả trả về từ phương thức normalize(input).
    }
    public static String normalize(String input) {
        input = input.trim().replaceAll("\\s+", " ").toLowerCase();
        //input.trim():
        //Phương thức trim() của lớp String loại bỏ tất cả các khoảng trắng ở đầu và cuối của chuỗi input.
        //Phương thức replaceAll() thay thế tất cả các chuỗi con khớp với biểu thức chính quy (regex) trong chuỗi ban đầu bằng một chuỗi khác.
        //Ở đây, \\s+ là một biểu thức chính quy đại diện cho một hoặc nhiều khoảng trắng
        //Phương thức toLowerCase() chuyển tất cả các ký tự trong chuỗi input thành chữ thường.


        StringBuilder result = new StringBuilder();
        //StringBuilder là một lớp trong Java được sử dụng để tạo và thao tác với các chuỗi ký tự có thể thay đổi.
        //new StringBuilder() tạo một đối tượng StringBuilder mới, ban đầu là một chuỗi rỗng.
        //result là tên biến tham chiếu đến đối tượng StringBuilder này.
        for (String word : input.split(" ")) {
            //Đây là một vòng lặp for-each trong Java.
            //input.split(" ") chia chuỗi input thành một mảng các từ,sử dụng " " làm dấu cách.
            //Vòng lặp này sẽ lặp qua từng từ trong mảng kết quả và gán từ đó cho biến word.
            result.append(Character.toUpperCase(word.charAt(0)))
                    .append(word.substring(1))
                    .append(" ");
            //word.charAt(0) lấy ký tự đầu tiên của từ word.
            //Character.toUpperCase(...) chuyển ký tự này thành chữ hoa.
            //result.append(...) thêm ký tự chữ hoa này vào cuối đối tượng StringBuilder result.
            //.append(word.substring(1)):
            //word.substring(1) lấy phần còn lại của từ word, bắt đầu từ ký tự thứ hai đến hết từ.
            //.append(...) thêm phần này vào cuối đối tượng StringBuilder result.
        }
        return result.toString().trim();
        //
    }
}

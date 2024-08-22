//Tạo lớp hình học với các phương thức tính diện tích và chu vi.
//Tạo lớp hình chữ nhật gồm: length(chiều dài), width(chiều rộng) và lớp hình vuông gồm side(cạnh)
// kế thừa từ lớp hình học
//Thực hiện :
//+ Tính chu vi và diện tích 2 hình trên
//+ Hiển thị thông tin về các cạnh của 2 hình trên.

package extend_lesson.bvn6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //lop hcn
        System.out.println("length:");
        int length = Integer.parseInt(scanner.nextLine());

        System.out.println("width:");
        int width = Integer.parseInt(scanner.nextLine());
        //lop hv
        System.out.println("side:");
        int side = Integer.parseInt(scanner.nextLine());
        //lop hh
        //hcn
        System.out.println("Hình chữ nhật: Chiều dài = " + "Chiều rộng = ");
        String hcn = scanner.nextLine();;
        System.out.println("Diện tích hình chữ nhật: " );
        String dthcn= scanner.nextLine();
        System.out.println("Chu vi hình chữ nhật: " );
        String cvhcn = scanner.nextLine();
       //hv
        System.out.println("Hình vuông: Cạnh = ");
        String hv= scanner.nextLine();
        System.out.println("Diện tích hình vuông: " );
        String dthv = scanner.nextLine();
        System.out.println("Chu vi hình vuông: " );
        String cvhv = scanner.nextLine();
    }
}
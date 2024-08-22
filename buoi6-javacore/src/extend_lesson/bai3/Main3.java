////Tạo lớp Person : (int)id, (String) name, (int)age
////Tạo lớp Employee: (double) experience
////Thực hiện cho Employee kế thừa Person
////Thực hiện:
////Cho người dung nhập vào thông tin của employee
////Lưu tất cả employee vào mảng

////Thực hiện hiển thị thông tin của các employees

package extend_lesson.bai3;
import java.util.Scanner;
public class Main3 {
 public static void main(String[] args) {
    {
   //type arrName[]=new [number]
    Scanner scanner = new Scanner(System.in);
    System.out.println("input number of employes ");
    int n = Integer.parseInt(scanner.nextLine());
    Employe employes [] = new Employe[n];
   //bvn lm nốt
    System.out.println("id: ");
    int id = Integer.parseInt(scanner.nextLine());
    System.out.println("name:");
    String name = scanner.nextLine();
    System.out.println("age: ");
    int age = Integer.parseInt(scanner.nextLine());
    System.out.println("exp: ");
    double exp = Double.parseDouble(scanner.nextLine());
    Employe dat = new Employe(id, name, age, exp);
    System.out.println(dat);
}
}
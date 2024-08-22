//Tạo lớp Person : (int)id, (String) name, (String) address, (int)age
//Tạo lớp Employee: (double) experience, (String) placeWork
//Thực hiện cho Employee kế thừa Person
//Thực hiện hiển thị thông tin của các employee

package extend_lesson.bai2;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("id: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("name:");
        String name = scanner.nextLine();
        System.out.println("Address: ");
        String address = scanner.nextLine();
        System.out.println("age: ");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("exp: ");
        double exp = Double.parseDouble(scanner.nextLine());
        System.out.println("Place: ");
        String place = scanner.nextLine();
        Employe dat = new Employe(id, address,name, age, exp, place);
        System.out.println(dat);
    }
}

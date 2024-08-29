//Dựa vào bài trên Xây dựng lớp Hodan (hộ dân):
//      id
//      Số nhà của hộ dân đó. ( Số nhà được gắn cho mỗi hộ dân)
//      Thông tin về mỗi cá nhân trong hộ gia đình. -> List
//      Với mỗi cá nhân, người ta quản lý các thông tin như: họ và tên, ngày sinh, nghề nghiệp.
//YC:

//  Thực hiện viết chức năng nhập thông tin cho hộ dân và các thành viên trong hộ dân đó
//  Hiển thị thông tin chi tiết của hộ dân
package extend_lesson.buoi9.bai1.quanlihodan;
import extend_lesson.buoi9.bai1.quanlihodan.entities.Family;
import extend_lesson.buoi9.bai1.quanlihodan.entities.Member;
import extend_lesson.buoi9.bai1.quanlihodan.services.MemberService;
import extend_lesson.buoi9.bai1.quanlihodan.services.FamilyService;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        FamilyService familyService = new FamilyService();
        Scanner scanner = new Scanner(System.in);
        Family family = familyService.inputFamily(scanner);
        System.out.println(family);
    }
}



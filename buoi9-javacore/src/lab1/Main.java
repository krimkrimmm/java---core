//Nhập thông tin cho các thành viên trong gia đình
//Member: id, name, dob, job
//Nhập ít nhất 2 members
//Lưu vào ArrayList
//In ra mà hình


package lab1;
import lab1.entities.Member;
import lab1.services.Services;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Mời b nhập số thành viên: ");

        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        Services services = new Services();
        ArrayList<Member> members = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            Member member = Services.inputMember(sc);
            members.add(member);
        }
        System.out.println(members);

        ArrayList<Member> member = Services.inputMember(sc, n);
        System.out.println(members);
    }
}


















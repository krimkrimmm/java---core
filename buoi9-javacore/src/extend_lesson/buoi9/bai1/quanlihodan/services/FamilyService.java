package extend_lesson.buoi9.bai1.quanlihodan.services;

import extend_lesson.buoi9.bai1.quanlihodan.entities.Family;
import extend_lesson.buoi9.bai1.quanlihodan.entities.Member;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class FamilyService {
    MemberService memberService = new MemberService();

    public Family inputFamily(Scanner scanner){
        List<Member> members = new ArrayList<>();
        System.out.println("Nhập số nhà: ");
        String numberHouse = scanner.nextLine();
        System.out.println("Nhập thông tin danh sách thành viên: ");
        while (true){
            System.out.println("nhập thông tin cho thành viên: ");
            Member member = memberService.inputMember(scanner);
            members.add(member);
            System.out.println("DO u want to continues? (Y/N)");
            String choice = scanner.nextLine();
            if(choice.equalsIgnoreCase("N")){
                break;
            }
        }
        return new Family(numberHouse, members);
    }
}
package extend_lesson.bvn8.service;

import extend_lesson.bvn8.entities.StudentBiz;

import java.util.Scanner;

public class StudentBizService {
    public StudentBiz inputBizStudent(Scanner scanner) {
        System.out.print("Nhập tên: ");
        String name = scanner.nextLine();
        System.out.print("Nhập điểm marketting: ");
        double marketting = Double.parseDouble(scanner.nextLine());
        System.out.print("Nhập điểm sales: ");
        double sales = Double.parseDouble(scanner.nextLine());
        return new StudentBiz(name, "Kinh doanh", marketting, sales);
    }
}



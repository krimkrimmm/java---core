package extend_lesson.bvn8.service;

import extend_lesson.bvn8.entities.StudentIT;

import java.util.Scanner;

public class StudentITService {
    public StudentIT inputItStudent(Scanner scanner) {
        System.out.print("Nhập tên: ");
        String name = scanner.nextLine();
        System.out.print("Nhập điểm HTML: ");
        double html = Double.parseDouble(scanner.nextLine());
        System.out.print("Nhập điểm CSS: ");
        double css = Double.parseDouble(scanner.nextLine());
        System.out.print("Nhập điểm JAVA: ");
        double java = Double.parseDouble(scanner.nextLine());
        return new StudentIT(name, "Công nghệ thông tin", html, css, java);
    }
}
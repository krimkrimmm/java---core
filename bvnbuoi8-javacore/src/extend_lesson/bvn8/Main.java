package extend_lesson.bvn8;
import extend_lesson.bvn8.entities.StudentIT;
import extend_lesson.bvn8.entities.StudentBiz;
import extend_lesson.bvn8.service.StudentITService;
import extend_lesson.bvn8.service.StudentBizService;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = menu(scanner);
        System.out.println();
        if (choice == 1){
            chooseIt(scanner);
        } else if (choice == 2) {
            chooseBiz(scanner);
        } else if (choice == 3) {
            System.exit(0);
        } else {
            System.out.println("Vui lòng thử lại!");
        }
    }



    private static int menu(Scanner scanner) {
        System.out.println("Nhập ngành của sinh viên: ");
        System.out.println("1. Công nghệ thông tin");
        System.out.println("2. Kinh doanh.");
        System.out.println("3. Thoát.");
        return Integer.parseInt(scanner.nextLine());
    }
    private static void chooseIt(Scanner scanner) {
        System.out.println("Nhập số sinh viên: ");
        int numberStudentIT = Integer.parseInt(scanner.nextLine());
        ArrayList<String> itStudents = new ArrayList<>();
        for (int i = 0; i < numberStudentIT; i++) {
            System.out.println("\nNhập thông tin sinh viên thứ " + (i + 1) + ":");
            StudentITService itStudentService = new StudentITService();
            StudentIT itStudent = itStudentService.inputItStudent(scanner);
            itStudent.print();
            itStudents.add(itStudent.toString());
        }
        System.out.println();
        System.out.println("Danh sách sinh viên It:");
        for (int i = 0; i < itStudents.size(); i++) {
            System.out.println(" ");
            System.out.println("Sinh viên thứ " + (i + 1) + ": " + itStudents.get(i));
        }
    }
    private static void chooseBiz(Scanner scanner) {
        System.out.println("Nhập số sinh viên muốn nhập: ");
        int numberItStudent = Integer.parseInt(scanner.nextLine());
        ArrayList<String> bizStudents = new ArrayList<>();
        for (int i = 0; i < numberItStudent; i++) {
            StudentBizService bizStudentService = new StudentBizService();
            StudentBiz bizStudent = bizStudentService.inputBizStudent(scanner);
            bizStudent.print();
            bizStudents.add(String.valueOf(bizStudent));
        }
        System.out.println("Danh sách sinh viên Biz:");
        for (int i = 0; i < bizStudents.size(); i++) {
            System.out.println(" ");
            System.out.println("Sinh viên thứ " + (i + 1) + ": " + bizStudents.get(i));
        }
    }
}
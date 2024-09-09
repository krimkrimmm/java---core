package lab2.service;
import lab2.entities.Student;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class StudentService {
    private ArrayList<Student> students = new ArrayList<>();

    public void inputStudents() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng học sinh: ");
        int numberOfStudents = scanner.nextInt();
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("Nhập thông tin chi tiết cho sinh viên" + (i + 1) + ":");
            System.out.print("nhập ID: ");
            int id = scanner.nextInt();
            scanner.nextLine();  // Consume newline
            System.out.print("nhập tên: ");
            String name = scanner.nextLine();
            System.out.print("Điểm Toán: ");
            double scoreMath = scanner.nextDouble();
            System.out.print("Điểm Vật Lý: ");
            double scorePhysic = scanner.nextDouble();
            System.out.print("Điểm môn Hóa: ");
            double scoreChemistry = scanner.nextDouble();

            students.add(new Student(id, name, scoreMath, scorePhysic, scoreChemistry));
        }
    }

    public void displayStudents() {
        int countA = 0, countB = 0, countC = 0;
        System.out.println("\nStudent Details:");
        for (Student student : students) {

            System.out.println(student);
            switch (student.getGrade()) {
                case "A":
                    countA++;
                    break;
                case "B":
                    countB++;
                    break;
                case "C":
                    countC++;
                    break;
            }
        }
        int totalStudents = students.size();
        System.out.println("\nPercentage of each grade:");
        System.out.println("A: " + (countA * 100.0 / totalStudents) + "%");
        System.out.println("B: " + (countB * 100.0 / totalStudents) + "%");
        System.out.println("C: " + (countC * 100.0 / totalStudents) + "%");
    }


}
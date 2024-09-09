package extend_lesson.lab1.services;
import extend_lesson.lab1.entities.Student;
import java.util.ArrayList;
import java.util.Scanner;
public class StudentService {
    private ArrayList<Student> students = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void addStudent() {
        System.out.println("nhap id:");
        Integer id = Integer.valueOf(scanner.nextLine());
        System.out.print("nhap tên student: ");
        String name = scanner.nextLine();
        System.out.print("nhap dia chi student: ");
        String address = scanner.nextLine();
        students.add(new Student(id, name, address));
    }

    public boolean askToContinue() {
        System.out.print("Do you want to add another student? (yes/no): ");
        String continueInput = scanner.nextLine();
        return continueInput.equalsIgnoreCase("yes");
    }

    public void printStudents() {
        System.out.println("List of students:");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}

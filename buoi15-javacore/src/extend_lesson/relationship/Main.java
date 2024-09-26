package extend_lesson.relationship;

import extend_lesson.relationship.entities.Student;
import extend_lesson.relationship.service.StudentService;
import extend_lesson.relationship.entities.Classroom;
import extend_lesson.relationship.service.ClassroomService;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        StudentService studentService = new StudentService();
        System.out.println("thêm hs vao lop:");
        System.out.println("nhap id lop:");
        int classId = scanner.nextInt();
        System.out.println("nhap id hs:");
        int studentId = scanner.nextInt();

        Student student = studentService.findById(StudentId);
        student.setClassId(classId);
        service.displayStudentInfo(student);

    }
}
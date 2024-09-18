//BT - Xây dựng chương trình quản lý học sinh
//Tạo lớp Student: name, age, marks, classification
//Thực hiện set giá trị cho: name, age, marks
//Xây dựng dựng interface Iclassification: classify(), display()
//Cho Student implements Iclassification để thực hiện các hàm trên
//Đối với việc xếp loại (thực hiện hàm classify() ):

//        Nếu điểm >=8 loại A
//        <8 và >6.5 loại B
//        Còn lại là loại C
//Hiển thị thông tin chi tiết của học sinh.

package interface_lesson.bvn1;
import interface_lesson.bvn1.entities.Student;
import interface_lesson.bvn1.service.StudentService;
import interface_lesson.bvn1.service.Iclassification;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        System.out.println("nhập thong tin cho hs:");
        StudentService studentService = new StudentService();
        Scanner scanner = new Scanner(System.in);
        Student student = studentService.inputInfo(scanner);
        studentService.display();

        Student student1 = new Student("a", 20, 8,"A");
        Student student2 = new Student("b",21,6,"B");
        Student student3 = new Student("c",20, 5,"C");
        studentService.addStudent(student1);
        studentService.addStudent(student2);
        studentService.addStudent(student3);
        System.out.println("student1:");
        System.out.println("student2:");
        System.out.println("student3:");

        studentService.displayAllStudents();
        System.out.println("Updating a details:");
        studentService.updateStudent("a", 20, 9,"A");
        studentService.displayAllStudents();
        System.out.println("Removing b:");
        studentService.removeStudent("b");
        studentService.displayAllStudents();
        System.out.println("Finding c:");
        Student foundStudent = studentService.findStudentByName("c");

        if (foundStudent != null) {
            foundStudent.display();
        } else {
            System.out.println("Student not found.");
        }

        System.out.println("Sorting students by marks:");
        studentService.sortStudentsByMarks();
        studentService.displayAllStudents();
    }
}

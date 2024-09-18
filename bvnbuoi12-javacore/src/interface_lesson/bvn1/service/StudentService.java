package interface_lesson.bvn1.service;
import interface_lesson.bvn1.entities.Student;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class StudentService implements Iclassification {

    public Student inputInfo(Scanner scanner) {
        System.out.println("nhâp name:");
        String name = scanner.nextLine();
        System.out.println("nhâp age:");
        int age = scanner.nextInt();
        System.out.println("nhâp marks:");
        double marks = scanner.nextDouble();
        System.out.println("nhâp classification:");
        String classification = scanner.nextLine();

        return new Student(name);
    }
    private List<Student> students;
    public StudentService() {
        students = new ArrayList<>();
    }
    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudent(String name) {
        students.removeIf(student -> student.getName().equals(name));
    }
    public void updateStudent(String name, int age, double marks,String classificatiob) {
        for (Student student : students) {
            if (student.getName().equals(name)) {
                student.setAge(age);
                student.setMarks(marks);
                student.classification();
            }
        }
    }
    public Student findStudentByName(String name) {
        for (Student student : students) {
            if (student.getName().equals(name)) {
                return student;
            }
        }
        return null;
    }
    public void displayAllStudents() {
        for (Student student : students) {
            student.display();
            System.out.println();
        }
    }
    @Override
    public void classification() {

    }
    @Override
    public void display() {
    }
    public void sortStudentsByMarks() {
    }
    public void sortStudentByMarks() {
        students.sort((s1, s2) -> Double.compare(s2.getMarks(), s1.getMarks()));
    }


}

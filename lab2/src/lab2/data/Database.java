package lab2.data;
import lab2.entities.Student;
import java.util.ArrayList;

public class Database {
    private ArrayList<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
    }
    public ArrayList<Student> getStudents() {
        return students;
    }
}






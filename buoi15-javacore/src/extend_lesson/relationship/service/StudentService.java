package extend_lesson.relationship.service;

import extend_lesson.relationship.data.Database;

import java.util.ArrayList;
import java.util.List;

public class StudentService {
    ClassroomService classroomService = new ClassroomService();
    public Student findById(int id){
        for (Student student: Database.students);
        if (student.getId()==id)
            return student;
    }
    return null;
}
public void displayStudentInfo(Student student){
    System.out.println("tên:"+student.getName());
    System.out.println("score:"+student.getScore());

    System.out.println("thu tu lop hoc:");
    System.out.println(classroomService.findById(student.getClassId()));
}
public void findStudentsByClassId(int classId){
    //danh sach nhg hs hoc lop classId
    List<Student>students = new ArrayList<>();

    for (Student student:Database.students){
        if (student.getClassId()==classId){
            students.add(student);

        }
    }
    System.out.println(students);
}





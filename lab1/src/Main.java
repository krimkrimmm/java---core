//Tạo class Student: id, name, address (giá trị id tự động tăng)
//Các giá trị thuộc tính đều là người dung nhập vào
//Mỗi lần nhập xong lưu student vào trong arraylist
//Sau khi nhập xong, hỏi người dùng có muốn nhập vào nữa không, nếu không thì in các student có trong list ra

import extend_lesson.lab1.services.StudentService;

public class Main {
    public static void main(String[] args) {
        StudentService studentService = new StudentService();
        boolean continueInput;
        do {
            studentService.addStudent();
            continueInput = studentService.askToContinue();
        } while (continueInput);
        studentService.printStudents();
    }
}


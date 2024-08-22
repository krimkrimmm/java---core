//Khái niệm: Từ khóa super trong java
// là một biến tham chiếu được sử dụng để tham chiếu trực tiếp đến đối tượng của lớp cha gần nhất.
// Cách dùng:
//         Để tham chiếu trực tiếp đến biến instance của lớp cha gần nhất.
//         Được sử dụng để gọi trực tiếp Constructor của lớp cha.
//         Được sử dụng để gọi trực tiếp phương thức của lớp cha.


package extend_lesson;

public class Main {
    public static void main(String[] args) {
        People people = new People();//ham ktao co tham số truyen đến people
        people.setName("");
        Student student = new Student("a") ;
        student.setScore(1);
        System.out.println(student);

    }
}
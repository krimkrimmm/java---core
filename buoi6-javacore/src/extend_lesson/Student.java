package extend_lesson;

public class Student extends People {

    public Student(String age, int name, double score) {
        super(age, name);
        this.score = score ;
    }

    private double score ;

    public Student() {
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name"+super.getName()+
                "age"+super.getAge()+
                "score=" + score +
                '}';
    }
}
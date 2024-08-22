package extend_lesson.bai3;

public class Employe extends Person{
    private double exp;

    public double getExp(){

        return exp;
    }
    public void setExp(double exp){
        this.exp = exp;
    }
    public Employe(int id, String name, int age, double exp){
        super(id,name,age)
        this.exp=exp;
    }
    @Override
    public String toString() {
        return "Id: "+getId()+"\n" +
                "Age: "+getAge()+"\n" +
                "Name"+getName()+"\n"+
                "Exp: "+exp+"\n" +
    }
}
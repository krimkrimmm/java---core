package extend_lesson.bai2;

public class Employe extends Person {
    private double exp;
    private String placeWork;

    public double getExp() {
        return exp;
    }

    public void setExp(double exp) {
        this.exp = exp;
    }

    public String getPlaceWork() {
        return placeWork;
    }

    public void setPlaceWork(String placeWork) {
        this.placeWork = placeWork;
    }


    public Employe(int id, String address, String name,int age, double exp, String placeWork) {
        super(id, address, name, age);
        this.exp = exp;
        this.placeWork = placeWork;
    }

    @Override
    public String toString() {
        return "Id: "+getId()+"\n" +
                "Address: "+getAddress()+"\n" +
                "Age: "+getAge()+"\n" +
                "Name"+getName()+"\n"+
                "Exp: "+exp+"\n" +
                "Place:"+placeWork;
    }
}
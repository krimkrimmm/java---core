//tạo class Vehicle: vận tốc, name
//hãy tạo ra các đối tượng tu vehicle va in ra nó, các giá trị của nó phải la do nguoi sdung nhập vao
//in ra ngoai man hinh


public class Vehicles {

    private String name;
    private double speed;

    public Vehicles(double speed, String name) {
        this.speed = speed;
        this.name = name;
    }



    @Override
    public String toString() {
        return "Vehicles{" +
                "name='" + name + '\'' +
                ", speed=" + speed +
                '}';
    }
}




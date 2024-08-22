//tạo class weather:
//hãy tạo ra các đối tượng tu weather va in ra nó, các giá trị của nó phải la do nguoi sdung nhập vao
//in ra ngoai man hinh
public class weather {
    private Season season;


    public weather(Season season) {
        this.season = season;

    }

    @Override
    public String toString() {
        return "weather{" +
                "season=" + season +
                '}';
    }
}

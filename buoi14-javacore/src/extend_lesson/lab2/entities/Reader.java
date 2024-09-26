package extend_lesson.lab2.entities;
public class Reader {
    private int id;
    private String name;
    private String phonenumber;
    private String address;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getPhonenumber() {
        return phonenumber;
    }
    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public Reader(int id, String name, String phonenumber, String address)
    {
        this.id = id;
        this.name = name;
        this.phonenumber = phonenumber;
        this.address = address;

    }

    @Override
    public String toString()
    {
        return "Reader{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phonenumber='" + phonenumber + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}




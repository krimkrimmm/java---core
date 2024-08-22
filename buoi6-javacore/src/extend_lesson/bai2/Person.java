package extend_lesson.bai2;

public class Person {
    private int id;
    private String address;
    private String name;
    private int age;

    public Person(int id, String address,String name, int age) {
        this.id = id;
        this.address = address;
        this.age = age;
        this.name = name;
    }

    public Person() {
    }
   //id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    //name
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
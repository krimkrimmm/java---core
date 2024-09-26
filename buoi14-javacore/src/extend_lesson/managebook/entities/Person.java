package extend_lesson.managebook.entities;

public class Person {
    private static int autoId;
    private int id;
    private String name;
    private String phone;

    public int getId() {
        return id;
    }

    public Person(String name, String phone) {
        this.id = ++autoId;
        this.name = name;
        this.phone = phone;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}


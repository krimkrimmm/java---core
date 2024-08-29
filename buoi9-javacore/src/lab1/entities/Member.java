package lab1.entities;

public class Member {
    private static int autoId;
    private int id;
    private String name;

    public Member(String name) {
        this.id = ++autoId;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Member{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

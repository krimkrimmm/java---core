package extend_lesson.buoi9.bai1.quanlihodan.entities;

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
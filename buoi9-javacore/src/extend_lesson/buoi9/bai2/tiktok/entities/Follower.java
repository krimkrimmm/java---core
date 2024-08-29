package extend_lesson.buoi9.bai2.tiktok.entities;

import java.util.List;

public class Follower extends BaseEntity {
    private String name;
    private int id;
    private String email;

    private int NumberOfLike;

    public Follower(int id, String name, String email, int numbeOfLike, String singer, List<Follower> followers, String group, String name1, int id1, String email1, int numberOfLike) {
        super(id, name, email, numbeOfLike, singer, followers, group);
        this.name = name1;
        this.id = id1;
        this.email = email1;
        NumberOfLike = numberOfLike;
    }



    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public void setEmail(String email) {
        this.email = email;
    }

    public int getNumberOfLike() {
        return NumberOfLike;
    }

    public void setNumberOfLike(int numberOfLike) {
        NumberOfLike = numberOfLike;
    }

    @Override
    public String toString() {
        return "Follower{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", email='" + email + '\'' +
                ", NumberOfLike=" + NumberOfLike +
                ", followers=" + followers +
                '}';
    }
}
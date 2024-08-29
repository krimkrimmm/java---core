package extend_lesson.buoi9.bai2.tiktok.entities;

import java.util.List;

public class BaseEntity {
    private int id;
    private String name;
    private String email;

    private int NumbeOfLike;
    private String singer;
    List<Follower> followers;
    private String group;

    public BaseEntity(int id, String name, String email, int numbeOfLike, String singer, List<Follower> followers, String group) {
        this.id = id;
        this.name = name;
        this.email = email;
        NumbeOfLike = numbeOfLike;
        this.singer = singer;
        this.followers = followers;
        this.group = group;
    }

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getNumbeOfLike() {
        return NumbeOfLike;
    }

    public void setNumbeOfLike(int numbeOfLike) {
        NumbeOfLike = numbeOfLike;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public List<Follower> getFollowers() {
        return followers;
    }

    public void setFollowers(List<Follower> followers) {
        this.followers = followers;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "BaseEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", NumbeOfLike=" + NumbeOfLike +
                ", singer='" + singer + '\'' +
                ", followers=" + followers +
                ", group='" + group + '\'' +
                '}';
    }
}
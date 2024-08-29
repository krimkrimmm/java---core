package extend_lesson.buoi9.bai2.tiktok.entities;

import java.util.List;

public class Idol extends BaseEntity {
    private String name;

    private int id;
    private String email;
    private List<Follower> followers;
    private String group;

    public Idol(int id, String name, String email, int numbeOfLike, String singer, List<Follower> followers, String group, String name1, int id1, String email1, List<Follower> followers1, String group1) {
        super(id, name, email, numbeOfLike, singer, followers, group);
        this.name = name1;
        this.id = id1;
        this.email = email1;
        this.followers = followers1;
        this.group = group1;
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

    @Override
    public List<Follower> getFollowers() {
        return followers;
    }

    @Override
    public void setFollowers(List<Follower> followers) {
        this.followers = followers;
    }

    @Override
    public String getGroup() {
        return group;
    }

    @Override
    public void setGroup(String group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "Idol{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", email='" + email + '\'' +
                ", followers=" + followers +
                ", group='" + group + '\'' +
                ", followers=" + followers +
                '}';
    }
}
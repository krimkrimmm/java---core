package extend_lesson.buoi9.bai2.tiktok.entities;

import java.util.List;

public class Song extends BaseEntity {
    private int id;
    private String name;
    private String singer;

    public Song(int id, String name, String email, int numbeOfLike, String singer, List<Follower> followers, String group, int id1, String name1, String singer1) {
        super(id, name, email, numbeOfLike, singer, followers, group);
        this.id = id1;
        this.name = name1;
        this.singer = singer1;
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
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getSinger() {
        return singer;
    }

    @Override
    public void setSinger(String singer) {
        this.singer = singer;
    }

    @Override
    public String toString() {
        return "Song{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", singer='" + singer + '\'' +
                ", followers=" + followers +
                '}';
    }
}
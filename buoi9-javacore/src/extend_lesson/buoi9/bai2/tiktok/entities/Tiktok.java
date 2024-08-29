package extend_lesson.buoi9.bai2.tiktok.entities;
import java.util.List;

public class Tiktok {
    private List<Idol> idols;
    private List<Song> songs;

    public Tiktok(List<Idol> idols, List<Song> songs) {
        this.idols = idols;
        this.songs = songs;
    }

    @Override
    public String toString() {
        return "Tiktok{" +
                "idols=" + idols +
                ", songs=" + songs +
                '}';
    }
}
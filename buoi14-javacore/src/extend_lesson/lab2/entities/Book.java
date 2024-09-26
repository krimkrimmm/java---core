package extend_lesson.lab2.entities;

public class Book {
    private int id;
    private String name;
    private String topic;

    private String author;
    private int quality;

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

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getQuality() {
        return quality;
    }

    public void setQuality(int quality) {
        this.quality = quality;
    }

    public Book(int id, String name, String topic, String author, int quality) {
        this.id = id;
        this.name = name;
        this.topic = topic;
        this.author = author;
        this.quality = quality;


    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", topic='" + topic + '\'' +
                ", author='" + author + '\'' +
                ", quality=" + quality +
                '}';
    }
}

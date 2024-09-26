package extend_lesson.managebook.entities;

public class Book {
    private int id;
    private static int autoId;
    private String name;
    private int quantity;

    public int getId() {
        return id;
    }

    public Book(String name, int quantity) {
        this.id = ++autoId;
        this.name = name;
        this.quantity = quantity;
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

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
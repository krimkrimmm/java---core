package extend_lesson.exception.libraries.entities;
public class Book {
    private String title;
    private String author;
    private String isbn;
    private int quantity;

    private double price;
    public Book(String title, String author, String isbn, int quantity, double price) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.quantity = quantity;
        this.price = price;
    }
    // Getters and Setters

    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public String getIsbn() { return isbn; }
    public int getQuantity() { return quantity; }
    public double getPrice() { return price; }

    public void setQuantity(int quantity) { this.quantity = quantity; }
}





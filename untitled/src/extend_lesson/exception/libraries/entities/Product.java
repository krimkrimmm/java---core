package extend_lesson.exception.libraries.entities;

public class Product {
    private static int autoId;
    private String id;
    private int quantity;
    private String name;
    private double price;
    private boolean available;
    private String area;

    public Product(int quantity, String name, double price) {
        this.id = "P"+ ++autoId;
        this.quantity = quantity;
        this.name = name;
        this.price = price;
        available = true;
    }

    public Product(int quantity, String name, double price, String area) {
        this.id = "P"+ ++autoId;
        this.quantity = quantity;
        this.name = name;
        this.price = price;
        available = true;
        this.area = area;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", quantity=" + quantity +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public static int getAutoId() {
        return autoId;
    }

    public static void setAutoId(int autoId) {
        Product.autoId = autoId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
}

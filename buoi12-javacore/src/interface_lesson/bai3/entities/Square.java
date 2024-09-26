package interface_lesson.bai3.entities;

public class Square {
    private double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public Square(double side) {
        this.side = side;


    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                '}';
    }
}




package bai3.quanlitrandauxephang.entities;

public class Figure {
    private String name;
    private String posititon;
    public Figure() {
        this.name = name;
        this.posititon = posititon;
    }

    public Figure(String name) {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosititon() {
        return posititon;
    }

    public void setPosititon(String posititon) {
        this.posititon = posititon;
    }

    @Override
    public String toString() {
        return "Figure{" +
                "name='" + name + '\'' +
                ", posititon='" + posititon + '\'' +
                '}';
    }
}

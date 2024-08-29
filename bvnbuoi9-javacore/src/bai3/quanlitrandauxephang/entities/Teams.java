package bai3.quanlitrandauxephang.entities;

import java.util.Arrays;
public class Teams {
    String name;
    Figure[] figures;

    public Teams(String name, Figure[] figures) {
        this.name = name;
        this.figures = figures;
    }

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public Figure[] getFigures() {
        return figures;
    }
    public void setFigures(Figure[] figures) {
        this.figures = figures;
    }

    @Override
    public String toString() {
        return "Teams{" +
                "name='" + name + '\'' +
                ", figures=" + Arrays.toString(figures) +
                '}';
    }
}
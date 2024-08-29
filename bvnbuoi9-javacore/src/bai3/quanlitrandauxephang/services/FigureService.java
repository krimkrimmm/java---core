package bai3.quanlitrandauxephang.services;
import bai3.quanlitrandauxephang.entities.Figure;
import bai3.quanlitrandauxephang.entities.SummonRift;
import bai3.quanlitrandauxephang.entities.Teams;
import java.util.ArrayList;
import java.util.List;

import java.util.Scanner;
public class FigureService {
    //nhap thong tin cho 1 figure
    public Figure inputFigure(Scanner scanner){
        System.out.println("nhap ten:");
        String name = scanner.nextLine();
        return new Figure(name);
    }
    public ArrayList<Figure> inputFigures(Scanner scanner, int n){

        ArrayList<Figure> figures = new ArrayList<>();
        for (int i=0;i<n;i++){
            System.out.println("nhap ten:");
            String name = scanner.nextLine();
            Figure figure = new Figure(name);
            figures.add(figure);
        }
        return figures;
    }
}


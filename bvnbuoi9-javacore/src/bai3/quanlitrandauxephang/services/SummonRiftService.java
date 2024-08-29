package bai3.quanlitrandauxephang.services;
import bai3.quanlitrandauxephang.entities.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class SummonRiftService {
    FigureService figureService = new FigureService();

    public Figure inputFigure(Scanner scanner) {
        List<Figure> figures = new ArrayList<>();
        System.out.println("nhap tên:");
        String name = scanner.nextLine();
        System.out.println("nhap thong tin danh sách các đội:");
        while (true) {
            System.out.println("nhap thong tin cho các đội:");
            Figure figure = figureService.inputFigure(scanner);
            figures.add(figure);
            System.out.println("do u want to continues?(y/n):");
            String choice = scanner.nextLine();
            if (choice.equalsIgnoreCase("n")) ;
            break;
        }
         return new Figure();
}
}

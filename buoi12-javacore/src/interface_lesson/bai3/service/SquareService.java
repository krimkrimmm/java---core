package interface_lesson.bai3.service;
import interface_lesson.bai3.entities.Square;
import java.util.Scanner;
public class SquareService extends Polygon {
    public Square inputInfo(Scanner scanner){
        System.out.println("nhâp side:");

        double side = scanner.nextDouble();
        return new Square(side);
    }
    @Override
    public void display(){
    }
    @Override
    public void calArea(double side) {
        super.calArea(side);

    }

}
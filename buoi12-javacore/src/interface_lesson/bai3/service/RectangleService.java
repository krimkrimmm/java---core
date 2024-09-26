package interface_lesson.bai3.service;
import interface_lesson.bai3.entities.Rectangle;
import java.util.Scanner;
public class RectangleService extends Polygon {
    public Rectangle inputInfo(Scanner scanner){
        System.out.println("nhâp length:");

        double length = scanner.nextDouble();
        System.out.println("nhâp width:");
        double width = scanner.nextDouble();
        return new Rectangle(length,width);
    }
    @Override
    public void display(){
    }

    @Override
    public void calArea(double length, double width){
        super.calArea(length,width);
    }

}







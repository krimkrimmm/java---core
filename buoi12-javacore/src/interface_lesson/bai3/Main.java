//Tạo interface đa giác Polygon: void display(), void calArea()
//Tạo lớp Rectangle: (double) length, (double) width
//Tạo lớp Square: (double) side
//Cho 2 lớp trên implements interface Polygon để thực hiện hiển thị thông tin và tính diện tích
package interface_lesson.bai3;
import interface_lesson.bai3.entities.Rectangle;

import interface_lesson.bai3.entities.Square;
import interface_lesson.bai3.service.RectangleService;
import interface_lesson.bai3.service.SquareService;
import interface_lesson.bai3.service.Polygon;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("nhâp thong tin rectangle:");
        RectangleService rectangleService = new RectangleService();

        System.out.println("nhâp thong tin square:");
        SquareService squareService = new SquareService();
        Scanner scanner = new Scanner(System.in);

        Rectangle rectangle = rectangleService.inputInfo(scanner);
        rectangleService.display();

        Square square = squareService.inputInfo(scanner);
        squareService.display();

        System.out.println("dien tich la:");
        Polygon polygon = new Polygon() {
            @Override
            public void display() {

            }
        };
    }
}




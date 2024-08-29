//Class: SummonRift: SKT, G2
//1 trận đấu LOL gồm 2 teams và thời gian bắt đầu trận đấu
//Mỗi team 5 người(5 tướng – figure)
//Mỗi vị tướng sẽ bao gồm các thuộc tính: name, position
//Yêu cầu: nhập thông tin cho 2 teams và hiển thị thông tin của 2 team ấy


package bai3.quanlitrandauxephang;
import bai3.quanlitrandauxephang.entities.SummonRift;
import bai3.quanlitrandauxephang.entities.Figure;
import bai3.quanlitrandauxephang.entities.Teams;
import bai3.quanlitrandauxephang.services.SummonRiftService;
import bai3.quanlitrandauxephang.services.FigureService;
import bai3.quanlitrandauxephang.services.TeamsService;
import java.util.Scanner;
public class Main{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Enter match time: ");
        String time = scanner.nextLine();
        SummonRift match = new SummonRift(time);
        System.out.println("Enter SKT team information:");
        for (int i = 0; i < 5; i++) {
            System.out.print(" Enter name for figure: " + (i + 1) + " : ");
            String name = scanner.nextLine();

            System.out.print(" Enter position for figure: " + (i + 1) + ": ");
            String position = scanner.nextLine();
        }
        System.out.println("Enter G2 team information:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter name for figure: " + (i + 1) + ": ");
            String name = scanner.nextLine();
            System.out.print("Enter position for figure: " + (i + 1) + ": ");
            String position = scanner.nextLine();

        }
        System.out.println("\nThong tin trận đấu:");
    }
}









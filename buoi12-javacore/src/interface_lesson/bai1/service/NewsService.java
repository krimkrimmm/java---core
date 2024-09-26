package interface_lesson.bai1.service;
import interface_lesson.bai1.entities.News;

import java.util.Scanner;
public class NewsService implements Inews {
public News inputInfo(Scanner scanner){

    System.out.println("nhâp title:");
    String title = scanner.nextLine();
    System.out.println("nhâp author:");
    String author = scanner.nextLine();
    System.out.println("nhâp nxb:");
    String publicDate = scanner.nextLine();
    System.out.println("nhâp đánh giá: ");
    double rate = Double.parseDouble(scanner.nextLine());
    return new News(title,author,publicDate,rate);
}
    @Override
    public void display(News news) {
        System.out.println(news);
    }
}








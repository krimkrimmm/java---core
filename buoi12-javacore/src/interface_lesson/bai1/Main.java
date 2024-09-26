//Tạo một interface INews chứa hàm void display()
//Tạo class News: (String) title, (String) author, (String) publicDate, (double) rate
//Set(gán) giá trị cho các thuộc tính của News
//Thực hiện implements INews và hiển thị các thông tin của class News

package interface_lesson.bai1;

import interface_lesson.bai1.entities.News;
import interface_lesson.bai1.service.NewsService;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("nhập thong tin cho bản tin:");
        NewsService newsService = new NewsService();
        Scanner scanner = new Scanner(System.in);
        News news = newsService.inputInfo(scanner);

        newsService.display(news);
    }
}
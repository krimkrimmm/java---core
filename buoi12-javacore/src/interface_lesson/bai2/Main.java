//Tạo class Yasuo: (String) feature, (String) weapon: sword
//Tạo class Lucian: (String) feature, (String) weapon: pistols
//NOTE: Yasuo thì có thể lướt, chém, Lucian thì vừa có thể lướt, bắn.
//-> Hãy tạo interface và implements sao cho thật hợp lý



package interface_lesson.bai2;
import interface_lesson.bai2.entities.Lucian;
import interface_lesson.bai2.entities.Yasuo;
import interface_lesson.bai2.service.LucianService;
import interface_lesson.bai2.service.YasuoService;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {


        System.out.println("nhâp thong tin cho yasuo:");
        YasuoService yasuoService = new YasuoService();
        System.out.println("nhâp thong tin cho Lucian:");
        LucianService lucianService = new LucianService();
        Scanner scanner = new Scanner(System.in);
        Yasuo yasuo = yasuoService.inputInfo(scanner);
        yasuoService.dash();
        yasuoService.slash();
        Lucian lucian = lucianService.inputInfo(scanner);

        lucianService.shot();
        lucianService.dash();
    }
}
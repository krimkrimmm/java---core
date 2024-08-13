import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
//Thực hiện chuyển đổi dữ liệu từ String -> LocalDatetime
//In ra ngày giờ hiện tại
//In ra thời gian của 3 ngày sau

public class Main {
    public static void main(String[] args) {
        final int THREE_DAYS=3;
        Scanner scanner = new Scanner(System.in);
        String dateTime = "8-8-2024";
        LocalDateTime localDateTime = LocalDateTime.parse(dateTime, DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss"));     System.out.println(LocalDateTime);
        String timeInput = scanner.nextLine();
        //System.out.println(localDateTime.now());
        //System.out.println(localDateTime.plusDays(THREE_DAYS));

        LocalDateTime timeConvert = LocalDateTime.parse(timeInput, DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss"));
        System.out.println(timeConvert);
    }
}

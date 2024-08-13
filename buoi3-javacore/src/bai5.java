//bai5:Viết một chương trình cho phép người dùng nhập số tiền và chọn loại tiền tệ (USD, EUR, VND).
// Sử dụng switch case để chuyển đổi số tiền sang loại tiền tệ tương ứng
import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double money ;
        System.out.println("Enter the amount of money: ");
        money = Double.parseDouble(scanner.nextLine());
        String currency ;
        System.out.println("Enter the type of currency you want to convert to: ");
        currency = scanner.nextLine() ;
        double res ;
        switch(currency){
            case "VND":
                System.out.println("You will receive: " + money);
                break;
            case "USD":
//                double res ;
                System.out.println("You will receive: " + money*24000 );
                break ;
            case "EUR":
//                double res ;
                System.out.println("You will receive: " + money*28000 );
                break ;
        }

    }
}
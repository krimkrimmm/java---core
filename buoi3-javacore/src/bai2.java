//bai2:
//ptrinh bâc 2 có dạng: a*x^2+b*x+c=0
//viết ctrinh cho phép nguoi sdung nhập vao gtri a,b,c
//giải ptrinh(tim x)
//gợi ý:
//ktra xem a=0?
//nếu a!=0, tính detal = b^2 -4ac
//nếu a&b=0->vô nghệm
//nếu a=0, b!=0->vô nghệm
//x=-b/a
//a==0 && b!=0 -> x=-c/b
//pt co hai nghiệm: x1=(-b-căn deta)/2a,x2=(-b-căn deta)/2a
import java.util.Scanner;
public class bai2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhâp a:");
        double a = Double.parseDouble(scanner.nextLine());
        System.out.println("nhập b:");
        double b = Double.parseDouble(scanner.nextLine());
        System.out.println("nhập c:");
        Double c = Double.parseDouble(scanner.nextLine());
        //x=-b/a
        if (a!=0){
            double dental = Math.pow(b,2)-4*a*c;
            if (dental<0){
                System.out.println("pt vô nghiệm:");
            } else if (dental==0) {
                double x = -b/2*a;
            }
            else {
                double x1 = (-b+Math.sqrt(dental))/(2*a);
                double x2 = (-b+Math.sqrt(dental))/(2*a);
            }
        }else{
            System.out.println("giải ptrinh b1");
        }

    }
}
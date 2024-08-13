//Nhập vào bàn phím một số nguyên N
//Màn hình hiển thị: Mời bạn nhập số thứ 1:
//Mời bạn nhập số thứ n:
//Lưu lại các giá trị vừa nhập vào trong mảng và hiển thị lại ra ngoài màn hình các giá trị vừa nhập

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*
        *tiên biến:
        *
        *
         */
        String[]arrString = new String[4];
        double[] arrDouble = {2,5,6,8};
        System.out.println("nhập vao so nguyen:");
        int n = scanner.nextInt();
        int arr[] = new int[n];

        for (int i=0;i<n;i++){
            System.out.println("nhập số thứ:"+(i+1));
            int x = scanner.nextInt();
            System.out.println("số vưa nhập la:"+x);
        }
        for (int i=0;i<n;i++)
        {
            System.out.println("ar["+i+"]="+arr[i]);
        }
    }
}







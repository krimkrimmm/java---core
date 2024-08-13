//Mời người dùng nhập vào số dòng và số cột của một mảng 2 chiều
//Nhập giá trị cho các hàng, các cột (Sử dụng for)
//Tính tổng giá trị của các số vừa nhập vào đó

import java.util.Scanner;
public class bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập so dong:");
        int row = scanner.nextInt();
        System.out.println("nập so cột:");
        int column = scanner.nextInt();
        int arr [][] = new int[row][column];
        for (int i=0;i<row;i++){
            for (int j=0;j<column;j++){
                System.out.println("nhập gtri a["+i+"]["+j+"]:"+"\t");

                arr[i][j] = scanner.nextInt();
            }
        }
        int sum=0;
        for (int i=0;i<row;i++) {
            for (int j = 0; j < column; j++) {
                sum += arr[i][j];
            }
        }
        System.out.println("Sum="+sum);
        for (i=0;i<row;i++) {
            for (j=0;j<column;j++) {

            }
        }
        System.out.println("tong la:"+sum);
    }

}



//Mời người dùng nhập vào số dòng và số cột của một mảng 2 chiều
//Nhập giá trị cho các hàng, các cột (Sử dụng for)
//Tính tổng các giá trị chia hết cho 3

import java.util.Scanner;
public class bai5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, m;

        System.out.print("Nhập số hàng n = ");
        n = scanner.nextInt();
        System.out.print("Nhập số cột m = ");
        m = scanner.nextInt();

        int[][] arr = new int[n][m];

        System.out.println("Nhập vào ma trận:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

        // Tính tổng giá trị chia hết cho 3
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] % 3 == 0) {
                    sum += arr[i][j];
                }
            }
        }

        System.out.println("Ma trận vừa nhập là:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Tổng giá trị chia hết cho 3 trong ma trận: " + sum);
    }
}




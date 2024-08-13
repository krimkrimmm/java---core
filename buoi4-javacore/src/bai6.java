//Mời người dùng nhập vào số dòng và số cột của ma trận A, B (số dòng và số cột của 2 ma trận bằng nhau)
//Kiểm tra nếu số dòng và số cột của 2 ma trận k bằng nhau -> hiển thị thông báo k thể thực hiện
//Nhập giá trị cho các hàng, các cột (Sử dụng for)
//Tính tổng 2 ma trận
//Guide:


import java.util.Scanner;

public class bai6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, m;

        System.out.print("Nhập số dòng và số cột của ma trận (n = m) = ");
        n = scanner.nextInt();
        m = scanner.nextInt();

        int[][] matrixA = new int[n][m];
        int[][] matrixB = new int[n][m];
        int[][] sumMatrix = new int[n][m];

        System.out.println("Nhập vào ma trận A:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrixA[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Nhập vào ma trận B:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrixB[i][j] = scanner.nextInt();
            }
        }

        // Kiểm tra số dòng và số cột
        if (n != m) {
            System.out.println("Không thể thực hiện phép cộng ma trận vì số dòng và số cột không bằng nhau.");
            return;
        }

        // Tính tổng ma trận
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                sumMatrix[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }

        System.out.println("Ma trận tổng là:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(sumMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

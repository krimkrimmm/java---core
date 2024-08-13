//bai2:viet ctrinh thực hiện
//tạo mảng số nguyen gom n ptu với n nhập vao tu ban phím - nhập các ptu mảng`
//in mảng ra man hinh
//thay đổi các ptu la số chẵn trong mảng tăng lên 1 đơn vị

import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số phần tử của mảng: ");
        int n = scanner.nextInt();

        // Tạo mảng số nguyên với n phần tử
        int[] arr = new int[n];
        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // In mảng ra màn hình
        System.out.print("Mảng đã nhập: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // Thay đổi các phần tử là số chẵn tăng lên 1 đơn vị
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                arr[i]++;
            }
        }
        // In mảng sau khi thay đổi
        System.out.print("Mảng sau khi thay đổi: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

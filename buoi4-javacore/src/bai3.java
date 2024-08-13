import java.util.Scanner;
public class bai3{
    public static void main(String[] args) {
        /*mảng hai chieu:
        * tiên biến: techmasterschool tu tieng anh có nghĩa
        * class: tu tieng anh có nghĩa va la danh tu, techmasterschool
        *
        * package: viết thuong hêt hoặc cách nhau bang -techmaster services
        * */
        Scanner scanner = new Scanner(System.in);

    int [][]arr = new int[2][3];
    for (int i=0;i<2;i++){
        for (int j=0;j<3;j++){
            System.out.println("nhập gtri a["+i+"]["+j+"]");
            arr[i][j] = scanner.nextInt();
            System.out.println("");
        }
    }

    for (int i=0;i<2;i++){
        for (int j=0;j<3;j++){
            System.out.println("nhập gtri a["+i+"]["+j+"]="+arr[i][j]);
        }
    }
    }
}






//Tạo lớp Worker: id, name, age, salary, workPlace
//Thực hiện them mới một công nhân
//Thực hiện tăng lương, giảm lương cho các công nhân
//Hiển thị menu cho người dụng chọn



import lab3.entities.Worker;
import lab3.service.WorkerService;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        WorkerService workerService = new WorkerService();
        Scanner scanner = new Scanner(System.in);

        boolean running = true;
        while (running) {
            System.out.println("1. Thêm công nhân");
            System.out.println("2. Tăng lương");
            System.out.println("3. Giảm lương");
            System.out.println("4. Hiển thị công nhân");
            System.out.println("5. Thoát");
            System.out.print("Chọn: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("nhập ID: ");
                    String id = scanner.nextLine();
                    System.out.print("nhập tên: ");
                    String name = scanner.nextLine();
                    System.out.print("nhập tuổi: ");
                    int age = scanner.nextInt();
                    System.out.print("nhập luơng: ");
                    double salary = scanner.nextDouble();
                    scanner.nextLine(); // Consume newline
                    System.out.print("nhập nơi làm việc: ");
                    String workPlace = scanner.nextLine();
                    workerService.addWorker(new Worker(id, name, age, salary, workPlace));
                    break;
                case 2:
                    System.out.print("Nhập ID nhân viên để tăng lương: ");
                    String increaseId = scanner.nextLine();
                    System.out.print("Nhập số tiền để tăng: ");
                    double increaseAmount = scanner.nextDouble();
                    scanner.nextLine(); // Consume newline
                    workerService.increaseSalary(increaseId, increaseAmount);
                    break;
                case 3:
                    System.out.print("Nhập ID nhân viên để giảm lương: ");
                    String decreaseId = scanner.nextLine();
                    System.out.print("Nhập số tiền cần giảm: ");
                    double decreaseAmount = scanner.nextDouble();
                    scanner.nextLine(); // Consume newline
                    workerService.decreaseSalary(decreaseId, decreaseAmount);
                    break;
                case 4:
                    workerService.displayWorkers();
                    break;
                case 5:
                    running = false;
                    break;
                default:
                    System.out.println("Tùy chọn không hợp lệ!");
            }
        }
        scanner.close();
    }
}

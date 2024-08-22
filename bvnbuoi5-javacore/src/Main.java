import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Khởi tạo đt -> Dùng hàm khởi tạo
        Account accountSystem = new Account("techmaster", "hoclacoviec", 1000000);

        do {
            boolean isLoginSuccess = login(scanner, accountSystem);
            if(!isLoginSuccess){
                System.out.println("Thất bịa rồi");
            } else {
                System.out.println("Login thành công, mời bạn lựa chọn");
                do {
                    System.out.println("1- Xem thông tin tài khoản");
                    System.out.println("2- Rút tiền");
                    int choice = Integer.parseInt(scanner.nextLine());
                    switch (choice){
                        case 1:
                            System.out.println(accountSystem);
                            break;
                        case 2:
                            System.out.println("Mời b nhập số tiền muốn rút");
                            double money = Double.parseDouble(scanner.nextLine());
                            if(money<=0 || money> accountSystem.getBalance()){
                                System.out.println("Số tiền k hợp lệ");
                            } else {
                                double remainAmt = accountSystem.getBalance()- money;
                                accountSystem.setBalance((int) remainAmt);
                            }
                            break;
                    }
                } while (true);

            }

        } while (true);
    }

    public static boolean login(Scanner scanner, Account accountSystem){
        System.out.println("Mời b nhập username: ");
        String username = scanner.nextLine();
        System.out.println("Mời b nhập pass: ");
        String pass = scanner.nextLine();
        if(username.equals(accountSystem.getUsername()) && pass.equals(accountSystem.getPassword())){
            return true;
        }
        return false;
    }
}
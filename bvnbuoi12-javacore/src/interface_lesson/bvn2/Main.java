//BTVN – Tài khoản ngân hàng
//Tạo class Account: name, accountNumber, email, accountBalance
//Tạo interface IAccount:
//	recharge(double amount);
//	changeEmail(String email);
//	displayInfo();
//Account  implements IAccount và thực hiện các hàm trên.

package interface_lesson.bvn2;
import interface_lesson.bvn2.entities.Account;
import interface_lesson.bvn2.service.AccountService;
import interface_lesson.bvn2.service.IAccount;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("nhâp thong tin account:");
        AccountService accountService = new AccountService();
        Scanner scanner = new Scanner(System.in);
        Account account = AccountService.inputInfo(scanner);
        accountService.displayInfo();

    }
}





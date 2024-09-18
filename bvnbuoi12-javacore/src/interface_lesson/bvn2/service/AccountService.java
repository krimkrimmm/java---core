package interface_lesson.bvn2.service;
import interface_lesson.bvn2.entities.Account;
import java.util.Scanner;
public class AccountService implements IAccount{
    public static Account inputInfo(Scanner scanner){
        System.out.println("nhâp name:");

        String name = scanner.nextLine();
        System.out.println("nhâp accountNumber:");
        int accountNumber = scanner.nextInt();
        System.out.println("nhâp email:");
        String email = scanner.nextLine();
        System.out.println("nhâp accountBalance:");
        float accountBalance = scanner.nextFloat();
        return new Account(name,accountNumber,email,accountBalance);
    }

    @Override
    public void recharge(double amount) {

    }

    @Override
    public void changeEmail(String email) {

    }

    @Override
    public void displayInfo() {
    }
}
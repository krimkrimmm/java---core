package interface_lesson.bvn2.service;
import interface_lesson.bvn2.entities.Account;
public interface IAccount {
    void recharge(double amount);
    void changeEmail(String email);
    void displayInfo();
}

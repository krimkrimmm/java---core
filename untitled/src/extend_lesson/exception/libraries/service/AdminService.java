package extend_lesson.exception.libraries.service;

import extend_lesson.exception.libraries.entities.Admin;
import extend_lesson.exception.libraries.entities.Customer;
import java.util.ArrayList;
import java.util.List;

public class AdminService {
    private List<Customer> users = new ArrayList<>();

    public void viewUsers() {
        for (Customer user : users) {
            System.out.println("User: " + user.getName());
        }
    }
    public void createLibrarianAccount(Customer user)
    {
        users.add(user);
        System.out.println("Tài khoản thủ thư được tạo cho " + user.getName());
    }

    public void lockUserAccount(String email) {
        users.removeIf(user -> user.getEmail().equals(email));
        System.out.println("Tài khoản người dùng bị khóa.");
    }
}




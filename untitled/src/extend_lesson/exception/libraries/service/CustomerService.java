package extend_lesson.exception.libraries.service;

import extend_lesson.exception.libraries.entities.Customer;
import extend_lesson.exception.libraries.utils.Validator;
import java.util.ArrayList;
import java.util.List;

public class CustomerService {
    private List<Customer> customers = new ArrayList<>();

    public void register(Customer customer) {
        if (Validator.validateEmail(customer.getEmail())) {
            customers.add(customer);
            System.out.println("Đăng ký thành công." + customer.getName());
        } else {
            System.out.println("Định dạng email không hợp lệ.");
        }
    }
    public Customer login(String email, String password) {
        for (Customer customer : customers) {
            if (customer.getEmail().equals(email) && customer.getPassword().equals(password)) {
                return customer;
            }
        }
        System.out.println("Thông tin đăng nhập không hợp lệ.");
        return null;
    }
}


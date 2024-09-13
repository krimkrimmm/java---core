package extend_lesson.service;

import extend_lesson.entities.AdministrativeStaff;
import extend_lesson.entities.Employee;
import extend_lesson.entities.MarketingStaff;
import extend_lesson.entities.Manager;

public class EmployeeService {

    public void displayEmployeeInfo(Employee employee) {
        System.out.println("ID: " + employee.getId());
        System.out.println("Name: " + employee.getName());
        System.out.println("Income: " + employee.calculateIncome());
        System.out.println("Tax: " + employee.calculateTax());
    }
}


package lab4.entities;

public class AdminEmployee extends Employee {
    public AdminEmployee(String id, String name, double salary) {
        super(id, name, salary);//
    }

    @Override
    public double calculateTotalIncome() {
        return getSalary();
    }
}

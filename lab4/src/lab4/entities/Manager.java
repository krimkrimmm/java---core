package lab4.entities;

public class Manager extends Employee {
    private double responsibilityAllowance;

    public Manager(String id, String name, double salary, double responsibilityAllowance) {
        super(id, name, salary);
        this.responsibilityAllowance = responsibilityAllowance;
    }

    @Override
    public double calculateTotalIncome() {
        return getSalary() + responsibilityAllowance;
    }
}

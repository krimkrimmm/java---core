package lab4.entities;

public class MarketingEmployee extends Employee {
    private double salesCommission;

    public MarketingEmployee(String id, String name, double salary, double salesCommission) {

        super(id, name, salary);
        this.salesCommission = salesCommission;
    }

    @Override
    public double calculateTotalIncome() {
        return getSalary() + salesCommission;
    }
}




package extend_lesson.entities;

public class MarketingStaff extends Employee {
    private double sales;
    private double commissionRate;


    public MarketingStaff(String id, String name, double salary, double sales, double commissionRate) {
        super(id, name, salary);
        this.sales = sales;
        this.commissionRate = commissionRate;
    }

    @Override
    public double calculateIncome() {
        return salary + (sales * commissionRate);
    }

    @Override
    public double calculateTax() {
        double income = calculateIncome();
        if (income < 11000000) {
            return 0;
        } else {
            return (income - 11000000) * 0.1;
        }
    }

    // Getters and setters
    public double getSales() {
        return sales;
    }

    public double getCommissionRate() {
        return commissionRate;
    }
}



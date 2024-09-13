package extend_lesson.entities;
public class Manager extends Employee {
    private double responsibilityAllowance;
    public Manager(String id, String name, double salary, double responsibilityAllowance) {
        super(id, name, salary);
        this.responsibilityAllowance = responsibilityAllowance;
    }

    @Override
    public double calculateIncome() {
        return salary + responsibilityAllowance;
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
    public double getResponsibilityAllowance() {
        return responsibilityAllowance;
    }
}


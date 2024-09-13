package extend_lesson.entities;

public class AdministrativeStaff extends Employee {

    public AdministrativeStaff(String id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public double calculateIncome() {
        return Salary();
    }

    private double Salary() {
        return 0;
    }


    @Override
    public double calculateTax() {
        if (salary < 11000000) {
            return 0;
        } else {
            return (Salary() - 11000000) * 0.1;
        }
    }
}
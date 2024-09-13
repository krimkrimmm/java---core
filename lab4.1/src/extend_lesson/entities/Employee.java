package extend_lesson.entities;

public abstract class Employee {
    private String id;
    private String name;
    double salary;

    public Employee(String id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public abstract double calculateIncome();
    public abstract double calculateTax();

    // Getters and setters
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    public double getSalary() {
        return salary;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}


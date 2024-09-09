package lab4.service;
import lab4.entities.Employee;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeService {
    private List<Employee> employees;

    public EmployeeService() {
        employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void removeEmployee(String id) {
        employees.removeIf(employee -> employee.getId().equals(id));
    }
    public void updateEmployee(Employee updatedEmployee) {
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getId().equals(updatedEmployee.getId())) {
                employees.set(i, updatedEmployee);
                break;
            }
        }
    }

    public List<Employee> searchEmployeesBySalary(double salary) {
        return employees.stream().filter(employee -> employee.getSalary() == salary).collect(Collectors.toList());
    }

    public List<Employee> sortEmployeesByNameAndIncome() {

        return employees.stream().sorted(Comparator.comparing(Employee::getName).thenComparing(Employee::calculateTotalIncome))
                .collect(Collectors.toList());
    }

    public List<Employee> getTop5HighestIncomeEmployees() {
        return employees.stream().sorted(Comparator.comparing(Employee::calculateTotalIncome).reversed()).limit(5)
                .collect(Collectors.toList());
    }
    public List<Employee> getAllEmployees() {
        return employees;
    }
}


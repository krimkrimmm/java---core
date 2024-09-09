//Công ty Rồng Việt đang hoạt động trong lĩnh vực quảng cáo. Họ có nhiều nhân viên và được chia
//nhiều phòng ban. Do tính chất công việc khác nhau nên việc tính lương cũng phải áp dụng các công thức khác nhau.
//Cụ thể thì nhân viên hành chính sẽ được trả lương tháng, trưởng phòng ngoài lương tháng còn có
//lương trách nhiệm còn nhân viên tiếp thị thì có thêm hoa hồng từ doanh số bán hàng của mỗi nhân viên.

//Công ty Rồng Việt muốn thuê Techmaster xây dựng phần mềm quản lý nhân sự tiền lương bao gồm các chức năng sau

// Nhập và xuất danh sách nhân viên
// Xóa nhân viên hoặc cập nhật thông tin nhân viên
// Tìm kiếm nhân viên theo lương
// Sắp xếp nhân viên theo họ tên và thu nhập
// Xuất 5 nhân viên có thu nhập cao nhất công ty

import lab4.entities.AdminEmployee;
import lab4.entities.Employee;
import lab4.entities.Manager;

import lab4.entities.MarketingEmployee;
import lab4.service.EmployeeService;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        EmployeeService employeeService = new EmployeeService();
        // Adding employees
        Employee admin1 = new AdminEmployee("A001", "nguyen van A", 5000);

        Employee manager1 = new Manager("M001", "nguyen van B", 8000, 2000);
        Employee marketing1 = new MarketingEmployee("MK001", "nguyen van C", 4000, 1500);
        Employee admin2 = new AdminEmployee("A02","nguyen vu A",4000);
        Employee manager2 = new Manager("M02","nguyen vu B",9000,6000);
        employeeService.addEmployee(admin1);
        employeeService.addEmployee(manager1);
        employeeService.addEmployee(marketing1);
        employeeService.addEmployee(admin2);
        employeeService.addEmployee(manager2);

        // Display all employees
        System.out.println("Tất cả nhân viên:");
        for (Employee employee : employeeService.getAllEmployees()) {
            System.out.println(employee.getName() + " - Tổng thu nhập: " + employee.calculateTotalIncome());
        }
        // Search employees by salary
        System.out.println("\nNhân viên có mức lương 5000:");
        List<Employee> employeesWithSalary5000 = employeeService.searchEmployeesBySalary(5000);
        for (Employee employee : employeesWithSalary5000) {
            System.out.println(employee.getName());
        }
        // Sort employees by name and income

        System.out.println("\nNhân viên được sắp xếp theo tên và thu nhập:");
        List<Employee> sortedEmployees = employeeService.sortEmployeesByNameAndIncome();
        for (Employee employee : sortedEmployees) {
            System.out.println(employee.getName() + " - Tổng thu nhập: " + employee.calculateTotalIncome());
        }
        // Top 5 highest income employees

        System.out.println("\nTop 5 nhân viên có thu nhập cao nhất:");
        List<Employee> top5Employees = employeeService.getTop5HighestIncomeEmployees();

        for (Employee employee : top5Employees) {
            System.out.println(employee.getName() + " - Tổng thu nhập: " + employee.calculateTotalIncome());
        }
    }
}




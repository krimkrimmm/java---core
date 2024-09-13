//Trong đó nhân viên được chia làm 3 loại: nhân viên hành chính, nhân viên tiếp thị và trưởng phòng.
//Thông tin mỗi nhân viên hành chính gồm mã, họ tên, lương
//Nhân viên tiếp thị cần thêm doanh số bán hàng và tỉ lệ hoa hồng
//Trưởng phòng sẽ có lương trách nhiệm
//Mỗi nhân viên cần được tính thu nhập và thuế thu nhập.
// Thu nhập được tính bẳng tổng các khoản thu

// Thuế thu nhập được tính theo phương pháp lũy tiến
//o Dưới 11 triệu: không đóng thuế
//o Từ 11 triệu: đóng 10%
//hiển thị ra man hinh

import extend_lesson.entities.AdministrativeStaff;
import extend_lesson.entities.MarketingStaff;
import extend_lesson.entities.Manager;
import extend_lesson.service.EmployeeService;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        AdministrativeStaff admin = new AdministrativeStaff("A001", "Nguyen van A", 10000000);
        MarketingStaff marketing = new MarketingStaff("M001", "Jane Smith", 9000000, 5000000, 0.1);
        Manager manager = new Manager("MG001", "Nguyen van B", 15000000, 2000000);

        EmployeeService service = new EmployeeService();
        service.displayEmployeeInfo(admin);
        service.displayEmployeeInfo(marketing);
        service.displayEmployeeInfo(manager);
    }
}







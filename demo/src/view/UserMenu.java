package view;
import service.*;
import util.InputUtil;
import main.Main;
public class UserMenu {
    private final UserService userService;

    public UserMenu(UserService userService) {
        this.userService = userService;
    }

    public void menu() {
        while (true) {
            System.out.println("------- PHẦN MỀM QUẢN LÝ THƯ VIỆN--------");
            System.out.println("1. Quản lý thông tin tài khoản ");
            System.out.println("2. Danh sách sách mới");
            System.out.println("3. Tìm kiếm sách");
            System.out.println("4. Quản lý thông tin sách");
            System.out.println("5. Review sách");
            System.out.println("6. Xem lịch sử đặt mua sách");
            System.out.println("7. Thoát");
            int choice = InputUtil.chooseOption("Xin mời chọn chức năng",
                    "Chức năng là số dương từ 1 tới 7, vui lòng nhập lại: ", 1, 7);
            switch (choice)
            {
                case 1:
                    showAccountManagementMenu();
                    break;
                case 2:
                    break;
                case 3:
                    showSearchBookMenu();
                case 4:
                    showTicketMenu();
                    break;
                case 5:
                    showBookVotingMenu();
                    break;
                case 6:
                    return;
            }
        }
    }
    private void showTicketMenu()
    {
        while (true) {
            System.out.println("------------ Quản lý thông tin sách------------");
            System.out.println("1. Đặt sách ");
            System.out.println("2. Xem lịch sử đặt sách");
            System.out.println("3. Thoát");
            int featureChoice = InputUtil.chooseOption("Xin mời chọn chức năng",
                    "Chức năng là số dương từ 1 tới 3, vui lòng nhập lại: ", 1, 3);

            switch (featureChoice)
            {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    return;
            }
        }
    }

    private void showAccountManagementMenu() {
        while (true) {
            System.out.println("------------ Quản lý thông tin tài khoản ------------");
            System.out.println("1. Cập nhật thông tin tài khoản");
            System.out.println("2. Nạp tiền");
            System.out.println("3. Xem lịch sử giao dịch");
            System.out.println("4. Xem số dư tài khoản");
            System.out.println("5. Thoát");
            int featureChoice = InputUtil.chooseOption("Xin mời chọn chức năng",
                    "Chức năng là số dương từ 1 tới 5, vui lòng nhập lại: ", 1, 5);
            switch (featureChoice) {
                case 1:

                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    userService.showBalance();
                    break;
                case 5:
                    return;
            }
        }
    }


    private void showBookVotingMenu()
    {
        while (true) {
            System.out.println("------------ Quản lý lượt đánh giá sách ------------");
            System.out.println("1. Thực hiện đánh giá sách"); // vote
            System.out.println("2. Xem lượt đánh giá sách theo ID sách ");
            System.out.println("3. Xem lượt đánh giá sách theo tên sách ");
            System.out.println("4. Thoát");
            int choice = InputUtil.chooseOption("Xin mời chọn chức năng",
                    "Chức năng là số dương từ 1 tới 4, vui lòng nhập lại: ", 1, 4);
            switch (choice) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    return;
            }
        }
    }
    private void showSearchBookMenu() {
        while (true) {
            System.out.println("------- PHẦN MỀM QUẢN LÝ THƯ VIỆN --------");
            System.out.println("------------------ TÌM KIẾM SÁCH ------------------");
            System.out.println("1. Tìm kiếm sách theo tên: ");
            System.out.println("2. Tìm kiếm sách theo tên thể loại: ");
            System.out.println("3. Tìm kiếm sách theo lượt vote từ 4-5 sao: ");
            System.out.println("4 Thoát: ");
            int choice = InputUtil.chooseOption("Xin mời chọn chức năng",
                    "Chức năng là số dương từ 1 tới 4, vui lòng nhập lại: ", 1, 4);
            switch (choice) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    return;
            }
        }
    }
}










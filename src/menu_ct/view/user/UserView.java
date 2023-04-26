package menu_ct.view.user;

import menu_ct.user.Staff;
import menu_ct.user.StaffController;

import java.util.ArrayList;
import java.util.Scanner;

public class UserView implements ClearScreen {
//    static UserController userController = new UserController();
//    static ArrayList<User> userList;
    static StaffController staffController = new StaffController();
    static ArrayList<Staff> staffList;
    static Scanner scanner = new Scanner(System.in);

    public static void user() throws Exception {
        int choice;
        do {
//            userController.userView();
            staffController.staffView();
            System.out.printf("%n⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃%n");
            System.out.printf("⚃\t\t%-40s⚃%n", "--Menu quản lý Tài khoản--");
            System.out.printf("⚃\t\t%-40s⚃%n", "Chọn trong các mục");
            System.out.printf("⚃\t\t%-40s⚃%n", "Nhấn 1: Xem chi tiết");
            System.out.printf("⚃\t\t%-40s⚃%n", "Nhấn 2: Thêm Tài khoản");
            System.out.printf("⚃\t\t%-40s⚃%n", "Nhấn 3: Sửa Tài khoản");
            System.out.printf("⚃\t\t%-40s⚃%n", "Nhấn 4: Xóa Tài khoản");
            System.out.printf("⚃\t\t%-40s⚃%n", "Nhấn 0: Quay lại");
            System.out.println("⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃");
            System.out.print("Enter number: ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    clearScreen(5);

                    break;
                case 2:
                    clearScreen(5);
//                    addUser();
                    break;
                case 3:
                    clearScreen(5);
//                    editUser();
                    break;
                case 4:
                    clearScreen(3);
//                    deleteUser();
                    break;
                case 0:
                    clearScreen();
                    break;
                default:
                    clearScreen();
                    System.out.println("Lỗi! Không nằm trong mục lục. Yêu cầu chọn lại:");
            }
        } while (choice != 0);
    }

//    public static void addUser() throws IOException {
//        String username = InputData.getUsername();
//        String password = InputData.getPassword();
//        String name = InputData.getName();
//        int role = InputData.getRole();
//
//        System.out.printf("Bạn muốn tạo mới tài khoản này? Username: %s|Password: %s|Name: %s|Role: %s (y/n) : ",
//                username, password, name, role);
//        if (InputData.choice()) {
//            userController.addUser(username, password, name, role);
//        }
//    }

//    public static void editUser() {
//        int index = InputData.getIndex();
//        String password = InputData.getPassword();
//        String name = InputData.getName();
//        int role = InputData.getRole();
//
//        String username = userList.get(index - 1).getUsername();
//        System.out.printf("Bạn muốn thay đổi thông tin Username: %s?%nPassword: %s|Name: %s|Role: %s (y/n)",
//                username, password, name, role);
//        if (InputData.choice()) {
//
//        }
//    }

//    public static void deleteUser() {
//        int index = InputData.getIndex();
//
//        String username = userList.get(index - 1).getUsername();
//        System.out.printf("Bạn muốn xóa Username: %s? (y/n)%n", username);
//        if (InputData.choice()){
//
//        }
//
//    }

    public static void clearScreen() {
        for (int i = 0; i < 25; i++) {
            System.out.println();
        }
    }

    public static void clearScreen(int line) {
        for (int i = 0; i < line; i++) {
            System.out.println();
        }
    }
}

package menu_ct.view.user;

import menu_ct.input.InputData;
import menu_ct.model.User;
import menu_ct.services.UserService;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class UserView implements ClearScreen {
    static int ROLE_STAFF = 1;
    static int MANAGER_STAFF = 0;
    static UserService userService = new UserService();
    static ArrayList<User> userList;
    static Scanner scanner = new Scanner(System.in);

    public static void user() {
        int choice;
        do {
            clearScreen();
            userService.showUser();
            System.out.printf("%n⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃%n");
            System.out.printf("⚃\t\t%-40s⚃%n", "--Menu quản lý Tài khoản--");
            System.out.printf("⚃\t\t%-40s⚃%n", "Chọn trong các mục");
            System.out.printf("⚃\t\t%-40s⚃%n", "Nhấn 1: Thêm Tài khoản");
            System.out.printf("⚃\t\t%-40s⚃%n", "Nhấn 2: Sửa Tài khoản");
            System.out.printf("⚃\t\t%-40s⚃%n", "Nhấn 3: Xóa Tài khoản");
            System.out.printf("⚃\t\t%-40s⚃%n", "Nhấn 0: Quay lại");
            System.out.println("⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃");
            System.out.print("Enter number: ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    clearScreen(5);
                    addUser();
                    break;
                case 2:
                    clearScreen(5);
                    editUser();
                    break;
                case 3:
                    clearScreen(3);
                    deleteUser();
                    break;
                default:
                    clearScreen();
                    System.out.println("Lỗi! Không nằm trong mục lục. Yêu cầu chọn lại:");
            }
        } while (choice != 0);
    }

    public static void addUser() {
        String username = InputData.getUsername();
        String password = InputData.getPassword();
        String name = InputData.getName();
        int role = InputData.getRole();
        Date dob = InputData.getDate();
        String address = InputData.getAddress();
        String email = InputData.getEmail();
        String phoneNum = InputData.getPhoneNum();

        System.out.printf("Bạn muốn tạo mới tài khoản này? Username: %s|Password: %s|Name: %s|Role: %s (y/n) : ",
                username, password, name, role);
        if (InputData.choice()) {
            userService.addUser(username, password, name, role, dob, address, email, phoneNum);
        }
    }

    public static void editUser() {
        System.out.print("Nhập STT Tài khoản cần sửa: ");
        userList = userService.userList;
        int index = InputData.getIndex(userList);
        String password = InputData.getPassword();
        String name = InputData.getName();
        int role = InputData.getRole();
        Date dob = InputData.getDate();
        String address = InputData.getAddress();
        String email = InputData.getEmail();
        String phoneNum = InputData.getPhoneNum();
        int timekeeping = 0;
        int dailySalary = 0;
        double coefficientsSalary = 0;
        if (role == ROLE_STAFF) {
            timekeeping = InputData.getTimekepping();
            dailySalary = InputData.getDailySalary();
        } else if (role == MANAGER_STAFF) {
            coefficientsSalary = InputData.getCoefficientsSalary();
        }

        String username = userList.get(index - 1).getUsername();
        System.out.printf("Bạn muốn thay đổi thông tin Username: %s?%nPassword: %s|Name: %s|Role: %s | Date or birth: %s, " +
                        "Address: %s, Email: %s, Phone Number: %s(y/n)",
                username, password, name, role, dob, address, email, phoneNum);
        if (InputData.choice()) {
            if (role == ROLE_STAFF) {
                userService.editStaff(index, password, name, role, dob, address, email, phoneNum, timekeeping, dailySalary);
            } else if (role == MANAGER_STAFF) {
                userService.editManager(index, password, name, role, dob, address, email, phoneNum, coefficientsSalary);
            }
        }
    }

    public static void deleteUser() {
        System.out.print("Nhập STT Tài khoản muốn xóa: ");
        userList = userService.userList;
        int index = InputData.getIndex(userList);

        String username = userList.get(index - 1).getUsername();
        System.out.printf("Bạn muốn xóa Username: %s? (y/n)%n", username);
        if (InputData.choice()) {
            userService.deleteUser(index);
        }
    }

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

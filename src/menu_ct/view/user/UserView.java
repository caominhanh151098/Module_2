package menu_ct.view.user;

import menu_ct.user.User;
import menu_ct.user.UserController;

import java.io.IOException;
import java.util.Scanner;

public class UserView implements ClearScreen {
    static UserController userController = new UserController();
    static User userInfo;
    static Scanner scanner = new Scanner(System.in);

    public static void user() throws IOException {
        userController.userView();
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃");
            System.out.printf("⚃\t\t%-40s⚃%n", "--Menu quản lý Tài khoản--");
            System.out.printf("⚃\t\t%-40s⚃%n", "Chọn trong các mục");
            System.out.printf("⚃\t\t%-40s⚃%n", "Nhấn 1: Thêm Tài khoản");
            System.out.printf("⚃\t\t%-40s⚃%n", "Nhấn 2: Sửa  Tài khoản");
            System.out.printf("⚃\t\t%-40s⚃%n", "Nhấn 3: Xóa  Tài khoản");
            System.out.printf("⚃\t\t%-40s⚃%n", "Nhấn 0: Quay lại");
            System.out.println("⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃");
            System.out.print("Enter number: ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    clearScreen();
                    addUser();
                    break;
                case 2:
                    clearScreen();
                    break;
                case 3:
                    clearScreen();
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

    public static void addUser() {
        String username = "";
        String password = "";
        String name = "";
        int role = 2;
        do {
            System.out.print("Nhập Username: ");
            username = scanner.nextLine();
            if (username.equals(""))
                System.out.println("Error! Username không được rỗng!");
        } while (username.equals(""));
        do {
            System.out.print("Nhập Password: ");
            password = scanner.nextLine();
            if (password.equals(""))
                System.out.println("Error! Password không được rỗng!");
        } while (password.equals(""));
        do {
            System.out.print("Chọn Role: ");
            String number = scanner.nextLine();
            if (number.equals(""))
                System.out.println(role);
        } while (username.equals(""));
    }

    public static void clearScreen() {
        for (int i = 0; i < 25; i++) {
            System.out.println();
        }
    }
}

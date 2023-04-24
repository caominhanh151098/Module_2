package menu_ct.view.user;

import menu_ct.user.User;
import menu_ct.user.UserController;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class UserView implements ClearScreen {
    static UserController userController = new UserController();
    static ArrayList<User> userList;
    static Scanner scanner = new Scanner(System.in);

    public static void user() throws IOException {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            userController.userView();
            System.out.printf("%n⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃%n");
            System.out.printf("⚃\t\t%-40s⚃%n", "--Menu quản lý Tài khoản--");
            System.out.printf("⚃\t\t%-40s⚃%n", "Chọn trong các mục");
            System.out.printf("⚃\t\t%-40s⚃%n", "Nhấn 1: Thêm Tài khoản");
            System.out.printf("⚃\t\t%-40s⚃%n", "Nhấn 2: Sửa  Tài khoản");
            System.out.printf("⚃\t\t%-40s⚃%n", "Nhấn 3: Xóa  Tài khoản");
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
                case 0:
                    clearScreen();
                    break;
                default:
                    clearScreen();
                    System.out.println("Lỗi! Không nằm trong mục lục. Yêu cầu chọn lại:");
            }
        } while (choice != 0);
    }

    public static void addUser() throws IOException {
        String username;
        String password;
        String name;
        int role;
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
            System.out.print("Nhập Name: ");
            name = scanner.nextLine();
            if (name.equals(""))
                System.out.println("Error! Name không được rỗng!");
        } while (name.equals(""));
        do {
            System.out.print("Chọn Role (1: Manage, 2: Staff) : ");
            String number = scanner.nextLine();
            if (number.equals(""))
                role = 1;
            else
                role = Integer.parseInt(number);
            if (role != 0 && role != 1)
                System.out.println("Role không phù hợp! Mời nhập lại!");
        } while (role != 0 && role != 1);
        System.out.printf("Bạn muốn tạo mới tài khoản này? Username: %s|Password: %s|Name: %s|Role: %s (y/n)",
                username, password, name, role);
        Character choice;
        do {
            choice = scanner.nextLine().charAt(0);
            choice = Character.toLowerCase(choice);
            if (choice == 'y' || choice == 'n') {
                if (choice == 'y') {
                    userController.addUser(username, password, name, role);
                    clearScreen();
                    System.out.println("Tạo thành công!");
                } else {
                    clearScreen();
                }
            } else System.out.println("Không phù hợp! Mời nhập lại!");

        } while (choice != 'y' && choice != 'n');
    }

    public static void editUser() throws IOException {
        String password;
        String name;
        int role;
        int index;

        userList = userController.userList;
        do {
            System.out.print("Nhập STT Tài khoản cần sửa: ");
            index = Integer.parseInt(scanner.nextLine());
            if (index < 0 || index > userList.size()) {
                System.out.println("Error! Lỗi nhập STT");
            }
        } while (index < 0 || index > userList.size());
        String username = userList.get(index - 1).getUsername();
        do {
            System.out.print("Nhập Password: ");
            password = scanner.nextLine();
            if (password.equals(""))
                System.out.println("Error! Password không được rỗng!");
        } while (password.equals(""));
        do {
            System.out.print("Nhập Name: ");
            name = scanner.nextLine();
            if (name.equals(""))
                System.out.println("Error! Name không được rỗng!");
        } while (name.equals(""));
        do {
            System.out.print("Chọn Role: ");
            String number = scanner.nextLine();
            if (number.equals(""))
                role = 1;
            else
                role = Integer.parseInt(number);
            if (role < 0 || role > 2)
                System.out.println("Role không phù hợp! Mời nhập lại!");
        } while (role < 0 || role > 2);
        System.out.printf("Bạn muốn thay đổi thông tin Username: %s?%nPassword: %s|Name: %s|Role: %s (y/n)",
                username, password, name, role);
        Character choice;
        do {
            choice = scanner.nextLine().charAt(0);
            choice = Character.toLowerCase(choice);
            if (choice == 'y' || choice == 'n') {
                if (choice == 'y') {
                    userController.editUser(index, password, name, role);
                    clearScreen();
                    System.out.println("Sửa thành công!");
                } else {
                    clearScreen();
                }
            } else System.out.println("Không phù hợp! Mời nhập lại!");

        } while (choice != 'y' && choice != 'n');
    }

    public static void deleteUser() throws IOException {
        int index;

        userList = userController.userList;
        do {
            System.out.print("Nhập STT Tài khoản cần sửa: ");
            index = Integer.parseInt(scanner.nextLine());
            if (index < 0 || index > userList.size()) {
                System.out.println("Error! Lỗi nhập STT");
            }
        } while (index < 0 || index > userList.size());

        String username = userList.get(index - 1).getUsername();
        System.out.printf("Bạn muốn xóa Username: %s? (y/n)%n", username);
        Character choice;
        do {
            choice = scanner.nextLine().charAt(0);
            choice = Character.toLowerCase(choice);
            if (choice == 'y' || choice == 'n') {
                if (choice == 'y') {
                    userController.deleteUser(index);
                    clearScreen();
                    System.out.println("Xóa thành công!");
                } else {
                    clearScreen();
                }
            } else System.out.println("Không phù hợp! Mời nhập lại!");

        } while (choice != 'y' && choice != 'n');

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

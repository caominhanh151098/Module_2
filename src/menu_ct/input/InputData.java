package menu_ct.input;

import menu_ct.model.User;
import menu_ct.demo.UserController;

import java.util.ArrayList;
import java.util.Scanner;

public class InputData {
    public static Scanner scanner = new Scanner(System.in);
    static final int ROLE_MANAGER = 0;
    static final int ROLE_STAFF = 1;
    static final char CHOICE_YES = 'y';
    static final char CHOICE_NO = 'n';
    static UserController userController = new UserController();
    static ArrayList<User> userList;
    public static String getUsername() {
        String username;
        do {
            System.out.print("Nhập Username: ");
            username = scanner.nextLine();
            if (username.equals(""))
                System.out.println("Error! Username không được rỗng!");
        } while (username.equals(""));
        return username;
    }

    public static String getPassword() {
        String password;
        do {
            System.out.print("Nhập Password: ");
            password = scanner.nextLine();
            if (password.equals(""))
                System.out.println("Error! Password không được rỗng!");
        } while (password.equals(""));
        return password;
    }

    public static String getName() {
        String name;
        do {
            System.out.print("Nhập Name: ");
            name = scanner.nextLine();
            if (name.equals(""))
                System.out.println("Error! Name không được rỗng!");
        } while (name.equals(""));
        return name;
    }

    public static int getRole() {
        int role;
        do {
            System.out.print("Chọn Role (0: Manager, 1: Staff) : ");
            String number = scanner.nextLine();
            if (number.equals(""))
                role = ROLE_STAFF;
            else
                role = Integer.parseInt(number);
            if (role != ROLE_MANAGER && role != ROLE_STAFF)
                System.out.println("Role không phù hợp! Mời nhập lại!");
        } while (role != ROLE_MANAGER && role != ROLE_STAFF);
        return role;
    }

    public static boolean choice() {
        Character answer;
        do {
            answer = scanner.nextLine().charAt(0);
            answer = Character.toLowerCase(answer);
            if (answer == CHOICE_YES || answer == CHOICE_NO) {
                if (answer == CHOICE_YES) {
                    return true;
                } else {
                    return false;
                }
            } else System.out.println("Không phù hợp! Mời nhập lại!");

        } while (answer != CHOICE_YES && answer != CHOICE_NO);
        return false;
    }

    public static int getIndex() {
        int index;
        userList = userController.userList;
        do {
            System.out.print("Nhập STT Tài khoản cần sửa: ");
            index = Integer.parseInt(scanner.nextLine());
            if (index < 0 || index > userList.size()) {
                System.out.println("Error! Lỗi nhập STT");
            }
        } while (index < 0 || index > userList.size());
        return index;
    }
}


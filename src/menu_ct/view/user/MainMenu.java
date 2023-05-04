package menu_ct.view.user;

import java.util.Scanner;

public class MainMenu implements ClearScreen{
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        int choice;
        clearScreen();
        do {
            System.out.println("⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃");
            System.out.printf("⚃\t\t%-40s⚃%n","--Menu quản lý QUÁN BÁN ĐỒNG HỒ--");
            System.out.printf("⚃\t\t%-40s⚃%n", "Chọn trong các mục");
            System.out.printf("⚃\t\t%-40s⚃%n", "Nhấn 1: Mở mục Tài khoản");
            System.out.printf("⚃\t\t%-40s⚃%n", "Nhấn 2: Mở mục Sản phầm");
            System.out.printf("⚃\t\t%-40s⚃%n", "Nhấn 3: Mở mục Đặt hàng");
            System.out.printf("⚃\t\t%-40s⚃%n", "Nhấn 0: Thoát chương trình");
            System.out.println("⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃");
            System.out.print("Enter number: ");
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Error! Nhập rỗng");
                choice = -1;
            }
            switch (choice) {
                case 1:
                    UserView.user();
                    break;
                case 2:
                    ProductView.clocks();
                    break;
                case 3:
                    clearScreen();
                    break;
                case 0:
                    clearScreen();
                    System.out.println("Exit!");
                    System.exit(0);
                default:
                    clearScreen();
                    System.out.println("Error! Không nằm trong mục lục. Yêu cầu chọn lại:");
            }
        } while (true);
    }

    public static void clearScreen() {
        for (int i = 0; i < 25; i++) {
            System.out.println();
        }
    }
}

package menu_ct.view.user;

import menu_ct.view.user.ClearScreen;
import menu_ct.view.user.ProductView;
import menu_ct.view.user.UserView;

import java.util.Scanner;

public class MainMenu {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        int choice;
        ClearScreen.clearScreen();
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
                    OrderView.orders();
                    break;
                case 0:
                    ClearScreen.clearScreen();
                    System.out.println("Exit!");
                    System.exit(0);
                default:
                    System.out.println("Error! Không nằm trong mục lục. Yêu cầu chọn lại:");
            }
        } while (true);
    }


}

package menu_ct.view.client;

import menu_ct.view.user.ClearScreen;

import java.util.Scanner;

public class MainMenuClient {
    public static Scanner scanner = new Scanner(System.in);

//    public static void mainMenuClient(long idUser) {
    public static void main(String[] args) {
        int choice;
        ClearScreen.clearScreen();
        do {
            System.out.println("⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃");
            System.out.printf("⚃\t\t%-40s⚃%n", "--Trang chủ web BÁN ĐỒNG HỒ--");
            System.out.printf("⚃\t\t%-40s⚃%n", "Chọn trong các mục");
            System.out.printf("⚃\t\t%-40s⚃%n", "Nhấn 1: Mở mục quản lý Tài khoản");
            System.out.printf("⚃\t\t%-40s⚃%n", "Nhấn 2: Mở mục mua Sản phầm");
            System.out.printf("⚃\t\t%-40s⚃%n", "Nhấn 3: Mở mục Giỏ hàng");
            System.out.printf("⚃\t\t%-40s⚃%n", "Nhấn 4: Mở mục Đơn hàng");
            System.out.printf("⚃\t\t%-40s⚃%n", "Nhấn 0: Đăng xuất");
            System.out.println("⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃");
            System.out.print("Enter number: ");
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                choice = -1;
            }
            switch (choice) {
                case 1:
//                    AcountView.menuAccount(idUser);
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 0:
                    ClearScreen.clearScreen();
                    break;
                default:
                    System.out.println("Error! Không nằm trong mục lục. Yêu cầu chọn lại:");
            }
        } while (choice != 0);
    }
}

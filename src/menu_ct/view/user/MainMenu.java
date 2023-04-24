package menu_ct.view.user;

import menu_ct.product.ProductController;
import menu_ct.user.UserController;

import java.io.IOException;
import java.util.Scanner;

public class MainMenu implements ClearScreen{
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        ProductController productController = new ProductController();
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
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    clearScreen();
                    UserView.user();
                    break;
                case 2:
                    clearScreen();
                    clocks();
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
                    System.out.println("Lỗi! Không nằm trong mục lục. Yêu cầu chọn lại:");
            }
        } while (true);
    }

    public static void clocks() {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃");
            System.out.println("⚃\t  --Menu quản lý SẢN PHẦM--\t\t\t⚃");
            System.out.println("⚃\t\tChọn trong các mục:\t\t\t\t⚃");
            System.out.println("⚃\t\tNhấn 1: Thêm Sản phẩm\t\t\t⚃");
            System.out.println("⚃\t\tNhấn 2: Sửa  Sản phẩm\t\t\t⚃");
            System.out.println("⚃\t\tNhấn 3: Xóa  Sản phẩm\t\t\t⚃");
            System.out.println("⚃\t\tNhấn 0: Quay lại\t\t\t\t⚃");
            System.out.println("⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃");
            System.out.print("Enter number: ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    clearScreen();
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

    public static void clearScreen() {
        for (int i = 0; i < 25; i++) {
            System.out.println();
        }
    }
}

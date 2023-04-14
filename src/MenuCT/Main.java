package MenuCT;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        clearScreen();
        do {
            System.out.println("⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃");
            System.out.println("⚃\t  --Menu quản lý QUÁN CAFFE--\t\t⚃");
            System.out.println("⚃\t\tChọn trong các mục:\t\t\t\t⚃");
            System.out.println("⚃\t\tNhấn 1: Mở mục Nhân viên\t\t⚃");
            System.out.println("⚃\t\tNhấn 2: Mở mục Sản phầm\t\t\t⚃");
            System.out.println("⚃\t\tNhấn 3: Mở mục Kho hàng\t\t\t⚃");
            System.out.println("⚃\t\tNhấn 0: Thoát chương trình\t\t⚃");
            System.out.println("⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃");
            System.out.print("Enter number: ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    clearScreen();
                    staff();
                    break;
                case 2:
                    clearScreen();
                    drinks();
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

    public static void staff() {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃");
            System.out.println("⚃\t  --Menu quản lý NHÂN VIÊN--\t\t⚃");
            System.out.println("⚃\t\tChọn trong các mục:\t\t\t\t⚃");
            System.out.println("⚃\t\tNhấn 1: Thêm Nhân viên\t\t\t⚃");
            System.out.println("⚃\t\tNhấn 2: Sửa  Nhân viên\t\t\t⚃");
            System.out.println("⚃\t\tNhấn 3: Xóa  Nhân viên\t\t\t⚃");
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

    public static void drinks() {
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

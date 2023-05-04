package menu_ct.view.user;

import menu_ct.input.InputData;
import menu_ct.model.Product;
import menu_ct.services.ProductService;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductView implements ClearScreen {
    static ProductService productService = new ProductService();
    static ArrayList<Product> productsList;
    static Scanner scanner = new Scanner(System.in);

    public static void clocks() {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            clearScreen();
            productService.showProduct();
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
                    clearScreen(5);
                    addProduct();
                    break;
                case 2:
                    clearScreen(5);
                    editProduct();
                    break;
                case 3:
                    clearScreen(3);
                    deleteProduct();
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

    public static void addProduct() {
        String productName = InputData.getName();
        String brand = InputData.getBrand();
        int quantity = InputData.getQuantity();
        int price = InputData.getPrice();

        System.out.printf("Bạn muốn tạo mới Sản phầm này? ProductName: %s| Brand: %s| Quantity: %s| Price: %s (y/n) : ",
                productName, brand, quantity, price);
        if (InputData.choice()) {
            productService.addProduct(productName, brand, quantity, price);
        }
    }

    public static void editProduct() {
        System.out.print("Nhập STT Sản phẩm cần sửa: ");
        int index = InputData.getIndex(productService.productList);
        String productName = InputData.getName();
        String brand = InputData.getBrand();
        int quantity = InputData.getQuantity();
        int price = InputData.getPrice();

        System.out.printf("Bạn muốn tạo sửa thông tin sản phẩm này? ProductName: %s| Brand: %s| Quantity: %s| Price: %s (y/n) : ",
                productName, brand, quantity, price);
        if (InputData.choice()) {
            productService.editProduct(index, productName, brand, quantity, price);
        }
    }

    public static void deleteProduct() {
        System.out.print("Nhập STT Tài khoản muốn xóa: ");
        productsList = productService.productList;
        int index = InputData.getIndex(productsList);

        String productName = productsList.get(index - 1).getProductName();
        System.out.printf("Bạn muốn xóa Product: %s? (y/n)%n", productName);
        if (InputData.choice()) {
            productService.deleteProduct(index);
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

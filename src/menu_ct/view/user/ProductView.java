package menu_ct.view.user;

import menu_ct.input.InputData;
import menu_ct.model.Product;
import menu_ct.services.ProductService;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductView {
    static ProductService productService = new ProductService();
    static ArrayList<Product> productsList;

    public static void products(int role) {
        if (role == 0) {
            Scanner scanner = new Scanner(System.in);
            int choice;
            do {
                productService.getProductList();
                ClearScreen.clearScreen();
                showProduct();
                System.out.println("⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃");
                System.out.printf("⚃\t\t%-40s⚃%n", "--Menu quản lý Sản phẩm--");
                System.out.printf("⚃\t\t%-40s⚃%n", "Chọn trong các mục");
                System.out.printf("⚃\t\t%-40s⚃%n", "Nhấn 1: Thêm Sản phẩm");
                System.out.printf("⚃\t\t%-40s⚃%n", "Nhấn 2: Sửa  Sản phẩm");
                System.out.printf("⚃\t\t%-40s⚃%n", "Nhấn 3: Xóa  Sản phẩm");
                System.out.printf("⚃\t\t%-40s⚃%n", "Nhấn 0: Quay lại");
                System.out.println("⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃");
                System.out.print("Enter number: ");
                try {
                    choice = Integer.parseInt(scanner.nextLine());
                } catch (NumberFormatException e) {
                    choice = -1;
                }
                switch (choice) {
                    case 1:
                        ClearScreen.clearScreen(5);
                        addProduct();
                        break;
                    case 2:
                        ClearScreen.clearScreen(5);
                        editProduct();
                        break;
                    case 3:
                        ClearScreen.clearScreen(3);
                        deleteProduct();
                        break;
                    case 0:
                        ClearScreen.clearScreen();
                        break;
                    default:
                        System.out.println("Lỗi! Không nằm trong mục lục. Yêu cầu chọn lại:");
                }
            } while (choice != 0);
        } else System.out.println("Bạn bị giới hạn chức năng này!");
    }

        public static void showProduct() {
        productsList = productService.getProductList();
        System.out.println("╔═══════╦══════════════════════════════════════════════════════════════╦══════════════════════╦════════════╦══════════════════════╗");
        System.out.printf("║%-7s║ %-60s ║ %-20s ║ %-10s ║ %-20s ║%n", "  STT", "                      Product name", "       Brand", " Quantity", "    Price");
        System.out.println("╠═══════╬══════════════════════════════════════════════════════════════╬══════════════════════╬════════════╬══════════════════════╣");
        int i = 1;
        for (Product product : productsList) {
            System.out.printf("║\t%-4s║%s║%n", i, product.display());
            i++;
        }
        System.out.println("╚═══════╩══════════════════════════════════════════════════════════════╩══════════════════════╩════════════╩══════════════════════╝");
    }

    public static void addProduct() {
        String productName = InputData.getName();
        String brand = InputData.getBrand();
        int quantity = InputData.getQuantity();
        int price = InputData.getPrice();

        Product productInfo = new Product()
                .setProductName(productName)
                .setBrand(brand)
                .setQuantity(quantity)
                .setPrice(price);

        System.out.printf("Bạn muốn tạo mới Sản phầm này? ProductName: %s| Brand: %s| Quantity: %s| Price: %s (y/n) : ",
                productName, brand, quantity, price);
        if (InputData.choice()) {
            productService.addProduct(productInfo);
        }
    }

    public static void editProduct() {
        productsList = productService.productList;
        System.out.print("Nhập STT Sản phẩm cần sửa: ");
        int index = InputData.getIndex(productsList);
        long idProduct = productsList.get(index).getIdProduct();
        String productName = InputData.getName();
        String brand = InputData.getBrand();
        int quantity = InputData.getQuantity();
        int price = InputData.getPrice();
        Product productInfo = new Product()
                .setIdProduct(idProduct)
                .setProductName(productName)
                .setBrand(brand)
                .setQuantity(quantity)
                .setPrice(price);

        System.out.printf("Bạn muốn tạo sửa thông tin sản phẩm này? ProductName: %s| Brand: %s| Quantity: %s| Price: %s (y/n) : ",
                productName, brand, quantity, price);
        if (InputData.choice()) {
            productService.editProduct(index, productInfo);
        }
    }

    public static void deleteProduct() {
        System.out.print("Nhập STT Tài khoản muốn xóa: ");
        productsList = productService.productList;
        int index = InputData.getIndex(productsList);

        String productName = productsList.get(index).getProductName();
        System.out.printf("Bạn muốn xóa Product: %s? (y/n)%n", productName);
        if (InputData.choice()) {
            productService.deleteProduct(index);
        }
    }
}

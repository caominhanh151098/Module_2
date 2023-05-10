package menu_ct.view.user;

import menu_ct.input.InputData;
import menu_ct.model.Order;
import menu_ct.model.Product;
import menu_ct.services.OrderService;

import java.util.ArrayList;
import java.util.Scanner;

public class OrderView {
    public static OrderService orderService = new OrderService();
    public static ArrayList<Order> orderList = new ArrayList<>();

    public static void orders() {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            showOrder();
            System.out.println("⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃");
            System.out.printf("⚃\t\t%-40s⚃%n", "--Menu quản lý Đơn đặt hàng--");
            System.out.printf("⚃\t\t%-40s⚃%n", "Chọn trong các mục");
            System.out.printf("⚃\t\t%-40s⚃%n", "Nhấn 1: Xem chi tiết đơn hàng");
            System.out.printf("⚃\t\t%-40s⚃%n", "Nhấn 2: Xử lý đơn hàng");
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
                    viewDetail();
                    break;
                case 2:
                    ClearScreen.clearScreen(5);
                    processingOrder();
                    break;
                case 0:
                    ClearScreen.clearScreen();
                    break;
                default:
                    ClearScreen.clearScreen();
                    System.out.println("Lỗi! Không nằm trong mục lục. Yêu cầu chọn lại:");
            }
        } while (choice != 0);
    }

    public static void showOrder() {
        orderList = orderService.getOrderList();
        System.out.println("_____________________________________________________________________________________________________");
        int i = 1;
        for (Order order : orderList) {
            System.out.printf("|\t%-4s|%s|%n", i, order.display());
            i++;
        }
        System.out.println("_____________________________________________________________________________________________________");
    }

    public static void viewDetail() {
        System.out.print("Nhập STT Đơn hàng cần xem: ");
        int index = InputData.getIndex(orderService.orderList);
        OrderDetailView.orderDetail(index);
    }

    public static void processingOrder() {
        System.out.print("Nhập STT Đơn hàng cần xử lý: ");
        int index = InputData.getIndex(orderService.orderList);
//        orderService.viewOrderDetail(index);

    }
}

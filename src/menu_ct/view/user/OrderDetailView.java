package menu_ct.view.user;

import menu_ct.model.Order;
import menu_ct.model.OrderDetail;
import menu_ct.services.OrderDetailService;
import menu_ct.services.OrderService;

import java.util.ArrayList;
import java.util.Scanner;

public class OrderDetailView {
    public static OrderDetailService orderDetailService = new OrderDetailService();
    public static OrderService orderService = new OrderService();
    public static ArrayList<OrderDetail> orderDetailList = new ArrayList<>();
    public static Scanner scanner = new Scanner(System.in);

    public static void orderDetail(int index) {
        int choice;
        do {
            showDetail(index);
            System.out.println("⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃");
            System.out.printf("⚃\t\t%-40s⚃%n", "--Chi tiết đơn đặt hàng--");
            System.out.printf("⚃\t\t%-40s⚃%n", "Chọn trong các mục");
            System.out.printf("⚃\t\t%-40s⚃%n", "Nhấn 0: Quay lại");
            System.out.println("⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃");
            System.out.print("Enter number: ");
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                choice = -1;
            }
            switch (choice) {
                case 0:
                    ClearScreen.clearScreen();
                    break;
                default:
                    ClearScreen.clearScreen();
                    System.out.println("Lỗi! Không nằm trong mục lục. Yêu cầu chọn lại:");
            }
        } while (choice != 0);
    }

        public static void showDetail(int index) {
        ArrayList<Order> orderList = orderService.getOrderList();
        long idOrderDetail = orderList.get(index).getIdOrderDetail();
        orderDetailList = orderDetailService.getOrderDetailByID(idOrderDetail);
        System.out.println("╔═══════╦══════════════════════════════════════════════════════════════╦═════════════════╦═════════════════╗");
        System.out.printf("║ %-5s ║ %-60s ║ %-15s ║ %-15s ║%n", " STT", "                     Product Name", "    Quantity", "      Price");
        System.out.println("╠═══════╬══════════════════════════════════════════════════════════════╬═════════════════╬═════════════════╣");
        int i = 1;
        for (OrderDetail orderDetail : orderDetailList)
            System.out.printf("║\t%-4s║%s║%n", i++, orderDetail.display());
        System.out.println("╠═══════╩══════════════════════════════════════════════════════════════╩═════════════════╬═════════════════╣");
        System.out.printf("║ %85s  ║ %15s ║%n", "Total Price:  ", orderDetailService.totalPrice);
        System.out.println("╚════════════════════════════════════════════════════════════════════════════════════════╩═════════════════╝");
    }
}

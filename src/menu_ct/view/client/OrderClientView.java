package menu_ct.view.client;

import menu_ct.input.InputData;
import menu_ct.model.Account;
import menu_ct.model.Order;
import menu_ct.model.OrderDetail;
import menu_ct.services.OrderDetailService;
import menu_ct.services.OrderService;
import menu_ct.services.UserService;
import menu_ct.view.user.ClearScreen;

import java.util.ArrayList;
import java.util.Scanner;

public class OrderClientView {
    public static Scanner scanner = new Scanner(System.in);
    public static Account mUser;
    public static UserService userService = new UserService();
    public static OrderService orderService = new OrderService();
    public static OrderDetailService orderDetailService = new OrderDetailService();
    public static ArrayList<Order> myOrder = new ArrayList<>();


    public static void orderView(long idUser) {
        mUser = userService.findUserByID(idUser);
        myOrder = orderService.findOrderById(idUser);
        int choice;
        if (myOrder.isEmpty()) {
            System.out.println("Bạn không có đơn đặt hàng nào!");
            ClearScreen.clearScreen(3);
            System.out.println("⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃");
            System.out.printf("⚃\t\t%-40s⚃%n", "Chọn trong các mục");
            System.out.printf("⚃\t\t%-40s⚃%n", "Nhấn 0: Quay lại");
            System.out.println("⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃");
            do {
                System.out.print("Enter number: ");
                try {
                    choice = Integer.parseInt(scanner.nextLine());
                } catch (NumberFormatException e) {
                    choice = -1;
                }
                switch (choice) {
                    case 0:
                        break;
                    default:
                        System.out.println("Error! Không nằm trong mục lục. Yêu cầu chọn lại:");
                }
            }
            while (choice != 0);
        } else {
            do {
                int i = 1;
                System.out.println("❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖");
                for (Order order : myOrder)
                    System.out.printf("❖\t%-4s❖%-20s❖%-20s❖%-10s❖%n", i++, order.getIdOrderDetail(), order.getOrderDate(), order.getStatus());
                System.out.println("❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖");

                ClearScreen.clearScreen(3);
                System.out.println("⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃");
                System.out.printf("⚃\t\t%-40s⚃%n", "Chọn trong các mục");
                System.out.printf("⚃\t\t%-40s⚃%n", "Nhấn 1: Xem chi tiết");
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
                        viewDetail();
                        break;
                    case 0:
                        break;
                    default:
                        System.out.println("Error! Không nằm trong mục lục. Yêu cầu chọn lại:");
                }
            }
            while (choice != 0);
        }
    }

    public static void viewDetail() {
        System.out.print("Nhập STT Đơn hàng cần xem: ");
        int index = InputData.getIndex(myOrder);

        long idOrderDetail = myOrder.get(index - 1).getIdOrderDetail();
        ArrayList<OrderDetail> orderDetailList = orderDetailService.getOrderDetailByID(idOrderDetail);
        System.out.println("___________________________________________________________________________________________________");
        int i = 1;
        for (OrderDetail orderDetail : orderDetailList)
            System.out.printf("|\t%-4s|%s|%n", i++, orderDetail.display());
        System.out.printf("|\t%-65s| %15s| %15s|%n", "", "Total Price: ", orderDetailService.totalPrice);
        System.out.println("___________________________________________________________________________________________________");
    }
}



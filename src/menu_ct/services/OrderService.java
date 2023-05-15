package menu_ct.services;

import menu_ct.input.CovertDate;
import menu_ct.model.Cart;
import menu_ct.model.CartDetail;
import menu_ct.model.Order;
import menu_ct.output.WriteFile;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Date;

public class OrderService {
    public static OrderDetailService orderDetailService = new OrderDetailService();
    public static CartService cartService = new CartService();
    public static String path = "data\\order.csv";
    public static ArrayList<Order> orderList = new ArrayList<>();

    public ArrayList<Order> getOrderList() {
        orderList.clear();

        try {
            BufferedReader reader = new BufferedReader(new FileReader(path));
            String line = reader.readLine();
            while (line != null) {
                String[] order = line.split(",");
                long idOrder = Long.parseLong(order[0]);
                long idUser = Long.parseLong(order[1]);
                long idOrderDetail = Long.parseLong(order[2]);
                String status = order[3];
                Order orderInfo = new Order()
                        .setIdOrder(idOrder)
                        .setIdUser(idUser)
                        .setOrderDate(new Date(idOrder))
                        .setIdOrderDetail(idOrderDetail)
                        .setStatus(status);
                orderList.add(orderInfo);
                line = reader.readLine();
            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error! Không thấy file data!");
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
        return orderList;
    }

    public ArrayList<Order> findOrderById(long id) {
        getOrderList();
        ArrayList<Order> myOrder = new ArrayList<>();
        for (Order order : orderList) {
            if (order.getIdUser() == id) {
                myOrder.add(order);
            }
        }
        return myOrder;
    }

    public void newOrderForUser(long idUser) {
        getOrderList();
        Cart cart = cartService.getCartListByID(idUser);
        ArrayList<CartDetail> cartDetailList = cart.getDetailList();
        long idOrderDetail = orderDetailService.newOrderDetail(cartDetailList);

        Order newOrder = new Order()
                .setIdUser(idUser)
                .setIdOrderDetail(idOrderDetail);
        orderList.add(newOrder);
        WriteFile.editData(orderList, path);
    }

    public void finishOrder(int index) {
        getOrderList();
        Order order = orderList.get(index - 1);
        order.setStatus("Hoàn thành");
        WriteFile.editData(orderList, path);
    }
}

package menu_ct.services;

import menu_ct.model.Order;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class OrderService implements Convert {
    public static ArrayList<Order> orderList = new ArrayList<>();
    public static OrderDetailService orderDetailService = new OrderDetailService();
    public static String path = "data\\order.csv";

    public ArrayList<Order> getOrderList() {
        orderList.clear();

        try {
            BufferedReader reader = new BufferedReader(new FileReader(path));
            String line = reader.readLine();
            while (line != null) {
                String[] order = line.split(",");
                long idOrder = Long.parseLong(order[0]);
                long idUser = Long.parseLong(order[1]);
                Date orderDate = covertDate(order[2]);
                long idOrderDetail = Long.parseLong(order[3]);
                String status = order[4];
                Order orderInfo = new Order(idOrder, idUser, orderDate, idOrderDetail, status);
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

    @Override
    public Date covertDate(String textDate) throws ParseException {
        return new SimpleDateFormat("dd-MM-yyyy").parse(textDate);
    }
}

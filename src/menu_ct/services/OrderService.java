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


    public void getOrderList() {
        orderList = new ArrayList<>();
        String url = "data\\order.txt";

        try {
            BufferedReader reader = new BufferedReader(new FileReader(url));
            String line = reader.readLine();
            while (line != null) {
                String[] order = line.split("/");
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
    }

    public void showOrder() {
        getOrderList();
        System.out.println("_____________________________________________________________________________________________________");
        int i = 1;
        for (Order order : orderList) {
            System.out.printf("|\t%-4s|%s|%n", i, order.display());
            i++;
        }
        System.out.println("_____________________________________________________________________________________________________");
    }

    public void viewOrderDetail(int index) {
        orderDetailService.showOrderDetal(orderList.get(index - 1).getIdOrderDetail());
    }

    @Override
    public Date covertDate(String textDate) throws ParseException {
        return new SimpleDateFormat("dd-MM-yyyy").parse(textDate);
    }
}

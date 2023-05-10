package menu_ct.services;

import menu_ct.model.OrderDetail;
import menu_ct.model.Product;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

public class OrderDetailService {
    public static ProductService productService = new ProductService();
    public static ArrayList<OrderDetail> orderDetailList = new ArrayList<>();
    public static int totalPrice = 0;
    public static String path = "data\\orderdetail.csv";

    public ArrayList<OrderDetail> getOrderDetailByID(long idOrderDetail) {
        OrderDetail orderDetail = new OrderDetail();
        productService.getProductList();
        ArrayList<Product> productList = productService.productList;
        orderDetailList = new ArrayList<>();


        try {
            BufferedReader reader = new BufferedReader(new FileReader(path));
            String line = reader.readLine();
            while (line != null) {
                String[] order = line.split(",");
                if (idOrderDetail == Long.parseLong(order[0])) {
                    for (Product product : productList) {
                        if (product.getIdProduct() == Long.parseLong(order[1])) {
                            String productName = product.getProductName();
                            int ordered_quantity = Integer.parseInt(order[2]);
                            int orderPrice = Integer.parseInt(order[3]);
                            orderDetail = new OrderDetail(idOrderDetail, productName, ordered_quantity, orderPrice);
                            totalPrice += orderPrice * ordered_quantity;
                        }
                    }
                    orderDetailList.add(orderDetail);
                }
                line = reader.readLine();
            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error! Không thấy file data!");
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
        return orderDetailList;
    }
}

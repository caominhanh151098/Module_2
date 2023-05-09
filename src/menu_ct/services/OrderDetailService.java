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

    public void getOrderDetail(long idOrderDetail) {
        OrderDetail orderDetail = new OrderDetail();
        productService.getProductList();
        ArrayList<Product> productList = productService.productList;
        orderDetailList = new ArrayList<>();
        String url = "data\\orderdetail.txt";

        try {
            BufferedReader reader = new BufferedReader(new FileReader(url));
            String line = reader.readLine();
            while (line != null) {
                String[] order = line.split("/");
                if (idOrderDetail == Long.parseLong(order[0])) {
                    for (Product product : productList) {
                        if (product.getIdProduct() == Long.parseLong(order[1])) {
                            String productName = product.getProductName();
                            int ordered_quantity = Integer.parseInt(order[2]);
                            int orderPrice = Integer.parseInt(order[3]);
                            orderDetail = new OrderDetail(idOrderDetail, productName, ordered_quantity, orderPrice);
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
    }

    public void showOrderDetal(long idOrderDetail) {
        getOrderDetail(idOrderDetail);
        System.out.println("_____________________________________________________________________________________________________");
        int i = 1;
        for (OrderDetail orderDetail : orderDetailList) {
            System.out.printf("|\t%-4s|%s|%n", i, orderDetail.display());
            i++;
        }
        System.out.println("_____________________________________________________________________________________________________");
    }
}

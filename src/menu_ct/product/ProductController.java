package menu_ct.product;

import menu_ct.user.User;

import java.io.*;
import java.util.ArrayList;

public class ProductController {
    public static Product productInfo = new Product();

    public static ArrayList<Product> productList = new ArrayList<>();

    public void getProductList() throws IOException {
        productList = new ArrayList<>();
        String url = "D:\\Zero\\CodeGym\\Module_2\\src\\menu_ct\\data\\product.txt";

        BufferedReader reader = new BufferedReader(new FileReader(url));

        String line = reader.readLine();
        while (line != null) {
            String[] product = line.split("/");
            long idProduct = Long.parseLong(product[0]);
            String productName = product[1];
            String brand = product[2];
            int quantity = Integer.parseInt(product[3]);
            int price = Integer.parseInt(product[4]);
            productInfo = new Product(idProduct, productName, brand, quantity, price);
            productList.add(productInfo);
            line = reader.readLine();
        }
        reader.close();
    }

    public void productView() throws IOException {
        getProductList();
        System.out.println("_____________________________________________________________________________________________________");
        int i = 1;
        for (Product product : productList) {
            System.out.printf("|\t%-4s|%s|%n", i, product.display());
            i++;
        }
    }

    public void addProduct(String productName, String brand, int quantity, int price) throws IOException {
        getProductList();
        productInfo = new Product(productName, brand, quantity, price);
        productList.add(productInfo);
        editData();
    }

    public void editProduct(int index, String nName, String nBrand, int nQuantity, int nPrice) throws IOException {
        getProductList();
        String[] user = productList.get(index - 1).toString().split("/");
        long idProduct = Long.parseLong(user[0]);
        String productName = nName;
        String brand = nBrand;
        int quantity = nQuantity;
        int price = nPrice;
        productInfo = new Product(productName, brand, quantity, price);
        productList.set(index - 1, productInfo);
        editData();
        productView();
    }

    public void deleteUser(int index) throws IOException {
        getProductList();
        productList.remove(index - 1);
        editData();
        productView();
    }

    public void editData() throws IOException {
        String url = "D:\\Zero\\CodeGym\\Module_2\\src\\menu_ct\\data\\product.txt";

        BufferedWriter writer = new BufferedWriter(new FileWriter(url));
        int i = 0;
        while (i < productList.size()) {
            writer.write(productList.get(i).toString());
            writer.newLine();
            i++;
        }
        writer.close();
    }
}

package menu_ct.services;

import menu_ct.model.Product;

import java.io.*;
import java.util.ArrayList;

public class ProductService {
    public static Product productInfo = new Product();

    public static ArrayList<Product> productList = new ArrayList<>();

    public void getProductList() {
        productList = new ArrayList<>();
        String url = "D:\\Zero\\CodeGym\\Module_2\\src\\menu_ct\\data\\product.txt";

        try {
            BufferedReader reader = new BufferedReader(new FileReader(url));
            String line = reader.readLine();
            while (line != null) {
                String[] product = line.split("/");
                long idProduct = Long.parseLong(product[0]);
                String productName = product[1];
                String brand = product[2];
                int quantity = Integer.parseInt(product[3]);
                int price = Integer.parseInt(product[4]);
                productInfo = new Product()
                        .setIdProduct(idProduct)
                        .setProductName(productName)
                        .setBrand(brand)
                        .setQuantity(quantity)
                        .setPrice(price);
                productList.add(productInfo);
                line = reader.readLine();
            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error! Không thấy file data!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void showProduct() {
        getProductList();
        System.out.println("_____________________________________________________________________________________________________");
        int i = 1;
        for (Product product : productList) {
            System.out.printf("|\t%-4s|%s|%n", i, product.display());
            i++;
        }
        System.out.println("_____________________________________________________________________________________________________");
    }

    public void addProduct(String productName, String brand, int quantity, int price) {
        getProductList();
        productInfo = new Product(productName, brand, quantity, price);
        productList.add(productInfo);
        editData();
    }

    public void editProduct(int index, String nName, String nBrand, int nQuantity, int nPrice) {
        getProductList();
        String[] product = productList.get(index - 1).toString().split("/");
        long idProduct = Long.parseLong(product[0]);
        String productName = nName;
        String brand = nBrand;
        int quantity = nQuantity;
        int price = nPrice;
        productInfo = new Product(idProduct, productName, brand, quantity, price);
        productList.set(index - 1, productInfo);
        editData();
    }

    public void deleteProduct(int index) {
        getProductList();
        productList.remove(index - 1);
        editData();
    }

    public void editData() {
        String url = "D:\\Zero\\CodeGym\\Module_2\\src\\menu_ct\\data\\product.txt";

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(url));
            int i = 0;
            while (i < productList.size()) {
                writer.write(productList.get(i).toString());
                writer.newLine();
                i++;
            }
            writer.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error! Không thấy file data!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}

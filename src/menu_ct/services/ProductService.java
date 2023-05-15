package menu_ct.services;

import menu_ct.model.Cart;
import menu_ct.model.CartDetail;
import menu_ct.model.Product;
import menu_ct.output.WriteFile;

import java.io.*;
import java.util.ArrayList;

public class ProductService {
    public static ArrayList<Product> productList = new ArrayList<>();
    static String path = "data\\product.csv";

    public ArrayList<Product> getProductList() {
        productList.clear();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(path));
            String line = reader.readLine();
            while (line != null) {
                String[] product = line.split(",");
                long idProduct = Long.parseLong(product[0]);
                String productName = product[1];
                String brand = product[2];
                int quantity = Integer.parseInt(product[3]);
                int price = Integer.parseInt(product[4]);
                Product productInfo = new Product()
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
        return productList;
    }

    public void addProduct(Product newProduct) {
        getProductList();
        productList.add(newProduct);
        WriteFile.editData(productList, path);
    }

    public void editProduct(int index, Product editProduct) {
        getProductList();
        productList.set(index - 1, editProduct);
        WriteFile.editData(productList, path);
    }

    public void deleteProduct(int index) {
        getProductList();
        productList.remove(index - 1);
        WriteFile.editData(productList, path);
    }

    public void buyProduct(long idProduct, int buyQuantity) {
        getProductList();
        for (Product product : productList)
            if (product.getIdProduct() == idProduct) {
                product.setQuantity(product.getQuantity() - buyQuantity);
                break;
            }
        WriteFile.editData(productList, path);
    }

    public boolean checkQuantityProduct(CartDetail cartDetail) {
        getProductList();
        for (Product product : productList)
            if (product.getIdProduct() == cartDetail.getIdProduct()) {
                if (product.getQuantity() < cartDetail.getBuy_quantity())
                    return false;
            }
        return true;
    }
}

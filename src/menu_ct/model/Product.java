package menu_ct.model;

public class Product {
    private long idProduct = System.currentTimeMillis();
    private String productName;
    private String brand;
    private int quantity = 0;
    private int price = 0;

    public Product() {
    }

    public Product(String productName, String brand, int quantity, int price) {
        this.productName = productName;
        this.brand = brand;
        this.quantity = quantity;
        this.price = price;
    }

    public Product(long idProduct, String productName, String brand, int quantity, int price) {
        this.idProduct = idProduct;
        this.productName = productName;
        this.brand = brand;
        this.quantity = quantity;
        this.price = price;
    }

    public long getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(long idProduct) {
        this.idProduct = idProduct;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String toString() {
        return String.format("%s/%s/%s/%s/%s", getIdProduct(), getProductName(), getBrand(), getQuantity(), getPrice());
    }

    public String display() {
        return String.format("\t%-60s|\t%-20s|%5s|%15s", getProductName(), getBrand(), getQuantity(), getPrice());
    }
}

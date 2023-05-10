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

    public Product setIdProduct(long idProduct) {
        this.idProduct = idProduct;
        return this;
    }

    public String getProductName() {
        return productName;
    }

    public Product setProductName(String productName) {
        this.productName = productName;
        return this;
    }

    public String getBrand() {
        return brand;
    }

    public Product setBrand(String brand) {
        this.brand = brand;
        return this;
    }

    public int getQuantity() {
        return quantity;
    }

    public Product setQuantity(int quantity) {
        this.quantity = quantity;
        return this;
    }

    public int getPrice() {
        return price;
    }

    public Product setPrice(int price) {
        this.price = price;
        return this;
    }

    public String toString() {
        return String.format("%s,%s,%s,%s,%s", getIdProduct(), getProductName(), getBrand(), getQuantity(), getPrice());
    }

    public String display() {
        return String.format("\t%-60s|\t%-20s|%5s|%15s", getProductName(), getBrand(), getQuantity(), getPrice());
    }
}

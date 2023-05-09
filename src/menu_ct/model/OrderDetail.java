package menu_ct.model;

public class OrderDetail {
    private long idOrderDetail = System.currentTimeMillis();
    private long idProduct;
    private String productName;
    private int ordered_quantity;
    private int orderPrice;

    public OrderDetail() {
    }

    public OrderDetail(long idOrderDetail, String productName, int ordered_quantity, int orderPrice) {
        this.idOrderDetail = idOrderDetail;
        this.productName = productName;
        this.ordered_quantity = ordered_quantity;
        this.orderPrice = orderPrice;
    }

    public long getIdOrderDetail() {
        return idOrderDetail;
    }

    public void setIdOrderDetail(long idOrderDetail) {
        this.idOrderDetail = idOrderDetail;
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

    public int getOrdered_quantity() {
        return ordered_quantity;
    }

    public void setOrdered_quantity(int ordered_quantity) {
        this.ordered_quantity = ordered_quantity;
    }

    public int getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(int orderPrice) {
        this.orderPrice = orderPrice;
    }

    public String display() {
        return String.format("%15s| %-60s| %5s| %20s", getIdOrderDetail(), getProductName(), getOrdered_quantity(), getOrderPrice());
    }
}

package menu_ct.model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Order {
    private long idOrder = System.currentTimeMillis();
    private long idUser;
    private Date orderDate;
    private long idOrderDetail;
    private String status;

    public Order() {
    }

    public Order(long idOrder, long idUser, Date orderDate, long idOrderDetail, String status) {
        this.idOrder = idOrder;
        this.idUser = idUser;
        this.orderDate = orderDate;
        this.idOrderDetail = idOrderDetail;
        this.status = status;
    }

    public long getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(long idOrder) {
        this.idOrder = idOrder;
    }

    public long getIdUser() {
        return idUser;
    }

    public void setIdUser(long idUser) {
        this.idUser = idUser;
    }

    public String getOrderDate() {
        return new SimpleDateFormat("dd-MM-yyyy").format(orderDate);
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public long getIdOrderDetail() {
        return idOrderDetail;
    }

    public void setIdOrderDetail(long idOrderDetail) {
        this.idOrderDetail = idOrderDetail;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String display() {
        return String.format("%15s|%15s|%-10s|%15s|%15s", getIdOrder(), getIdUser(), getOrderDate(), getIdOrderDetail(), getStatus());
    }
}

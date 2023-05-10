//package menu_ct.model;
//
//import menu_ct.services.CustomerService;
//
//import java.text.SimpleDateFormat;
//import java.util.ArrayList;
//import java.util.Date;
//
//public class Customer extends Account {
//    private Date dob;
//    private String address;
//    private String email;
//    private String numPhone;
//    private ArrayList<Order> orderList;
//
//    public Customer() {
//    }
//
//    public Customer setId(long id) {
//        super.setId(id);
//        return this;
//    }
//
//    public Customer setUsername(String username) {
//        super.setUsername(username);
//        return this;
//    }
//
//    public Customer setPassword(String password) {
//        super.setPassword(password);
//        return this;
//    }
//
//    public Customer setRote(int rote) {
//        super.setRote(rote);
//        return this;
//    }
//
//    public Customer setName(String name) {
//        super.setName(name);
//        return this;
//    }
//
//    public String getDob() {
//        return new SimpleDateFormat("dd-MM-yyyy").format(dob);
//    }
//
//    public Customer setDob(Date dob) {
//        this.dob = dob;
//        return this;
//    }
//
//    public String getAddress() {
//        return address;
//    }
//
//    public Customer setAddress(String address) {
//        this.address = address;
//        return this;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public Customer setEmail(String email) {
//        this.email = email;
//        return this;
//    }
//
//    public String getNumPhone() {
//        return numPhone;
//    }
//
//    public Customer setNumPhone(String numPhone) {
//        this.numPhone = numPhone;
//        return this;
//    }
//
//    public ArrayList<Order> getOrderList() {
//        CustomerService customerService = new CustomerService();
//        return customerService.getOrderListByID(this.getId());
//    }
//
//    public void showProfile() {
//        System.out.println("❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖");
//        System.out.printf("❖\t\t%30s%-61s❖%n", "", "--Thông tin cá nhân--");
//        System.out.printf("❖\t\t%-15s%-30s|%-15s%-30s❖%n", "Username:", this.getUsername(), "Name:", this.getName());
//        System.out.printf("❖\t\t%-15s%-30s|%-15s%-30s❖%n", "Date of birth:", this.getDob(), "Address:", this.getAddress());
//        System.out.printf("❖\t\t%-15s%-30s|%-15s%-30s❖%n", "Email:", this.getEmail(), "Phone Number:", this.getNumPhone());
//        System.out.println("❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖");
//    }
//}

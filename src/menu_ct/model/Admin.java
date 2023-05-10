//package menu_ct.model;
//
//import java.text.SimpleDateFormat;
//import java.util.Date;
//
//public class Admin {
//    private Date dob;
//    private String address = "";
//    private String email = "";
//    private String numPhone = "";
//
//    public Admin() {
//    }
//
//    public Admin setId(long id) {
//        super.setId(id);
//        return this;
//    }
//
//    public Admin setUsername(String username) {
//        super.setUsername(username);
//        return this;
//    }
//
//    public Admin setPassword(String password) {
//        super.setPassword(password);
//        return this;
//    }
//
//    public Admin setRote(int rote) {
//        super.setRote(rote);
//        return this;
//    }
//
//    public Admin setName(String name) {
//        super.setName(name);
//        return this;
//    }
//
//    public String getDob() {
//        return new SimpleDateFormat("dd-MM-yyyy").format(dob);
//    }
//
//    public Admin setDob(Date dob) {
//        this.dob = dob;
//        return this;
//    }
//
//    public String getAddress() {
//        return address;
//    }
//
//    public Admin setAddress(String address) {
//        this.address = address;
//        return this;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public Admin setEmail(String email) {
//        this.email = email;
//        return this;
//    }
//
//    public String getNumPhone() {
//        return numPhone;
//    }
//
//    public Admin setNumPhone(String numPhone) {
//        this.numPhone = numPhone;
//        return this;
//    }
//
//    @Override
//    public String toString() {
//        return String.format("%s/%s/%s/%s/%s", super.toString(), getDob(), getAddress(), getEmail(), getNumPhone());
//    }
//
//    @Override
//    public String display() {
//        return String.format("%s| %-15s| %-20s| %-25s| %-12s", super.display(), getDob(), getAddress(), getEmail(), getNumPhone());
//    }
//    public void showProfile() {
//        System.out.println("❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖");
//        System.out.printf("❖\t\t%30s%-61s❖%n", "", "--Thông tin cá nhân--");
//        System.out.printf("❖\t\t%-15s%-30s|%-15s%-30s❖%n", "Username:", this.getUsername(), "Name:", this.getName());
//        System.out.printf("❖\t\t%-15s%-30s|%-15s%-30s❖%n", "Date of birth:", this.getDob(), "Address:", this.getAddress());
//        System.out.printf("❖\t\t%-15s%-30s|%-15s%-30s❖%n", "Email:", this.getEmail(), "Phone Number:", this.getNumPhone());
//        System.out.println("❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖");
//    }
//
//}

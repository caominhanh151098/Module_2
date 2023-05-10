package menu_ct.model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Account {
    private long id = System.currentTimeMillis();
    private String username;
    private String password;
    private String name;
    private int rote = 2;
    private Date dob;
    private String address;
    private String email;
    private String numPhone;

    public Account() {
    }

    public long getId() {
        return id;
    }

    public Account setId(long id) {
        this.id = id;
        return this;
    }

    public String getUsername() {
        return username;
    }

    public Account setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public Account setPassword(String password) {
        this.password = password;
        return this;
    }

    public int getRote() {
        return rote;
    }

    public Account setRote(int rote) {
        this.rote = rote;
        return this;
    }

    public String getName() {
        return name;
    }

    public Account setName(String name) {
        this.name = name;
        return this;
    }

    public String getDob() {
        return new SimpleDateFormat("dd-MM-yyyy").format(dob);
    }

    public Account setDob(Date dob) {
        this.dob = dob;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public Account setAddress(String address) {
        this.address = address;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public Account setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getNumPhone() {
        return numPhone;
    }

    public Account setNumPhone(String numPhone) {
        this.numPhone = numPhone;
        return this;
    }

    public String toString() {
        return String.format("%s,%s,%s,%s,%s,%s,%s,%s,%s", getId(), getUsername(), getPassword(), getName(), getRote(), getDob(), getAddress(), getEmail(), getNumPhone());
    }

    public String display() {
        return String.format(" %-20s| %-20s| %-4s| %-15s| %-20s| %-25s| %-12s",
                getUsername(), getName(), getRote(), getDob(), getAddress(), getEmail(), getNumPhone());
    }

    public String info() {
        return String.format("Username: %-15s|Name: %-15s|Role: %-4s", getUsername(), getName(), getRote());
    }

    public void showProfile() {
        System.out.println("❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖");
        System.out.printf("❖\t\t%30s%-60s❖%n", "", "--Thông tin cá nhân--");
        System.out.println("❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖");
        System.out.printf("❖\t\t%-15s%-30s%-15s%-30s❖%n", "Username:", this.getUsername(), "Name:", this.getName());
        System.out.printf("❖\t\t%-15s%-30s%-15s%-30s❖%n", "Date of birth:", this.getDob(), "Address:", this.getAddress());
        System.out.printf("❖\t\t%-15s%-30s%-15s%-30s❖%n", "Email:", this.getEmail(), "Phone Number:", this.getNumPhone());
        System.out.println("❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖");
    }
}

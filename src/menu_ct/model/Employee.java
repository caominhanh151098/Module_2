package menu_ct.model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Employee extends User {
    private Date dob;
    private String address;
    private String email;
    private long numPhone;

    public Employee() {
    }

    public String getDob() {
        return new SimpleDateFormat("dd/MM/yyyy").format(dob);
    }

    public Employee setDob(Date dob) {
        this.dob = dob;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public Employee setAddress(String address) {
        this.address = address;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public Employee setEmail(String email) {
        this.email = email;
        return this;
    }

    public long getNumPhone() {
        return numPhone;
    }

    public Employee setNumPhone(long numPhone) {
        this.numPhone = numPhone;
        return this;
    }

    public String toString() {
        return String.format("%s|\t%-15s|\t%-30s|\t%-30s|\t%-15s", super.toString(), getDob(), getAddress(), getEmail(), getNumPhone());
    }

    public String display() {
        return String.format("%s| %-15s| %-20s| %-25s| %-12s", super.display(), getDob(), getAddress(), getEmail(), getNumPhone());
    }

}

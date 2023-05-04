package menu_ct.model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Employee extends User {
    private Date dob;
    private String address;
    private String email;
    private String numPhone;

    public Employee() {
    }

    public String getDob() {
        return new SimpleDateFormat("dd-MM-yyyy").format(dob);
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

    public String getNumPhone() {
        return numPhone;
    }

    public Employee setNumPhone(String numPhone) {
        this.numPhone = numPhone;
        return this;
    }
    @Override
    public String toString() {
        return String.format("%s/%s/%s/%s/%s", super.toString(), getDob(), getAddress(), getEmail(), getNumPhone());
    }
    @Override
    public String display() {
        return String.format("%s| %-15s| %-20s| %-25s| %-12s", super.display(), getDob(), getAddress(), getEmail(), getNumPhone());
    }

}

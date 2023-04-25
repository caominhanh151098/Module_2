package menu_ct.user;

import java.util.Date;

public class Person extends User {
    private Date dob;
    private String address;
    private String email;
    private long numPhone;

    public Person() {
    }

    public Date getDob() {
        return dob;
    }

    public Person setDob(Date dob) {
        this.dob = dob;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public Person setAddress(String address) {
        this.address = address;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public Person setEmail(String email) {
        this.email = email;
        return this;
    }

    public long getNumPhone() {
        return numPhone;
    }

    public Person setNumPhone(long numPhone) {
        this.numPhone = numPhone;
        return this;
    }

    public String toString() {
        return String.format("%s|\t%-15s|\t%-30s|\t%-30s|\t%-15s", super.toString(), getDob(), getAddress(), getEmail(), getNumPhone());
    }

    public String display() {
        return String.format(" %s| %-20s| %-20s| %-4s", super.display(), getUsername(), getName(), getRote());
    }

}

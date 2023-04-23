package menu_ct.user;

import java.util.Date;

public class Person extends User {
    private int age;
    private Date dob;
    private String address;
    private String email;
    private long numPhone;

    public Person() {
    }

    public Person(long id, String username, String password, int rote, String name, int age, Date dob, String address, String email, long numPhone) {
        super(id, username, password, name, rote);
        this.age = age;
        this.dob = dob;
        this.address = address;
        this.email = email;
        this.numPhone = numPhone;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getNumPhone() {
        return numPhone;
    }

    public void setNumPhone(long numPhone) {
        this.numPhone = numPhone;
    }

    public String toString() {
        return String.format("%s|\t%-20s|\t%-20s|\t%-20s|\t%-20s|\t%-20s", super.toString(), getName(), getAge(), getDob(), getAddress(), getEmail(), getNumPhone());
    }
}

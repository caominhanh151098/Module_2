package menu_ct.user;

import java.util.Date;

public class Staff extends Person{
    private int timekeeping = 0;
    private double dailySalary;

    public Staff() {
    }

    public Staff setId(long id) {
        super.setId(id);
        return this;
    }
    public Staff setUsername(String username) {
        super.setUsername(username);
        return this;
    }

    public Staff setPassword(String password) {
        super.setPassword(password);
        return this;
    }

    public Staff setRote(int rote) {
        super.setRote(rote);
        return this;
    }

    public Staff setName(String name) {
        super.setName(name);
        return this;
    }

    public Staff setDob(Date dob) {
        super.setDob(dob);
        return this;
    }

    public Staff setAddress(String address) {
        super.setAddress(address);
        return this;
    }

    public Staff setEmail(String email) {
        super.setEmail(email);
        return this;
    }

    public Staff setNumPhone(long numPhone) {
        super.setNumPhone(numPhone);
        return this;
    }

    public int getTimekeeping() {
        return timekeeping;
    }

    public Staff setTimekeeping(int timekeeping) {
        this.timekeeping = timekeeping;
        return this;
    }
    public void timekeeping() {
        this.timekeeping ++;
    }

    public double getDailySalary() {
        return dailySalary;
    }

    public Staff setDailySalary(double dailySalary) {
        this.dailySalary = dailySalary;
        return this;
    }

    public double getPaid() {
        return getDailySalary() * getTimekeeping();
    }

    public String display() {
        return String.format(" %s| %-4s| %-10s", super.display(), getTimekeeping(), getDailySalary());
    }
}

package menu_ct.user;

import java.util.Date;

public class Staff extends Person{
    private int timekeeping = 0;
    private double dailySalary;

    public Staff() {
    }

    public Staff(long id, String username, String password, int rote, String name, int age,
                 Date dob, String address, String email, long numPhone, int timekeeping, double dailySalary) {
        super(id, username, password, rote, name, age, dob, address, email, numPhone);
        this.timekeeping = timekeeping;
        this.dailySalary = dailySalary;
    }

    public int getTimekeeping() {
        return timekeeping;
    }

    public void setTimekeeping(int timekeeping) {
        this.timekeeping = timekeeping;
    }
    public void timekeeping() {
        this.timekeeping ++;
    }

    public double getDailySalary() {
        return dailySalary;
    }

    public void setDailySalary(double dailySalary) {
        this.dailySalary = dailySalary;
    }

    public double getPaid() {
        return getDailySalary() * getTimekeeping();
    }
}

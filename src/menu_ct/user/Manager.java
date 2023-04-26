package menu_ct.user;

import java.util.Date;

public class Manager extends Employee {
    private final double BASIC_SALARY = 1390000;
    private double coefficients_salary = 6.2;

    public Manager() {
    }

    public Manager setId(long id) {
        super.setId(id);
        return this;
    }

    public Manager setUsername(String username) {
        super.setUsername(username);
        return this;
    }

    public Manager setPassword(String password) {
        super.setPassword(password);
        return this;
    }

    public Manager setRote(int rote) {
        super.setRote(rote);
        return this;
    }

    public Manager setName(String name) {
        super.setName(name);
        return this;
    }

    public Manager setDob(Date dob) {
        super.setDob(dob);
        return this;
    }

    public Manager setAddress(String address) {
        super.setAddress(address);
        return this;
    }

    public Manager setEmail(String email) {
        super.setEmail(email);
        return this;
    }

    public Manager setNumPhone(long numPhone) {
        super.setNumPhone(numPhone);
        return this;
    }

    public double getBASIC_SALARY() {
        return BASIC_SALARY;
    }

    public double getCoefficients_salary() {
        return coefficients_salary;
    }

    public Manager setCoefficients_salary(double coefficients_salary) {
        this.coefficients_salary = coefficients_salary;
        return this;
    }

    public double salaryReceive() {
        return coefficients_salary * BASIC_SALARY;
    }

    public String display() {
        return String.format("%s| %-4s| %-10s", super.display(),"", getCoefficients_salary());
    }
}

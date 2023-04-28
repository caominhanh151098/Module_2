package menu_ct.model;

import menu_ct.model.User;

import java.util.Date;

public class Customer extends User {
    private long idCard;
    private Date dob;
    private String address;
    private String email;
    private long numPhone;

    public Customer() {
    }


    public long getIdCard() {
        return idCard;
    }

}

package menu_ct.user;

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

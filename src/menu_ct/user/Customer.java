package menu_ct.user;

import java.util.Date;

public class Customer extends Person{
    private long idCard;
    public Customer(){};
    public Customer(long id, String username, String password, int rote, String name, int age,
                    Date dob, String address, String email, long numPhone, long idCard) {
        super(id, username, password, rote, name, age, dob, address, email, numPhone);
        this.idCard = idCard;
    }

    public long getIdCard() {
        return idCard;
    }

}

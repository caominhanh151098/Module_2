package menu_ct.user;

import java.util.Date;

public class Manage extends Person {
    public Manage(long id, String username, String password, int rote, String name, int age,
                  Date dob, String address, String email, long numPhone) {
        super(id, username, password, rote, name, age, dob, address, email, numPhone);
    }
}

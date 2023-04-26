package Week_4.regex.phonenum;

import Week_4.regex.account.AccountExample;

public class PhoneExampleTest {
    public static final String[] validPhone = new String[]{"(84)-(0978489648)", "(84)-(09784817853)", "(84)-(097642648)"};
    public static final String[] invalidPhone = new String[]{"(a8)-(22222222)", "(84)-(22b22222)", "(84)-(9978489648)"};
    public static void main(String[] args) {
        for (String phone : validPhone) {
            boolean valid = PhoneExample.validate(phone);
            System.out.println("Phone Number is " + phone + " is valid: " + valid);
        }
        for (String phone : invalidPhone) {
            boolean isValid = PhoneExample.validate(phone);
            System.out.println("Phone Number is " + phone + " is valid: " + isValid);
        }
    }
}

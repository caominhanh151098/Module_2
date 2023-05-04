package menu_ct.input;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validate {
    private static Pattern pattern;
    private static Matcher matcher;
    private static final String EMAIL_REGEX = "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";
    private static final String ACCOUNT_REGEX = "^[a-z0-9][_a-z0-9]{5,}$";
    private static final String PASSWORD_REGEX = "^[a-zA-Z0-9]{6,}$";
    private static final String DATE_REGEX = "^(0?[1-9]|[12]\\d|3[01])[\\-](0?[1-9]|1[0-2])[\\-](19|20)\\d{2}$";
    private static final String PHONENUMBER_REGEX = "^[0]\\d{8,10}$";

    public static boolean checkEmail(String email) {
        pattern = Pattern.compile(EMAIL_REGEX);
        return validate(email);
    }

    public static boolean checkAccount(String account) {
        pattern = Pattern.compile(ACCOUNT_REGEX);
        return validate(account);
    }
    public static boolean checkPassword(String password) {
        pattern = Pattern.compile(PASSWORD_REGEX);
        return validate(password);
    }
    public static boolean checkDate(String date) {
        pattern = Pattern.compile(DATE_REGEX);
        return validate(date);
    }

    public static boolean checkPhoneNum(String phonenum) {
        pattern = Pattern.compile(PHONENUMBER_REGEX);
        return validate(phonenum);
    }

    public static boolean validate(String string) {
        matcher = pattern.matcher(string);
        return matcher.matches();
    }


}

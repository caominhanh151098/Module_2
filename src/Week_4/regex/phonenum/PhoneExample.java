package Week_4.regex.phonenum;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneExample {
    private static final String PHONENUMBER_REGEX = "^\\(\\d{2}\\)-\\([0]\\d{8,10}\\)$";
    public PhoneExample(){}

    public static boolean validate(String regex) {
        Pattern pattern = Pattern.compile(PHONENUMBER_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}

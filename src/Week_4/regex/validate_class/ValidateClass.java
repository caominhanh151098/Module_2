package Week_4.regex.validate_class;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateClass {
    private static final String CLASS_REGEX = "^[C|A|P]\\d{4}[G|H|I|K]$";

    public static void main(String[] args) {
        String[] testNameClass = {"C0223G", "A0323K", "P0323A", "M0318G"};

        for (String valid : testNameClass) {
            Pattern pattern = Pattern.compile(CLASS_REGEX);
            Matcher matcher = pattern.matcher(valid);
            System.out.printf("%s: %s%n", valid, matcher.matches());
        }
    }
}

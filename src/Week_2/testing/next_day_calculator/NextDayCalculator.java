package Week_2.testing.next_day_calculator;

import java.util.Calendar;
import java.util.Date;

public class NextDayCalculator {
    public static Date findNextDate(Date date) {
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        c.add(Calendar.DATE, 1);
        date = c.getTime();
        return date;
    }
}

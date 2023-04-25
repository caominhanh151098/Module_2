package Week_2.testing.next_day_calculator;

import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static Week_2.testing.next_day_calculator.NextDayCalculator.findNextDate;
import static org.junit.jupiter.api.Assertions.*;

class NextDayCalculatorTest {
    @Test
    void testFindNextDate() throws ParseException {
        String stringDate = "1/1/2018";
        Date date = new SimpleDateFormat("dd/MM/yyyy").parse(stringDate);
        date = findNextDate(date);
        Date nextDate = new SimpleDateFormat("dd/MM/yyyy").parse("2/1/2018");
        assertEquals(nextDate, date);
    }
    @Test
    void testFindNextDate1() throws ParseException {
        String stringDate = "31/1/2018";
        Date date = new SimpleDateFormat("dd/MM/yyyy").parse(stringDate);
        date = findNextDate(date);
        Date nextDate = new SimpleDateFormat("dd/MM/yyyy").parse("1/2/2018");
        assertEquals(nextDate, date);
    }
    @Test
    void testFindNextDate2() throws ParseException {
        String stringDate = "30/4/2018";
        Date date = new SimpleDateFormat("dd/MM/yyyy").parse(stringDate);
        date = findNextDate(date);
        Date nextDate = new SimpleDateFormat("dd/MM/yyyy").parse("1/5/2018");
        assertEquals(nextDate, date);
    }
    @Test
    void testFindNextDate3() throws ParseException {
        String stringDate = "28/2/2018";
        Date date = new SimpleDateFormat("dd/MM/yyyy").parse(stringDate);
        date = findNextDate(date);
        Date nextDate = new SimpleDateFormat("dd/MM/yyyy").parse("1/3/2018");
        assertEquals(nextDate, date);
    }
    @Test
    void testFindNextDate4() throws ParseException {
        String stringDate = "29/2/2020";
        Date date = new SimpleDateFormat("dd/MM/yyyy").parse(stringDate);
        date = findNextDate(date);
        Date nextDate = new SimpleDateFormat("dd/MM/yyyy").parse("1/3/2020");
        assertEquals(nextDate, date);
    }
    @Test
    void testFindNextDate5() throws ParseException {
        String stringDate = "31/12/2018";
        Date date = new SimpleDateFormat("dd/MM/yyyy").parse(stringDate);
        date = findNextDate(date);
        Date nextDate = new SimpleDateFormat("dd/MM/yyyy").parse("1/1/2019");
        assertEquals(nextDate, date);
    }

}
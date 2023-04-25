package Week_2.testing.fizzbuzz;

import org.junit.jupiter.api.Test;

import static Week_2.testing.fizzbuzz.fizzbuzz.printFizzBuzz;
import static org.junit.jupiter.api.Assertions.*;

class fizzbuzzTest {

    @Test
    void testFizzBuzz() {
        int input = 26;
        String result = printFizzBuzz(input);
        String test = "hai sau";
        assertEquals(test, result);
    }
    @Test
    void testFizzBuzz1() {
        int input = 45;
        String result = printFizzBuzz(input);
        String test = "FizzBuzz";
        assertEquals(test, result);
    }
    @Test
    void testFizzBuzz2() {
        int input = 27;
        String result = printFizzBuzz(input);
        String test = "Fizz";
        assertEquals(test, result);
    }
    @Test
    void testFizzBuzz3() {
        int input = 25;
        String result = printFizzBuzz(input);
        String test = "Buzz";
        assertEquals(test, result);
    }
    @Test
    void testFizzBuzz4() {
        int input = 101;
        String result = printFizzBuzz(input);
        String test = "Error!";
        assertEquals(test, result);
    }
}
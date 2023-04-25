package Week_2.testing.fizzbuzz;

public class fizzbuzz {
    public static String printFizzBuzz(int input) {
        String result = "";
        boolean DIVISIBLE_BY_3 = input % 3 == 0;
        boolean DIVISIBLE_BY_5 = input % 5 == 0;
        if (DIVISIBLE_BY_3 && DIVISIBLE_BY_5)
            return "FizzBuzz";
        else if (DIVISIBLE_BY_3)
            return "Fizz";
        else if (DIVISIBLE_BY_5)
            return "Buzz";

        if (input > 99 || input < 0) {
            return "Error!";
        } else if (input < 9) {
            return stringNumber(input);
        } else {
            return stringNumber(input / 10) + " " + stringNumber(input % 10);
        }
    }

    public static String stringNumber(int input) {
        switch (input) {
            case 0:
                return "khong";
            case 1:
                return "mot";
            case 2:
                return "hai";
            case 3:
                return "ba";
            case 4:
                return "bon";
            case 5:
                return "nam";
            case 6:
                return "sau";
            case 7:
                return "bay";
            case 8:
                return "tam";
            case 9:
                return "chin";
        }
        return null;
    }
}

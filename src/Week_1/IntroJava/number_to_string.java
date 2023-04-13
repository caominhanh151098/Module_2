package Week_1.IntroJava;

import java.util.Scanner;

public class number_to_string {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String strNumber = "";

        int number;
        do {
            System.out.print("Enter number: ");
            number = Integer.parseInt(scanner.nextLine());
            if (number < 0 || number > 999) {
                System.out.println("0 <= Number <= 999");
            }
        } while (number < 0 || number > 999);

        if (number == 0)
            strNumber += "zero";
        else if (number < 10) {
            strNumber += to_10(number);
        } else if (number < 20) {
            strNumber += to_20(number);
        } else if (number < 100) {
            int unit = number % 10;
            strNumber += to_99(number) + "-" + to_10(unit);
        } else if (number < 1000) {
            int hundred = number / 100;
            int ten_of = number % 100;
            int unit = number % 10;
            if (ten_of < 20) {
                strNumber += to_10(hundred) + " hundred " + to_20(ten_of);
            } else if (ten_of == 20){
                strNumber += to_10(hundred) + " hundred " + to_99(ten_of);
            }
            else {
                strNumber += to_10(hundred) + " hundred " + to_99(ten_of) + "-" + to_10(unit);
            }
        }

        System.out.printf("String: %s", strNumber);
    }

    static String to_10(int number) {
        switch (number) {
            case 1:
                return "one";
            case 2:
                return "two";
            case 3:
                return "three";
            case 4:
                return "four";
            case 5:
                return "five";
            case 6:
                return "six";
            case 7:
                return "seven";
            case 8:
                return "eight";
            case 9:
                return "nine";
        }
        return "";
    }

    static String to_20(int number) {
        switch (number) {
            case 10:
                return "ten";
            case 11:
                return "eleven";
            case 12:
                return "twelve";
            case 13:
                return "thirteen";
            case 14:
                return "fourteen";
            case 15:
                return "fifteen";
            case 16:
                return "sixteen";
            case 17:
                return "seventeen";
            case 18:
                return "eighteen";
            case 19:
                return "nineteen";
        }
        return "";
    }

    static String to_99(int number) {
        int ten_of = number / 10;
        switch (ten_of) {
            case 2:
                return "twenty";
            case 3:
                return "thirty";
            case 4:
                return "forty";
            case 5:
                return "fifty";
            case 6:
                return "sixty";
            case 7:
                return "seventy";
            case 8:
                return "eighty";
            case 9:
                return "ninety";
        }
        return "";
    }
}

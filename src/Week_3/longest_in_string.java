package Week_3;

import java.util.Scanner;

public class longest_in_string {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = "";
        do {
            System.out.print("Enter a String: ");
            str = scanner.nextLine();
            if (str.equals("")) {
                System.out.println("Error!");
            }
        } while (str.equals(""));
        System.out.printf("Longest in String is: %s", longest(str));
    }

    public static String longest(String str) {
        int longest = 0;
        String stringResult = "";
        for (int i = 0; i < str.length() - 1; i++) {
            int index = 0;
            String testString = String.valueOf(str.charAt(i));
            for (int j = i + 1; j < str.length(); j++) {
                if (testString.charAt(index) < str.charAt(j)) {
                    testString += str.charAt(j);
                    index++;
                }
            }
            if (testString.length() > longest) {
                stringResult = testString;
                longest = testString.length();
            }
        }
        return stringResult;
    }
}

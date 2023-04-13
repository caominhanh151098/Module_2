package Week_3.Search;

import java.util.Scanner;

public class longest_in_string_1 {
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
        String stringResult = "";
        String testString = String.valueOf(str.charAt(0));
        int index = 0;

        for (int i = 1; i < str.length(); i++) {                    // 1 vòng lặp
            if (testString.charAt(index) <= str.charAt(i)) {
                testString += str.charAt(i);                        // 1 câu lệnh
                index++;                                            // 1 câu lệnh
                if (testString.length() > stringResult.length()) {
                    stringResult = testString;                      // 1 câu lệnh
                }
            } else {
                testString = String.valueOf(str.charAt(i));         // 1 câu lệnh
                index = 0;                                          // 1 câu lệnh
            }
        }
        return stringResult;
    }
}

/**************
 * Tính toán độ phức tạp của bài toán này:       *
 * 	1 vòng lặp * 5 câu lệnh = 5;                 *
 *                                               *
 * 	T(n) = O(n)                                  *
 *  Độ phức tạp của bài toán là O(n)             *
 **************/

package Week_1.Array;

import java.util.Scanner;

public class count_char {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = "Dang hoc tai CodeGym!";
        System.out.println(str);

        System.out.print("Enter Character: ");
        char character = scanner.next().charAt(0);
        System.out.printf("Character is %s\n", character);

        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == character) {
                count++;
            }
        }
        System.out.printf("Character %s has %d", character, count);
    }
}

package Week_3;

import java.util.Scanner;

public class AlgorithmComplexityTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter String: ");
        String str = scanner.nextLine();

        int[] frequentChar = new int[255];
        for (int i = 0; i < str.length(); i++) {
            int ascii = (int) str.charAt(i);

            frequentChar[ascii]++;
        }
        int max = 0;
        char character = (char) 255;
        for (int i = 0; i < 255; i++) {
            if (frequentChar[i] > max) {
                max = frequentChar[i];                          //{9}
                character = (char) i;
            }
        }
        System.out.printf("The most appearing letter is '%s' with a frequency of %d times", character, max);
    }
}

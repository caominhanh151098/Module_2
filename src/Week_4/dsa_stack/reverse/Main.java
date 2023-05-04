package Week_4.dsa_stack.reverse;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {0, 4, 6, 2, 5, 2};
        String string = "Lap Trinh Tai CodeGym!!";

        Reverse.reverseArray(numbers);
        Reverse.reverseWord(string);

        System.out.println(Arrays.toString(numbers));
        System.out.println(Reverse.reverseWord(string));
    }
}

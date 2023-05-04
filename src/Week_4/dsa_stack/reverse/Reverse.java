package Week_4.dsa_stack.reverse;

import java.util.Stack;

public class Reverse {
    public static void reverseArray(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        for (int item : arr) {
            stack.push(item);
        }
        int i = 0;
        while (!stack.isEmpty()) {
            arr[i++] = stack.pop();
        }
    }

    public static String reverseWord(String string) {
        String[] wWord = string.split("");
        Stack<String> wStack = new Stack<>();
        for (String word : wWord) {
            wStack.push(word);
        }
        int i = 0;
        string = wStack.pop();
        while (!wStack.isEmpty()) {
            string += "" + wStack.pop();
        }
        return string;
    }
}

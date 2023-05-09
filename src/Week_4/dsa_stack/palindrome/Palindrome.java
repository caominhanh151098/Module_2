package Week_4.dsa_stack.palindrome;


import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class Palindrome {
    static Stack stack_String = new Stack();
    static Queue queue_String = new ArrayDeque();

    public static void readByStack(String string) {
        String[] cache = string.toLowerCase().split("");

        int i = 0;
        while (i < cache.length) {
            stack_String.push(cache[i]);
            i++;
        }
    }

    public static void readByQueue(String string) {
        String[] cache = string.toLowerCase().split("");

        int i = 0;
        while (i < cache.length) {
            queue_String.add(cache[i]);
            i++;
        }
    }

    public static boolean checkPalindrome(String string) {
        readByStack(string);
        readByQueue(string);
        for (int i = 0; i < stack_String.size(); i++) {
            String temp1 = (String) stack_String.pop();
            String temp2 = (String) queue_String.remove();
            if (!temp1.equals(temp2)) {
                return false;
            }
        }
        return true;
    }
}

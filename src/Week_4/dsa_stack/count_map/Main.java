package Week_4.dsa_stack.count_map;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập Chuỗi: ");
        String string = scanner.nextLine();

        Map listWord = CountWord.countWord(string);
        Set<Map.Entry<String, Integer>> words = listWord.entrySet();
        for (Map.Entry<String, Integer> word: words) {
            System.out.println(word);
        }
    }
}

package Week_4.dsa_stack.count_map;

import java.util.*;

public class CountWord {
    public static Map countWord(String string) {
        Map<String, Integer> map = new LinkedHashMap<>();
        string = string.toLowerCase();
        String[] arrayString = string.split("");

        for (String word : arrayString) {
            if (map.containsKey(word) == false)
                map.put(word, 1);
            else {
                int value = map.get(word);
                map.replace(word, ++value);
            }
        }
        TreeMap<String, Integer> litsWord = new TreeMap<>(map);

        return litsWord;
    }
}

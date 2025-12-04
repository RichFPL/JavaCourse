package homework_java_16;

import java.util.HashMap;
import java.util.Map;

public class StringPairs {

    public static Map<String, String> pairs(String[] words) {
        Map<String, String> resultMap = new HashMap<>();

        for (String word : words) {
            String firstChar = String.valueOf(word.charAt(0));
            String lastChar = String.valueOf(word.charAt(word.length() - 1));
            resultMap.put(firstChar, lastChar);
        }
        return resultMap;
    }
}
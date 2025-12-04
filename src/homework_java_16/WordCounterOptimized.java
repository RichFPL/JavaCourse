package homework_java_16;

import java.util.HashMap;
import java.util.Map;

public class WordCounterOptimized {
    public static Map<String, Boolean> wordMultiple(String[] words) {
        Map<String, Boolean> resultMap = new HashMap<>();

        for (String word : words) {
            if (!resultMap.containsKey(word)) {
                resultMap.put(word, false);
            } else {
                resultMap.put(word, true);
            }
        }
        return resultMap;
    }
}


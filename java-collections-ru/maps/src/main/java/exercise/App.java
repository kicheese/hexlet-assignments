package exercise;

import java.util.HashMap;
import java.util.Map;

// BEGIN

public class App {

    public static Map<String, Integer> getWordCount(String words) {
        Map<String, Integer> wordsCount = new HashMap<>();

        if (words.equals("")) {
            return wordsCount;
        }

        String[] wordsArr = words.split(" ");

        for (String wordValue: wordsArr) {

            if (wordsCount.containsKey(wordValue)) {
                Integer newCount = wordsCount.get(wordValue) + 1;
                wordsCount.put(wordValue, newCount);
            } else {
                wordsCount.put(wordValue, 1);
            }
        }
        System.out.print("show: " + wordsCount.entrySet());
        return wordsCount;
    }

    public static String toString(Map<String, Integer> wordsCount) {
        if (wordsCount.isEmpty()) {
            return "{}";
        }

        StringBuilder result = new StringBuilder("{\n");

        for (Map.Entry<String, Integer> wordValue: wordsCount.entrySet()) {
            String resultString = "  " + wordValue.getKey() + ": " + wordValue.getValue() + "\n";
            result.append(resultString);

        }

        result.append("}");

        return result.toString();
    }
}

//END

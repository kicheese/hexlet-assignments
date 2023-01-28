package exercise;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

// BEGIN
public class App {

    public static boolean scrabble(String letters, String word) {
        if (word.length() > letters.length() || letters.length() == 0) {
            return false;
        }

        String[] tempLetters = letters.toLowerCase().split("");
        System.out.println("tempLetters:" + Arrays.toString(tempLetters));
        List<String> lettersArr = new ArrayList<>(Arrays.asList(tempLetters));

        String[] wordArr = word.toLowerCase().split("");

        boolean isWordComplete = true;

        for (String wordValue: wordArr) {

            System.out.println("lettersArr:" + lettersArr);
            if (lettersArr.contains(wordValue)) {
                lettersArr.remove(wordValue);
                System.out.println("wordValue:" + wordValue);
            } else {
                isWordComplete = false;
            }

        }

        return isWordComplete;
    }
}
//END

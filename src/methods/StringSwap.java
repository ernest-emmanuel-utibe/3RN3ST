package methods;

import java.util.Arrays;

public class StringSwap {
    public static String[] swapWords(String[] goingToSwapWords) {

        String[] temp = new String[goingToSwapWords.length];

        for (int i = 0; i < goingToSwapWords.length; i++) {
            temp[goingToSwapWords.length - i - 1] = goingToSwapWords[i];
        }
        return temp;
    }

    public static void main(String[] args) {
        String[] startingWords = {"Soft", "Let's be guided", "Dont be rude", "Semicolon", "Natives"};

        System.out.println(Arrays.toString(swapWords(startingWords)));
    }
}

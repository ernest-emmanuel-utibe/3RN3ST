package methods;

import java.util.Arrays;

public class StringSwap {
    public static String[] swapWords(String[] goingToSwapWords) {
        String temp = "";
        for(int i = 0; i <= 0; i++) {
            temp = goingToSwapWords[i];
        }
        return goingToSwapWords;
    }

    public static void main(String[] args) {
        String[] startingWords = {"Soft", "Let's be guided", "Dont be rude"};
        System.out.println(Arrays.toString(swapWords(startingWords)));
    }
}

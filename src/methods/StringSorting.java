package methods;

import java.util.Arrays;

public class StringSorting {
    public static String[] sortWords(String word, String replacement, String[] allWords) {

        for (int i = 0; i < allWords.length; i++) {
            if (allWords[i].equals(word)) {
                allWords[i] = replacement;
            }
        }
        //String temp = new String(Arrays.stream(words).toString().toUpperCase()).replace("John", "Able God");
        return allWords;
    }

    public static void main(String[] args) {
        String[] words = {"Sam", "John", "Ming", "WASP", "Samanta"};
        String[] newWords = sortWords("John", "Able God", words);
        System.out.println(Arrays.toString(newWords));
    }
}

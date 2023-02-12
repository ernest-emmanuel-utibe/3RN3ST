package loops.arraysLoops;

import java.util.Arrays;
import java.util.stream.Collectors;

public class StringSort
{
    public static void main(String[] args)
    {
        String[] words = {"Nat", "Mat", "James", "Ming", "Su"};

        for (int i = 0; i < words.length; i++) {
            System.out.println(Arrays.toString(words).toUpperCase());
        }

//        for (String word : words)
//        {
//            word = Arrays.toString(words).toUpperCase();
//            System.out.print(word + " , ");
////            System.out.println(Arrays.toString(words).toUpperCase());
//        }
    }
}

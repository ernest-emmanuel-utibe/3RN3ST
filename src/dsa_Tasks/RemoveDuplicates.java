package dsa_Tasks;

import java.util.logging.Logger;

import java.util.Arrays;

//import static sun.net.www.http.KeepAliveCache.result;

/*
 * Java program to remove duplicates from this array. You don't
 * need to physically delete duplicate elements, replacing with null, or
 * empty or default value is ok.
 *
 */
public class RemoveDuplicates {
    private static final Logger logger = LoggerFactory.getLogger(RemoveDuplicates.class);

    public static void main(String[] args) {
        int[][] test = new int[][] {
                {1, 1, 2, 2, 3, 4, 5},
                {1, 1, 1, 1, 1, 1, 1},
                {1, 2, 3, 4, 5, 6, 7},
                {1, 2, 1, 1, 1, 1, 1},
        };
        for (int[] input : test) {
            System.out.println("Array with Duplicates: " + Arrays.toString(input));
            System.out.println("After removing duplicates: " + Arrays.toString(removeDuplicate(input)));
        }
    }

    /*
     * Method to remove duplicates from array in Java, without using
     * Collection classes e.g. Set or ArrayList. Algorithm for this
     * method is simple, it first sorts the array and then compare adjacent
     * objects, leaving out duplicates, which is already in the result.
     */

    public static int[] removeDuplicate(int[] numbersWithDuplicates) {
        // Sorting array to bring duplicates together
        Arrays.sort(numbersWithDuplicates);

        int[] results = new int[numbersWithDuplicates.length];
        int previous = numbersWithDuplicates[0];
        results[0] = previous;

        for (int i = 1; i < numbersWithDuplicates.length; i++) {
            int ch = numbersWithDuplicates[i];
            if (previous != ch) {
                results[i] = ch;
            }
            previous = ch;
        }
        return results;
    }
}

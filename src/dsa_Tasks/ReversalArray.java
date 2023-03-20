package dsa_Tasks;

import java.util.Arrays;

public class ReversalArray {
    public static void reverseArray(int[] intArray, int size) {
        int i, k, temp;
        for (i = 0; i < size / 2; i++) {
            temp = intArray[i];
            intArray[i] = intArray[size - i -1];
            intArray[size - i - 1] = temp;
        }

        System.out.println("Reversed Array: \n" + Arrays.toString(intArray));
    }
}

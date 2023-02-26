package dsa_Tasks;

import java.util.Arrays;
import java.util.Collections;

public class ReverseIntegerAndString {
    public static void main(String[] args) {
        int[] iArray = new int[]{101, 102, 103, 104, 105, 106};
        String[] sArray = new String[]{"one", "two", "three", "four", "five", "six", "seven"};

        System.out.println("Original Integer Array: " + iArray + " " + Arrays.toString(iArray));
        Collections.reverse(Collections.singletonList(iArray));
        System.out.println("New Array: " + iArray);

        System.out.println("Original String Array: " + sArray + " " + Arrays.toString(sArray));
        Collections.reverse(Collections.singletonList(sArray));
        System.out.println("New String Array: " + sArray);
    }
}

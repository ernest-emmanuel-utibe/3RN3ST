package dsa_Tasks;

import java.util.Arrays;
import org.apache.commons.lang.ArrayUtils;

public class ReverseIntegerAndString {
    public static void main(String[] args) {
        int[] iArray = new int[]{101, 102, 103, 104, 105, 106};
        String[] sArray = new String[]{"one", "two", "three", "four", "five", "six", "seven"};

        System.out.println("Original Integer Array: " + iArray + " " + Arrays.toString(iArray));
        Arrays.reverse(iArray);
        System.out.println("New Array: " + iArray);

        System.out.println("Original String Array: " + sArray + " " + Arrays.toString(sArray));
        ArrayUtils.reverse(sArray);
        System.out.println("New String Array: " + sArray);
    }
}

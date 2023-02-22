package dsa_Tasks;
/* Java program to find largest and smallest number from an array in Java.*/

import java.util.Arrays;

public class MaximumMinimumArray {
    public static void main(String[] args) {
        largestAndSmallest(new int[] {-20, 34, 21, -87, 92, Integer.MAX_VALUE});
        largestAndSmallest(new int[] {10, Integer.MIN_VALUE, -2});
        largestAndSmallest(new int[] {Integer.MAX_VALUE, 40, Integer.MAX_VALUE});
        largestAndSmallest(new int[] {1, -1, 0});
    }

    public static void largestAndSmallest(int[] numbers) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int number : numbers) {
            if (number > largest) {
                largest = number;
            } else if (number < smallest) {
                smallest = number;
            }
            System.out.println("Given integer array : " + Arrays.toString(numbers));
            System.out.println("Largest number in array is : " + largest);
            System.out.println("Smallest number in array is : " + smallest);
        }
    }
}

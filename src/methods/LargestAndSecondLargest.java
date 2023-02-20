package methods;

import java.util.Arrays;

public class LargestAndSecondLargest {
    static int largest = 0;
    static int secondLargest = 0;
    public static int[] findTheLargestAndSmallestNumbers(int[] numbers) {

        for (int i = 0; i < numbers.length; i++) {
            Arrays.sort(numbers);
            largest = numbers.length - 1;
            secondLargest = numbers.length - 2;
        }
        System.out.printf("Largest number is %d%nSecond largest number is %d", numbers[largest], numbers[secondLargest]);
        return numbers;
    }

    public static void main(String[] args) {
        int[] numbers = {75, 86, 43, 2, 92, 90, 64, 39, 75};
        findTheLargestAndSmallestNumbers(numbers);
    }
}

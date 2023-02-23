package dsa_Tasks;

import java.util.Arrays;

public class QuickSortMain {

    public static void main(String[] args) {
        int[] unsorted = {34, 75, 8, 90, 26, 12, 11, 89};
        System.out.println("Unsorted array: " + Arrays.toString(unsorted));

        Quick_Sort algorithm = new Quick_Sort();
        algorithm.sort(unsorted);

        System.out.println("Sorted array: " + Arrays.toString(unsorted));
    }
}

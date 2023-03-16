package array;

import java.util.Arrays;

public class ReverseArrayTest {
    public static void main(String[] args) {
        ReverseArray reverseArray =  new ReverseArray();
        int[] number = new int[]{4, 6, 8, 9, 2, 5};

        System.out.print("The Reversed Array is: ");
        System.out.println(Arrays.toString(reverseArray.reverseAnArray(number)));
//        System.out.println(Arrays.toString(number));
    }

}
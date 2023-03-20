package dsa_Tasks;

import java.util.Arrays;
import java.util.Collections;

public class ReverseString1 {
    /*function reverses the elements of the array*/
    static void reverse(String myArray[])
    {
        Collections.reverse(Arrays.asList(myArray));
        System.out.println("Reversed Array:" + Arrays.asList(myArray));
    }
}

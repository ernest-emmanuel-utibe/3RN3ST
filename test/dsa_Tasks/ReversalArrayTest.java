package dsa_Tasks;
import java.util.Arrays;
import static dsa_Tasks.ReversalArray.reverseArray;

public class ReversalArrayTest {
    public static void main(String[] args) {
        int[] intArray = {11, 46, 68, 94, 83, 72, 75, 24, 15};

        // print the original array
        System.out.println("Original array: \n" + Arrays.toString(intArray));
        reverseArray(intArray, intArray.length);
    }

}
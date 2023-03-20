package dsa_Tasks;

import static dsa_Tasks.ReverseTrad.reverse_array;
import static org.testng.Assert.*;

public class ReverseTradTest {
    public static void main(String[] args) {
        char[] char_array = {'H', 'E', 'L', 'L', 'O'};
        System.out.println("Original array: ");
        for (int k = 0; k < char_array.length; k++) {
            System.out.println(char_array[k] + " ");
        }
        System.out.println();
        reverse_array(char_array, char_array.length);
    }

}
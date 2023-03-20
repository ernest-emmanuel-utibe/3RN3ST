package dsa_Tasks;

import java.util.Arrays;

import static dsa_Tasks.ReverseString1.reverse;
import static org.testng.Assert.*;

public class ReverseString1Test {
    public static void main(String[] args) {
        String[] myArray = {"one", "two", "three", "four", "five"};
        System.out.println("Original Array: " + Arrays.asList(myArray));
        reverse(myArray);
    }

}
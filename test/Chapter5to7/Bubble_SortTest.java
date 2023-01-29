package Chapter5to7;

import org.testng.annotations.Test;
import static org.testng.internal.junit.ArrayAsserts.assertArrayEquals;

class Bubble_SortTest {
    @Test
    public void testThatArraysCanSort() {
        Bubble_Sort bubbleSort = new Bubble_Sort();
        int[] arraySize = {2, 9, 5, 5, 6, 8, 10};
        int[] result = bubbleSort.sortArray(arraySize);
        assertArrayEquals(new int[]{2, 5, 5, 6, 8, 9, 10}, result);
    }


}
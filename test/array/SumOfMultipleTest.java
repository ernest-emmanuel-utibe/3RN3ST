package array;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class SumOfMultipleTest {
    @Test
    void sumMulTest() {
        assertEquals(20, SumOfMultiple.sumMul(2, 9));
        assertEquals(20, SumOfMultiple.sumMul(2, 10));
        assertThrows(IllegalArgumentException.class,
                () -> SumOfMultiple.sumMul(0,0));
    }

}
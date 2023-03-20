package array;

import java.util.stream.IntStream;

public class SumOfMultiple {
    public static long sumMul(int n, int m) {
        if (n <= 0 || m <= 0) {
            throw new IllegalArgumentException();
        }
        return IntStream.range(n, m)
                .filter(i -> i % n == 0)
                .sum();
    }
}

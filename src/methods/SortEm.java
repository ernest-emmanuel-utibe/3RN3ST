package methods;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SortEm {
    public static int[] sortingNumbers(int[] numbers) {

        int temp = 0;
        for (int i = 0; i <= numbers[temp]; i++) {
           for (int j = 0; j <= numbers[i]; j++) {
               Arrays.sort(numbers);
           }
        }
        return numbers;
    }

    public static void main(String[] args) {
        int[] num = {37, 57, 5, 3, 79, 40, 72};
        System.out.println(Arrays.toString(sortingNumbers(num)));
    }
}

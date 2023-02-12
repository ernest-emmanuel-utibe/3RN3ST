package loops.arraysLoops;

import java.util.Arrays;

public class SortArray
{
    public static void main(String[] args)
    {
        Object[] array = {8, 4, 1, 9, 6, 3, 5, 2, 7, 10};
        int[] temporary = new int[1];

        for (int i = 0; i <= temporary[0]; i++)
        {
            array = Arrays.stream(array).sorted().toArray();
            System.out.println(Arrays.toString(array));
        }
    }
}

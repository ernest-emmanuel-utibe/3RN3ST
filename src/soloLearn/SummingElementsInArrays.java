package soloLearn;

import java.util.Scanner;

public class SummingElementsInArrays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int length = input.nextInt();
        int[] array = new int[length];
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < length; i++) {
            if (array[i] % 4 == 0) {
                sum += array[i];
            }
        }
        System.out.println(sum);
    }
}

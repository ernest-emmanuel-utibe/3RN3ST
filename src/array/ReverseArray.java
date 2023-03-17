package array;

public class ReverseArray {
    public int[] reverseAnArray(int[] number) {
        int[] x = new int[number.length];
        for (int i = 0; i < x.length; i++) {
            x[i] = number[x.length - i - 1];
        }
        return x;
    }
}

package array;

public class ReverseArray {
    public int[] reverseAnArray(int[] number) {
        int[] x = new int[6];
        int temp = 0;

        for (int i = 0; i < x.length / 2; i++) {
            temp = x[i];
            x[i] = x[x.length - i - 1];
            x[x.length - i -1] = temp;
        }

        for (int j = x.length -1; j >= 0; j--) {
            x[j] = x[x.length - j - 1];
            x[x.length - j -1] = temp;
        }
        return x;

    }
}

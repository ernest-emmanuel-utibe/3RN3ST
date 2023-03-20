package dsa_Tasks;

public class ReverseTrad {
    public static void reverse_array(char[] char_array, int n) {
        char[] dest_array = new char[n];
        int j = n;
        for (int i = 0; i < n; i++) {
            dest_array[j - 1] = char_array[i];
            j = j -1;
        }

        System.out.println("Reversed Array: ");
        for (int k = 0; k < n; k++) {
            System.out.println(dest_array[k] + " ");
        }
    }

}

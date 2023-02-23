package dsa_Tasks;

public class Quick_Sort {
    private int[] input;
    private int length;

    public void sort(int[] numbers){
        if (numbers == null || numbers.length == 0) {
            return;
        }
        this.input = numbers;
        length = numbers.length;
        quickSort(0, length - 1);
    }

    private void quickSort(int low, int high) {
        int i = low;
        int j = high;

        // pivot is middle index
        int pivot = input[low + (high - low) / 2];

        // Divide into two arrays
        while (i <= j) {
            while (input[i] < pivot) {
                i++;
            }
            while(input[i] > pivot) {
                j--;
            }
            if (i <= j) {
                swap(i, j);
                // move index to next position on both sides
                i++;
                j--;
            }
        }
        // calls quickSort() method recursively
        if (low < j) {
            swap(low, j);
        }
        if (i < high) {
            swap(i, high);
        }
    }

    private void swap(int i, int j) {
        int temp = input[i];
        input[i] = input[j];
        input[j] = temp;
    }
}

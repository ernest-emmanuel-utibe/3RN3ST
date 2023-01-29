package Chapter5to7;

public class SumOfSeries {
    public static void main(String[] args) {
        int sumOfSeries = 0;

        System.out.printf("%-7s%s%n", "Number", "Sum");

        for(int i = 1; i <= 100; i++) {
            sumOfSeries += i;
            System.out.printf("%-7d%d%n", i, sumOfSeries);
        }

    }
}

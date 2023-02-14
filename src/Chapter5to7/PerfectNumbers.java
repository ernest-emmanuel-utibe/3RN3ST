package Chapter5to7;

public class PerfectNumbers {
public static boolean isPerfect(int number) {
    int sum = 0;
    for (int i = 1; i < number; i++) {
        if (number % i == 0) {
            sum += i;
        }
    }
    return sum == number;
}

public static void main(String[] args) {
    int max = 1000; // Change this to test larger numbers
    for (int i = 1; i <= max; i++) {
        if (isPerfect(i)) {
            System.out.print(i + ": ");
            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }
    }
}
}

package Chapter5to7;

public class IntegersDivisibleBy3 {
    public static void main(String[] args) {
        int sum = 0;
        for (int number = 1; number <= 30; number++) {
            if (number % 3 == 0) {
                sum += number;
                System.out.println(sum);
            }
        }
    }
}
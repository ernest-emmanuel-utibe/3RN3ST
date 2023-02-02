package selfPractice;

// Generate prime numbers between 1 & given number

public class PrimeNumbers {
    public static void main(String[] args) {

        int limit = 100;

        System.out.println("Prime number between 1 and " + limit);

        for (int i = 1; i < 100; i++) {
            boolean isPrime =true;

            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(i + " ");
            }
        }
    }
}

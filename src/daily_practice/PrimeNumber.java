package daily_practice;

public class PrimeNumber {
    public static boolean isPrime(int n) {
        if (n < 2) {     // 0 and 1 are not prime
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {  // check up to the square root of n
            if (n % i == 0) {  // if n is divisible by any number in the range, it is not prime
                return false;
            }
        }
        return true;  // if no divisors are found, n is prime
    }
}


package daily_practice;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (number % 2 == 1){
            System.out.println("This is an even number");
        }

        if (number % 2 != 0){
            System.out.println("This is an odd number");
        }

        if (number % 3 != 0){
            System.out.println("This is a prime number");
        }
    }
}

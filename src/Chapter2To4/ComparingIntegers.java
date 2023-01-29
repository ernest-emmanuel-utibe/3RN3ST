package Chapter2To4;

import java.util.Scanner;

public class ComparingIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an integer: ");
        int number = scanner.nextInt();

        if (number > 100) {
            System.out.printf("%d is greater than 100%n", number);
        }

        if (number == 100) {
            System.out.printf("%d is equals to 100%n", number);
        }

        if(number != 100) {
            System.out.printf("%d is not equals to 100%n", number);
        }

        if (number < 100) {
            System.out.printf("%d is less than 100%n", number);
        }

        if (number * number > 100) {
            System.out.printf("%d is greater than 100%n", number * number);
        }

        if (number * number == 100) {
            System.out.printf("%d is equal to 100%n", number * number);
        }

        if(number * number != 100) {
            System.out.printf("%d is not equal to 100%n", number * number);
        }

        if (number * number < 100) {
            System.out.printf("%d is less than 100%n", number * number);
        }
    }
}

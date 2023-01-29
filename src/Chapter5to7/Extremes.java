package Chapter5to7;

import java.util.Scanner;

public class Extremes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maximumNumber = Integer.MIN_VALUE;
        int minimumNumber = Integer.MAX_VALUE;
        int smallest, largest;

        System.out.print("Enter a number that you want the application to run for: ");
        int number = scanner.nextInt();

        for (int i = 1; i <= number; i++) {
            System.out.print("Enter a number: ");
            int number2 = scanner.nextInt();

            if (number2 < minimumNumber) {
                minimumNumber = number2;
            }
            if (number2 > maximumNumber) {
                maximumNumber = number2;
            }
        }
        System.out.printf("Sum of the two smallest number is: %d%n", minimumNumber);
        System.out.printf("Sum of the two largest number is: %d%n", maximumNumber);
        System.out.printf("Sum of largest and smallest is: %d%n", minimumNumber + maximumNumber);
    }
}

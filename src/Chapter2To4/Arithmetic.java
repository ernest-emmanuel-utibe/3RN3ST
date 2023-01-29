package Chapter2To4;

import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first integer: ");
        int num1 = scanner.nextInt();
        System.out.println("Enter second integer: ");
        int num2 = scanner.nextInt();

        int firstNumberSquared = num1 * num1;
        int secondNumberSquared = num2 * num2;
        int sumOfSquare = num2 + num2;
        int difference = firstNumberSquared - secondNumberSquared;


        System.out.printf("Square of first number is %d%n", firstNumberSquared);
        System.out.printf("Square of second number is %d%n", secondNumberSquared);
        System.out.printf("Sum is %d%n", sumOfSquare);
        System.out.printf("Difference of squared numbers is %d%n", difference);
    }
}

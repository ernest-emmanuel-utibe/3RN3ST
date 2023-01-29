package Chapter2To4;

import java.util.Scanner;

public class Multiples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first integer: ");
        int num1 = scanner.nextInt();
        System.out.println("Enter second integer: ");
        int num2 = scanner.nextInt();

        int firstNumberTripled = num1 * num1 * num1;
        int secondNumberDoubled = num2 * num2;

        if (firstNumberTripled % secondNumberDoubled == 0) {
            System.out.println("First number tripled is a multiple of second number doubled");
        }
        else {
            System.out.println("First number tripled is not a multiple of second number doubled");
        }
    }
}

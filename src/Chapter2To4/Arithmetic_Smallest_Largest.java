package Chapter2To4;

import java.util.Scanner;

public class Arithmetic_Smallest_Largest {
    public static void main(String[] args) {
        // import the Scanner class
        Scanner scanner = new Scanner(System.in);

        // prompt the user to input three numbers each
        System.out.println("Enter first integer: ");
        int num1 = scanner.nextInt();
        System.out.println("Enter second integer: ");
        int num2 = scanner.nextInt();
        System.out.println("Enter third integer: ");
        int num3 = scanner.nextInt();

        // declare variables largest and smallest
        int largest;
        int smallest;

        // declare and initialize num1, num2 and num3 to sum
        int sum = num1 + num2 + num3;
        // declare and initialize sum divided 3 to average
        int average = (sum) / 3;
        // declare and initialize num1, num2 and num3 to product
        int product = num1 * num2 * num3;

        // declare and initialize num1 to smallest and use if statement
        smallest = num1;
        if (num2 <= smallest) {
            smallest = num2;
        }
        if (num3 <= smallest) {
            smallest = num3;
        }

        // declare and initialize num1 to largest and use if statement
        largest = num1;
        if(num2 >= largest) {
            largest = num2;
        }
        if(num3 >= largest) {
            largest = num3;
        }

        // print out the sum, average, product, largest and smallest
        System.out.printf("Sum of integers is %d%n", sum);
        System.out.printf("Average of integers is %d%n", average);
        System.out.printf("Product of integers is %d%n", product);
        System.out.printf("Largest integer is %d%n", largest);
        System.out.printf("Smallest integer is %d", smallest);
    }
}

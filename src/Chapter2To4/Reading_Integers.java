package Chapter2To4;

import java.util.Scanner;

public class Reading_Integers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sumOfNumbers = 0;
        int firstNumber = 0;
        int counter = 0;
        while (true) {
            System.out.println("Enter a number: ");
            int number = input.nextInt();
            if (counter == 0) {
                firstNumber = number;
            }
            else {
                sumOfNumbers += number;
            }

            if (sumOfNumbers >= firstNumber) {
                break;
            }
            counter++;
        }

        System.out.println("First number is "+ firstNumber);
        System.out.println("Sum of other numbers is "+ sumOfNumbers);

        System.out.println("Sum of integer is equal or greater than the number from the beginning");
    }
}

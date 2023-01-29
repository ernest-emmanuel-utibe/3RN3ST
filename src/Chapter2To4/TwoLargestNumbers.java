package Chapter2To4;

import java.util.Scanner;

public class TwoLargestNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int counter = 1;
        int firstLargestNumber = 0;
        int secondLargestNumber = 0;

        while (counter <= 10) {
            System.out.println("Enter number: " + counter);
            int number = input.nextInt();

            if (number > firstLargestNumber) {
                secondLargestNumber = firstLargestNumber;
                firstLargestNumber = number;
            }

            if (number > secondLargestNumber && number < firstLargestNumber) {
                secondLargestNumber = number;
            }
            counter += 1;
        }

        System.out.println("The first largest number is: " + firstLargestNumber);
        System.out.println("The second largest number is: " + secondLargestNumber);
    }
}

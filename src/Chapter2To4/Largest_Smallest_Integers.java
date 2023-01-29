package Chapter2To4;

import java.util.Scanner;

public class Largest_Smallest_Integers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 1;
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        while(count <= 5) {
            System.out.println("Enter five numbers: ");
            int numbers = scanner.nextInt();

            if (numbers > largest) {
                largest = numbers;
            } 
            else{
                if (numbers < smallest) {
                    smallest = numbers;
                }
                count++;
            }
        }
        System.out.printf(largest+ " is the largest number ");
        System.out.printf(smallest+ "\t is the smallest number ");
    }
}

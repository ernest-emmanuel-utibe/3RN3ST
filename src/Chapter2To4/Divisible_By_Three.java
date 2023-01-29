package Chapter2To4;

import java.util.Scanner;

public class Divisible_By_Three {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an integer: ");
        int number = scanner.nextInt();

        if (number % 3 == 0) {
            System.out.println("Number is divisible by 3");
        }
        else{
            System.out.println("Number is not divisible by 3");
        }
    }
}

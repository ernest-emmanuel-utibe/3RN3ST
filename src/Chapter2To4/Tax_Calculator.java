package Chapter2To4;

import java.util.Scanner;

public class Tax_Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter citizen name: ");
        String name = input.nextLine();
        System.out.println("Enter earnings per year: ");
        int earnings = input.nextInt();

        double totalTax = 0;

        if (earnings <= 30_000) {
            totalTax = 0.15 / 100 * earnings;
        }
        else {
            totalTax = 0.2 / 100 * earnings;
        }
        System.out.printf("Total tax for %s is %.2f%n", name, totalTax);
    }
}

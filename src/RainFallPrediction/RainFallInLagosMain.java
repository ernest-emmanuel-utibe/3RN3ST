package RainFallPrediction;

import java.util.Scanner;

public class RainFallInLagosMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a month: ");
        String month = input.nextLine();

        System.out.print("Enter the number of days: ");
        int days = input.nextInt();

        double numberOfRainFall = RainFallInLagos.numberOfRainFall(month, days);

        System.out.printf("Number of rain fall in %s for %d days is: %.2f", month, days, numberOfRainFall);
    }
}

package Chapter2To4;

import java.util.Scanner;

public class GasMilage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int severalTrips = 0;
        double average = 0;

        System.out.print("Enter miles driven: ");
        double milesDrivenPerTrip = input.nextDouble();

        System.out.print("Enter gallon used: ");
        int gallonUsedPerTrip = input.nextInt();

        if (severalTrips != milesDrivenPerTrip && severalTrips != gallonUsedPerTrip) {
            average = milesDrivenPerTrip / gallonUsedPerTrip;
        }
        System.out.printf("Miles driven per gallon is: %.2f%n", milesDrivenPerTrip);
        System.out.printf("Gallons used per trip is: %.2f%n", average);
    }
}

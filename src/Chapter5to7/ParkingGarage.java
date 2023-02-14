package Chapter5to7;

import java.util.Scanner;

public class ParkingGarage {
        // Define the method to calculate parking charges
    public static double calculateCharges(double hours) {
        // Calculate the minimum charge of $2.00 for up to 3 hours
        double charge = 2.00;
        // If the car parked for more than 3 hours, add $0.50 for each hour or part thereof in excess of three
        if (hours > 3) {
            charge += 0.50 * (hours - 3);
        }
        // The maximum charge for any given 24-hour period is $10.00
        if (charge > 10.00) {
            charge = 10.00;
        }
        // Return the final charge
        return charge;
    }

    public static void main(String[] args) {
        // Initialize the running total of yesterday's receipts
        double totalReceipts = 0.00;

        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Loop through each customer
        while (true) {
            // Get the number of hours parked for the current customer
            System.out.print("Enter the number of hours parked (or enter -1 to exit): ");
            double hoursParked = scanner.nextDouble();
            // If the user enters -1, exit the loop
            if (hoursParked == -1) {
                break;
            }
            // Calculate the charge for the current customer
            double charge = calculateCharges(hoursParked);
            // Display the charge for the current customer
            System.out.printf("The parking charge for the current customer is: $%.2f\n", charge);
            // Add the charge for the current customer to the running total of yesterday's receipts
            totalReceipts += charge;
        }

        // Display the running total of yesterday's receipts
        System.out.printf("The total receipts for yesterday are: $%.2f\n", totalReceipts);
    }
}

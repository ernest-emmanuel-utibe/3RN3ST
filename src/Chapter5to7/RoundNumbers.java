package Chapter5to7;
import java.util.Scanner;
public class RoundNumbers {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Loop through each number
        while (true) {
            // Get the number from the user
            System.out.print("Enter a decimal number (or enter -1 to exit): ");
            double number = scanner.nextDouble();

            // If the user enters -1, exit the loop
            if (number == -1) {
                break;
            }

            // Round the number to the nearest integer using Math.floor()
            int roundedNumber = (int) Math.floor(number + 0.5);

            // Display both the original number and the rounded number
            System.out.printf("Original number: %f, Rounded number: %d\n", number, roundedNumber);
        }
    }
}

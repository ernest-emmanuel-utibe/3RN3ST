package Chapter2To4;

import java.util.Scanner;

public class BodyMassIndexCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your weight number in kilograms: ");
        int weight = scanner.nextInt();
        System.out.println("Enter your height number in meters: ");
        int height = scanner.nextInt();


        double bmi = (weight * 703) / (height * height);
        System.out.printf("Your BMI = %.2f%n", bmi);

    }
}

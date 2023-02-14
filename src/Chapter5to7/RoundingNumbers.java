package Chapter5to7;

import java.util.Scanner;

public class RoundingNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        double number = input.nextDouble();

        System.out.printf("Original value: %.3f\n", number);
        System.out.printf("Rounded to nearest integer: %d\n", roundToInteger(number));
        System.out.printf("Rounded to nearest tenth: %.1f\n", roundToTenths(number));
        System.out.printf("Rounded to nearest hundredth: %.2f\n", roundToHundredths(number));
        System.out.printf("Rounded to nearest thousandth: %.3f\n", roundToThousandths(number));
    }

        public static int roundToInteger(double number) {
            return (int) Math.floor(number + 0.5);
        }

        public static double roundToTenths(double number) {
            return Math.floor(number * 10 + 0.5) / 10;
        }

        public static double roundToHundredths(double number) {
            return Math.floor(number * 100 + 0.5) / 100;
        }

        public static double roundToThousandths(double number) {
            return Math.floor(number * 1000 + 0.5) / 1000;
        }
    }

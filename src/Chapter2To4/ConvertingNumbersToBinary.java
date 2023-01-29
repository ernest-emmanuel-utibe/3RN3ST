package Chapter2To4;

import java.util.Scanner;

public class ConvertingNumbersToBinary {

    public static int convertBinaryToInteger(int number) {
        int length = Integer.toString(number).length();
        String stringNumber = Integer.toString(number);
        int decimal = 0;

        for (int i = 1; i <= length; i++) {
            String character = String.valueOf(stringNumber.charAt(i - 1));
            int digit = Integer.parseInt(character);
            decimal += digit * Math.pow(2, length);
        }
        return decimal;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a binary representation: ");
        int number = scanner.nextInt();
        System.out.printf("Decimal value is: %d%n", convertBinaryToInteger(number));

    }
}

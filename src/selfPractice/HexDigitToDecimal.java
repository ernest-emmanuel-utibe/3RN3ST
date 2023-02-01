package selfPractice;

import java.util.Scanner;

public class HexDigitToDecimal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a hex digit: ");
        String hexString = input.nextLine();

        if (hexString.length() != 1) {
            System.out.println("You must enter exactly one character");
            System.exit(1);
        }

        char ch = hexString.charAt(0);
        if (ch <= 'F' && ch >= 'A') {
            int value = ch - 'A' + 10;
            System.out.println("The decimal for hex digit " + ch + " is " + ch);
        }
        else {
            System.out.println(ch + " is not a valid");
        }
    }
}

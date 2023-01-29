package Chapter2To4;

import java.util.Scanner;

public class Palindrome {
    public static String reversedNumber(String number) {
        String reversedNumber = "";

        for (int i = 0; i < number.length(); i++) {
            reversedNumber = number.charAt(i) + reversedNumber;
        }
        return reversedNumber;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a five digit number: ");
        String palindrome = input.nextLine();

        String reversedNumber = reversedNumber(palindrome);

        if (reversedNumber.equals(palindrome)) {
            System.out.print("It is a palindrome");
        }
        else {
            System.out.print("It is not a palindrome");
        }

//        String reversedNumber = new StringBuilder(palindromes).reverse().toString();
    }
}

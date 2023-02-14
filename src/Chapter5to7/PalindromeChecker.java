package Chapter5to7;
import java.util.Scanner;
public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        if (isPalindrome(number)) {
            System.out.println(number + " is a palindrome");
        } else {
            System.out.println(number + " is not a palindrome");
        }
    }

    public static boolean isPalindrome(int number) {
        int reversed = 0;
        int original = number;
        while (original > 0) {
            reversed = reversed * 10 + original % 10;
            original /= 10;
        }
        return number == reversed;
    }
}

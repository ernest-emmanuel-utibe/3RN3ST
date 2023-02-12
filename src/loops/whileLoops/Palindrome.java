package loops.whileLoops;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String alphabet = input.nextLine();

        int low = 0;

        int high = alphabet.length() - 1;

        boolean isPalindrome = true;
        while(low < high) {
            if(alphabet.charAt(low) != alphabet.charAt(high)){
                isPalindrome = false;
                break;
            }
            low++;
            high--;
        }
        if (isPalindrome)
            System.out.println(alphabet + " is a palindrome");
        else
            System.out.println(alphabet + " is not a palindrome");
    }
}

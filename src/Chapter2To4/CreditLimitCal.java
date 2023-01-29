package Chapter2To4;

import java.util.Scanner;

public class CreditLimitCal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter customer Account number: ");
        int accountNumber = input.nextInt();

        System.out.println("Enter customer balance at the beginning of the month: ");
        int beginningBalance = input.nextInt();

        System.out.println("Enter items charged by customer: ");
        int itemsCharged = input.nextInt();

        System.out.println("Enter total of all credits applied to the customer: ");
        int totalCredits = input.nextInt();

        System.out.println("Enter the credit limit for the customer: ");
        int customerCreditLimit = input.nextInt();

        int newBalance = beginningBalance + itemsCharged - totalCredits;
        System.out.printf("New balance is: %d%n", newBalance);

        if (newBalance > customerCreditLimit) {
            System.out.println("Credit limit exceeded");
        }
        else {
            System.out.printf("Customer balance is: %d%n", newBalance);
        }
    }

}

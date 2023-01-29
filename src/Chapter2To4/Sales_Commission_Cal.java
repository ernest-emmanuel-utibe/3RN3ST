package Chapter2To4;

import java.util.Scanner;

public class Sales_Commission_Cal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double totalSold = 0;

        while (true) {
            System.out.print("Enter item: ");
            int item = input.nextInt();

            if (item == -1) {
                break;
            }

            switch(item){
                case 1 -> totalSold += 239.99;
                case 2 -> totalSold += 129.75;
                case 3 -> totalSold += 99.95;
                case 4 -> totalSold += 350.89;
            }
        }

        double earnings = 200 + 0.9 * totalSold;

        System.out.printf("Sales person earnings is: $%.2f", earnings);
    }
}

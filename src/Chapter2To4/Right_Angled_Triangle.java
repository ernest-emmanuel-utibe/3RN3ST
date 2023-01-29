package Chapter2To4;

import java.util.Scanner;

public class Right_Angled_Triangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter length of a base triangle between 1 - 10: ");
        int base = input.nextInt();

        for (int i = -1; i <= 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println(" *" + " ");
        }
    }
}

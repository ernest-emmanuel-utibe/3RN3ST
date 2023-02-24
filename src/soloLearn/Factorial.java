package soloLearn;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int fact = 1;

        while (number > 0) {
            fact *= number--;
        }
        System.out.println(fact);
    }
}

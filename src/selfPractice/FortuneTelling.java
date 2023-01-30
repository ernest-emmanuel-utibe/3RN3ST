package selfPractice;

import java.util.Scanner;

public class FortuneTelling {
    public static void main(String[] args) {

        System.out.print("Pick a number between 1 and 10: ");
        Scanner scanner = new Scanner(System.in);

        int inputNumber = scanner.nextInt();

        if (inputNumber < 5) {
            System.out.println("Enjoy the good luck a friend brings you");
        } else {
            System.out.println("Your show selection will make you happy today");
        }


    }
}

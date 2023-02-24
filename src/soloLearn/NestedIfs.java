package soloLearn;

import java.util.Scanner;

public class NestedIfs {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.print("Enter the population of a country: ");
        int population = read.nextInt();
        int area = read.nextInt();

        if (population < 10000 && area < 10000) {
            System.out.println("small country");
        }
    }
}

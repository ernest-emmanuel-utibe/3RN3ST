package Chapter5to7;

import java.util.Scanner;

public class Hypotenuse {
    public static double hypotenuse(double side1, double side2) {
        return Math.sqrt(Math.pow(side1, 2) + Math.pow(side2, 2));
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter length of side 1: ");
        double side1 = input.nextDouble();

        System.out.print("Enter length of side 2: ");
        double side2 = input.nextDouble();

        double hypotenuse = hypotenuse(side1, side2);

        System.out.printf("Length of hypotenuse: %.2f%n", hypotenuse);
    }
}

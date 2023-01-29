package Chapter2To4;

import java.util.Scanner;

public class DiameterCircumferenceAreaOfACircle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the radius of a circle as an integer: ");
        int radius = scanner.nextInt();

        int diameter = radius * radius;
        double circumference = Math.PI * radius;
        double area = Math.PI * radius * radius;


        System.out.printf("Diameter of a circle = %d%n", diameter);
        System.out.printf("Circumference of a circle = %.2f%n", circumference);
        System.out.printf("Area of a circle = %.2f%n", area);
    }
}

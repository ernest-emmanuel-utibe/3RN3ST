package selfPractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GeneratePyramidOfNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter number: ");
        int number = Integer.parseInt(keyboard.readLine());

        System.out.println("Enter X: ");
        int x = Integer.parseInt(keyboard.readLine());

        int y = 0;

        for (int i = 0; i <= number; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(y + "\t");
                y = y + x;
            }
            System.out.println("");
        }
    }
}

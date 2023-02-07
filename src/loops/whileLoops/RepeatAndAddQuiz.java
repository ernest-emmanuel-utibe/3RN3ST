package loops.whileLoops;

import java.io.IOException;
import java.util.Scanner;

public class RepeatAndAddQuiz {
    public static void main(String[] args) throws IOException {
        int number1 = (int) (Math.random() * 10);
        int number2 = (int) (Math.random() * 10);

        Scanner input = new Scanner(System.in);

        System.out.print("What is " + number1 + " + " + number2 + " ? ");
        int answer = input.nextInt();

        while (number1 + number2 != answer) {
            System.out.print("Wrong answer. Try again.  What is " + number1 + " + " + number2 + " ? ");
            answer = input.nextInt();
        }
            System.out.println("Correct answer. You got it right, cheers mate.");
    }
}

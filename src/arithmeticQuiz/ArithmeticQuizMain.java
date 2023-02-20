package arithmeticQuiz;

import java.util.Scanner;

import static arithmeticQuiz.ArithmeticQuiz.*;

public class ArithmeticQuizMain {
//    private ArithmeticQuiz arithmeticQuiz;

    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int difficulty = getDifficulty();
        int problemType = getProblemType();
        int numCorrect = 0;

        while (true) {
            int num1 = getRandomNumber(difficulty);
            int num2 = getRandomNumber(difficulty);
            String operator = getOperator(problemType);
            int answer = calculateAnswer(num1, num2, operator);

            System.out.printf("How much is %d %s %d?%n", num1, operator, num2);
            int guess = scanner.nextInt();

            if (guess == answer) {
                numCorrect++;
                System.out.println(getCorrectResponse());
            } else {
                System.out.println(getIncorrectResponse());
            }

            if (numCorrect == 10) {
                double percentage = (double) numCorrect / 10 * 100;
                if (percentage < 75.0) {
                    System.out.println("Please ask your teacher for extra help.");
                } else {
                    System.out.println("Congratulations, you are ready to go to the next level!");
                }
                numCorrect = 0;
                difficulty = getDifficulty();
                problemType = getProblemType();
            }
        }
    }
}

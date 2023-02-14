package Chapter5to7;
import java.security.SecureRandom;
import java.util.Scanner;

public class ArithmeticQuiz {
    private static final SecureRandom random = new SecureRandom();
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

    private static int getDifficulty() {
        System.out.print("Choose a difficulty level (1-4): ");
        return scanner.nextInt();
    }

    private static int getProblemType() {
        System.out.println("Choose a problem type:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Random mixture");
        System.out.print("Enter your choice: ");
        return scanner.nextInt();
    }

    private static int getRandomNumber(int difficulty) {
        int max = (int) Math.pow(10, difficulty) - 1;
        return random.nextInt(max) + 1;
    }

    private static String getOperator(int problemType) {
        switch (problemType) {
            case 1:
                return "+";
            case 2:
                return "-";
            case 3:
                return "*";
            case 4:
                return "/";
            default:
                int opNum = random.nextInt(4) + 1;
                return getOperator(opNum);
        }
    }

    private static int calculateAnswer(int num1, int num2, String operator) {
        switch (operator) {
            case "+":
                return num1 + num2;
            case "-":
                return num1 - num2;
            case "*":
                return num1 * num2;
            case "/":
                return num1 / num2;
            default:
                throw new IllegalArgumentException("Invalid operator: " + operator);
        }
    }

    private static String getCorrectResponse() {
        int responseNum = random.nextInt(4) + 1;
        switch (responseNum) {
            case 1:
                return "Very good!";
            case 2:
                return "Excellent!";
            case 3:
                return "Nice work!";
            default:
                return "Keep up the good work!";
        }
    }

    private static String getIncorrectResponse() {
        int responseNum = random.nextInt(4) + 1;
        switch (responseNum) {
            case 1:
                System.out.println("No. Please try again.");
                break;
            case 2:
                System.out.println("Wrong. Try once more.");
                break;
            case 3:
                System.out.println("Don't give up!");
                break;
            case 4:
                System.out.println("No. Keep trying.");
                break;
        }
    }
}

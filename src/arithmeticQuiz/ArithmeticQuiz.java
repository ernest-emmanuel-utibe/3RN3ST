package arithmeticQuiz;
import java.security.SecureRandom;
import java.util.Scanner;
public class ArithmeticQuiz {
    private static final SecureRandom random = new SecureRandom();
    private static final Scanner scanner = new Scanner(System.in);


    static int getDifficulty() {
        System.out.print("Choose a difficulty level (1-4): ");
        return scanner.nextInt();
    }

    static int getProblemType() {
        System.out.println("Choose a problem type:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Random mixture");
        System.out.print("Enter your choice: ");
        return scanner.nextInt();
    }

    static int getRandomNumber(int difficulty) {
        int max = (int) Math.pow(10, difficulty) - 1;
        return random.nextInt(max) + 1;
    }

    static String getOperator(int problemType) {
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

    static int calculateAnswer(int num1, int num2, String operator) {
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

    static String getCorrectResponse() {
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

    static String getIncorrectResponse() {
        int responseNumberForIncorrectResponse = random.nextInt(4) + 1;
        switch (responseNumberForIncorrectResponse){
            case 1:
                return "Very bad";
            case 2:
                return "Worse";
            case 3:
                return "Dirty job";
            default:
                return "Do not try this again";
        }
    }
}

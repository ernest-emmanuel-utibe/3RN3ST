package Chapter5to7;
import java.security.SecureRandom;
import java.util.Scanner;

public class MultiplicationQuiz2 {
    private static SecureRandom random = new SecureRandom();
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int correctResponses = 0;
        int incorrectResponses = 0;
        int answer;

        do {
            int num1 = generateRandomNumber();
            int num2 = generateRandomNumber();

            askQuestion(num1, num2);

            answer = input.nextInt();

            while (answer != num1 * num2) {
                displayIncorrectResponse();
                incorrectResponses++;
                answer = input.nextInt();
            }

            displayCorrectResponse();
            correctResponses++;

        } while (true);

    }

    private static int generateRandomNumber() {
        return random.nextInt(9) + 1;
    }

    private static void askQuestion(int num1, int num2) {
        System.out.printf("How much is %d times %d?%n", num1, num2);
    }

    private static void displayCorrectResponse() {
        int response = random.nextInt(4);
        switch (response) {
            case 0:
                System.out.println("Very good!");
                break;
            case 1:
                System.out.println("Excellent!");
                break;
            case 2:
                System.out.println("Nice work!");
                break;
            case 3:
                System.out.println("Keep up the good work!");
                break;
        }
    }

    private static void displayIncorrectResponse() {
        int response = random.nextInt(4);
        switch (response) {
            case 0:
                System.out.println("No. Please try again.");
                break;
            case 1:
                System.out.println("Wrong. Try once more.");
                break;
            case 2:
                System.out.println("Don't give up!");
                break;
            case 3:
                System.out.println("No. Keep trying.");
                break;
        }
    }
}

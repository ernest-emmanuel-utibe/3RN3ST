package Chapter5to7;
import java.security.SecureRandom;
import java.util.Scanner;

public class MultiplicationQuiz {

    private static SecureRandom random = new SecureRandom();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        askQuestion();
    }

    private static void askQuestion() {
        int num1 = random.nextInt(10);
        int num2 = random.nextInt(10);
        int answer = num1 * num2;

        System.out.printf("How much is %d times %d?%n", num1, num2);
        while (true) {
            int guess = scanner.nextInt();
            if (guess == answer) {
                System.out.println("Very good!");
                askQuestion();
                return;
            } else {
                System.out.println("No. Please try again.");
            }
        }
    }
}


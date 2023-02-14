package Chapter5to7;
import java.security.SecureRandom;
import java.util.Scanner;

public class Exercise_6_37 {
    private static final SecureRandom random = new SecureRandom();
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int correctCount = 0;
        int incorrectCount = 0;
        int count = 0;
        while (true) {
            int number1 = random.nextInt(10);
            int number2 = random.nextInt(10);
            int answer = askQuestion(number1, number2);
            count++;
            if (answer == number1 * number2) {
                correctCount++;
                displayResponse(true);
            } else {
                incorrectCount++;
                displayResponse(false);
                while (answer != number1 * number2) {
                    answer = askQuestion(number1, number2);
                    count++;
                    incorrectCount++;
                }
                displayResponse(true);
                correctCount++;
            }
            if (count == 10) {
                double percentage = (double) correctCount / count * 100;
                System.out.printf("You got %d out of 10 questions correct (%.0f%%)%n", correctCount, percentage);
                if (percentage < 75) {
                    System.out.println("Please ask your teacher for extra help.");
                } else {
                    System.out.println("Congratulations, you are ready to go to the next level!");
                }
                correctCount = 0;
                incorrectCount = 0;
                count = 0;
            }
        }
    }

    public static int askQuestion(int number1, int number2) {
        System.out.printf("How much is %d times %d?%n", number1, number2);
        return input.nextInt();
    }

    public static void displayResponse(boolean isCorrect) {
        int response = random.nextInt(4) + 1;
        if (isCorrect) {
            switch (response) {
                case 1:
                    System.out.println("Very good!");
                    break;
                case 2:
                    System.out.println("Excellent!");
                    break;
                case 3:
                    System.out.println("Nice work!");
                    break;
                case 4:
                    System.out.println("Keep up the good work!");
                    break;
            }
        } else {
            switch (response) {
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
}

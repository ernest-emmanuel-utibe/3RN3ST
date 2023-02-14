package Chapter5to7;
import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        boolean playAgain = true;

        while (playAgain) {
            int numberToGuess = random.nextInt(1000) + 1;
            int guess;
            int numGuesses = 0;

            System.out.println("Guess a number between 1 and 1000:");
            do {
                guess = input.nextInt();
                numGuesses++;

                if (guess < numberToGuess) {
                    System.out.println("Too low. Try again.");
                } else if (guess > numberToGuess) {
                    System.out.println("Too high. Try again.");
                }
            } while (guess != numberToGuess);

            System.out.println("Congratulations. You guessed the number in " + numGuesses + " guesses!");

            System.out.println("Do you want to play again? (yes or no)");
            String playAgainStr = input.next().toLowerCase();
            playAgain = playAgainStr.equals("yes");
        }

        System.out.println("Thanks for playing!");
    }
}

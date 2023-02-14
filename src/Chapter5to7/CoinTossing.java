package Chapter5to7;
import java.util.Random;
import java.util.Scanner;

public class CoinTossing {
    enum Coin {
        HEADS,
        TAILS
    }

    public static void main(String[] args) {
        int headsCount = 0;
        int tailsCount = 0;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Press Enter to toss the coin, or type 'q' to quit");
            String input = scanner.nextLine();

            if (input.equals("q")) {
                break;
            }

            Coin result = flip();
            if (result == Coin.HEADS) {
                headsCount++;
            } else {
                tailsCount++;
            }

            System.out.println("The coin landed on " + result);
        }

        System.out.println("Heads count: " + headsCount);
        System.out.println("Tails count: " + tailsCount);
    }

    public static Coin flip() {
        Random random = new Random();
        int result = random.nextInt(2);

        if (result == 0) {
            return Coin.HEADS;
        } else {
            return Coin.TAILS;
        }
    }
}

package Chapter5to7;

import java.security.SecureRandom;

public class TortoiseAndHareMain {
    private static final SecureRandom secureRandom = new SecureRandom();

    public static void main(String[] args) throws InterruptedException {
        TortoiseAndHare tortoiseAndHare = new TortoiseAndHare();
        displayStart();
        while (true) {
            tortoiseAndHare.displayPath();
            tortoiseAndHare.makeMove();
            tortoiseAndHare.displayEnd();

            Thread.sleep(1000L);
        }
    }

    public static void displayStart() {
        int start = 1 + secureRandom.nextInt(2);

        if (start == 1) {
            System.out.println("BANG !!!");
        } else {
            System.out.println("AND THEY'RE OFF !!!");
        }
    }
}

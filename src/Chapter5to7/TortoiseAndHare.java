package Chapter5to7;

import java.security.SecureRandom;
import java.util.Arrays;

public class TortoiseAndHare {
    private final SecureRandom secureRandom = new SecureRandom();

    private final String[] path1 = new String[70];
    private final String[] path2 = new String[70];

    private int tortoisePosition = 1;
    private int harePosition = 1;

    public TortoiseAndHare() {
        Arrays.fill(path1, "");
        Arrays.fill(path2, "");
    }

    public String[] getPath1() {
        return path1;
    }


    public String[] getPath2() {
        return path2;
    }



    public void displayPath(){
        Arrays.fill(path1, "");
        Arrays.fill(path2, "");
        path1[tortoisePosition - 1] = "T";
        path2[harePosition - 1] = "H";

        System.out.println("Start");
        System.out.printf("(T, H) = (%d, %d)%n", tortoisePosition, harePosition);
        displayLine(68);
        for (int i = 0; i < path1.length; i++) {
            System.out.print(path1[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < path2.length; i++) {
            System.out.print(path2[i] + " ");
        }
        System.out.println();
        displayLine(68);
        System.out.printf("%71s%n", "End");
    }

    public void makeMove() {
        int randomT = 1 + secureRandom.nextInt(10);
        int randomH = 1 + secureRandom.nextInt(10);


        checkTortoiseMove(randomT);
        checkHareMove(randomH);

    }

    public void checkTortoiseMove(int move) {
        if (move >= 1 && move <= 5) {

            if (tortoisePosition < 67) {
                tortoisePosition += 3;
            }
            else {
                tortoisePosition = 70;
            }
        }

        if (move >= 6 && move <= 7) {
            if (tortoisePosition > 6) {
                tortoisePosition -= 6;
            }
            else {
                tortoisePosition = 1;
            }
        }

        if (move >= 8 && move <= 10) {
            tortoisePosition += 1;
        }
    }

    public void checkHareMove(int move) {
        if (move >= 1 && move <= 5) {

            if (harePosition < 67) {
                harePosition += 3;
            }
            else {
                harePosition = 70;
            }
        }

        if (move >= 6 && move <= 7) {
            if (harePosition > 6) {
                harePosition -= 6;
            }
            else {
                harePosition = 1;
            }
        }

        if (move >= 8 && move <= 10) {
            harePosition += 1;
        }
    }


    public int isWin() {
        if (tortoisePosition == 70 && harePosition != 70) {
            return 1;
        }
        else if (tortoisePosition != 70 && harePosition == 70) {
            return 2;

        }
        else if (tortoisePosition == 70 && harePosition == 70) {
            return 3;
        }
        else if (tortoisePosition == harePosition ) {
            return 4;
        }
        return 0;
    }

    public void displayLine(int len) {
        for (int i = 1; i <= len; i++) {
            System.out.print("-");
        }
        System.out.println();
    }

    public void displayStart() {
        int start = 1 + secureRandom.nextInt(2);

        if (start == 1) {
            System.out.println("BANG !!!");
        }
        else {
            System.out.println("AND THEY'RE OFF !!!");
        }
    }

    public void displayEnd() {
        int i = isWin();
        if (i == 1) {
            System.out.printf("(T, H) = (%d, %d)%n", tortoisePosition, harePosition);
            System.out.println("TORTOISE WIN YAY!!!");
            System.exit(0);
        }
        if (i == 2) {
            System.out.printf("(T, H) = (%d, %d)%n", tortoisePosition, harePosition);
            System.out.println("Hare wins");
            System.exit(0);

        }
        if (i == 3) {
            System.out.printf("(T, H) = (%d, %d)%n", tortoisePosition, harePosition);
            System.out.println("It's a tie");
        }

    }
}

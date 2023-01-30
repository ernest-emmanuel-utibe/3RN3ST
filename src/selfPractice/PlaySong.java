package selfPractice;

import java.util.Scanner;

public class PlaySong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isOnRepeat = true;
        while(isOnRepeat) {
            System.out.println("Playing current song");
            System.out.println("Would you like to take this song off of repeat? If so, type yes");
            String userInput = scanner.next();

            if (userInput.equals("yes")) {
                isOnRepeat = false;

                System.out.println("Playing next song");
            }
        }
    }
}

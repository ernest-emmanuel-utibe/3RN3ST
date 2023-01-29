package Chapter5to7;

public class DiamondPrinting {
    public static void main(String[] args) {
        for (int i = 0; i <= 5; i++) {
            System.out.print(" ".repeat(5 - i));
            System.out.print("*".repeat(2 * i + 1));
            System.out.println();
        }

        for(int i = 4; i >= 0; i--) {
            System.out.print(" ".repeat(5 - i));
            System.out.print("*".repeat(2 * i + 1));
            System.out.println();
        }
    }
}

package Chapter5to7;
import java.util.*;

public class Multiples {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("Enter two integers (or enter non-integers to exit): ");

            if (input.hasNextInt()) {
                int first = input.nextInt();
                int second = input.nextInt();

                if (isMultiple(first, second)) {
                    System.out.printf("%d is a multiple of %d%n", second, first);
                } else {
                    System.out.printf("%d is not a multiple of %d%n", second, first);
                }
            } else {
                break;
            }
        }
    }

    public static boolean isMultiple(int first, int second) {
        if (second % first == 0) {
            return true;
        } else {
            return false;
        }
    }

}

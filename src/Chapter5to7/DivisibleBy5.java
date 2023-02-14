package Chapter5to7;
import java.util.Scanner;
public class DivisibleBy5 {
    public static boolean isDivisible(int num) {
        return num % 5 == 0;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 10 integers: ");

        for (int i = 0; i < 10; i++) {
            int num = input.nextInt();
            if (isDivisible(num)) {
                System.out.println(num + " is divisible by 5");
            } else {
                System.out.println(num + " is not divisible by 5");
            }
        }
    }
}

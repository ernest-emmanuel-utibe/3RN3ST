package loops.forLoops;

public class SumOfDigits {
    public static void main(String[] args) {
        int result = 0;

        for (int i = 100; i <= 200; i++) {
            result += i;
        }
        System.out.println("Output of program is "+ result);
    }
}

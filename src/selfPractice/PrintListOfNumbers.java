package selfPractice;

public class PrintListOfNumbers {
    public static void main(String[] args) {
        int limit = 50;

        System.out.println("Printing numbers from 1 - 50");

        for (int i = 1;  i <= limit; i++){
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}

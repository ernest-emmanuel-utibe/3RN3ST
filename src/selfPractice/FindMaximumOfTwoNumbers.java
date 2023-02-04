package selfPractice;

public class FindMaximumOfTwoNumbers {
    public static void main(String args[]) {
        int i = Integer.parseInt(args[0]);

        int j = Integer.parseInt(args[1]);

        if (i > j) {
            System.out.println(i +" is greater than "+j);
        } else {
            System.out.println(j +" is greater than "+i);
        }
    }
}

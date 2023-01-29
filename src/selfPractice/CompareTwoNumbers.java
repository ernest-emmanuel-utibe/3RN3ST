package selfPractice;

public class CompareTwoNumbers {
    public static void main(String[] args) {
        int num1 = 324;
        int num2 = 234;

        if (num1 > num2) {
            System.out.println(num1 + " is greater than "+ num2);
        } else if (num1 < num2) {
            System.out.println(num1 + " is less than "+ num2);
        }
        else {
            System.out.println(num1 + " is equal to" + num2);
        }
    }
}

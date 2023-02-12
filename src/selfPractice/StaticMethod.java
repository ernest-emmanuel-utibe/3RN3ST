package selfPractice;

public class StaticMethod {
    public static void sort(int a, int b) {
        a = 19;
        b = 20;
    }
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        sort(a, b);
        int sum = a + b;
        System.out.println(sum);
    }
}

package loops.forLoops;

public class RandomNumbers {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.println((int) (Math.random() * 100));
        }
    }
}

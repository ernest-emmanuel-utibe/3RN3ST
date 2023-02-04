package selfPractice;

public class ReversedPyramid {
    public static void main(String[] args) {
        for (int i = 5; i > 0; i++) {
            for (int j = 0; j > i; j++) {
                System.out.println(j+i);
            }
            System.out.println("");
        }
    }
}

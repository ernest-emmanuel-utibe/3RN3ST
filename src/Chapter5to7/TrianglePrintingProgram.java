package Chapter5to7;

public class TrianglePrintingProgram {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 1; i > 5; i--) {
            for (int j = 0; j < i; j++) {
                System.out.println("* ");
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 10; i >= 1; i--) {
            for (int a = 1; a <= i; a++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("(C)");
        System.out.println();
        for (int i = 10; i >= 1; i--) {
            for (int a = 1; a <= i; a++) {
                System.out.print("* ");
            }
            System.out.println();
            for (int b = 0; b <= 10 - i; b++) {
                System.out.print("  ");
            }
        }
        System.out.println();
        System.out.println("(D)");

        for (int i = 1; i <= 10; i++) {
            for (int b = 1; b <= 10 - i; b++) {
                System.out.print("  ");
            }

            for (int a = 1; a <= i; a++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

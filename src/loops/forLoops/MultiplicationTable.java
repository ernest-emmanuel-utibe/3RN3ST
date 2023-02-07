package loops.forLoops;

public class MultiplicationTable {
    public static void main(String[] args) {
        System.out.println("        Multiplication Table");

        System.out.print("      ");
        for (int j = 1; j <= 10; j++) {
            System.out.print("     "+ j);

            System.out.println("\n---------------------------------------------------");


            for (int i = 1; i <= 10; i++) {
                System.out.print(i + " | ");
                for (int e = 1; e <= 10; e++) {
                    System.out.printf("%4d", i * e);
                }
                System.out.println();
            }
        }
    }
}

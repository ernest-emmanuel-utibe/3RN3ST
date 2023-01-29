package Chapter2To4;

public class Table_Of_Squares_And_Cubes {
    public static void main(String[] args) {
        int square = 0;
        int cube = 0;

        System.out.print("Number\tSquare\tCube");

        for (int i = 0; i <= 10; i++) {
            square = i * i;
            cube = i * i * i;

            System.out.printf("%n%3d%11d%12d", i, square, cube);
        }


    }
}

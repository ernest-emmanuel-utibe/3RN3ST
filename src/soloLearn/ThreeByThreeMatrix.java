package soloLearn;

public class ThreeByThreeMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {8, 1, 6},
                {3, 5, 7},
                {4, 9, 0}
        };

        // iterate over rows
        for (int i = 0; i < matrix.length; i++) {
            // iterate over columns
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.println(matrix[i][j]);
            }
        }
    }
}

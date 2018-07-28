package crack.tech.datastructures;

/**
 * 1.7 Write an algorithm such that
 * if an element in an MxN matrix is 0,
 * its entire row and column is set to 0
 */
public class Chap01Q07_MatrixZero {

    public void ZeroOut(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                if (matrix[row][col] == 0) {
                    for (int c = 0; c < cols; c++) matrix[row][c] = 0;
                    for (int r = 0; r < rows; r++) matrix[r][col] = 0;
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[][] matrix = Util.generateMatrix(3, 5);
        matrix[1][3]=0;

        System.out.println("Before");
        Util.printMatrix(matrix);

        Chap01Q07_MatrixZero app = new Chap01Q07_MatrixZero();
        app.ZeroOut(matrix);

        System.out.println("After");
        Util.printMatrix(matrix);
    }
}

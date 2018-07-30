package crack.tech.common;

import java.util.Arrays;

public class Util {

    public static void printArray(int[] array, String prefix) {
//        System.out.print(prefix);
//        for (int col = 0; col < array.length; col++) {
//            System.out.print(String.format("%3d, ", array[col]));
//        }
//        System.out.println();
        System.out.println(prefix + Arrays.toString(array));
    }

    public static int[] generateArray(int size) {
        return generateArray(size, 256);
    }

    public static int[] generateArray(int size, int max) {
        int[] array = new int[size];
        for (int col = 0; col < size; col++) {
            array[col] = (int) (Math.random() * max);
        }
        return array;
    }

    public static void printMatrix(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + ", ");
            }
            System.out.println();
        }
    }

    public static int[][] generateMatrix(int rows, int cols) {
        int[][] matrix = new int[rows][cols];
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                matrix[row][col] = (int) (Math.random() * 256);
            }
        }
        return matrix;
    }

}

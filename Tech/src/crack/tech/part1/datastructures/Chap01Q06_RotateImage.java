package crack.tech.part1.datastructures;

/**
 * 1.6 Given an image represented by an NxN matrix, where each pixel in the
 * image is 4 bytes, write a method to rotate the image by 90 degrees Can you do
 * this in place?
 * @author Kenneth
 */
public class Chap01Q06_RotateImage {

	public void rotateRight(int[][] matrix, int size) {
		for (int level = 0; level < size / 2; level++)
		{
			int top = level; int bottom = size - 1 - top;
			int left = level; int right = size - 1 - left;
			
			int row = top;
			for (int col = left; col < right; col++)
			{
				int saved = matrix[row][col];
				matrix[row][col] = matrix[bottom-(col-left)][left];
				matrix[bottom-(col-left)][left] = matrix[bottom][right-(col-left)];
				matrix[bottom][right-(col-left)] = matrix[row+(col-left)][right];
				matrix[row+(col-left)][right] = saved;
			}
		}
	}
	
	private static void printMatrix(int [][] matrix, int size)
	{
		for (int row = 0; row < size; row++)
		{
			for (int col = 0; col < size; col++)
			{
				System.out.print(matrix[row][col] + ", ");
			}
			System.out.println();
		}		
	}
	
	public static void main(String[] args) {
		int size = 3;
		int[][] matrix = new int[size][size];
		for (int row = 0; row < size; row++) {
			for (int col = 0; col < size; col++) {
				matrix[row][col] = (int) (Math.random() * 256);
			}
		}
		Chap01Q06_RotateImage app = new Chap01Q06_RotateImage();
		System.out.println("Before...");
		printMatrix(matrix, size);
		app.rotateRight(matrix, size);
		System.out.println("After...");
		printMatrix(matrix, size);
	}

}

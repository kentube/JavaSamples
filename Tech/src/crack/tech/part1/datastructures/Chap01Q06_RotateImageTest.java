package crack.tech.part1.datastructures;

import static org.junit.Assert.assertArrayEquals;
//import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Chap01Q06_RotateImageTest {

	private Chap01Q06_RotateImage _system;
	//private Chap01Q06_RotateImage _system;

	@Before
	public void setUp() throws Exception {
		_system = new Chap01Q06_RotateImage();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testRotateRight3() {
		int[][] matrix = new int[][] {
			new int[] {161, 175, 107}, 
			new int[] {23, 44, 216}, 
			new int[] {46, 173, 185} 
		};
		int[][] expect = new int[][] {
			new int[] {46, 23, 161}, 
			new int[] {173, 44, 175}, 
			new int[] {185, 216, 107} 
		};
		_system.rotateRight(matrix, 3);
		assertArrayEquals(expect, matrix);
	}

	@Test
	public void testRotateRight4() {
		int[][] matrix = new int[][] {
			new int[] {161, 175, 107, 217}, 
			new int[] {23, 44, 216, 190}, 
			new int[] {118, 231, 140, 29}, 
			new int[] {46, 173, 185, 106} 
		};
		int[][] expect = new int[][] {
			new int[] {46, 118, 23, 161}, 
			new int[] {173, 231, 44, 175}, 
			new int[] {185, 140, 216, 107}, 
			new int[] {106, 29, 190, 217} 
		};
		_system.rotateRight(matrix, 4);
		assertArrayEquals(expect, matrix);
	}

}

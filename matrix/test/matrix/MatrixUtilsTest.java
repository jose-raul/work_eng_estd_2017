package matrix;

import org.junit.Assert;
import org.junit.Test;

public class MatrixUtilsTest {

	@Test
	public void testPow() {
		MatrixUtils matrixUtils = new MatrixUtils();
		double matrix[][] = { { 1, 2, 3 }, { 4, 5, 6 } };
		double result[][] = matrixUtils.pow(matrix);
		double expected[][] = { { 1, 4, 9 }, { 16, 25, 36 } };

		Assert.assertArrayEquals(expected, result);

	}

}

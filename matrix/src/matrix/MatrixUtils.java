package matrix;

public class MatrixUtils {

	public double[][] pow(double matrix[][]) {

		for (int line = 0; line < matrix.length; line++) {
			for (int column = 0; column < matrix[line].length; column++) {
				matrix[line][column] = Math.pow(matrix[line][column], 2);
			}
		}

		return matrix;
	}

}

package matrix;

public class Matrix {

	public static void main(String[] args) {

		int[][] matrix = new int[4][5];

		matrix[0][0] = 2;
		matrix[0][1] = 4;

		for (int line = 0; line < matrix.length; line++) {
			for (int column = 0; column < matrix[line].length; column++) {
				System.out.println(matrix[line][column]);
			}
		}

		/*
		 * System.out.println(matrix.length);
		 * System.out.println(Arrays.deepToString(matrix));
		 */
	}

}

package exer;

public class Q2 {

	public int q2(int[][] m) {
		int min = m[0][0];
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				min = Math.min(min, m[i][j]);
			}
		}
		return min;
	}

}

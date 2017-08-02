package exer;

public class Q4 {

	public void q4(int[][] m) {

		for (int i = 0; i < m[0].length; i++) {
			int aux = m[0][i]; 
			m[0][i] = m[1][i];
			m[1][i] = aux;
		}

	}
	
}

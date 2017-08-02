package exer;

public class Q6 {

	public void q6(int[][] m) {
		for (int i = 0; i < m.length; i++) {
			int aux = m[i][0];
			m[i][0] = m[i][1];
			m[i][1] = aux;
		}
	}
	
}

package estd;

public class Q3 {

	public boolean q3(int[] n) {
		int soma = 0;
		
		for (int i : n) {
			if (i == 3) {
				soma += i;
			}
		}

		return soma == 9;
	}
}

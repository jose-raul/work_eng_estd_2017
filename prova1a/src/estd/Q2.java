package estd;

public class Q2 {

	public int[] q2(int[] n) {
		int m[] = new int[n.length];
		int counter = n.length - 1;
		
		for (int i : n) {
			m[counter] = i;
			counter--;
		}
		
		return m;
	}
	
}

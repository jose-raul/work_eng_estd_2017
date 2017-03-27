package estd;

public class Q4 {

	public int q4(int[] n){
		int result = n[0];
		
		for (int i : n) {
			if(i < result) {
				result = i;
			}
		}
		return result;
	}
	
}

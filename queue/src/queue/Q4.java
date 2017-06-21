package queue;

public class Q4 {

	public Queue<Integer> q4 (int n) {
		Queue<Integer> result = new ArrayQueue<>();
		
		for (int i = 1; i < n; i++) {
			result.enqueue(i);
		}
		
		return result;
	}
	
}

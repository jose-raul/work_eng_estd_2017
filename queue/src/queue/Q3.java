package queue;

public class Q3 {

	public int q3(Queue<Integer> queue) {
		int result = 0;

		while (!queue.isEmpty()) {
			result += queue.dequeue();
		}

		return result;
	}

}

package queue;

public class Q1 {

	public Queue<Character> q1(Queue<Character> queue) {
		Queue<Character> result = new ArrayQueue<>();

		while (!queue.isEmpty()) {
			Character ch = queue.dequeue();
			if (ch.equals('a') || ch.equals('e') || ch.equals('i') || ch.equals('o') || ch.equals('u')) {
				result.enqueue(ch);
			}
		}

		return result;
	}

}

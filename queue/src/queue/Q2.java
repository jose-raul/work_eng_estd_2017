package queue;

public class Q2 {

	public Queue<Double> q2(Double[] a, Double[] b) {
		Queue<Double> result = new ArrayQueue<>();

		for (Double dec : a) {
			result.enqueue(Math.pow(dec, 3));
		}

		for (Double dec : b) {
			result.enqueue(Math.pow(dec, 3));
		}

		return result;
	}

}

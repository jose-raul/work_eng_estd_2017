package exer;

import org.junit.Assert;
import org.junit.Test;

public class Q6Test {

	
	@Test
	public void q6Test() {
		Q6 q6 = new Q6();
		int[][] m = { { 2, 4, 6 }, { 3, 5, 7 }, { 8, 10, 12 } };
		int[][] expected = { { 4, 2, 6 }, { 5, 3, 7 }, { 10, 8, 12 } };

		q6.q6(m);

		Assert.assertArrayEquals(expected, m);

	}
}

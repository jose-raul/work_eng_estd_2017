package exer;

import org.junit.Assert;
import org.junit.Test;

public class Q5Test {

	@Test
	public void q5Test() {
		Q5 q5 = new Q5();
		int[][] m = { { 2, 4, 6 }, { 3, 5, 7 }, { 8, 10, 12 } };
		int[][] expected = { { 4, 4, 6 }, { 5, 5, 7 }, { 10, 10, 12 } };

		q5.q5(m);

		Assert.assertArrayEquals(expected, m);

	}

}

package exer;

import org.junit.Assert;
import org.junit.Test;

public class Q3Test {

	@Test
	public void q3Test() {
		Q3 q3 = new Q3();
		int[][] m = { { 2, 4, 6 }, { 3, 5, 7 }, { 8, 10, 12 } };
		int[][] expected = { { 3, 5, 7 }, { 3, 5, 7 }, { 8, 10, 12 } };

		q3.q3(m);

		Assert.assertArrayEquals(expected, m);
		
	}

}

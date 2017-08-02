package exer;

import org.junit.Assert;
import org.junit.Test;

public class Q4Test {

	@Test
	public void q4Test() {
		Q4 q4 = new Q4();
		int[][] m = { { 2, 4, 6 }, { 3, 5, 7 }, { 8, 10, 12 } };
		int[][] expected = { { 3, 5, 7 }, { 2, 4, 6 }, { 8, 10, 12 } };

		q4.q4(m);

		Assert.assertArrayEquals(expected, m);
		
	}
	
}

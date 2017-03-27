package estd;

import org.junit.Assert;
import org.junit.Test;

public class Q2Test {

	@Test
	public void q2Test() {
		Q2 q = new Q2();
		int[] n = { 1, 2, 3 };
		int[] result = q.q2(n);
		int[] expected = { 3, 2, 1 };

		Assert.assertArrayEquals(expected, result);
	}

}

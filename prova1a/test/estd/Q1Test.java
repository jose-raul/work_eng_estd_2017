package estd;

import org.junit.Assert;
import org.junit.Test;

public class Q1Test {

	@Test
	public void q1Test() {
		Q1 q = new Q1();
		int[] n = { 2, 6, 6, 9, 2 };
		boolean result = q.q1(n);
		Assert.assertTrue(result);

		int[] m = { 2, 6, 6, 9, 4 };
		result = q.q1(m);
		Assert.assertFalse(result);
	}

}

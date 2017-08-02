package exer;

import org.junit.Assert;
import org.junit.Test;

public class Q2Test {

	@Test
	public void q2Test() {
		Q2 q2 = new Q2();
		int[][] m = { { 1, 2, 3 }, { 4, 5, 6 } };
		int result = q2.q2(m);
		Assert.assertTrue(result == 1);
	}

}

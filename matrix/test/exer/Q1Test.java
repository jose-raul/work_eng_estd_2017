package exer;

import org.junit.Assert;
import org.junit.Test;

public class Q1Test {

	@Test
	public void q1Test() {
		Q1 q1 = new Q1();
		int[][] m = { { 1, 2, 3 }, { 4, 5, 6 } };
		int result = q1.q1(m);
		Assert.assertTrue(result == 21);
	}

}

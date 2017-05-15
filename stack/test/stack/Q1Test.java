package stack;

import org.junit.Assert;
import org.junit.Test;


public class Q1Test {

	@Test
	public void invertTest() {
		Q1 q1 = new Q1();

		String result = q1.invert("abc");

		Assert.assertEquals("cba", result);

	}

}

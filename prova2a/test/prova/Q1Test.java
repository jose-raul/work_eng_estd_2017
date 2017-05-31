package prova;

import java.util.Stack;

import org.junit.Assert;
import org.junit.Test;

public class Q1Test {

	@Test
	public void q1Test() {
		Q1 q1 = new Q1();

		int[] a = { 1, 2, 3 };
		int[] b = { 4, 5, 6 };

		Stack<Integer> result = q1.q1(a, b);

		Assert.assertTrue(result.size() == 6);
		Assert.assertEquals(result.pop(), Integer.valueOf(6));
		Assert.assertEquals(result.pop(), Integer.valueOf(5));
	}

}

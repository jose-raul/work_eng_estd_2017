package exercicio;

import org.junit.Assert;
import org.junit.Test;

import stack.Stack;

public class P1Test {

	@Test
	public void toStackTest() {
		P1 p1 = new P1();
		int[] n = { 2, 4, 6 };

		Stack<Integer> result = p1.toStack(n);
		
		Assert.assertTrue(result.getSize() == 3);
		Assert.assertTrue(result.pop().equals(6));
		Assert.assertTrue(result.pop().equals(4));
		Assert.assertTrue(result.pop().equals(2));
		
	}

}

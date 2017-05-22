package exercicio;

import org.junit.Assert;
import org.junit.Test;

import stack.ArrayStack;
import stack.Stack;

public class P3Test {

	@Test
	public void toArrayTest() {
		P3 p3 = new P3();
		Stack<Integer> stack = new ArrayStack<>();
		stack.push(2);
		stack.push(3);
		stack.push(4);
		int[] result = p3.toArray(stack);

		Assert.assertTrue(result[0] == 4);
		Assert.assertTrue(result[1] == 2);

	}

}

package exercicio;

import org.junit.Assert;
import org.junit.Test;

import stack.ArrayStack;
import stack.Stack;

public class P5Test {

	@Test
	public void cloneTest() {
		Stack<String> stack = new ArrayStack<>();
		stack.push("A");
		stack.push("B");
		stack.push("C");
		stack.push("D");

		Stack<String> clone = stack.cloneStack();
		Assert.assertTrue(clone.getSize() == stack.getSize());
		
		while (!stack.isEmpty()) {
			Assert.assertEquals(stack.pop(), clone.pop());
		}

	}
}

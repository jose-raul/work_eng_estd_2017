package exercicio;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import stack.ArrayStack;
import stack.Stack;

public class P4Test {

	@Test
	public void clearTest() {
		Stack<String> stack = new ArrayStack<>();
		stack.push("A");
		stack.push("B");
		stack.push("C");
		stack.push("D");

		List<String> result = stack.clear();
		
		Assert.assertTrue(result.size() == 4);
		Assert.assertTrue(result.get(0).equals("D"));
		Assert.assertTrue(result.get(1).equals("C"));
		Assert.assertTrue(result.get(2).equals("B"));
		Assert.assertTrue(result.get(3).equals("A"));

	}
}

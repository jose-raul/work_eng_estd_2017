package exercicio;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import stack.ArrayStack;
import stack.Stack;

public class P2Test {

	@Test
	public void popnTest() {
		Stack<String> stack = new ArrayStack<>();
		stack.push("A");
		stack.push("B");
		stack.push("C");

		List<String> result = stack.pop(2);
		
		Assert.assertTrue(result.size() == 2);
		Assert.assertTrue(result.get(0).equals("C"));
		Assert.assertTrue(result.get(1).equals("B"));

	}
	
	@Test
	public void popnFullTest() {
		Stack<String> stack = new ArrayStack<>();
		stack.push("A");
		stack.push("B");

		List<String> result = stack.pop(3);
		
		Assert.assertTrue(result.size() == 2);
		Assert.assertTrue(result.get(0).equals("B"));
		Assert.assertTrue(result.get(1).equals("A"));

	}	

}

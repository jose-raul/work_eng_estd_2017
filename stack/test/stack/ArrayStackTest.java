package stack;

import org.junit.Assert;
import org.junit.Test;


public class ArrayStackTest {

	@Test
	public void pushTest() {

		Stack<String> stack = new ArrayStack<>();
		
		Assert.assertTrue(stack.isEmpty());
		Assert.assertEquals(0, stack.getSize());

		
		stack.push("A");
		stack.push("B");
		stack.push("C");
		
		Assert.assertFalse(stack.isEmpty());
		Assert.assertEquals(3, stack.getSize());
		
	}
	
	@Test
	public void topTest() {

		Stack<String> stack = new ArrayStack<>();
		stack.push("A");
		stack.push("B");
		stack.push("C");
		
		Assert.assertEquals("C", stack.top());
		Assert.assertEquals("C", stack.top());
		Assert.assertEquals(3, stack.getSize());
	}	

}

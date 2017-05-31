package prova;

import java.util.Stack;

import org.junit.Assert;
import org.junit.Test;

public class Q4Test {

	@Test
	public void q4Test() {
		Q4 q4 = new Q4();
		
		Stack<Integer> a = new Stack<>();
		Stack<Integer> b = new Stack<>();
		
		a.push(1);
		a.push(2);
		a.push(3);
		
		b.push(1);
		b.push(2);
		b.push(3);
		
		boolean result = q4.q4(a, b);
		Assert.assertTrue(result);
		
		a.push(1);
		a.push(2);
		a.push(3);
		
		b.push(1);
		b.push(3);
		b.push(3);		
		
		result = q4.q4(a, b);
		Assert.assertFalse(result);
	}
	
}

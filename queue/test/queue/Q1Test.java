package queue;

import org.junit.Assert;
import org.junit.Test;

public class Q1Test {

	@Test
	public void q1Test() {
		Q1 questao = new Q1();
		
		Queue<Character> queue = new ArrayQueue<>();
		queue.enqueue('a');
		queue.enqueue('b');
		queue.enqueue('e');
		queue.enqueue('f');

		Queue<Character> result = questao.q1(queue);
		
		Assert.assertTrue(result.getSize() == 2);
		Assert.assertEquals(Character.valueOf('a'), result.dequeue());
		Assert.assertEquals(Character.valueOf('e'), result.dequeue());
		
	}
	
}

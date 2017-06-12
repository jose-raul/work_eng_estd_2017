package queue;

import org.junit.Assert;
import org.junit.Test;

public class ArrayQueueTest {

	@Test
	public void enqueueTest() {
		Queue<Integer> queue = new ArrayQueue<>(); 
		Assert.assertTrue(queue.isEmpty());
		
		queue.enqueue(1);
		queue.enqueue(2);
		queue.enqueue(3);
		
		Assert.assertTrue(queue.getSize() == 3);
		Assert.assertFalse(queue.isEmpty());
	}
	
	@Test
	public void dequeueTest() {
		Queue<Integer> queue = new ArrayQueue<>(); 
		
		queue.enqueue(1);
		queue.enqueue(2);
		queue.enqueue(3);

		Assert.assertEquals(Integer.valueOf(1), queue.dequeue());
		Assert.assertEquals(Integer.valueOf(2), queue.dequeue());
		Assert.assertEquals(Integer.valueOf(3), queue.dequeue());
	}	
	
	@Test
	public void frontTest() {
		Queue<Integer> queue = new ArrayQueue<>(); 
		
		queue.enqueue(1);
		queue.enqueue(2);
		queue.enqueue(3);

		Assert.assertEquals(Integer.valueOf(1), queue.front());
		Assert.assertTrue(queue.getSize() == 3);
		
		Assert.assertEquals(Integer.valueOf(1), queue.front());
		Assert.assertTrue(queue.getSize() == 3);
	}	
	
	
	@Test
	public void circularTest() {
		Queue<Integer> queue = new ArrayQueue<>(7); 
		Assert.assertTrue(queue.isEmpty());
		
		queue.enqueue(1);
		queue.enqueue(2);
		queue.enqueue(3);
		queue.enqueue(4);
		queue.enqueue(5);
		queue.enqueue(6);
		queue.enqueue(7);
		
		queue.dequeue();
		queue.dequeue();
		queue.dequeue();
		queue.dequeue();
		
		queue.enqueue(8);
	}
		
}

package estd;

import org.junit.Assert;
import org.junit.Test;

public class DLinkedListTest {



	@Test
	public void addFirstTest() {
		DLinkedList<String> linkedList = new DLinkedList<>();
		DNode<String> nodeA = new DNode<>("A");
		DNode<String> nodeB = new DNode<>("B");
		DNode<String> nodeC = new DNode<>("C");
		linkedList.addFirst(nodeA);
		linkedList.addFirst(nodeB);
		linkedList.addFirst(nodeC);	
		Assert.assertEquals(3, linkedList.getSize());
		
		Assert.assertEquals(linkedList.getFirst(), nodeC);
		Assert.assertEquals(linkedList.getLast(), nodeA);
		
	}
	
	@Test
	public void addLastTest() {
		DLinkedList<String> linkedList = new DLinkedList<>();
		DNode<String> nodeA = new DNode<>("A");
		DNode<String> nodeB = new DNode<>("B");
		DNode<String> nodeC = new DNode<>("C");
		linkedList.addLast(nodeA);
		linkedList.addLast(nodeB);
		linkedList.addLast(nodeC);	
		Assert.assertEquals(3, linkedList.getSize());
		
		Assert.assertEquals(linkedList.getFirst(), nodeA);
		Assert.assertEquals(linkedList.getLast(), nodeC);
		
	}	

}

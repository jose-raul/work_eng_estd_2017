package q6;

import org.junit.Assert;
import org.junit.Test;



public class Q6Test {

	@Test
	public void invertTest() {
		DLinkedList<String> linkedList = new DLinkedList<>();
		DNode<String> nodeA = new DNode<>("A");
		DNode<String> nodeB = new DNode<>("B");
		DNode<String> nodeC = new DNode<>("C");
		linkedList.addLast(nodeA);
		linkedList.addLast(nodeB);
		linkedList.addLast(nodeC);
		
		DLinkedList<String> result = Q6.invert(linkedList);
		
		Assert.assertEquals(linkedList.getSize(), result.getSize());
		
		DNode<String> current = linkedList.getFirst();
		DNode<String> current2 = result.getLast();
		
		while (current != null) {
			Assert.assertEquals(current.getValue(), current2.getValue());
			current = current.getNext();
			current2 = current2.getPrev();
		}
		
		
	}
	
}

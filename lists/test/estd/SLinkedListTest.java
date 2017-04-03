package estd;

import org.junit.Assert;
import org.junit.Test;

public class SLinkedListTest {

	@Test
	public void getSizeTest(){
		SLinkedList<String> linkedList = new SLinkedList<>();
		Node<String> nodeA = new Node<>("A");
		Node<String> nodeB = new Node<>("B");
		Node<String> nodeC = new Node<>("C");
		linkedList.add(nodeA);
		linkedList.add(nodeB);
		linkedList.add(nodeC);
		
		Assert.assertEquals(3, linkedList.getSize());
		
	}
	
}


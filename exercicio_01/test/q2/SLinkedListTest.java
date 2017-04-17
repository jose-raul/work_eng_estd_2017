package q2;

import org.junit.Assert;
import org.junit.Test;

public class SLinkedListTest {

	@Test
	public void searchTest() {
		SLinkedList<String> linkedList = new SLinkedList<>();
		Node<String> nodeA = new Node<>("A");
		Node<String> nodeB = new Node<>("B");
		Node<String> nodeC = new Node<>("C");
		linkedList.add(nodeA);
		linkedList.add(nodeB);
		linkedList.add(nodeC);

		int height = linkedList.getNodeHeight(nodeB);
		Assert.assertTrue(height == 1);
		
		height = linkedList.getNodeHeight(nodeC);
		Assert.assertTrue(height == 0);

		height = linkedList.getNodeHeight(nodeA);
		Assert.assertTrue(height == 2);
		
		height = linkedList.getNodeHeight(new Node<>("D"));
		Assert.assertTrue(height == -1);
		
	}

}

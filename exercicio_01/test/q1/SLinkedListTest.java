package q1;

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

		Node<String> searchResult = linkedList.search("A");
		Assert.assertEquals(nodeA, searchResult);
		
		searchResult = linkedList.search("F");
		Assert.assertNull(searchResult);
	}

}

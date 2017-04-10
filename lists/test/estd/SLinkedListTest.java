package estd;

import org.junit.Assert;
import org.junit.Test;

public class SLinkedListTest {

	@Test
	public void printTest() {
		SLinkedList<String> linkedList = new SLinkedList<>();
		Node<String> nodeA = new Node<>("A");
		Node<String> nodeB = new Node<>("B");
		Node<String> nodeC = new Node<>("C");
		linkedList.add(nodeA);
		linkedList.add(nodeB);
		linkedList.add(nodeC);
		// imprimir elementos

		Node<String> current = linkedList.getFirst();
		while (current != null) {
			System.out.println(current.getValue());
			current = current.getNext();
		}

	}

	@Test
	public void getSizeTest() {
		SLinkedList<String> linkedList = new SLinkedList<>();
		Node<String> nodeA = new Node<>("A");
		Node<String> nodeB = new Node<>("B");
		Node<String> nodeC = new Node<>("C");
		linkedList.add(nodeA);
		linkedList.add(nodeB);
		linkedList.add(nodeC);

		Assert.assertEquals(linkedList.getFirst(), nodeA);
		Assert.assertEquals(linkedList.getLast(), nodeC);
		Assert.assertEquals(3, linkedList.getSize());

	}

	@Test
	public void removeFirstTest() {
		SLinkedList<String> linkedList = new SLinkedList<>();
		Node<String> nodeA = new Node<>("A");
		Node<String> nodeB = new Node<>("B");
		Node<String> nodeC = new Node<>("C");
		linkedList.add(nodeA);
		linkedList.add(nodeB);
		linkedList.add(nodeC);
		Assert.assertEquals(3, linkedList.getSize());

		linkedList.removeFirst();
		Assert.assertEquals(linkedList.getFirst(), nodeB);
		Assert.assertEquals(linkedList.getLast(), nodeC);
		Assert.assertEquals(2, linkedList.getSize());
	}

}

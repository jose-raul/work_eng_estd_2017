package estd;

import org.junit.Assert;
import org.junit.Test;

public class SLinkedListTest {

	@Test
	public void printTest() {
		List<String> linkedList = new SLinkedList<>();
		linkedList.add("A");
		linkedList.add("B");
		linkedList.add("B");
		
		for (String string : linkedList) {
			System.out.println(string);
		}
	}

	@Test
	public void getSizeTest() {
		SLinkedList<String> linkedList = new SLinkedList<>();
		linkedList.add("A");
		linkedList.add("B");
		linkedList.add("C");

		Assert.assertEquals(3, linkedList.getSize());

	}

	@Test
	public void removeFirstTest() {
		SLinkedList<String> linkedList = new SLinkedList<>();
		linkedList.add("A");
		linkedList.add("B");
		linkedList.add("C");
		Assert.assertEquals(3, linkedList.getSize());
	}

}

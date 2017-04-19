package q6;

public class Q6 {

	public static DLinkedList<String> invert(DLinkedList<String> list) {
		DLinkedList<String> result = new DLinkedList<>();

		DNode<String> node = list.getFirst();
		while (node != null) {
			DNode<String> temp = new DNode<String>(node.getValue());
			result.addFirst(temp);
			node = node.getNext();			
		}
		
		return result;

	}

}

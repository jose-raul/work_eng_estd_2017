package q7;

public class Q7 {

	
	public static SLinkedList<String> convert (String[] s) {
		SLinkedList<String> result = new SLinkedList<>();

		for (String string : s) {
			Node<String> node = new Node<String>(string);
			result.add(node);
		}
		
		return result;
	}
	
}

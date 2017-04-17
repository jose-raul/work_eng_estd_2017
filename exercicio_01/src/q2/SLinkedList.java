package q2;


public class SLinkedList<T> {

	private Node<T> first;

	private Node<T> last;
	
	private long size;

	public int getNodeHeight(Node<T> node) {
		int result = -1;
		boolean countStarted = false;
		Node<T> current = this.getFirst();
		
		while (current != null) {
			if (current.equals(node)) {
				countStarted = true;
			}
			if (countStarted) {
				result++;
			}
			current = current.getNext();
		}		
		return result;
	}
	
	
	public void add(Node<T> node) {
		if (isEmpty()) {
			first = node;
			last = node;
		} else {
			last.setNext(node);
			last = node;
		}
		size++;
	}
	
	public void removeFirst() {
		if (!isEmpty()) {
			first = first.getNext();
			size--;
			if (isEmpty()) {
				last = first;
			}
		}
	}


	public long getSize() {
		return size;
	}
	
	public boolean isEmpty() {
		return size == 0;
	}

	public Node<T> getFirst() {
		return first;
	}

	public Node<T> getLast() {
		return last;
	}
	
}

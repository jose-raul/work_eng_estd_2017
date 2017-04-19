package q7;

public class SLinkedList<T> {

	private Node<T> first;

	private Node<T> last;
	
	private long size;
	
	
	public Node<T> search(T value) {
		Node<T> current = this.getFirst();
		
		while (current != null) {
			if (current.getValue().equals(value)) {
				return current;
			}
			current = current.getNext();
		}		
		
		return null;
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

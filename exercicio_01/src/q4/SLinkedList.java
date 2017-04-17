package q4;

import q1.Node;

public class SLinkedList<T> {

	private Node<T> first;

	private Node<T> last;

	private long size;

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

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof SLinkedList)) {
			return false;
		}

		SLinkedList temp = (SLinkedList) obj;

		if (this.getSize() != temp.getSize()) {
			return false;
		}

		Node<T> current = this.getFirst();
		Node<T> currentTemp = temp.getFirst();

		while (current != null) {
			if (current != currentTemp) {
				return false;
			}
			current = current.getNext();
			currentTemp = currentTemp.getNext();
		}

		return true;
	}
}

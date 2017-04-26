package estd;

import java.util.Iterator;

public class SLinkedList<T> implements List<T> {

	private Node<T> first;

	private Node<T> last;

	private long size;

	@Override
	public boolean contains(T value) {
		for (T t : this) {
			if(value != null && value.equals(t)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public void add(T value) {
		Node<T> node = new Node<T>(value);
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

	@Override
	public long getSize() {
		return size;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	@Override
	public Iterator<T> iterator() {
		return new Iterator<T>() {
			Node<T> current = first;

			@Override
			public boolean hasNext() {
				return current != null;
			}

			@Override
			public T next() {
				T value = current.getValue();
				current = current.getNext();
				return value;
			}
		};
	}

}

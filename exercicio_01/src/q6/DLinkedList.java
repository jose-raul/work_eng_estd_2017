package q6;

public class DLinkedList<T> {

	private DNode<T> first;

	private DNode<T> last;
	
	private long size;

	public void addLast(DNode<T> node) {
		if (isEmpty()) {
			first = node;
			last = node;
		} else {
			last.setNext(node);
			node.setPrev(last);
			last = node;
		}
		size++;
	}
	
	public void addFirst(DNode<T> node) {
		if (isEmpty()) {
			first = node;
			last = node;
		} else {
			node.setNext(first);
			first.setPrev(node);
			first = node;
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

	public DNode<T> getFirst() {
		return first;
	}

	public DNode<T> getLast() {
		return last;
	}
	
}

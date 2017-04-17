package q2;

public class Node<T> {

	private Node<T> next;

	private T value;

	public Node (T t) {
		setValue(t);
	}
	
	public Node<T> getNext() {
		return next;
	}

	public void setNext(Node<T> next) {
		this.next = next;
	}

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}
	
}

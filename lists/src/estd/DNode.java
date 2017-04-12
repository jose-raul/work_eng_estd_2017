package estd;

public class DNode<T> {

	private DNode<T> next;

	private DNode<T> prev;
	
	private T value;

	public DNode (T t) {
		setValue(t);
	}
	
	public DNode<T> getNext() {
		return next;
	}

	public void setNext(DNode<T> next) {
		this.next = next;
	}

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}

	public DNode<T> getPrev() {
		return prev;
	}

	public void setPrev(DNode<T> prev) {
		this.prev = prev;
	}
	
}

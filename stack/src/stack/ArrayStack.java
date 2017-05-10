package stack;

public class ArrayStack<E> implements Stack<E> {

	private E[] array = (E[]) new Object[20];

	private int position = 0;
	
	public ArrayStack() {

	}

	public ArrayStack(int size) {

	}


	@Override
	public void push(E e) {
		array[position] = e;
		position++;
	}

	@Override
	public E top() {
		return array[position - 1];
	}

	@Override
	public E pop() {
		E temp = array[position - 1];
		array[position - 1] = null;
		position--;
		return temp;
	}

	@Override
	public int getSize() {
		return position;
	}

	@Override
	public boolean isEmpty() {
		return position == 0;
	}
}

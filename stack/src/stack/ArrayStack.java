package stack;

public class ArrayStack<E> implements Stack<E> {

	private E[] array;

	private int position = 0;

	public ArrayStack() {
		array = (E[]) new Object[20];
	}

	public ArrayStack(int size) {
		if (size <= 0) {
			throw new IllegalArgumentException();
		}
		array = (E[]) new Object[size];
	}

	@Override
	public void push(E e) {
		
		if(position == array.length) {
			E[] temp = (E[]) new Object[array.length * 2];
			System.arraycopy(array, 0, temp, 0, array.length);
			array = temp;
		}
		
		array[position] = e;
		position++;
	}

	@Override
	public E top() {
		if (isEmpty()) {
			return null;
		} else {
			return array[position - 1];
		}
	}

	@Override
	public E pop() {
		if (isEmpty()) {
			return null;
		} else {
			E temp = array[position - 1];
			array[position - 1] = null;
			position--;
			return temp;
		}
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

package queue;

import java.util.Arrays;

public class ArrayQueue<E> implements Queue<E> {

	private E[] array;

	private int head = 0;

	private int tail = 0;

	private int size = 0;

	public ArrayQueue() {
		array = (E[]) new Object[20];
	}

	public ArrayQueue(int size) {
		array = (E[]) new Object[size];
	}

	@Override
	public void enqueue(E e) {
		array[tail] = e;
		tail++;
		size++;
		System.out.println(Arrays.toString(array));
	}

	@Override
	public E dequeue() {
		if (isEmpty()) {
			return null;
		} else {
			E aux = array[head];
			array[head] = null;
			head++;
			size--;
			System.out.println(Arrays.toString(array));
			return aux;
		}
	}

	@Override
	public E front() {
		return array[head];
	}

	@Override
	public boolean isEmpty() {
		return size == 0;
	}

	@Override
	public int getSize() {
		return size;
	}
}

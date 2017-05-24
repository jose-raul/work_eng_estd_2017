package stack;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedStack<E> implements Stack<E> {

	private List<E> list = new LinkedList<>();

	@Override
	public void push(E e) {
		list.add(e);
	}

	@Override
	public E top() {
		if (isEmpty()) {
			return null;
		} else {
			return list.get(list.size() - 1);
		}
	}

	@Override
	public E pop() {
		if (isEmpty()) {
			return null;
		} else {
			return list.remove(list.size() - 1);
		}
	}

	@Override
	public int getSize() {
		return list.size();
	}

	@Override
	public boolean isEmpty() {
		return list.isEmpty();
	}

	@Override
	public List<E> pop(int n) {
		List<E> result = new ArrayList<>();
		
		for (int i = 0; i < n; i++) {
			E aux = pop();
			result.add(aux);
			if (isEmpty()) {
				break;
			}
		}

		return result;
	}

	@Override
	public List<E> clear() {
		return pop(getSize());
	}

	@Override
	public Stack<E> cloneStack() {
		Stack<E> clone = new ArrayStack<>();
		for (E e : list) {
			clone.push(e);
		}
		return clone;
	}

}

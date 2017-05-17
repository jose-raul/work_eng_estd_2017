package stack;

import java.util.List;

public interface Stack<E> {

	void push(E e);
	
	E top();
	
	E pop();
	
	int getSize();
	
	boolean isEmpty();
	
	List<E> pop(int n);
	
	List<E> clear();
	
	Stack<E> cloneStack();
	
}

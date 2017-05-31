package prova;

import java.util.Stack;

public class Q1 {

	public Stack<Integer> q1 (int[] a, int[] b) {
		
		Stack<Integer> stack = new Stack<>();
		
		for (int i : a) {
			stack.push(i);
		}

		for (int i : b) {
			stack.push(i);
		}
		
		return stack;
	}
	
}

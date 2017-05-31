package prova;

import java.util.Stack;

public class Q4 {

	public boolean q4(Stack<Integer> a, Stack<Integer> b) {

		if (a.size() != b.size()) {
			return false;
		}

		while (!a.isEmpty()) {
			if (!a.pop().equals(b.pop())) {
				return false;
			}
		}

		return true;

	}

}

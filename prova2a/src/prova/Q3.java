package prova;

import java.util.Stack;

public class Q3 {

	public boolean q3(String s1) {
		char[] chars = s1.toCharArray();
		Stack<Character> stack = new Stack<>();
		String s2 = "";

		for (Character c : chars) {
			stack.push(c);
		}

		while (!stack.isEmpty()) {
			s2 = s2 + stack.pop();
		}

		return s1.equals(s2);

	}

}

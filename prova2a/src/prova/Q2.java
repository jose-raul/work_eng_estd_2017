package prova;

import java.util.Stack;

public class Q2 {

	public Character[] q2(Stack<Character> a, Stack<Character> b) {
		int size = a.size() + b.size();
		int counter = 0;
		Character[] result = new Character[size];

		while (!a.isEmpty()) {
			result[counter] = a.pop();
			counter++;
		}

		while (!b.isEmpty()) {
			result[counter] = b.pop();
			counter++;
		}

		return result;

	}

}

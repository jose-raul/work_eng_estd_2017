package exercicio;

import stack.Stack;

public class P3 {

	public int[] toArray(Stack<Integer> stack) {
		int counter = 0;
		int[] result = new int[stack.getSize()];

		while (!stack.isEmpty()) {
			Integer temp = stack.pop();
			if (temp % 2 == 0) {
				result[counter++] = temp;
			}
		}

		return result;
	}

}

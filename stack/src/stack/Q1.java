package stack;

public class Q1 {

	public String invert(String s) {
		String result = "";
		Stack<Character> stack = new ArrayStack<>();
		char[] chars = s.toCharArray();

		for (char c : chars) {
			stack.push(c);
		}

		while (!stack.isEmpty()) {
			result = result + stack.pop();
		}

		return result;
	}

}

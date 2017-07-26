package matrix;

import java.io.File;
import java.util.Scanner;

public class Pikachu {

	public static void main(String[] args) throws Exception {

		int i = 0;
		char[][] matrix = new char[40][80];
		File file = new File("C:/eclipseneon2/p.txt");
		Scanner scanner = new Scanner(file);

		while (scanner.hasNext()) {
			char[] chars = scanner.nextLine().toCharArray();
			for (int j = 0; j < chars.length; j++) {
				matrix[i][j] = chars[j];
			}
			i++;
		}

		print(matrix);
		flip(matrix);
		print(matrix);
	}

	private static void print(char[][] matrix) {
		for (char[] chars : matrix) {
			for (char c : chars) {
				System.out.print(c);
			}
			System.out.println("");
		}
	}

	private static void flip(char[][] m) {
		for (char[] chars : m) {
			for (int i = 0; i < chars.length / 2; i++) {
				char temp = chars[i];
				chars[i] = chars[chars.length - i - 1];
				chars[chars.length - i - 1] = temp;
			}
		}

	}

}

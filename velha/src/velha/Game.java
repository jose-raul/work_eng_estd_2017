package velha;

import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Character[][] m = new Character[3][3];
		boolean hasWinner = false;

		while (!hasWinner) {

			System.out.println("Posicao: ");
			Integer position = new Integer(scanner.nextLine());
			System.out.println("Valor (O/X): ");
			String value = scanner.nextLine();

			insert(m, position, value);

			print(m);

			hasWinner = winner(m);
		}

	}

	public static void insert(Character[][] m, int position, String value) {
		m[(position - 1) / 3][(position - 1) % 3] = value.charAt(0);
	}

	public static boolean winner(Character[][] m) {
		boolean result = false;
		
		if (m[0][0].equals(m[0][1]) && m[0][1].equals(m[0][2])) {
			result = true;
		} else if (m[1][0].equals(m[1][1]) && m[0][1].equals(m[1][2])) {
			result = true;
		} else if (m[2][0].equals(m[2][1]) && m[0][1].equals(m[2][2])) {
			result = true;
		} else if (m[0][0].equals(m[1][0]) && m[1][0].equals(m[2][0])) {
			result = true;
		} else if (m[0][1].equals(m[1][1]) && m[1][1].equals(m[2][1])) {
			result = true;
		} else if (m[0][1].equals(m[1][1]) && m[1][1].equals(m[2][1])) {
			result = true;
		} else if (m[0][0].equals(m[1][1]) && m[1][1].equals(m[2][2])) {
			result = true;
		} else if (m[2][0].equals(m[1][1]) && m[1][1].equals(m[0][2])) {
			result = true;
		}

		return result;
	}

	public static void print(Character[][] m) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.print(m[i][j] == null ? " " : m[i][j]);
				if (j < 2) {
					System.out.print("|");
				}
			}
			System.out.println();
			System.out.println("-+-+-");
		}

	}

}

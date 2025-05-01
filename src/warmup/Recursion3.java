package warmup;

public class Recursion3 {
	public static void main(String args[]) {
		printPatternRec(4, 0);
		printPatternRec2(4,0);
	}

	static void printPattern(int row) {
		for (int i = row; i > 0; i--) {
			for (int j = i; j > 0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	static void printPatternRec(int row, int col) {
		// Upside down triangle
		if (row < 0) {
			return;
		} else {
			if (col < row) {
				System.out.print("*");
				printPatternRec(row, col + 1);
			} else {
				System.out.println();
				printPatternRec(row - 1, 0);
			}

		}
	}

	static void printPatternRec2(int row, int col) {
		// triangle
		if (row < 0) {
			return;
		} else {
			if (col < row) {
				printPatternRec2(row, col + 1);
				System.out.print("*");
			} else {
				printPatternRec2(row - 1, 0);
				System.out.println();
			}

		}
	}
}

package algorithms.array;

public class Leet2011 {
	public int finalValueAfterOperations(String[] operations) {
		int x = 0;
		// The logic here is - each char has an ASCII value.
		// +'s ASCII is 43 and -'s ASCII is 45.
		// Middle char will always be either + or - as operations can be X-- or --X.
		// You can use middle element's ASCII value.
		// If it is X++ or ++X then, x += (44-43) so, x's value increases by 1.
		// If it is X-- or --X then, x += (44-45) so, x's value decreases by 1.

		for (String op : operations) {
			x += (44 - op.charAt(1)); // op.charAt(1) accesses the middle character
		}
		return x;
	}

	public int finalValueAfterOperationsLame(String[] operations) {
		int X = 0;

		for (String op : operations) {
			if (op.equals("X--") || op.equals("--X")) {
				X--;
			} else if (op.equals("++X") || op.equals("X++")) {
				X++;
			}
		}
		return X;
	}
}

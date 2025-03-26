package algorithms.numbers;

public class Leet202 {
	public boolean isHappy(int n) {
		int slow = n;
		int fast = n;
		while (slow != 1 || fast != 1) {
			slow = sumOfSquares(slow);
			fast = sumOfSquares(sumOfSquares(fast));
			if (slow == fast && (slow != 1 || fast != 1)) {
				return false; // refine more
			}
		}
		return true;
	}

	public int sumOfSquares(int n) {
		int a = n;
		int sum = 0;
		while (a != 0) {
			int temp = a % 10;
			sum += (temp * temp);
			a = a / 10;
		}
		return sum;
	}
}

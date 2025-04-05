package algorithms.numbers;

public class Leet50 {
	public double myPow(double x, int n) {
		// n is an integer
		double prod = 1;
		while (n > 0) {
			if (n % 2 == 1) {
				prod *= x;
			}
			x *= x;
			n /= 2;
		}
		while (n < 0) {
			if (n % 2 == -1) {
				prod *= (1 / x);
			}
			x *= x;
			n /= 2;
		}
		return prod;
	}
}

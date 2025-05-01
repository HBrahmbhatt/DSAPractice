package warmup;

public class Recursion {

	// factorial of a number
	public static void main(String args[]) {
		System.out.println("factorial of numbers till 5: " + factorial(5));
		System.out.println("sum of numbers till 5: " + sum(5));
		System.out.println("sum of digits for numbers 11: " + sumOfDigits(72));
		System.out.println("prod of digits for numbers 72: " + prodOfDigits(72));
		System.out.println("reverse of digits for numbers 572: " + reverseNumber(572, 0));
		System.out.println("reverse of digits for numbers 572: " + palindrome(1121));
		System.out.println("zeros of digits for number : " + countZeros(0));
	}

	static int factorial(int n) {
		if (n == 1) {
			return 1;
		} else {
			return n * factorial(n - 1);
		}
	}

	static int sum(int n) {
		if (n == 0) {
			return 0;
		} else {
			return n + sum(n - 1);
		}
	}

	static int sumOfDigits(int n) {
		if (n == 0) {
			return 0;
		} else {
			return (n % 10) + sumOfDigits(n / 10);
		}
	}

	static int prodOfDigits(int n) {
		if (n == 0) {
			return 1;
		} else {
			return (n % 10) * prodOfDigits(n / 10);
		}
	}

	static int reverseNumber(int n, int reverse) {
		if (n == 0) {
			return reverse;
		} else {
			reverse = (reverse * 10) + n % 10;
			return reverseNumber(n / 10, reverse);
		}
	}

	static boolean palindrome(int n) {
		int rem = reverseNumber(n, 0);
		if (n == rem) {
			return true;
		}
		return false;
	}

	static int countZeros(int n) {
		if (n == 0) {
			return 1;
		} else {
			return countZeros(n, 0);
		}
	}

	static int countZeros(int n, int count) {
		if (n == 0) {
			return count;
		} else {
			if (n % 10 == 0) {
				count += 1;
			}
			return countZeros(n / 10, count);
		}
	}
}

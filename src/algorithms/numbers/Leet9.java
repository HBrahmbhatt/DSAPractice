package algorithms.numbers;

public class Leet9 {
	public static boolean isPalindrome(int x) {
		if (x <= 0) {
			return false;
		}
		int num = x;
		int reverseNum = 0;
		while (num > 0) {
			reverseNum = reverseNum * 10 + (num % 10);
			num /= 10;
		}
		if (x == reverseNum) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String args[]) {
		System.out.println("hi");
		System.out.println("Palindrome.. " + isPalindrome(121));
	}
}

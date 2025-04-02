package algorithms.numbers;

public class Leet371 {
	public static int getSum(int a, int b) {
		// This thing is half adder logic....
		int sum = a ^ b;
		int carry = (a & b) << 1;
		if (carry != 0) {
			return getSum(sum, carry);
		}
		return sum;
	}

	public static void main(String args[]) {
		int sum = getSum(3, 5);
		System.out.println("The sum without using + is --> " + sum);
	}
}

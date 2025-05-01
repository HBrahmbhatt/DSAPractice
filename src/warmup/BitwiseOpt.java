package warmup;

public class BitwiseOpt {
	public static void main(String args[]) {

		System.out.println("for 17 :" + checkOddEven(17));

		int[] arr = { 1, 2, 3, 1, 2 };
		System.out.println("That single number in array is: " + checkSingleNumber(arr));

		System.out.println("check ith bit of " + checkIthBit(182, 7));
		System.out.println("check ith bit of " + setTheiThBit(182, 7));
		System.out.println("Find rightmost set bit of 8: " + findTheRightMostBit(8));

		System.out.println(rightMostSetBitValue(16));
		
		
		int a = 2;
		int b = (a>>1)&1;
		System.out.println("a:" + a + ", b:" + b);
		a = a>>1;
		System.out.println("a: "+ a);
	}

	static boolean checkOddEven(int n) {
		if ((n & 1) == 0)
			return true;
		return false;
	}

	static int checkSingleNumber(int[] arr) {
		int n = 0;
		for (int i : arr) {
			n ^= i;
		}
		return n;
	}

	static int checkIthBit(int n, int i) {
		return ((n >> (i - 1)) & 1);
	}

	static int setTheiThBit(int n, int i) {
		int num = (n | (1 << (i - 1)));
		return num;
	}

	static int findTheRightMostBit(int n) {
		int count = 1;
		while ((n & 1) != 1) {
			n = n >> 1;
			count++;
		}
		return count;
	}

	static int rightMostSetBitValue(int n) {
		int count = ((~n) + 1);
		System.out.println("Twos complement" + count);
		return count&n;
	}
}

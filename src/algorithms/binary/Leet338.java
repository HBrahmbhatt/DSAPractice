package algorithms.binary;

public class Leet338 {

	// If you chart out the binary equivalent of values till 16,
	// you'll realize the recurring pattern.
	// i.e. at each power of 2, you'll have a single bit set, set ans[2^pow]=1
	// Then depending on the distance from 2's power, you can reuse the stored
	// number by finding the distance between 2's pow and current number.
	public int[] countBits(int n) {
		int ans[] = new int[n + 1];
		ans[0] = 0;
		int sub = 1;
		for (int i = 1; i <= n; i++) {
			if (i % sub == 0) {
				sub = i;
				ans[sub] = 1;
			}
			ans[i] = ans[sub] + ans[i - sub];
		}
		return ans;
	}

	// This is the noob way of finding numbers of 1s.
	public int[] countBitsNoob(int n) {
		int ans[] = new int[n + 1];
		for (int i = 0; i <= n; i++) {
			ans[i] = hammingWeight(i);
		}
		return ans;
	}

	public int hammingWeight(int n) {
		int count = 0;
		while (n > 0) {
			count += (n & 1);
			n = n >> 1;
		}
		return count;
	}
}

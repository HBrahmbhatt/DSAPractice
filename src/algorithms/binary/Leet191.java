package algorithms.binary;

public class Leet191 {
	
	// Set the count by adding (1&n).
	// Right shift the numbers to reduce.
	public int hammingWeight(int n) {
		int count = 0;
		while (n > 0) {
			count += (n & 1);
			n = n >> 1;
		}
		return count;
	}
}

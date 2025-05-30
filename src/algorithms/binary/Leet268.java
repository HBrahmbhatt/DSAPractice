package algorithms.binary;

public class Leet268 {
	public int missingNumber(int[] nums) {
		int ans = 0;
		for (int i = 0; i < nums.length; i++) {
			ans ^= nums[i];
			ans ^= i;
		}
		ans ^= nums.length;
		return ans;
	}
}

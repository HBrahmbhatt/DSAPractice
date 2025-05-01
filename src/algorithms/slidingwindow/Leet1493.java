package algorithms.slidingwindow;

public class Leet1493 {
	public int longestSubarray(int[] nums) {
		int l = 0, r = 0, k = 1;
		int max = Integer.MIN_VALUE;
		while (r < nums.length) {
			if (nums[r] == 1) {
				max = Math.max(max, r - l + 1);
				r++;
			} else {
				if (k > 0) {
					max = Math.max(max, r - l + 1);
					r++;
					k--;
				} else {
					while (nums[l] == 1) {
						l++;
					}
					l++;
					k++;
				}
			}
		}
		return max - 1;
	}
}

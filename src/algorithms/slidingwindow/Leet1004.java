package algorithms.slidingwindow;

public class Leet1004 {
	public int longestOnes(int[] nums, int k) {
		int l = 0, r = 0;
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
		return max;
	}
}

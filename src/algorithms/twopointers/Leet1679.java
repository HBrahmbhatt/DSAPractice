package algorithms.twopointers;

import java.util.Arrays;

public class Leet1679 {
	public int maxOperations(int[] nums, int k) {
		// Two sum but with removing keys once target sum is matched
		Arrays.sort(nums);
		int l = 0, r = nums.length - 1, count = 0;
		while (l < r) {
			int sum = nums[l] + nums[r];
			if (sum == k) {
				count++;
				l++;
				r--;
			} else if (sum < k) {
				l++;
			} else {
				r--;
			}
		}
		return count;
	}
}

package warmup;

public class SlidingWindow {
	public static void main(String args[]) {
//		int num[] = { 1, 2, 3, 4, 5, 6, 1, 2, 3 };
		int nums[] = { 1, 2, 3, 4, 5, 6 };
//		System.out.println(maxSum(nums, 9));
//		System.out.println(longestSubArray(nums, 9));
		System.out.println(smallestSubArray(nums, 11));
	}

	// This is an easy way for dynamic sized windows
	static int smallestSubArray(int[] nums, int target) {
		int l = 0;
		int ans = Integer.MAX_VALUE;
		int currSum = 0;
		for (int r = 0; r < nums.length; r++) {
			currSum += nums[r];
			while (currSum >= target) {
				ans = Math.min(ans, r - l + 1);
				currSum -= nums[l];
				l++;
			}
		}
		return ans;
	}

	static int longestSubArray(int[] nums, int sum) {
		int l = 0, r = 0;
		int cursum = 0;
		int maxLength = 0;
		while (r < nums.length) {
			cursum += nums[r];
			while (cursum > sum) {
				cursum -= nums[l++];
			}
			if (cursum <= sum) {
				maxLength = Math.max(maxLength, r - l + 1);
				// If asked for subarray printing, you store r and l so that you can find the
				// maxLength
				r++;
			}
		}
		return maxLength;
	}

	static int maxSum(int[] nums, int k) {
		// Fixed size sliding window
		if (k > nums.length || k > nums.length) {
			return 0;
		}
		int maxSum = Integer.MIN_VALUE;
		int l = 0, r = 0;
		int currSum = 0;

		while (r < nums.length) {
			if (r < k) {
				currSum += nums[r++];
			} else {
				currSum += nums[r++];
				currSum -= nums[l++];
			}
			maxSum = Math.max(maxSum, currSum);
		}
		return maxSum;
	}
}

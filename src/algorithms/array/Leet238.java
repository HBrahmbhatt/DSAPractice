package algorithms.array;

public class Leet238 {
	// 238. Product of Array Except Self

	public static int[] productExceptSelfOpt(int[] nums) {
		// To use the same array, we have to create 2 temporary arrays
		int[] prefix = new int[nums.length];
		int[] suffix = new int[nums.length];
		prefix[0] = 1;
		suffix[nums.length - 1] = 1;
		for (int i = 1; i < nums.length; i++) {
			prefix[i] = prefix[i - 1] * nums[i - 1];
		}
		for (int j = nums.length - 2; j >= 0; j--) {
			suffix[j] = suffix[j + 1] * nums[j + 1];
		}
		for (int i = 0; i < nums.length; i++) {
			nums[i] = prefix[i] * suffix[i];
		}
		return nums;
	}

	public static int[] productExceptSelf(int[] nums) {
		int[] ans = new int[nums.length];
		int left = 1;
		int right = 1;
		for (int i = 0; i < nums.length; i++) {
			if (i > 0) {
				left *= nums[i - 1];
				ans[i] = left;
			} else {
				ans[i] = 1;
			}
		}
		for (int i = nums.length - 1; i >= 0; i--) {
			if (i < nums.length - 1) {
				right *= nums[i + 1];
				ans[i] *= right;
			} else {
				ans[i] *= 1;
			}
		}
		return ans;
	}

	public static void main(String args[]) {
		int[] nums = { -1, 1, 0, -3, 3 };
		int[] nums1 = { 1, 2, 3, 4 };
		int[] ans = productExceptSelf(nums);
		for (int n : ans) {
			System.out.println(n);
		}
		int[] ans2 = productExceptSelfOpt(nums1);
		for (int n : ans2) {
			System.out.println(n);
		}
	}
}

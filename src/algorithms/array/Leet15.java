package algorithms.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leet15 {
	public List<List<Integer>> threeSum(int[] nums) {
		// This is alot like water container problem in terms of finding indices...

		// Step 1: start by sorting the array
		Arrays.sort(nums);
		List<List<Integer>> ans = new ArrayList<>();

		// There will be 3 pointers.
		// 1. i pointer will move through the entire array - one by one element.
		// 2. j pointer will be i+1 and k pointer will start at the end of the array.
		// 3. Skip duplicates in all three pointers i,j, and k by checking them
		// with their adjacent elements.

		for (int i = 0; i < nums.length; i++) {
			if (i > 0 && nums[i] == nums[i - 1])
				continue;
			// start 2 pointers j and k
			int j = i + 1;
			int k = nums.length - 1;

			while (j < k) {
				int sum = nums[i] + nums[j] + nums[k];
				if (sum > 0) {
					// If sum is greater than 0, reduce the k pointer
					k--;
				} else if (sum < 0) {
					// If sum is less than 0, increase the j pointer
					j++;
				} else {
					// if sum == 0, then add those three elements in the ans List
					ans.add(Arrays.asList(nums[i], nums[j], nums[k]));
					j++;
					k--;
					while (j < k && nums[j] == nums[j - 1])
						j++;
					while (j < k && nums[k] == nums[k + 1])
						k--;
				}
			}
		}
		return ans;
	}

//	Sort the given array in non-decreasing order.
//	Loop through the array from index 0 to n-1.
//	For each iteration, set the target as -nums[i].
//	Set two pointers, j=i+1 and k=n-1.
//	While j<k, check if nums[j]+nums[k]==target.
//	If yes, add the triplet {nums[i], nums[j], nums[k]} to the result and move j to the right and k to the left.
//	If no, move either j or k based on the comparison of nums[j]+nums[k] with target.
//	To avoid duplicate triplets, skip the iterations where nums[i]==nums[i-1] and also skip the iterations where nums[j]==nums[j-1] or nums[k]==nums[k+1].

	public List<List<Integer>> threeSumAnotherMethod(int[] n) {
		List<List<Integer>> ans = new ArrayList<>();
		// Sort the array in ascending order
		Arrays.sort(n);

		for (int i = 0; i < n.length; i++) {
			if (i > 0 && n[i] == n[i - 1])
				continue; // Skip if duplicate in i
			int target = -n[i];
			int j = i + 1;
			int k = n.length - 1;
			while (j < k) {
				if (target == n[j] + n[k]) {
					ans.add(Arrays.asList(n[i], n[j], n[k]));
					j++;
					k--;
					while (j < k && n[j] == n[j - 1])
						j++;
					while (j < k && n[k] == n[k + 1])
						k--;
				} else if (target < n[j] + n[k]) {
					k--;
				} else {
					j++;
				}
			}
		}
		return ans;
	}

}
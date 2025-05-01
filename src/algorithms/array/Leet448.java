package algorithms.array;

import java.util.ArrayList;
import java.util.List;

public class Leet448 {

	// My thought process was to shift the elements to their indices.
	// Then find the indices that don't match to the element and collect that in a
	// list.

	public List<Integer> findDisappearedNumbers(int[] nums) {
		int i = 0;
		ArrayList<Integer> ans = new ArrayList<>();
		while (i < nums.length) {
			if (nums[nums[i] - 1] != nums[i]) {
				int temp = nums[nums[i] - 1];
				nums[nums[i] - 1] = nums[i];
				nums[i] = temp;
			} else {
				i++;
			}
		}
		i = 0;
		while (i < nums.length) {
			if (nums[i] != (i + 1)) {
				ans.add(i + 1);
			}
			i++;
		}
		return ans;
	}
}

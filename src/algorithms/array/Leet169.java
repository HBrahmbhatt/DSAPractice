package algorithms.array;

import java.util.HashMap;

public class Leet169 {
	// Moore's majority voting algo
	public int majorityElement(int[] nums) {
		int counter = 0;
		int element = nums[0];

		for (int i = 0; i < nums.length; i++) {
			if (counter == 0) {
				element = nums[i];
				counter++;
			} else if (element == nums[i]) {
				counter++;
			} else {
				counter--;
			}
		}

		if (counter > 0) {
			return element;
		}

		return -1;
	}

	public int majorityElementLessOpt(int[] nums) {
		HashMap<Integer, Integer> counter = new HashMap<>();
		int hl = nums.length / 2;
		for (int i = 0; i < nums.length; i++) {
			if (counter.containsKey(nums[i])) {
				counter.put(nums[i], (counter.get(nums[i]) + 1));
			} else {
				counter.put(nums[i], 1);
			}
		}
		for (var entry : counter.entrySet()) {
			if (entry.getValue() > hl) {
				return entry.getKey();
			}
		}
		return -1;
	}

}

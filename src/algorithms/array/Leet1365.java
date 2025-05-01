package algorithms.array;

import java.util.Arrays;
import java.util.HashMap;

public class Leet1365 {
	public int[] smallerNumbersThanCurrentBruteForce(int[] nums) {
		int[] ans = new int[nums.length];
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums.length; j++) {
				if (nums[j] < nums[i]) {
					ans[i]++;
				}
			}
		}
		return ans;
	}
	
	public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] temp = Arrays.copyOf(nums, nums.length);
        Arrays.sort(temp);
        int[] ans = new int[nums.length];
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(temp[0], 0);
        for (int i = 1; i < temp.length; i++) {
            if (!map.containsKey(temp[i])) {
                map.put(temp[i], i);
            }
        }
        for (int i = 0; i < nums.length; i++) {
            ans[i] = map.get(nums[i]);
        }
        return ans;
    }
}

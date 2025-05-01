package algorithms.array;

import java.util.Arrays;
import java.util.HashMap;

public class Leet1 {
	public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            int temp = target - nums[i];
            if(map.containsKey(temp)){
                return new int[] {i, map.get(temp)};
            } else {
                map.put(nums[i], i);
            }
        }
        return new int[] {-1,-1};
    }
	
	// If array is sorted then...
	public int[] twoSumSorted(int[] nums, int target) {
        // Sort the array first
        Arrays.sort(nums);

        int l = 0, r = nums.length-1;

        while(l < r){
            if(nums[l] + nums[r] == target){
                return new int[] {l, r};
            } else if (nums[l] + nums[r] < target){
                l++;
            } else {
                r--;
            }
        }

        return new int[] {-1,1};
    }
}

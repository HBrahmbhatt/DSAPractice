package algorithms.array;

public class Leet11 {
	public int maxArea(int[] height) {
		int left = 0, right = height.length - 1;
		int maxArea = 0;

		while (left < right) {
			int minHeight = Math.min(height[left], height[right]);
			maxArea = Math.max(maxArea, minHeight * (right - left));
			while (left < right && height[left] <= minHeight) {
				left++; // increase this pointer till it is less than left pointer and less than or
						// equal to min height
			}
			while (left < right && height[right] <= minHeight) {
				right--; // decrease this pointer till it is less than left pointer and less than or
							// equal to min height
			}
		}
		return maxArea;
	}
}

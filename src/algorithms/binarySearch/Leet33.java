package algorithms.binarySearch;

public class Leet33 {
	public int rotatedArraySearch(int[] n, int target, int left, int right) {
		if (left > right) {
			return -1;
		}
		int mid = left + (right - left) / 2;
		if (n[mid] == target) {
			return mid;
		} else {
			if (n[left] <= n[mid]) {
				// sorted part and then check if your number is present in this range or not
				if (target >= n[left] && target <= n[mid]) {
					return rotatedArraySearch(n, target, left, mid - 1);
				} else {
					return rotatedArraySearch(n, target, mid + 1, right);
				}
			} else {
				if (target >= n[mid] && target <= n[right]) {
					return rotatedArraySearch(n, target, mid + 1, right);
				} else {
					return rotatedArraySearch(n, target, left, mid - 1);
				}

			}
		}

	}
}

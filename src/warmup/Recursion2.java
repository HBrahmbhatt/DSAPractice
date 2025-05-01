package warmup;

import java.util.ArrayList;
import java.util.List;

public class Recursion2 {

	public static void main(String args[]) {
		int[] arr = { 1, 2, 2, 4, 5, 6, 7 };
		int[] nums = { 3, 2, 1, 18, 9, 9 };
		int[] rt = { 3, 1 };
		System.out.println("Sorted or not? " + sorted(arr, 0));
		System.out.println("Index for 18 is? " + findElement(nums, 0, 45));

		// multiple occurrences of target
		System.out.println("Index for 9: ");
		findAllElement(nums, 0, 9).forEach(x -> System.out.print(x + " "));
		System.out.println("\n");

		// rotated array search
		System.out.println("Index for 7 is " + rotatedArraySearch(rt, 1, 0, rt.length - 1));
	}

	static boolean sorted(int n[], int index) {
		if (index == n.length - 1) {
			return true;
		} else {
			return (n[index] <= n[index + 1] ? sorted(n, index + 1) : false);
		}
	}

	static int findElement(int n[], int index, int target) {
		if (index > n.length - 1) {
			return -1;
		} else {
			return (n[index] == target ? index : findElement(n, index + 1, target));
		}
	}

	static ArrayList<Integer> findAllElement(int n[], int index, int target) {
		ArrayList<Integer> list = new ArrayList<>();
		if (index > n.length - 1) {
			return list;
		} else {
			if (n[index] == target) {
				list.add(index);
			}
			List<Integer> ansfromStack = findAllElement(n, index + 1, target);

			list.addAll(ansfromStack);
			return list;
		}
	}

	static int rotatedArraySearch(int[] n, int target, int left, int right) {
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

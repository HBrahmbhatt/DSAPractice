package warmup;

import java.util.Arrays;

public class Recursion4 {
	public static void main(String args[]) {
		int nums[] = { 1, 2, 3, 5 };
		bubbleSortRec(nums, 0, 0);
//		System.out.println(Arrays.toString(nums));

		int arr[] = { 4, 6, 7 };
		selectionSortRec(arr, 0, 1);
//		System.out.println(Arrays.toString(arr));

		int num[] = { 1, 4, 2, 5, 7, 9 };
		mergeSort(num, 0, num.length-1);
		System.out.println(Arrays.toString(num));
	}

	
	static void mergeSort(int n[], int start, int end) {
		if (start < end) {
			int mid = (start + end) / 2;
			mergeSort(n, start, mid);
			mergeSort(n, mid + 1, end);
			mergeInPlace(n, start, mid, end);
		} else {
			return;
		}
	}
	
	private static void mergeInPlace(int[] n, int start, int mid, int end) {
		int mix[] = new int[end - start + 1];
		int i = start;
		int j = mid + 1;
		int k = 0;

		while (i <= mid && j <= end) {
			if (n[i] <= n[j]) {
				mix[k++] = n[i++];
			} else {
				mix[k++] = n[j++];
			}
		}
		while (i <= mid) {
			mix[k++] = n[i++];
		}
		while (j <= end) {
			mix[k++] = n[j++];
		}
		for (int num : mix) {
			n[start++] = num;
		}

	}

	static void selectionSort(int[] n) {
		for (int i = 0; i < n.length - 1; i++) {
			for (int j = i + 1; j < n.length; j++) {
				if (n[j] < n[i]) {
					int temp = n[j];
					n[j] = n[i];
					n[i] = temp;
				}
			}
		}
	}

	static void selectionSortRec(int[] n, int i, int j) {
		if (i > n.length - 1) {
			return;
		} else {
			if (j < n.length) {
				if (n[j] < n[i]) {
					int temp = n[j];
					n[j] = n[i];
					n[i] = temp;
				}
				selectionSortRec(n, i, j + 1);
			} else {
				selectionSortRec(n, ++i, ++i);
			}
		}
	}

	static void bubbleSort(int[] n) {
		for (int i = 0; i < n.length - 1; i++) {
			for (int j = 0; j < n.length - 1; j++) {
				if (n[j] > n[j + 1]) {
					int temp = n[j];
					n[j] = n[j + 1];
					n[j + 1] = temp;
				}
			}
		}
	}

	static void bubbleSortRec(int[] n, int i, int j) {
		if (i > n.length - 1) {
			return;
		} else {
			if (j < n.length - 1) {
				if (n[j] > n[j + 1]) {
					int temp = n[j];
					n[j] = n[j + 1];
					n[j + 1] = temp;
				}
				bubbleSortRec(n, i, j + 1);
			} else {
				bubbleSortRec(n, i + 1, 0);
			}
		}
	}
}

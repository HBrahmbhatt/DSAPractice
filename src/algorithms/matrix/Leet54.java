package algorithms.matrix;

import java.util.ArrayList;
import java.util.List;

public class Leet54 {

	// Just notice the pattern of how the spiraling happens (right, down, left, up)
	// and you'll be able to find the solution on your own.

	public List<Integer> spiralOrder(int[][] matrix) {
		List<Integer> ans = new ArrayList<>();
		int rowbegin = 0;
		int colbegin = 0;
		int rowend = matrix.length - 1;
		int colend = matrix[0].length - 1;

		while (rowbegin <= rowend && colbegin <= colend) {
			// right
			for (int i = colbegin; i <= colend; i++) {
				ans.add(matrix[rowbegin][i]);
			}
			rowbegin++;
			// down
			for (int j = rowbegin; j <= rowend; j++) {
				ans.add(matrix[j][colend]);
			}
			colend--;
			// left
			if (rowbegin <= rowend) {
				for (int i = colend; i >= colbegin; i--) {
					ans.add(matrix[rowend][i]);
				}
			}
			rowend--;
			// up
			if (colbegin <= colend) {
				for (int i = rowend; i >= rowbegin; i--) {
					ans.add(matrix[i][colbegin]);
				}
			}
			colbegin++;
		}
		return ans;
	}
}

package algorithms.matrix;

public class Leet1266 {

	// Read about Chebyshev Distance, it'll help you frame the solution...

	public int minTimeToVisitAllPoints(int[][] points) {
		int distance = 0;

		for (int i = 0; i < points.length - 1; i++) {
			int x = Math.abs(points[i][0] - points[i + 1][0]);
			int y = Math.abs(points[i][1] - points[i + 1][1]);
			distance += Math.max(x, y);
		}

		return distance;
	}
}

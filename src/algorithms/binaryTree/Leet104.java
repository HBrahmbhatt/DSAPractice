package algorithms.binaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class Leet104 {

	// Depth of a tree - need to use recursion
	public int maxDepth(TreeNode root) {
		if (root == null) {
			return 0;
		}

		Queue<TreeNode> queue = new LinkedList<>();
		queue.add(root);
		int count = 0;
		while (!queue.isEmpty()) {
			int size = queue.size();
			for (int i = 0; i < size; i++) {
				TreeNode currNode = queue.poll();
				if (currNode.left != null) {
					queue.offer(currNode.left);
				}
				if (currNode.right != null) {
					queue.offer(currNode.right);
				}
			}
			count++;
		}

		return count;

	}
}

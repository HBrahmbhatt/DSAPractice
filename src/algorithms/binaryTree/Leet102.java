package algorithms.binaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Leet102 {

	// Breadth first search
	public List<List<Integer>> levelOrder(TreeNode root) {
		if (root == null) {
			return new ArrayList<>();
		}

		List<List<Integer>> ans = new ArrayList<>();
		Queue<TreeNode> queue = new LinkedList<>();
		queue.add(root);
		while (!queue.isEmpty()) {
			List<Integer> currList = new ArrayList<>();
			int size = queue.size();
			for (int i = 0; i < size; i++) {
				TreeNode currNode = queue.poll();
				currList.add(currNode.val);
				if (currNode.left != null) {
					queue.offer(currNode.left);
				}
				if (currNode.right != null) {
					queue.offer(currNode.right);
				}
			}
			if (!currList.isEmpty()) {
				ans.add(currList);
			}
		}

		return ans;
	}
}

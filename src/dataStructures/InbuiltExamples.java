package dataStructures;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class InbuiltExamples {
	public static void main(String args[]) {
		Stack<Integer> st = new Stack<>();
		st.push(34);
		st.push(45);
		st.push(9);
		st.push(2);
		st.push(18);
		
		while(!st.isEmpty()) {
			System.out.println(st.pop());
		}

		Queue<Integer> queue = new LinkedList<>();

		queue.add(55);
		queue.add(45);
		queue.add(35);
		queue.add(25);
		
		while(!queue.isEmpty()) {
			System.out.println(queue.poll());
		}

	}
}

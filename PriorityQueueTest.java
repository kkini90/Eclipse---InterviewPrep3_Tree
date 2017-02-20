package com.usc.ctcl.tree;
import java.util.*;

public class PriorityQueueTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
		queue.add(-1);
		queue.add(3);
		queue.add(1);
		queue.add(2);
		queue.offer(5);
		
		System.out.println(queue);
		System.out.println(queue.poll());
		System.out.println(queue);
		System.out.println(queue.poll());
		//System.out.println(queue.peek() + "empty");
	}

}

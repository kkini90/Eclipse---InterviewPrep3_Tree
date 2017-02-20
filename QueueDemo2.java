package com.usc.ctcl.tree;

public class QueueDemo2 {
	private int size;
	private int[] que;
	private int rear;
	private int front;
	private int count;

	public QueueDemo2(int arraySize) {
		size = arraySize;
		que = new int[size];
		rear = 0;
		front = 0;
		count = 0;
	}

	public void add(int value) {
		if (count == size) {
			System.out.println("Queue is full");
		} else {
			que[rear] = value;
			rear = (rear + 1) % size;
			count++;
		}
	}

	public int remove() {
		int val = 0;
		if (count == 0) {
			System.out.println("Queue is empty");
		} else {
			val = que[front];
			front = (front + 1) % size;
			count--;

		}
		return val;

	}

	public void display() {
		if (count == 0) {
	        System.out.println("Queue is Empty!");
	    } /*else if (front!=rear){
	    	int i =(front+1)%size;
	    	while(i!=rear){
	    		System.out.println(que[i]);
	    		i=(i+1)%size;
	    	}
	    }*/else{
	    	for(int i = front; i<count;i++){
	    		System.out.println(que[i]);
	    	}
	    }
	}

	public static void main(String[] args) {
		QueueDemo2 q = new QueueDemo2(3);
		q.add(1);
		q.add(2);
		q.add(3); // 1 2 3

		q.display();// 1 2 3
		System.out.println(q.remove()); // remove 1 , 2 3
		System.out.println(q.remove()); // remove 2 , 3
		System.out.println(q.remove()); // remove 3 , empty

		q.add(100); // 100
		q.add(200);
		q.display(); // diplays 100 200
		System.out.println(q.remove());
		q.display();
		q.add(300);
		q.display();
	}
}

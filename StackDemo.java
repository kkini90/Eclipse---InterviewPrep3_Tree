package com.usc.ctcl.tree;

public class StackDemo {

	private int[] stack;
	private int top;
	private int size;

	public StackDemo(int arraySize) {
		size = arraySize;
		top = -1;
		stack = new int[size];
	}

	public void push(int value) {
		if (top == size - 1) {
			System.out.println("Stack overflow");
		} else {
			top++;
			stack[top] = value;
		}
	}

	public void remove() {
		if (top == -1) {
			System.out.println("Stack underflow");			
		}else{
			int element = stack[top];
			top--;
			System.out.println(element);
		}
				
	}

	public void display() {
		if (top == -1) {
			System.out.println("Stack empty");
		} else {
			for (int i = top; i >= 0; i--) {
				System.out.println(stack[i]);
			}
		}
	}


	public static void main(String[] args) {
		StackDemo st = new StackDemo(10);
		st.push(1);
		st.push(2);
		st.push(3);

		st.display();// 1 2 3
		st.remove();

	}
}

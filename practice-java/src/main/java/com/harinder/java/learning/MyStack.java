package com.harinder.java.learning;

public class MyStack {
	private int top;
	private int capacity;
	private int[] arr;

	public MyStack(int size) {
		capacity = size;
		top = -1;
		arr = new int[capacity];
	}

	public void push(int data) {
		if (isFull()) {
			System.out.println("Stack Full!! Terminating..");
			System.exit(1);
		}
		System.out.println("Pushing : " + data);
		arr[++top] = data;
	}

	public int pop() {
		if (isEmpty()) {
			System.out.println("Stack Empty!! Terminating..");
			System.exit(1);
		}
		System.out.println("Retreiving : " + peek());
		return arr[top--];
	}
	
	private int peek() {
		if (isEmpty()) {
			System.out.println("Stack empty!!  Terminating..");
			System.exit(1);
		}
		return arr[top];
	}

	private boolean isEmpty() {
		return top == -1;
	}

	private boolean isFull() {
		return top == (capacity - 1);
	}

	public static void main(String[] args) {
		MyStack stack = new MyStack(3);
		
		stack.push(20);
		stack.push(30);
		stack.peek();
		stack.pop();
		stack.push(40);
		stack.push(50);
		stack.push(60);
		
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		
	}

}

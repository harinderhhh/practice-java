package com.harinder.java.learning;


public class MyQueue {
	private int count;
	private int capacity;
	private int[] arr;
	private int front;
	private int rear;
	
	public MyQueue(int size) {
		capacity = size;
		rear = -1;
		front = 0;
		count = 0;
		arr = new int[capacity];
	}
	
	public void enqueue(int data) {
		if (isFull()) {
			System.out.println("Queue Full!! Terminating..");
			System.exit(1);
		}
		System.out.println("Inserting : " + data);
		rear = (rear + 1) % capacity;
		arr[rear] = data;
		count++;
	}

	public int dequeue() {
		if (isEmpty()) {
			System.out.println("Queue Empty!! Terminating..");
			System.exit(1);
		}
		int val = arr[front];
		System.out.println("Retreiving : " + val);
		count--;
		front = (front + 1) % capacity;
		return val;
		
	}
	
	private int peek() {
		if (isEmpty()) {
			System.out.println("Queue empty!!  Terminating..");
			System.exit(1);
		}
		return arr[front];
	}

	private boolean isEmpty() {
		return count == 0;
	}

	private boolean isFull() {
		return count == capacity;
	}

	public static void main(String[] args) {
		MyQueue queue = new MyQueue(4);
		queue.enqueue(20);
		queue.enqueue(30);
		queue.dequeue();
		queue.enqueue(40);
		queue.enqueue(50);
		queue.dequeue();
		queue.enqueue(60);
		queue.dequeue();
		queue.enqueue(70);
		queue.dequeue();
		queue.dequeue();
		queue.dequeue();
		//queue.dequeue();
		System.out.println("isFull = " + queue.isFull());
		System.out.println("isEmpty = " + queue.isEmpty());
		
		
	}
}

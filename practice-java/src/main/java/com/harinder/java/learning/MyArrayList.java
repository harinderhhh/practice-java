package com.harinder.java.learning;

public class MyArrayList {

	private Object arr[];
	private int size;
	private int index;
	private static int LOAD_FACTOR = 5;
	
	MyArrayList(int size) {
		arr = new Object[size];
		this.size = size;
		index = -1;
	}
	
	public void add(int index, Object obj) {
		if (index >= this.size) {
			this.size += LOAD_FACTOR;
			resizeArray();
		}
		arr[index] = obj;
	}
	
	private void resizeArray() {
		Object arr1[] = new Object[this.size];
		for (int i = 0; i < arr.length; i++) {
			arr1[i] = arr[i];
		}
		arr = arr1;
	}

	public Object get(int index) {
		return arr[index];
	}
	
	public void remove(int pos) {
		if (pos < 0) {
			System.out.println("Negative Index!!");
		}
		if (pos > this.size) {
			System.out.println("ArrayIndexOutOfBound!!");
		}
		for(int i = pos; i < this.arr.length - 1; i++) {
			arr[i] = arr[i+1];
		}
		this.index--;
	}
	
	public String toString() {
		String str = "[ ";
		for (int i = 0; i < arr.length; i++) {
			str = str + arr[i] + " ";
		}
		return str + "]";
	}
	public static void main(String[] args) {
		MyArrayList al = new MyArrayList(5);
		
		al.add(0, 10);
		al.add(1, 20);
		al.add(2, 30);
		al.add(3, 40);
		al.add(4, 50);
		System.out.println(al.toString());
		al.add(5, 60);
		System.out.println(al.toString());
		al.remove(3);
		System.out.println(al.toString());
	}

}

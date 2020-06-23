package com.harinder.java.learning;

public class MyHashMap<K, V> {
	private Entry<K, V>[] buckets;
	private int capacity = 16;

	static class Entry<K, V> {
		K key;
		V value;
		Entry<K, V> next;

		public Entry(K key, V value, Entry<K, V> next) {
			this.key = key;
			this.value = value;
			this.next = next;
		}
	}

	MyHashMap() {
		buckets = new Entry[capacity];
	}

	

}
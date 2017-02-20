package com.usc.ctcl.tree;

// 2 class in single file so make this class 
class HashEntry {
	private int key;
	private int value;

	HashEntry(int key, int value) {
		this.key = key;
		this.value = value;
	}

	public int getKey() {
		return key;
	}

	public int getValue() {
		return value;
	}
}

public class HashMapImpl {
	HashEntry[] table;
	private static final int SIZE = 128;

	HashMapImpl() {
		table = new HashEntry[SIZE];

		for (int i = 0; i < SIZE; i++) {
			table[i] = null;
		}
	}

	public int get(int key) {
		int hash = key % SIZE;
		while (table[hash] != null && table[hash].getKey() != key) {
			hash = (hash + 1) % SIZE;
		}

		if (table[hash] == null) {
			return -1;
		} else {
			return table[hash].getValue();
		}
	}

	public void put(int key, int value) {
		int hash = key % SIZE;

		while (table[hash] != null && table[hash].getKey() != key) {
			hash = (hash + 1) % SIZE;
		}
		table[hash] = new HashEntry(key, value);
	}

	public static void main(String[] args) {
		HashMapImpl h = new HashMapImpl();
		h.put(1, 100);
		h.put(2, 101);
		h.put(3, 102);
		System.out.println(h.get(1));
		System.out.println(h.get(2));
		System.out.println(h.get(3));
	}
}
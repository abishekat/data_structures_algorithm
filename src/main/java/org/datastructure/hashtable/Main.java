package org.datastructure.hashtable;

public class Main {
	public static void main(String[] args) {
		HashTable myHashTable = new HashTable();

		myHashTable.set("nail", 100);
		myHashTable.set("title", 50);
		myHashTable.set("lumber", 80);
//		myHashTable.printTable();
		System.out.println(myHashTable.get("lumber"));
		System.out.println(myHashTable.keys());
	}
}

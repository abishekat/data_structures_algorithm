package org.datastructure.heap;

public class Main {
	public static void main(String[] args) {
		Heap myHeap = new Heap();
		myHeap.insert(99);
		myHeap.insert(72);
		myHeap.insert(61);
		myHeap.insert(58);
//		myHeap.insert(32);
//		myHeap.insert(40);
//		myHeap.insert(49);

		System.out.println(myHeap.getHeap());

		myHeap.insert(75);

		System.out.println(myHeap.getHeap());

		myHeap.remove();
		System.out.println(myHeap.getHeap());
	}
}

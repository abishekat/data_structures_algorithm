package org.datastructure.quicksort;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		int[] array = { 4, 6, 1, 7, 3, 2, 5 };

		QuickSort qs = new QuickSort();
		int returnIndex = qs.pivot(array, 0, array.length - 1);
		System.out.println("Return Index = " + returnIndex);
		System.out.println(Arrays.toString(array));
		qs.quickSort(array, 0, array.length - 1);
		System.out.println(Arrays.toString(array));
	}

}

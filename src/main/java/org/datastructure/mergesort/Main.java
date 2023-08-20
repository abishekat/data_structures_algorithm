package org.datastructure.mergesort;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		int[] array1 = { 1, 7, 3, 8 };
		int[] array2 = { 2, 4, 5, 6 };

		Merge merge = new Merge();

		System.out.println(Arrays.toString(merge.mergeSort(array1)));

		System.out.println(Arrays.toString(merge.merge(array1, array2)));
	}

}

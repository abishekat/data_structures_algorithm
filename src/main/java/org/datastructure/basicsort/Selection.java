package org.datastructure.basicsort;

import java.util.Arrays;

public class Selection {

	public static void selectionSort(int[] array) {
		for (int i = 0; i < array.length; i++) {
			int minIndex = i;
			for (int j = i + 1; j < array.length; j++) {
				if (array[j] < array[minIndex]) {
					minIndex = j;
				}
			}
			if (i != minIndex) {
				int temp = array[i];
				array[i] = array[minIndex];
				array[minIndex] = temp;
			}
		}
	}

	public static void main(String[] args) {
		int[] myArray = { 4, 2, 5, 6, 1, 3 };
		selectionSort(myArray);
		System.out.println(Arrays.toString(myArray));
	}

}

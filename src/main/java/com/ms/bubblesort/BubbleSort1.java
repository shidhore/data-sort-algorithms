package com.ms.bubblesort;

public class BubbleSort1 {

	public static void main(String[] args) {
		int[] array = new int[] { 5, 4, 3, 2, 1 };

		System.out.println("==== Array before sort ====");
		printArray(array);

		for (int i = 0; i < array.length - 1; i++) {
			System.out.println("i = " + i);
			for (int j = 0; j < array.length - 1; j++) {
				System.out.println("j = " + j + " , array[j] = " + array[j] + " , array[j + 1] = " + array[j + 1]);
				if (array[j] > array[j + 1]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
			printArray(array);
		}

		System.out.println("==== Array after sort ====");
		printArray(array);
	}

	private static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println("\n");
	}

}

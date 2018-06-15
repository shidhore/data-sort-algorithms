package com.ms.bubblesort;

/**
 * Description
 * -----------
 * Bubble Sort is the simplest sorting algorithm.
 * Works by processing data in collection in multiple passes.
 * Data is processed from start -> end or left -> right where each element is compared to the next.
 * If current value is smaller than the next value, they are swapped.
 * After each pass, the largest element is to the extreme right of the collection.
 * This is repeated for all elements.
 * 
 * Performance
 * -----------
 * Not appropriate for large data sets.
 * Worst Case -> O(n^2)
 * Average Case -> O(n^2)
 * Best Case -> O(n)
 * 
 * @author Mandar.Shidhore
 *
 */
public class BubbleSort2 {

	public static void main(String[] args) {
		int[] array = new int[] { 3, 7, 4, 4, 6, 5, 8 };
		int numberOfIterationsToSort = 0;
		int numberOfSwaps = 0;
		int numberOfPasses = 0;

		System.out.println("==== Array before sort ====");
		printArray(array);

		boolean isSorted = false;
		while (!isSorted) {
			numberOfIterationsToSort++;
			numberOfPasses++;
			isSorted = true;
			for (int i = 0; i < array.length - 1; i++) {
				numberOfIterationsToSort++;
				System.out.println("i = " + i + " , array[i] = " + array[i] + " , array[i + 1] = " + array[i + 1]);
				if (array[i] > array[i + 1]) {
					int temp = array[i];
					array[i] = array[i + 1];
					array[i + 1] = temp;
					isSorted = false;
					numberOfSwaps++;
				}
			}
			printArray(array);
		}

		System.out.println("==== Array after sort ====");
		printArray(array);

		System.out.println(">> " + numberOfIterationsToSort + " iterations needed to sort the array");
		System.out.println(">> " + numberOfSwaps + " swaps needed to sort the array");
		System.out.println(">> " + numberOfPasses + " passes needed to sort the array");
	}

	private static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println("\n");
	}

}

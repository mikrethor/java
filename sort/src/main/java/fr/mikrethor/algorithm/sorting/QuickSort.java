package fr.mikrethor.algorithm.sorting;

public class QuickSort implements ISort {

	@Override
	public Integer[] sort(Integer[] array) {

		quickSort(array, 0, array.length - 1);
		return array;
	}

	private void quickSort(Integer[] array, int lowerIndex, int higherIndex) {

		int i = lowerIndex;
		int j = higherIndex;
		// calculate pivot number, I am taking pivot as middle index number
		int pivot = array[lowerIndex + (higherIndex - lowerIndex) / 2];
		// Divide into two arrays
		while (i <= j) {
			/**
			 * In each iteration, we will identify a number from left side which
			 * is greater then the pivot value, and also we will identify a
			 * number from right side which is less then the pivot value. Once
			 * the search is done, then we exchange both numbers.
			 */
			while (array[i] < pivot) {
				i++;
			}
			while (array[j] > pivot) {
				j--;
			}
			if (i <= j) {
				swap(array, i, j);
				// move index to next position on both sides
				i++;
				j--;
			}
		}
		// call quickSort() method recursively
		if (lowerIndex < j) {
			quickSort(array, lowerIndex, j);
		}
		if (i < higherIndex) {
			quickSort(array, i, higherIndex);
		}
	}

	void swap(Integer array[], int a, int b) {
		int tmp;

		tmp = array[a];
		array[a] = array[b];
		array[b] = tmp;
	}

	@Override
	public String getName() {
		return this.getClass().getSimpleName();
	}

}

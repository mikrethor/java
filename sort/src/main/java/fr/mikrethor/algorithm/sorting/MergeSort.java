package fr.mikrethor.algorithm.sorting;

public class MergeSort implements ISort {

	@Override
	public Integer[] sort(Integer[] array) {

		doMergeSort(array, 0, array.length - 1);
		return array;
	}

	private void doMergeSort(Integer[] array, int lowerIndex, int higherIndex) {

		if (lowerIndex < higherIndex) {
			int middle = lowerIndex + (higherIndex - lowerIndex) / 2;
			// Below step sorts the left side of the array
			doMergeSort(array, lowerIndex, middle);
			// Below step sorts the right side of the array
			doMergeSort(array, middle + 1, higherIndex);
			// Now merge both sides
			mergeParts(array, lowerIndex, middle, higherIndex);
		}
	}

	private void mergeParts(Integer[] array, int lowerIndex, int middle, int higherIndex) {
		Integer[] tempMergArr = new Integer[array.length];
		for (int i = lowerIndex; i <= higherIndex; i++) {
			tempMergArr[i] = array[i];
		}
		int i = lowerIndex;
		int j = middle + 1;
		int k = lowerIndex;
		while (i <= middle && j <= higherIndex) {
			if (tempMergArr[i] <= tempMergArr[j]) {
				array[k] = tempMergArr[i];
				i++;
			} else {
				array[k] = tempMergArr[j];
				j++;
			}
			k++;
		}
		while (i <= middle) {
			array[k] = tempMergArr[i];
			k++;
			i++;
		}

	}

	@Override
	public String getName() {
		return this.getClass().getSimpleName();
	}

}

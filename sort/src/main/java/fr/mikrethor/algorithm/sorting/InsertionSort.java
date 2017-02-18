package fr.mikrethor.algorithm.sorting;

public class InsertionSort implements ISort {

	@Override
	public Integer[] sort(Integer[] array) {

		int temp;
		for (int i = 1; i < array.length; i++) {
			for (int j = i; j > 0; j--) {
				if (array[j] < array[j - 1]) {
					temp = array[j];
					array[j] = array[j - 1];
					array[j - 1] = temp;
					// break;
				}
			}
		}
		return array;

	}

	@Override
	public String getName() {
		return this.getClass().getSimpleName();
	}

}

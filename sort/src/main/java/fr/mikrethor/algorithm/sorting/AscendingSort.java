package fr.mikrethor.algorithm.sorting;

public class AscendingSort implements ISort {

	@Override
	public Integer[] sort(Integer[] array) {

		int i = 0;
		int tmp = 0;
		int j = 0;

		for (i = 0; i < array.length; i++) {
			for (j = i + 1; j < array.length; j++) {
				if (array[j] < array[i]) {
					tmp = array[i];
					array[i] = array[j];
					array[j] = tmp;
				}
			}
		}
		return array;
	}

	@Override
	public String getName() {
		return "AscendingSort";
	}
}

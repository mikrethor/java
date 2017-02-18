package fr.mikrethor.algorithm.sorting;

public class AscendingBubbleSort implements ISort {

	@Override
	public Integer[] sort(Integer[] array) {
		int i = 0;
		Boolean changed = true;
		while (i < array.length - 1 && changed) {
			changed = false;
			for (int index = 0; index < array.length - 1; index++) {
				if (array[index] > array[index + 1]) {
					changed = true;
					int temp = array[index];
					array[index] = array[index + 1];
					array[index + 1] = temp;
				}
			}
			i++;
		}
		return array;
	}

	@Override
	public String getName() {
		return "AscendingBubbleSort";
	}
}

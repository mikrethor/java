package fr.mikrethor.algorithm.sorting;

public class SelectionSort implements ISort {

	@Override
	public Integer[] sort(Integer[] array) {

		int length = (array.length - 1);

		while (length > 0) {

			int max = 0;
			for (int i = 1; i <= length; i++) {
				if (array[i] > array[max])
					max = i;
			}
			swap(array, max, length);
			length--;
		}
		return array;
	}

	void swap(Integer tab[], int x, int y) {
		int tmp;

		tmp = tab[x];
		tab[x] = tab[y];
		tab[y] = tmp;
	}

	int max(int array[]) {
		int i = 0, max = 0;

		while (i < array.length) {
			if (array[i] > array[max]) {
				max = i;
			}
			i++;
		}

		return max;
	}

	@Override
	public String getName() {
		return "SelectionSort";
	}

}

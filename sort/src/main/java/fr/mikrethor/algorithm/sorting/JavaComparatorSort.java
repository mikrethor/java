package fr.mikrethor.algorithm.sorting;

import java.util.Arrays;

import fr.mikrethor.algorithm.sorting.comparator.IntComparator;

public class JavaComparatorSort implements ISort {

	IntComparator comparator = new IntComparator();

	@Override
	public Integer[] sort(Integer[] array) {
		Arrays.sort(array, comparator);
		return array;
	}

	@Override
	public String getName() {
		return "JavaComparatorSort";
	}

}

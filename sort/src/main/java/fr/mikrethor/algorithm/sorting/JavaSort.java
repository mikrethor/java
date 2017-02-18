package fr.mikrethor.algorithm.sorting;

import java.util.Arrays;

public class JavaSort implements ISort {

	@Override
	public Integer[] sort(Integer[] array) {
		Arrays.sort(array);
		return array;
	}

	@Override
	public String getName() {
		return "JavaSort";
	}

}

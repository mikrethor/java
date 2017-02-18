package fr.mikrethor.algorithm.sorting;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.time.StopWatch;
import org.junit.Assert;
import org.junit.Test;

public class TestSortAlgorithms {
	Integer[] array;
	StopWatch stopWatch = new StopWatch();

	@Test
	public void sortTest() throws NoSuchMethodException, SecurityException, InstantiationException,
			IllegalAccessException, IllegalArgumentException, InvocationTargetException {

		Class<?>[] classes = { AscendingSort.class, SelectionSort.class, JavaSort.class, JavaComparatorSort.class,
				InsertionSort.class, QuickSort.class, MergeSort.class, AscendingBubbleSort.class };

		Constructor<?> constructor;
		for (Class<?> klass : classes) {
			constructor = klass.getConstructor();
			ISort sorter = (ISort) constructor.newInstance();
			array = new Integer[] { 99, 6, 9, 8, 88, 14, 123, 478, 65, 96, 36, 35, 36, 34, 36, 25, 24, 16, 18, 17, 19,
					16, 0, 12 };
			System.out.print(sorter.getName());
			System.out.print(" : ");

			stopWatch.reset();
			stopWatch.start();
			array = sorter.sort(array);
			stopWatch.stop();
			System.out.println(stopWatch.getTime(TimeUnit.MICROSECONDS));

			Assert.assertArrayEquals(new Integer[] { 0, 6, 8, 9, 12, 14, 16, 16, 17, 18, 19, 24, 25, 34, 35, 36, 36, 36,
					65, 88, 96, 99, 123, 478 }, array);
		}

	}

}

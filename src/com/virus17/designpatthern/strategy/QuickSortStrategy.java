package com.virus17.designpatthern.strategy;

import java.util.List;

/**
 * Quick Sort implementation of Sorting
 * 
 * @author virus17
 */
public class QuickSortStrategy implements SortingStrategy {

	@Override
	public void sort(List<Integer> array) {
		System.out.println("Array Sorted using Quick Sort");
	}

}

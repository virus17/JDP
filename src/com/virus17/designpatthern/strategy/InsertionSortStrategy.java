package com.virus17.designpatthern.strategy;

import java.util.List;

/**
 * Insertion Sort implementation of Sorting
 * 
 * @author virus17
 */
public class InsertionSortStrategy implements SortingStrategy {

	@Override
	public void sort(List<Integer> array) {
		System.out.println("Array Sorted using Insertion Sort");
	}

}

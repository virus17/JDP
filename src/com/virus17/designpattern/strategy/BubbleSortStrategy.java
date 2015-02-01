package com.virus17.designpattern.strategy;

import java.util.List;

/**
 * Bubble Sort implementation of Sorting
 * 
 * @author virus17
 */
public class BubbleSortStrategy implements SortingStrategy {

	@Override
	public void sort(List<Integer> array) {
		System.out.println("Array Sorted using Bubble Sort");
	}

}

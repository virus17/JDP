package com.virus17.designpatthern.strategy;

import java.util.ArrayList;
import java.util.List;

/**
 * This App uses the Sorter and pass the implementation of the sorting to be used.
 * If Quicksort is passed, the sorting will be done using quick sort technique and so
 * 
 *  Its very easy to add more sorting algorithm in future since the design follow
 *  Open Closed Principle (Open for extension and Closed for modification)
 *  
 *  In future, if we want to add HeapSort, none of the existing classes needs to be 
 *  modified(close for modification), we can create a new class which implement SortingStrategy
 *  and we are done adding a new Algorithm (Open for Extension)
 *  s 
 * @author virus17
 */
public class ClientApp {
	static Sorter sorter;
	public static void main(String args[]) {
		List<Integer> sampleArray = new ArrayList<Integer>();
		
		sorter = new Sorter(new BubbleSortStrategy());
		sorter.arrangeNum(sampleArray);
		
		sorter = new Sorter(new InsertionSortStrategy());
		sorter.arrangeNum(sampleArray);
		
		sorter = new Sorter(new QuickSortStrategy());
		sorter.arrangeNum(sampleArray);
		
	}
}

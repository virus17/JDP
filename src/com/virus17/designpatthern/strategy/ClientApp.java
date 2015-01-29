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
 *  
 *  JDK has couple of examples of this pattern, first is Collection.sort(List, Comparator) 
 *  method, where Comparator is Strategy and Collections.sort() is Sorter(in our example). 
 *  Because of this pattern your sort method can sort any object, the object which doesn't exists 
 *  when this method was written. As long as, Object will implement Comparator interface 
 *  (Strategy interface), Collections.sort() method will sort it. 
 *  
 *  Another example is  java.util.Arrays#sort(T[], Comparator < ? super T > c) method 
 *  which similar to Collections.sort() method, except need array in place of List.
 *  
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

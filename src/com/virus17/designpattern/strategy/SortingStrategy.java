package com.virus17.designpattern.strategy;

import java.util.List;

/**
 * The base class interface which will be implemented by all
 * the Sorting Algorithms so that they can be used as a sorting technique by the 
 * application.
 * 
 * 
 * @author virus17
 */
public interface SortingStrategy {
	public void sort(List<Integer> array);
}

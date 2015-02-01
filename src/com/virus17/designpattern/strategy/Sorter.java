package com.virus17.designpattern.strategy;

import java.util.List;

/**
 * This class just have a object of base class Strategy.
 * This perfectly defines the Dynamic Polymorphism ie, using 
 * the base class object to call the derived class methods.
 * 
 * This class dont have to worry about anything. Whatever implmentation class 
 * has been passed to this from the Client it wil just call the sort method of it.
 * 
 * No Modification needed in this class if a new sorting algo is added in future
 * 
 * @author virus17
 */
public class Sorter {
	final SortingStrategy strategy;
	
	Sorter(SortingStrategy strategy) {
		this.strategy =  strategy;
	}
	
	public void arrangeNum(List<Integer> array) {
		strategy.sort(array);
	}
}

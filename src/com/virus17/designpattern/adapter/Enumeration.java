package com.virus17.designpattern.adapter;

/**
 * In Old Java World, Collections types (Vector, Stack, Hashtabe etc)
 * implement a method elements() which returns a Enumeration. 
 * 
 * The Enumeration interface allows you to go through the elements of 
 * a collection without knowing how actually it is implemented.
 * 
 *  It supports two API
 *  1) hasMoreElements()
 *  2) nextElement()
 *  
 * @author Virus17
 */
public interface Enumeration {
	public boolean hasMoreElements();
	public Object nextElement();
}

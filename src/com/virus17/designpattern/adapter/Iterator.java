package com.virus17.designpattern.adapter;

/**
 * Iterators are new java world objects. When SUN released new Collection 
 * classes, they start using Iterator interface(like Enumeration) which 
 * allows you to iterate through a set of items in a collection, but also
 * adds the ability to remove items
 * 
 * API supported 
 * 1) hasNext()
 * 2) next()
 * 3) remove()
 * 
 * @author Virus17
 */
public interface Iterator {
	public boolean hasNext();
	public Object next();
	public void remove();
}

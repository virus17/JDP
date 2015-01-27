package com.virus17.designpattern.adapter;

/**
 * This is implementation of Iterator.
 * 
 * Interators are new java world objects. When SUN released new Collection 
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
public class IteratorImpl implements Iterator {

	@Override
	public boolean hasNext() {
		System.out.println("Iterator->hasNext()");
		return true;
	}

	@Override
	public Object next() {
		System.out.println("Iterator->next()");
		return new Object();
	}

	@Override
	public void remove() {
		System.out.println("Iterator->remove()");
	}}

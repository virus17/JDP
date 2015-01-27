package com.virus17.designpattern.adapter;

/**
 * Enumeration are used earlier and Iterators are used in todays world.
 * 
 * There are many legacy codes currently which still use the the Enumeration. 
 * But since we are using Iterators now-a-days, we should provide a Adapter
 * which can map Iterator to Enumeration. 
 * 
 * This adapter will look like Iterator but will do job of Enumeration.
 * 
 * Enumeration ---> Adaptee
 * Iterator    ---> Target
 *  
 * @author Virus17
 *
 */
public class EnumeratoinToIteratorAdapter implements Iterator {

	private Enumeration enumeration;
	
	EnumeratoinToIteratorAdapter(Enumeration enumeration) {
		this.enumeration = enumeration;
	}
	
	@Override
	public boolean hasNext() {
		return enumeration.hasMoreElements();
	}

	@Override
	public Object next() {
		return enumeration.nextElement();
	}

	/**
	 * Since Enumeration doesnot have remove option, we have to 
	 * return the exception because there is no hook on enumeration 
	 * where we can plug this method.
	 * 
	 */
	@Override
	public void remove() {
		throw new UnsupportedOperationException("Remove Operation is not Supported in Enumeration");
	}

}

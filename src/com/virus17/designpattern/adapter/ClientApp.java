package com.virus17.designpattern.adapter;

import com.virus17.designpattern.adapter.Enumeration;
import com.virus17.designpattern.adapter.EnumerationImpl;
import com.virus17.designpattern.adapter.EnumeratoinToIteratorAdapter;
import com.virus17.designpattern.adapter.Iterator;
import com.virus17.designpattern.adapter.IteratorImpl;

/**
 * Client has created 2 datas. 1 iterator, 1 enumeration which acts like iterator
 * 
 * @author Virus17
 */
public class ClientApp {
	
	public static void main (String args[]) {
		Iterator iterator = new IteratorImpl();
		iterator.next();
		iterator.hasNext();
		iterator.remove();
		
		Enumeration enumeration = new EnumerationImpl();
		enumeration.hasMoreElements();
		enumeration.nextElement();
		
		System.out.println();
		System.out.println();
		System.out.println("Adapter that adapts Enumeration to look like Iterator");
		System.out.println();
		/*
		 * This looks like iterator but is actually Enumeration by internal functionality 
		 */
		Iterator adapterIterator = new EnumeratoinToIteratorAdapter(enumeration);
		adapterIterator.next();
		adapterIterator.hasNext();
		// This function will throw exception since we dont have any remove functionality in Enumeration
		// to remove elements.
		try {
			adapterIterator.remove();
		} catch (UnsupportedOperationException e) {
			System.out.println(e.getMessage());
		}
		
	}
	
}

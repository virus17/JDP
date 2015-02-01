package com.virus17.designpattern.observer;

/**
 * Whoever wants to be behave as subject on which others can observe can 
 * implement this interface
 * 
 * @author virus17
 */
public interface Subject {
	public void registerObserver(final Observer observer);
	public void removeObserver(final Observer observer);
	public void notifyObservers();
}

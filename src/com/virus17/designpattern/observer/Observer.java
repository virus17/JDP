package com.virus17.designpattern.observer;

/**
 * Who ever wants to observe anyone of type Subject can implement this interface
 * so that they can get notified/updated when availability changes
 * 
 * Currently this class is not generic. It takes ony availability as the variable
 * that can change and needs to be notified.
 * 
 * @author virus17
 */
public interface Observer {
	public void update(final String availability);
}

package com.virus17.designpattern.observer;

import java.util.ArrayList;
import java.util.List;

public class Product implements Subject {

	//Variable to keep Observers list
	List<Observer> observersList = new ArrayList<Observer>();
	
	//Product Specific Variables
	String productName;
	String availability;
	
	public Product(final String productName, final String availability) {
		this.productName = productName;
		this.availability = availability;
	}
	
	public String getProductName() {
		return productName;
	}

	public void setProductName(final String productName) {
		this.productName = productName;
	}

	public String getAvailability() {
		return availability;
	}

	/**
	 * Whenever availability will change, notify the observers
	 * @param availability
	 */
	public void setAvailability(final String availability) {
		this.availability = availability;
		notifyObservers();
	}

	@Override
	public void registerObserver(final Observer observer) {
		observersList.add(observer);
	}

	@Override
	public void removeObserver(final Observer observer) {
		observersList.remove(observer);
	}

	@Override
	public void notifyObservers() {
		for(Observer ob : observersList) {
			ob.update(availability);
		}
	}
	
}

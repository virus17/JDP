package com.virus17.designpattern.observer;

/**
 * A person who wants to observe the product availability
 *  
 * @author virus17
 */
public class PersonObserver implements Observer{

	String personName;
	String emailAddress;
	
	public PersonObserver(final String personName, final String emailAddress) {
		this.personName = personName;
		this.emailAddress = emailAddress;
	}
	
	@Override
	public void update(String availability) {
		System.out.println("Hey " + personName + " product is available now");
	}
	
	
	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
}

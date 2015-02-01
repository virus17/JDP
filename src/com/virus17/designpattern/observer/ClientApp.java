package com.virus17.designpattern.observer;
/**
 * Taking a example of Amazon Subscribe to get update feature.
 * Let's say a product is unavailable in amazon to buy, and you
 * want to subscribe so that whenever the product becomes
 * available you get a mail and you can buy.
 * 
 * In here, Product is the subject that needs to be obeserved by the Observer
 * @author virus17
 */
public class ClientApp {
	public static void main(String args[]) {
			
		//Create a new product
		Product samsungNote4 = new Product("Samsung Galaxy Note 4", "OutOfStock");
		
		//Create Persons
		PersonObserver rahul = new PersonObserver("Rahul", "rahul@jdp.com");
		PersonObserver amit = new PersonObserver("Amit", "amit@jdp.com");
		
		samsungNote4.registerObserver(rahul);
		samsungNote4.registerObserver(amit);
		
		samsungNote4.setAvailability("InStock");
		//All the observer will get notified since we changed the availability
	}
}

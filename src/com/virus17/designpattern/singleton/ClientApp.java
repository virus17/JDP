package com.virus17.designpattern.singleton;

/**
 * Singleton classes are needed when we dont want to have two seperate instance
 * of a same class.
 * 
 * To make sure we dont have 2 instance of the same class, its the class responsibility
 * to give the instance back to the clients. Keep the constructor as private so that only
 * the class can instantiate itself and not the clients.
 * 
 * There are two kind of singleton
 * 1) Early Initialization in which class initializes itself and keep it in a variable as
 *	  soon as class gets loaded
 * 2) Lazy Initialization in which class will initialize itself only if some client ask for 
 *    the instance. And from then it will give the same instance to all other clients.
 *    This way we dont have to keep the instance in memory untill its actually required
 *    
 * Real Java Example : java.lang.Runtime#getRuntime()  java.awt.Desktop#getDesktop()
 * @author virus17
 */
public class ClientApp {

	public static void main(String[] args) {
		EarlyInitializedSingleton earlySingletonObject1 = EarlyInitializedSingleton.getInstance();
		EarlyInitializedSingleton earlySingletonObject2 = EarlyInitializedSingleton.getInstance();
		
		if (earlySingletonObject1 == earlySingletonObject2) {
			System.out.println("Both early singleton objects are same as expected");
		} else {
			System.out.println("Both early singleton objects are not equal. Something weird happenned. Its gonna BLOW");
		}
		
		
		LazyInitializedSingletonClass lazySingletonObject1 = LazyInitializedSingletonClass.getInstance();
		LazyInitializedSingletonClass lazySingletonObject2 = LazyInitializedSingletonClass.getInstance();
		
		if (lazySingletonObject1 == lazySingletonObject2) {
			System.out.println("Both lazy singleton objects are same as expected");
		} else {
			System.out.println("Both lazy singleton objects are not equal. Something weird happenned. Its gonna BLOW");
		}
		
		//Enum Singleton. Enum by default make sure of the synchronization etc, so we dont have to worry about locking and all.
		EnumSingletonClass enumSingletonObject1 = EnumSingletonClass.INSTANCE;
		EnumSingletonClass enumSingletonObject2 = EnumSingletonClass.INSTANCE;

		if (enumSingletonObject1 == enumSingletonObject2) {
			System.out.println("Both enum singleton objects are same as expected");
		} else {
			System.out.println("Both enum singleton objects are not equal. Something weird happenned. Its gonna BLOW");
		}
	}

}

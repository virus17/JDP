package com.virus17.designpattern.singleton;

/**
 * This is call Early Initialized singleton
 * @author virus17
 */
public class EarlyInitializedSingleton {
	//Its static final, because this variable shouldnot change and be there in memory always
	private static final EarlyInitializedSingleton INSTANCE = new EarlyInitializedSingleton();
	
	
	/**
	 * private constructor to make sure no one else but this class only can
	 * intantiate it. 
	 */
	private EarlyInitializedSingleton() {}
	
	/**
	 * Provide a public method through which clients can get the instance of the
	 * class. This needs to be static so that it can be called as 
	 * EarlyInitializedSingleton.getInstance() because we cant do
	 * new EarlyInitializedSingleton()
	 * 
	 * This method is not needed for Early Initialized singleton classes, since
	 * they can directly access the INSTANCE object.  
	 * 
	 * @return
	 */
	public static EarlyInitializedSingleton getInstance() {
		return INSTANCE;
	}
	
}

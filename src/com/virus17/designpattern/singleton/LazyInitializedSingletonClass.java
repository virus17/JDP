package com.virus17.designpattern.singleton;

/**
 * This is call Lazy Initialized singleton class. We will not initialize the
 * class untill its called for the first time.
 * 
 * When CPU executes a code, it sometime pulls the data from RAM to CPU cache for faster access.
 * In case of more than 1 CPU, there will exist more than one CPU cache. And if we are 
 * running some code in multi CPU, then both CPU will have different copy of same variable and
 * the variable will be out of sync. If we add "volatile" keyword before a variable, JVM make sure
 * that the variable is accessed (read/write) from main memory itself to ensure synchronizatoin.
 *  
 * @author virus17
 */
public class LazyInitializedSingletonClass {
	
	//Volatile is added for variable being in sync in all threads
	private static volatile LazyInitializedSingletonClass INSTANCE;
	
	/**
	 * private constructor to make sure no one else but this class only can
	 * intantiate it. 
	 */
	private LazyInitializedSingletonClass() {}
	
	/**
	 * This function is very important here since this is responsible for creating 
	 * the instance for the first time and returning the object to the clients.
	 * This function needs to be synchronized to ensure thread safety
	 * 
	 * We are using Double Check Locking here
	 *  
	 * @return
	 */
	public static LazyInitializedSingletonClass getInstance() {
		//See if this INSTANCE is not already present
		if (INSTANCE == null) {
			//Only one thread at a time can enter this block.
			synchronized (LazyInitializedSingletonClass.class) {
				/*
				 * If some other thread previous to this one has already entered this block and 
				 * have instantiated the INSTANCE then we dont need to instantiate again.
				 * Check for that
				 */
				if (INSTANCE == null) {
					INSTANCE = new LazyInitializedSingletonClass();
				}
			}
		}
		return INSTANCE;
	}
	
}

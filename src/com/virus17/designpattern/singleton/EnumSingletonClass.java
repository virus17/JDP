package com.virus17.designpattern.singleton;

/**
 * Enum doesnot allow initializatoin by constructors so no need to make constructor private
 * explicitly.
 * Enums take care of creating INSTANCE so no need to implement synchronized code and locking
 * Perfect for defining Singleton class without worrying about anything else.
 *   
 * @author virus17
 */
public enum EnumSingletonClass {
	INSTANCE;
	// Other methods
}
